package dominio;

import java.time.LocalDate;

public abstract class BaseParametro extends BaseIdentificador{
    protected LocalDate includeDate;
    protected LocalDate changeDate;

    public LocalDate getIncludeDate(){
        return includeDate;
    }

    public void setIncludeDate(LocalDate includeDate){
        this.includeDate = includeDate;
    }

    public LocalDate getChangeDate(){
        return changeDate;
    }

    public void setChangeDate(LocalDate changeDate){
        this.changeDate = changeDate;
    }

    public BaseParametro(long id, LocalDate includeDate, LocalDate changeDate){
        super(id);
        this.includeDate = includeDate;
        this.changeDate = changeDate;
    }

}