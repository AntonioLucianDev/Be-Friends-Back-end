package com.asusoftware.befriends.model.dto.post;

import com.asusoftware.befriends.model.Post;
import com.asusoftware.befriends.model.Privacy;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class PostDto {

    @Id @NotNull private UUID id;
    @NotBlank
    private String description;
    @NotNull private List<String> imageList;
    @NotNull private LocalDateTime created_at;
    @NotNull @Enumerated(EnumType.STRING) private Privacy privacy;

    public static Post toEntity(PostDto postDto) {
        Post post = new Post();
        post.setId(postDto.getId());
        post.setDescription(postDto.getDescription());
        post.setPrivacy(postDto.getPrivacy());
        post.setCreatedAt(LocalDateTime.now(ZoneOffset.UTC));
        post.setImages(postDto.getImageList());
        return post;
    }

    public static PostDto toDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setDescription(post.getDescription());
        postDto.setImageList(post.getImages());
        postDto.setCreated_at(post.getCreatedAt());
        postDto.setPrivacy(post.getPrivacy());
        return postDto;
    }
}
