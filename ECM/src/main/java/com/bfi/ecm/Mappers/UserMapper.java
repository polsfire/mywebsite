package com.bfi.ecm.Mappers;

import com.bfi.ecm.DTO.SignupDto;
import com.bfi.ecm.DTO.UserDto;
import com.bfi.ecm.Entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel= "spring")
public interface UserMapper {
    UserDto toUserDto(User user);
    @Mapping(target = "password",ignore=true)
    User  signupToUser (SignupDto sigundto);
}
