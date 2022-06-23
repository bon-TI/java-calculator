package calculator;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Calculator extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("javascript");

    public Calculator() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/calculator-icon-converted_1.png")));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base_calculator = new javax.swing.JPanel();
        base_information = new javax.swing.JPanel();
        text_operation = new javax.swing.JLabel();
        text_result = new javax.swing.JLabel();
        buttons = new javax.swing.JPanel();
        base_buttons = new javax.swing.JPanel();
        button_division = new javax.swing.JButton();
        button_c = new javax.swing.JButton();
        button_deleteLast = new javax.swing.JButton();
        button_percentage = new javax.swing.JButton();
        button_seven = new javax.swing.JButton();
        button_eigth = new javax.swing.JButton();
        button_nine = new javax.swing.JButton();
        button_multiplication = new javax.swing.JButton();
        button_four = new javax.swing.JButton();
        button_five = new javax.swing.JButton();
        button_six = new javax.swing.JButton();
        button_minus = new javax.swing.JButton();
        button_one = new javax.swing.JButton();
        button_three = new javax.swing.JButton();
        button_two = new javax.swing.JButton();
        button_plus = new javax.swing.JButton();
        button_zero = new javax.swing.JButton();
        button_dot = new javax.swing.JButton();
        button_equal = new javax.swing.JButton();
        base_buttons_bg = new javax.swing.JLabel();
        change_theme = new javax.swing.JButton();
        button_exit = new javax.swing.JButton();
        button_minimize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        base_calculator.setBackground(new java.awt.Color(255, 255, 255));
        base_calculator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        base_information.setBackground(new java.awt.Color(255, 255, 255));
        base_information.setAlignmentX(0.0F);
        base_information.setAlignmentY(0.0F);
        base_information.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_operation.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        text_operation.setForeground(new java.awt.Color(155, 158, 162));
        text_operation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        text_operation.setAlignmentY(0.0F);
        text_operation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        text_operation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        base_information.add(text_operation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 320, 40));

        text_result.setFont(new java.awt.Font("JetBrains Mono", 0, 48)); // NOI18N
        text_result.setForeground(new java.awt.Color(255, 59, 116));
        text_result.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        text_result.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        base_information.add(text_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 320, 60));

        base_calculator.add(base_information, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 380, 120));

        buttons.setBackground(new java.awt.Color(255, 255, 255));
        buttons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        base_buttons.setBackground(new java.awt.Color(255, 255, 255));
        base_buttons.setOpaque(false);
        base_buttons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_division.setBackground(new java.awt.Color(253, 250, 250));
        button_division.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_division.setForeground(new java.awt.Color(227, 109, 143));
        button_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_division.setText("/");
        button_division.setAlignmentY(0.0F);
        button_division.setBorder(null);
        button_division.setBorderPainted(false);
        button_division.setContentAreaFilled(false);
        button_division.setFocusPainted(false);
        button_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up_pressed.png"))); // NOI18N
        button_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_divisionActionPerformed(evt);
            }
        });
        base_buttons.add(button_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 50, 50));

        button_c.setBackground(new java.awt.Color(253, 250, 250));
        button_c.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_c.setForeground(new java.awt.Color(227, 109, 143));
        button_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_c.setText("C");
        button_c.setBorder(null);
        button_c.setBorderPainted(false);
        button_c.setFocusPainted(false);
        button_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up_pressed.png"))); // NOI18N
        button_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cActionPerformed(evt);
            }
        });
        base_buttons.add(button_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 50));

        button_deleteLast.setBackground(new java.awt.Color(253, 250, 250));
        button_deleteLast.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_deleteLast.setForeground(new java.awt.Color(227, 109, 143));
        button_deleteLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_deleteLast.setText("<-");
        button_deleteLast.setBorder(null);
        button_deleteLast.setBorderPainted(false);
        button_deleteLast.setFocusPainted(false);
        button_deleteLast.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_deleteLast.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_deleteLast.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up_pressed.png"))); // NOI18N
        button_deleteLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteLastActionPerformed(evt);
            }
        });
        base_buttons.add(button_deleteLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 50, 50));

        button_percentage.setBackground(new java.awt.Color(253, 250, 250));
        button_percentage.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_percentage.setForeground(new java.awt.Color(227, 109, 143));
        button_percentage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_percentage.setText("%");
        button_percentage.setBorder(null);
        button_percentage.setBorderPainted(false);
        button_percentage.setFocusPainted(false);
        button_percentage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_percentage.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_percentage.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up_pressed.png"))); // NOI18N
        button_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_percentageActionPerformed(evt);
            }
        });
        base_buttons.add(button_percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 50, 50));

        button_seven.setBackground(new java.awt.Color(253, 250, 250));
        button_seven.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_seven.setForeground(new java.awt.Color(43, 47, 55));
        button_seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_seven.setText("7");
        button_seven.setBorder(null);
        button_seven.setBorderPainted(false);
        button_seven.setFocusPainted(false);
        button_seven.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_seven.setName(""); // NOI18N
        button_seven.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_seven.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sevenActionPerformed(evt);
            }
        });
        base_buttons.add(button_seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 50));

        button_eigth.setBackground(new java.awt.Color(253, 250, 250));
        button_eigth.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_eigth.setForeground(new java.awt.Color(43, 47, 55));
        button_eigth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_eigth.setText("8");
        button_eigth.setBorder(null);
        button_eigth.setBorderPainted(false);
        button_eigth.setFocusPainted(false);
        button_eigth.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_eigth.setName(""); // NOI18N
        button_eigth.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_eigth.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_eigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_eigthActionPerformed(evt);
            }
        });
        base_buttons.add(button_eigth, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 50, 50));

        button_nine.setBackground(new java.awt.Color(253, 250, 250));
        button_nine.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_nine.setForeground(new java.awt.Color(43, 47, 55));
        button_nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_nine.setText("9");
        button_nine.setBorder(null);
        button_nine.setBorderPainted(false);
        button_nine.setFocusPainted(false);
        button_nine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_nine.setName(""); // NOI18N
        button_nine.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_nine.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_nineActionPerformed(evt);
            }
        });
        base_buttons.add(button_nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 50, 50));

        button_multiplication.setBackground(new java.awt.Color(253, 250, 250));
        button_multiplication.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_multiplication.setForeground(new java.awt.Color(227, 109, 143));
        button_multiplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_multiplication.setText("*");
        button_multiplication.setBorder(null);
        button_multiplication.setBorderPainted(false);
        button_multiplication.setFocusPainted(false);
        button_multiplication.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_multiplication.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_multiplication.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up_pressed.png"))); // NOI18N
        button_multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_multiplicationActionPerformed(evt);
            }
        });
        base_buttons.add(button_multiplication, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 50, 50));

        button_four.setBackground(new java.awt.Color(253, 250, 250));
        button_four.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_four.setForeground(new java.awt.Color(43, 47, 55));
        button_four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_four.setText("4");
        button_four.setBorder(null);
        button_four.setBorderPainted(false);
        button_four.setFocusPainted(false);
        button_four.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_four.setName(""); // NOI18N
        button_four.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_four.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_fourActionPerformed(evt);
            }
        });
        base_buttons.add(button_four, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, 50));

        button_five.setBackground(new java.awt.Color(253, 250, 250));
        button_five.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_five.setForeground(new java.awt.Color(43, 47, 55));
        button_five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_five.setText("5");
        button_five.setBorder(null);
        button_five.setBorderPainted(false);
        button_five.setFocusPainted(false);
        button_five.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_five.setName(""); // NOI18N
        button_five.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_five.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_fiveActionPerformed(evt);
            }
        });
        base_buttons.add(button_five, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 50, 50));

        button_six.setBackground(new java.awt.Color(253, 250, 250));
        button_six.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_six.setForeground(new java.awt.Color(43, 47, 55));
        button_six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_six.setText("6");
        button_six.setBorder(null);
        button_six.setBorderPainted(false);
        button_six.setFocusPainted(false);
        button_six.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_six.setName(""); // NOI18N
        button_six.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_six.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sixActionPerformed(evt);
            }
        });
        base_buttons.add(button_six, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 50, 50));

        button_minus.setBackground(new java.awt.Color(253, 250, 250));
        button_minus.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_minus.setForeground(new java.awt.Color(227, 109, 143));
        button_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_minus.setText("-");
        button_minus.setBorder(null);
        button_minus.setBorderPainted(false);
        button_minus.setFocusPainted(false);
        button_minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_minus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_minus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up_pressed.png"))); // NOI18N
        button_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_minusActionPerformed(evt);
            }
        });
        base_buttons.add(button_minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 50, 50));

        button_one.setBackground(new java.awt.Color(253, 250, 250));
        button_one.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_one.setForeground(new java.awt.Color(43, 47, 55));
        button_one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_one.setText("1");
        button_one.setBorder(null);
        button_one.setBorderPainted(false);
        button_one.setFocusPainted(false);
        button_one.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_one.setName(""); // NOI18N
        button_one.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_one.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_oneActionPerformed(evt);
            }
        });
        base_buttons.add(button_one, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 50, 50));

        button_three.setBackground(new java.awt.Color(253, 250, 250));
        button_three.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_three.setForeground(new java.awt.Color(43, 47, 55));
        button_three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_three.setText("3");
        button_three.setBorder(null);
        button_three.setBorderPainted(false);
        button_three.setFocusPainted(false);
        button_three.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_three.setName(""); // NOI18N
        button_three.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_three.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_threeActionPerformed(evt);
            }
        });
        base_buttons.add(button_three, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 50, 50));

        button_two.setBackground(new java.awt.Color(253, 250, 250));
        button_two.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_two.setForeground(new java.awt.Color(43, 47, 55));
        button_two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_two.setText("2");
        button_two.setBorder(null);
        button_two.setBorderPainted(false);
        button_two.setFocusPainted(false);
        button_two.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_two.setName(""); // NOI18N
        button_two.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_two.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_twoActionPerformed(evt);
            }
        });
        base_buttons.add(button_two, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 50, 50));

        button_plus.setBackground(new java.awt.Color(253, 250, 250));
        button_plus.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_plus.setForeground(new java.awt.Color(227, 109, 143));
        button_plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_plus.setText("+");
        button_plus.setBorder(null);
        button_plus.setBorderPainted(false);
        button_plus.setFocusPainted(false);
        button_plus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_plus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_plus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up_pressed.png"))); // NOI18N
        button_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_plusActionPerformed(evt);
            }
        });
        base_buttons.add(button_plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 50, 50));

        button_zero.setBackground(new java.awt.Color(253, 250, 250));
        button_zero.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_zero.setForeground(new java.awt.Color(43, 47, 55));
        button_zero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_zero.setText("0");
        button_zero.setBorder(null);
        button_zero.setBorderPainted(false);
        button_zero.setFocusPainted(false);
        button_zero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_zero.setName(""); // NOI18N
        button_zero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_zero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_zeroActionPerformed(evt);
            }
        });
        base_buttons.add(button_zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 50, 50));

        button_dot.setBackground(new java.awt.Color(253, 250, 250));
        button_dot.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_dot.setForeground(new java.awt.Color(43, 47, 55));
        button_dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_dot.setText(".");
        button_dot.setBorder(null);
        button_dot.setBorderPainted(false);
        button_dot.setFocusPainted(false);
        button_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_dot.setName(""); // NOI18N
        button_dot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink.png"))); // NOI18N
        button_dot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_pink_up.png"))); // NOI18N
        button_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_dotActionPerformed(evt);
            }
        });
        base_buttons.add(button_dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 50, 50));

        button_equal.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        button_equal.setForeground(new java.awt.Color(255, 255, 255));
        button_equal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/equal_button.png"))); // NOI18N
        button_equal.setText("=");
        button_equal.setAlignmentY(0.0F);
        button_equal.setBorder(null);
        button_equal.setBorderPainted(false);
        button_equal.setContentAreaFilled(false);
        button_equal.setFocusPainted(false);
        button_equal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_equal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/equal_button.png"))); // NOI18N
        button_equal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/equal_button_pressed.png"))); // NOI18N
        button_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_equalActionPerformed(evt);
            }
        });
        base_buttons.add(button_equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 70, 50));

        buttons.add(base_buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 320, 430));

        base_buttons_bg.setBackground(new java.awt.Color(255, 255, 255));
        base_buttons_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base_buttons_pink.png"))); // NOI18N
        buttons.add(base_buttons_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 320, 430));

        base_calculator.add(buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 380, 500));

        change_theme.setBackground(new java.awt.Color(255, 255, 255));
        change_theme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sun.png"))); // NOI18N
        change_theme.setBorderPainted(false);
        change_theme.setFocusPainted(false);
        change_theme.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        change_theme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_themeActionPerformed(evt);
            }
        });
        base_calculator.add(change_theme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 40));

        button_exit.setBackground(new java.awt.Color(255, 255, 255));
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_red_normal.png"))); // NOI18N
        button_exit.setBorder(null);
        button_exit.setBorderPainted(false);
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });
        base_calculator.add(button_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 15, 15));

        button_minimize.setBackground(new java.awt.Color(255, 255, 255));
        button_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_yellow_normal.png"))); // NOI18N
        button_minimize.setBorder(null);
        button_minimize.setBorderPainted(false);
        button_minimize.setFocusPainted(false);
        button_minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_minimizeActionPerformed(evt);
            }
        });
        base_calculator.add(button_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 5, 15, 15));

        getContentPane().add(base_calculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dotActionPerformed
        addNumber(".");
        button_equal.doClick();
    }//GEN-LAST:event_button_dotActionPerformed

    private void button_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cActionPerformed
        text_operation.setText("");
        text_result.setText("0");
    }//GEN-LAST:event_button_cActionPerformed

    private void button_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_oneActionPerformed
        addNumber("1");
        button_equal.doClick();
    }//GEN-LAST:event_button_oneActionPerformed

    private void button_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_twoActionPerformed
        addNumber("2");
        button_equal.doClick();
    }//GEN-LAST:event_button_twoActionPerformed

    private void button_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_threeActionPerformed
        addNumber("3");
        button_equal.doClick();
    }//GEN-LAST:event_button_threeActionPerformed

    private void button_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_fourActionPerformed
        addNumber("4");
        button_equal.doClick();
    }//GEN-LAST:event_button_fourActionPerformed

    private void button_fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_fiveActionPerformed
        addNumber("5");
        button_equal.doClick();
    }//GEN-LAST:event_button_fiveActionPerformed

    private void button_sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sixActionPerformed
        addNumber("6");
        button_equal.doClick();
    }//GEN-LAST:event_button_sixActionPerformed

    private void button_sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sevenActionPerformed
        addNumber("7");
        button_equal.doClick();
    }//GEN-LAST:event_button_sevenActionPerformed

    private void button_eigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_eigthActionPerformed
        addNumber("8");
        button_equal.doClick();
    }//GEN-LAST:event_button_eigthActionPerformed

    private void button_nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_nineActionPerformed
        addNumber("9");
        button_equal.doClick();
    }//GEN-LAST:event_button_nineActionPerformed

    private void button_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_zeroActionPerformed
        addNumber("0");
        button_equal.doClick();
    }//GEN-LAST:event_button_zeroActionPerformed

    private void button_deleteLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteLastActionPerformed
        String operation = text_operation.getText().substring(0, text_operation.getText().length() - 1);
        text_operation.setText(operation);
        button_equal.doClick();
    }//GEN-LAST:event_button_deleteLastActionPerformed

    private void button_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_percentageActionPerformed
        addNumber("%");
    }//GEN-LAST:event_button_percentageActionPerformed

    private void button_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_divisionActionPerformed
        addNumber("/");
    }//GEN-LAST:event_button_divisionActionPerformed

    private void button_multiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_multiplicationActionPerformed
        addNumber("*");
    }//GEN-LAST:event_button_multiplicationActionPerformed

    private void button_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_minusActionPerformed
        addNumber("-");
    }//GEN-LAST:event_button_minusActionPerformed

    private void button_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_plusActionPerformed
        addNumber("+");
    }//GEN-LAST:event_button_plusActionPerformed

    private void button_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_equalActionPerformed
        
        try {
            String result = se.eval(text_operation.getText()).toString();
            text_result.setText(result);
        } catch (Exception e) {
            // button_c.doClick();
        }
        
    }//GEN-LAST:event_button_equalActionPerformed

    boolean dark_mode = false;
    
    private void change_themeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_themeActionPerformed
        
        if(!dark_mode)
        {        
            base_calculator.setBackground(Color.decode("#2d323a"));
            base_information.setBackground(Color.decode("#2d323a"));
            buttons.setBackground(Color.decode("#2d323a"));
            base_buttons_bg.setIcon(new ImageIcon(getClass().getResource("/images/base_buttons_dark.png")));

            // Setting the dark mode in numerical buttons
            change_theme_numerical(button_zero);
            change_theme_numerical(button_one);
            change_theme_numerical(button_two);
            change_theme_numerical(button_three);
            change_theme_numerical(button_four);
            change_theme_numerical(button_five);
            change_theme_numerical(button_six);
            change_theme_numerical(button_seven);
            change_theme_numerical(button_eigth);
            change_theme_numerical(button_nine);
            change_theme_numerical(button_dot);

            // Setting the dark mode in operators buttons
            change_theme_operators(button_c);
            change_theme_operators(button_deleteLast);
            change_theme_operators(button_multiplication);
            change_theme_operators(button_plus);
            change_theme_operators(button_division);
            change_theme_operators(button_minus);
            change_theme_operators(button_percentage);

            // Setting the dark mode in equal button
            button_equal.setIcon(new ImageIcon(getClass().getResource("/images/equal_button_dark.png")));
            button_equal.setPressedIcon(new ImageIcon(getClass().getResource("/images/equal_button_dark.png")));
            button_equal.setRolloverIcon(new ImageIcon(getClass().getResource("/images/equal_button_pressed_dark.png")));
            
            // Setting the dark mode button
            change_theme.setIcon(new ImageIcon(getClass().getResource("/images/moon.png")));
            
            // Setting the exit and minimize button
            button_exit.setIcon(new ImageIcon(getClass().getResource("/images/button_red_dark.png")));
            button_minimize.setIcon(new ImageIcon(getClass().getResource("/images/button_yellow_dark.png")));
            
            dark_mode = true;
        } else{
            
            base_calculator.setBackground(Color.WHITE);
            base_information.setBackground(Color.WHITE);
            buttons.setBackground(Color.WHITE);
            base_buttons_bg.setIcon(new ImageIcon(getClass().getResource("/images/base_buttons_pink.png")));
            
            // Setting the normal mode in numerical buttons
            change_normal_numerical(button_zero);
            change_normal_numerical(button_one);
            change_normal_numerical(button_two);
            change_normal_numerical(button_three);
            change_normal_numerical(button_four);
            change_normal_numerical(button_five);
            change_normal_numerical(button_six);
            change_normal_numerical(button_seven);
            change_normal_numerical(button_eigth);
            change_normal_numerical(button_nine);
            change_normal_numerical(button_dot);
            
            // Setting the dark mode in operators buttons
            change_normal_operators(button_c);
            change_normal_operators(button_deleteLast);
            change_normal_operators(button_multiplication);
            change_normal_operators(button_plus);
            change_normal_operators(button_division);
            change_normal_operators(button_minus);
            change_normal_operators(button_percentage);
            
            // Setting the dark mode in equal button
            button_equal.setIcon(new ImageIcon(getClass().getResource("/images/equal_button.png")));
            button_equal.setPressedIcon(new ImageIcon(getClass().getResource("/images/equal_button.png")));
            button_equal.setRolloverIcon(new ImageIcon(getClass().getResource("/images/equal_button_pressed.png")));
            
            // Setting the dark mode button
            change_theme.setIcon(new ImageIcon(getClass().getResource("/images/sun.png")));
            
            // Setting the exit and minimize button
            button_exit.setIcon(new ImageIcon(getClass().getResource("/images/button_red_normal.png")));
            button_minimize.setIcon(new ImageIcon(getClass().getResource("/images/button_yellow_normal.png")));
            
            dark_mode = false;
        }
    }//GEN-LAST:event_change_themeActionPerformed

    private void button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_button_exitActionPerformed

    private void button_minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_minimizeActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_button_minimizeActionPerformed

    public void change_theme_numerical(JButton button){
        button.setIcon(new ImageIcon(getClass().getResource("/images/button_dark.png")));
        button.setPressedIcon(new ImageIcon(getClass().getResource("/images/button_dark.png")));
        button.setRolloverIcon(new ImageIcon(getClass().getResource("/images/button_dark_pressed.png")));
        button.setForeground(Color.WHITE);
    }
    
    public void change_normal_numerical(JButton button){
        button.setIcon(new ImageIcon(getClass().getResource("/images/button_pink.png")));
        button.setPressedIcon(new ImageIcon(getClass().getResource("/images/button_pink.png")));
        button.setRolloverIcon(new ImageIcon(getClass().getResource("/images/button_pink_up.png")));
        button.setForeground(Color.decode("#2B2F37"));
    }
    
    public void change_theme_operators(JButton button){
        button.setIcon(new ImageIcon(getClass().getResource("/images/button_dark_up.png")));
        button.setPressedIcon(new ImageIcon(getClass().getResource("/images/button_dark_up.png")));
        button.setRolloverIcon(new ImageIcon(getClass().getResource("/images/button_pink_up_pressed_dark.png")));
    }
    
    public void change_normal_operators(JButton button){
        button.setIcon(new ImageIcon(getClass().getResource("/images/button_pink_up.png")));
        button.setPressedIcon(new ImageIcon(getClass().getResource("/images/button_pink_up.png")));
        button.setRolloverIcon(new ImageIcon(getClass().getResource("/images/button_pink_up_pressed.png")));
    }
  
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    
    public void addNumber(String digit){
        text_operation.setText(text_operation.getText() + digit);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base_buttons;
    private javax.swing.JLabel base_buttons_bg;
    private javax.swing.JPanel base_calculator;
    private javax.swing.JPanel base_information;
    private javax.swing.JButton button_c;
    private javax.swing.JButton button_deleteLast;
    private javax.swing.JButton button_division;
    private javax.swing.JButton button_dot;
    private javax.swing.JButton button_eigth;
    private javax.swing.JButton button_equal;
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_five;
    private javax.swing.JButton button_four;
    private javax.swing.JButton button_minimize;
    private javax.swing.JButton button_minus;
    private javax.swing.JButton button_multiplication;
    private javax.swing.JButton button_nine;
    private javax.swing.JButton button_one;
    private javax.swing.JButton button_percentage;
    private javax.swing.JButton button_plus;
    private javax.swing.JButton button_seven;
    private javax.swing.JButton button_six;
    private javax.swing.JButton button_three;
    private javax.swing.JButton button_two;
    private javax.swing.JButton button_zero;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton change_theme;
    private javax.swing.JLabel text_operation;
    private javax.swing.JLabel text_result;
    // End of variables declaration//GEN-END:variables

}
