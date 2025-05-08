package TesteArrayList;

public class Produto {

    //ATRIBUTOS
    String nome;
    int  id;

    //CONSTRUTOR
    public Produto(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " "+ nome;
    }
}
