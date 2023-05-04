package org.sbdc.licensealarm.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class BoardList {
    private Integer no;
    private String emp;
    private String sw;
    private LocalDate startDate;
    private LocalDate endDate;
    private String renewal;
    private Integer quantity;


}
