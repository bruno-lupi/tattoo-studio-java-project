package com.tattoostudio.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class Client {
    private Long id;
    private String name;
    private LocalDate birthday;
    private String telephone;
    private String socialMedia;
    private String tattooDescription;
    private String tattooStyle;
}
