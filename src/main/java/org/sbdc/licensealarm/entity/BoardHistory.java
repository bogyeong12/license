package org.sbdc.licensealarm.entity;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BoardHistory {

    private Integer no;
    private LocalDate sendDate;
    private String recipient;
    private String content;
    private String stateCode;
    private String result;
    private String errorCode;




}
