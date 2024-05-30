public class ExemploForArray {
    public static void main(String[] args) {
        //Em array o indice inicia em ZERO//
        String alunos [] = {"Deyvid", "Daniel", "Vitor", "Matheus", "Débora"};
        
        for (int x=0; x < alunos.length; x++) {
            
            System.out.println("O aluno no indice x " + x + " é " + alunos [x]);
        }
    }
}
