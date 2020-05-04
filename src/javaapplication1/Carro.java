package javaapplication1;

public class Carro {

    private int velocidade = 1;
    private int distSensorFrontal = 1;
    private int distSensorLateral = 1;
    private String direcao = "N";
    private int posX;
    private int posY;
    private Integer mapa[][];

    public boolean lerSensorF() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":
                i-=this.distSensorFrontal;
                break;
            case "S":
                i+=this.distSensorFrontal;
                break;
            case "L":
                j+=this.distSensorFrontal;
                break;
            case "O":
                j-=this.distSensorFrontal;
                break;
        }
        return this.mapa[i][j] == 1;

    }

    public boolean lerSensorD() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":
                j+=this.distSensorLateral;
                break;
            case "S":
                j-=this.distSensorLateral;
                break;
            case "L":
                i+=this.distSensorLateral;
                break;
            case "O":
                i-=this.distSensorLateral;
                break;
        }
        return this.mapa[i][j] == 1;
    }

    public boolean lerSensorE() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":
                j-=this.distSensorLateral;
                break;
            case "S":
                j+=this.distSensorLateral;
                break;
            case "L":
                i-=this.distSensorLateral;
                break;
            case "O":
                i+=this.distSensorLateral;
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
                this.posY-=this.velocidade;
                break;
            case "S":
                this.posY+=this.velocidade;
                break;
            case "L":
                this.posX+=this.velocidade;
                break;
            case "O":
                this.posX-=this.velocidade;
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
                return " &#11165; ";
            case "S":
                return " &#11167; ";
            case "L":
                return " &#10148; ";
            case "O":
                return " &#11164; ";
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
                    retorno.append(this);
                } else {
                    if(this.mapa[i][j] == 1)    retorno.append("&nbsp;&#9635;&nbsp;");
                    else retorno.append("&nbsp;&#9634;&nbsp;");
                }
            }
            retorno.append("<br>");
        }
        return retorno.toString();
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDistSensorFrontal() {
        return distSensorFrontal;
    }

    public void setDistSensorFrontal(int distSensorFrontal) {
        this.distSensorFrontal = distSensorFrontal;
    }

    public int getDistSensorLateral() {
        return distSensorLateral;
    }

    public void setDistSensorLateral(int distSensorLateral) {
        this.distSensorLateral = distSensorLateral;
    }

    
    
}
