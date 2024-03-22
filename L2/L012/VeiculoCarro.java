package L2.L012;

public class VeiculoCarro implements VeiculoIF {
    private boolean portasAbertas;

    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro.");
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro.");
    }

    public boolean verificarPortasAbertas() {
        return portasAbertas;
    }

    public void setPortasAbertas(boolean portasAbertas) {
        this.portasAbertas = portasAbertas;
    }
}
