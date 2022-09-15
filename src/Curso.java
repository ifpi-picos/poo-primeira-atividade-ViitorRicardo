import java.util.Date;
public class Curso {
    private String nome;
    private int CargaHoraria;
    private String modalidade;
    private String nível;
    private Date dataDeInicio;
    private Date dataDeFim;
    private boolean gratuito;

    void printname(){
        System.out.println(this.nome);
        System.out.println(this.CargaHoraria);
        System.out.println(this.modalidade);
        System.out.println(this.nível);
        System.out.println(this.dataDeInicio);
        System.out.println(this.dataDeFim);
        System.out.println(this.gratuito);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getNível() {
        return nível;
    }

    public void setNível(String nível) {
        this.nível = nível;
    }

    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public Date getDataDeFim() {
        return dataDeFim;
    }

    public void setDataDeFim(Date dataDeFim) {
        this.dataDeFim = dataDeFim;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

}
