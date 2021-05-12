package com.asusoftware.befriends.model.dto.user;

import com.asusoftware.befriends.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class UserDto {

    @Id @NotNull private UUID id;
    @NotBlank
    private String firstName;
    @NotBlank private String lastName;
    @NotNull
    @Email
    private String email;
    @NotNull @JsonFormat(pattern="yyyy-MM-dd")
    Date birthday;


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

    public static UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setBirthday(user.getBirthday());
        return userDto;
    }
}
