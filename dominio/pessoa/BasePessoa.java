package dominio.pessoa;

import dominio.BaseIdentificador;

public abstract class BasePessoa extends BaseIdentificador{
    protected String name;
    protected String number;
    protected String email;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public BasePessoa(long id,String name, String number, String email) {
        super(id);
        this.name = name;
        this.number = number;
        this.email = email;
    }

}