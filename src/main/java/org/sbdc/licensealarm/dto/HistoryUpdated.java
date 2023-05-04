package org.sbdc.licensealarm.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class HistoryUpdated {
    private LocalDate sendDate;
    private String recipient;
    private  String content;

}
