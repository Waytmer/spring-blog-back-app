package org.blog.dto.post;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class CreatePostDto {
    private String title;
    private String text;
    private Set<String> tags;
}
