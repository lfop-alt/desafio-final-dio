package com.dio.desafiofinal.controller;


import com.dio.desafiofinal.model.Calendar;
import com.dio.desafiofinal.services.CalendarService;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendar")
@AllArgsConstructor
public class CalendarController {
    @Autowired
    private final CalendarService calendarService;

    @GetMapping
    public List<Calendar> getAll() {
        return calendarService.getAll();
    }

    @PostMapping
    public Calendar createCalendar(@RequestBody Calendar form) {
        return calendarService.createCaledar(form);
    }

    @PutMapping("{id}")
    public Calendar atualizarCalendar(@RequestBody Calendar form, @PathVariable Long id) {
        return  null;
    }

    @DeleteMapping("{id}")
    public String deletarCalendar(@PathVariable Long id) {
        return null;
    }

    @GetMapping("{id}")
    public Calendar buscarOneCalendar(@PathVariable Long id) {
        return null;
    }
}
