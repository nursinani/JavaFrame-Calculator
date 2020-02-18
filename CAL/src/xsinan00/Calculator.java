
package xsinan00;

import java.awt.event.KeyEvent;


public class Calculator extends javax.swing.JFrame {
    double index1;
    double index2;
    double result;
    int decimal1, decimal2, intAnswer;
    String operator;
    private Object math;
    

    
    public Calculator() {
        initComponents();
        //initial mode , decimal mode so these buttons should be disabled
         hex0.setEnabled(false);hex1.setEnabled(false);hex2.setEnabled(false);hex3.setEnabled(false);
         hex4.setEnabled(false);hex5.setEnabled(false);
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        inputText = new javax.swing.JTextField();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        c = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        ce = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        del = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtnDecimal = new javax.swing.JButton();
        modulus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        jBtnCalculate = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnlog = new javax.swing.JButton();
        jBtncos = new javax.swing.JButton();
        jBtnsin = new javax.swing.JButton();
        jBtnexp = new javax.swing.JButton();
        hex1 = new javax.swing.JButton();
        hex2 = new javax.swing.JButton();
        hex3 = new javax.swing.JButton();
        hex4 = new javax.swing.JButton();
        hex0 = new javax.swing.JButton();
        hex5 = new javax.swing.JButton();
        outputText = new java.awt.Label();
        errorText = new java.awt.Label();
        sign = new javax.swing.JButton();
        bin = new javax.swing.JRadioButton();
        hex = new javax.swing.JRadioButton();
        decimal = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        standardCal = new javax.swing.JMenuItem();
        advancedCal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        inputText.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        inputText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        inputText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputTextKeyTyped(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        c.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        mult.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mult.setText("*");
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });

        ce.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ce.setText("CE");
        ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        del.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        del.setText("DEL");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtnDecimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnDecimal.setText(".");
        jBtnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDecimalActionPerformed(evt);
            }
        });

        modulus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        modulus.setText("mod");
        modulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulusActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        jBtnCalculate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnCalculate.setText("=");
        jBtnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalculateActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnlog.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnlog.setText("log");
        jBtnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnlogActionPerformed(evt);
            }
        });

        jBtncos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtncos.setText("cos");
        jBtncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtncosActionPerformed(evt);
            }
        });

        jBtnsin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnsin.setText("sin");
        jBtnsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnsinActionPerformed(evt);
            }
        });

        jBtnexp.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnexp.setText("x^y");
        jBtnexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnexpActionPerformed(evt);
            }
        });

        hex1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hex1.setText("B");
        hex1.setPreferredSize(null);
        hex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hex1ActionPerformed(evt);
            }
        });

        hex2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        hex2.setText("C");
        hex2.setPreferredSize(null);
        hex2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hex2ActionPerformed(evt);
            }
        });

        hex3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hex3.setText("D");
        hex3.setPreferredSize(null);
        hex3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hex3ActionPerformed(evt);
            }
        });

        hex4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hex4.setText("E");
        hex4.setPreferredSize(null);
        hex4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hex4ActionPerformed(evt);
            }
        });

        hex0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hex0.setText("A");
        hex0.setPreferredSize(null);
        hex0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hex0ActionPerformed(evt);
            }
        });

        hex5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hex5.setText("F");
        hex5.setPreferredSize(null);
        hex5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hex5ActionPerformed(evt);
            }
        });

        outputText.setAlignment(java.awt.Label.RIGHT);
        outputText.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        errorText.setAlignment(java.awt.Label.RIGHT);
        errorText.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        sign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sign.setText("+/-");
        sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signActionPerformed(evt);
            }
        });

        buttonGroup1.add(bin);
        bin.setText("Binary");
        bin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binActionPerformed(evt);
            }
        });

        buttonGroup1.add(hex);
        hex.setText("Hexadecimal");
        hex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexActionPerformed(evt);
            }
        });

        buttonGroup1.add(decimal);
        decimal.setSelected(true);
        decimal.setText("Decimal");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        jMenu1.setText("View");

        standardCal.setText("Standard");
        standardCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardCalActionPerformed(evt);
            }
        });
        jMenu1.add(standardCal);

        advancedCal.setText("Advanced");
        advancedCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedCalActionPerformed(evt);
            }
        });
        jMenu1.add(advancedCal);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modulus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bin)
                                .addGap(18, 18, 18)
                                .addComponent(hex)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(decimal)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hex0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtncos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnexp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(hex2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hex3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(hex1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hex4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(hex5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errorText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ce, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sign, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(outputText, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jBtncos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnexp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hex0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hex1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hex2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hex3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hex4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hex5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ce, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sign, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modulus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bin)
                    .addComponent(hex)
                    .addComponent(decimal))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void standardCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardCalActionPerformed
        this.setResizable(false);
        this.setSize(275, 495);
        decimalActionPerformed(evt);    //if user choose standart button , calculator is set to decimal base
        decimal.setSelected(true);      //decimal base is selected
    }//GEN-LAST:event_standardCalActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        this.setResizable(false);
        this.setSize(275, 495);
        plus.setEnabled(false);
        minus.setEnabled(false);
        mult.setEnabled(false);
        divide.setEnabled(false);
        modulus.setEnabled(false);
        sign.setEnabled(false);
        
    }//GEN-LAST:event_formWindowActivated

    private void advancedCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedCalActionPerformed
        this.setResizable(false);
        this.setSize(430, 560);
        inputText.setSize(310, 35);
        outputText.setSize(310, 35);
    }//GEN-LAST:event_advancedCalActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        jBtnCalculate.setEnabled(true);
        String iNum = inputText.getText() + jBtn7.getText();
        inputText.setText(iNum);
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        divide.setEnabled(true);
        modulus.setEnabled(true);
        sign.setEnabled(true);
        del.setEnabled(true);
       
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
       String iNum = inputText.getText() + jBtn8.getText();
        inputText.setText(iNum);
        jBtnCalculate.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        divide.setEnabled(true);
        modulus.setEnabled(true);
        sign.setEnabled(true);
        del.setEnabled(true);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String iNum = inputText.getText() + jBtn9.getText();
        inputText.setText(iNum);
        jBtnCalculate.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        divide.setEnabled(true);
        modulus.setEnabled(true);
        sign.setEnabled(true);
        del.setEnabled(true);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
       String iNum = inputText.getText() + jBtn4.getText();
        inputText.setText(iNum);
        jBtnCalculate.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        divide.setEnabled(true);
        modulus.setEnabled(true);
        sign.setEnabled(true);
        del.setEnabled(true);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
       String iNum = inputText.getText() + jBtn5.getText();
        inputText.setText(iNum);
        jBtnCalculate.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        divide.setEnabled(true);
        modulus.setEnabled(true);
        sign.setEnabled(true);
        del.setEnabled(true);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
       String iNum = inputText.getText() + jBtn6.getText();
        inputText.setText(iNum);
        jBtnCalculate.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        divide.setEnabled(true);
        modulus.setEnabled(true);
        sign.setEnabled(true);
        del.setEnabled(true);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String iNum = inputText.getText() + jBtn1.getText();
        inputText.setText(iNum);
        jBtnCalculate.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        divide.setEnabled(true);
        modulus.setEnabled(true);
        sign.setEnabled(true);
        del.setEnabled(true);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String iNum = inputText.getText() + jBtn2.getText();
        inputText.setText(iNum);
        jBtnCalculate.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        divide.setEnabled(true);
        modulus.setEnabled(true);
        sign.setEnabled(true);
        del.setEnabled(true);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String iNum = inputText.getText() + jBtn3.getText();
        inputText.setText(iNum);
        jBtnCalculate.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        divide.setEnabled(true);
        modulus.setEnabled(true);
        sign.setEnabled(true);
        del.setEnabled(true);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String iNum = inputText.getText() + jBtn0.getText();
        inputText.setText(iNum);
        jBtnCalculate.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        divide.setEnabled(true);
        modulus.setEnabled(true);
        sign.setEnabled(true);
        del.setEnabled(true);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        //means clear display and the calculation
        inputText.setText("");
        outputText.setText("");
        errorText.setText("");
        plus.setEnabled(false);
        minus.setEnabled(false);
        mult.setEnabled(false);
        divide.setEnabled(false);
        modulus.setEnabled(false);
    }//GEN-LAST:event_cActionPerformed

    private void ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceActionPerformed
        // means clear entry
        inputText.setText("");
        errorText.setText("");
        plus.setEnabled(false);
        minus.setEnabled(false);
        mult.setEnabled(false);
        divide.setEnabled(false);
        modulus.setEnabled(false);
        
    }//GEN-LAST:event_ceActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        if(inputText.getText().length()==1){
            plus.setEnabled(false);
            minus.setEnabled(false);
            mult.setEnabled(false);
            divide.setEnabled(false);
        }
        // backspace
        String Del = null;
        errorText.setText("");
        if(inputText.getText().length() > 0){
            StringBuilder strD = new StringBuilder(inputText.getText());
            strD.deleteCharAt(inputText.getText().length() - 1);
            Del = strD.toString();
            inputText.setText(Del);
        }
        
    }//GEN-LAST:event_delActionPerformed

    private void jBtnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDecimalActionPerformed
        //decimal mark button
        if(!inputText.getText().contains(".")){
            inputText.setText(inputText.getText() + jBtnDecimal.getText());
        }
    }//GEN-LAST:event_jBtnDecimalActionPerformed

    private void modulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulusActionPerformed
        jBtnCalculate.setEnabled(false);
        modulus.setEnabled(false);
        del.setEnabled(false);
        if(bin.isSelected()==true){
            decimal1 = Integer.parseInt(inputText.getText(),2);
        }
        else if(hex.isSelected()==true){
            decimal1 = Integer.parseInt(inputText.getText(),16);
        }
        else if(decimal.isSelected()==true){   //means decimal
            index1 = Double.parseDouble(inputText.getText());
        }
        operator = "%";
        outputText.setText(inputText.getText()+"%");
        inputText.setText("");
        
    }//GEN-LAST:event_modulusActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        jBtnCalculate.setEnabled(false);
        divide.setEnabled(false);
        del.setEnabled(false);
        if(bin.isSelected()==true){
            decimal1 = Integer.parseInt(inputText.getText(),2);
        }
        else if(hex.isSelected()==true){
            decimal1 = Integer.parseInt(inputText.getText(),16);
        }
        else if(decimal.isSelected()==true){   //means decimal
            index1 = Double.parseDouble(inputText.getText());
        }
        operator = "/";
        outputText.setText(inputText.getText()+"/");
        inputText.setText("");
    }//GEN-LAST:event_divideActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        jBtnCalculate.setEnabled(false);
        mult.setEnabled(false);
        del.setEnabled(false);
        if(bin.isSelected()==true){
            decimal1 = Integer.parseInt(inputText.getText(),2);
        }
        else if(hex.isSelected()==true){
            decimal1 = Integer.parseInt(inputText.getText(),16);
        }
        else if(decimal.isSelected()==true){   //means decimal
            index1 = Double.parseDouble(inputText.getText());
        }
        operator = "*";
        outputText.setText(inputText.getText()+"*");
        inputText.setText("");
    }//GEN-LAST:event_multActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        jBtnCalculate.setEnabled(false);
        plus.setEnabled(false);
        del.setEnabled(false);
        if(bin.isSelected()==true){
            decimal1 = Integer.parseInt(inputText.getText(),2);
        }
        else if(hex.isSelected()==true){
            decimal1 = Integer.parseInt(inputText.getText(),16);
        }
        else if(decimal.isSelected()==true){   //means decimal
            index1 = Double.parseDouble(inputText.getText());
        }
        operator = "+";
        outputText.setText(inputText.getText()+"+");
        inputText.setText("");
        
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        jBtnCalculate.setEnabled(false);
        minus.setEnabled(false);
        del.setEnabled(false);
        if(bin.isSelected()==true){
            decimal1 = Integer.parseInt(inputText.getText(),2);
        }
        else if(hex.isSelected()==true){
            decimal1 = Integer.parseInt(inputText.getText(),16);
        }
       else if(decimal.isSelected()==true){   //means decimal
            index1 = Double.parseDouble(inputText.getText());
        }
        operator = "-";
        outputText.setText(inputText.getText()+"-");
        inputText.setText("");
    }//GEN-LAST:event_minusActionPerformed

    private void jBtnsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnsinActionPerformed
        double ops = Double.parseDouble(String.valueOf(inputText.getText()));
        result = Math.sin(Math.toRadians(ops));
        inputText.setText(String.valueOf(result));
        outputText.setText("sin"+String.valueOf(ops)+"="+String.valueOf(result));
    }//GEN-LAST:event_jBtnsinActionPerformed

    private void jBtncosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtncosActionPerformed
        double ops = Double.parseDouble(String.valueOf(inputText.getText()));
        result = Math.cos(Math.toRadians(ops));
        inputText.setText(String.valueOf(result));
        outputText.setText("cos"+String.valueOf(ops)+"="+String.valueOf(result));
    }//GEN-LAST:event_jBtncosActionPerformed

    private void jBtnexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnexpActionPerformed
        index1 = Double.parseDouble(inputText.getText());
        operator = "^";
        outputText.setText(inputText.getText()+"^");
        inputText.setText("");
    }//GEN-LAST:event_jBtnexpActionPerformed

    private void jBtnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnlogActionPerformed
        double ops = Double.parseDouble(String.valueOf(inputText.getText()));
        result = Math.log(ops)/Math.log(2); //base 2
        inputText.setText(String.valueOf(result));
        outputText.setText("log"+String.valueOf(ops)+"="+inputText.getText());
    }//GEN-LAST:event_jBtnlogActionPerformed

    private void jBtnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalculateActionPerformed
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        divide.setEnabled(true);
        jBtnDecimal.setEnabled(true); //decimal mark
        del.setEnabled(false);
        
        if(operator=="+"){
           
            if(bin.isSelected()==true){
                decimal2 = Integer.parseInt(inputText.getText(),2);
                intAnswer = decimal1 + decimal2;
                errorText.setText("");
                inputText.setText(Integer.toBinaryString(intAnswer));
                outputText.setText(Integer.toBinaryString(decimal1)+operator+Integer.toBinaryString(decimal2)+"="+Integer.toBinaryString(intAnswer));
            }
            else if(hex.isSelected()==true){
                decimal2 = Integer.parseInt(inputText.getText(),16);
                intAnswer = decimal1 + decimal2;
                errorText.setText("");
                inputText.setText(Integer.toHexString(intAnswer));
                outputText.setText(Integer.toHexString(decimal1)+operator+Integer.toHexString(decimal2)+"="+Integer.toHexString(intAnswer));
            }
            else if(decimal.isSelected()==true){
                index2 = Double.parseDouble(inputText.getText());
                result = index1 + index2;
                inputText.setText(String.valueOf(result));
                errorText.setText("");
                outputText.setText(index1+operator+index2+"="+inputText.getText());
            }
            
            
        } 
        else if(operator=="-"){
            if(bin.isSelected()==true){
                decimal2 = Integer.parseInt(inputText.getText(),2);
                intAnswer = decimal1 - decimal2;
                errorText.setText("");
                inputText.setText(Integer.toBinaryString(intAnswer));
                outputText.setText(Integer.toBinaryString(decimal1)+operator+Integer.toBinaryString(decimal2)+"="+Integer.toBinaryString(intAnswer));
            }
            else if(hex.isSelected()==true){
                decimal2 = Integer.parseInt(inputText.getText(),16);
                intAnswer = decimal1 - decimal2;
                errorText.setText("");
                inputText.setText(Integer.toHexString(intAnswer));
                outputText.setText(Integer.toHexString(decimal1)+operator+Integer.toHexString(decimal2)+"="+Integer.toHexString(intAnswer));
            }
            else if(decimal.isSelected()==true){
                index2 = Double.parseDouble(inputText.getText());
                result = index1 - index2;
                inputText.setText(String.valueOf(result));
                errorText.setText("");
                outputText.setText(index1+operator+index2+"="+inputText.getText());
            }
        }
        else if(operator=="*"){
            if(bin.isSelected()==true){
                decimal2 = Integer.parseInt(inputText.getText(),2);
                intAnswer = decimal1 * decimal2;
                errorText.setText("");
                inputText.setText(Integer.toBinaryString(intAnswer));
                outputText.setText(Integer.toBinaryString(decimal1)+operator+Integer.toBinaryString(decimal2)+"="+Integer.toBinaryString(intAnswer));
            }
            else if(hex.isSelected()==true){
                decimal2 = Integer.parseInt(inputText.getText(),16);
                intAnswer = decimal1 * decimal2;
                errorText.setText("");
                inputText.setText(Integer.toHexString(intAnswer));
                outputText.setText(Integer.toHexString(decimal1)+operator+Integer.toHexString(decimal2)+"="+Integer.toHexString(intAnswer));
            }
            else if(decimal.isSelected()==true){
                index2 = Double.parseDouble(inputText.getText());
                result = index1 * index2;
                inputText.setText(String.valueOf(result));
                errorText.setText("");
                outputText.setText(index1+operator+index2+"="+inputText.getText());
            }
        }
        else if(operator=="/"){
            if(bin.isSelected()==true){
                decimal2 = Integer.parseInt(inputText.getText(),2);
                intAnswer = decimal1 / decimal2;
                errorText.setText("");
                inputText.setText(Integer.toBinaryString(intAnswer));
                outputText.setText(Integer.toBinaryString(decimal1)+operator+Integer.toBinaryString(decimal2)+"="+Integer.toBinaryString(intAnswer));
            }
            else if(hex.isSelected()==true){
                decimal2 = Integer.parseInt(inputText.getText(),16);
                intAnswer = decimal1 /decimal2;
                errorText.setText("");
                inputText.setText(Integer.toHexString(intAnswer));
                outputText.setText(Integer.toHexString(decimal1)+operator+Integer.toHexString(decimal2)+"="+Integer.toHexString(intAnswer));
            }
            else if(decimal.isSelected()==true){
                index2 = Double.parseDouble(inputText.getText());
                    if(index2 != 0){
                    result = index1 / index2;
                    inputText.setText(String.valueOf(result));
                    outputText.setText(index1+operator+index2+"="+inputText.getText());
                    }
                    else{
                    errorText.setText("CANNOT DIVIDE BY 0");
                    inputText.setText("");
                    outputText.setText("");
                    }
            }
            
        }
        else if(operator=="%"){
            
            if(bin.isSelected()==true){
                decimal2 = Integer.parseInt(inputText.getText(),2);
                intAnswer = decimal1 % decimal2;
                errorText.setText("");
                inputText.setText(Integer.toBinaryString(intAnswer));
                outputText.setText(Integer.toBinaryString(decimal1)+operator+Integer.toBinaryString(decimal2)+"="+Integer.toBinaryString(intAnswer));
            }
            else if(hex.isSelected()==true){
                decimal2 = Integer.parseInt(inputText.getText(),16);
                intAnswer = decimal1 % decimal2;
                errorText.setText("");
                inputText.setText(Integer.toHexString(intAnswer));
                outputText.setText(Integer.toHexString(decimal1)+operator+Integer.toHexString(decimal2)+"="+Integer.toHexString(intAnswer));
            }
            else if(decimal.isSelected()==true){
                index2 = Double.parseDouble(inputText.getText());
                result = index1 % index2;
                inputText.setText(String.valueOf(result));
                errorText.setText("");
                outputText.setText(index1+"%"+index2+"="+inputText.getText());
            }
            
        }
        else if(operator=="^"){
            
            index2 = Double.parseDouble(inputText.getText());
            result = Math.pow(index1, index2);
            inputText.setText(String.valueOf(result));
            errorText.setText("");
            outputText.setText(index1+"^"+index2+"="+inputText.getText());
        }
        
    }//GEN-LAST:event_jBtnCalculateActionPerformed
     
    
    
    private void inputTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTextKeyTyped
        //ONLY NUMBERS ARE ALLOWED TO ENTER
        char c = evt.getKeyChar();   //to prevent to enter characters
        if(!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_inputTextKeyTyped

    private void signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signActionPerformed

        double ops = Double.parseDouble(String.valueOf(inputText.getText()));
        ops = ops *(-1);
        inputText.setText(String.valueOf(ops));
        
    }//GEN-LAST:event_signActionPerformed

    private void hex2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hex2ActionPerformed
        inputText.setText(inputText.getText()+"C");
    }//GEN-LAST:event_hex2ActionPerformed

    private void hex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hex1ActionPerformed
        inputText.setText(inputText.getText()+"B");
    }//GEN-LAST:event_hex1ActionPerformed

    private void hex5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hex5ActionPerformed
        inputText.setText(inputText.getText()+"F");
    }//GEN-LAST:event_hex5ActionPerformed

    private void hex0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hex0ActionPerformed
        inputText.setText(inputText.getText()+"A");
    }//GEN-LAST:event_hex0ActionPerformed

    private void hex4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hex4ActionPerformed
        inputText.setText(inputText.getText()+"E");
    }//GEN-LAST:event_hex4ActionPerformed

    private void hex3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hex3ActionPerformed
        inputText.setText(inputText.getText()+"D");
    }//GEN-LAST:event_hex3ActionPerformed

    private void binActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binActionPerformed
           
            jBtn2.setEnabled(false);jBtn3.setEnabled(false);jBtn4.setEnabled(false);jBtn5.setEnabled(false);
            jBtn6.setEnabled(false);jBtn7.setEnabled(false);jBtn8.setEnabled(false);jBtn9.setEnabled(false);
            hex0.setEnabled(false);hex1.setEnabled(false);hex2.setEnabled(false);hex3.setEnabled(false);
            hex4.setEnabled(false);hex5.setEnabled(false);
            jBtnsin.setEnabled(false);
            jBtncos.setEnabled(false);
            jBtnexp.setEnabled(false);
            jBtnlog.setEnabled(false);
            jBtnDecimal.setEnabled(false);
            sign.setEnabled(false);
            
            inputText.setText(null);
            outputText.setText(null);
           
            
    }//GEN-LAST:event_binActionPerformed

    private void hexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexActionPerformed
            
        
            jBtn2.setEnabled(true);jBtn3.setEnabled(true);jBtn4.setEnabled(true);jBtn5.setEnabled(true);
            jBtn6.setEnabled(true);jBtn7.setEnabled(true);jBtn8.setEnabled(true);jBtn9.setEnabled(true);
            hex0.setEnabled(true);hex1.setEnabled(true);hex2.setEnabled(true);hex3.setEnabled(true);
            hex4.setEnabled(true);hex5.setEnabled(true);
            jBtnsin.setEnabled(false);
            jBtncos.setEnabled(false);
            jBtnexp.setEnabled(false);
            jBtnlog.setEnabled(false);
            jBtnDecimal.setEnabled(false);
            sign.setEnabled(false);
            
            inputText.setText(null);
            outputText.setText(null);
          

    }//GEN-LAST:event_hexActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
            
            jBtn2.setEnabled(true);jBtn3.setEnabled(true);jBtn4.setEnabled(true);jBtn5.setEnabled(true);
            jBtn6.setEnabled(true);jBtn7.setEnabled(true);jBtn8.setEnabled(true);jBtn9.setEnabled(true);
            hex0.setEnabled(false);hex1.setEnabled(false);hex2.setEnabled(false);hex3.setEnabled(false);
            hex4.setEnabled(false);hex5.setEnabled(false);
            jBtnsin.setEnabled(true);
            jBtncos.setEnabled(true);
            jBtnexp.setEnabled(true);
            jBtnlog.setEnabled(true);
            jBtnDecimal.setEnabled(true);
            sign.setEnabled(true);
            
            inputText.setText(null);
            outputText.setText(null);
            
    }//GEN-LAST:event_decimalActionPerformed

    
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem advancedCal;
    private javax.swing.JRadioButton bin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton c;
    private javax.swing.JButton ce;
    private javax.swing.JRadioButton decimal;
    private javax.swing.JButton del;
    private javax.swing.JButton divide;
    private java.awt.Label errorText;
    private javax.swing.JRadioButton hex;
    private javax.swing.JButton hex0;
    private javax.swing.JButton hex1;
    private javax.swing.JButton hex2;
    private javax.swing.JButton hex3;
    private javax.swing.JButton hex4;
    private javax.swing.JButton hex5;
    private javax.swing.JTextField inputText;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnCalculate;
    private javax.swing.JButton jBtnDecimal;
    private javax.swing.JButton jBtncos;
    private javax.swing.JButton jBtnexp;
    private javax.swing.JButton jBtnlog;
    private javax.swing.JButton jBtnsin;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton minus;
    private javax.swing.JButton modulus;
    private javax.swing.JButton mult;
    private java.awt.Label outputText;
    private javax.swing.JButton plus;
    private javax.swing.JButton sign;
    private javax.swing.JMenuItem standardCal;
    // End of variables declaration//GEN-END:variables
}
