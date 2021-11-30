package com.gerenciamenteloja.poogerenciamentoloja.mapper;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "cliente")
@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente")
    private Long id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @Nullable
    @Column(name = "dt_nascimento")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dt_nascimento;

    @NotNull
    @Column(name = "cpf")
    private String cpf;

    @Nullable
    @Column(name = "email")
    private String email;

    @Nullable
    @Column(name = "endereco")
    private String endereco;

    @Nullable
    @Column(name = "telefone")
    private String telefone;
}