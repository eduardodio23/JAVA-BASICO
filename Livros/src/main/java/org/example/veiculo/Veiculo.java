package org.example.veiculo;

public class Veiculo {
    private String placa;
    private String cor;
    private int numpassageiros;
    private double tanque;
    private double velMax;
    private double consumo;

    public Veiculo(String placa, String cor, int numpassageiros, double tanque, double velMax, double consumo) {
        this.placa = placa;
        this.cor = cor;
        this.numpassageiros = numpassageiros;
        this.tanque = tanque;
        this.velMax = velMax;
        this.consumo = consumo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumpassageiros() {
        return numpassageiros;
    }

    public void setNumpassageiros(int numpassageiros) {
        this.numpassageiros = numpassageiros;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numpassageiros=" + numpassageiros +
                ", tanque=" + tanque +
                ", velMax=" + velMax +
                ", consumo=" + consumo +
                '}';
    }
}
