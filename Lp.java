package lp;

import java.util.ArrayList;
import java.util.GregorianCalendar; 
import java.util.Date;

public class Lp {
 
    public static void main(String[] args) {
        
        GregorianCalendar datual = new GregorianCalendar();
        //System.out.println(datual);

         ArrayList<Emprestimo> vetor = new ArrayList<Emprestimo>();
         
         Livro l = new Livro("O monge e o Executivo","James Hunter","Sextante",2004);
         //System.out.println(l.titulo);
         Emprestimo e = new Emprestimo("amigao1@gmail.com",new GregorianCalendar(2014,01,03),new GregorianCalendar(2014,02,03),l);
         vetor.add(e);
         
         Utensilio u = new Utensilio("frigideira","teflon");
         //System.out.println(u.getDescricao());
         //System.out.println(u.getMaterial());
         Emprestimo e3 = new Emprestimo("coleguinha2@gmail.com",new GregorianCalendar(2014,01,03),new GregorianCalendar(2014,02,03),u);
         vetor.add(e3);
         
         /*Utensilio u2 = new Utensilio("pote","plastico tampa azul");
         Emprestimo e4 = new Emprestimo("victor.com",new GregorianCalendar(2014,01,03),new GregorianCalendar(2021,02,03),u2);
         vetor.add(e4);
         
         Utensilio u3 = new Utensilio("casaco","de lã");
         Emprestimo e5 = new Emprestimo("pablo@g.com",new GregorianCalendar(2014,01,03),new GregorianCalendar(2031,02,03),u3);
         vetor.add(e5);
         
         Utensilio u6 = new Utensilio("carro","roll royce");
         Emprestimo e6 = new Emprestimo("leandro@g.com",new GregorianCalendar(2014,01,03),new GregorianCalendar(2019,02,03),u6);
         vetor.add(e6);*/
                  
         int cont=0;
         for(Emprestimo e2 : vetor){
             System.out.println("emprestimo numero: " + ++cont);
             Object o = e2.getO();
             //System.out.println("get o" + e2.o);
             int i = (datual.compareTo(e2.getDevolucao()));
             if (i==1){
             if(o instanceof Utensilio){
                 
                 System.out.println("está atrasado o utensilio:" + ((Utensilio) o).getDescricao());
         System.out.println(" do material: " + ((Utensilio) o).getMaterial() );
         }
             else if(o instanceof Livro){
                     System.out.println("está atrasado o livro:" + ((Livro)o).getTitulo());
             }
             
             //int i = (datual.compareTo(e2.getDevolucao()));
             //System.out.println("PAPO RETO" + i);
             //-1 se o dar esquerda for menor
             //0 se datas iguais
             //1 se esquerda maior que direita(1 se atrasado)
             
             /*if(i==1){
                 System.out.println("Está atrasado o emprestimo:" );
                 
             }*/
             //System.out.println();
             //System.out.println(e2.o);  
             //utensilio ou livro
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
                                                        System.out.println("-----------------------------------------------");
             }
             }  
             
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     //GregorianCalendar c1;
        //c1 = (GregorianCalendar) 
                //GregorianCalendar.getInstance();
  
        // Display the current date and time 
        //System.out.println("Current Date and Time : "
                           //+ c1.getTime());
         
   /* Calendar now = Calendar.getInstance();
    
                  public boolean verifica(Emprestimo ee){
         for(Emprestimo e2 : vetor){
             if(e2.getDevolucao().compareTo(c1)<0){
                 System.out.println("emprestimo numero: " + ++cont + "esta atrasado");
             Object o = e2.getO();
             if(DateUtils.truncatedEquals(user, now, Calendar.DATE)){
    // your code goes here
}
             if(o instanceof Utensilio){
                 
                 System.out.println(((Utensilio) o).getDescricao());
         
         }
             else if(o instanceof Livro){
                     System.out.println(((Livro)o).getTitulo());
             }
         }
             }*/
         
          /*for(Emprestimo e2 : vetor){
             if((verifica(e2.getDevolucao())) < 0){
                 System.out.println("emprestimo numero: " + ++cont + "esta atrasado");
             Object o = e2.getO();
             if(o instanceof Utensilio){
                 
                 System.out.println(((Utensilio) o).getDescricao());
         
         }
             else if(o instanceof Livro){
                     System.out.println(((Livro)o).getTitulo());
             }
             System.out.println();
             System.out.println(e2.o);  
             System.out.println(e2.getEmail());         
             System.out.println(e2.getDatasDeRetirada().toZonedDateTime());
             System.out.println(e2.getDevolucao().toZonedDateTime());
         }
             }*/
         } 
         
