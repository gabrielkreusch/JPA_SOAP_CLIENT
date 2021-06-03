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
public class Local {

    private Long idlocal;
    private String descricao;
    private String rua;
    private String bairro;
    private String cidade;
    private String numero;
    private String cep;

    public Long getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(Long idlocal) {
        this.idlocal = idlocal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Local{" + "idlocal=" + idlocal + ", descricao=" + descricao + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", numero=" + numero + ", cep=" + cep + '}';
    }
}