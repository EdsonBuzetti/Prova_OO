public  class Aluno extends Pessoa{
    private int periodo;
    private int turma;

    public Aluno(String nome, String email, int periodo, int turma) {
        super(nome, email);
        this.periodo = periodo;
        this.turma = turma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
    public String mostraAluno() {
        return getNome() + "\n" + getEmail() + "\n" + getPeriodo() + "\n" + getTurma();
    }
}
