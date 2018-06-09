package org.mapstruct.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.example.dto.HistoricalData;
import org.mapstruct.example.dto.HistoricalDataDto;
import org.mapstruct.example.dto.Transaction;
import org.mapstruct.example.dto.TransactionDto;

import java.util.List;

@Mapper
public interface HistoricalDataMapper {
    @Mapping(target = "transactions", ignore = true)
    HistoricalData historicalDataDtoToHistoricalData(HistoricalDataDto source);
}
