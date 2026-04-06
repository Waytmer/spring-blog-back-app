package org.blog.controller;

import lombok.RequiredArgsConstructor;
import org.blog.dto.comment.CommentResponseDto;
import org.blog.dto.comment.CreateCommentDto;
import org.blog.dto.comment.UpdateCommentDto;
import org.blog.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/posts/{postId}/comments")
public class PostCommentController {

    private final CommentService commentService;

    @GetMapping
    public List<CommentResponseDto> getComments(@PathVariable Long postId) {
        return commentService.getComments(postId);
    }

    @GetMapping("/{id}")
    public CommentResponseDto getComment(@PathVariable Long postId,
                                         @PathVariable Long id) {
        return commentService.getComment(id, postId);
    }

    @PostMapping
    public CommentResponseDto createComment(@PathVariable Long postId,
                                            @RequestBody CreateCommentDto commentDto) {
        return commentService.createComment(postId, commentDto);
    }

    @PutMapping("/{id}")
    public CommentResponseDto updateComment(@PathVariable Long postId,
                                            @PathVariable Long id,
                                            @RequestBody UpdateCommentDto commentDto) {
        return commentService.updateComment(postId, id, commentDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long postId,
                                              @PathVariable Long id) {
        commentService.deleteComment(postId, id);
        return ResponseEntity.ok().build();
    }
}