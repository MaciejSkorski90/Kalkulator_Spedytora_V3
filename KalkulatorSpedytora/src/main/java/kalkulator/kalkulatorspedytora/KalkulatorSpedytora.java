/*
* Kalkulator Spedytora powstał w celu kalkulacji rentowności przewozów zagranicznych.  

* KalkulatorSpedytora
* Copyright © 2019. 
* Orsulit sp. z o.o.
* NIP: 5272807305
* All rights reserved.

* This End-User License Agreement ("EULA") is a legal agreement between you (either an individual or a single entity) and the mentioned owner of this Software for the software product identified above ("SOFTWARE PRODUCT"). By installing, copying, or otherwise using the SOFTWARE PRODUCT, you agree to be bound by the terms of this EULA. If you do not agree to the terms of this EULA, do not install or use the SOFTWARE PRODUCT.

* SOFTWARE PRODUCT LICENSE
* The SOFTWARE PRODUCT is protected by copyright laws and international copyright treaties, as well as other intellectual property laws and treaties. The SOFTWARE PRODUCT is licensed, not sold.

* 1. The SOFTWARE PRODUCT is payware. You are expressly prohibited from modifying, merging, selling, or leasing in any matter, the SOFTWARE PRODUCT or any portion thereof

* 2. GRANT OF LICENSE. This EULA grants you the following rights: Installation and Use. You may install and use an only one of copies of the SOFTWARE PRODUCT.

* Distribution. You can’t distribute copies of the SOFTWARE PRODUCT.

* 3. DESCRIPTION OF OTHER RIGHTS AND LIMITATIONS.

* Limitations on Reverse Engineering, Decompilation, and Disassembly. You may not reverse engineer, decompile, or disassemble the SOFTWARE PRODUCT, except and only to the extent that such activity is expressly permitted by applicable law notwithstanding this limitation.

* Separation of Components.
* The SOFTWARE PRODUCT is licensed as a single product. Its component parts may not be separated for use on more than one computer.

* Software Transfer.
* You may permanently transfer all of your rights under this EULA, provided the recipient agrees to the terms of this EULA.

* Termination.
* Without prejudice to any other rights, the owner of this Software may terminate this EULA if you fail to comply with the terms and conditions of this EULA. In such event, you must destroy all copies of the SOFTWARE PRODUCT and all of its component parts. 

* 4. COPYRIGHT.
* All title and copyrights in and to the SOFTWARE PRODUCT(including but not limited to any images, photographs, animations, video, audio, music, text, and "applets" incorporated into the SOFTWARE PRODUCT), the accompanying printed materials, and any copies of the SOFTWARE PRODUCT are owned by the owner of this Software. The SOFTWARE PRODUCT is protected by copyright laws and international treaty provisions. Therefore, you must treat the SOFTWARE PRODUCT like any other copyrighted material except that you may install the SOFTWARE PRODUCT on a single computer provided you keep the original solely for backup or archival purposes.

* LIMITED WARRANTY

* NO WARRANTIES.
* The owner of this Software expressly disclaims any warranty for the SOFTWARE PRODUCT. The SOFTWARE PRODUCT and any related documentation is provided "as is" without warranty of any kind, either express or implied, including, without limitation, the implied warranties or merchantability, fitness for a particular purpose, or noninfringement. The entire risk arising out of use or performance of the SOFTWARE PRODUCT remains with you.

* NO LIABILITY FOR DAMAGES.
* In no event shall the owner of this Software be liable for any damages whatsoever (including, without limitation, damages for loss of business profits, business interruption, loss of business information, or any other pecuniary loss) arising out of the use of or inability to use this product, even if the owner of this Software has been advised of the possibility of such damages. Because some states/jurisdictions do not allow the exclusion or limitation of liability for consequential or incidental damages, the above limitation may not apply to you.

*/

package kalkulator.kalkulatorspedytora;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * @author Maciej Skórski
 * Copyright © 2019 Orsulit | Wykonanie: Orsulit sp. z o.o. NIP: 5272807305
 */

public class KalkulatorSpedytora extends javax.swing.JFrame implements WindowListener {

    /**
     * Creates new form KalkulatorSpedytora
     */
    public KalkulatorSpedytora() {
        
        initComponents();
       
       // setIcon();     
        
        this.addWindowListener(this);
    }
    
     /* private void setIcon() 
      {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png")));
      }*/
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LewaStroona = new javax.swing.JPanel();
        Ustawienia = new javax.swing.JButton();
        Tekst2 = new javax.swing.JLabel();
        Pole2 = new javax.swing.JTextField();
        Tekst3 = new javax.swing.JLabel();
        Pole3 = new javax.swing.JTextField();
        OBLICZ = new javax.swing.JButton();
        Kopiuj = new javax.swing.JButton();
        Tekst1 = new javax.swing.JLabel();
        Tekst1_1_1 = new javax.swing.JLabel();
        PrawaStrona = new javax.swing.JPanel();
        Tekst4 = new javax.swing.JLabel();
        Tekst4_2 = new javax.swing.JLabel();
        Tekst5 = new javax.swing.JLabel();
        Tekst5_2 = new javax.swing.JLabel();
        Tekst6 = new javax.swing.JLabel();
        Tekst6_2 = new javax.swing.JLabel();
        Tekst7 = new javax.swing.JLabel();
        Tekst7_2 = new javax.swing.JLabel();
        Tekst8 = new javax.swing.JLabel();
        Tekst8_2 = new javax.swing.JLabel();
        Tekst9 = new javax.swing.JLabel();
        Tekst9_2 = new javax.swing.JLabel();
        Tekst10 = new javax.swing.JLabel();
        Tekst10_2 = new javax.swing.JLabel();
        Tekst11 = new javax.swing.JLabel();
        Tekst11_2 = new javax.swing.JLabel();
        Tekst12Stopka = new javax.swing.JLabel();
        KomPol2 = new javax.swing.JLabel();
        KomPol3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Kalkulator Spedytora");

        LewaStroona.setBackground(new java.awt.Color(2, 9, 16));
        LewaStroona.setAutoscrolls(true);

        Ustawienia.setBackground(new java.awt.Color(1, 19, 19));
        Ustawienia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ustawienia.setForeground(new java.awt.Color(255, 255, 255));
        Ustawienia.setText("Ustawienia");
        Ustawienia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UstawieniaActionPerformed(evt);
            }
        });

        Tekst2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst2.setForeground(new java.awt.Color(255, 255, 255));
        Tekst2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst2.setText("ILOŚĆ KM");

        Pole2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Pole2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pole2ActionPerformed(evt);
            }
        });
        Pole2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pole2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pole2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pole2KeyTyped(evt);
            }
        });

        Tekst3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst3.setForeground(new java.awt.Color(255, 255, 255));
        Tekst3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst3.setText("NASZA STAWKA (NETTO)");

        Pole3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Pole3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pole3ActionPerformed(evt);
            }
        });
        Pole3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pole3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pole3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pole3KeyTyped(evt);
            }
        });

        OBLICZ.setBackground(new java.awt.Color(0, 102, 51));
        OBLICZ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OBLICZ.setForeground(new java.awt.Color(0, 51, 51));
        OBLICZ.setText("OBLICZ");
        OBLICZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OBLICZActionPerformed(evt);
            }
        });
        OBLICZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OBLICZKeyPressed(evt);
            }
        });

        Kopiuj.setBackground(new java.awt.Color(1, 19, 19));
        Kopiuj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Kopiuj.setForeground(new java.awt.Color(255, 255, 255));
        Kopiuj.setText("Kopiuj do schowka");
        Kopiuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KopiujActionPerformed(evt);
            }
        });

        Tekst1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst1.setForeground(new java.awt.Color(255, 255, 255));
        Tekst1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst1.setText("NASZA STAWKA/KM");

        Tekst1_1_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst1_1_1.setForeground(new java.awt.Color(255, 255, 255));
        Tekst1_1_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        PrawaStrona.setBackground(new java.awt.Color(255, 255, 255));

        Tekst4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst4.setForeground(new java.awt.Color(51, 0, 0));
        Tekst4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst4.setText("STAWKA PRZEWOŹNIKA (NETTO)");

        Tekst4_2.setBackground(new java.awt.Color(255, 255, 255));
        Tekst4_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst4_2.setForeground(new java.awt.Color(51, 0, 0));
        Tekst4_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Tekst5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst5.setForeground(new java.awt.Color(51, 0, 0));
        Tekst5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst5.setText("KWOTA VAT");

        Tekst5_2.setBackground(new java.awt.Color(255, 255, 255));
        Tekst5_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst5_2.setForeground(new java.awt.Color(51, 0, 0));
        Tekst5_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Tekst6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst6.setForeground(new java.awt.Color(0, 51, 51));
        Tekst6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst6.setText("NASZ ZYSK (NETTO)");

        Tekst6_2.setBackground(new java.awt.Color(255, 255, 255));
        Tekst6_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst6_2.setForeground(new java.awt.Color(0, 51, 51));
        Tekst6_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst6_2.setToolTipText("");

        Tekst7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst7.setForeground(new java.awt.Color(0, 51, 51));
        Tekst7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst7.setText("NASZ ZYSK (BRUTTO)");

        Tekst7_2.setBackground(new java.awt.Color(255, 255, 255));
        Tekst7_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst7_2.setForeground(new java.awt.Color(0, 51, 51));
        Tekst7_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Tekst8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst8.setForeground(new java.awt.Color(2, 9, 16));
        Tekst8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst8.setText("MARŻA (%)");

        Tekst8_2.setBackground(new java.awt.Color(255, 255, 255));
        Tekst8_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst8_2.setForeground(new java.awt.Color(2, 9, 16));
        Tekst8_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Tekst9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst9.setForeground(new java.awt.Color(2, 9, 16));
        Tekst9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst9.setText("Stawka za KM");

        Tekst9_2.setBackground(new java.awt.Color(255, 255, 255));
        Tekst9_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst9_2.setForeground(new java.awt.Color(2, 9, 16));
        Tekst9_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Tekst10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst10.setForeground(new java.awt.Color(2, 9, 16));
        Tekst10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst10.setText("Dokładany VAT ");

        Tekst10_2.setBackground(new java.awt.Color(255, 255, 255));
        Tekst10_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst10_2.setForeground(new java.awt.Color(2, 9, 16));
        Tekst10_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Tekst11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst11.setForeground(new java.awt.Color(2, 9, 16));
        Tekst11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst11.setText("Decyzja");

        Tekst11_2.setBackground(new java.awt.Color(255, 255, 255));
        Tekst11_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tekst11_2.setForeground(new java.awt.Color(2, 9, 16));
        Tekst11_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Tekst12Stopka.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        Tekst12Stopka.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst12Stopka.setText("Copyright © 2019 Orsulit | Wykonanie: Orsulit sp. z o.o. NIP: 5272807305");

        javax.swing.GroupLayout PrawaStronaLayout = new javax.swing.GroupLayout(PrawaStrona);
        PrawaStrona.setLayout(PrawaStronaLayout);
        PrawaStronaLayout.setHorizontalGroup(
            PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrawaStronaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tekst12Stopka)
                .addContainerGap())
            .addGroup(PrawaStronaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrawaStronaLayout.createSequentialGroup()
                        .addGroup(PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tekst5)
                            .addComponent(Tekst6)
                            .addComponent(Tekst7)
                            .addComponent(Tekst4)
                            .addComponent(Tekst8)
                            .addComponent(Tekst9))
                        .addGap(50, 50, 50)
                        .addGroup(PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tekst9_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tekst4_2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(Tekst5_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tekst6_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tekst7_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tekst8_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PrawaStronaLayout.createSequentialGroup()
                        .addComponent(Tekst10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tekst10_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PrawaStronaLayout.createSequentialGroup()
                        .addComponent(Tekst11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tekst11_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );
        PrawaStronaLayout.setVerticalGroup(
            PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrawaStronaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tekst4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tekst4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tekst5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tekst5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tekst6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tekst6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tekst7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tekst7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tekst8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tekst8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tekst9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tekst9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tekst10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tekst10_2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrawaStronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tekst11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tekst11_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Tekst12Stopka, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        KomPol2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        KomPol2.setForeground(new java.awt.Color(153, 0, 0));
        KomPol2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KomPol2.setText(" ");

        KomPol3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        KomPol3.setForeground(new java.awt.Color(153, 0, 0));
        KomPol3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KomPol3.setText(" ");

        javax.swing.GroupLayout LewaStroonaLayout = new javax.swing.GroupLayout(LewaStroona);
        LewaStroona.setLayout(LewaStroonaLayout);
        LewaStroonaLayout.setHorizontalGroup(
            LewaStroonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LewaStroonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LewaStroonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LewaStroonaLayout.createSequentialGroup()
                        .addComponent(Tekst3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KomPol3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pole3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LewaStroonaLayout.createSequentialGroup()
                        .addComponent(Tekst2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LewaStroonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KomPol2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(LewaStroonaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Pole2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LewaStroonaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Ustawienia))
                    .addGroup(LewaStroonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LewaStroonaLayout.createSequentialGroup()
                            .addComponent(Tekst1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tekst1_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LewaStroonaLayout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addGroup(LewaStroonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Kopiuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OBLICZ, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(PrawaStrona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LewaStroonaLayout.setVerticalGroup(
            LewaStroonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LewaStroonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LewaStroonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LewaStroonaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Ustawienia)
                        .addGap(107, 107, 107)
                        .addGroup(LewaStroonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pole2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LewaStroonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(KomPol2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tekst2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(LewaStroonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Tekst3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LewaStroonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Pole3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(KomPol3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addComponent(OBLICZ, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Kopiuj, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tekst1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PrawaStrona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LewaStroonaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Tekst1_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LewaStroona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LewaStroona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UstawieniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UstawieniaActionPerformed

        Wlasciwosci wl = new Wlasciwosci ();
        wl.setVisible(true);
    }//GEN-LAST:event_UstawieniaActionPerformed

    private void Pole2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pole2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pole2ActionPerformed

    private void Pole2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole2KeyPressed

        // OBLICZA PO WCISNIECIU <ENTER>

        // KOD SKOPIOWANY Z METODY BUTTONA OBLICZ

        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {

            if(Pole2.getText().trim().isEmpty() && Pole3.getText().trim().isEmpty())
            {
                KomPol2.setText("Uzupełnij pole Ilość KM!");
                KomPol3.setText("Uzupełnij pole Stawka Netto!");
            }
            else if (Pole2.getText().trim().isEmpty())
            {
                KomPol2.setText("Uzupełnij pole Ilość KM!");
            }
            else if (Pole3.getText().trim().isEmpty())
            {
                KomPol3.setText("Uzupełnij pole Stawka Netto!");
            }
            else

            try (InputStream input = new FileInputStream("ustawienia.properties")) {

                Properties prop = new Properties();

                prop.load(input);

                String StKM = prop.getProperty("StawkaKM");

                Tekst1_1_1.setText(StKM);

                float a=Float.parseFloat(Pole2.getText());
                float b=Float.parseFloat(Tekst1_1_1.getText());
                float c=Float.parseFloat(Pole3.getText());

                float stawkaPrzewoznikaNetto = a * b;
                Tekst4_2.setText(String.format("%1.2f",(stawkaPrzewoznikaNetto))); //String.format("%.4g%n", a) "%1.2f"

                String StawVAT = prop.getProperty("StawkaVAT");
                float kwotaVat = (a * b)*(Float.valueOf(StawVAT));
                Tekst5_2.setText(String.format("%1.2f",(kwotaVat)));

                float nasZyskNetto = (c - (a * b));
                Tekst6_2.setText(String.format("%1.2f",(nasZyskNetto)));

                float naszZyskBrutto = (c - (((a * b)*(Float.valueOf(StawVAT)))+(a * b)));
                Tekst7_2.setText(String.format("%1.2f",(naszZyskBrutto)));

                float marza = (((c - (a * b)) / (a * b))*100f);
                Tekst8_2.setText(String.format("%1.2f",(marza))+ " %");

                float stawkaZaKM = (c / a);
                Tekst9_2.setText(String.format("%1.2f",(stawkaZaKM)));

                float ResultKwotaVat;

                String JakiVat = (Float.toString(((a * b)*(Float.valueOf(StawVAT)))-(c - (a * b)))); // przekonwertowałem stringa na float (Float.valueOf(String)

                    ResultKwotaVat = JakiVat.compareTo(StawVAT);

                    if(ResultKwotaVat == 0) {
                        Tekst10_2.setText(Float.toString(((a * b)*(Float.valueOf(StawVAT)))-(c - (a * b))));

                    } else if(ResultKwotaVat > 0) {
                        Tekst10_2.setText(Float.toString(((a * b)*(Float.valueOf(StawVAT)))-(c - (a * b))));

                    } else if(ResultKwotaVat < 0) {
                        Tekst10_2.setText(" Nie dokładamy ;)");

                    }

                    float ResultMarza;

                    String MarzaString = (Float.toString(((c - (a * b)) / (a * b))));
                    String MinMarString = (prop.getProperty("MinimalnaMarza"));

                    ResultMarza = MarzaString.compareTo(MinMarString);

                    if(ResultMarza == 0) {
                        Tekst11_2.setText(prop.getProperty("DecyzjaPozytywna"));

                    } else if(ResultMarza > 0) {
                        Tekst11_2.setText(prop.getProperty("DecyzjaPozytywna"));

                    } else if(ResultMarza < 0) {
                        Tekst11_2.setText(prop.getProperty("DecyzjaNegatywna"));

                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
    }//GEN-LAST:event_Pole2KeyPressed

    private void Pole2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole2KeyReleased

        KomPol2.setText("");

    }//GEN-LAST:event_Pole2KeyReleased

    private void Pole2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole2KeyTyped
        // Ilość Km do przejechania - pole numeryczne (do wpisania)
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar))
            ||  (vchar == KeyEvent.VK_BACK_SPACE)
            ||  (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_Pole2KeyTyped

    private void Pole3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pole3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pole3ActionPerformed

    private void Pole3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole3KeyPressed

        // OBLICZA PO WCISNIECIU <ENTER>

        // KOD SKOPIOWANY Z METODY BUTTONA OBLICZ

        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {

            if(Pole2.getText().trim().isEmpty() && Pole3.getText().trim().isEmpty())
            {
                KomPol2.setText("Uzupełnij pole Ilość KM!");
                KomPol3.setText("Uzupełnij pole Stawka Netto!");
            }
            else if (Pole2.getText().trim().isEmpty())
            {
                KomPol2.setText("Uzupełnij pole Ilość KM!");
            }
            else if (Pole3.getText().trim().isEmpty())
            {
                KomPol3.setText("Uzupełnij pole Stawka Netto!");
            }
            else

            try (InputStream input = new FileInputStream("ustawienia.properties")) {

                Properties prop = new Properties();

                prop.load(input);

                String StKM = prop.getProperty("StawkaKM");

                Tekst1_1_1.setText(StKM);

                float a=Float.parseFloat(Pole2.getText());
                float b=Float.parseFloat(Tekst1_1_1.getText());
                float c=Float.parseFloat(Pole3.getText());

                float stawkaPrzewoznikaNetto = a * b;
                Tekst4_2.setText(String.format("%1.2f",(stawkaPrzewoznikaNetto))); //String.format("%.4g%n", a) "%1.2f"

                String StawVAT = prop.getProperty("StawkaVAT");
                float kwotaVat = (a * b)*(Float.valueOf(StawVAT));
                Tekst5_2.setText(String.format("%1.2f",(kwotaVat)));

                float nasZyskNetto = (c - (a * b));
                Tekst6_2.setText(String.format("%1.2f",(nasZyskNetto)));

                float naszZyskBrutto = (c - (((a * b)*(Float.valueOf(StawVAT)))+(a * b)));
                Tekst7_2.setText(String.format("%1.2f",(naszZyskBrutto)));

                float marza = (((c - (a * b)) / (a * b))*100f);
                Tekst8_2.setText(String.format("%1.2f",(marza))+ " %");

                float stawkaZaKM = (c / a);
                Tekst9_2.setText(String.format("%1.2f",(stawkaZaKM)));

                float ResultKwotaVat;

                String JakiVat = (Float.toString(((a * b)*(Float.valueOf(StawVAT)))-(c - (a * b)))); // przekonwertowałem stringa na float (Float.valueOf(String)

                    ResultKwotaVat = JakiVat.compareTo(StawVAT);

                    if(ResultKwotaVat == 0) {
                        Tekst10_2.setText(Float.toString(((a * b)*(Float.valueOf(StawVAT)))-(c - (a * b))));

                    } else if(ResultKwotaVat > 0) {
                        Tekst10_2.setText(Float.toString(((a * b)*(Float.valueOf(StawVAT)))-(c - (a * b))));

                    } else if(ResultKwotaVat < 0) {
                        Tekst10_2.setText(" Nie dokładamy ;)");

                    }

                    float ResultMarza;

                    String MarzaString = (Float.toString(((c - (a * b)) / (a * b))));
                    String MinMarString = (prop.getProperty("MinimalnaMarza"));

                    ResultMarza = MarzaString.compareTo(MinMarString);

                    if(ResultMarza == 0) {
                        Tekst11_2.setText(prop.getProperty("DecyzjaPozytywna"));

                    } else if(ResultMarza > 0) {
                        Tekst11_2.setText(prop.getProperty("DecyzjaPozytywna"));

                    } else if(ResultMarza < 0) {
                        Tekst11_2.setText(prop.getProperty("DecyzjaNegatywna"));

                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

    }//GEN-LAST:event_Pole3KeyPressed

    private void Pole3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole3KeyReleased

        KomPol3.setText("");

    }//GEN-LAST:event_Pole3KeyReleased

    private void Pole3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole3KeyTyped
        // Nasza stawka netto - pole numeryczne (do wpisania)
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar))
            ||  (vchar == KeyEvent.VK_BACK_SPACE)
            ||  (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_Pole3KeyTyped

    private void OBLICZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OBLICZActionPerformed
        // Button oblicz wylicza wszystkie wartości podane z lewej strony i dostarcza obliczeń po prawej stronie

        if(Pole2.getText().trim().isEmpty() && Pole3.getText().trim().isEmpty())
        {
            KomPol2.setText("Uzupełnij pole Ilość KM!");
            KomPol3.setText("Uzupełnij pole Stawka Netto!");
        }
        else if (Pole2.getText().trim().isEmpty())
        {
            KomPol2.setText("Uzupełnij pole Ilość KM!");
        }
        else if (Pole3.getText().trim().isEmpty())
        {
            KomPol3.setText("Uzupełnij pole Stawka Netto!");
        }
        else

        try (InputStream input = new FileInputStream("ustawienia.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            /* Zmienne które trzeba wpisać do kalkulatora */

            String StKM = prop.getProperty("StawkaKM");
            // (Float.valueOf(StKM))

            //Pole1.setText(StKM);
            Tekst1_1_1.setText(StKM);

            float a=Float.parseFloat(Pole2.getText());
            float b=Float.parseFloat(Tekst1_1_1.getText());
            float c=Float.parseFloat(Pole3.getText());

            /* Oblicza Stawkę przewoźnika (netto) - zmienne double
            Stawka Przewoźnika (netto) [Tekst4_2] = Ilość KM [Pole2] * Nasza Stawka/KM [Pole1-Tekst1_1_1] */

            float stawkaPrzewoznikaNetto = a * b;
            Tekst4_2.setText(String.format("%1.2f",(stawkaPrzewoznikaNetto))); //String.format("%.4g%n", a) "%1.2f"

            /* Oblicza Kwotę VAT
            Kwota VAT [Tekst5_2] = Stawka Przewoźnika (netto) [Tekst4_2] * 0,23 (VAT) */
            String StawVAT = prop.getProperty("StawkaVAT");
            float kwotaVat = (a * b)*(Float.valueOf(StawVAT));
            Tekst5_2.setText(String.format("%1.2f",(kwotaVat)));

            /*Oblicza Nasz zysk (netto)
            Nasz Zysk (netto) [Tekst6_2] = Nasza Stawka (netto) [Pole3] - Stawka Przewoźnika (netto) [Tekst4_2] */
            float nasZyskNetto = (c - (a * b));
            Tekst6_2.setText(String.format("%1.2f",(nasZyskNetto)));

            /*Oblicza Nasz zysk (brutto)
            Nasz Zysk (brutto) [Tekst7_2] = Nasza Stawka (netto) [Pole3] - Stawka Przewoźnika (brutto)(VAT+Stawka Przewoźnika (netto)) */
            float naszZyskBrutto = (c - (((a * b)*(Float.valueOf(StawVAT)))+(a * b)));
            Tekst7_2.setText(String.format("%1.2f",(naszZyskBrutto)));

            /*Oblicza Marżę (%)
            Marża(%) [Tekst8_2] = Nasz Zysk (netto) [Tekst6_2] / Stawkę przewoźnika (netto)   */
            float marza = (((c - (a * b)) / (a * b))*100f);
            Tekst8_2.setText(String.format("%1.2f",(marza))+ " %");

            /*Oblicza Stawkę za KM
            Stawka za KM [Tekst9_2] = Nasza Stawka (netto) [Pole3] / Ilość KM [Pole2] */
            float stawkaZaKM = (c / a);
            Tekst9_2.setText(String.format("%1.2f",(stawkaZaKM)));

            /*Podaje informacje czy dokładamy VAT
            Jeżeli Kwota VAT [Tekst5_2] - Nasz Zysk (netto) [Tekst6_2] >= 0 ; Kwota VAT [Tekst5_2] - Nasz Zysk (netto) [Tekst6_2] ; "Nie dokładamy ;)" */

            float ResultKwotaVat;

            //String StawVAT = prop.getProperty("StawkaVAT"); - przeniesione wyżej
            String JakiVat = (Float.toString(((a * b)*(Float.valueOf(StawVAT)))-(c - (a * b)))); // przekonwertowałem stringa na float (Float.valueOf(String)

                ResultKwotaVat = JakiVat.compareTo(StawVAT);

                if(ResultKwotaVat == 0) {
                    Tekst10_2.setText(Float.toString(((a * b)*(Float.valueOf(StawVAT)))-(c - (a * b))));

                } else if(ResultKwotaVat > 0) {
                    Tekst10_2.setText(Float.toString(((a * b)*(Float.valueOf(StawVAT)))-(c - (a * b))));

                } else if(ResultKwotaVat < 0) {
                    Tekst10_2.setText(" Nie dokładamy ;)");

                }

                /*Podaje informacje jaka jest decyzja
                Jeżeli Marża(%) [Tekst8_2] >= "MinimalnaMarza" ; "Pozytywna, świetna stawka!! ;)" ; "Negatwyna, dokładamy VAT ;("   */

                float ResultMarza;

                String MarzaString = (Float.toString(((c - (a * b)) / (a * b))));
                String MinMarString = (prop.getProperty("MinimalnaMarza"));

                ResultMarza = MarzaString.compareTo(MinMarString);

                if(ResultMarza == 0) {
                    Tekst11_2.setText(prop.getProperty("DecyzjaPozytywna"));

                } else if(ResultMarza > 0) {
                    Tekst11_2.setText(prop.getProperty("DecyzjaPozytywna"));

                } else if(ResultMarza < 0) {
                    Tekst11_2.setText(prop.getProperty("DecyzjaNegatywna"));

                }


            } catch (IOException ex) {
                ex.printStackTrace();
            }

    }//GEN-LAST:event_OBLICZActionPerformed

    private void OBLICZKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OBLICZKeyPressed

    }//GEN-LAST:event_OBLICZKeyPressed

    private void KopiujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KopiujActionPerformed

        // kopiuje formatke do schowka

        String ctc = "------------------------------------" + "\n" +
        "Ilość KM:  " + Pole2.getText() + "\n" +
        "Stawka od klienta:  " + Pole3.getText() + "\n" +
        "Nasz Zysk (netto):  " + Tekst6_2.getText().toString() + "\n" +
        "Marża(%):  " + Tekst8_2.getText().toString() + "\n" +
        "Stawka Przewoźnika (netto):  " + Tekst4_2.getText ()
        + "\n" + "------------------------------------" ;
        StringSelection stringSelection = new StringSelection(ctc);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);

    }//GEN-LAST:event_KopiujActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorSpedytora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSpedytora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSpedytora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSpedytora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorSpedytora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel KomPol2;
    public static javax.swing.JLabel KomPol3;
    private javax.swing.JButton Kopiuj;
    private javax.swing.JPanel LewaStroona;
    private javax.swing.JButton OBLICZ;
    private javax.swing.JTextField Pole2;
    private javax.swing.JTextField Pole3;
    private javax.swing.JPanel PrawaStrona;
    private javax.swing.JLabel Tekst1;
    private javax.swing.JLabel Tekst10;
    private javax.swing.JLabel Tekst10_2;
    private javax.swing.JLabel Tekst11;
    private javax.swing.JLabel Tekst11_2;
    private javax.swing.JLabel Tekst12Stopka;
    public static javax.swing.JLabel Tekst1_1_1;
    private javax.swing.JLabel Tekst2;
    private javax.swing.JLabel Tekst3;
    private javax.swing.JLabel Tekst4;
    private javax.swing.JLabel Tekst4_2;
    private javax.swing.JLabel Tekst5;
    private javax.swing.JLabel Tekst5_2;
    private javax.swing.JLabel Tekst6;
    private javax.swing.JLabel Tekst6_2;
    private javax.swing.JLabel Tekst7;
    private javax.swing.JLabel Tekst7_2;
    private javax.swing.JLabel Tekst8;
    private javax.swing.JLabel Tekst8_2;
    private javax.swing.JLabel Tekst9;
    private javax.swing.JLabel Tekst9_2;
    private javax.swing.JButton Ustawienia;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) 
    {
    int opcjaZamykanie = JOptionPane.showConfirmDialog(rootPane, "Czy napewno poładowałeś już wszystkie auta? ;)");
    if (opcjaZamykanie == 0)
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

}
