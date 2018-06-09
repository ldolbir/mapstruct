package org.mapstruct.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.example.dto.Policy;
import org.mapstruct.example.dto.PolicyDto;

@Mapper(config = CentralConfig.class)
public interface PolicyMapper {
    Policy policyDtoToPolicy(PolicyDto source);
}
