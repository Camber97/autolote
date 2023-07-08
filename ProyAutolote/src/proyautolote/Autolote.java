
package proyautolote;


public class Autolote {
 //Atributos   
 String CodAuto;
 String Placa;
 String Marca;
 String Tipo;
 String Color;
 String Año;
 double Precio;
 double Total;
 
 //Constructor
 public Autolote(){
  CodAuto="cd";
  Placa="pla";
  Marca="m";
  Tipo="t";
  Color="c";
  Año="a";
  Precio=0;        
}//Fin del constructor
 
 void GuardaReg(String cd, String pla, String m, String t, String c, String a, int prec ){
  CodAuto= cd; 
  Placa=pla;
  Marca=m;
  Tipo=t;
  Color=c;
  Año=a;
  Precio=prec;
  
 }//Fin del metodo GuardaReg
 
 void ImprimeReg(){
    String f1, f2, f3, f4, f5, f6, f7, f;
 f1="%-8s";
 f2="%-9s";
 f3="%-11s";
 f4="%-11s";
 f5="%-15s";
 f6="%-6d";
 f7="%-6d";
 
 f = f1 + f2 + f3 + f4 + f5 + f6 + f7 + "\n";
  System.out.format(f,CodAuto,Placa,Marca,Tipo,Color,Año,Precio );
 }//Fin del mnetodo ImprimeReg
 

}//Fin de la clase Autolote
