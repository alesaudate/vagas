package br.com.vagas.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
public class Person extends DomainEntity{

    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    
    @JsonProperty("nome")
    @NotNull
    String name;
    
    @JsonProperty("profissao")
    @NotNull
    String profession;
    
    @JsonProperty("localizacao")
    @NotNull
    String location;
    
    @JsonProperty("nivel")
    @Min(1)
    @Max(5)
    int level;

}
