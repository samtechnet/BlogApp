package com.BlogApp.BlogApp.Controller;

import com.BlogApp.BlogApp.Model.Post;
import com.BlogApp.BlogApp.Repository.PostRepository;
import com.BlogApp.BlogApp.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class PostController {
    @Autowired
    private  PostRepository postRepository;

    @GetMapping("getAllPost")
    public List<Post> getAllPost()throws ExecutionException{
        return postRepository.findAll();
    }

    @GetMapping("getOnePost/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable int id){
        Post post= postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post with id" + id +"not found"));
        return ResponseEntity.ok(post);
    }
    @PostMapping("/createPost")
    public Post createPost(@RequestBody Post post)throws ResourceNotFoundException {
        return postRepository.save(post);
    }
    @PutMapping("/updatePost/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable int id,@RequestBody Post post){
        Post updatePost= postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post not exit with id:" + id));
        updatePost.setTitle(post.getTitle());
        updatePost.setBody(post.getBody());
        postRepository.save(updatePost);
        return ResponseEntity.ok(updatePost);
    }
    @DeleteMapping("/deletePost/{id}")
    public ResponseEntity<Post> deletePost(@PathVariable int id){
        Post post= postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post not exit with id:" + id));
        postRepository.delete(post);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
