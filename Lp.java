package lp;

import java.util.ArrayList;
import java.util.GregorianCalendar; 
import java.util.Date;

public class Lp {
 
    public static void main(String[] args) {
        
        GregorianCalendar datual = new GregorianCalendar();

        ArrayList<Emprestimo> emprestado = new ArrayList<Emprestimo>();
         
        Livro l = new Livro("O monge e o Executivo","James Hunter","Sextante",2004);
        Emprestimo e = new Emprestimo("amigao1@gmail.com",new GregorianCalendar(2014,01,03),new GregorianCalendar(2014,02,03),l);
        emprestado.add(e);
         
        Utensilio u = new Utensilio("frigideira","teflon");
        Emprestimo e3 = new Emprestimo("coleguinha2@gmail.com",new GregorianCalendar(2014,01,03),new GregorianCalendar(2014,02,03),u);
        emprestado.add(e3);
         
        int cont=0;
        for(Emprestimo e2 : emprestado){
            System.out.println("emprestimo numero: " + ++cont);
            Object o = e2.getO();
            int i = (datual.compareTo(e2.getDevolucao()));
            if (i==1){
                if(o instanceof Utensilio){
                    System.out.println("está atrasado o utensilio:" + ((Utensilio) o).getDescricao());
                    System.out.println(" do material: " + ((Utensilio) o).getMaterial() );
                }
                else if(o instanceof Livro){
                    System.out.println("está atrasado o livro:" + ((Livro)o).getTitulo());
                }
                System.out.println("cobrar com: " + e2.getEmail());         
                System.out.println("data retirada:" + e2.getDatasDeRetirada().toZonedDateTime());
                System.out.println("data combinada devoluicao:" + e2.getDevolucao().toZonedDateTime());
                System.out.println();
                System.out.println("-----------------------------------------------");
                System.out.println();
            }
            else if(o instanceof Utensilio){
                System.out.println("está emprestado sem atraso o utensilio:" + ((Utensilio) o).getDescricao() + " do material: " + ((Utensilio) o).getMaterial()  );
                System.out.println("-----------------------------------------------");
            }
            else if(o instanceof Livro){
                System.out.println("está emprestado sem atrasado o livro:" + ((Livro)o).getTitulo());
            }
           }  
             
    }
}         
