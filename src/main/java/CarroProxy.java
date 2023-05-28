class CarroProxy  implements Carro{
    private CarroReal carroReal;

    @Override
    public void ligar() {
        if (carroReal == null) {
            carroReal = new CarroReal();
        }
        carroReal.ligar();
    }

    @Override
    public void acelerar(int velocidade) {
        if (carroReal == null) {
            carroReal = new CarroReal();
        }
        carroReal.acelerar(velocidade);
    }

    @Override
    public void frear() {
        if (carroReal == null) {
            carroReal = new CarroReal();
        }
        carroReal.frear();
    }
}
