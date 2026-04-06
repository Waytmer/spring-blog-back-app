package org.blog.service;

import org.blog.dto.post.CreatePostDto;
import org.blog.dto.post.ListPostResponseDto;
import org.blog.dto.post.PostResponseDto;
import org.blog.dto.post.UpdatePostDto;

public interface PostService {
    PostResponseDto getPost(Long id);

    ListPostResponseDto getPosts(String search, Integer pageNumber, Integer pageSize);

    PostResponseDto createPost(CreatePostDto postDto);

    PostResponseDto updatePost(Long id, UpdatePostDto postDto);

    void deletePost(Long id);

    Integer addLikeToPost(Long id);

}
