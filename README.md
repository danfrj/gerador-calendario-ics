#  Gerador de Calendário (.ics)

Esta API foi desenvolvida com **Spring Boot 3** para facilitar a criação e exportação de eventos de calendário. Ela gera arquivos no formato padrão `.ics`, compatíveis com **Google Calendar, Outlook e Apple Calendar**.

##  Objetivo do Projeto
O foco aqui foi aprender a manipular fluxos de dados (streams) para geração de arquivos e entender o padrão **RFC 5545**, que é a norma técnica mundial para intercâmbio de informações de calendário.

##  Tecnologias Utilizadas
* **Java 17**
* **Spring Boot 3.2.0**
* **Spring Web** (Endpoints para download de arquivos)
* **Lombok** (Código limpo e conciso)
* **RFC 5545** (Padrão de formatação do arquivo)

##  Como Funciona?
A API recebe os detalhes do evento (título, data, local e descrição) e constrói a estrutura de texto necessária para que os aplicativos de calendário reconheçam o arquivo.

### Exemplo de Estrutura Gerada:
```text
BEGIN:VCALENDAR
VERSION:2.0
BEGIN:VEVENT
SUMMARY:Reunião de Projeto
DTSTART:20240210T090000Z
LOCATION:Escritório
END:VEVENT
END:VCALENDAR
