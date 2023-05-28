class CarroReal implements Carro {
    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Carro acelerando a " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }
}