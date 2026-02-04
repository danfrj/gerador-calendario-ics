package com.exemplo.geradorcalendarics.controller;

import com.exemplo.geradorcalendarics.dto.CalendarioRequest;
import com.exemplo.geradorcalendarics.service.CalendarioService;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calendario")
public class CalendarioController {

    private final CalendarioService service;

    public CalendarioController(CalendarioService service) {
        this.service = service;
    }

    @PostMapping("/gerar")
    public ResponseEntity<byte[]> baixarCalendario(@RequestBody CalendarioRequest request) {
        String conteudo = service.gerarConteudoIcs(request);
        byte[] dados = conteudo.getBytes();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("text/calendar"));
        headers.setContentDisposition(ContentDisposition.attachment().filename("evento.ics").build());

        return ResponseEntity.ok()
                .headers(headers)
                .body(dados);
    }
}