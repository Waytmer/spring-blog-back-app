package org.blog.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Getter
@Setter
@EqualsAndHashCode
public class PostTag {
    @Id
    @Column
    private Long id;
    @Column
    private Long postId;
    @Column
    private Long tagId;
}
