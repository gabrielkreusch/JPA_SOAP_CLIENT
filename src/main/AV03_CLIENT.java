/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import services.Compromisso;
import services.CompromissoWS;
import services.CompromissoWS_Service;
import services.Contato;
import services.ContatoWS;
import services.ContatoWS_Service;
import services.Local;
import services.LocalWS;
import services.LocalWS_Service;
import services.Participante;
import services.ParticipanteWS;
import services.ParticipanteWS_Service;

/**
 *
 * @author Gabriel P Kreusch
 */
public class AV03_CLIENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("TESTES CREATE");

        CompromissoWS compWS = new CompromissoWS_Service().getCompromissoWSPort();
        ContatoWS contWS = new ContatoWS_Service().getContatoWSPort();
        LocalWS locWS = new LocalWS_Service().getLocalWSPort();
        ParticipanteWS partWS = new ParticipanteWS_Service().getParticipanteWSPort();

        if (contWS.criarContato("Gabriel", "(47) 9999-9999", "gabriel@mail.com")) {
            System.out.println("Contato criado com sucesso!");
        } else {
            System.out.println("Houve um erro ao criar o contato!");
        }

        if (locWS.criarLocal("Assembléia de Deus", "Rua dos Coqueiros", "Velha", "Paranapanema", "777", "99999-999")) {
            System.out.println("Local criado com sucesso!");
        } else {
            System.out.println("Houve um erro ao criar o local!");
        }

        String iData = "12/04/2020 15:00:00";
        String fData = "12/04/2020 16:00:00";

        if (compWS.criarCompromisso(iData, fData, 2L)) {
            System.out.println("Compromisso criado com sucesso!");
        } else {
            System.out.println("Houve um erro ao criar o compromisso!");
        }

        if (partWS.criarParticipante(true, 1L, 3L)) {
            System.out.println("Participante criado com sucesso!");
        } else {
            System.out.println("Houve um erro ao criar o participante!");
        }

        System.out.println();
        System.out.println("TESTES UPDATE");

        if (contWS.alterarContato(1L, "Pedro", "(47) 9999-9999", "pedro@mail.com")) {
            System.out.println("Contato alterado com sucesso!");
        } else {
            System.out.println("Houve um erro ao alterar o participante!");
        }

        System.out.println();
        System.out.println("TESTE DE CONSULTA POR ID");

        System.out.println("Busca por id '1': " + contWS.contatoPorID(1L));

        System.out.println();
        System.out.println("TESTE CONSULTA DE TODOS OS DADOS");

        System.out.println("Contatos:");
        List<Contato> listaContatos = contWS.listarContatos();
        for (Contato cont : listaContatos) {
            System.out.println(cont);
        }

        System.out.println("Compromissos:");
        List<Compromisso> listaCompromissos = compWS.listarCompromissos();
        for (Compromisso comp : listaCompromissos) {
            System.out.println(comp);
        }

        System.out.println("Local:");
        List<Local> listaLocais = locWS.listarLocais();
        for (Local local : listaLocais) {
            System.out.println(local);
        }

        System.out.println("Participante:");
        List<Participante> listaParticipantes = partWS.listarParticipantes();
        for (Participante part : listaParticipantes) {
            System.out.println(part);
        }

        System.out.println();
        System.out.println("TESTE CONSULTA DE CONTATO COM O NOME");

        System.out.println("Busca por nome 'Pedro': ");
        List<Contato> listaContatosPorNome = contWS.contatoPorNome("Pedro");
        for (Contato cont : listaContatosPorNome) {
            System.out.println(cont);
        }

        System.out.println();
        System.out.println("TESTE COMPROMISSO POR LOCAL");

        List<Compromisso> listaCompromissosPorLocal = compWS.compromissoPorLocal(2L);
        for (Compromisso comp : listaCompromissosPorLocal) {
            System.out.println(comp);
        }

        System.out.println();
        System.out.println("TESTE COMPROMISSO POR CONTATO");

        List<Compromisso> listaCompromissoPorLocal = compWS.compromissoPorContato(1L);
        for (Compromisso comp : listaCompromissoPorLocal) {
            System.out.println();
        }

        System.out.println();
        System.out.println("TESTE EXCLUIR");

        if (contWS.excluirContato(1L)) {
            System.out.println("Objeto excluído com sucesso!");
        } else {
            System.out.println("Houve um erro ao excluir o contato!");
        }

        if (locWS.excluirLocal(2L)) {
            System.out.println("Local excluído com sucesso!");
        } else {
            System.out.println("Houve um erro ao excluir o local!");
        }

        if (compWS.excluirCompromisso(3L)) {
            System.out.println("Compromisso excluído com sucesso!");
        } else {
            System.out.println("Houve um erro ao excluir o compromisso!");
        }
    }
}