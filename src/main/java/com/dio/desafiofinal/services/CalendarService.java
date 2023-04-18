package com.dio.desafiofinal.services;

import com.dio.desafiofinal.model.Calendar;
import com.dio.desafiofinal.model.form.CalendarForm;
import com.dio.desafiofinal.repository.CalendarRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class CalendarService {
    @Autowired
    private final CalendarRepository calendarRepository;

    public Calendar createCaledar(@Valid Calendar form) {
        Calendar novoCalendar = new Calendar();
        novoCalendar.setDataDoAgendamento(form.getDataDoAgendamento());
        novoCalendar.setClientes(form.getClientes());
        return calendarRepository.save(novoCalendar);
    }

    public List<Calendar> getAll() {
        return calendarRepository.findAll();
    }
}
