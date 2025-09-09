package app;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class PessoaJuridica extends Pessoa {

    private String nomeFantasia;
    private String cnpj;


    public String getNomeFantasia(){
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public String exibirInformações(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return " ---- Informações ----- \n" +
                "Nome: " + this.getNome() + "\n" + 
                "Endereço: " + this.getEndereco() + "\n" +
                "Data de nascimento: " + this.getDataCriacao().format(formatador) + "\n";
    }

    public PessoaJuridica(String nome, String endereco, String nomeFantasia, String cnpj){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
    }



}