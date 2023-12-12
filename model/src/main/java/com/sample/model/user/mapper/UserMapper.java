package com.sample.model.user.mapper;

import com.sample.model.user.dto.UserCreateDto;
import com.sample.model.user.dto.UserDto;
import com.sample.model.user.vo.request.UserCreateRequestVo;
import com.sample.model.user.vo.response.UserCreateResponseVo;
import com.sample.model.user.vo.response.UserResponseVo;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCreateDto voToDtoCreation(UserCreateRequestVo vo);
    UserDto dtoToDtoCreation(UserCreateDto dto);
    UserResponseVo dtoToVo(UserDto vo);
    UserCreateResponseVo dtoToVoCreation(UserDto vo);
}
