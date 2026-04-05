package org.blog.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Getter
@Setter
public class Tag {
    @Id
    @Column
    private Long id;
    @Column
    private String title;
}
