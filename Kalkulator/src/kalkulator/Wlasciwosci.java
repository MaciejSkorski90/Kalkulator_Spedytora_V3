/*
* Kalkulator Spedytora powstał w celu kalkulacji rentowności przewozów zagranicznych.  

* KalkulatorSpedytora
* Orsulit sp. z o.o.
* NIP: 5272807305

* Kalkulator Spedytora - WARUNKI LICENCJI

* Jeżeli użytkownik odrzuca któryś z poniższych warunków, powinien niezwłocznie usunąć program ze swojego komputera.

* Wszelkie prawa związane z niniejszą aplikacją, należą do autora programu, Orsulit sp. z o.o.. Nie wolno wprowadzać do oprogramowania żadnych zmian oraz wykorzystywać modułów programu oddzielnie bez zgody autora. Ponadto autor nie wyraża zgody na stosowanie technik inżynierii wstecznej, dekompilowanie, debugowanie ani na próby odkrycia kodu źródłowego programu lub jego części. Kod źródłowy oprogramowania KalkulatorSpedytora stanowi własność intelektualną autora i nie będzie ujawniany.

* Oprogramowanie KalkulatorSpedytora może być wykorzystywane jedynie na własne potrzeby użytkownika. Autor nie ponosi żadnej odpowiedzialności za skutki wykorzystania oprogramowania do celów niezgodnych z obowiązującym prawem. Użytkownik ponosi pełną odpowiedzialność za skutki wynikające z używania programu.

* W najszerszym zakresie dopuszczonym przez prawo właściwe autor programu nie jest w żadnym wypadku odpowiedzialny za jakiekolwiek powstałe szkody (w tym, bez ograniczeń, szkody wynikłe ze strat w prowadzonej działalności, przerw w prowadzeniu działalności, utraty informacji związanych z prowadzoną działalnością lub inne szkody pieniężne) wynikające z użytkowania lub niemożliwości użytkowania oprogramowania.

* Użytkownik przyjmuje do wiadomości, że oprogramowanie jest dostarczane w stanie, „w jakim zostało wytworzone”, bez jakiejkolwiek gwarancji a w szczególności gwarancji w zakresie przydatności do określonych celów. Producent nie może zagwarantować, że program KalkulatorSpedytora będzie działał prawidłowo w połączeniu z każdym sprzętem komputerowym, systemem operacyjnym lub oprogramowaniem pochodzącym od firm trzecich. Autor programu KalkulatorSpedytora nie może także zagwarantować, że oprogramowanie spełni wszystkie oczekiwania użytkownika, tzn. posiadać będzie funkcjonalność, która nie została wyraźnie opisana w dokumentacji użytkowej, a zdaniem użytkownika powinna być zawarta w programie.

*/

package kalkulator;

import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.*;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.InputStream;
import static kalkulator.KalkulatorSpedytora.Tekst1_1_1;

/**
 * @author Maciej Skórski
 * Wykonanie: Orsulit sp. z o.o. NIP: 5272807305
 */
public class Wlasciwosci extends javax.swing.JFrame {

    /**
     * Creates new form Wlasciwosci
     */
    public Wlasciwosci() {
        initComponents();
        setIcon();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png")));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WlasciwosciPanel = new javax.swing.JPanel();
        WlaciwosciText = new javax.swing.JLabel();
        Tekst1_1 = new javax.swing.JLabel();
        Pole1_1 = new javax.swing.JTextField();
        KomTekst1_1 = new javax.swing.JLabel();
        Tekst2_1 = new javax.swing.JLabel();
        Pole2_1 = new javax.swing.JTextField();
        KomTekst2_1 = new javax.swing.JLabel();
        Tekst3_1 = new javax.swing.JLabel();
        Pole3_1 = new javax.swing.JTextField();
        KomTekst3_1 = new javax.swing.JLabel();
        Tekst4_1 = new javax.swing.JLabel();
        Pole4_1 = new javax.swing.JTextField();
        Tekst5_1 = new javax.swing.JLabel();
        Pole5_1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UstawieniaKalkulatorSpedytora");

        WlasciwosciPanel.setBackground(new java.awt.Color(1, 11, 20));
        WlasciwosciPanel.setForeground(new java.awt.Color(1, 14, 27));

        WlaciwosciText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WlaciwosciText.setForeground(new java.awt.Color(255, 255, 255));
        WlaciwosciText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WlaciwosciText.setText("Ustawienia:");
        WlaciwosciText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Tekst1_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tekst1_1.setForeground(new java.awt.Color(255, 255, 255));
        Tekst1_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst1_1.setText("Stawka/KM:");

        Pole1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pole1_1ActionPerformed(evt);
            }
        });
        Pole1_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pole1_1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pole1_1KeyTyped(evt);
            }
        });

        KomTekst1_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        KomTekst1_1.setForeground(new java.awt.Color(153, 0, 0));
        KomTekst1_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Tekst2_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tekst2_1.setForeground(new java.awt.Color(255, 255, 255));
        Tekst2_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst2_1.setText("Stawka VAT:");

        Pole2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pole2_1ActionPerformed(evt);
            }
        });
        Pole2_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pole2_1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pole2_1KeyTyped(evt);
            }
        });

        KomTekst2_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        KomTekst2_1.setForeground(new java.awt.Color(153, 0, 0));
        KomTekst2_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KomTekst2_1.setText(" ");

        Tekst3_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tekst3_1.setForeground(new java.awt.Color(255, 255, 255));
        Tekst3_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst3_1.setText("Minimalna marża:");

        Pole3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pole3_1ActionPerformed(evt);
            }
        });
        Pole3_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pole3_1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pole3_1KeyTyped(evt);
            }
        });

        KomTekst3_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        KomTekst3_1.setForeground(new java.awt.Color(153, 0, 0));
        KomTekst3_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KomTekst3_1.setText(" ");

        Tekst4_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tekst4_1.setForeground(new java.awt.Color(255, 255, 255));
        Tekst4_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst4_1.setText("Decyzja negatywna:");

        Pole4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pole4_1ActionPerformed(evt);
            }
        });

        Tekst5_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tekst5_1.setForeground(new java.awt.Color(255, 255, 255));
        Tekst5_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tekst5_1.setText("Decyzja pozytywna:");

        Pole5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pole5_1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 10, 10));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Zapisz zmiany");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 10, 10));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Załaduj ustawienia");
        jButton2.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jButton2HierarchyChanged(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WlasciwosciPanelLayout = new javax.swing.GroupLayout(WlasciwosciPanel);
        WlasciwosciPanel.setLayout(WlasciwosciPanelLayout);
        WlasciwosciPanelLayout.setHorizontalGroup(
            WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WlasciwosciPanelLayout.createSequentialGroup()
                .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WlasciwosciPanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(WlaciwosciText, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WlasciwosciPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tekst2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tekst1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tekst3_1)
                            .addComponent(Tekst5_1)
                            .addComponent(Tekst4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WlasciwosciPanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KomTekst1_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(KomTekst2_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(WlasciwosciPanelLayout.createSequentialGroup()
                                        .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Pole1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Pole2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Pole3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(KomTekst3_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(WlasciwosciPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Pole4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pole5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 16, Short.MAX_VALUE)))))
                .addGap(17, 17, 17))
            .addGroup(WlasciwosciPanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WlasciwosciPanelLayout.setVerticalGroup(
            WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WlasciwosciPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WlaciwosciText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tekst1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pole1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(KomTekst1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tekst2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pole2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WlasciwosciPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tekst3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pole3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(WlasciwosciPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(KomTekst2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(KomTekst3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tekst5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pole4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tekst4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pole5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(WlasciwosciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WlasciwosciPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WlasciwosciPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pole1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pole1_1ActionPerformed

    }//GEN-LAST:event_Pole1_1ActionPerformed

    private void Pole2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pole2_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pole2_1ActionPerformed

    private void Pole3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pole3_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pole3_1ActionPerformed

    private void Pole4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pole4_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pole4_1ActionPerformed

    private void Pole5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pole5_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pole5_1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(Pole1_1.getText().trim().isEmpty() && Pole2_1.getText().trim().isEmpty() && Pole3_1.getText().trim().isEmpty())
        {
        KomTekst1_1.setText("Uzupełnij pole Stawka/KM!");
        KomTekst2_1.setText("Uzupełnij pole Stawka VAT!");
        KomTekst3_1.setText("Uzupełnij pole Minimalna marża!");
        }
        else if (Pole1_1.getText().trim().isEmpty())
        {
                KomTekst1_1.setText("Uzupełnij pole Stawka/KM!");
        }
        else if (Pole2_1.getText().trim().isEmpty())
        {
                KomTekst2_1.setText("Uzupełnij pole Stawka VAT!");
        }
        else if (Pole3_1.getText().trim().isEmpty())
        {
                KomTekst3_1.setText("Uzupełnij pole Minimalna marża!");
        }
        else
        
         try (OutputStream output = new FileOutputStream("ustawienia.properties")) {

            Properties prop = new Properties();

            //JTextField zamiana na stringi 
            
            String StKM = Pole1_1.getText();
            String StVAT = Pole2_1.getText();
            String MinMar = Pole3_1.getText();
            String DecPoz = Pole4_1.getText();
            String DecNeg = Pole5_1.getText();

                        
            // set the properties value
            prop.setProperty("StawkaKM",StKM);
            prop.setProperty("StawkaVAT", StVAT);
            prop.setProperty("MinimalnaMarza", MinMar);
            prop.setProperty("DecyzjaPozytywna", DecPoz);
            prop.setProperty("DecyzjaNegatywna", DecNeg);
            

            // save properties to project root folder
            prop.store(output, null);

            System.out.println(prop);

        } catch (IOException io) {
            io.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Pole1_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole1_1KeyTyped

         // Stawka za km jazdy dla podwykonawcy - pole numeryczne po przecinku (do wpisania)
        char liczby = evt.getKeyChar();
        if (Character.isLetter(liczby)&&!evt.isAltDown()){
            evt.consume();
        }

    }//GEN-LAST:event_Pole1_1KeyTyped

    private void Pole2_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole2_1KeyTyped

         // Stawka za km jazdy dla podwykonawcy - pole numeryczne po przecinku (do wpisania)
        char liczby = evt.getKeyChar();
        if (Character.isLetter(liczby)&&!evt.isAltDown()){
            evt.consume();
        }

    }//GEN-LAST:event_Pole2_1KeyTyped

    private void Pole3_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole3_1KeyTyped

         // Stawka za km jazdy dla podwykonawcy - pole numeryczne po przecinku (do wpisania)
        char liczby = evt.getKeyChar();
        if (Character.isLetter(liczby)&&!evt.isAltDown()){
            evt.consume();
        }

    }//GEN-LAST:event_Pole3_1KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

 
         try (InputStream input = new FileInputStream("ustawienia.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);
            
            
             //ustawia zmienione wartosci properties
            
          String StKM = prop.getProperty("StawkaKM");
          String StVAT = prop.getProperty("StawkaVAT");
          String MinMar = prop.getProperty("MinimalnaMarza");
          String DecPoz = prop.getProperty("DecyzjaPozytywna");
          String DecNeg = prop.getProperty("DecyzjaNegatywna");

            
            Pole1_1.setText(StKM);
            Pole2_1.setText(StVAT);
            Pole3_1.setText(MinMar);
            Pole4_1.setText(DecPoz);
            Pole5_1.setText(DecNeg);

  
            } catch (IOException ex) {
            ex.printStackTrace();
        }
   

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jButton2HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2HierarchyChanged

    private void Pole1_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole1_1KeyReleased

        KomTekst1_1.setText("");

    }//GEN-LAST:event_Pole1_1KeyReleased

    private void Pole2_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole2_1KeyReleased

        KomTekst2_1.setText("");

    }//GEN-LAST:event_Pole2_1KeyReleased

    private void Pole3_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pole3_1KeyReleased

        KomTekst3_1.setText("");

    }//GEN-LAST:event_Pole3_1KeyReleased

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
            java.util.logging.Logger.getLogger(Wlasciwosci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wlasciwosci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wlasciwosci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wlasciwosci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wlasciwosci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel KomTekst1_1;
    public static javax.swing.JLabel KomTekst2_1;
    public static javax.swing.JLabel KomTekst3_1;
    public static javax.swing.JTextField Pole1_1;
    public static javax.swing.JTextField Pole2_1;
    public static javax.swing.JTextField Pole3_1;
    public static javax.swing.JTextField Pole4_1;
    public static javax.swing.JTextField Pole5_1;
    private javax.swing.JLabel Tekst1_1;
    private javax.swing.JLabel Tekst2_1;
    private javax.swing.JLabel Tekst3_1;
    private javax.swing.JLabel Tekst4_1;
    private javax.swing.JLabel Tekst5_1;
    private javax.swing.JLabel WlaciwosciText;
    private javax.swing.JPanel WlasciwosciPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
