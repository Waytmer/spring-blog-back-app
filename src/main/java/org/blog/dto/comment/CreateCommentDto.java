package org.blog.dto.comment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCommentDto {
    private Long postId;
    private String text;
}
