package com.asusoftware.befriends.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "description")
    private String description;

    @Column(name = "images")
    private List<String> images;

    @NotNull
    @Column(name = "privacy")
    @Enumerated(EnumType.STRING)
    private Privacy privacy;

    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
