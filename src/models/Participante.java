/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Gabriel P Kreusch
 */
public class Participante {

    private Long idparticipante;
    private boolean status;
    private Contato contato;
    private Compromisso compromisso;

    public Long getIdparticipante() {
        return idparticipante;
    }

    public void setIdparticipante(Long idparticipante) {
        this.idparticipante = idparticipante;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Compromisso getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(Compromisso compromisso) {
        this.compromisso = compromisso;
    }

    @Override
    public String toString() {
        return "Participante{" + "idparticipante=" + idparticipante + ", status=" + status + ", contato=" + contato + ", compromisso=" + compromisso + '}';
    }
}