package com.company;

import com.company.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso sobre Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso sobre Js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição sobre a mentoria");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp sobre Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Maicol");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo incritos: " + dev1.getNome() + "-->" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudo concluidos: " + dev1.getNome() + "-->" + dev1.getConteudosConcluidos());
        System.out.println("Conteudo restantes: " + dev1.getNome() + "-->" + dev1.getConteudosInscritos());
        System.out.println("XP = " + dev1.calcularTotalXP());

        System.out.println("--------------------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo incritos: " + dev2.getNome() + "-->" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudo concluidos: " + dev2.getNome() + "-->" + dev2.getConteudosConcluidos());
        System.out.println("Conteudo restantes: " + dev2.getNome() + "-->" + dev2.getConteudosInscritos());
        System.out.println("XP = " + dev2.calcularTotalXP());



    }
}
