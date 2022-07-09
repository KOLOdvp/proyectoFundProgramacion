/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete;

/**
 *
 * @author Jonat
 */
public class programa extends javax.swing.JFrame {
    // contador es la Cantidad de passajeros
    public static int contador=0;
    // resultado es el total a pagar
    public static float resultado=0f; 
    // asumiendo que el precio del pasaje es estatico
    static final float pasajeEstandar=1.5f;
    /**
     * Creates new form programa
     */
    public programa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        click2 = new javax.swing.JButton();
        click1 = new javax.swing.JButton();
        resultadodelpago = new javax.swing.JLabel();
        resultadodelpago1 = new javax.swing.JLabel();
        cantidaddepasajeros1 = new javax.swing.JLabel();
        cancelarpaga = new javax.swing.JButton();
        confirmarPaga = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        click2.setBackground(new java.awt.Color(178, 203, 216));
        click2.setFont(new java.awt.Font("sansserif", 3, 48)); // NOI18N
        click2.setForeground(new java.awt.Color(255, 255, 255));
        click2.setText("-");
        click2.setToolTipText("");
        click2.setBorder(null);
        click2.setBorderPainted(false);
        click2.setContentAreaFilled(false);
        click2.setVerifyInputWhenFocusTarget(false);
        click2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                click2ActionPerformed(evt);
            }
        });
        getContentPane().add(click2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 130, 140));

        click1.setBackground(new java.awt.Color(178, 203, 216));
        click1.setFont(new java.awt.Font("sansserif", 3, 48)); // NOI18N
        click1.setForeground(new java.awt.Color(255, 255, 255));
        click1.setText("+");
        click1.setToolTipText("");
        click1.setBorder(null);
        click1.setBorderPainted(false);
        click1.setContentAreaFilled(false);
        click1.setVerifyInputWhenFocusTarget(false);
        click1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                click1ActionPerformed(evt);
            }
        });
        getContentPane().add(click1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 130, 140));

        resultadodelpago.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        resultadodelpago.setForeground(new java.awt.Color(255, 255, 255));
        resultadodelpago.setText("0");
        getContentPane().add(resultadodelpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 190, 70));

        resultadodelpago1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        resultadodelpago1.setForeground(new java.awt.Color(255, 255, 255));
        resultadodelpago1.setText("S/");
        getContentPane().add(resultadodelpago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 40, 70));

        cantidaddepasajeros1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        cantidaddepasajeros1.setForeground(new java.awt.Color(255, 255, 255));
        cantidaddepasajeros1.setText("0");
        getContentPane().add(cantidaddepasajeros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 140, 70));

        cancelarpaga.setBackground(new java.awt.Color(216, 178, 178));
        cancelarpaga.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        cancelarpaga.setForeground(new java.awt.Color(255, 225, 225));
        cancelarpaga.setText("Cancelar");
        cancelarpaga.setBorder(null);
        cancelarpaga.setBorderPainted(false);
        cancelarpaga.setContentAreaFilled(false);
        cancelarpaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarpagaActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarpaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 514, 260, 60));

        confirmarPaga.setBackground(new java.awt.Color(178, 216, 193));
        confirmarPaga.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        confirmarPaga.setForeground(new java.awt.Color(255, 255, 255));
        confirmarPaga.setText("Continuar");
        confirmarPaga.setBorder(null);
        confirmarPaga.setBorderPainted(false);
        confirmarPaga.setContentAreaFilled(false);
        confirmarPaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarPagaActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarPaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 514, 260, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/unknown.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshInterface(){
        // convierte las variables numero y resultado a string y lo refresca la interfaz
        String numero = String.valueOf(contador);
        cantidaddepasajeros1.setText(numero);
        String resultadoString = Float.toString(resultado);
       resultadodelpago.setText(resultadoString);
    }
    
    private void click2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_click2ActionPerformed
        // Evento al presionar el Boton de menos -
        // el condicional evita numeros negativos
        if (contador!=0){contador = contador - 1;}
        resultado = contador * pasajeEstandar;
        refreshInterface();
    }//GEN-LAST:event_click2ActionPerformed

    private void click1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_click1ActionPerformed
        // Evento al presionar el Boton de mas +
        contador = contador + 1;
        resultado = contador * pasajeEstandar;
        refreshInterface();
    }//GEN-LAST:event_click1ActionPerformed

    private void confirmarPagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarPagaActionPerformed
        this.setVisible(false);
        panel2 c= new panel2();
        c.setVisible(true);
        String numero = String.valueOf(contador);
        panel2.txtrecibi.setText(numero);
        String resultadoString = Float.toString(resultado);
        panel2.txtrecibi2.setText(resultadoString);
        //panel2.txtrecibi.setText(cantidaddepasajeros1.getText());
        //panel2.txtrecibi2.setText(resultadodelpago.getText());
    }//GEN-LAST:event_confirmarPagaActionPerformed

    private void cancelarpagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarpagaActionPerformed
        // reiniciar los valores
        contador = 0;
        resultado = 0f;
        refreshInterface();
    }//GEN-LAST:event_cancelarpagaActionPerformed

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
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarpaga;
    public static javax.swing.JLabel cantidaddepasajeros1;
    private javax.swing.JButton click1;
    private javax.swing.JButton click2;
    private javax.swing.JButton confirmarPaga;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel resultadodelpago;
    private javax.swing.JLabel resultadodelpago1;
    // End of variables declaration//GEN-END:variables
}
