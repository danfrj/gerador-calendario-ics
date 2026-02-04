package com.exemplo.geradorcalendarics.dto;

import lombok.Data;

@Data
public class CalendarioRequest {
    private String titulo;
    private String descricao;
    private String dataInicio; // Formato esperado: 20231025T100000
    private String dataFim;    // Formato esperado: 20231025T120000
    private String local;
}