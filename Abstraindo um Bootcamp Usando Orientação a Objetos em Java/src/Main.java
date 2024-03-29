import Desafio.Dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndrelon = new Dev();
        devAndrelon.setNome("Andrelon");
        devAndrelon.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos andrelon: " + devAndrelon.getConteudosInscritos());
        devAndrelon.progredir();
        devAndrelon.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos andrelon: " + devAndrelon.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Andrelon: " + devAndrelon.getConteudosconcluidos());
        System.out.println("XP: " + devAndrelon.calcularTotalXP());

        System.out.println("===========================");

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rafael: " + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rafael: " + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Rafael: " + devRafael.getConteudosconcluidos());
        System.out.println("XP: " + devRafael.calcularTotalXP());

    }
}
