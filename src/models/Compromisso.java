/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Gabriel P Kreusch
 */
public class Compromisso {

    private Long idcompromisso;
    private Date dataInicio;
    private Date dataFim;
    private List<Participante> participantes;
    private Local local;

    public Long getIdcompromisso() {
        return idcompromisso;
    }

    public void setIdcompromisso(Long idcompromisso) {
        this.idcompromisso = idcompromisso;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Compromisso{" + "idcompromisso=" + idcompromisso + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", participantes=" + participantes + ", local=" + local + '}';
    }
}