package org.blog.dto.comment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateCommentDto {
    private Long id;
    private Long postId;
    private String text;
}
