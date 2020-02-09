
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

public class Index1 extends javax.swing.JFrame {
    JFileChooser archivo;
    JEditorPane panelHTML = new JEditorPane();    
    JScrollPane scrollHTML = new JScrollPane(panelHTML);
    String rutaManualTecnico = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Manuales\\tecnico.pdf";;
    String rutaManualUsuario = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Manuales\\de usuario.pdf";  
    String rutaWeb = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\Web.html";
    String rutaToken = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\Token.html";
    String rutaErrorLEX = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\ErroresLexicos.html";
    String rutaErrorSIN = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\ErroresSintacticos.html";
    String rutaImagen = "/Proyecto1/fondo.jpg";
  
    public Index1() {
        initComponents();        
        this.setLocation(200, 50);
        limpiar();
        imprimirImagen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_fondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[Compi1] Proyecto 1");
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N

        javax.swing.GroupLayout jP_fondoLayout = new javax.swing.GroupLayout(jP_fondo);
        jP_fondo.setLayout(jP_fondoLayout);
        jP_fondoLayout.setHorizontalGroup(
            jP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 932, Short.MAX_VALUE)
        );
        jP_fondoLayout.setVerticalGroup(
            jP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(Index1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Index1().setVisible(true);                
            }            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jP_fondo;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        panelHTML.setText("");
    }
    
       
    public class Imagen extends javax.swing.JPanel {
        int alto = 2500;
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
