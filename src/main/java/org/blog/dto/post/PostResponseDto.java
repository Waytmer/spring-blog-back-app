package org.blog.dto.post;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class PostResponseDto {
    private Long id;
    private String title;
    private String text;
    private Long likesCount;
    private Long commentsCount;
    private Set<String> tags;
}
