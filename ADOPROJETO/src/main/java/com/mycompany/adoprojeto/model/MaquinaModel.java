/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adoprojeto.model;

/**
 *
 * @author Danilo
 */
public class MaquinaModel {

    private final static String marcaPadrao = "DaniloRibeiro";
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    private String HD;
    private String processador;
    int IdComputador;

    public MaquinaModel() {
    }

    public static String getMarcaPadrao() {
        return marcaPadrao;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getIdComputador() {
        return IdComputador;
    }

    public void setIdComputador(int IdComputador) {
        this.IdComputador = IdComputador;
    }

    public MaquinaModel(String HD, String processador) {
        this.HD = HD;
        this.processador = processador;
    }

    public MaquinaModel(String HD, String processador, int IdComputador) {
        this.HD = HD;
        this.processador = processador;
        this.IdComputador = IdComputador;
    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

}
