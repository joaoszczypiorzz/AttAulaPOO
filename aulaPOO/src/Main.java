
public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(
                "nome",
                10,
                60,
                9.5,
                10
        );
        System.out.println(aluno1.nome + "\n" + aluno1.idade + "\n" + aluno1.peso + "\n" + aluno1.getNotaFinal()  + "\n" + aluno1.getMatricula());
    }
}