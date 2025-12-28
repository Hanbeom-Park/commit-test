package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // Get all posts
    public List<Post> getAllPosts() {
        return postRepository.findAllByOrderByCreatedAtDesc();
    }

    // Get post by ID
    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    // Save a new post
    public Post savePost(Post post) {
        post.setCreatedAt(new Date());
        post.setUpdatedAt(new Date());
        return postRepository.save(post);
    }

    // Update an existing post
    public Post updatePost(Post post) {
        post.setUpdatedAt(new Date());
        return postRepository.save(post);
    }

    // Delete a post
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    // Search posts by title
    public List<Post> searchByTitle(String title) {
        return postRepository.findByTitleContainingIgnoreCase(title);
    }

    // Search posts by author
    public List<Post> searchByAuthor(String author) {
        return postRepository.findByAuthorContainingIgnoreCase(author);
    }
}