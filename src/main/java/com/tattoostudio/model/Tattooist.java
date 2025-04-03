package com.tattoostudio.model;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Tattooist {
    private Long id;
    private String name;
    private String specialty;
    private List<String> disponibility; // Podemos melhorar isso depois
}
