// file này không cần thiết, đây là ý tưởng ban đầu cho giao diện
package view;

import UI.panels.homePanel;
import UI.panels.chartPanel;
import UI.panels.rankPanel;
import UI.panels.settingPanel;
import UI.panels.infoPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Account;


public class User_view extends javax.swing.JFrame {
    Account acc;
    CardLayout cardLayout = new CardLayout();                                 
    
    public User_view( Account acc) throws SQLException, IOException {
        initComponents();
        this.acc = acc;
        
//        panel_main.setLayout(cardLayout);
//        homePanel pnHome = new homePanel( acc);
//        panel_main.add( pnHome, "Panel1");
//        infoPanel pnInfor = new infoPanel( acc);
//        panel_main.add( pnInfor, "Panel2");
//        rankPanel pnRank = new rankPanel(acc);
//        panel_main.add( pnRank, "Panel3");
////        studyPanel pnStudy = new studyPanel(acc, this);
////        panel_main.add(pnStudy, "Panel4");
//        chartPanel pnChart = new chartPanel(acc);
//        panel_main.add(pnChart, "Panel5");
//        settingPanel pnSetting = new settingPanel(acc);
//        panel_main.add(pnSetting, "Panel6");
        
        this.setLocationRelativeTo(null);
    }

    public void setbg(){
        lb_information.setBackground(new Color(255,255,255));
        lb_information.setForeground(Color.black);
        lb_barchart.setBackground(new Color(255,255,255));
        lb_barchart.setForeground(Color.black);
        lb_homePage.setBackground(new Color(255,255,255));
        lb_homePage.setForeground(Color.black);
        lb_ranking.setBackground(new Color(255,255,255));
        lb_ranking.setForeground(Color.black);
        lb_study.setBackground(new Color(255,255,255));
        lb_study.setForeground(Color.black);
        lb_setting.setBackground(new Color(255,255,255));
        lb_setting.setForeground(Color.black);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Nen = new javax.swing.JPanel();
        panel_menu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lb_homePage = new javax.swing.JLabel();
        lb_information = new javax.swing.JLabel();
        lb_ranking = new javax.swing.JLabel();
        lb_setting = new model.CustomLabel();
        lb_barchart = new model.CustomLabel();
        lb_study = new model.CustomLabel();
        btn_exit = new javax.swing.JButton();
        logo = new model.CustomLabel();
        panel_main = new javax.swing.JPanel();
        panel_bar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_Nen.setBackground(new java.awt.Color(255, 255, 255));
        panel_Nen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_Nen.setMaximumSize(new java.awt.Dimension(0, 0));

        panel_menu.setBackground(new java.awt.Color(255, 255, 255));
        panel_menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setOpaque(false);

        lb_homePage.setBackground(new java.awt.Color(255, 255, 255));
        lb_homePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house-35.png"))); // NOI18N
        lb_homePage.setText("home page");
        lb_homePage.setOpaque(true);
        lb_homePage.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lb_homePageComponentAdded(evt);
            }
        });
        lb_homePage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lb_homePageFocusGained(evt);
            }
        });
        lb_homePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_homePageMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_homePageMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_homePageMouseReleased(evt);
            }
        });

        lb_information.setBackground(new java.awt.Color(255, 255, 255));
        lb_information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profiles-35.png"))); // NOI18N
        lb_information.setText("information");
        lb_information.setOpaque(true);
        lb_information.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_informationMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_informationMousePressed(evt);
            }
        });

        lb_ranking.setBackground(new java.awt.Color(255, 255, 255));
        lb_ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/leaderboard-35.png"))); // NOI18N
        lb_ranking.setText("ranking");
        lb_ranking.setOpaque(true);
        lb_ranking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_rankingMouseClicked(evt);
            }
        });

        lb_setting.setBackground(new java.awt.Color(255, 255, 255));
        lb_setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gear-35.png"))); // NOI18N
        lb_setting.setText("setting");
        lb_setting.setOpaque(true);
        lb_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_settingMouseClicked(evt);
            }
        });

        lb_barchart.setBackground(new java.awt.Color(255, 255, 255));
        lb_barchart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bar-chart-35.png"))); // NOI18N
        lb_barchart.setText("chart bar");
        lb_barchart.setOpaque(true);
        lb_barchart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_barchartMouseClicked(evt);
            }
        });

        lb_study.setBackground(new java.awt.Color(255, 255, 255));
        lb_study.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/study-35.png"))); // NOI18N
        lb_study.setText("study");
        lb_study.setOpaque(true);
        lb_study.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_studyMouseClicked(evt);
            }
        });

        btn_exit.setText("exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_barchart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_homePage, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_information, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lb_study, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lb_homePage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_information)
                .addGap(12, 12, 12)
                .addComponent(lb_ranking)
                .addGap(18, 18, 18)
                .addComponent(lb_study, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(lb_barchart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_setting, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addGap(32, 32, 32))
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/whale-50.png"))); // NOI18N

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_main.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_mainLayout = new javax.swing.GroupLayout(panel_main);
        panel_main.setLayout(panel_mainLayout);
        panel_mainLayout.setHorizontalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
        );
        panel_mainLayout.setVerticalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        panel_bar.setBackground(new java.awt.Color(255, 255, 255));
        panel_bar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel_barLayout = new javax.swing.GroupLayout(panel_bar);
        panel_bar.setLayout(panel_barLayout);
        panel_barLayout.setHorizontalGroup(
            panel_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_barLayout.setVerticalGroup(
            panel_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_NenLayout = new javax.swing.GroupLayout(panel_Nen);
        panel_Nen.setLayout(panel_NenLayout);
        panel_NenLayout.setHorizontalGroup(
            panel_NenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_NenLayout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_NenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_NenLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panel_NenLayout.setVerticalGroup(
            panel_NenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_NenLayout.createSequentialGroup()
                .addComponent(panel_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Nen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Nen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_homePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_homePageMouseClicked
        cardLayout.show(panel_main, "Panel1");
        setbg();
        lb_homePage.setBackground(new Color(206,206,206));
        lb_homePage.setForeground(Color.white);
    }//GEN-LAST:event_lb_homePageMouseClicked

    private void lb_homePageComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lb_homePageComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_homePageComponentAdded

    private void lb_homePageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lb_homePageFocusGained
        
    }//GEN-LAST:event_lb_homePageFocusGained

    private void lb_homePageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_homePageMousePressed
        lb_homePage.setBackground(new Color(254,254,254));
    }//GEN-LAST:event_lb_homePageMousePressed

    private void lb_informationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_informationMousePressed
        
    }//GEN-LAST:event_lb_informationMousePressed

    private void lb_homePageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_homePageMouseReleased
        lb_homePage.setBackground(new Color(214,217,223));
    }//GEN-LAST:event_lb_homePageMouseReleased

    private void lb_informationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_informationMouseClicked
        cardLayout.show(panel_main, "Panel2");
        setbg();
        lb_information.setBackground(new Color(206,206,206));
        lb_information.setForeground(Color.white);
    }//GEN-LAST:event_lb_informationMouseClicked

    private void lb_rankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_rankingMouseClicked
        cardLayout.show(panel_main, "Panel3");
        setbg();
        lb_ranking.setBackground(new Color(206,206,206));
        lb_ranking.setForeground(Color.white);
    }//GEN-LAST:event_lb_rankingMouseClicked

    private void lb_studyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_studyMouseClicked
        cardLayout.show(panel_main, "Panel4");
        setbg();
        lb_study.setBackground(new Color(206,206,206));
        lb_study.setForeground(Color.white);
    }//GEN-LAST:event_lb_studyMouseClicked

    private void lb_barchartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_barchartMouseClicked
        cardLayout.show(panel_main, "Panel5");
        setbg();
        lb_barchart.setBackground(new Color(206,206,206));
        lb_barchart.setForeground(Color.white);
    }//GEN-LAST:event_lb_barchartMouseClicked

    private void lb_settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_settingMouseClicked
        cardLayout.show(panel_main, "Panel6");
        setbg();
        lb_setting.setBackground(new Color(206,206,206));
        lb_setting.setForeground(Color.white);
    }//GEN-LAST:event_lb_settingMouseClicked

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        log_in dangnhap = new log_in();
        dangnhap.setLocationRelativeTo(null);
        dangnhap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dangnhap.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(User_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Account sv = new Account("public static", "jdfk", "voidmain@gmail.com");
                try {
                    new User_view( sv).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(User_view.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(User_view.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JPanel jPanel1;
    private model.CustomLabel lb_barchart;
    private javax.swing.JLabel lb_homePage;
    private javax.swing.JLabel lb_information;
    private javax.swing.JLabel lb_ranking;
    private model.CustomLabel lb_setting;
    private model.CustomLabel lb_study;
    private model.CustomLabel logo;
    private javax.swing.JPanel panel_Nen;
    private javax.swing.JPanel panel_bar;
    private javax.swing.JPanel panel_main;
    private javax.swing.JPanel panel_menu;
    // End of variables declaration//GEN-END:variables

    
}
