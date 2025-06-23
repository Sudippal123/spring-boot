package com.example.RetrofitSpring;

import com.example.RetrofitSpring.model.Post;
import com.example.RetrofitSpring.service.RetrofitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class commandLineRunner implements CommandLineRunner {
    private final RetrofitService retrofitService;
    public commandLineRunner(RetrofitService retrofitService){
        this.retrofitService = retrofitService;
    }
    @Override
    public void run(String... args)  {
        List<Post> posts = retrofitService.fetchPosts();
        posts.forEach(post -> System.out.println(post.getTitle()));
    }
}
