package javaapplication1;

import java.awt.Font;
import java.awt.List;
import java.util.ArrayList;

public class JavaApplication1 {

    public static void main(String[] args) throws InterruptedException {

        Parametros parametro = new Parametros();
        parametro.criarMapa();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial(parametro).setVisible(true);

            }
        });

//        do {
// posicao inicial do carro
//            carro.mover();
//            //carro.imprimeMapa(tam);
//            label.setFont(new Font("Courier", Font.PLAIN, 14));
//            label.setText("<html>" + carro.criaMapaLabel(tam) + "</html>");
//            Thread.sleep(400);
//        } while (true);
    }

}
