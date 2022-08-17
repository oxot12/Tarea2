/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Escritorio_2;

import static Secundarios.Insertar.txt_inserach;
import static Secundarios.Remplazar.txt_inreplace;
import static Secundarios.Remplazar.txt_inreplace1;
import java.text.Normalizer;

/**
 *
 * @author Oseas Xt
 */
public class Functions {
    
     public static void Repa(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
      // System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
      // System.out.print(times);
       Cadenas_Murcielagos.lbl_rep_A.setText(Integer.toString(times));
       
   }
      public static void Repe(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
      //  System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
   //    System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
     Cadenas_Murcielagos.lbl_rep_E.setText(Integer.toString(times));
       
   }
      
       public static void Repi(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
     //   System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
     //  System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       Cadenas_Murcielagos.lbl_rep_I.setText(Integer.toString(times));
       
   }
       
        public static void Repo(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
     //   System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
     //  System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       Cadenas_Murcielagos.lbl_rep_O.setText(Integer.toString(times));
       
   }
        
         public static void Repu(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
      //  System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
      // System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
     Cadenas_Murcielagos.lbl_rep_U.setText(Integer.toString(times));
       
   }
         
         public static void PAR(String valor){
             String[] valorarray = valor.split(" ");
             int sumPar=0;
             int sumImp=0;
             
             
         for (String palabra : valorarray) {
             // System.out.println(palabra);
             int cont = palabra.length();
             //System.out.println(cont);
             
             if (cont % 2 == 0 ){
                 sumPar = sumPar + 1;
                 
             }else {
                 sumImp = sumImp + 1;
             }
         }
            
             Cadenas_Murcielagos.lbl_cant_par.setText(Integer.toString(sumPar));
             Cadenas_Murcielagos.lbl_cant_impar.setText(Integer.toString(sumImp));
         }
         
         
          public static void Buscar(){
              
              String valor = Cadenas_Murcielagos.txta_pantalla1.getText();
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
       
       String find = txt_inserach.getText();
      
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(find)){
               times++;
               
           }
       }
       System.out.println(times);
       Secundarios.Insertar.lbl_conc.setText(Integer.toString(times));
       


          }
          
          public static void replace(){
       
   
   String valor = Cadenas_Murcielagos.txta_pantalla1.getText();
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
       
       String find = txt_inreplace.getText();
       String rep = txt_inreplace1.getText();
       
    
       
       for (int i = 0; i <find.length(); i++){
          // s = s.replace(abecedario[i], traductor[i]);
           s = s.replace(find, rep);
       }
       Cadenas_Murcielagos.txta_pantalla1.setText(s);
    
   }
         
         
    
}
