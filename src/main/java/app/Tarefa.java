package app;

public class Tarefa{
    private long id;
    private String descricao;
    private boolean isConcluido;

    public long getId(){
        return id;
    }
    public void setId(long Id){
        this.id = id;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
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