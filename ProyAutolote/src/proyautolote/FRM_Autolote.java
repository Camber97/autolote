
package proyautolote;
import javax.swing.JOptionPane;
import proyautolote.Autolote;
import proyautolote.Principal;
import javax.swing.table.DefaultTableModel;
import static proyautolote.Principal.A;
import static proyautolote.Principal.NR;


public class FRM_Autolote extends javax.swing.JFrame {
public int i=1;
DefaultTableModel dtm = new DefaultTableModel();
void Ver_Registro(){
      jTextField1.setText(Principal.A[i].CodAuto );
      jTextField2.setText(Principal.A[i].Placa );
      jTextField3.setText(Principal.A[i].Marca);
      jTextField4.setText(Principal.A[i].Tipo);
      jTextField5.setText(Principal.A[i].Color);      
      jTextField6.setText(Principal.A[i].Año); 
      jTextField7.setText(Double.toString(Principal.A[i].Precio));     
      
    }//Fin del metodo Ver_Registro
    
    
    void Nuevo(){
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
    
    
}//Fin del metodo Nuevo
    
    void Agregar(){
     int k;   
     Principal.NR = Principal.NR + 1; 
     k=Principal.NR;
     Principal.A[k].CodAuto = jTextField1.getText();
     Principal.A[k].Placa = jTextField2.getText();
     Principal.A[k].Marca = jTextField3.getText();
     Principal.A[k].Tipo = jTextField4.getText();
     Principal.A[k].Color = jTextField5.getText();
     Principal.A[k].Año = jTextField6.getText();
     Principal.A[k].Precio = Double.parseDouble(jTextField7.getText());
     
     BTN_Agregar.setEnabled(false);
    }//Fin del metodo Agregar
    
    
     void Actualizar(){
    
     
     Principal.A[i].CodAuto = jTextField1.getText();
     Principal.A[i].Placa = jTextField2.getText();
     Principal.A[i].Marca = jTextField3.getText();
     Principal.A[i].Tipo = jTextField4.getText();
     Principal.A[i].Color = jTextField5.getText();
     Principal.A[i].Año = jTextField6.getText();
     Principal.A[i].Precio = Double.parseDouble(jTextField7.getText());
    }//Fin del metodo Actualizar
     
     void EliminarReng(){
       int k,nn;
       nn= dtm.getRowCount();
       if(nn>0)
           for(k=0;k<=Principal.NR;k++)
               dtm.removeRow(0);
     }//Fin del metodo EliminarReng
     
     void AgregarReng(){
         for(int k=0;k<=Principal.NR;k++)
             dtm.addRow(new Object[]{"","","","","","","",""});
     }//Fin del metodo AgregarReng
             
      void Listar(){
          int Fila;
          for (Fila=1;Fila<=Principal.NR;Fila++){
              dtm.setValueAt(Principal.A[Fila].CodAuto, Fila-1, 0);
              dtm.setValueAt(Principal.A[Fila].Placa, Fila-1, 1);
              dtm.setValueAt(Principal.A[Fila].Marca, Fila-1, 2);
              dtm.setValueAt(Principal.A[Fila].Tipo, Fila-1, 3);
              dtm.setValueAt(Principal.A[Fila].Color, Fila-1, 4);
              dtm.setValueAt(Principal.A[Fila].Año, Fila-1, 5);
              dtm.setValueAt(Principal.A[Fila].Precio, Fila-1, 6);
//              
          }//Fin del ciclo Fila
      }   //Fin del metodo Listar 
      
      
      void ListarColorIgualA(String col){
         int Fila;
         int c=-1;
          for (Fila=1;Fila<=Principal.NR;Fila++){
              if (Principal.A[Fila].Color.equals(col)){
                  c=c+1;
              dtm.setValueAt(Principal.A[Fila].CodAuto, c, 0);
              dtm.setValueAt(Principal.A[Fila].Placa, c, 1);
              dtm.setValueAt(Principal.A[Fila].Marca, c, 2);
              dtm.setValueAt(Principal.A[Fila].Tipo, c, 3);
              dtm.setValueAt(Principal.A[Fila].Color, c, 4);
              dtm.setValueAt(Principal.A[Fila].Año, c, 5);
              dtm.setValueAt(Principal.A[Fila].Precio, c, 6);
              
              }//Fin del if
          }//Fin del ciclo Fila  
 }//Fin del metodo ListarColorIgualA  
      
      void ListarTipoIgualA(String t){
         int Fila;
         int c=-1;
          for (Fila=1;Fila<=Principal.NR;Fila++){
              if (Principal.A[Fila].Tipo.equals(t)){
                  c=c+1;
              dtm.setValueAt(Principal.A[Fila].CodAuto, c, 0);
              dtm.setValueAt(Principal.A[Fila].Placa, c, 1);
              dtm.setValueAt(Principal.A[Fila].Marca, c, 2);
              dtm.setValueAt(Principal.A[Fila].Tipo, c, 3);
              dtm.setValueAt(Principal.A[Fila].Color, c, 4);
              dtm.setValueAt(Principal.A[Fila].Año, c, 5);
              dtm.setValueAt(Principal.A[Fila].Precio, c, 6);
              
              }//Fin del if
          }//Fin del ciclo Fila  
 }//Fin del metodo ListarTipoIgualA 
    
      
      void ListarMarcaIgualA(String m){
         int Fila;
         int c=-1;
          for (Fila=1;Fila<=Principal.NR;Fila++){
              if (Principal.A[Fila].Marca.equals(m)){
                  c=c+1;
              dtm.setValueAt(Principal.A[Fila].CodAuto, c, 0);
              dtm.setValueAt(Principal.A[Fila].Placa, c, 1);
              dtm.setValueAt(Principal.A[Fila].Marca, c, 2);
              dtm.setValueAt(Principal.A[Fila].Tipo, c, 3);
              dtm.setValueAt(Principal.A[Fila].Color, c, 4);
              dtm.setValueAt(Principal.A[Fila].Año, c, 5);
              dtm.setValueAt(Principal.A[Fila].Precio, c, 6);
              
              }//Fin del if
          }//Fin del ciclo Fila  
 }//Fin del metodo ListarMarcaIgualA 
      
     
    
    public FRM_Autolote() {
        initComponents();
        String[] titulo = new String[]{"CodAuto","Placa","Marca","Tipo","Color","Año","Precio"};
       dtm.setColumnIdentifiers(titulo);
       jTable1.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BTN_Ver_Registro = new javax.swing.JButton();
        BTN_Incializar = new javax.swing.JButton();
        BTN_Datos = new javax.swing.JButton();
        BTN_Calcular = new javax.swing.JButton();
        BTN_Primero = new javax.swing.JButton();
        BTN_Anterior = new javax.swing.JButton();
        BTN_Siguiente = new javax.swing.JButton();
        BTN_Último = new javax.swing.JButton();
        BTN_Leer_Archivo = new javax.swing.JButton();
        BTN_Guarda_Archivo = new javax.swing.JButton();
        BTN_Nuevo = new javax.swing.JButton();
        BTN_Agregar = new javax.swing.JButton();
        BTN_Actualizar = new javax.swing.JButton();
        BTN_Eliminar = new javax.swing.JButton();
        BTN_Filtrar = new javax.swing.JButton();
        BTN_Listar = new javax.swing.JButton();
        BTN_Ordenar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("CodAuto");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Placa");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Color");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Año");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Precio");

        BTN_Ver_Registro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Ver_Registro.setText("Ver Registro");
        BTN_Ver_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Ver_RegistroActionPerformed(evt);
            }
        });

        BTN_Incializar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Incializar.setText("Incializar");
        BTN_Incializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_IncializarActionPerformed(evt);
            }
        });

        BTN_Datos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Datos.setText("Datos");
        BTN_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DatosActionPerformed(evt);
            }
        });

        BTN_Calcular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Calcular.setText("Calcular");
        BTN_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CalcularActionPerformed(evt);
            }
        });

        BTN_Primero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Primero.setText("Primero");
        BTN_Primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PrimeroActionPerformed(evt);
            }
        });

        BTN_Anterior.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Anterior.setText("Anterior");
        BTN_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AnteriorActionPerformed(evt);
            }
        });

        BTN_Siguiente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Siguiente.setText("Siguiente");
        BTN_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SiguienteActionPerformed(evt);
            }
        });

        BTN_Último.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Último.setText("Último");
        BTN_Último.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ÚltimoActionPerformed(evt);
            }
        });

        BTN_Leer_Archivo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Leer_Archivo.setText("Leer Archivo");
        BTN_Leer_Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Leer_ArchivoActionPerformed(evt);
            }
        });

        BTN_Guarda_Archivo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Guarda_Archivo.setText("Guarda Archivo");
        BTN_Guarda_Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Guarda_ArchivoActionPerformed(evt);
            }
        });

        BTN_Nuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Nuevo.setText("Nuevo");
        BTN_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevoActionPerformed(evt);
            }
        });

        BTN_Agregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Agregar.setText("Agregar");
        BTN_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AgregarActionPerformed(evt);
            }
        });

        BTN_Actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Actualizar.setText("Actualizar");
        BTN_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ActualizarActionPerformed(evt);
            }
        });

        BTN_Eliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Eliminar.setText("Eliminar");
        BTN_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EliminarActionPerformed(evt);
            }
        });

        BTN_Filtrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Filtrar.setText("Filtrar");
        BTN_Filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_FiltrarActionPerformed(evt);
            }
        });

        BTN_Listar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Listar.setText("Listar");
        BTN_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ListarActionPerformed(evt);
            }
        });

        BTN_Ordenar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Ordenar.setText("Ordenar");
        BTN_Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(62, 62, 62)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTN_Ver_Registro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Incializar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Datos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Primero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Siguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Último)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Ordenar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTN_Leer_Archivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Guarda_Archivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Listar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Filtrar)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Ver_Registro)
                    .addComponent(BTN_Incializar)
                    .addComponent(BTN_Datos)
                    .addComponent(BTN_Calcular)
                    .addComponent(BTN_Primero)
                    .addComponent(BTN_Anterior)
                    .addComponent(BTN_Siguiente)
                    .addComponent(BTN_Último)
                    .addComponent(BTN_Ordenar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Leer_Archivo)
                    .addComponent(BTN_Guarda_Archivo)
                    .addComponent(BTN_Nuevo)
                    .addComponent(BTN_Agregar)
                    .addComponent(BTN_Actualizar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTN_Eliminar)
                        .addComponent(BTN_Listar)
                        .addComponent(BTN_Filtrar)))
                .addGap(0, 125, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(479, 479, 479))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_Ver_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Ver_RegistroActionPerformed
    Principal.Inicializa();
    Principal.Datos();
    Ver_Registro();
    }//GEN-LAST:event_BTN_Ver_RegistroActionPerformed

    private void BTN_IncializarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_IncializarActionPerformed
    EliminarReng();
    Principal.Inicializa(); 
    Ver_Registro();
    }//GEN-LAST:event_BTN_IncializarActionPerformed

    private void BTN_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DatosActionPerformed
    Principal.Inicializa(); 
    Principal.Datos();
    i=1;
    Ver_Registro(); 
    }//GEN-LAST:event_BTN_DatosActionPerformed

    private void BTN_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CalcularActionPerformed
        
    }//GEN-LAST:event_BTN_CalcularActionPerformed

    private void BTN_PrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PrimeroActionPerformed
     i=1;
    Ver_Registro();
    }//GEN-LAST:event_BTN_PrimeroActionPerformed

    private void BTN_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AnteriorActionPerformed
         i=i-1;
    if (i==0) i = 1;
    Ver_Registro();
    }//GEN-LAST:event_BTN_AnteriorActionPerformed

    private void BTN_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SiguienteActionPerformed
        i=i+1;
       if(i>Principal.NR) i=Principal.NR;         
      Ver_Registro(); 
    }//GEN-LAST:event_BTN_SiguienteActionPerformed

    private void BTN_ÚltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ÚltimoActionPerformed
         i=Principal.NR;
       Ver_Registro();
    }//GEN-LAST:event_BTN_ÚltimoActionPerformed

    private void BTN_Leer_ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Leer_ArchivoActionPerformed
       Principal.Inicializa(); 
       Principal.Lectura();
        i=1;  
        Ver_Registro();
        
        
    }//GEN-LAST:event_BTN_Leer_ArchivoActionPerformed

    private void BTN_Guarda_ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Guarda_ArchivoActionPerformed
         Principal.Escritura();
         
    }//GEN-LAST:event_BTN_Guarda_ArchivoActionPerformed

    private void BTN_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevoActionPerformed
         Nuevo();
       BTN_Agregar.setEnabled(true);
       jTextField1.requestFocus();
    }//GEN-LAST:event_BTN_NuevoActionPerformed

    private void BTN_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AgregarActionPerformed
       Agregar();
       dtm.addRow(new Object[]{"","","","","","",""});

    }//GEN-LAST:event_BTN_AgregarActionPerformed

    private void BTN_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ActualizarActionPerformed
        Actualizar(); 
        
    }//GEN-LAST:event_BTN_ActualizarActionPerformed

    private void BTN_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EliminarActionPerformed
        EliminarReng();
    }//GEN-LAST:event_BTN_EliminarActionPerformed

    private void BTN_FiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_FiltrarActionPerformed
        EliminarReng();
        AgregarReng();
        Principal.Inicializa(); 
        Principal.Datos();
        String ss, s1, s2, s3, s4;
        String SOp;
        int Op = 0;
       
      
while (Op!=4){
ss="MENU Filtrar Por\n";
s1= "01. Filtrar por colores\n";
s2= "02. Filtrar por tipo\n";
s3= "03. Filtrar por marca\n";
s4= "04. Salir\n";
ss= ss + s1 + s2 + s3 + s4;
SOp= JOptionPane.showInputDialog(ss + "Teclee una opción"); 
Op = Integer.parseInt(SOp); 


if(Op==1){ ListarColorIgualA(JOptionPane.showInputDialog("Ingrese el color del automóvil"));

}
if(Op==2){ListarTipoIgualA(JOptionPane.showInputDialog("Ingrese el tipo de automóvil"));

}
if(Op==3){ ListarMarcaIgualA(JOptionPane.showInputDialog("Ingrese la marca del automóvil"));

}
  

}//Fin del ciclo while   
       

      

    }//GEN-LAST:event_BTN_FiltrarActionPerformed

    private void BTN_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ListarActionPerformed
       EliminarReng();
       AgregarReng();
       Principal.Inicializa(); 
       Principal.Datos();
       Listar();
    }//GEN-LAST:event_BTN_ListarActionPerformed

    private void BTN_OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OrdenarActionPerformed
        EliminarReng();
        AgregarReng();
        Principal.Inicializa(); 
        Principal.Datos();
       String ss, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15;
        String SOp;
        int Op = 0;
    while (Op!=15){
         ss="MENU Ordenar Por\n";
         s1= "1. Ordena ascendentemente por código\n";
         s2= "2. Ordena descendentemente por código\n";
         s3= "3. Ordena ascendentemente por placa\n";
         s4= "4. Ordena descendentemente por placa\n";
         s5= "5. Ordena ascendentemente por marca\n";
         s6= "6. Ordena desscendentemente por marca\n";
         s7= "7. Ordena ascendentemente por tipo\n";
         s8= "8. Ordena descendentemente por tipo\n";
         s9= "9. Ordena ascendentemente por color\n";
         s10="10. Ordena descendentemente por color\n";
         s11="11. Ordena ascendentemente por año\n";
         s12="12. Ordena descendentemente por año\n";
         s13="13. Ordena ascendentemente por precio\n";
         s14="14. Ordena descendentemente por precio\n";
         s15="15. Salir\n";
         ss= ss + s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 +s9 +s10 +s11+ s12+ s13+ s14+ s15;
         SOp= JOptionPane.showInputDialog(ss + "Teclee una opción"); 
         Op = Integer.parseInt(SOp);
                
        if(Op==1){Principal.OrdenarAscxCodAuto();
                  Ver_Registro();
                  Listar();}
        if(Op==2) { Principal.OrdenarDescxCodAuto();
                  Ver_Registro();
                  Listar();}                         
        if(Op==3){Principal.OrdAscXPlaca();
                  Ver_Registro();
                  Listar();
        }
        if(Op==4){Principal.OrdDescXPlaca();
                  Ver_Registro();
                  Listar();
        }
        if(Op==5){Principal.OrdAscXMarca();
                  Ver_Registro();
                  Listar();
        }
        if(Op==6){Principal.OrdDescXMarca();
                  Ver_Registro();
                  Listar();
        }
        if(Op==7){Principal.OrdAscXTipo();
                  Ver_Registro();
                  Listar();
        }
        if(Op==8){Principal.OrdDescXTipo();
                  Ver_Registro();
                  Listar();
        }
        if(Op==9){Principal.OrdAscXColor();
                  Ver_Registro();
                  Listar();
        }
        if(Op==10){Principal.OrdDescXColor();
                  Ver_Registro();
                  Listar();
        }
        if(Op==11){Principal.OrdAscXAño();
                  Ver_Registro();
                  Listar();
        }
        if(Op==12){Principal.OrdDescXAño();
                  Ver_Registro();
                  Listar();
        }
        if(Op==13){Principal.OrdenarAscxPrecio();
                   Ver_Registro();
                   Listar();
        } 
        if(Op==14){ Principal.OrdenarDescxPrecio();  
                  Ver_Registro();
                  Listar();
        }
     
        
     }//Fin del ciclo while  
    
    }//GEN-LAST:event_BTN_OrdenarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Autolote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Autolote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Autolote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Autolote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Autolote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Actualizar;
    private javax.swing.JButton BTN_Agregar;
    private javax.swing.JButton BTN_Anterior;
    private javax.swing.JButton BTN_Calcular;
    private javax.swing.JButton BTN_Datos;
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_Filtrar;
    private javax.swing.JButton BTN_Guarda_Archivo;
    private javax.swing.JButton BTN_Incializar;
    private javax.swing.JButton BTN_Leer_Archivo;
    private javax.swing.JButton BTN_Listar;
    private javax.swing.JButton BTN_Nuevo;
    private javax.swing.JButton BTN_Ordenar;
    private javax.swing.JButton BTN_Primero;
    private javax.swing.JButton BTN_Siguiente;
    private javax.swing.JButton BTN_Ver_Registro;
    private javax.swing.JButton BTN_Último;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
