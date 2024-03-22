package L2.L012;

public class VeiculoMoto implements VeiculoIF {
    private boolean capaceteSeguranca;

    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando a moto.");
    }

    @Override
    public void frear() {
        System.out.println("Freando a moto.");
    }

    public boolean verificarCapaceteSeguranca() {
        return capaceteSeguranca;
    }

    public void setCapaceteSeguranca(boolean capaceteSeguranca) {
        this.capaceteSeguranca = capaceteSeguranca;
    }
}
