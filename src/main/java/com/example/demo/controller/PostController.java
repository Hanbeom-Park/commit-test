package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    // Display all posts
    @GetMapping
    public String getAllPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "post/list";
    }

    // Display post creation form
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("post", new Post());
        return "post/create";
    }

    // Handle post creation
    @PostMapping
    public String createPost(@Valid @ModelAttribute("post") Post post, 
                             BindingResult result, 
                             RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "post/create";
        }
        
        postService.savePost(post);
        redirectAttributes.addFlashAttribute("successMessage", "Post created successfully!");
        return "redirect:/posts";
    }

    // Display a single post
    @GetMapping("/{id}")
    public String getPost(@PathVariable Long id, Model model) {
        Post post = postService.getPostById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid post Id:" + id));
        model.addAttribute("post", post);
        return "post/view";
    }

    // Display post edit form
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Post post = postService.getPostById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid post Id:" + id));
        model.addAttribute("post", post);
        return "post/edit";
    }

    // Handle post update
    @PostMapping("/{id}")
    public String updatePost(@PathVariable Long id, 
                             @Valid @ModelAttribute("post") Post post, 
                             BindingResult result, 
                             RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "post/edit";
        }
        
        post.setId(id);
        postService.updatePost(post);
        redirectAttributes.addFlashAttribute("successMessage", "Post updated successfully!");
        return "redirect:/posts";
    }

    // Handle post deletion
    @GetMapping("/{id}/delete")
    public String deletePost(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        postService.deletePost(id);
        redirectAttributes.addFlashAttribute("successMessage", "Post deleted successfully!");
        return "redirect:/posts";
    }

    // Search posts
    @GetMapping("/search")
    public String searchPosts(@RequestParam(required = false) String title,
                              @RequestParam(required = false) String author,
                              Model model) {
        if (title != null && !title.isEmpty()) {
            model.addAttribute("posts", postService.searchByTitle(title));
        } else if (author != null && !author.isEmpty()) {
            model.addAttribute("posts", postService.searchByAuthor(author));
        } else {
            model.addAttribute("posts", postService.getAllPosts());
        }
        
        return "post/list";
    }
}