package app;

public class Tarefa extends Atividade{

    private boolean isConcluido;

    public boolean IsConcluido(){
        return isConcluido;
    }
    public void setConcluido(boolean IsConcluido){
        this.isConcluido = isConcluido;
    }
    /*Boa noite señores*/

    public Tarefa(long id, String descricao, boolean isConcluido){
        this.setId(id);
        this.setDescricao(descricao);
        this.setConcluido(isConcluido);
    }
}