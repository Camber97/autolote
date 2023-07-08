
package proyautolote;

import java.io.*;

public class Principal {
    public static int NR=20;//Numero de registros
    public static int MR=30;//Maximo de registros
    public static Autolote A[]= new Autolote[MR];//Creacion e instanciamiento del objeto
    public static double TP=0;
    
    
    
    public static void ImprimeTabla(){  
    System.out.println("CODAUTO PLACA    MARCA      TIPO       COLOR          AÑO   PRECIO");
    System.out.println("===================================================================");
    for (int k=1;k<=NR;k++)
         A[k].ImprimeReg();
    System.out.println("==========================================================");     
         TP=(Math.rint(TP*100)/100.0);
    System.out.println("Total a pagar:\t\t\t\t\t    " + TP);    
    System.out.println("==========================================================");   
}//Fin del metodo  ImprimeTabla
    
    public static void Datos(){
A[1].GuardaReg("A01","ABC4420","TOYOTA","TURISMO","AZUL", "2007", 120);
A[2].GuardaReg("A02","XYZ7216","CHEVROLET","TRAKER","VERDE", "1998", 60);
A[3].GuardaReg("A03","PBX1124","SUZUKI","TRAKER","CAFÉ", "1995", 65);
A[4].GuardaReg("A04","PAL8820","HONDA","TURISMO","FUSIA", "2008", 110);
A[5].GuardaReg("A05","PRT9021","MAZDA","TURISMO","VERDE", "2000", 80);
A[6].GuardaReg("A06","UVY9374","TOYOTA","TURISMO","ROJO", "2010", 110);
A[7].GuardaReg("A07","GTD8942","SUZUKI","TRAKER","CAFÉ",  "2004", 90);
A[8].GuardaReg("A08","PIT8467","HONDA","TURISMO","AZUL", "2007", 75);
A[9].GuardaReg("A09","QER6477","HONDA","TURISMO","AZUL", "2005", 70);
A[10].GuardaReg("A10","GFR3745","TOYOTA","PAILA","BLANCO","2014",150);
A[11].GuardaReg("A11","PWR3412","NISSAN","CAMIONETA","AMARILLO","2012",140);
A[12].GuardaReg("A12","RWT3084","CHEVROLET","CAMIONETA","NEGRO","2009",90);
A[13].GuardaReg("A13","YTR4085","SUZUKI","PAILA","BLANCO","2013",140);
A[14].GuardaReg("A14","WPG3884","TOYOTA","CAMIONETA","NEGRO","2016",180);
A[15].GuardaReg("A15","POY9847","NISSAN","TURISMO","BLANCO","2013",125);
A[16].GuardaReg("A16","PQR8374","HONDA","TURISMO","ROJO","2014",135);
A[17].GuardaReg("A17","YTZ9865","SUZUKI","PAILA","AZUL","2011",120);
A[18].GuardaReg("A18","RUY2845","MAZDA","TURISMO","FUSIA","2009",90);
A[19].GuardaReg("A19","DOP3987","TOYOTA","TURISMO","AMARILLO","2007",80);
A[20].GuardaReg("A20","PTE2398","CHEVROLET","PAILA","ROJO","2005",70);
NR=20;
 }//Fin del metodo Datos
   
    
     public static void Inicializa(){
     for(int k=0;k<=MR-1;k++)
           A[k] = new Autolote(); 
         
     }//Fin del metodo Inicializa
     
     public static void Escritura(){
     File a= new File("C:/AUTOLOTE/INVENTARIO.txt");
    try{
    FileWriter fw= new FileWriter(a);
    PrintWriter pw = new PrintWriter(fw);
    for(int k=1;k<=NR;k++){
         pw.println(A[k].CodAuto);
         pw.println(A[k].Placa);
         pw.println(A[k].Marca);
         pw.println(A[k].Tipo);
         pw.println(A[k].Color);
         pw.println(A[k].Año);
         pw.println(A[k].Precio);
       
    }//Fin del for
    fw.close();
    }//Fin del try
    
    catch(IOException e){
        System.out.println("Error: Un error de escritura a ocurrido.");    
    }
        
    } //Fin del método Escritura
    
    
    
    public static void Lectura(){
   File a= new File("C:/AUTOLOTE/INVENTARIO.txt"); 
try{
 FileReader fr= new FileReader(a);
 BufferedReader br = new BufferedReader(fr);
 String Linea;
 Linea =br.readLine();
 int k=0;
 while(Linea!=null){
     k=k+1;
     A[k].CodAuto=Linea;
     Linea=br.readLine();
     A[k].Placa=Linea;
     Linea=br.readLine();
     A[k].Marca=Linea;
     Linea=br.readLine();
     A[k].Tipo=Linea;
     Linea=br.readLine();
     A[k].Color = Linea;
     Linea=br.readLine();
     A[k].Año = Linea;
     Linea=br.readLine();
     A[k].Precio = Double.parseDouble(Linea);
     Linea=br.readLine();
 }//Fin del ciclo while 
 NR=k;
 fr.close();
}
catch (IOException e)
{System.out.println("Error: Tuvo problema al leer en el archivo.");
}       
}//Fin del metodo Lectura
    
     
    
    
    
    
    public static void OrdenarAscxCodAuto(){
        Autolote t = new Autolote();
    for(int v=1;v<=NR;v++)
        for(int k=1;k<=NR-1;k++)
            if(A[k+1].CodAuto.compareTo(A[k].CodAuto)<0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
            }
            
 }//Fin del metodo OrdenarAscxCodProd
    
    public static void OrdenarDescxCodAuto(){
        Autolote t = new Autolote();
    for(int v=1;v<=NR;v++)
        for(int k=1;k<=NR-1;k++)
            if(A[k+1].CodAuto.compareTo(A[k].CodAuto)>0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
            }
            
 }//Fin del metodo OrdenarDescxCodAuto
    
    public static void OrdAscXPlaca(){
         Autolote t = new Autolote();
 for (int v=1;v<=NR;v++)
 for(int k=1;k<=NR-1;k++)
      if(A[k + 1].Placa.compareTo(A[k].Placa)<0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
      }                        
    
      
  }//Fin del metodo OrdAscXPlaca
    
    public static void OrdDescXPlaca(){
         Autolote t = new Autolote();
 for (int v=1;v<=NR;v++)
 for(int k=1;k<=NR-1;k++)
      if(A[k + 1].Placa.compareTo(A[k].Placa)>0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
      }                        
    
      
  }//Fin del metodo OrdDescXPlaca
     
    public static void OrdAscXMarca(){
         Autolote t = new Autolote();
 for (int v=1;v<=NR;v++)
 for(int k=1;k<=NR-1;k++)
      if(A[k + 1].Marca.compareTo(A[k].Marca)<0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
      }    
      
  }//Fin del metodo OrdAscXMarca
    
    
     public static void OrdDescXMarca(){
         Autolote t = new Autolote();
 for (int v=1;v<=NR;v++)
 for(int k=1;k<=NR-1;k++)
      if(A[k + 1].Marca.compareTo(A[k].Marca)>0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
      }    
      
  }//Fin del metodo OrdDescXMarca
    
    public static void OrdAscXTipo(){
         Autolote t = new Autolote();
 for (int v=1;v<=NR;v++)
 for(int k=1;k<=NR-1;k++)
      if(A[k + 1].Tipo.compareTo(A[k].Tipo)<0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
      }    
      
  }//Fin del metodo OrdAscXTipo
    
    public static void OrdDescXTipo(){
         Autolote t = new Autolote();
 for (int v=1;v<=NR;v++)
 for(int k=1;k<=NR-1;k++)
      if(A[k + 1].Tipo.compareTo(A[k].Tipo)>0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
      }    
      
  }//Fin del metodo OrdDescXTipo
    
    public static void OrdAscXColor(){
         Autolote t = new Autolote();
 for (int v=1;v<=NR;v++)
 for(int k=1;k<=NR-1;k++)
      if(A[k + 1].Color.compareTo(A[k].Color)<0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
      }    
      
  }//Fin del metodo OrdAscXColor
    
    public static void OrdDescXColor(){
         Autolote t = new Autolote();
 for (int v=1;v<=NR;v++)
 for(int k=1;k<=NR-1;k++)
      if(A[k + 1].Color.compareTo(A[k].Color)>0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
      }    
      
  }//Fin del metodo OrdDescXColor
    
    public static void OrdAscXAño(){
         Autolote t = new Autolote();
 for (int v=1;v<=NR;v++)
 for(int k=1;k<=NR-1;k++)
      if(A[k + 1].Año.compareTo(A[k].Año)<0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
      }    
      
  }//Fin del metodo OrdAscXAño
    
    public static void OrdDescXAño(){
         Autolote t = new Autolote();
 for (int v=1;v<=NR;v++)
 for(int k=1;k<=NR-1;k++)
      if(A[k + 1].Año.compareTo(A[k].Año)>0){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
      }    
      
  }//Fin del metodo OrdDescXAño
    
     public static void OrdenarAscxPrecio(){
        Autolote t = new Autolote();
    for(int v=1;v<=NR;v++)
        for(int k=1;k<=NR-1;k++)
            if(A[k+1].Precio<A[k].Precio){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
            }
            
 }//Fin del metodo OrdenarAscxPrecio
     
     public static void OrdenarDescxPrecio(){
        Autolote t = new Autolote();
    for(int v=1;v<=NR;v++)
        for(int k=1;k<=NR-1;k++)
            if(A[k+1].Precio>A[k].Precio){
                t=A[k+1];
                A[k+1]=A[k];
                A[k]=t;
            }
            
 }//Fin del metodo OrdenarDescxPrecio
     
    
    public static void main(String[] args) {
    Inicializa();
    Datos();
    ImprimeTabla();
    
    }//Fin del main
    
}//Fin de la clase Principal
