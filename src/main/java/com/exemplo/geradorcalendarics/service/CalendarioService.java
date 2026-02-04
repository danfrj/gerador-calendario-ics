package com.exemplo.geradorcalendarics.service;

import com.exemplo.geradorcalendarics.dto.CalendarioRequest;
import org.springframework.stereotype.Service;

@Service
public class CalendarioService {

    public String gerarConteudoIcs(CalendarioRequest request) {
        return "BEGIN:VCALENDAR\n" +
               "VERSION:2.0\n" +
               "PRODID:-//GeradorCalendarics//BR\n" +
               "BEGIN:VEVENT\n" +
               "SUMMARY:" + request.getTitulo() + "\n" +
               "DESCRIPTION:" + request.getDescricao() + "\n" +
               "DTSTART:" + request.getDataInicio() + "\n" +
               "DTEND:" + request.getDataFim() + "\n" +
               "LOCATION:" + request.getLocal() + "\n" +
               "END:VEVENT\n" +
               "END:VCALENDAR";
    }
}