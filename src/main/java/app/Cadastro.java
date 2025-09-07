package app;

public class Cadastro{
    public static void main(String[] args){
        Trabalhador[] trab = new Trabalhador[5];
        trab[0] = new Trabalhador("Agnaldo",15,8000);
        trab[1] = new Trabalhador(); 
        trab[2] = new Trabalhador();
        trab[3] = new Trabalhador();
        trab[4] = new Trabalhador();

        Desempregado[] desemp = new Desempregado [3];

        desemp[0] = new Desempregado();
        desemp[1] = new Desempregado();
        desemp[2] = new Desempregado();

        System.out.println("O trabalhador " + trab[0].getNome()+ " tem " 
        + trab[0].getIdade()+ " de idade e ganha cerca de " 
        + trab[0].getSalario()+ " reais");
    }
}