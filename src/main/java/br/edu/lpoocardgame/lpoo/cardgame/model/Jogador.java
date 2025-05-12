/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.lpoocardgame.lpoo.cardgame.model;

import java.util.List;


/**
 *
 * @author Usuário
 */
public class Jogador {
    private int id;
    private String nickname;
    private int level;
    private List<Carta> baralho;

    public Jogador(int id, String nickname, int level, List<Carta> baralho) {
        this.id = id;
        this.nickname = nickname;
        this.level = level;
        this.baralho = baralho;
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
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the baralho
     */
    public List<Carta> getBaralho() {
        return baralho;
    }

    /**
     * @param baralho the baralho to set
     */
    public void setBaralho(List<Carta> baralho) {
        this.baralho = baralho;
    }
    
    
    
    
}
