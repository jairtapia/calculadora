
package org.programacion.calculadora;

import java.awt.Color;
import java.awt.Toolkit;





public class Calculadora extends javax.swing.JFrame {

    Operaciones ob;
    String operador="";
    Double numero=0.0;
    boolean bin = false,oct = false,Hex = false, dec = false,dot = false;
    public Calculadora() {
        initComponents();
        ob=new Operaciones();
        getContentPane().setBackground(Color.BLACK);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
    public void Actualizar(String numero){
        try{
                if(this.bin){
                if(ob.esBinario(numero)){
                    rbBin.setText(txtDisplay2.getText()); 
                }
                else if(ob.esDec(numero)){
                    rbBin.setText("BIN"); 
                    ob.DecBin(Double.parseDouble(numero));
                    rbBin.setText(ob.getBinario()); 
                }
                else if(ob.esOctal(numero)){
                    rbBin.setText("BIN"); 
                    ob.octDec(numero);
                    ob.DecBin(Double.parseDouble(ob.getDec()));
                    rbBin.setText(ob.getBinario()); 
                }
                else if(ob.esHexa(numero)){
                    ob.hexDec(numero);
                    ob.DecBin(Double.parseDouble(ob.getDec()));
                    rbBin.setText(ob.getBinario()); 
                }
            } 
            if(this.oct){
                if(ob.esOctal(numero)){
                    rbOct.setText(String.valueOf(numero));
                }
                else if(ob.esDec(numero)){
                    ob.decoct(Double.parseDouble(numero));
                    rbOct.setText(ob.getOctal());
                }
                else if(ob.esBinario(numero)){
                    ob.bindec(String.valueOf(numero));
                    ob.decoct(Double.valueOf(ob.getDec()));
                    rbOct.setText(ob.getOctal());
                }
                else if(ob.esHexa(numero)){
                    ob.hexDec(numero);
                    ob.decoct(Double.valueOf(ob.getDec()));
                    rbOct.setText(ob.getOctal());
                }
            }
            if(this.Hex){
                if(ob.esHexa(numero)){
                    rbHex.setText(numero);
                    System.out.println("soy hexa");
                }
                else if(ob.esDec(numero)){
                    rbHex.setText("HEX");
                    ob.DecHex(Double.parseDouble(numero));
                    rbHex.setText(ob.getHex());
                    System.out.println("soy dec");
                }
                else if(ob.esOctal(numero)){
                    ob.octDec(numero);
                    ob.DecHex(Double.parseDouble(ob.getDec()));
                    rbHex.setText(ob.getHex());
                    System.out.println("soy octal");
                }
                else if(ob.esBinario(numero)){
                    ob.bindec(numero);
                    ob.DecHex(Double.parseDouble(ob.getDec()));
                    rbHex.setText(ob.getHex());
                    System.out.println("soy bin");
                }
            }
            if(this.dec){
                if(ob.esDec(numero)){
                    rbDec.setText(numero);
                }
                else if(ob.esOctal(numero)){
                    String s=Integer.toString(ob.octalToDecimal(numero));
                    rbDec.setText(s);
                }
                 else if(ob.esBinario(numero)){
                    ob.bindec(numero);
                    rbDec.setText(String.valueOf(ob.getResultado()));
                }

                 else if(ob.esHexa(numero)){
                    ob.hexDec(numero);
                    rbDec.setText(ob.getDec());
                }
            }
        }catch(Exception Ex){
            txtDisplay1.setText("error");
        }
        
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtDisplay2 = new javax.swing.JTextField();
        txtDisplay1 = new javax.swing.JTextField();
        btnSqrt = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnBackSpace = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnFact = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnABS = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        rbBin = new javax.swing.JRadioButton();
        rbOct = new javax.swing.JRadioButton();
        rbDec = new javax.swing.JRadioButton();
        rbHex = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDisplay2.setEditable(false);

        txtDisplay1.setEditable(false);

        btnSqrt.setText("√");
        btnSqrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSqrtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSqrtMouseExited(evt);
            }
        });
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        btnA.setText("A");
        btnA.setEnabled(false);
        btnA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAMouseExited(evt);
            }
        });
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnBackSpace.setText("←");
        btnBackSpace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackSpaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackSpaceMouseExited(evt);
            }
        });
        btnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSpaceActionPerformed(evt);
            }
        });

        btnCE.setText("CE");
        btnCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCEMouseExited(evt);
            }
        });
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnExp.setText("^");
        btnExp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExpMouseExited(evt);
            }
        });
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnB.setText("B");
        btnB.setEnabled(false);
        btnB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBMouseExited(evt);
            }
        });
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDivMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDivMouseExited(evt);
            }
        });
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnPorcentaje.setText("%");
        btnPorcentaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPorcentajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPorcentajeMouseExited(evt);
            }
        });
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });

        btnFact.setText("n!");
        btnFact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFactMouseExited(evt);
            }
        });
        btnFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactActionPerformed(evt);
            }
        });

        btnResta.setText("-");
        btnResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestaMouseExited(evt);
            }
        });
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5MouseExited(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6MouseExited(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7MouseExited(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnC.setText("C");
        btnC.setEnabled(false);
        btnC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCMouseExited(evt);
            }
        });
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnMul.setText("*");
        btnMul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMulMouseExited(evt);
            }
        });
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8MouseExited(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9MouseExited(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4MouseExited(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btnD.setText("D");
        btnD.setEnabled(false);
        btnD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDMouseExited(evt);
            }
        });
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIgualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIgualMouseExited(evt);
            }
        });
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0MouseExited(evt);
            }
        });
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPunto.setText(".");
        btnPunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPuntoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPuntoMouseExited(evt);
            }
        });
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnE.setText("E");
        btnE.setEnabled(false);
        btnE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEMouseExited(evt);
            }
        });
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnSuma.setText("+");
        btnSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSumaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSumaMouseExited(evt);
            }
        });
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3MouseExited(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnABS.setText("ABS");
        btnABS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnABSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnABSMouseExited(evt);
            }
        });

        btnF.setText("F");
        btnF.setEnabled(false);
        btnF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFMouseExited(evt);
            }
        });
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbBin);
        rbBin.setForeground(new java.awt.Color(255, 255, 255));
        rbBin.setText("BIN:");
        rbBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBinActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbOct);
        rbOct.setForeground(new java.awt.Color(255, 255, 255));
        rbOct.setText("OCT");
        rbOct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOctActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbDec);
        rbDec.setForeground(new java.awt.Color(255, 255, 255));
        rbDec.setText("DEC");
        rbDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDecActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbHex);
        rbHex.setForeground(new java.awt.Color(255, 255, 255));
        rbHex.setText("HEX");
        rbHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHexActionPerformed(evt);
            }
        });
        rbHex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbHexKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnFact, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnABS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbOct))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbDec))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbHex))
                    .addComponent(txtDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbBin, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbHex, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbBin)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFact, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnABS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
       operador="+";
       try{
           numero=Double.parseDouble(txtDisplay2.getText());
       }catch(Exception Ex){
           txtDisplay1.setText("numero!!!");
       }
       txtDisplay2.setText("");
       this.dot = false;
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        try{
            ob.setNumero(numero);
           if(operador != "n!"){
               ob.setNumeroAux(Double.parseDouble(txtDisplay2.getText()));
           }
           ob.Procesos(operador);
           txtDisplay2.setText(ob.getResultado().toString());
        }catch(Exception Ex){
            txtDisplay1.setText("haz una opreacion primero pendejo");
        }
        
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtDisplay2.setText(txtDisplay2.getText()+"1");
        Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         txtDisplay2.setText(txtDisplay2.getText()+"2");
          Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtDisplay2.setText(txtDisplay2.getText()+"3");
        Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSpaceActionPerformed
        try{
          if(txtDisplay2.getText().length() != 0){
                 txtDisplay2.setText(txtDisplay2.getText().substring(0,txtDisplay2.getText().length()-1));
                 Actualizar(txtDisplay2.getText());
                }
             if(txtDisplay2.getText().length() == 0){
                 rbBin.setText("BIN");
                 rbOct.setText("OCT");
                 rbHex.setText("HEX");
                 rbDec.setText("DEC");
                }   
             txtDisplay1.setText("todo bien");
        }catch(NumberFormatException Ex){
            txtDisplay1.setText("no se puede eliminar mas");
        }   
    }//GEN-LAST:event_btnBackSpaceActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       txtDisplay2.setText(txtDisplay2.getText()+"4");
        Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtDisplay2.setText(txtDisplay2.getText()+"5");
        Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
       try{
           txtDisplay2.setText(String.valueOf(Math.sqrt(Integer.parseInt(txtDisplay2.getText()))));
       }catch(Exception Ex){
           txtDisplay1.setText("numero!!!");
       }
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       txtDisplay2.setText(txtDisplay2.getText()+"6");
         Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
         txtDisplay2.setText(txtDisplay2.getText()+"7");
          Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         txtDisplay2.setText(txtDisplay2.getText()+"8");
          Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtDisplay2.setText(txtDisplay2.getText()+"9");
       Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btn9ActionPerformed

    private void rbBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBinActionPerformed
        this.bin = !this.bin;
    }//GEN-LAST:event_rbBinActionPerformed

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered
        // TODO add your handling code here:
        btn1.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        // TODO add your handling code here:
        btn1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseEntered
        // TODO add your handling code here:
        btn2.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btn2MouseEntered

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        // TODO add your handling code here:
        btn2.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn2MouseExited

    private void btn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseEntered
        // TODO add your handling code here:
        btn3.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btn3MouseEntered

    private void btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseExited
        // TODO add your handling code here:
        btn3.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn3MouseExited

    private void btn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseEntered
        // TODO add your handling code here:
        btn4.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btn4MouseEntered

    private void btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseExited
        // TODO add your handling code here:
        btn4.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn4MouseExited

    private void btn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseEntered
        // TODO add your handling code here:
        btn5.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btn5MouseEntered

    private void btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseExited
        // TODO add your handling code here:
        btn5.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn5MouseExited

    private void btn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseEntered
        // TODO add your handling code here:
        btn6.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btn6MouseEntered

    private void btn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseExited
        // 6ODO add your handling code here:
        btn6.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn6MouseExited

    private void btn7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseEntered
        // TODO add your handling code here:
        btn7.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btn7MouseEntered

    private void btn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseExited
        // TODO add your handling code here:
        btn7.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn7MouseExited

    private void btn8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseEntered
        // TODO add your handling code here:
        btn8.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btn8MouseEntered

    private void btn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseExited
        // TODO add your handling code here:
        btn8.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn8MouseExited

    private void btn9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseEntered
        // TODO add your handling code here:
        btn9.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btn9MouseEntered

    private void btn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseExited
        // TODO add your handling code here:
        btn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn9MouseExited

    private void btn0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseEntered
        // TODO add your handling code here:
        btn0.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btn0MouseEntered

    private void btn0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseExited
        // TODO add your handling code here:
        btn0.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn0MouseExited

    private void btnPuntoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPuntoMouseEntered
        // TODO add your handling code here:
        btnPunto.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnPuntoMouseEntered

    private void btnPuntoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPuntoMouseExited
        // TODO add your handling code here:
        btnPunto.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPuntoMouseExited

    private void btnABSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnABSMouseEntered
        // TODO add your handling code here:
        btnABS.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnABSMouseEntered

    private void btnABSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnABSMouseExited
        // TODO add your handling code here:
        btnABS.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnABSMouseExited

    private void btnIgualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIgualMouseEntered
        // TODO add your handling code here:
        btnIgual.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnIgualMouseEntered

    private void btnIgualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIgualMouseExited
        // TODO add your handling code here:
        btnIgual.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnIgualMouseExited

    private void btnSumaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumaMouseEntered
        // TODO add your handling code here:
        btnSuma.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnSumaMouseEntered

    private void btnSumaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumaMouseExited
        // TODO add your handling code here:
        btnSuma.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnSumaMouseExited

    private void btnRestaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaMouseEntered
        // TODO add your handling code here:
        btnResta.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnRestaMouseEntered

    private void btnRestaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaMouseExited
        // TODO add your handling code here:
        btnResta.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnRestaMouseExited

    private void btnMulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMulMouseEntered
        // TODO add your handling code here:
        btnMul.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnMulMouseEntered

    private void btnMulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMulMouseExited
        // TODO add your handling code here:
        btnMul.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnMulMouseExited

    private void btnDivMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivMouseEntered
        // TODO add your handling code here:
        btnDiv.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnDivMouseEntered

    private void btnDivMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivMouseExited
        // TODO add your handling code here:
        btnDiv.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDivMouseExited

    private void btnBackSpaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackSpaceMouseEntered
        // TODO add your handling code here:
        btnBackSpace.setBackground(Color.RED);
    }//GEN-LAST:event_btnBackSpaceMouseEntered

    private void btnBackSpaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackSpaceMouseExited
        // TODO add your handling code here:
        btnBackSpace.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnBackSpaceMouseExited

    private void btnCEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCEMouseEntered
        // TODO add your handling code here:
        btnCE.setBackground(Color.RED);
    }//GEN-LAST:event_btnCEMouseEntered

    private void btnCEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCEMouseExited
        // TODO add your handling code here:
        btnCE.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnCEMouseExited

    private void btnSqrtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSqrtMouseEntered
        // TODO add your handling code here:
        btnSqrt.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnSqrtMouseEntered

    private void btnSqrtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSqrtMouseExited
        // TODO add your handling code here:
        btnSqrt.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnSqrtMouseExited

    private void btnExpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpMouseEntered
        // TODO add your handling code here:
        btnExp.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnExpMouseEntered

    private void btnExpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpMouseExited
        // TODO add your handling code here:
        btnExp.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnExpMouseExited

    private void btnPorcentajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPorcentajeMouseEntered
        // TODO add your handling code here:
        btnPorcentaje.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnPorcentajeMouseEntered

    private void btnPorcentajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPorcentajeMouseExited
        // TODO add your handling code here:
        btnPorcentaje.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPorcentajeMouseExited

    private void btnFactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFactMouseEntered
        // TODO add your handling code here:
        btnFact.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnFactMouseEntered

    private void btnFactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFactMouseExited
        // TODO add your handling code here:
        btnFact.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnFactMouseExited

    private void btnAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMouseEntered
        // TODO add your handling code here:
        btnA.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnAMouseEntered

    private void btnAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMouseExited
        // TODO add your handling code here:
        btnA.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnAMouseExited

    private void btnBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBMouseEntered
        // TODO add your handling code here:
        btnB.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnBMouseEntered

    private void btnBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBMouseExited
        // TODO add your handling code here:
        btnB.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnBMouseExited

    private void btnCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCMouseEntered
        // TODO add your handling code here:
        btnC.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnCMouseEntered

    private void btnCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCMouseExited
        // TODO add your handling code here:
        btnC.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnCMouseExited

    private void btnDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDMouseEntered
        // TODO add your handling code here:
        btnD.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnDMouseEntered

    private void btnDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDMouseExited
        // TODO add your handling code here:
        btnD.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDMouseExited

    private void btnEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEMouseEntered
        // TODO add your handling code here:
        btnE.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnEMouseEntered

    private void btnEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEMouseExited
        // TODO add your handling code here:
        btnE.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnEMouseExited

    private void btnFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFMouseEntered
        // TODO add your handling code here:
        btnF.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnFMouseEntered

    private void btnFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFMouseExited
        // TODO add your handling code here:
        btnF.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnFMouseExited

    private void rbOctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOctActionPerformed
        // TODO add your handling code here:
            this.oct = !this.oct;
    }//GEN-LAST:event_rbOctActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        // TODO add your handling code here:
        txtDisplay2.setText("");
        rbBin.setText("BIN");
        rbOct.setText("OCT");
        rbHex.setText("HEX");
        rbDec.setText("DEC");
        this.dot = false;
    }//GEN-LAST:event_btnCEActionPerformed

    private void rbHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHexActionPerformed
        // TODO add your handling code here:
        this.Hex = !this.Hex;
        if(this.Hex){
            btnA.setEnabled(true);
            btnB.setEnabled(true);
            btnC.setEnabled(true);
            btnD.setEnabled(true);
            btnE.setEnabled(true);
            btnF.setEnabled(true);
        }
        else{
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
        }
    }//GEN-LAST:event_rbHexActionPerformed

    private void rbDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDecActionPerformed
        // TODO add your handling code here:
        this.dec = !this.dec;
    }//GEN-LAST:event_rbDecActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        // TODO add your handling code here:
        operador = "^";
        try{
            numero=Double.parseDouble(txtDisplay2.getText());
            this.dot = false;
        }catch(Exception Ex){
            txtDisplay1.setText("numero!!!");
        }
        txtDisplay2.setText("");
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactActionPerformed
        // TODO add your handling code here:
        operador = "n!";
        try{
            numero=Double.parseDouble(txtDisplay2.getText());
        }catch(Exception Ex){
            txtDisplay1.setText("numero!!!");
        }
        txtDisplay2.setText("");
    }//GEN-LAST:event_btnFactActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        // TODO add your handling code here:
        operador = "%";
        try{
            numero=Double.parseDouble(txtDisplay2.getText());
        }catch(Exception Ex){
            txtDisplay1.setText("numero!!!");
        }
        txtDisplay2.setText("");
        this.dot = false;
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        txtDisplay2.setText(txtDisplay2.getText()+"0");
      Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        // TODO add your handling code here:
        if(this.dot == false){
            txtDisplay2.setText(txtDisplay2.getText()+".");
           Actualizar(txtDisplay2.getText());
            this.dot = true;
        }
        else{
            txtDisplay2.setText(txtDisplay2.getText());
        }
        
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
       operador="-";
       try{
           numero=Double.parseDouble(txtDisplay2.getText());
       }catch(Exception Ex){
           txtDisplay1.setText("numero!!!");
       }
       txtDisplay2.setText("");
       this.dot = false;
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        // TODO add your handling code here:
        operador="*";
       try{
           numero=Double.parseDouble(txtDisplay2.getText());
       }catch(Exception Ex){
           txtDisplay1.setText("numero!!!");
       }
       txtDisplay2.setText("");
       this.dot = false;
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
        operador="/";
       try{
           numero=Double.parseDouble(txtDisplay2.getText());
       }catch(Exception Ex){
           txtDisplay1.setText("numero!!!");
       }
       txtDisplay2.setText("");
       this.dot = false;
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        // TODO add your handling code here:
        txtDisplay2.setText(txtDisplay2.getText()+"A");
        Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        // TODO add your handling code here:
        txtDisplay2.setText(txtDisplay2.getText()+"B");
        Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        txtDisplay2.setText(txtDisplay2.getText()+"C");
        Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        // TODO add your handling code here:
        txtDisplay2.setText(txtDisplay2.getText()+"D");
        Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // TODO add your handling code here:
        txtDisplay2.setText(txtDisplay2.getText()+"E");
        Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        // TODO add your handling code here:
        txtDisplay2.setText(txtDisplay2.getText()+"F");
        Actualizar(txtDisplay2.getText());
    }//GEN-LAST:event_btnFActionPerformed

    private void rbHexKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbHexKeyPressed

    }//GEN-LAST:event_rbHexKeyPressed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnABS;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBackSpace;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnFact;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnSuma;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton rbBin;
    private javax.swing.JRadioButton rbDec;
    private javax.swing.JRadioButton rbHex;
    private javax.swing.JRadioButton rbOct;
    private javax.swing.JTextField txtDisplay1;
    private javax.swing.JTextField txtDisplay2;
    // End of variables declaration//GEN-END:variables
}
