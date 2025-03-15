package dominio.pessoa;

import java.time.LocalDate;

import dominio.BaseParametro;

public abstract class BasePessoa extends BaseParametro{

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

    public BasePessoa(long id, LocalDate includeDate, LocalDate changeDate, String name, String number, String email) {
        super(id, includeDate, changeDate);
        this.name = name;
        this.number = number;
        this.email = email;
    }

}