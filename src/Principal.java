import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) throws Exception{

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        Date data1Date = formatter.parse("23/07/2000");
        Date data2Date = formatter.parse("25/09/2050");

        Aluno aluno_ads = new Aluno();
        aluno_ads.setNome("Vitor Ricardo Fontes da Silva");
        aluno_ads.setEmail("Vitor.ricardo02777@gmail.com");
        aluno_ads.setMatricula("2022118tads0358");

        Professor professor = new Professor();
        professor.setNome("Jesiel Viana da Silva");
        professor.setEmail("jesiel@ifpi.edu.br");
        professor.setFormação("Mestre");

        Curso curso = new Curso();
        curso.setNome("Análise e Desenvolvimento de Sistemas");
        curso.setCargaHoraria(2190);
        curso.setModalidade("Presencial");
        curso.setNível("Médio");
        curso.setDataDeInicio(data1Date);
        curso.setDataDeFim(data2Date);
        curso.setGratuito(true);

        

        Certificado certificado = new Certificado();


        certificado.setAluno(aluno_ads);
        certificado.setCodigo(2022118);
        certificado.setCurso(curso);
    }
}
