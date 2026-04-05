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
    
    private String fotoUrl; 
    
    // Nova coluna que você criou no banco
    private String categoria; 
    
    @Enumerated(EnumType.STRING)
    private StatusJoia status;
}