package Exercicio01;

public class Circulo extends Forma{

    //CONSTRUTOR PARA CONSEGUIR USAR O EXTENDS
    public Circulo(int coordenadaX, int coordenadaY, double raio) {
        super(coordenadaX, coordenadaY, raio);



    }

    @Override
    public double calcularArea() {
        return 1;
    }

    @Override
    public double calcularVolume() {
        return 4;
    }
}
