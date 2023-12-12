package com.sample.user.service;

import com.sample.model.user.dto.UserCreateDto;
import com.sample.model.user.dto.UserDto;

public interface UserService {
    UserDto createUser(UserCreateDto dto);
    UserDto getUser(String id);
}
