package javaapplication1;

public class Carro {

    private int velocidade = 1;
    private int distSensorFrontal = 1;
    private int distSensorLateral = 1;
    private String direcao = "N";
    private int posX;
    private int posY;
    int tam;
    private Integer mapa[][];

    public boolean lerSensorF() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":
                if (i == 0) {
                    return false;
                }
                i -= this.distSensorFrontal;
                break;
            case "S":
                if (i == tam) {
                    return false;
                }
                i += this.distSensorFrontal;
                break;
            case "L":
                if (j == tam) {
                    return false;
                }
                j += this.distSensorFrontal;
                break;
            case "O":
                if (j == 0) {
                    return false;
                }
                j -= this.distSensorFrontal;
                break;
        }
        return this.mapa[i][j] == 1;

    }

    public boolean lerSensorD() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":
                if (j == tam) {
                    return false;
                }
                j += this.distSensorLateral;
                break;
            case "S":
                if (j == 0) {
                    return false;
                }
                j -= this.distSensorLateral;
                break;
            case "L":
                if (i == tam) {
                    return false;
                }
                i += this.distSensorLateral;
                break;
            case "O":
                if (i == 0) {
                    return false;
                }
                i -= this.distSensorLateral;
                break;
        }
        return this.mapa[i][j] == 1;
    }

    public boolean lerSensorE() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":
                if (j == 0) {
                    return false;
                }
                j -= this.distSensorLateral;
                break;
            case "S":
                if (j == tam) {
                    return false;
                }
                j += this.distSensorLateral;
                break;
            case "L":
                if (i == 0) {
                    return false;
                }
                i -= this.distSensorLateral;
                break;
            case "O":
                if (i == tam) {
                    return false;
                }
                i += this.distSensorLateral;
                break;
        }
        return this.mapa[i][j] == 1;
    }

    public boolean lerSensorNO() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":

                break;
            case "S":

                break;
            case "L":

                break;
            case "O":

                break;
        }
        return this.mapa[i][j] == 1;
    }

    public boolean lerSensorNE() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":

                break;
            case "S":

                break;
            case "L":

                break;
            case "O":

                break;
        }
        return this.mapa[i][j] == 1;
    }

    public boolean lerSensorSO() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":

                break;
            case "S":

                break;
            case "L":

                break;
            case "O":

                break;
        }
        return this.mapa[i][j] == 1;
    }

    public boolean lerSensorSE() {
        int i = this.posY, j = this.posX;
        switch (this.direcao) {
            case "N":

                break;
            case "S":

                break;
            case "L":

                break;
            case "O":

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
                if (this.posY - this.velocidade < 0) {
                    this.posY = 0;
                } else {
                    this.posY -= this.velocidade;
                }
                break;
            case "S":
                if (this.posY + this.velocidade > tam) {
                    this.posY = tam;
                } else {
                    this.posY += this.velocidade;
                }
                break;
            case "L":
                if (this.posX + this.velocidade > tam) {
                    this.posX = tam;
                } else {
                    this.posX += this.velocidade;
                }
                break;
            case "O":
                if (this.posX - this.velocidade < 0) {
                    this.posX = 0;
                } else {
                    this.posX -= this.velocidade;
                }

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
                    if (this.mapa[i][j] == 1) {
                        retorno.append("&nbsp;&#9635;&nbsp;");
                    } else {
                        retorno.append("&nbsp;&#9634;&nbsp;");
                    }
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

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

}
