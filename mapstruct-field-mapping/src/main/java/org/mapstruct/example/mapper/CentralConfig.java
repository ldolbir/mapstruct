package org.mapstruct.example.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.example.dto.HistoricalData;
import org.mapstruct.example.dto.HistoricalDataDto;

@MapperConfig(
        uses = HistoricalDataMapper.class,
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG
)
public interface CentralConfig {
    @Mapping(target = "transactions", ignore = true)
    HistoricalData historicalDataDtoToHistoricalData(HistoricalDataDto source);
}
