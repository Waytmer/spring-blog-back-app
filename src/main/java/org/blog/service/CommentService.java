package org.blog.service;

import org.blog.dto.comment.CommentResponseDto;
import org.blog.dto.comment.CreateCommentDto;
import org.blog.dto.comment.UpdateCommentDto;

import java.util.List;

public interface CommentService {
    CommentResponseDto getComment(Long id, Long postId);

    List<CommentResponseDto> getComments(Long postId);

    CommentResponseDto createComment(Long postId, CreateCommentDto commentDto);

    CommentResponseDto updateComment(Long postId, Long id, UpdateCommentDto commentDto);

    void deleteComment(Long id, Long postId);
}
