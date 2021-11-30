package com.gerenciamenteloja.poogerenciamentoloja.mapper;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @Column(name = "quantidade")
    private Integer quantidade;

    @NotNull
    @Column(name = "sku")
    private String sku;

    @Nullable
    @Column(name = "descricao")
    private String descricao;
}