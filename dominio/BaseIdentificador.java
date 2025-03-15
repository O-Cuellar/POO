package dominio;

public abstract class BaseIdentificador{
    protected long id;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public BaseIdentificador(long id){
        this.id = id;
    }

}