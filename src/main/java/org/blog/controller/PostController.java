package org.blog.controller;

import lombok.RequiredArgsConstructor;
import org.blog.dto.post.CreatePostDto;
import org.blog.dto.post.ListPostResponseDto;
import org.blog.dto.post.PostResponseDto;
import org.blog.dto.post.UpdatePostDto;
import org.blog.service.PostImageService;
import org.blog.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;
    private final PostImageService postImageService;

    @GetMapping
    public ListPostResponseDto getPosts(@RequestParam String search,
                                        @RequestParam Integer pageNumber,
                                        @RequestParam Integer pageSize) {
        return postService.getPosts(search, pageNumber, pageSize);
    }

    @GetMapping("{id}")
    public PostResponseDto getPost(@PathVariable Long id) {
        return postService.getPost(id);
    }

    @PostMapping
    public PostResponseDto createPost(@RequestBody CreatePostDto postDto) {
        return postService.createPost(postDto);
    }

    @PutMapping("{id}")
    public PostResponseDto updatePost(@PathVariable Long id, @RequestBody UpdatePostDto postDto) {
        return postService.updatePost(id, postDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("{postId}/likes")
    public Integer likePost(@PathVariable Long postId) {
        return postService.addLikeToPost(postId);
    }

    @PutMapping("{postId}/image")
    public ResponseEntity<?> updatePostImage(@PathVariable Long postId,
                                             @RequestBody MultipartFile file) {
        postImageService.updatePostImage(postId, file);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{postId}/image")
    public byte[] getPostImage(@PathVariable Long postId) {
        return postImageService.getPostImage(postId);
    }
}
