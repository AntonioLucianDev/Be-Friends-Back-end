package com.asusoftware.befriends.model.dto.user;

import com.asusoftware.befriends.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
public class CreateUserDto {

    @NotBlank private String firstName;
    @NotBlank private String lastName;
    @NotNull @Email private String email;
    @NotNull @JsonFormat(pattern="yyyy-MM-dd") Date birthday;
    @NotBlank private String password;

    public static User toEntity(CreateUserDto createUserDto) {
        User user = new User();
        user.setFirstName(createUserDto.getFirstName());
        user.setLastName(createUserDto.getLastName());
        user.setEmail(createUserDto.getEmail());
        user.setBirthday(createUserDto.getBirthday());
        user.setPassword(createUserDto.getPassword());
        user.setActive(false);
        return user;
    }
}
