/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoaps;

/**
 *
 * @author win
 */
public class Questao9 extends javax.swing.JFrame {

    /**
     * Creates new form Questao9
     */
    public Questao9() {
        initComponents();
    }
    
    public void nome(jogoaps.Modelbean usuario){
        nomeUsuario.setText(usuario.getNome());
    }

    public void pontos(jogoaps.Modelbean pontos){
        pontosUsuario.setText(Integer.toString(pontos.getPontos()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        nomeUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pontosUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 30));

        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 30));

        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, 30));

        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 30));

        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 30));

        nomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        nomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 50, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pontos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        pontosUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pontosUsuario.setForeground(new java.awt.Color(255, 255, 255));
        pontosUsuario.setText("0");
        getContentPane().add(pontosUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 20, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar_9-800x450px.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Modelbean usuario = new Modelbean();

        String nome = nomeUsuario.getText();
        int ponto = Integer.parseInt(pontosUsuario.getText());

        usuario.setPontos(ponto);
        usuario.setNome(nome);

        Questao10 frame = new Questao10();

        frame.nome(usuario);
        frame.pontos(usuario);
        frame.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Modelbean usuario = new Modelbean();

        String nome = nomeUsuario.getText();
        int ponto = Integer.parseInt(pontosUsuario.getText());

        usuario.setPontos(ponto);
        usuario.setNome(nome);

        Questao10 frame = new Questao10();

        frame.nome(usuario);
        frame.pontos(usuario);
        frame.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Modelbean usuario = new Modelbean();

        String nome = nomeUsuario.getText();
        int ponto = Integer.parseInt(pontosUsuario.getText());

        usuario.setPontos(ponto);
        usuario.setNome(nome);

        Questao10 frame = new Questao10();

        frame.nome(usuario);
        frame.pontos(usuario);
        frame.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Modelbean usuario = new Modelbean();

        String nome = nomeUsuario.getText();
        int ponto = Integer.parseInt(pontosUsuario.getText());

        usuario.setPontos(ponto);
        usuario.setNome(nome);

        Questao10 frame = new Questao10();

        frame.nome(usuario);
        frame.pontos(usuario);
        frame.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Modelbean usuario = new Modelbean();

        String nome = nomeUsuario.getText();
        int ponto = Integer.parseInt(pontosUsuario.getText());

        ponto = ponto + 1;

        usuario.setPontos(ponto);
        usuario.setNome(nome);

        Questao10 frame = new Questao10();

        frame.nome(usuario);
        frame.pontos(usuario);
        frame.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Questao9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questao9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questao9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questao9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questao9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JLabel pontosUsuario;
    // End of variables declaration//GEN-END:variables
}
