package com.vinicius.goldcontrol.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_joias")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Joia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    @Column(columnDefinition = "TEXT")
    private String descricao;
    
    private Double peso;
    private Integer pureza;
    private Double precoFixo;
    
    // Este campo permitirá exibir as imagens que você quer no front-end
    private String fotoUrl; 
    
    @Enumerated(EnumType.STRING)
    private StatusJoia status;
}