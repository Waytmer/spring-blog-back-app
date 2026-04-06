package org.blog.dto.post;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class UpdatePostDto {
    private Long id;
    private String title;
    private String text;
    private Set<String> tags;
}
