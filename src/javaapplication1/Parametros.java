/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

public class Parametros {
    int tam = 20;
    ArrayList<Integer[][]> listaMapas = new ArrayList<>();
    Carro carro = new Carro();
    Integer mapa[][];


    public void criarMapa() {
        mapa = new Integer[tam][tam];
        carro.setTam(tam);
        carro.setPosX(5);
        carro.setPosY(5);

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                mapa[i][j] = 0;
            }
        }
        carro.setMapa(mapa);
    }
    
    public void inserirMapa(){
        listaMapas.add(mapa);
        //carro.setMapa(mapa);
    }

    public ArrayList<Integer[][]> getListaMapas() {
        return listaMapas;
    }

    public void setListaMapas(ArrayList<Integer[][]> listaMapas) {
        this.listaMapas = listaMapas;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Integer[][] getMapa() {
        return mapa;
    }

    public void setMapa(Integer[][] mapa) {
        this.mapa = mapa;
    }
    

}
