package app;

public class Compromisso extends Atividade {
    private String dataInicial;
    private String dataFinal;

    public void setDataInicial(String dataInicial){
        this.dataInicial = dataInicial;
    }
    public String getDatainical(){
        return dataInicial;
    }
    public void setDataFinal(String dataFinal){
        this.dataFinal = dataFinal;
    }
    public String getDataFinal(){
        return dataFinal;
    }
    public Compromisso(
        long id, 
        String descricao,
        String dataInicial,
        String dataFinal){

        this.setid(id);
        this.setDescricao(descricao);
        this.setDataFinal(dataFinal);
        this.setDatainical(dataInicial);
 
    }

    public Compromisso(
        long id, 
        String descricao,
        String dataInicial){

        this.setid(id);
        this.setDescricao(descricao);
        this.setDatainical(dataInicial);
        }
}