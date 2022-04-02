import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devThaisa = new Dev();
        devThaisa.setNome("Thaisa");
        devThaisa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thaisa: " + devThaisa.getConteudosInscritos());
        devThaisa.progredir();
        System.out.println("Conteúdos Concluídos Thaisa: " + devThaisa.getConteudosConcluidos());
        System.out.println("XP Thaisa: " + devThaisa.calcularTotalXp());

        System.out.println("\n--------------\n");

        /*Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Amanda: " + devAmanda.getConteudosInscritos());
        devAmanda.progredir();
        devAmanda.progredir();
        System.out.println("Conteúdos Inscritos Amanda: " + devAmanda.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Amanda: " + devAmanda.getConteudosConcluidos());
        System.out.println("XP Amanda: " + devAmanda.calcularTotalXp());*/

        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Amanda: " + devAmanda.getConteudosInscritos());
        devAmanda.progredir();
        devAmanda.progredir();
        devAmanda.exibirCursos();
        System.out.println("XP Amanda: " + devAmanda.calcularTotalXp());

        System.out.println("\n--------------\n");

        System.out.println("Devs inscritos no bootcamp: " + bootcamp.getDevsInscritos());

    }
}
