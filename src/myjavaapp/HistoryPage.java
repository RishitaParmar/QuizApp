/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavaapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Lenovo
 */
public class HistoryPage extends javax.swing.JFrame {
    
    public static int timer = 30;
    public static  int ans_given = 0;
    public  static int count = 0;
    String userans[][] = new String[2][1];
    
    
    
      String[] question = {
    "Q.1 When did the US declare their independence?",
     "Q.2 Which battle ended the war of Roses?",
     "Q.3 Which of the following Roman Emperors came first?",
     "Q.4 How many people were in the Apollo 11 mission to the moon?",
     "Q.5 Which treaty was signed at the end of World War I ?",
     "Q.6 The treaty of Srirangapatna was signed between Tipu Sultan and_______",
     "Q.7 Which Two of the great Mughals wrote their own memories?",
     "Q.8 The language of discourses of Gautama Buddha was_____",
     "Q.9 The Vedas contain all the truth was interpreted by",
     "Q.10 The weekly Commonweal was founded by______",
    };
    
    String[][] options = {
        {"1756","1766","1776","1786","1776"},
        {"Battle of Waterloo","Battle of Hastings","Battle of Verdun","Battle of Bosworth","Battle of Bosworth"},
        {"Claudius","Nero","Augustus","Titus","Augustus"},
        {"1","2","3","4","3"},
        {"Treaty of Paris","Treaty of Maastricht","Treaty of Versailles","Treaty of London","Treaty of Versailles"},
        {"Robert Clive","Cornwallis","Dalhousie","Warren Hastings","Cornwallis"},
        {"Babar and Humayun","Humayun and Jahangir","Babar and Jahangir","Jahangir and Shahjahan","Babar and Jahangir"},
        {"Bhojpuri","Magadhi","Pali","Sanskrit","Pali"},
        {"Swami Vivekananda","Swami Dayananda","Raja Rammohan Roy","None of the above","Swami Dayananda"},
        {"Annie Besant","Bipan Chandra Pal","Bal Gangadhar Tilak","Sarojini Naidu","Annie Besant"}
    };
    
     int index = 0, correct = 0;
     
     ButtonGroup bg = new ButtonGroup();
     
      int i = correct*5;
           int i1 = question.length*5;

    /**
     * Creates new form MyGKPage
     */
    public HistoryPage() {
        
        initComponents();
        
      
        
        bg.add(jRadioButton_op1);
        bg.add(jRadioButton_op2);
        bg.add(jRadioButton_op3);
        bg.add(jRadioButton_op4);
        
        jButton_NextActionPerformed(null);
        
        jButton_CheckAns.setEnabled(false);
        
        jButtonScore.setEnabled(false);
        
           int i = correct*5;
           int i1 = question.length*5;
    }
    
 /*   public void getAnswer(JRadioButton rbutton)
    {
        String selected = rbutton.getText();
        String correct1 = options[index][4];
        if(selected.equals(correct1)){
            correct++;
        }
        index++;
         //System.out.println(rbtn.getText());
        //System.out.println(options[index][4]);
        jLabel_correctAns.setText("Answer : " + correct1);
    }
    */
    
    
  /*  public void paint(Graphics g){
            super.paint(g);
            
     
            
            String time = "Time left : " + timer + " seconds";
            g.setColor(Color.RED);
            g.setFont(new Font("Tahoma", Font.BOLD, 18));
            
            if(timer > 0)
            {
                    g.drawString(time, 980, 330);
            }
            else{
                    g.drawString("Times Up", 980, 330);
            }
            timer--; //14
            
            try{
                    Thread.sleep(1000);
                    repaint();
            }
            catch(Exception e){
                    e.printStackTrace();
            }
            
            
            if(ans_given==1){
                    ans_given=0;
                    timer = 30;
            }
            else if(timer<0){
                    timer=30;
                    
                    
                    if(bg.getSelection()==null){
                            userans[count][0] = "";
                    }
                    else{
                            userans[count][0] = bg.getSelection().getActionCommand();
                    }
                    count++; //0    //1
                    //MyGKPage()
            }
    }
    */
    
    
    
    public void getSelectedOption(JRadioButton rbtn)
    {
        
        
        //"You Selected : " + rbtn.getText() + 
        jLabel_correctAns.setText("Correct Answer : " + options[index][4]);
        //jLabel_correctAns.setText(options[index][4]);
        if(rbtn.getText().equals(options[index][4]))
        {
                correct++;
        }
        
        index++;
        enableRbuttons(false);
    }
    
    public void enableRbuttons(boolean yes_or_no)
    {
        jRadioButton_op1.setEnabled(yes_or_no);
        jRadioButton_op2.setEnabled(yes_or_no);
        jRadioButton_op3.setEnabled(yes_or_no);
        jRadioButton_op4.setEnabled(yes_or_no);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_correctAns = new javax.swing.JLabel();
        jButton_Next = new javax.swing.JButton();
        jButtonQuit = new javax.swing.JButton();
        jButton_CheckAns = new javax.swing.JButton();
        jPanel_Question = new javax.swing.JPanel();
        jLabel_Que = new javax.swing.JLabel();
        jRadioButton_op1 = new javax.swing.JRadioButton();
        jRadioButton_op2 = new javax.swing.JRadioButton();
        jRadioButton_op4 = new javax.swing.JRadioButton();
        jRadioButton_op3 = new javax.swing.JRadioButton();
        jButtonScore = new javax.swing.JButton();

        jLabel15.setBackground(new java.awt.Color(153, 153, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjavaapp/BackArrow.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(153, 153, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjavaapp/Home.png"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(102, 102, 255));
        jLabel8.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HISTORY QUIZ");

        jLabel17.setBackground(new java.awt.Color(153, 153, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjavaapp/Home.png"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(153, 153, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjavaapp/BackArrow.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_correctAns.setFont(new java.awt.Font("Cambria", 1, 28)); // NOI18N
        jLabel_correctAns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_correctAns.setText("Correct Answer : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_correctAns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_correctAns, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_Next.setBackground(new java.awt.Color(51, 51, 255));
        jButton_Next.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Next.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Next.setText("Next");
        jButton_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextActionPerformed(evt);
            }
        });

        jButtonQuit.setBackground(new java.awt.Color(51, 51, 255));
        jButtonQuit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonQuit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonQuit.setText("Quit");
        jButtonQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitActionPerformed(evt);
            }
        });

        jButton_CheckAns.setBackground(new java.awt.Color(51, 51, 255));
        jButton_CheckAns.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_CheckAns.setForeground(new java.awt.Color(255, 255, 255));
        jButton_CheckAns.setText("Check Answer");
        jButton_CheckAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CheckAnsActionPerformed(evt);
            }
        });

        jPanel_Question.setBackground(new java.awt.Color(204, 204, 204));

        jLabel_Que.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Que.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Que.setText("jLabel1");

        javax.swing.GroupLayout jPanel_QuestionLayout = new javax.swing.GroupLayout(jPanel_Question);
        jPanel_Question.setLayout(jPanel_QuestionLayout);
        jPanel_QuestionLayout.setHorizontalGroup(
            jPanel_QuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_QuestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Que, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_QuestionLayout.setVerticalGroup(
            jPanel_QuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_QuestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Que, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        jRadioButton_op1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton_op1.setText("jRadioButton1");
        jRadioButton_op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_op1ActionPerformed(evt);
            }
        });

        jRadioButton_op2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton_op2.setText("jRadioButton2");
        jRadioButton_op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_op2ActionPerformed(evt);
            }
        });

        jRadioButton_op4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton_op4.setText("jRadioButton4");
        jRadioButton_op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_op4ActionPerformed(evt);
            }
        });

        jRadioButton_op3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton_op3.setText("jRadioButton3");
        jRadioButton_op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_op3ActionPerformed(evt);
            }
        });

        jButtonScore.setBackground(new java.awt.Color(51, 51, 255));
        jButtonScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonScore.setForeground(new java.awt.Color(255, 255, 255));
        jButtonScore.setText("Score");
        jButtonScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_op1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_op3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(206, 206, 206)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton_op2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jRadioButton_op4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButtonQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonScore, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(jButton_CheckAns, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_op1)
                    .addComponent(jRadioButton_op2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_op3)
                    .addComponent(jRadioButton_op4))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CheckAns, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonScore, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new MyHomePage().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new MyHomePage().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        new MyCategoryPage().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        new MyHomePage().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jButton_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NextActionPerformed
       
      
        
        if(jButton_Next.getText().equals("Restart Quiz"))
        {
                jButton_Next.setText("Next");
                jPanel_Question.setBackground(new java.awt.Color(204, 204, 204));
                index = 0;
                correct = 0;
        }
        
        if(index==question.length)
        {
              
                jLabel_Que.setText("Your Score: " + correct + "/" + question.length);
                if(correct > (float)question.length/2)
                {
                    jPanel_Question.setBackground(Color.GREEN);
                    jLabel_correctAns.setEnabled(false);
                    jButtonScore.setEnabled(true);
                }
                else
                {
                    jPanel_Question.setBackground(Color.RED);
                    jLabel_correctAns.setEnabled(false);
                    jButtonScore.setEnabled(true);
                }
                jButton_Next.setText("Restart Quiz");
        }
        
     /*   if(index<question.length)
        {
           
        }
     */
        else
        {
                 enableRbuttons(true);
        
                jLabel_Que.setText(question[index]);
                jRadioButton_op1.setText(options[index][0]);
                jRadioButton_op2.setText(options[index][1]);
                jRadioButton_op3.setText(options[index][2]);
                jRadioButton_op4.setText(options[index][3]);


                if(index==question.length-1)
                {
                    jButton_Next.setText("Result");
                }
                 
        }
        bg.clearSelection();
          
        /*if(jRadioButton_op1.isSelected()==false && jRadioButton_op2.isSelected()==false && jRadioButton_op3.isSelected()==false && jRadioButton_op4.isSelected()==false){
                    JOptionPane.showMessageDialog(null, "Please Select Option");
        }
        */
        
    }//GEN-LAST:event_jButton_NextActionPerformed

    private void jButtonQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitActionPerformed

       int dialogResult =  JOptionPane.showConfirmDialog(null, "Do You Want to Quit the Game ? ","Warning",JOptionPane.YES_NO_OPTION);
        
        if(dialogResult==JOptionPane.YES_OPTION)
            {
                 new MyCategoryPage().setVisible(true);
                setVisible(false);
            }
    /*    else{
                 new MyGKPage().setVisible(question[index]);
                setVisible(false);
        }*/
    }//GEN-LAST:event_jButtonQuitActionPerformed

    private void jButton_CheckAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CheckAnsActionPerformed
          //  System.out.println("");
    }//GEN-LAST:event_jButton_CheckAnsActionPerformed

    private void jRadioButton_op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_op3ActionPerformed
            getSelectedOption(jRadioButton_op3);
    }//GEN-LAST:event_jRadioButton_op3ActionPerformed

    private void jRadioButton_op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_op1ActionPerformed
            getSelectedOption(jRadioButton_op1);
    }//GEN-LAST:event_jRadioButton_op1ActionPerformed

    private void jRadioButton_op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_op2ActionPerformed
            getSelectedOption(jRadioButton_op2);
    }//GEN-LAST:event_jRadioButton_op2ActionPerformed

    private void jRadioButton_op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_op4ActionPerformed
            getSelectedOption(jRadioButton_op4);
    }//GEN-LAST:event_jRadioButton_op4ActionPerformed

    private void jButtonScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonScoreActionPerformed
       int i = correct*5;
           int i1 = question.length*5;

        /*new MyResultPage().setVisible(true);
        setVisible(false);*/
        
        JOptionPane.showMessageDialog(null, "Your Score: " + i+ "/"+ i1);
    }//GEN-LAST:event_jButtonScoreActionPerformed

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
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonQuit;
    private javax.swing.JButton jButtonScore;
    private javax.swing.JButton jButton_CheckAns;
    private javax.swing.JButton jButton_Next;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Que;
    private javax.swing.JLabel jLabel_correctAns;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_Question;
    private javax.swing.JRadioButton jRadioButton_op1;
    private javax.swing.JRadioButton jRadioButton_op2;
    private javax.swing.JRadioButton jRadioButton_op3;
    private javax.swing.JRadioButton jRadioButton_op4;
    // End of variables declaration//GEN-END:variables
}
