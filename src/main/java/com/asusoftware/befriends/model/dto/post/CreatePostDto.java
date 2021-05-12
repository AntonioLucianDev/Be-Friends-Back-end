package com.asusoftware.befriends.model.dto.post;

import com.asusoftware.befriends.model.Post;
import com.asusoftware.befriends.model.Privacy;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Getter
@Setter
public class CreatePostDto {

    @NotBlank private String description;
    @NotNull private List<String> imageList;
    @NotNull @Enumerated(EnumType.STRING) private Privacy privacy;

    public static Post toEntity(CreatePostDto createPostDto) {
        Post post = new Post();
        post.setDescription(createPostDto.getDescription());
        post.setImages(createPostDto.getImageList());
        post.setPrivacy(createPostDto.getPrivacy());
        post.setCreatedAt(LocalDateTime.now(ZoneOffset.UTC));
        return post;
    }
}
