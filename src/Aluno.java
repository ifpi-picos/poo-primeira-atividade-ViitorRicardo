public class Aluno{
    private String nome;
    private String email;
    private String matricula;
    void printname(){
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.matricula);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}