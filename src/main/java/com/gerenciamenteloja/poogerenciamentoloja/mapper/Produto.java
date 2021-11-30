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
import java.time.LocalDateTime;

@Entity(name = "produto")
@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_produto")
    private Long id;

    @NotNull
    @Column(name = "nome_produto")
    private String nomeProduto;

    @NotNull
    @Column(name = "preco")
    private Double preco;

    @NotNull
    @Column(name = "quantidade_venda")
    private Integer quantidade;

    @NotNull
    @Column(name = "sku")
    private String sku;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "dt_venda")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dt_venda;
}