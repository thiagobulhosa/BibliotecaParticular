package lp;

import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Emprestimo {
    String email;
    GregorianCalendar datasDeRetirada;
    GregorianCalendar devolucao; 
    GregorianCalendar devolucaoEfetiva;
    Object o;
    
   public Emprestimo(String email,GregorianCalendar datasDeRetirada,GregorianCalendar devolucao, Object o){
    this.email = email;
    this.datasDeRetirada = datasDeRetirada;
    this.devolucao = devolucao; 
    this.o = o;   
   }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GregorianCalendar getDatasDeRetirada() {
        return datasDeRetirada;
    }

    public void setDatasDeRetirada(GregorianCalendar datasDeRetirada) {
        this.datasDeRetirada = datasDeRetirada;
    }

    public GregorianCalendar getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(GregorianCalendar devolucao) {
        this.devolucao = devolucao;
    }

    public GregorianCalendar getDevolucaoEfetiva() {
        return devolucaoEfetiva;
    }

    public void setDevolucaoEfetiva(GregorianCalendar devolucaoEfetiva) {
        this.devolucaoEfetiva = devolucaoEfetiva;
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

   
     
        

}

