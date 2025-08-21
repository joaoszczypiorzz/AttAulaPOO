abstract public class Pessoa {
    String nome;
    int idade;
    double peso;

    public Pessoa (String nome, int idade, double peso){
        this.nome = nome;
        this.idade =  idade;
        this.peso =  peso;
    }

     public String getNome(){
        this.nome = nome;
        return this.nome;
    }


    abstract String falar(String fala);
    abstract String pular(double altura);



}
