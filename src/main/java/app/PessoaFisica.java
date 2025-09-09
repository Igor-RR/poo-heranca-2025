package app;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class PessoaFisica{
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private LocalDate dataNascimento;
    private String cpf;

    public String getNome(){
        return nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataCriacao(){
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String endereco, LocalDate dataNascimento, String cpf){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setCpf(cpf);
        this.setDataNascimento(dataNascimento);
        this.setDataCriacao(LocalDate.now());
    }

    public String exibirInformações(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return " ---- Informações ----- \n" +
                "Nome: " + this.getNome() + "\n" + 
                "Endereço: " + this.getEndereco + "\n" +
                "Data de nascimento: " + this.getDataCriacao().format(formatador) + "\n"
    }
}
