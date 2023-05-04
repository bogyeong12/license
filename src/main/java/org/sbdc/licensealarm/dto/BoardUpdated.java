package org.sbdc.licensealarm.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BoardUpdated {
    private String emp;
    private String sw;
    private String cellPhone;
    private LocalDate startDate;
    private LocalDate endDate;
    private String renewal;
    private String note;
}
