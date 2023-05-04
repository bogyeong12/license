package org.sbdc.licensealarm.entity;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Board {

    private Integer no;
    private String emp;
    private String sw;
    private String cellPhone;
    private LocalDate startDate;
    private LocalDate endDate;
    private String renewal;
    private String note;
    private Integer quantity;
    private LocalDate created;
    private LocalDate updated;



}
