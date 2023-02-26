import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso introducaoJava = new Curso();
        introducaoJava.setTitulo("Java");
        introducaoJava.setDescricao("curso completo de Java");
        introducaoJava.setCargaHoraria(8);
        Curso avancandoJava = new Curso();
        avancandoJava.setTitulo("JavaScript");
        avancandoJava.setDescricao("curso completo de JavaScript");
        avancandoJava.setCargaHoraria(4);

        

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());
        
        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de Java");
        bootcamp.setDescricao("Descrição do Bootcamp de Java");
        bootcamp.getConteudos().add(introducaoJava);
        bootcamp.getConteudos().add(avancandoJava);
        bootcamp.getConteudos().add(mentoria);

        Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        devDiego.progredir();

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();


        System.out.println("Diego: Conteúdos inscritos: " + devDiego.getConteudosInscritos());
        System.out.println("Diego: Conteúdos concluídos: " + devDiego.getConteudosConcluidos());
        System.out.println("Diego: Total de XP: " + devDiego.calcularTotalXp());
    }
}
