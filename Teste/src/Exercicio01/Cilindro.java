package Exercicio01;

//Extend é para SuperClasse e implements é para interface

public class Cilindro extends Forma implements Volume{

   //ATIBUTO
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //CONSTRUTOR PARA CONSEGUIR USAR O EXTENDS
    public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
        super(coordenadaX, coordenadaY, raio);
        this.altura = altura;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux += "Altura: "+altura+"\n";
        return aux;
    }

    @Override
    public double calcularArea() {
        return 2;
    }

    @Override
    public double calcularVolume() {
        return 3;
    }

}
