package org.mapstruct.example.dto;

import java.util.Date;
import java.util.List;

public class PolicyDto extends HistoricalData{
    public Date effectiveDate;
    public Date expirationDate;
    public Customer customer;
}
