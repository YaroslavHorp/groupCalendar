package com.example.groupCalendar.dto;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class EventDto {

    private Long id;
    private String title;
    private String start;
    private String end;


}
