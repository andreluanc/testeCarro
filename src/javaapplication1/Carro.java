package javaapplication1;

public class Carro {

    private String direcao = "N";
    private int posX;
    private int posY;
    private Integer mapa[][];

    public boolean lerSensorF() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":
                i--;
                break;
            case "S":
                i++;
                break;
            case "L":
                j++;
                break;
            case "O":
                j--;
                break;
        }
        return this.mapa[i][j] == 1;

    }

    public boolean lerSensorD() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":
                j++;
                break;
            case "S":
                j--;
                break;
            case "L":
                i++;
                break;
            case "O":
                i--;
                break;
        }
        return this.mapa[i][j] == 1;
    }

    public boolean lerSensorE() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":
                j--;
                break;
            case "S":
                j++;
                break;
            case "L":
                i--;
                break;
            case "O":
                i++;
                break;
        }
        return this.mapa[i][j] == 1;
    }

    public void mover() {
        if (this.lerSensorF()) {//frente
            this.moverParaFrente();
        } else if (this.lerSensorD()) {//le sensor da direita
            this.moverParaDireita();
        } else if (this.lerSensorE()) {
            this.moverParaEsquerda();
        }
    }

    public void moverParaFrente() {
        switch (this.direcao) {
            case "N":
                this.posY--;
                break;
            case "S":
                this.posY++;
                break;
            case "L":
                this.posX++;
                break;
            case "O":
                this.posX--;
                break;
        }
    }

    public void moverParaDireita() {
        switch (this.direcao) {
            case "N":
                this.direcao = "L";
                break;
            case "S":
                this.direcao = "O";
                break;
            case "L":
                this.direcao = "S";
                break;
            case "O":
                this.direcao = "N";
                break;
        }
        this.moverParaFrente();
    }

    public void moverParaEsquerda() {
        switch (this.direcao) {
            case "N":
                this.direcao = "O";
                break;
            case "S":
                this.direcao = "L";
                break;
            case "L":
                this.direcao = "N";
                break;
            case "O":
                this.direcao = "S";
                break;
        }
        this.moverParaFrente();
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Carro() {
    }

    public Integer[][] getMapa() {
        return mapa;
    }

    public void setMapa(Integer[][] mapa) {
        this.mapa = mapa;
    }

    @Override
    public String toString() {
        switch (this.direcao) {
            case "N":
                return "↑";
            case "S":
                return "↓";
            case "L":
                return "→";
            case "O":
                return "←";
            default:
                return null;
        }
    }

    public void imprimeMapa(int tam) {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == this.posY && j == this.posX) {
                    System.out.print(" " + this);
                } else {
                    System.out.print(" " + this.mapa[i][j]);
                }
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }

    public String criaMapaLabel(int tam) {
        StringBuilder retorno = new StringBuilder();
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == this.posY && j == this.posX) {
                    retorno.append(" ").append(this);
                } else {
                    retorno.append(" ").append(this.mapa[i][j]);
                }
            }
            retorno.append("<br/>");
        }
        return retorno.toString();
    }

}
