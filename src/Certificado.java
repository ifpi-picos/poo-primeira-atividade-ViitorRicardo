public class Certificado {
    private Aluno aluno;
    private Curso curso;
    private int Codigo;
    void printname(){
        System.out.println(this.aluno);
        System.out.println(this.curso);
        System.out.println(this.Codigo);
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

}
