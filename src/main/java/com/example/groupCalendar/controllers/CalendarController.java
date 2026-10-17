package com.example.groupCalendar.controllers;

import com.example.groupCalendar.dto.EventDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CalendarController {

    @GetMapping("calendar")
    public String showCalendar(){
        return "calendar";
    }

    public List<EventDto> getEvents(){
        return Arrays.asList(
                new EventDto(1L, "Spotkanie zespołowe", "2026-10-19T10:00:00", "2026-10-19T11:30:00"),
                new EventDto(2L, "Przegląd kodu", "2026-10-21T14:00:00", "2026-10-21T15:00:00"),
                new EventDto(3L, "Wdrożenie systemu", "2026-10-25T08:00:00", "2026-10-25T16:00:00")
        );
    }
}
