package app;

public class Trabalhador extends Pessoa {
    private int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }
    
    public int getSalario(){
        return salario;
    }

    public Trabalhador(String nome,int idade, int salario){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
    }
    public Trabalhador(){};

}