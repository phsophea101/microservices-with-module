package com.sample.user.service.impl;

import com.sample.model.user.dto.UserCreateDto;
import com.sample.model.user.dto.UserDto;
import com.sample.model.user.mapper.UserMapper;
import com.sample.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDto createUser(UserCreateDto dto) {
        dto.setId(UUID.randomUUID().toString());
        UserDto userDto = UserMapper.INSTANCE.dtoToDtoCreation(dto);
        return userDto;
    }

    @Override
    public UserDto getUser(String id) {
        UserDto dto = new UserDto();
        dto.setId(id);
        return dto;
    }
}
