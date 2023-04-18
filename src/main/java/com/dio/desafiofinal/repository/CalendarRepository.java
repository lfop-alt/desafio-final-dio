package com.dio.desafiofinal.repository;

import com.dio.desafiofinal.model.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {
}
