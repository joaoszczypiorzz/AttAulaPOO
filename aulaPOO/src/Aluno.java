public class Aluno extends Pessoa{
    private int matricula;
    private double media;
    private double notaFinal;

    public Aluno(String nome, int idade, double peso, double notaFinal, int matricula){

        super(nome, idade, peso);
        this.notaFinal = notaFinal;
        this.matricula = matricula;

    }

 /*   public String apresentar(String fala){

    }
    public String perguntar(String pergunta){

    } */

    public Aluno setMatricula(int matricula){
        this.matricula = matricula;
        return this;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public Aluno setNotaFinal(double notaFinal){
        this.notaFinal = notaFinal;
        return this;
    }

    public double getNotaFinal(){
        return this.notaFinal;
    }

    public String pular(double altura){
        return "Pulou 2m";
    }

    public String falar(String fala){
        return this.matricula + " " + super.falar(fala);
    }
    public String getNome(){
        return this.nome;
    }
    public Aluno setNome(String nome){
        this.nome = nome;
        return this;
    }
}
