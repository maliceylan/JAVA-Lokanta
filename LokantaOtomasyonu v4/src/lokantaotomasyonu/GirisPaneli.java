/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lokantaotomasyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MCEYLAN
 */

public class GirisPaneli extends javax.swing.JFrame {

    /**
     * Creates new form GirisPaneli
     */
        String KullaniciAdi = "";
        String Sifre="";
    
    public GirisPaneli() {
        initComponents();
        
        
        
        
        lblYonKadi.setEnabled(false);
        lblYonSifre.setEnabled(false);
        lblYonetici.setEnabled(false);
        btnYonGiris.setEnabled(false);
        btnYonUnuttum.setEnabled(false);
        txtYonKadi.setEnabled(false);
        txtYonSifre.setEnabled(false);
        
        
        lblGarson.setEnabled(false);
        lblGarsonKadi.setEnabled(false);
        lblGarsonSifre.setEnabled(false);
        btnGarsonGiris.setEnabled(false);
        btnGarsonUnuttum.setEnabled(false);
        txtGarsonKadi.setEnabled(false);
        txtGarsonSifre.setEnabled(false);
        
        lblMutfak.setEnabled(false);
        lblMutfakKadi.setEnabled(false);
        lblMutfakSifre.setEnabled(false);
        btnMutfakGir.setEnabled(false);
        btnMutfakUnuttum.setEnabled(false);
        txtMutfakKadi.setEnabled(false);
        txtYonSifre.setEnabled(false);
        
        
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLokantaAdi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlYonetici = new javax.swing.JPanel();
        lblYonetici = new javax.swing.JLabel();
        lblYonKadi = new javax.swing.JLabel();
        txtYonKadi = new javax.swing.JTextField();
        lblYonSifre = new javax.swing.JLabel();
        btnYonGiris = new javax.swing.JButton();
        btnYonUnuttum = new javax.swing.JButton();
        txtYonSifre = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        pnlGarson = new javax.swing.JPanel();
        lblGarson = new javax.swing.JLabel();
        lblGarsonKadi = new javax.swing.JLabel();
        txtGarsonKadi = new javax.swing.JTextField();
        lblGarsonSifre = new javax.swing.JLabel();
        btnGarsonGiris = new javax.swing.JButton();
        btnGarsonUnuttum = new javax.swing.JButton();
        txtGarsonSifre = new javax.swing.JPasswordField();
        pnlMutfak = new javax.swing.JPanel();
        lblMutfak = new javax.swing.JLabel();
        lblMutfakKadi = new javax.swing.JLabel();
        txtMutfakKadi = new javax.swing.JTextField();
        lblMutfakSifre = new javax.swing.JLabel();
        btnMutfakGir = new javax.swing.JButton();
        btnMutfakUnuttum = new javax.swing.JButton();
        txtMutfakSifre = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lokanta Otomasyonu Giriş Paneli");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));

        pnlLokantaAdi.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lokantaotomasyonu/logo-istanbul-cafe-restaurant-2-86091c86462-fcmktb (Custom).jpg"))); // NOI18N

        javax.swing.GroupLayout pnlLokantaAdiLayout = new javax.swing.GroupLayout(pnlLokantaAdi);
        pnlLokantaAdi.setLayout(pnlLokantaAdiLayout);
        pnlLokantaAdiLayout.setHorizontalGroup(
            pnlLokantaAdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLokantaAdiLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlLokantaAdiLayout.setVerticalGroup(
            pnlLokantaAdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLokantaAdiLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlYonetici.setBackground(new java.awt.Color(0, 0, 0));
        pnlYonetici.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 255, 0)));
        pnlYonetici.setEnabled(false);
        pnlYonetici.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlYoneticiMouseEntered(evt);
            }
        });

        lblYonetici.setBackground(new java.awt.Color(255, 255, 255));
        lblYonetici.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblYonetici.setForeground(new java.awt.Color(255, 255, 0));
        lblYonetici.setText("Yönetici Giriş Paneli");

        lblYonKadi.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblYonKadi.setForeground(new java.awt.Color(255, 255, 0));
        lblYonKadi.setText("Kullanıcı Adı");

        lblYonSifre.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblYonSifre.setForeground(new java.awt.Color(255, 255, 0));
        lblYonSifre.setText("Şifre");

        btnYonGiris.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnYonGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lokantaotomasyonu/ikon/arrows.png"))); // NOI18N
        btnYonGiris.setText("Giriş Yap");
        btnYonGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYonGirisActionPerformed(evt);
            }
        });

        btnYonUnuttum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lokantaotomasyonu/ikon/question.png"))); // NOI18N
        btnYonUnuttum.setText("Şifremi Unuttum");
        btnYonUnuttum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYonUnuttumActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lokantaotomasyonu/ikon/people.png"))); // NOI18N
        jButton1.setText("Destek");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlYoneticiLayout = new javax.swing.GroupLayout(pnlYonetici);
        pnlYonetici.setLayout(pnlYoneticiLayout);
        pnlYoneticiLayout.setHorizontalGroup(
            pnlYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlYoneticiLayout.createSequentialGroup()
                .addGroup(pnlYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlYoneticiLayout.createSequentialGroup()
                        .addGroup(pnlYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlYoneticiLayout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(lblYonSifre))
                            .addGroup(pnlYoneticiLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(lblYonetici))
                            .addGroup(pnlYoneticiLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(pnlYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtYonKadi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnYonGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtYonSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlYoneticiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnYonUnuttum)))
                .addContainerGap())
            .addGroup(pnlYoneticiLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblYonKadi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlYoneticiLayout.setVerticalGroup(
            pnlYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlYoneticiLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblYonetici)
                .addGap(84, 84, 84)
                .addComponent(lblYonKadi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtYonKadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblYonSifre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtYonSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnYonGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(pnlYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnYonUnuttum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlGarson.setBackground(new java.awt.Color(0, 0, 0));
        pnlGarson.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 0, 0)));
        pnlGarson.setEnabled(false);
        pnlGarson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlGarsonMouseEntered(evt);
            }
        });

        lblGarson.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblGarson.setForeground(new java.awt.Color(255, 0, 0));
        lblGarson.setText("Garson Giriş Paneli");

        lblGarsonKadi.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblGarsonKadi.setForeground(new java.awt.Color(255, 0, 0));
        lblGarsonKadi.setText("Kullanıcı Adı");

        lblGarsonSifre.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblGarsonSifre.setForeground(new java.awt.Color(255, 0, 0));
        lblGarsonSifre.setText("Şifre");

        btnGarsonGiris.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGarsonGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lokantaotomasyonu/ikon/arrows.png"))); // NOI18N
        btnGarsonGiris.setText("Giriş Yap");
        btnGarsonGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGarsonGirisActionPerformed(evt);
            }
        });

        btnGarsonUnuttum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lokantaotomasyonu/ikon/question.png"))); // NOI18N
        btnGarsonUnuttum.setText("Şifremi Unuttum");
        btnGarsonUnuttum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGarsonUnuttumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGarsonLayout = new javax.swing.GroupLayout(pnlGarson);
        pnlGarson.setLayout(pnlGarsonLayout);
        pnlGarsonLayout.setHorizontalGroup(
            pnlGarsonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGarsonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlGarsonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGarsonLayout.createSequentialGroup()
                        .addComponent(btnGarsonUnuttum)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGarsonLayout.createSequentialGroup()
                        .addGroup(pnlGarsonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlGarsonLayout.createSequentialGroup()
                                .addGroup(pnlGarsonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlGarsonLayout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(lblGarsonSifre))
                                    .addGroup(pnlGarsonLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlGarsonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtGarsonKadi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnGarsonGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGarsonSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(28, 28, 28))
                            .addComponent(lblGarson, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(90, 90, 90))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGarsonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGarsonKadi)
                .addGap(151, 151, 151))
        );
        pnlGarsonLayout.setVerticalGroup(
            pnlGarsonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGarsonLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblGarson)
                .addGap(84, 84, 84)
                .addComponent(lblGarsonKadi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGarsonKadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGarsonSifre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGarsonSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGarsonGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnGarsonUnuttum)
                .addContainerGap())
        );

        pnlMutfak.setBackground(new java.awt.Color(0, 0, 0));
        pnlMutfak.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 255, 0)));
        pnlMutfak.setEnabled(false);
        pnlMutfak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMutfakMouseEntered(evt);
            }
        });

        lblMutfak.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblMutfak.setForeground(new java.awt.Color(0, 255, 0));
        lblMutfak.setText("Mutfak Giriş Paneli");

        lblMutfakKadi.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblMutfakKadi.setForeground(new java.awt.Color(0, 255, 0));
        lblMutfakKadi.setText("Kullanıcı Adı");

        lblMutfakSifre.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblMutfakSifre.setForeground(new java.awt.Color(0, 255, 0));
        lblMutfakSifre.setText("Şifre");

        btnMutfakGir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMutfakGir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lokantaotomasyonu/ikon/arrows.png"))); // NOI18N
        btnMutfakGir.setText("Giriş Yap");
        btnMutfakGir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMutfakGirActionPerformed(evt);
            }
        });

        btnMutfakUnuttum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lokantaotomasyonu/ikon/question.png"))); // NOI18N
        btnMutfakUnuttum.setText("Şifremi Unuttum");
        btnMutfakUnuttum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMutfakUnuttumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMutfakLayout = new javax.swing.GroupLayout(pnlMutfak);
        pnlMutfak.setLayout(pnlMutfakLayout);
        pnlMutfakLayout.setHorizontalGroup(
            pnlMutfakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMutfakLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(pnlMutfakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMutfakLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblMutfakSifre))
                    .addComponent(lblMutfak)
                    .addGroup(pnlMutfakLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnlMutfakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMutfakKadi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMutfakGir, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMutfakSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMutfakLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlMutfakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMutfakLayout.createSequentialGroup()
                        .addComponent(btnMutfakUnuttum)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMutfakLayout.createSequentialGroup()
                        .addComponent(lblMutfakKadi)
                        .addGap(152, 152, 152))))
        );
        pnlMutfakLayout.setVerticalGroup(
            pnlMutfakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMutfakLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblMutfak)
                .addGap(84, 84, 84)
                .addComponent(lblMutfakKadi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMutfakKadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMutfakSifre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMutfakSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMutfakGir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnMutfakUnuttum)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLokantaAdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlYonetici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlGarson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlMutfak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLokantaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlGarson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlYonetici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMutfak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlYoneticiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlYoneticiMouseEntered
        // TODO add your handling code here:
        
        
        lblYonKadi.setEnabled(true);
        lblYonSifre.setEnabled(true);
        lblYonetici.setEnabled(true);
        btnYonGiris.setEnabled(true);
        btnYonUnuttum.setEnabled(true);
        txtYonKadi.setEnabled(true);
        txtYonSifre.setEnabled(true);
        
        
        lblGarson.setEnabled(false);
        lblGarsonKadi.setEnabled(false);
        lblGarsonSifre.setEnabled(false);
        btnGarsonGiris.setEnabled(false);
        btnGarsonUnuttum.setEnabled(false);
        txtGarsonKadi.setEnabled(false);
        txtGarsonSifre.setEnabled(false);
        
        lblMutfak.setEnabled(false);
        lblMutfakKadi.setEnabled(false);
        lblMutfakSifre.setEnabled(false);
        btnMutfakGir.setEnabled(false);
        btnMutfakUnuttum.setEnabled(false);
        txtMutfakKadi.setEnabled(false);
        txtMutfakSifre.setEnabled(false);
    }//GEN-LAST:event_pnlYoneticiMouseEntered

    private void pnlGarsonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGarsonMouseEntered
        // TODO add your handling code here:
        
        lblYonKadi.setEnabled(false);
        lblYonSifre.setEnabled(false);
        lblYonetici.setEnabled(false);
        btnYonGiris.setEnabled(false);
        btnYonUnuttum.setEnabled(false);
        txtYonKadi.setEnabled(false);
        txtYonSifre.setEnabled(false);
        
        
        lblGarson.setEnabled(true);
        lblGarsonKadi.setEnabled(true);
        lblGarsonSifre.setEnabled(true);
        btnGarsonGiris.setEnabled(true);
        btnGarsonUnuttum.setEnabled(true);
        txtGarsonKadi.setEnabled(true);
        txtGarsonSifre.setEnabled(true);
        
        lblMutfak.setEnabled(false);
        lblMutfakKadi.setEnabled(false);
        lblMutfakSifre.setEnabled(false);
        btnMutfakGir.setEnabled(false);
        btnMutfakUnuttum.setEnabled(false);
        txtMutfakKadi.setEnabled(false);
        txtMutfakSifre.setEnabled(false);
    }//GEN-LAST:event_pnlGarsonMouseEntered

    private void pnlMutfakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMutfakMouseEntered
        // TODO add your handling code here:
        
        
        lblYonKadi.setEnabled(false);
        lblYonSifre.setEnabled(false);
        lblYonetici.setEnabled(false);
        btnYonGiris.setEnabled(false);
        btnYonUnuttum.setEnabled(false);
        txtYonKadi.setEnabled(false);
        txtYonSifre.setEnabled(false);
        
        
        lblGarson.setEnabled(false);
        lblGarsonKadi.setEnabled(false);
        lblGarsonSifre.setEnabled(false);
        btnGarsonGiris.setEnabled(false);
        btnGarsonUnuttum.setEnabled(false);
        txtGarsonKadi.setEnabled(false);
        txtGarsonSifre.setEnabled(false);
        
        lblMutfak.setEnabled(true);
        lblMutfakKadi.setEnabled(true);
        lblMutfakSifre.setEnabled(true);
        btnMutfakGir.setEnabled(true);
        btnMutfakUnuttum.setEnabled(true);
        txtMutfakKadi.setEnabled(true);
        txtMutfakSifre.setEnabled(true);
    }//GEN-LAST:event_pnlMutfakMouseEntered

    private void btnYonGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYonGirisActionPerformed
        // TODO add your handling code here:
        if(txtYonKadi.getText().length()>-1&&txtYonSifre.getText().length()>-1){
            if(txtYonKadi.getText().equals(KullaniciAdi)&&txtYonSifre.getText().equals(Sifre)){
                    java.awt.EventQueue.invokeLater(new Runnable() {
                       public void run() {
                        new YoneticiPaneli().setVisible(true);
                        }
                        });
                        GirisPaneli.this.setVisible(false);
            }
            else JOptionPane.showMessageDialog(null, "Giriş bilgileriniz hatalı !");
        }
        else JOptionPane.showMessageDialog(null, "Kullanıcı Adı ve Şifre en az 4 haneli olmalıdır !");
        
        
    }//GEN-LAST:event_btnYonGirisActionPerformed

    private void btnGarsonGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGarsonGirisActionPerformed
        // TODO add your handling code here:
        
        String garsonkadi="boş";
        String garsonsifre="boş";
        if(txtGarsonKadi.getText().length()>3&&txtGarsonSifre.getText().length()>3){
            ResultSet result;
            Connection connection = null;
            Statement statement ;
            
            try{
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost/lokantaotomasyon","root","1234");     
            statement=connection.createStatement();
            result=statement.executeQuery("Select * from giris_bilgileri WHERE ID = 1");
            
            while(result.next()){
                garsonkadi = result.getString("Kullanici_Adi");
                garsonsifre = result.getString("Sifre");
            }
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "VeriTabani Baglanti Hatasi"); 
            }
            
            if(txtGarsonKadi.getText().equals(garsonkadi)&&txtGarsonSifre.getText().equals(garsonsifre)){
                    java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                    new GarsonPaneli().setVisible(true);
                    }
                    });
                    GirisPaneli.this.setVisible(false);
            }
            else JOptionPane.showMessageDialog(null, "Giriş bilgileriniz hatalı !");
        }
        else JOptionPane.showMessageDialog(null, "Kullanıcı Adı ve Şifre en az 4 haneli olmalıdır !");
        
           
    }//GEN-LAST:event_btnGarsonGirisActionPerformed

    private void btnMutfakGirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMutfakGirActionPerformed
        // TODO add your handling code here:
        String mutfakkadi="boş";
        String mutfaksifre="boş";
        if(txtMutfakKadi.getText().length()>3&&txtMutfakSifre.getText().length()>3){
            ResultSet result;
            Connection connection = null;
            Statement statement ;
            
            try{
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost/lokantaotomasyon","root","1234");     
            statement=connection.createStatement();
            result=statement.executeQuery("Select * from giris_bilgileri WHERE ID = 2");
            
            while(result.next()){
                mutfakkadi = result.getString("Kullanici_Adi");
                mutfaksifre = result.getString("Sifre");
            }
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "VeriTabani Baglanti Hatasi"); 
            }
            
            if(txtMutfakKadi.getText().equals(mutfakkadi)&&txtMutfakSifre.getText().equals(mutfaksifre)){
                    java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                    new MutfakPaneli().setVisible(true);
                    }
                    });
                    GirisPaneli.this.setVisible(false);
            }
            else JOptionPane.showMessageDialog(null, "Giriş bilgileriniz hatalı !");
        }
        else JOptionPane.showMessageDialog(null, "Kullanıcı Adı ve Şifre en az 4 haneli olmalıdır !");
    }//GEN-LAST:event_btnMutfakGirActionPerformed

    private void btnYonUnuttumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYonUnuttumActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Satıcı firmanızla irtibata geçiniz !");
    }//GEN-LAST:event_btnYonUnuttumActionPerformed

    private void btnGarsonUnuttumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGarsonUnuttumActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Yöneticinizle irtibata geçiniz !");
    }//GEN-LAST:event_btnGarsonUnuttumActionPerformed

    private void btnMutfakUnuttumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMutfakUnuttumActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Yöneticinizle irtibata geçiniz !");
    }//GEN-LAST:event_btnMutfakUnuttumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Destek().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GirisPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisPaneli().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGarsonGiris;
    private javax.swing.JButton btnGarsonUnuttum;
    private javax.swing.JButton btnMutfakGir;
    private javax.swing.JButton btnMutfakUnuttum;
    private javax.swing.JButton btnYonGiris;
    private javax.swing.JButton btnYonUnuttum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblGarson;
    private javax.swing.JLabel lblGarsonKadi;
    private javax.swing.JLabel lblGarsonSifre;
    private javax.swing.JLabel lblMutfak;
    private javax.swing.JLabel lblMutfakKadi;
    private javax.swing.JLabel lblMutfakSifre;
    private javax.swing.JLabel lblYonKadi;
    private javax.swing.JLabel lblYonSifre;
    private javax.swing.JLabel lblYonetici;
    private javax.swing.JPanel pnlGarson;
    private javax.swing.JPanel pnlLokantaAdi;
    private javax.swing.JPanel pnlMutfak;
    private javax.swing.JPanel pnlYonetici;
    private javax.swing.JTextField txtGarsonKadi;
    private javax.swing.JPasswordField txtGarsonSifre;
    private javax.swing.JTextField txtMutfakKadi;
    private javax.swing.JPasswordField txtMutfakSifre;
    private javax.swing.JTextField txtYonKadi;
    private javax.swing.JPasswordField txtYonSifre;
    // End of variables declaration//GEN-END:variables
}
