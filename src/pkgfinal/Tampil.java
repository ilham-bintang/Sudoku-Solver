/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ilham Bintang
 */
public class Tampil extends javax.swing.JFrame {
    private static int [][] puzzle = new int[2][2];
    public final javax.swing.JTextField Arr[][];
    int tampung[][] = new int[16][16];
    
 
    Thread tes;
    
    Color tua = new Color(28, 61, 68);
    Color muda = new Color(76, 175, 172);
    Color gold = new Color(247, 228, 149);
    
    public Tampil() {
        initComponents();
        this.Arr = new JTextField[16][16];
        isiNilai();
    }
private void isiNilai() {
        //Memasukkan nilai dari JTextField ke array pada panel A
        Arr[0][0] = a1;     Arr[0][1] = a2;     Arr[0][2] = a3;     Arr[0][3] = a4;
        Arr[1][0] = a5;     Arr[1][1] = a6;     Arr[1][2] = a7;     Arr[1][3] = a8;
        Arr[2][0] = a9;     Arr[2][1] = a10;    Arr[2][2] = a11;    Arr[2][3] = a12;
        Arr[3][0] = a13;    Arr[3][1] = a14;    Arr[3][2] = a15;    Arr[3][3] = a16;
        
        Arr[4][0] = a17;    Arr[4][1] = a18;    Arr[4][2] = a19;    Arr[4][3] = a20;
        Arr[5][0] = a21;    Arr[5][1] = a22;    Arr[5][2] = a23;    Arr[5][3] = a24;
        Arr[6][0] = a25;    Arr[6][1] = a26;    Arr[6][2] = a27;    Arr[6][3] = a28;
        Arr[7][0] = a29;    Arr[7][1] = a30;    Arr[7][2] = a31;    Arr[7][3] = a32;
        
        
        Arr[8][0] = a49;   Arr[8][1] = a50;   Arr[8][2] = a51;   Arr[8][3] = a52;
        Arr[9][0] = a53;   Arr[9][1] = a54;   Arr[9][2] = a55;   Arr[9][3] = a56;
        Arr[10][0] = a57;   Arr[10][1] = a58;   Arr[10][2] = a59;   Arr[10][3] = a60;
        Arr[11][0] = a61;   Arr[11][1] = a62;   Arr[11][2] = a63;   Arr[11][3] = a64;
        
        Arr[12][0] = a65;   Arr[12][1] = a66;   Arr[12][2] = a67;   Arr[12][3] = a68;
        Arr[13][0] = a69;   Arr[13][1] = a70;   Arr[13][2] = a71;   Arr[13][3] = a72;
        Arr[14][0] = a73;   Arr[14][1] = a74;   Arr[14][2] = a75;   Arr[14][3] = a76;
        Arr[15][0] = a77;   Arr[15][1] = a78;   Arr[15][2] = a79;   Arr[15][3] = a80;
        
        //Memasukkan nilai dari JTextField ke array pada panel B
        Arr[0][4] = b1;     Arr[0][5] = b2;     Arr[0][6] = b3;     Arr[0][7] = b4;
        Arr[1][4] = b5;     Arr[1][5] = b6;     Arr[1][6] = b7;     Arr[1][7] = b8;
        Arr[2][4] = b9;     Arr[2][5] = b10;    Arr[2][6] = b11;    Arr[2][7] = b12;
        Arr[3][4] = b13;    Arr[3][5] = b14;    Arr[3][6] = b15;    Arr[3][7] = b16;
        
        Arr[4][4] = b17;    Arr[4][5] = b18;    Arr[4][6] = b19;    Arr[4][7] = b20;
        Arr[5][4] = b21;    Arr[5][5] = b22;    Arr[5][6] = b23;    Arr[5][7] = b24;
        Arr[6][4] = b25;    Arr[6][5] = b26;    Arr[6][6] = b27;    Arr[6][7] = b28;
        Arr[7][4] = b29;    Arr[7][5] = b30;    Arr[7][6] = b31;    Arr[7][7] = b32;
        
        Arr[8][4] = b33;    Arr[8][5] = b34;    Arr[8][6] = b35;    Arr[8][7] = b36;
        Arr[9][4] = b37;    Arr[9][5] = b38;    Arr[9][6] = b39;    Arr[9][7] = b40;
        Arr[10][4] = b41;   Arr[10][5] = b42;   Arr[10][6] = b43;   Arr[10][7] = b44;
        Arr[11][4] = b45;   Arr[11][5] = b46;   Arr[11][6] = b47;   Arr[11][7] = b48;
        
        Arr[12][4] = b49;   Arr[12][5] = b50;   Arr[12][6] = b51;   Arr[12][7] = b52;
        Arr[13][4] = b53;   Arr[13][5] = b54;   Arr[13][6] = b55;   Arr[13][7] = b56;
        Arr[14][4] = b57;   Arr[14][5] = b58;   Arr[14][6] = b59;   Arr[14][7] = b60;
        Arr[15][4] = b61;   Arr[15][5] = b62;   Arr[15][6] = b63;   Arr[15][7] = b64;
        
        //Memasukkan nilai dari JTextField ke array pada panel C
        Arr[0][8] = c1;     Arr[0][9] = c2;     Arr[0][10] = c3;     Arr[0][11] = c4;
        Arr[1][8] = c5;     Arr[1][9] = c6;     Arr[1][10] = c7;     Arr[1][11] = c8;
        Arr[2][8] = c9;     Arr[2][9] = c10;    Arr[2][10] = c11;    Arr[2][11] = c12;
        Arr[3][8] = c13;    Arr[3][9] = c14;    Arr[3][10] = c15;    Arr[3][11] = c16;
        
        Arr[4][8] = c17;    Arr[4][9] = c18;    Arr[4][10] = c19;    Arr[4][11] = c20;
        Arr[5][8] = c21;    Arr[5][9] = c22;    Arr[5][10] = c23;    Arr[5][11] = c24;
        Arr[6][8] = c25;    Arr[6][9] = c26;    Arr[6][10] = c27;    Arr[6][11] = c28;
        Arr[7][8] = c29;    Arr[7][9] = c30;    Arr[7][10] = c31;    Arr[7][11] = c32;
       
        Arr[8][8] = c33;    Arr[8][9] = c34;    Arr[8][10] = c35;    Arr[8][11] = c36;
        Arr[9][8] = c37;    Arr[9][9] = c38;    Arr[9][10] = c39;    Arr[9][11] = c40;
        Arr[10][8] = c41;   Arr[10][9] = c42;   Arr[10][10] = c43;   Arr[10][11] = c44;
        Arr[11][8] = c45;   Arr[11][9] = c46;   Arr[11][10] = c47;   Arr[11][11] = c48;
       
        Arr[12][8] = c49;   Arr[12][9] = c50;   Arr[12][10] = c51;   Arr[12][11] = c52;
        Arr[13][8] = c53;   Arr[13][9] = c54;   Arr[13][10] = c55;   Arr[13][11] = c56;
        Arr[14][8] = c57;   Arr[14][9] = c58;   Arr[14][10] = c59;   Arr[14][11] = c60;
        Arr[15][8] = c61;   Arr[15][9] = c62;   Arr[15][10] = c63;   Arr[15][11] = c64;
        
        //Memasukkan nilai dari JTextField ke array pada panel D
        Arr[0][12] = d1;     Arr[0][13] = d2;     Arr[0][14] = d3;     Arr[0][15] = d4;
        Arr[1][12] = d5;     Arr[1][13] = d6;     Arr[1][14] = d7;     Arr[1][15] = d8;
        Arr[2][12] = d9;     Arr[2][13] = d10;    Arr[2][14] = d11;    Arr[2][15] = d12;
        Arr[3][12] = d13;    Arr[3][13] = d14;    Arr[3][14] = d15;    Arr[3][15] = d16;
        
        Arr[4][12] = d17;    Arr[4][13] = d18;    Arr[4][14] = d19;    Arr[4][15] = d20;
        Arr[5][12] = d21;    Arr[5][13] = d22;    Arr[5][14] = d23;    Arr[5][15] = d24;
        Arr[6][12] = d25;    Arr[6][13] = d26;    Arr[6][14] = d27;    Arr[6][15] = d28;
        Arr[7][12] = d29;    Arr[7][13] = d30;    Arr[7][14] = d31;    Arr[7][15] = d32;
       
        Arr[8][12] = d33;    Arr[8][13] = d34;    Arr[8][14] = d35;    Arr[8][15] = d36;
        Arr[9][12] = d37;    Arr[9][13] = d38;    Arr[9][14] = d39;    Arr[9][15] = d40;
        Arr[10][12] = d41;   Arr[10][13] = d42;   Arr[10][14] = d43;   Arr[10][15] = d44;
        Arr[11][12] = d45;   Arr[11][13] = d46;   Arr[11][14] = d47;   Arr[11][15] = d48;
       
        Arr[12][12] = d49;   Arr[12][13] = d50;   Arr[12][14] = d51;   Arr[12][15] = d52;
        Arr[13][12] = d53;   Arr[13][13] = d54;   Arr[13][14] = d55;   Arr[13][15] = d56;
        Arr[14][12] = d57;   Arr[14][13] = d58;   Arr[14][14] = d59;   Arr[14][15] = d60;
        Arr[15][12] = d61;   Arr[15][13] = d62;   Arr[15][14] = d63;   Arr[15][15] = d64;
    }

    public void reset() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                Arr[i][j].setText("");
                Arr[i][j].setForeground(gold);
            }
        }
        jLabel3.setText("WAKTU");
    }

    public void arrayKeInteger() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                if("".equals(Arr[i][j].getText())) {
                    tampung[i][j] = 0;
                    Arr[i][j].setForeground(muda);
                }
                else {
                     tampung[i][j] = Integer.parseInt(Arr[i][j].getText());
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        a1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        a4 = new javax.swing.JTextField();
        a5 = new javax.swing.JTextField();
        a6 = new javax.swing.JTextField();
        a7 = new javax.swing.JTextField();
        a8 = new javax.swing.JTextField();
        a9 = new javax.swing.JTextField();
        a10 = new javax.swing.JTextField();
        a11 = new javax.swing.JTextField();
        a12 = new javax.swing.JTextField();
        a13 = new javax.swing.JTextField();
        a14 = new javax.swing.JTextField();
        a15 = new javax.swing.JTextField();
        a16 = new javax.swing.JTextField();
        a17 = new javax.swing.JTextField();
        a18 = new javax.swing.JTextField();
        a19 = new javax.swing.JTextField();
        a20 = new javax.swing.JTextField();
        a21 = new javax.swing.JTextField();
        a22 = new javax.swing.JTextField();
        a23 = new javax.swing.JTextField();
        a24 = new javax.swing.JTextField();
        a25 = new javax.swing.JTextField();
        a26 = new javax.swing.JTextField();
        a27 = new javax.swing.JTextField();
        a28 = new javax.swing.JTextField();
        a29 = new javax.swing.JTextField();
        a30 = new javax.swing.JTextField();
        a31 = new javax.swing.JTextField();
        a32 = new javax.swing.JTextField();
        a49 = new javax.swing.JTextField();
        a50 = new javax.swing.JTextField();
        a51 = new javax.swing.JTextField();
        a52 = new javax.swing.JTextField();
        a53 = new javax.swing.JTextField();
        a54 = new javax.swing.JTextField();
        a55 = new javax.swing.JTextField();
        a56 = new javax.swing.JTextField();
        a57 = new javax.swing.JTextField();
        a58 = new javax.swing.JTextField();
        a59 = new javax.swing.JTextField();
        a60 = new javax.swing.JTextField();
        a61 = new javax.swing.JTextField();
        a62 = new javax.swing.JTextField();
        a63 = new javax.swing.JTextField();
        a64 = new javax.swing.JTextField();
        a65 = new javax.swing.JTextField();
        a66 = new javax.swing.JTextField();
        a67 = new javax.swing.JTextField();
        a68 = new javax.swing.JTextField();
        a69 = new javax.swing.JTextField();
        a70 = new javax.swing.JTextField();
        a71 = new javax.swing.JTextField();
        a72 = new javax.swing.JTextField();
        a73 = new javax.swing.JTextField();
        a74 = new javax.swing.JTextField();
        a75 = new javax.swing.JTextField();
        a76 = new javax.swing.JTextField();
        a77 = new javax.swing.JTextField();
        a78 = new javax.swing.JTextField();
        a79 = new javax.swing.JTextField();
        a80 = new javax.swing.JTextField();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        b4 = new javax.swing.JTextField();
        b5 = new javax.swing.JTextField();
        b6 = new javax.swing.JTextField();
        b7 = new javax.swing.JTextField();
        b8 = new javax.swing.JTextField();
        b9 = new javax.swing.JTextField();
        b10 = new javax.swing.JTextField();
        b11 = new javax.swing.JTextField();
        b12 = new javax.swing.JTextField();
        b13 = new javax.swing.JTextField();
        b14 = new javax.swing.JTextField();
        b15 = new javax.swing.JTextField();
        b16 = new javax.swing.JTextField();
        b17 = new javax.swing.JTextField();
        b18 = new javax.swing.JTextField();
        b19 = new javax.swing.JTextField();
        b20 = new javax.swing.JTextField();
        b21 = new javax.swing.JTextField();
        b22 = new javax.swing.JTextField();
        b23 = new javax.swing.JTextField();
        b24 = new javax.swing.JTextField();
        b25 = new javax.swing.JTextField();
        b26 = new javax.swing.JTextField();
        b27 = new javax.swing.JTextField();
        b28 = new javax.swing.JTextField();
        b29 = new javax.swing.JTextField();
        b30 = new javax.swing.JTextField();
        b31 = new javax.swing.JTextField();
        b32 = new javax.swing.JTextField();
        b33 = new javax.swing.JTextField();
        b34 = new javax.swing.JTextField();
        b35 = new javax.swing.JTextField();
        b36 = new javax.swing.JTextField();
        b37 = new javax.swing.JTextField();
        b38 = new javax.swing.JTextField();
        b39 = new javax.swing.JTextField();
        b40 = new javax.swing.JTextField();
        b41 = new javax.swing.JTextField();
        b42 = new javax.swing.JTextField();
        b43 = new javax.swing.JTextField();
        b44 = new javax.swing.JTextField();
        b45 = new javax.swing.JTextField();
        b46 = new javax.swing.JTextField();
        b47 = new javax.swing.JTextField();
        b48 = new javax.swing.JTextField();
        b49 = new javax.swing.JTextField();
        b50 = new javax.swing.JTextField();
        b51 = new javax.swing.JTextField();
        b52 = new javax.swing.JTextField();
        b53 = new javax.swing.JTextField();
        b54 = new javax.swing.JTextField();
        b55 = new javax.swing.JTextField();
        b56 = new javax.swing.JTextField();
        b57 = new javax.swing.JTextField();
        b58 = new javax.swing.JTextField();
        b59 = new javax.swing.JTextField();
        b60 = new javax.swing.JTextField();
        b61 = new javax.swing.JTextField();
        b62 = new javax.swing.JTextField();
        b63 = new javax.swing.JTextField();
        b64 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();
        c8 = new javax.swing.JTextField();
        c9 = new javax.swing.JTextField();
        c10 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        c13 = new javax.swing.JTextField();
        c14 = new javax.swing.JTextField();
        c15 = new javax.swing.JTextField();
        c16 = new javax.swing.JTextField();
        c17 = new javax.swing.JTextField();
        c18 = new javax.swing.JTextField();
        c19 = new javax.swing.JTextField();
        c20 = new javax.swing.JTextField();
        c21 = new javax.swing.JTextField();
        c22 = new javax.swing.JTextField();
        c23 = new javax.swing.JTextField();
        c24 = new javax.swing.JTextField();
        c25 = new javax.swing.JTextField();
        c26 = new javax.swing.JTextField();
        c27 = new javax.swing.JTextField();
        c28 = new javax.swing.JTextField();
        c29 = new javax.swing.JTextField();
        c30 = new javax.swing.JTextField();
        c31 = new javax.swing.JTextField();
        c32 = new javax.swing.JTextField();
        c33 = new javax.swing.JTextField();
        c34 = new javax.swing.JTextField();
        c35 = new javax.swing.JTextField();
        c36 = new javax.swing.JTextField();
        c37 = new javax.swing.JTextField();
        c38 = new javax.swing.JTextField();
        c39 = new javax.swing.JTextField();
        c40 = new javax.swing.JTextField();
        c41 = new javax.swing.JTextField();
        c42 = new javax.swing.JTextField();
        c43 = new javax.swing.JTextField();
        c44 = new javax.swing.JTextField();
        c45 = new javax.swing.JTextField();
        c46 = new javax.swing.JTextField();
        c47 = new javax.swing.JTextField();
        c48 = new javax.swing.JTextField();
        c49 = new javax.swing.JTextField();
        c50 = new javax.swing.JTextField();
        c51 = new javax.swing.JTextField();
        c52 = new javax.swing.JTextField();
        c53 = new javax.swing.JTextField();
        c54 = new javax.swing.JTextField();
        c55 = new javax.swing.JTextField();
        c56 = new javax.swing.JTextField();
        c57 = new javax.swing.JTextField();
        c58 = new javax.swing.JTextField();
        c59 = new javax.swing.JTextField();
        c60 = new javax.swing.JTextField();
        c61 = new javax.swing.JTextField();
        c62 = new javax.swing.JTextField();
        c63 = new javax.swing.JTextField();
        c64 = new javax.swing.JTextField();
        d1 = new javax.swing.JTextField();
        d2 = new javax.swing.JTextField();
        d3 = new javax.swing.JTextField();
        d4 = new javax.swing.JTextField();
        d5 = new javax.swing.JTextField();
        d6 = new javax.swing.JTextField();
        d7 = new javax.swing.JTextField();
        d8 = new javax.swing.JTextField();
        d9 = new javax.swing.JTextField();
        d10 = new javax.swing.JTextField();
        d11 = new javax.swing.JTextField();
        d12 = new javax.swing.JTextField();
        d13 = new javax.swing.JTextField();
        d14 = new javax.swing.JTextField();
        d15 = new javax.swing.JTextField();
        d16 = new javax.swing.JTextField();
        d17 = new javax.swing.JTextField();
        d18 = new javax.swing.JTextField();
        d19 = new javax.swing.JTextField();
        d20 = new javax.swing.JTextField();
        d21 = new javax.swing.JTextField();
        d22 = new javax.swing.JTextField();
        d23 = new javax.swing.JTextField();
        d24 = new javax.swing.JTextField();
        d25 = new javax.swing.JTextField();
        d26 = new javax.swing.JTextField();
        d27 = new javax.swing.JTextField();
        d28 = new javax.swing.JTextField();
        d29 = new javax.swing.JTextField();
        d30 = new javax.swing.JTextField();
        d31 = new javax.swing.JTextField();
        d32 = new javax.swing.JTextField();
        d33 = new javax.swing.JTextField();
        d34 = new javax.swing.JTextField();
        d35 = new javax.swing.JTextField();
        d36 = new javax.swing.JTextField();
        d37 = new javax.swing.JTextField();
        d38 = new javax.swing.JTextField();
        d39 = new javax.swing.JTextField();
        d40 = new javax.swing.JTextField();
        d41 = new javax.swing.JTextField();
        d42 = new javax.swing.JTextField();
        d43 = new javax.swing.JTextField();
        d44 = new javax.swing.JTextField();
        d45 = new javax.swing.JTextField();
        d46 = new javax.swing.JTextField();
        d47 = new javax.swing.JTextField();
        d48 = new javax.swing.JTextField();
        d49 = new javax.swing.JTextField();
        d50 = new javax.swing.JTextField();
        d51 = new javax.swing.JTextField();
        d52 = new javax.swing.JTextField();
        d53 = new javax.swing.JTextField();
        d54 = new javax.swing.JTextField();
        d55 = new javax.swing.JTextField();
        d56 = new javax.swing.JTextField();
        d57 = new javax.swing.JTextField();
        d58 = new javax.swing.JTextField();
        d59 = new javax.swing.JTextField();
        d60 = new javax.swing.JTextField();
        d61 = new javax.swing.JTextField();
        d62 = new javax.swing.JTextField();
        d63 = new javax.swing.JTextField();
        d64 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku Solver");
        setBackground(new java.awt.Color(101, 137, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(76, 175, 172));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(28, 61, 68));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 228, 149));
        jLabel1.setText("SUDOKU");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 175, 172));
        jLabel2.setText("SOLVER");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 175, 172));
        jLabel3.setText("WAKTU");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jPanel3.setBackground(new java.awt.Color(247, 228, 149));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 200, 3));

        jLabel4.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 175, 172));
        jLabel4.setText("Detik");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        jButton1.setBackground(new java.awt.Color(76, 175, 172));
        jButton1.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(28, 61, 68));
        jButton1.setText("ACAK");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 220, 40));

        jButton2.setBackground(new java.awt.Color(76, 175, 172));
        jButton2.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(28, 61, 68));
        jButton2.setText("SOLVE");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 220, 40));

        jButton3.setBackground(new java.awt.Color(76, 175, 172));
        jButton3.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(28, 61, 68));
        jButton3.setText("RESET");
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 565));

        a1.setBackground(new java.awt.Color(28, 61, 68));
        a1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a1.setForeground(new java.awt.Color(247, 228, 149));
        a1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a1.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 30, -1));

        a2.setBackground(new java.awt.Color(28, 61, 68));
        a2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a2.setForeground(new java.awt.Color(247, 228, 149));
        a2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a2.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, -1));

        a3.setBackground(new java.awt.Color(28, 61, 68));
        a3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a3.setForeground(new java.awt.Color(247, 228, 149));
        a3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a3.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, -1));

        a4.setBackground(new java.awt.Color(28, 61, 68));
        a4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a4.setForeground(new java.awt.Color(247, 228, 149));
        a4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a4.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, -1));

        a5.setBackground(new java.awt.Color(28, 61, 68));
        a5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a5.setForeground(new java.awt.Color(247, 228, 149));
        a5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a5.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 30, -1));

        a6.setBackground(new java.awt.Color(28, 61, 68));
        a6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a6.setForeground(new java.awt.Color(247, 228, 149));
        a6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a6.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 30, -1));

        a7.setBackground(new java.awt.Color(28, 61, 68));
        a7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a7.setForeground(new java.awt.Color(247, 228, 149));
        a7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a7.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 30, -1));

        a8.setBackground(new java.awt.Color(28, 61, 68));
        a8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a8.setForeground(new java.awt.Color(247, 228, 149));
        a8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a8.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 30, -1));

        a9.setBackground(new java.awt.Color(28, 61, 68));
        a9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a9.setForeground(new java.awt.Color(247, 228, 149));
        a9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a9.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 30, -1));

        a10.setBackground(new java.awt.Color(28, 61, 68));
        a10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a10.setForeground(new java.awt.Color(247, 228, 149));
        a10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a10.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 30, -1));

        a11.setBackground(new java.awt.Color(28, 61, 68));
        a11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a11.setForeground(new java.awt.Color(247, 228, 149));
        a11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a11.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 30, -1));

        a12.setBackground(new java.awt.Color(28, 61, 68));
        a12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a12.setForeground(new java.awt.Color(247, 228, 149));
        a12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a12.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 30, -1));

        a13.setBackground(new java.awt.Color(28, 61, 68));
        a13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a13.setForeground(new java.awt.Color(247, 228, 149));
        a13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a13.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 30, -1));

        a14.setBackground(new java.awt.Color(28, 61, 68));
        a14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a14.setForeground(new java.awt.Color(247, 228, 149));
        a14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a14.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 30, -1));

        a15.setBackground(new java.awt.Color(28, 61, 68));
        a15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a15.setForeground(new java.awt.Color(247, 228, 149));
        a15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a15.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 30, -1));

        a16.setBackground(new java.awt.Color(28, 61, 68));
        a16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a16.setForeground(new java.awt.Color(247, 228, 149));
        a16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a16.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 30, -1));

        a17.setBackground(new java.awt.Color(28, 61, 68));
        a17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a17.setForeground(new java.awt.Color(247, 228, 149));
        a17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a17.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 30, -1));

        a18.setBackground(new java.awt.Color(28, 61, 68));
        a18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a18.setForeground(new java.awt.Color(247, 228, 149));
        a18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a18.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 30, -1));

        a19.setBackground(new java.awt.Color(28, 61, 68));
        a19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a19.setForeground(new java.awt.Color(247, 228, 149));
        a19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a19.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 30, -1));

        a20.setBackground(new java.awt.Color(28, 61, 68));
        a20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a20.setForeground(new java.awt.Color(247, 228, 149));
        a20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a20.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 30, -1));

        a21.setBackground(new java.awt.Color(28, 61, 68));
        a21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a21.setForeground(new java.awt.Color(247, 228, 149));
        a21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a21.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 30, -1));

        a22.setBackground(new java.awt.Color(28, 61, 68));
        a22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a22.setForeground(new java.awt.Color(247, 228, 149));
        a22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a22.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 30, -1));

        a23.setBackground(new java.awt.Color(28, 61, 68));
        a23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a23.setForeground(new java.awt.Color(247, 228, 149));
        a23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a23.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 30, -1));

        a24.setBackground(new java.awt.Color(28, 61, 68));
        a24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a24.setForeground(new java.awt.Color(247, 228, 149));
        a24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a24.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, -1));

        a25.setBackground(new java.awt.Color(28, 61, 68));
        a25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a25.setForeground(new java.awt.Color(247, 228, 149));
        a25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a25.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 30, -1));

        a26.setBackground(new java.awt.Color(28, 61, 68));
        a26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a26.setForeground(new java.awt.Color(247, 228, 149));
        a26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a26.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 30, -1));

        a27.setBackground(new java.awt.Color(28, 61, 68));
        a27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a27.setForeground(new java.awt.Color(247, 228, 149));
        a27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a27.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 30, -1));

        a28.setBackground(new java.awt.Color(28, 61, 68));
        a28.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a28.setForeground(new java.awt.Color(247, 228, 149));
        a28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a28.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 30, -1));

        a29.setBackground(new java.awt.Color(28, 61, 68));
        a29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a29.setForeground(new java.awt.Color(247, 228, 149));
        a29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a29.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 30, -1));

        a30.setBackground(new java.awt.Color(28, 61, 68));
        a30.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a30.setForeground(new java.awt.Color(247, 228, 149));
        a30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a30.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a30, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 30, -1));

        a31.setBackground(new java.awt.Color(28, 61, 68));
        a31.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a31.setForeground(new java.awt.Color(247, 228, 149));
        a31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a31.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a31, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 30, -1));

        a32.setBackground(new java.awt.Color(28, 61, 68));
        a32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a32.setForeground(new java.awt.Color(247, 228, 149));
        a32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a32.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a32, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 30, -1));

        a49.setBackground(new java.awt.Color(28, 61, 68));
        a49.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a49.setForeground(new java.awt.Color(247, 228, 149));
        a49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a49.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 30, -1));

        a50.setBackground(new java.awt.Color(28, 61, 68));
        a50.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a50.setForeground(new java.awt.Color(247, 228, 149));
        a50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a50.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a50, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 30, -1));

        a51.setBackground(new java.awt.Color(28, 61, 68));
        a51.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a51.setForeground(new java.awt.Color(247, 228, 149));
        a51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a51.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a51, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 30, -1));

        a52.setBackground(new java.awt.Color(28, 61, 68));
        a52.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a52.setForeground(new java.awt.Color(247, 228, 149));
        a52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a52.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a52, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 30, -1));

        a53.setBackground(new java.awt.Color(28, 61, 68));
        a53.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a53.setForeground(new java.awt.Color(247, 228, 149));
        a53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a53.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a53, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 30, -1));

        a54.setBackground(new java.awt.Color(28, 61, 68));
        a54.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a54.setForeground(new java.awt.Color(247, 228, 149));
        a54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a54.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a54, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 30, -1));

        a55.setBackground(new java.awt.Color(28, 61, 68));
        a55.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a55.setForeground(new java.awt.Color(247, 228, 149));
        a55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a55.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a55, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 30, -1));

        a56.setBackground(new java.awt.Color(28, 61, 68));
        a56.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a56.setForeground(new java.awt.Color(247, 228, 149));
        a56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a56.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a56, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 30, -1));

        a57.setBackground(new java.awt.Color(28, 61, 68));
        a57.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a57.setForeground(new java.awt.Color(247, 228, 149));
        a57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a57.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a57, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 30, -1));

        a58.setBackground(new java.awt.Color(28, 61, 68));
        a58.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a58.setForeground(new java.awt.Color(247, 228, 149));
        a58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a58.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a58, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 30, -1));

        a59.setBackground(new java.awt.Color(28, 61, 68));
        a59.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a59.setForeground(new java.awt.Color(247, 228, 149));
        a59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a59.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a59, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 30, -1));

        a60.setBackground(new java.awt.Color(28, 61, 68));
        a60.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a60.setForeground(new java.awt.Color(247, 228, 149));
        a60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a60.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a60, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 30, -1));

        a61.setBackground(new java.awt.Color(28, 61, 68));
        a61.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a61.setForeground(new java.awt.Color(247, 228, 149));
        a61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a61.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a61, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 30, -1));

        a62.setBackground(new java.awt.Color(28, 61, 68));
        a62.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a62.setForeground(new java.awt.Color(247, 228, 149));
        a62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a62.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a62, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 30, -1));

        a63.setBackground(new java.awt.Color(28, 61, 68));
        a63.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a63.setForeground(new java.awt.Color(247, 228, 149));
        a63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a63.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a63, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 30, -1));

        a64.setBackground(new java.awt.Color(28, 61, 68));
        a64.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a64.setForeground(new java.awt.Color(247, 228, 149));
        a64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a64.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a64, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 30, -1));

        a65.setBackground(new java.awt.Color(28, 61, 68));
        a65.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a65.setForeground(new java.awt.Color(247, 228, 149));
        a65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a65.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a65, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 30, -1));

        a66.setBackground(new java.awt.Color(28, 61, 68));
        a66.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a66.setForeground(new java.awt.Color(247, 228, 149));
        a66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a66.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a66, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 30, -1));

        a67.setBackground(new java.awt.Color(28, 61, 68));
        a67.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a67.setForeground(new java.awt.Color(247, 228, 149));
        a67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a67.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a67, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 30, -1));

        a68.setBackground(new java.awt.Color(28, 61, 68));
        a68.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a68.setForeground(new java.awt.Color(247, 228, 149));
        a68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a68.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a68, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 30, -1));

        a69.setBackground(new java.awt.Color(28, 61, 68));
        a69.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a69.setForeground(new java.awt.Color(247, 228, 149));
        a69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a69.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a69, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 30, -1));

        a70.setBackground(new java.awt.Color(28, 61, 68));
        a70.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a70.setForeground(new java.awt.Color(247, 228, 149));
        a70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a70.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a70, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 30, -1));

        a71.setBackground(new java.awt.Color(28, 61, 68));
        a71.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a71.setForeground(new java.awt.Color(247, 228, 149));
        a71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a71.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a71, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 30, -1));

        a72.setBackground(new java.awt.Color(28, 61, 68));
        a72.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a72.setForeground(new java.awt.Color(247, 228, 149));
        a72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a72.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a72, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 30, -1));

        a73.setBackground(new java.awt.Color(28, 61, 68));
        a73.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a73.setForeground(new java.awt.Color(247, 228, 149));
        a73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a73.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a73, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 30, -1));

        a74.setBackground(new java.awt.Color(28, 61, 68));
        a74.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a74.setForeground(new java.awt.Color(247, 228, 149));
        a74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a74.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a74, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 30, -1));

        a75.setBackground(new java.awt.Color(28, 61, 68));
        a75.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a75.setForeground(new java.awt.Color(247, 228, 149));
        a75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a75.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a75, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 30, -1));

        a76.setBackground(new java.awt.Color(28, 61, 68));
        a76.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a76.setForeground(new java.awt.Color(247, 228, 149));
        a76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a76.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a76, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 30, -1));

        a77.setBackground(new java.awt.Color(28, 61, 68));
        a77.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a77.setForeground(new java.awt.Color(247, 228, 149));
        a77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a77.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a77, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 30, -1));

        a78.setBackground(new java.awt.Color(28, 61, 68));
        a78.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a78.setForeground(new java.awt.Color(247, 228, 149));
        a78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a78.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a78, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 30, -1));

        a79.setBackground(new java.awt.Color(28, 61, 68));
        a79.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a79.setForeground(new java.awt.Color(247, 228, 149));
        a79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a79.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a79, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 30, -1));

        a80.setBackground(new java.awt.Color(28, 61, 68));
        a80.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        a80.setForeground(new java.awt.Color(247, 228, 149));
        a80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        a80.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(a80, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 30, -1));

        b1.setBackground(new java.awt.Color(28, 61, 68));
        b1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(247, 228, 149));
        b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b1.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 30, -1));

        b2.setBackground(new java.awt.Color(28, 61, 68));
        b2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(247, 228, 149));
        b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b2.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 30, -1));

        b3.setBackground(new java.awt.Color(28, 61, 68));
        b3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b3.setForeground(new java.awt.Color(247, 228, 149));
        b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b3.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 30, -1));

        b4.setBackground(new java.awt.Color(28, 61, 68));
        b4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b4.setForeground(new java.awt.Color(247, 228, 149));
        b4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b4.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 30, -1));

        b5.setBackground(new java.awt.Color(28, 61, 68));
        b5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b5.setForeground(new java.awt.Color(247, 228, 149));
        b5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b5.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 30, -1));

        b6.setBackground(new java.awt.Color(28, 61, 68));
        b6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b6.setForeground(new java.awt.Color(247, 228, 149));
        b6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b6.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 30, -1));

        b7.setBackground(new java.awt.Color(28, 61, 68));
        b7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b7.setForeground(new java.awt.Color(247, 228, 149));
        b7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b7.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 30, -1));

        b8.setBackground(new java.awt.Color(28, 61, 68));
        b8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b8.setForeground(new java.awt.Color(247, 228, 149));
        b8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b8.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 30, -1));

        b9.setBackground(new java.awt.Color(28, 61, 68));
        b9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b9.setForeground(new java.awt.Color(247, 228, 149));
        b9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b9.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 30, -1));

        b10.setBackground(new java.awt.Color(28, 61, 68));
        b10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b10.setForeground(new java.awt.Color(247, 228, 149));
        b10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b10.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 30, -1));

        b11.setBackground(new java.awt.Color(28, 61, 68));
        b11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b11.setForeground(new java.awt.Color(247, 228, 149));
        b11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b11.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 30, -1));

        b12.setBackground(new java.awt.Color(28, 61, 68));
        b12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b12.setForeground(new java.awt.Color(247, 228, 149));
        b12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b12.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 30, -1));

        b13.setBackground(new java.awt.Color(28, 61, 68));
        b13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b13.setForeground(new java.awt.Color(247, 228, 149));
        b13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b13.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 30, -1));

        b14.setBackground(new java.awt.Color(28, 61, 68));
        b14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b14.setForeground(new java.awt.Color(247, 228, 149));
        b14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b14.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 30, -1));

        b15.setBackground(new java.awt.Color(28, 61, 68));
        b15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b15.setForeground(new java.awt.Color(247, 228, 149));
        b15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b15.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 30, -1));

        b16.setBackground(new java.awt.Color(28, 61, 68));
        b16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b16.setForeground(new java.awt.Color(247, 228, 149));
        b16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b16.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 30, -1));

        b17.setBackground(new java.awt.Color(28, 61, 68));
        b17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b17.setForeground(new java.awt.Color(247, 228, 149));
        b17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b17.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 30, -1));

        b18.setBackground(new java.awt.Color(28, 61, 68));
        b18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b18.setForeground(new java.awt.Color(247, 228, 149));
        b18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b18.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 30, -1));

        b19.setBackground(new java.awt.Color(28, 61, 68));
        b19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b19.setForeground(new java.awt.Color(247, 228, 149));
        b19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b19.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 30, -1));

        b20.setBackground(new java.awt.Color(28, 61, 68));
        b20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b20.setForeground(new java.awt.Color(247, 228, 149));
        b20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b20.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 30, -1));

        b21.setBackground(new java.awt.Color(28, 61, 68));
        b21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b21.setForeground(new java.awt.Color(247, 228, 149));
        b21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b21.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 30, -1));

        b22.setBackground(new java.awt.Color(28, 61, 68));
        b22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b22.setForeground(new java.awt.Color(247, 228, 149));
        b22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b22.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 30, -1));

        b23.setBackground(new java.awt.Color(28, 61, 68));
        b23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b23.setForeground(new java.awt.Color(247, 228, 149));
        b23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b23.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 30, -1));

        b24.setBackground(new java.awt.Color(28, 61, 68));
        b24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b24.setForeground(new java.awt.Color(247, 228, 149));
        b24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b24.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b24, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 30, -1));

        b25.setBackground(new java.awt.Color(28, 61, 68));
        b25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b25.setForeground(new java.awt.Color(247, 228, 149));
        b25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b25.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 30, -1));

        b26.setBackground(new java.awt.Color(28, 61, 68));
        b26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b26.setForeground(new java.awt.Color(247, 228, 149));
        b26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b26.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b26, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 30, -1));

        b27.setBackground(new java.awt.Color(28, 61, 68));
        b27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b27.setForeground(new java.awt.Color(247, 228, 149));
        b27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b27.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 30, -1));

        b28.setBackground(new java.awt.Color(28, 61, 68));
        b28.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b28.setForeground(new java.awt.Color(247, 228, 149));
        b28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b28.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 30, -1));

        b29.setBackground(new java.awt.Color(28, 61, 68));
        b29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b29.setForeground(new java.awt.Color(247, 228, 149));
        b29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b29.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 30, -1));

        b30.setBackground(new java.awt.Color(28, 61, 68));
        b30.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b30.setForeground(new java.awt.Color(247, 228, 149));
        b30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b30.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b30, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 30, -1));

        b31.setBackground(new java.awt.Color(28, 61, 68));
        b31.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b31.setForeground(new java.awt.Color(247, 228, 149));
        b31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b31.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 30, -1));

        b32.setBackground(new java.awt.Color(28, 61, 68));
        b32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b32.setForeground(new java.awt.Color(247, 228, 149));
        b32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b32.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b32, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 30, -1));

        b33.setBackground(new java.awt.Color(28, 61, 68));
        b33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b33.setForeground(new java.awt.Color(247, 228, 149));
        b33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b33.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b33, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 30, -1));

        b34.setBackground(new java.awt.Color(28, 61, 68));
        b34.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b34.setForeground(new java.awt.Color(247, 228, 149));
        b34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b34.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b34, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 30, -1));

        b35.setBackground(new java.awt.Color(28, 61, 68));
        b35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b35.setForeground(new java.awt.Color(247, 228, 149));
        b35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b35.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b35, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 30, -1));

        b36.setBackground(new java.awt.Color(28, 61, 68));
        b36.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b36.setForeground(new java.awt.Color(247, 228, 149));
        b36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b36.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b36, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 30, -1));

        b37.setBackground(new java.awt.Color(28, 61, 68));
        b37.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b37.setForeground(new java.awt.Color(247, 228, 149));
        b37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b37.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b37, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 30, -1));

        b38.setBackground(new java.awt.Color(28, 61, 68));
        b38.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b38.setForeground(new java.awt.Color(247, 228, 149));
        b38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b38.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b38, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 30, -1));

        b39.setBackground(new java.awt.Color(28, 61, 68));
        b39.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b39.setForeground(new java.awt.Color(247, 228, 149));
        b39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b39.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b39, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 30, -1));

        b40.setBackground(new java.awt.Color(28, 61, 68));
        b40.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b40.setForeground(new java.awt.Color(247, 228, 149));
        b40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b40.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b40, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 30, -1));

        b41.setBackground(new java.awt.Color(28, 61, 68));
        b41.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b41.setForeground(new java.awt.Color(247, 228, 149));
        b41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b41.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b41, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 30, -1));

        b42.setBackground(new java.awt.Color(28, 61, 68));
        b42.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b42.setForeground(new java.awt.Color(247, 228, 149));
        b42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b42.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b42, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 30, -1));

        b43.setBackground(new java.awt.Color(28, 61, 68));
        b43.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b43.setForeground(new java.awt.Color(247, 228, 149));
        b43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b43.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b43, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 30, -1));

        b44.setBackground(new java.awt.Color(28, 61, 68));
        b44.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b44.setForeground(new java.awt.Color(247, 228, 149));
        b44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b44.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b44, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 30, -1));

        b45.setBackground(new java.awt.Color(28, 61, 68));
        b45.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b45.setForeground(new java.awt.Color(247, 228, 149));
        b45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b45.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b45, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 30, -1));

        b46.setBackground(new java.awt.Color(28, 61, 68));
        b46.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b46.setForeground(new java.awt.Color(247, 228, 149));
        b46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b46.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b46, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 30, -1));

        b47.setBackground(new java.awt.Color(28, 61, 68));
        b47.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b47.setForeground(new java.awt.Color(247, 228, 149));
        b47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b47.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b47, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 30, -1));

        b48.setBackground(new java.awt.Color(28, 61, 68));
        b48.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b48.setForeground(new java.awt.Color(247, 228, 149));
        b48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b48.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b48, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 30, -1));

        b49.setBackground(new java.awt.Color(28, 61, 68));
        b49.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b49.setForeground(new java.awt.Color(247, 228, 149));
        b49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b49.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b49, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 30, -1));

        b50.setBackground(new java.awt.Color(28, 61, 68));
        b50.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b50.setForeground(new java.awt.Color(247, 228, 149));
        b50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b50.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b50, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 30, -1));

        b51.setBackground(new java.awt.Color(28, 61, 68));
        b51.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b51.setForeground(new java.awt.Color(247, 228, 149));
        b51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b51.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b51, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 30, -1));

        b52.setBackground(new java.awt.Color(28, 61, 68));
        b52.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b52.setForeground(new java.awt.Color(247, 228, 149));
        b52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b52.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b52, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 30, -1));

        b53.setBackground(new java.awt.Color(28, 61, 68));
        b53.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b53.setForeground(new java.awt.Color(247, 228, 149));
        b53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b53.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b53, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 30, -1));

        b54.setBackground(new java.awt.Color(28, 61, 68));
        b54.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b54.setForeground(new java.awt.Color(247, 228, 149));
        b54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b54.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b54, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 30, -1));

        b55.setBackground(new java.awt.Color(28, 61, 68));
        b55.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b55.setForeground(new java.awt.Color(247, 228, 149));
        b55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b55.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b55, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 30, -1));

        b56.setBackground(new java.awt.Color(28, 61, 68));
        b56.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b56.setForeground(new java.awt.Color(247, 228, 149));
        b56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b56.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b56, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 30, -1));

        b57.setBackground(new java.awt.Color(28, 61, 68));
        b57.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b57.setForeground(new java.awt.Color(247, 228, 149));
        b57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b57.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b57, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 30, -1));

        b58.setBackground(new java.awt.Color(28, 61, 68));
        b58.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b58.setForeground(new java.awt.Color(247, 228, 149));
        b58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b58.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b58, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 30, -1));

        b59.setBackground(new java.awt.Color(28, 61, 68));
        b59.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b59.setForeground(new java.awt.Color(247, 228, 149));
        b59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b59.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b59, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 30, -1));

        b60.setBackground(new java.awt.Color(28, 61, 68));
        b60.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b60.setForeground(new java.awt.Color(247, 228, 149));
        b60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b60.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b60, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 30, -1));

        b61.setBackground(new java.awt.Color(28, 61, 68));
        b61.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b61.setForeground(new java.awt.Color(247, 228, 149));
        b61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b61.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b61, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 30, -1));

        b62.setBackground(new java.awt.Color(28, 61, 68));
        b62.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b62.setForeground(new java.awt.Color(247, 228, 149));
        b62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b62.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b62, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 30, -1));

        b63.setBackground(new java.awt.Color(28, 61, 68));
        b63.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b63.setForeground(new java.awt.Color(247, 228, 149));
        b63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b63.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b63, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 30, -1));

        b64.setBackground(new java.awt.Color(28, 61, 68));
        b64.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b64.setForeground(new java.awt.Color(247, 228, 149));
        b64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        b64.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(b64, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 30, -1));

        c1.setBackground(new java.awt.Color(28, 61, 68));
        c1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c1.setForeground(new java.awt.Color(247, 228, 149));
        c1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c1.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, -1));

        c2.setBackground(new java.awt.Color(28, 61, 68));
        c2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c2.setForeground(new java.awt.Color(247, 228, 149));
        c2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c2.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 30, -1));

        c3.setBackground(new java.awt.Color(28, 61, 68));
        c3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c3.setForeground(new java.awt.Color(247, 228, 149));
        c3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c3.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 30, -1));

        c4.setBackground(new java.awt.Color(28, 61, 68));
        c4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c4.setForeground(new java.awt.Color(247, 228, 149));
        c4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c4.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 30, -1));

        c5.setBackground(new java.awt.Color(28, 61, 68));
        c5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c5.setForeground(new java.awt.Color(247, 228, 149));
        c5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c5.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 30, -1));

        c6.setBackground(new java.awt.Color(28, 61, 68));
        c6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c6.setForeground(new java.awt.Color(247, 228, 149));
        c6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c6.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 30, -1));

        c7.setBackground(new java.awt.Color(28, 61, 68));
        c7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c7.setForeground(new java.awt.Color(247, 228, 149));
        c7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c7.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 30, -1));

        c8.setBackground(new java.awt.Color(28, 61, 68));
        c8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c8.setForeground(new java.awt.Color(247, 228, 149));
        c8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c8.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 30, -1));

        c9.setBackground(new java.awt.Color(28, 61, 68));
        c9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c9.setForeground(new java.awt.Color(247, 228, 149));
        c9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c9.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 30, -1));

        c10.setBackground(new java.awt.Color(28, 61, 68));
        c10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c10.setForeground(new java.awt.Color(247, 228, 149));
        c10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c10.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 30, -1));

        c11.setBackground(new java.awt.Color(28, 61, 68));
        c11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c11.setForeground(new java.awt.Color(247, 228, 149));
        c11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c11.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 30, -1));

        c12.setBackground(new java.awt.Color(28, 61, 68));
        c12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c12.setForeground(new java.awt.Color(247, 228, 149));
        c12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c12.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 30, -1));

        c13.setBackground(new java.awt.Color(28, 61, 68));
        c13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c13.setForeground(new java.awt.Color(247, 228, 149));
        c13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c13.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 30, -1));

        c14.setBackground(new java.awt.Color(28, 61, 68));
        c14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c14.setForeground(new java.awt.Color(247, 228, 149));
        c14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c14.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 30, -1));

        c15.setBackground(new java.awt.Color(28, 61, 68));
        c15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c15.setForeground(new java.awt.Color(247, 228, 149));
        c15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c15.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 30, -1));

        c16.setBackground(new java.awt.Color(28, 61, 68));
        c16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c16.setForeground(new java.awt.Color(247, 228, 149));
        c16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c16.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 30, -1));

        c17.setBackground(new java.awt.Color(28, 61, 68));
        c17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c17.setForeground(new java.awt.Color(247, 228, 149));
        c17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c17.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 30, -1));

        c18.setBackground(new java.awt.Color(28, 61, 68));
        c18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c18.setForeground(new java.awt.Color(247, 228, 149));
        c18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c18.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 30, -1));

        c19.setBackground(new java.awt.Color(28, 61, 68));
        c19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c19.setForeground(new java.awt.Color(247, 228, 149));
        c19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c19.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 30, -1));

        c20.setBackground(new java.awt.Color(28, 61, 68));
        c20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c20.setForeground(new java.awt.Color(247, 228, 149));
        c20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c20.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 30, -1));

        c21.setBackground(new java.awt.Color(28, 61, 68));
        c21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c21.setForeground(new java.awt.Color(247, 228, 149));
        c21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c21.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c21, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 30, -1));

        c22.setBackground(new java.awt.Color(28, 61, 68));
        c22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c22.setForeground(new java.awt.Color(247, 228, 149));
        c22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c22.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c22, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 30, -1));

        c23.setBackground(new java.awt.Color(28, 61, 68));
        c23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c23.setForeground(new java.awt.Color(247, 228, 149));
        c23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c23.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c23, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 30, -1));

        c24.setBackground(new java.awt.Color(28, 61, 68));
        c24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c24.setForeground(new java.awt.Color(247, 228, 149));
        c24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c24.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c24, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 30, -1));

        c25.setBackground(new java.awt.Color(28, 61, 68));
        c25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c25.setForeground(new java.awt.Color(247, 228, 149));
        c25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c25.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c25, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 30, -1));

        c26.setBackground(new java.awt.Color(28, 61, 68));
        c26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c26.setForeground(new java.awt.Color(247, 228, 149));
        c26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c26.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c26, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 30, -1));

        c27.setBackground(new java.awt.Color(28, 61, 68));
        c27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c27.setForeground(new java.awt.Color(247, 228, 149));
        c27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c27.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c27, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 30, -1));

        c28.setBackground(new java.awt.Color(28, 61, 68));
        c28.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c28.setForeground(new java.awt.Color(247, 228, 149));
        c28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c28.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c28, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 30, -1));

        c29.setBackground(new java.awt.Color(28, 61, 68));
        c29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c29.setForeground(new java.awt.Color(247, 228, 149));
        c29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c29.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 30, -1));

        c30.setBackground(new java.awt.Color(28, 61, 68));
        c30.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c30.setForeground(new java.awt.Color(247, 228, 149));
        c30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c30.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c30, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 30, -1));

        c31.setBackground(new java.awt.Color(28, 61, 68));
        c31.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c31.setForeground(new java.awt.Color(247, 228, 149));
        c31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c31.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c31, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 30, -1));

        c32.setBackground(new java.awt.Color(28, 61, 68));
        c32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c32.setForeground(new java.awt.Color(247, 228, 149));
        c32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c32.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c32, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 30, -1));

        c33.setBackground(new java.awt.Color(28, 61, 68));
        c33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c33.setForeground(new java.awt.Color(247, 228, 149));
        c33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c33.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c33, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 30, -1));

        c34.setBackground(new java.awt.Color(28, 61, 68));
        c34.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c34.setForeground(new java.awt.Color(247, 228, 149));
        c34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c34.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c34, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 30, -1));

        c35.setBackground(new java.awt.Color(28, 61, 68));
        c35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c35.setForeground(new java.awt.Color(247, 228, 149));
        c35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c35.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c35, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 30, -1));

        c36.setBackground(new java.awt.Color(28, 61, 68));
        c36.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c36.setForeground(new java.awt.Color(247, 228, 149));
        c36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c36.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c36, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 30, -1));

        c37.setBackground(new java.awt.Color(28, 61, 68));
        c37.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c37.setForeground(new java.awt.Color(247, 228, 149));
        c37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c37.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c37, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 30, -1));

        c38.setBackground(new java.awt.Color(28, 61, 68));
        c38.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c38.setForeground(new java.awt.Color(247, 228, 149));
        c38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c38.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c38, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 30, -1));

        c39.setBackground(new java.awt.Color(28, 61, 68));
        c39.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c39.setForeground(new java.awt.Color(247, 228, 149));
        c39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c39.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c39, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 30, -1));

        c40.setBackground(new java.awt.Color(28, 61, 68));
        c40.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c40.setForeground(new java.awt.Color(247, 228, 149));
        c40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c40.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c40, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 30, -1));

        c41.setBackground(new java.awt.Color(28, 61, 68));
        c41.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c41.setForeground(new java.awt.Color(247, 228, 149));
        c41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c41.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c41, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 30, -1));

        c42.setBackground(new java.awt.Color(28, 61, 68));
        c42.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c42.setForeground(new java.awt.Color(247, 228, 149));
        c42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c42.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c42, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 30, -1));

        c43.setBackground(new java.awt.Color(28, 61, 68));
        c43.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c43.setForeground(new java.awt.Color(247, 228, 149));
        c43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c43.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c43, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 30, -1));

        c44.setBackground(new java.awt.Color(28, 61, 68));
        c44.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c44.setForeground(new java.awt.Color(247, 228, 149));
        c44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c44.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c44, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 30, -1));

        c45.setBackground(new java.awt.Color(28, 61, 68));
        c45.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c45.setForeground(new java.awt.Color(247, 228, 149));
        c45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c45.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c45, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 30, -1));

        c46.setBackground(new java.awt.Color(28, 61, 68));
        c46.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c46.setForeground(new java.awt.Color(247, 228, 149));
        c46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c46.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c46, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 30, -1));

        c47.setBackground(new java.awt.Color(28, 61, 68));
        c47.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c47.setForeground(new java.awt.Color(247, 228, 149));
        c47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c47.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c47, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 30, -1));

        c48.setBackground(new java.awt.Color(28, 61, 68));
        c48.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c48.setForeground(new java.awt.Color(247, 228, 149));
        c48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c48.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c48, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 30, -1));

        c49.setBackground(new java.awt.Color(28, 61, 68));
        c49.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c49.setForeground(new java.awt.Color(247, 228, 149));
        c49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c49.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c49, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 30, -1));

        c50.setBackground(new java.awt.Color(28, 61, 68));
        c50.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c50.setForeground(new java.awt.Color(247, 228, 149));
        c50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c50.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c50, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 30, -1));

        c51.setBackground(new java.awt.Color(28, 61, 68));
        c51.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c51.setForeground(new java.awt.Color(247, 228, 149));
        c51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c51.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c51, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 30, -1));

        c52.setBackground(new java.awt.Color(28, 61, 68));
        c52.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c52.setForeground(new java.awt.Color(247, 228, 149));
        c52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c52.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c52, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 30, -1));

        c53.setBackground(new java.awt.Color(28, 61, 68));
        c53.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c53.setForeground(new java.awt.Color(247, 228, 149));
        c53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c53.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c53, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 30, -1));

        c54.setBackground(new java.awt.Color(28, 61, 68));
        c54.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c54.setForeground(new java.awt.Color(247, 228, 149));
        c54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c54.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c54, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 30, -1));

        c55.setBackground(new java.awt.Color(28, 61, 68));
        c55.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c55.setForeground(new java.awt.Color(247, 228, 149));
        c55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c55.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c55, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 30, -1));

        c56.setBackground(new java.awt.Color(28, 61, 68));
        c56.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c56.setForeground(new java.awt.Color(247, 228, 149));
        c56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c56.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c56, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 30, -1));

        c57.setBackground(new java.awt.Color(28, 61, 68));
        c57.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c57.setForeground(new java.awt.Color(247, 228, 149));
        c57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c57.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c57, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 30, -1));

        c58.setBackground(new java.awt.Color(28, 61, 68));
        c58.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c58.setForeground(new java.awt.Color(247, 228, 149));
        c58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c58.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c58, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 30, -1));

        c59.setBackground(new java.awt.Color(28, 61, 68));
        c59.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c59.setForeground(new java.awt.Color(247, 228, 149));
        c59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c59.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c59, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 30, -1));

        c60.setBackground(new java.awt.Color(28, 61, 68));
        c60.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c60.setForeground(new java.awt.Color(247, 228, 149));
        c60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c60.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c60, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 30, -1));

        c61.setBackground(new java.awt.Color(28, 61, 68));
        c61.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c61.setForeground(new java.awt.Color(247, 228, 149));
        c61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c61.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c61, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 30, -1));

        c62.setBackground(new java.awt.Color(28, 61, 68));
        c62.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c62.setForeground(new java.awt.Color(247, 228, 149));
        c62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c62.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c62, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 30, -1));

        c63.setBackground(new java.awt.Color(28, 61, 68));
        c63.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c63.setForeground(new java.awt.Color(247, 228, 149));
        c63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c63.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c63, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 30, -1));

        c64.setBackground(new java.awt.Color(28, 61, 68));
        c64.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        c64.setForeground(new java.awt.Color(247, 228, 149));
        c64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        c64.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(c64, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 30, -1));

        d1.setBackground(new java.awt.Color(28, 61, 68));
        d1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d1.setForeground(new java.awt.Color(247, 228, 149));
        d1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d1.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 30, -1));

        d2.setBackground(new java.awt.Color(28, 61, 68));
        d2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d2.setForeground(new java.awt.Color(247, 228, 149));
        d2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d2.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 30, -1));

        d3.setBackground(new java.awt.Color(28, 61, 68));
        d3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d3.setForeground(new java.awt.Color(247, 228, 149));
        d3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d3.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 30, -1));

        d4.setBackground(new java.awt.Color(28, 61, 68));
        d4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d4.setForeground(new java.awt.Color(247, 228, 149));
        d4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d4.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 30, -1));

        d5.setBackground(new java.awt.Color(28, 61, 68));
        d5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d5.setForeground(new java.awt.Color(247, 228, 149));
        d5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d5.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 30, -1));

        d6.setBackground(new java.awt.Color(28, 61, 68));
        d6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d6.setForeground(new java.awt.Color(247, 228, 149));
        d6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d6.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 30, -1));

        d7.setBackground(new java.awt.Color(28, 61, 68));
        d7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d7.setForeground(new java.awt.Color(247, 228, 149));
        d7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d7.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 30, -1));

        d8.setBackground(new java.awt.Color(28, 61, 68));
        d8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d8.setForeground(new java.awt.Color(247, 228, 149));
        d8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d8.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 30, -1));

        d9.setBackground(new java.awt.Color(28, 61, 68));
        d9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d9.setForeground(new java.awt.Color(247, 228, 149));
        d9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d9.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 30, -1));

        d10.setBackground(new java.awt.Color(28, 61, 68));
        d10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d10.setForeground(new java.awt.Color(247, 228, 149));
        d10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d10.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 30, -1));

        d11.setBackground(new java.awt.Color(28, 61, 68));
        d11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d11.setForeground(new java.awt.Color(247, 228, 149));
        d11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d11.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 30, -1));

        d12.setBackground(new java.awt.Color(28, 61, 68));
        d12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d12.setForeground(new java.awt.Color(247, 228, 149));
        d12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d12.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 30, -1));

        d13.setBackground(new java.awt.Color(28, 61, 68));
        d13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d13.setForeground(new java.awt.Color(247, 228, 149));
        d13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d13.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 30, -1));

        d14.setBackground(new java.awt.Color(28, 61, 68));
        d14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d14.setForeground(new java.awt.Color(247, 228, 149));
        d14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d14.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 30, -1));

        d15.setBackground(new java.awt.Color(28, 61, 68));
        d15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d15.setForeground(new java.awt.Color(247, 228, 149));
        d15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d15.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d15, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 30, -1));

        d16.setBackground(new java.awt.Color(28, 61, 68));
        d16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d16.setForeground(new java.awt.Color(247, 228, 149));
        d16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d16.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 30, -1));

        d17.setBackground(new java.awt.Color(28, 61, 68));
        d17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d17.setForeground(new java.awt.Color(247, 228, 149));
        d17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d17.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 30, -1));

        d18.setBackground(new java.awt.Color(28, 61, 68));
        d18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d18.setForeground(new java.awt.Color(247, 228, 149));
        d18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d18.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d18, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 30, -1));

        d19.setBackground(new java.awt.Color(28, 61, 68));
        d19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d19.setForeground(new java.awt.Color(247, 228, 149));
        d19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d19.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d19, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 30, -1));

        d20.setBackground(new java.awt.Color(28, 61, 68));
        d20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d20.setForeground(new java.awt.Color(247, 228, 149));
        d20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d20.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d20, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 30, -1));

        d21.setBackground(new java.awt.Color(28, 61, 68));
        d21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d21.setForeground(new java.awt.Color(247, 228, 149));
        d21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d21.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d21, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 30, -1));

        d22.setBackground(new java.awt.Color(28, 61, 68));
        d22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d22.setForeground(new java.awt.Color(247, 228, 149));
        d22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d22.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d22, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 30, -1));

        d23.setBackground(new java.awt.Color(28, 61, 68));
        d23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d23.setForeground(new java.awt.Color(247, 228, 149));
        d23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d23.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d23, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 30, -1));

        d24.setBackground(new java.awt.Color(28, 61, 68));
        d24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d24.setForeground(new java.awt.Color(247, 228, 149));
        d24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d24.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d24, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 30, -1));

        d25.setBackground(new java.awt.Color(28, 61, 68));
        d25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d25.setForeground(new java.awt.Color(247, 228, 149));
        d25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d25.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d25, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 30, -1));

        d26.setBackground(new java.awt.Color(28, 61, 68));
        d26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d26.setForeground(new java.awt.Color(247, 228, 149));
        d26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d26.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d26, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 30, -1));

        d27.setBackground(new java.awt.Color(28, 61, 68));
        d27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d27.setForeground(new java.awt.Color(247, 228, 149));
        d27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d27.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d27, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 30, -1));

        d28.setBackground(new java.awt.Color(28, 61, 68));
        d28.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d28.setForeground(new java.awt.Color(247, 228, 149));
        d28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d28.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d28, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 30, -1));

        d29.setBackground(new java.awt.Color(28, 61, 68));
        d29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d29.setForeground(new java.awt.Color(247, 228, 149));
        d29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d29.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d29, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 30, -1));

        d30.setBackground(new java.awt.Color(28, 61, 68));
        d30.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d30.setForeground(new java.awt.Color(247, 228, 149));
        d30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d30.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d30, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 30, -1));

        d31.setBackground(new java.awt.Color(28, 61, 68));
        d31.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d31.setForeground(new java.awt.Color(247, 228, 149));
        d31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d31.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d31, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 30, -1));

        d32.setBackground(new java.awt.Color(28, 61, 68));
        d32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d32.setForeground(new java.awt.Color(247, 228, 149));
        d32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d32.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d32, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 30, -1));

        d33.setBackground(new java.awt.Color(28, 61, 68));
        d33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d33.setForeground(new java.awt.Color(247, 228, 149));
        d33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d33.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d33, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 30, -1));

        d34.setBackground(new java.awt.Color(28, 61, 68));
        d34.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d34.setForeground(new java.awt.Color(247, 228, 149));
        d34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d34.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d34, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 30, -1));

        d35.setBackground(new java.awt.Color(28, 61, 68));
        d35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d35.setForeground(new java.awt.Color(247, 228, 149));
        d35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d35.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d35, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 30, -1));

        d36.setBackground(new java.awt.Color(28, 61, 68));
        d36.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d36.setForeground(new java.awt.Color(247, 228, 149));
        d36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d36.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d36, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 30, -1));

        d37.setBackground(new java.awt.Color(28, 61, 68));
        d37.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d37.setForeground(new java.awt.Color(247, 228, 149));
        d37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d37.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d37, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 30, -1));

        d38.setBackground(new java.awt.Color(28, 61, 68));
        d38.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d38.setForeground(new java.awt.Color(247, 228, 149));
        d38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d38.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d38, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 30, -1));

        d39.setBackground(new java.awt.Color(28, 61, 68));
        d39.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d39.setForeground(new java.awt.Color(247, 228, 149));
        d39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d39.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d39, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 30, -1));

        d40.setBackground(new java.awt.Color(28, 61, 68));
        d40.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d40.setForeground(new java.awt.Color(247, 228, 149));
        d40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d40.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d40, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 30, -1));

        d41.setBackground(new java.awt.Color(28, 61, 68));
        d41.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d41.setForeground(new java.awt.Color(247, 228, 149));
        d41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d41.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d41, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 30, -1));

        d42.setBackground(new java.awt.Color(28, 61, 68));
        d42.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d42.setForeground(new java.awt.Color(247, 228, 149));
        d42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d42.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d42, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 30, -1));

        d43.setBackground(new java.awt.Color(28, 61, 68));
        d43.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d43.setForeground(new java.awt.Color(247, 228, 149));
        d43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d43.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d43, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 30, -1));

        d44.setBackground(new java.awt.Color(28, 61, 68));
        d44.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d44.setForeground(new java.awt.Color(247, 228, 149));
        d44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d44.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d44, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 30, -1));

        d45.setBackground(new java.awt.Color(28, 61, 68));
        d45.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d45.setForeground(new java.awt.Color(247, 228, 149));
        d45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d45.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d45, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 30, -1));

        d46.setBackground(new java.awt.Color(28, 61, 68));
        d46.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d46.setForeground(new java.awt.Color(247, 228, 149));
        d46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d46.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d46, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 30, -1));

        d47.setBackground(new java.awt.Color(28, 61, 68));
        d47.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d47.setForeground(new java.awt.Color(247, 228, 149));
        d47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d47.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d47, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 30, -1));

        d48.setBackground(new java.awt.Color(28, 61, 68));
        d48.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d48.setForeground(new java.awt.Color(247, 228, 149));
        d48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d48.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d48, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 30, -1));

        d49.setBackground(new java.awt.Color(28, 61, 68));
        d49.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d49.setForeground(new java.awt.Color(247, 228, 149));
        d49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d49.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d49, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 30, -1));

        d50.setBackground(new java.awt.Color(28, 61, 68));
        d50.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d50.setForeground(new java.awt.Color(247, 228, 149));
        d50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d50.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d50, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 30, -1));

        d51.setBackground(new java.awt.Color(28, 61, 68));
        d51.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d51.setForeground(new java.awt.Color(247, 228, 149));
        d51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d51.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d51, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, 30, -1));

        d52.setBackground(new java.awt.Color(28, 61, 68));
        d52.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d52.setForeground(new java.awt.Color(247, 228, 149));
        d52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d52.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d52, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, 30, -1));

        d53.setBackground(new java.awt.Color(28, 61, 68));
        d53.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d53.setForeground(new java.awt.Color(247, 228, 149));
        d53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d53.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d53, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 30, -1));

        d54.setBackground(new java.awt.Color(28, 61, 68));
        d54.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d54.setForeground(new java.awt.Color(247, 228, 149));
        d54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d54.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d54, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 30, -1));

        d55.setBackground(new java.awt.Color(28, 61, 68));
        d55.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d55.setForeground(new java.awt.Color(247, 228, 149));
        d55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d55.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d55, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 30, -1));

        d56.setBackground(new java.awt.Color(28, 61, 68));
        d56.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d56.setForeground(new java.awt.Color(247, 228, 149));
        d56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d56.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d56, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 30, -1));

        d57.setBackground(new java.awt.Color(28, 61, 68));
        d57.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d57.setForeground(new java.awt.Color(247, 228, 149));
        d57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d57.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d57, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 30, -1));

        d58.setBackground(new java.awt.Color(28, 61, 68));
        d58.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d58.setForeground(new java.awt.Color(247, 228, 149));
        d58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d58.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d58, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 30, -1));

        d59.setBackground(new java.awt.Color(28, 61, 68));
        d59.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d59.setForeground(new java.awt.Color(247, 228, 149));
        d59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d59.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d59, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 30, -1));

        d60.setBackground(new java.awt.Color(28, 61, 68));
        d60.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d60.setForeground(new java.awt.Color(247, 228, 149));
        d60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d60.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d60, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 30, -1));

        d61.setBackground(new java.awt.Color(28, 61, 68));
        d61.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d61.setForeground(new java.awt.Color(247, 228, 149));
        d61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d61.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d61, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 30, -1));

        d62.setBackground(new java.awt.Color(28, 61, 68));
        d62.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d62.setForeground(new java.awt.Color(247, 228, 149));
        d62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d62.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d62, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 30, -1));

        d63.setBackground(new java.awt.Color(28, 61, 68));
        d63.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d63.setForeground(new java.awt.Color(247, 228, 149));
        d63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d63.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d63, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, 30, -1));

        d64.setBackground(new java.awt.Color(28, 61, 68));
        d64.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        d64.setForeground(new java.awt.Color(247, 228, 149));
        d64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 61, 68), 2));
        d64.setCaretColor(new java.awt.Color(247, 228, 149));
        jPanel1.add(d64, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        isiNilai();
        arrayKeInteger();
        
        jLabel3.setText("WAKTU");
        
        tes = new Thread(new SudoThread(tampung, this, jLabel3));
        
        tes.start();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tes.stop();
        reset();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reset();
        
        Random random = new Random();	
        int baris,kolom;
        for (int c = 1; c <= 16; c++) {
                baris = random.nextInt((15 - 0) + 1) + 0;
                kolom = random.nextInt((15 - 0) + 1) + 0;
                Arr[baris][kolom].setText(Integer.toString(c));
                Arr[baris][kolom].setForeground(gold);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tampil gan = new Tampil();
                gan.setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a10;
    private javax.swing.JTextField a11;
    private javax.swing.JTextField a12;
    private javax.swing.JTextField a13;
    private javax.swing.JTextField a14;
    private javax.swing.JTextField a15;
    private javax.swing.JTextField a16;
    private javax.swing.JTextField a17;
    private javax.swing.JTextField a18;
    private javax.swing.JTextField a19;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a20;
    private javax.swing.JTextField a21;
    private javax.swing.JTextField a22;
    private javax.swing.JTextField a23;
    private javax.swing.JTextField a24;
    private javax.swing.JTextField a25;
    private javax.swing.JTextField a26;
    private javax.swing.JTextField a27;
    private javax.swing.JTextField a28;
    private javax.swing.JTextField a29;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField a30;
    private javax.swing.JTextField a31;
    private javax.swing.JTextField a32;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField a49;
    private javax.swing.JTextField a5;
    private javax.swing.JTextField a50;
    private javax.swing.JTextField a51;
    private javax.swing.JTextField a52;
    private javax.swing.JTextField a53;
    private javax.swing.JTextField a54;
    private javax.swing.JTextField a55;
    private javax.swing.JTextField a56;
    private javax.swing.JTextField a57;
    private javax.swing.JTextField a58;
    private javax.swing.JTextField a59;
    private javax.swing.JTextField a6;
    private javax.swing.JTextField a60;
    private javax.swing.JTextField a61;
    private javax.swing.JTextField a62;
    private javax.swing.JTextField a63;
    private javax.swing.JTextField a64;
    private javax.swing.JTextField a65;
    private javax.swing.JTextField a66;
    private javax.swing.JTextField a67;
    private javax.swing.JTextField a68;
    private javax.swing.JTextField a69;
    private javax.swing.JTextField a7;
    private javax.swing.JTextField a70;
    private javax.swing.JTextField a71;
    private javax.swing.JTextField a72;
    private javax.swing.JTextField a73;
    private javax.swing.JTextField a74;
    private javax.swing.JTextField a75;
    private javax.swing.JTextField a76;
    private javax.swing.JTextField a77;
    private javax.swing.JTextField a78;
    private javax.swing.JTextField a79;
    private javax.swing.JTextField a8;
    private javax.swing.JTextField a80;
    private javax.swing.JTextField a9;
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b10;
    private javax.swing.JTextField b11;
    private javax.swing.JTextField b12;
    private javax.swing.JTextField b13;
    private javax.swing.JTextField b14;
    private javax.swing.JTextField b15;
    private javax.swing.JTextField b16;
    private javax.swing.JTextField b17;
    private javax.swing.JTextField b18;
    private javax.swing.JTextField b19;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b20;
    private javax.swing.JTextField b21;
    private javax.swing.JTextField b22;
    private javax.swing.JTextField b23;
    private javax.swing.JTextField b24;
    private javax.swing.JTextField b25;
    private javax.swing.JTextField b26;
    private javax.swing.JTextField b27;
    private javax.swing.JTextField b28;
    private javax.swing.JTextField b29;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b30;
    private javax.swing.JTextField b31;
    private javax.swing.JTextField b32;
    private javax.swing.JTextField b33;
    private javax.swing.JTextField b34;
    private javax.swing.JTextField b35;
    private javax.swing.JTextField b36;
    private javax.swing.JTextField b37;
    private javax.swing.JTextField b38;
    private javax.swing.JTextField b39;
    private javax.swing.JTextField b4;
    private javax.swing.JTextField b40;
    private javax.swing.JTextField b41;
    private javax.swing.JTextField b42;
    private javax.swing.JTextField b43;
    private javax.swing.JTextField b44;
    private javax.swing.JTextField b45;
    private javax.swing.JTextField b46;
    private javax.swing.JTextField b47;
    private javax.swing.JTextField b48;
    private javax.swing.JTextField b49;
    private javax.swing.JTextField b5;
    private javax.swing.JTextField b50;
    private javax.swing.JTextField b51;
    private javax.swing.JTextField b52;
    private javax.swing.JTextField b53;
    private javax.swing.JTextField b54;
    private javax.swing.JTextField b55;
    private javax.swing.JTextField b56;
    private javax.swing.JTextField b57;
    private javax.swing.JTextField b58;
    private javax.swing.JTextField b59;
    private javax.swing.JTextField b6;
    private javax.swing.JTextField b60;
    private javax.swing.JTextField b61;
    private javax.swing.JTextField b62;
    private javax.swing.JTextField b63;
    private javax.swing.JTextField b64;
    private javax.swing.JTextField b7;
    private javax.swing.JTextField b8;
    private javax.swing.JTextField b9;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c10;
    private javax.swing.JTextField c11;
    private javax.swing.JTextField c12;
    private javax.swing.JTextField c13;
    private javax.swing.JTextField c14;
    private javax.swing.JTextField c15;
    private javax.swing.JTextField c16;
    private javax.swing.JTextField c17;
    private javax.swing.JTextField c18;
    private javax.swing.JTextField c19;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c20;
    private javax.swing.JTextField c21;
    private javax.swing.JTextField c22;
    private javax.swing.JTextField c23;
    private javax.swing.JTextField c24;
    private javax.swing.JTextField c25;
    private javax.swing.JTextField c26;
    private javax.swing.JTextField c27;
    private javax.swing.JTextField c28;
    private javax.swing.JTextField c29;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c30;
    private javax.swing.JTextField c31;
    private javax.swing.JTextField c32;
    private javax.swing.JTextField c33;
    private javax.swing.JTextField c34;
    private javax.swing.JTextField c35;
    private javax.swing.JTextField c36;
    private javax.swing.JTextField c37;
    private javax.swing.JTextField c38;
    private javax.swing.JTextField c39;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c40;
    private javax.swing.JTextField c41;
    private javax.swing.JTextField c42;
    private javax.swing.JTextField c43;
    private javax.swing.JTextField c44;
    private javax.swing.JTextField c45;
    private javax.swing.JTextField c46;
    private javax.swing.JTextField c47;
    private javax.swing.JTextField c48;
    private javax.swing.JTextField c49;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c50;
    private javax.swing.JTextField c51;
    private javax.swing.JTextField c52;
    private javax.swing.JTextField c53;
    private javax.swing.JTextField c54;
    private javax.swing.JTextField c55;
    private javax.swing.JTextField c56;
    private javax.swing.JTextField c57;
    private javax.swing.JTextField c58;
    private javax.swing.JTextField c59;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField c60;
    private javax.swing.JTextField c61;
    private javax.swing.JTextField c62;
    private javax.swing.JTextField c63;
    private javax.swing.JTextField c64;
    private javax.swing.JTextField c7;
    private javax.swing.JTextField c8;
    private javax.swing.JTextField c9;
    private javax.swing.JTextField d1;
    private javax.swing.JTextField d10;
    private javax.swing.JTextField d11;
    private javax.swing.JTextField d12;
    private javax.swing.JTextField d13;
    private javax.swing.JTextField d14;
    private javax.swing.JTextField d15;
    private javax.swing.JTextField d16;
    private javax.swing.JTextField d17;
    private javax.swing.JTextField d18;
    private javax.swing.JTextField d19;
    private javax.swing.JTextField d2;
    private javax.swing.JTextField d20;
    private javax.swing.JTextField d21;
    private javax.swing.JTextField d22;
    private javax.swing.JTextField d23;
    private javax.swing.JTextField d24;
    private javax.swing.JTextField d25;
    private javax.swing.JTextField d26;
    private javax.swing.JTextField d27;
    private javax.swing.JTextField d28;
    private javax.swing.JTextField d29;
    private javax.swing.JTextField d3;
    private javax.swing.JTextField d30;
    private javax.swing.JTextField d31;
    private javax.swing.JTextField d32;
    private javax.swing.JTextField d33;
    private javax.swing.JTextField d34;
    private javax.swing.JTextField d35;
    private javax.swing.JTextField d36;
    private javax.swing.JTextField d37;
    private javax.swing.JTextField d38;
    private javax.swing.JTextField d39;
    private javax.swing.JTextField d4;
    private javax.swing.JTextField d40;
    private javax.swing.JTextField d41;
    private javax.swing.JTextField d42;
    private javax.swing.JTextField d43;
    private javax.swing.JTextField d44;
    private javax.swing.JTextField d45;
    private javax.swing.JTextField d46;
    private javax.swing.JTextField d47;
    private javax.swing.JTextField d48;
    private javax.swing.JTextField d49;
    private javax.swing.JTextField d5;
    private javax.swing.JTextField d50;
    private javax.swing.JTextField d51;
    private javax.swing.JTextField d52;
    private javax.swing.JTextField d53;
    private javax.swing.JTextField d54;
    private javax.swing.JTextField d55;
    private javax.swing.JTextField d56;
    private javax.swing.JTextField d57;
    private javax.swing.JTextField d58;
    private javax.swing.JTextField d59;
    private javax.swing.JTextField d6;
    private javax.swing.JTextField d60;
    private javax.swing.JTextField d61;
    private javax.swing.JTextField d62;
    private javax.swing.JTextField d63;
    private javax.swing.JTextField d64;
    private javax.swing.JTextField d7;
    private javax.swing.JTextField d8;
    private javax.swing.JTextField d9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
