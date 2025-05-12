/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.lpoocardgame.lpoo.cardgame.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuário
 */
@Entity
@Table(name = "tbl_carta")
public class Carta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int id;

    @Column(name = "car_nome", nullable = false)
    private String nome;

    @Column(name = "car_ataque", nullable = false)
    private int ataque;

    @Column(name = "car_defesa", nullable = false)
    private int defesa;

    @Enumerated(EnumType.STRING)
    @Column(name = "car_categoria", nullable = true)
    private Categoria categoria;

    @Column(name = "car_raridade", nullable = true)
    private int raridade;

    public Carta() {
    }

    public Carta(String nome, int ataque, int defesa, Categoria categoria, int raridade) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.categoria = categoria;
        this.raridade = raridade;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the defesa
     */
    public int getDefesa() {
        return defesa;
    }

    /**
     * @param defesa the defesa to set
     */
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the raridade
     */
    public int getRaridade() {
        return raridade;
    }

    /**
     * @param raridade the raridade to set
     */
    public void setRaridade(int raridade) {
        this.raridade = raridade;
    }

}
