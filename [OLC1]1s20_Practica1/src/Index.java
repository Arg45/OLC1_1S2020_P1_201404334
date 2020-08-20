
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author argue
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    
    JFileChooser archivo;    
     
    String rutaManualTecnico = "D:\\Trabajos\\U\\USAC\\Cursos\\13vo Semestre\\Compi1\\OLC1_1S2020_P1_201404334\\[OLC1]1s20_Practica1\\Manuales\\tecnico.docx";;
    String rutaManualUsuario = "D:\\Trabajos\\U\\USAC\\Cursos\\13vo Semestre\\Compi1\\OLC1_1S2020_P1_201404334\\[OLC1]1s20_Practica1\\Manuales\\de usuario.docx";
    //String rutaManualTecnico = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Manuales\\tecnico.pdf";;
    //String rutaManualUsuario = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Manuales\\de usuario.pdf";
    
    String rutaWeb = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\Web.html";
    String rutaToken = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\Token.html";
    String rutaErrorLEX = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\ErroresLexicos.html";
    String rutaErrorSIN = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\ErroresSintacticos.html";
    String rutaImagen = "/Practica1/fondo.jpg";
    
    public Index() {
        initComponents();
        //imprimirImagen();
        this.setLocation(200, 50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_entrada = new javax.swing.JTextArea();
        btt_analizar = new javax.swing.JButton();
        btt_automata = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_Archivo = new javax.swing.JMenu();
        menuItem_Abrir = new javax.swing.JMenuItem();
        menuItem_Guardar = new javax.swing.JMenuItem();
        menuItem_guardarComo = new javax.swing.JMenuItem();
        menuItem_xml = new javax.swing.JMenuItem();
        menu_Ayuda = new javax.swing.JMenu();
        menuItem_Usuario = new javax.swing.JMenuItem();
        menuItem_Tecnico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jP_fondo.setBackground(new java.awt.Color(102, 102, 255));

        txt_entrada.setColumns(20);
        txt_entrada.setRows(5);
        jScrollPane1.setViewportView(txt_entrada);

        btt_analizar.setText("Analizar");

        btt_automata.setText("Generar automata");

        javax.swing.GroupLayout jP_fondoLayout = new javax.swing.GroupLayout(jP_fondo);
        jP_fondo.setLayout(jP_fondoLayout);
        jP_fondoLayout.setHorizontalGroup(
            jP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jP_fondoLayout.createSequentialGroup()
                        .addComponent(btt_analizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btt_automata)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_fondoLayout.setVerticalGroup(
            jP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt_analizar)
                    .addComponent(btt_automata))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        menu_Archivo.setText("Archivo");

        menuItem_Abrir.setText("Abrir");
        menuItem_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_AbrirActionPerformed(evt);
            }
        });
        menu_Archivo.add(menuItem_Abrir);

        menuItem_Guardar.setText("Guardar");
        menuItem_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_GuardarActionPerformed(evt);
            }
        });
        menu_Archivo.add(menuItem_Guardar);

        menuItem_guardarComo.setText("Guardar Como");
        menuItem_guardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_guardarComoActionPerformed(evt);
            }
        });
        menu_Archivo.add(menuItem_guardarComo);
        menuItem_guardarComo.getAccessibleContext().setAccessibleName("");

        menuItem_xml.setText("Generar XML");
        menuItem_xml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_xmlActionPerformed(evt);
            }
        });
        menu_Archivo.add(menuItem_xml);

        jMenuBar1.add(menu_Archivo);

        menu_Ayuda.setText("Ayuda");

        menuItem_Usuario.setText("Manual de usuario");
        menuItem_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_UsuarioActionPerformed(evt);
            }
        });
        menu_Ayuda.add(menuItem_Usuario);

        menuItem_Tecnico.setText("Manual tecnico");
        menuItem_Tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_TecnicoActionPerformed(evt);
            }
        });
        menu_Ayuda.add(menuItem_Tecnico);

        jMenuBar1.add(menu_Ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_AbrirActionPerformed
        abrir();
    }//GEN-LAST:event_menuItem_AbrirActionPerformed
    private void menuItem_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_GuardarActionPerformed
        if (archivo==null) {
            JOptionPane.showMessageDialog(null, "No existe un archivo abierto", "ADVERTENCIA",JOptionPane.ERROR_MESSAGE);
        }else{
            guardarComo();
        }
    }//GEN-LAST:event_menuItem_GuardarActionPerformed
    private void menuItem_guardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_guardarComoActionPerformed
        guardarComo();
    }//GEN-LAST:event_menuItem_guardarComoActionPerformed
    private void menuItem_xmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_xmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItem_xmlActionPerformed
    private void menuItem_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_UsuarioActionPerformed
        manuales(rutaManualUsuario);
    }//GEN-LAST:event_menuItem_UsuarioActionPerformed
    private void menuItem_TecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_TecnicoActionPerformed
        manuales(rutaManualTecnico);
    }//GEN-LAST:event_menuItem_TecnicoActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_analizar;
    private javax.swing.JButton btt_automata;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jP_fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuItem_Abrir;
    private javax.swing.JMenuItem menuItem_Guardar;
    private javax.swing.JMenuItem menuItem_Tecnico;
    private javax.swing.JMenuItem menuItem_Usuario;
    private javax.swing.JMenuItem menuItem_guardarComo;
    private javax.swing.JMenuItem menuItem_xml;
    private javax.swing.JMenu menu_Archivo;
    private javax.swing.JMenu menu_Ayuda;
    private javax.swing.JTextArea txt_entrada;
    // End of variables declaration//GEN-END:variables

    private void guardar(){
        try {
            File archivo_nuevo = archivo.getSelectedFile();
            FileNameExtensionFilter filtroidm = new FileNameExtensionFilter("*.er","er");
            if(filtroidm.getExtensions().toString()=="er"){
                System.out.println("si es el tipo de archivo");
            }
            System.out.println("se supone que verifico tipos");
            if(archivo_nuevo !=null){
                FileWriter guardar = new FileWriter(archivo_nuevo + ".er");
                guardar.write(txt_entrada.getText());
                guardar.close();
                JOptionPane.showMessageDialog(null,"El archivo se guardo con éxito", "Información",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(IOException ex)  {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el archivo", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }
    private void guardarComo(){
        try{
            archivo = new JFileChooser();
            archivo.showSaveDialog(this);
            File archivo_nuevo = archivo.getSelectedFile();
            if(archivo_nuevo !=null){
                try (FileWriter guardar = new FileWriter(archivo_nuevo+".er")) {
                    guardar.write(txt_entrada.getText());                
                    JOptionPane.showMessageDialog(null,"El archivo se guardo con éxito", "Información",JOptionPane.INFORMATION_MESSAGE);
                }
            }                
        } catch(IOException ex)  {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el archivo", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }
    private void abrir(){
        String letras = "";
        String aux;
        try {
            archivo = new JFileChooser(); 
            archivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            FileNameExtensionFilter filtroidm = new FileNameExtensionFilter("*.er","er");
            archivo.setFileFilter(filtroidm); 
            archivo.showOpenDialog(this);
            File abrir_archivo = archivo.getSelectedFile();  
            if (abrir_archivo!=null) {
                FileReader archivos = new FileReader(abrir_archivo);
                try (BufferedReader lee = new BufferedReader(archivos)) {
                    while((aux=lee.readLine())!=null){
                        letras += aux+ "\n";
                    }
                }
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo.");
        }
        txt_entrada.setText(letras);
    }
    
    private void manuales(String Manual){
        try {
            File path = new File (Manual);
            Desktop.getDesktop().open(path);
        }catch (IOException ex) {
            System.out.println("No se pudo abrir el manual. "+ex);
        }
    }

public class Imagen extends javax.swing.JPanel {
        int alto = 500;
        int ancho = 800;
        public Imagen() {
                this.setSize(alto,ancho);
        }
        @Override
        public void paint(Graphics g) {
            ImageIcon Img = new ImageIcon(getClass().getResource(rutaImagen));
            g.drawImage(Img.getImage(), 0, 0, alto, ancho, null);
            setOpaque(false);
            super.paintComponent(g);
        }
    }
private void imprimirImagen(){
    Imagen Imagen = new Imagen();
    jP_fondo.add(Imagen);
    jP_fondo.repaint();
}
public ImageIcon redimensionarImagen(int x, String url) {
        ImageIcon a = new ImageIcon(url);
        ImageIcon b = new ImageIcon(a.getImage().getScaledInstance(x, -1, Image.SCALE_DEFAULT));
        return b;
    }

}
