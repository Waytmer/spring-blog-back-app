package org.blog.dto.post;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListPostResponseDto {
    private List<PostResponseDto> posts;
    private boolean hasPrev;
    private boolean hasNext;
    private Long lastPage;
}
