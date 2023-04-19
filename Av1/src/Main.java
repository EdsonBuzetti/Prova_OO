public class Main {
    public static void main(String[] args){
    Professor p1 = new Professor("Edson", "edinhobuzetti@hotmail.com", 250 ,5000);
    p1.mostraProfessor();
    System.out.println("Os dados do professor sao: " + p1.mostraProfessor());

    Aluno a1 = new Aluno("Rosa", "rosarosa@gmail.com", 3,204);
    a1.mostraAluno();
    System.out.println("Os dados do professor sao: " + a1.mostraAluno());
    }
}