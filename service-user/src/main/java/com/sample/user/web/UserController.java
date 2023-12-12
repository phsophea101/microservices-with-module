package com.sample.user.web;

import com.sample.common.model.ResponseVO;
import com.sample.common.model.ResponseVOBuilder;
import com.sample.model.user.dto.UserCreateDto;
import com.sample.model.user.dto.UserDto;
import com.sample.model.user.mapper.UserMapper;
import com.sample.model.user.vo.request.UserCreateRequestVo;
import com.sample.model.user.vo.response.UserCreateResponseVo;
import com.sample.model.user.vo.response.UserResponseVo;
import com.sample.user.service.UserService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    @SneakyThrows
    public ResponseVO<UserCreateResponseVo> createUser(UserCreateRequestVo vo) {
        UserCreateDto dto = UserMapper.INSTANCE.voToDtoCreation(vo);
        UserDto user = this.service.createUser(dto);
        UserCreateResponseVo responseVo = UserMapper.INSTANCE.dtoToVoCreation(user);
        return new ResponseVOBuilder<UserCreateResponseVo>().addData(responseVo).build();
    }

    @GetMapping("{id}")
    @SneakyThrows
    public ResponseVO<UserResponseVo> getUser(@PathVariable String id) {
        UserDto user = this.service.getUser(id);
        UserResponseVo responseVo = UserMapper.INSTANCE.dtoToVo(user);
        return new ResponseVOBuilder<UserResponseVo>().addData(responseVo).build();
    }
}
