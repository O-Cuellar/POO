package dominio.pessoa;

import java.time.LocalDate;

public class Passageiro extends BasePessoa{

    private String cpf;
    private String cardNumber;

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public Passageiro(long id, LocalDate includeDate, LocalDate changeDate, String name, String number, String email) {
        super(id, includeDate, changeDate, name, number, email);
        this.cpf = cpf;
        this.cardNUmber = cardNumber;
    }

}