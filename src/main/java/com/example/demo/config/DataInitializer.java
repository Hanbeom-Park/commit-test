package com.example.demo.config;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataInitializer implements CommandLineRunner {

    private final PostRepository postRepository;

    @Autowired
    public DataInitializer(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void run(String... args) {
        // Check if we already have posts
        if (postRepository.count() == 0) {
            // Create sample posts
            createSamplePosts();
        }
    }

    private void createSamplePosts() {
        // Sample post 1
        Post post1 = new Post();
        post1.setTitle("Welcome to the Bulletin Board");
        post1.setAuthor("Admin");
        post1.setContent("This is the first post on our new bulletin board system. Feel free to explore and add your own posts!");
        post1.setCreatedAt(new Date());
        post1.setUpdatedAt(new Date());
        postRepository.save(post1);

        // Sample post 2
        Post post2 = new Post();
        post2.setTitle("How to Use This Board");
        post2.setAuthor("Admin");
        post2.setContent("Here are some tips for using the bulletin board:\n\n" +
                "1. Click on 'New Post' to create a new post\n" +
                "2. Use the search box to find posts by title\n" +
                "3. Click on a post title to view the full post\n" +
                "4. Use the Edit and Delete buttons to manage your posts");
        post2.setCreatedAt(new Date());
        post2.setUpdatedAt(new Date());
        postRepository.save(post2);

        // Sample post 3
        Post post3 = new Post();
        post3.setTitle("Sample Discussion Topic");
        post3.setAuthor("User");
        post3.setContent("This is a sample discussion topic. You can use this format to start discussions on various topics.\n\n" +
                "What do you think about this bulletin board system? Let us know in your own posts!");
        post3.setCreatedAt(new Date());
        post3.setUpdatedAt(new Date());
        postRepository.save(post3);
    }
}