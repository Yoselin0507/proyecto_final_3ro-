/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author yoselin
 */
public class venta extends javax.swing.JFrame {

    /**
     * Creates new form venta
     */
    public venta() {
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

        Jl_codigo_producto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Jl_cantidad = new javax.swing.JLabel();
        Jl_precio = new javax.swing.JLabel();
        Jtf_codigo_producto = new javax.swing.JTextField();
        Jtf_cantidad = new javax.swing.JTextField();
        Jtf_precio = new javax.swing.JTextField();
        Jb_venta = new javax.swing.JButton();
        Jl_total = new javax.swing.JLabel();
        Jtf_total = new javax.swing.JTextField();
        Jb_salir = new javax.swing.JButton();
        Jb_nueva_venta = new javax.swing.JButton();
        Jl_nombre = new javax.swing.JLabel();
        Jtf_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jl_codigo_producto.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("CODIGO");

        Jl_cantidad.setText("CANTIDAD");

        Jl_precio.setText("PRECIO");

        Jb_venta.setText("VENTA");
        Jb_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_ventaActionPerformed(evt);
            }
        });

        Jl_total.setText("TOTAL");

        Jb_salir.setText("SALIR");
        Jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_salirActionPerformed(evt);
            }
        });

        Jb_nueva_venta.setText("NUEVA VENTA");
        Jb_nueva_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_nueva_ventaActionPerformed(evt);
            }
        });

        Jl_nombre.setText("NOMBRE");

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel2.setText("VENTA");

        javax.swing.GroupLayout Jl_codigo_productoLayout = new javax.swing.GroupLayout(Jl_codigo_producto);
        Jl_codigo_producto.setLayout(Jl_codigo_productoLayout);
        Jl_codigo_productoLayout.setHorizontalGroup(
            Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jl_codigo_productoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jl_codigo_productoLayout.createSequentialGroup()
                        .addGroup(Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jl_cantidad)
                            .addComponent(Jl_precio)
                            .addComponent(Jl_total)
                            .addComponent(Jl_nombre))
                        .addGap(39, 39, 39)
                        .addGroup(Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jtf_cantidad)
                            .addComponent(Jtf_precio)
                            .addComponent(Jtf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Jl_codigo_productoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Jl_codigo_productoLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jl_codigo_productoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Jtf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(Jtf_codigo_producto))
                                .addGap(68, 68, 68))))))
            .addGroup(Jl_codigo_productoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Jb_nueva_venta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jb_venta)
                .addGap(26, 26, 26)
                .addComponent(Jb_salir)
                .addGap(31, 31, 31))
        );
        Jl_codigo_productoLayout.setVerticalGroup(
            Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jl_codigo_productoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Jtf_codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl_nombre)
                    .addComponent(Jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl_cantidad)
                    .addComponent(Jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl_precio)
                    .addComponent(Jtf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl_total)
                    .addComponent(Jtf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(Jl_codigo_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jb_venta)
                    .addComponent(Jb_salir)
                    .addComponent(Jb_nueva_venta))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jl_codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jl_codigo_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jb_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_ventaActionPerformed
        // TODO add your handling code here:
        float cantidad = 0.0f;
        float precio = 0.0f;
        cantidad = Float.parseFloat(this.Jtf_cantidad.getText());
        precio = Float.parseFloat(this.Jtf_precio.getText());
        float total = cantidad * precio;
        this.Jtf_total.setText(String.valueOf(total));
    }//GEN-LAST:event_Jb_ventaActionPerformed

    private void Jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_salirActionPerformed
        // TODO add your handling code here:
        inicio inicio=new inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Jb_salirActionPerformed

    private void Jb_nueva_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_nueva_ventaActionPerformed
        // TODO add your handling code here:
        Jtf_codigo_producto.setText("");
        Jtf_nombre.setText("");
        Jtf_cantidad.setText("");
        Jtf_precio.setText("");
        Jtf_total.setText("");
    }//GEN-LAST:event_Jb_nueva_ventaActionPerformed

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
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jb_nueva_venta;
    private javax.swing.JButton Jb_salir;
    private javax.swing.JButton Jb_venta;
    private javax.swing.JLabel Jl_cantidad;
    private javax.swing.JPanel Jl_codigo_producto;
    private javax.swing.JLabel Jl_nombre;
    private javax.swing.JLabel Jl_precio;
    private javax.swing.JLabel Jl_total;
    private javax.swing.JTextField Jtf_cantidad;
    private javax.swing.JTextField Jtf_codigo_producto;
    private javax.swing.JTextField Jtf_nombre;
    private javax.swing.JTextField Jtf_precio;
    private javax.swing.JTextField Jtf_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
