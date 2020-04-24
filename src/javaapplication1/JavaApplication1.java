package javaapplication1;

import java.awt.Font;

public class JavaApplication1 {

    public static void main(String[] args) throws InterruptedException {
        int tam = 20;
        Carro carro = new Carro();
        carro.setPosX(5);
        carro.setPosY(5);
        Integer mapa[][] = new Integer[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                mapa[i][j] = 0;
            }
        }

//<editor-fold defaultstate="collapsed" desc="cria um caminho no mapa">
        mapa[4][5] = 1;
        mapa[3][5] = 1;
        mapa[2][5] = 1;
        mapa[2][4] = 1;
        mapa[2][3] = 1;
        mapa[2][2] = 1;
        mapa[3][2] = 1;
        mapa[4][2] = 1;
        mapa[5][2] = 1;
        mapa[5][3] = 1;
        mapa[5][4] = 1;
        mapa[6][5] = 1;
        mapa[7][5] = 1;
        mapa[8][5] = 1;
        mapa[9][5] = 1;
        mapa[9][6] = 1;
        mapa[9][7] = 1;
        mapa[8][7] = 1;
        mapa[7][7] = 1;
        mapa[6][7] = 1;
        mapa[5][7] = 1;
        mapa[5][6] = 1;
        mapa[5][5] = 1;
//</editor-fold>

        carro.setMapa(mapa);

//        do {
//            carro.mover();
//            //carro.imprimeMapa(tam);
//            label.setFont(new Font("Courier", Font.PLAIN, 14));
//            label.setText("<html>" + carro.criaMapaLabel(tam) + "</html>");
//            Thread.sleep(400);
//        } while (true);

    }

}