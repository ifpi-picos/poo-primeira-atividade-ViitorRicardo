public class Professor {
    private String nome;
    private String email;
    private String formação;
    void printname(){
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.formação);
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
    public String getFormação() {
        return formação;
    }
    public void setFormação(String formação) {
        this.formação = formação;
    }

}
