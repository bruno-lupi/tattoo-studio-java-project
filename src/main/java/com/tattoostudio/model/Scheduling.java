package com.tattoostudio.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class Scheduling {
    private Long id;
    private Client client;
    private Tattooist tattooist;
    private LocalDateTime dateTime;
    private int durationMinutes; // Duração em minutos
}
