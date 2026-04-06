package org.blog.service;


import org.springframework.web.multipart.MultipartFile;

public interface PostImageService {
    void updatePostImage(Long postId, MultipartFile image);

    byte[] getPostImage(Long postId);
}
