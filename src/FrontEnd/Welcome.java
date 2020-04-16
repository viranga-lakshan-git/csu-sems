package FrontEnd;

import BackEnd.Connectivity;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Welcome extends javax.swing.JFrame {
    private String username;
    private String level;
    private ResultSet rs;
    
    private int stdID;
    private String title;
    private String first_name;
    private String last_name;
    private String gender;
    private String dob;
    private String address;
    private int contact_number;
    private String email;
    
    private int lecID;
    private String lecTitle;
    private String lecFirst_name;
    private String lecLast_name;
    private String lecGender;
    private String lecAddress;
    private int lecContact_number;
    private String lecEmail;
    
    private int subjectID;
    private String subjectName;
    private int lecturerID;
    private String year;
    private String semester;
    
    public Welcome() {
        initComponents();
    }
    
    public Welcome(ResultSet rs, String level, String username ){
        initComponents();
        this.username = username;
        this.level = level;
        this.rs = rs;
        
        jLabelWelcomeUsername.setText(this.username);
        setLocationRelativeTo(null);
        
        jTabbedPane1.setVisible(false);
        jTabbedPane2.setVisible(false);
        jTabbedPane3.setVisible(false);
        jTabbedPane4.setVisible(false);
        jTabbedPane5.setVisible(false);
        
        if("admin".equals(this.level)){
            jButtonStdManage.setVisible(true);
            jToggleButtonLecManage.setVisible(true);
            jButtonSbjManage.setVisible(true);
            jButtonGenerateAdmission.setVisible(true);
            jButtonEnrollStd.setVisible(true);
        }
        if("student".equals(this.level)){
            jButtonStdManage.setVisible(true);
            jToggleButtonLecManage.setVisible(false);
            jButtonSbjManage.setVisible(false);
            jButtonGenerateAdmission.setVisible(true);
            jButtonEnrollStd.setVisible(true);
        }
        if("lecturer".equals(this.level)){
            jButtonStdManage.setVisible(false);
            jToggleButtonLecManage.setVisible(true);
            jButtonSbjManage.setVisible(true);
            jButtonGenerateAdmission.setVisible(false);
            jButtonEnrollStd.setVisible(false);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelWelcome = new javax.swing.JLabel();
        jLabelWelcomeUsername = new javax.swing.JLabel();
        jToggleButtonLogout = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonStdManage = new javax.swing.JButton();
        jToggleButtonLecManage = new javax.swing.JToggleButton();
        jButtonSbjManage = new javax.swing.JButton();
        jButtonGenerateAdmission = new javax.swing.JButton();
        jButtonEnrollStd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelManageStudent = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldContactNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jComboBoxTitle = new javax.swing.JComboBox();
        jComboBoxGender = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldDoB = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldStdID = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jPanelDeleteStudent = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldStudentID = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanelManageSubjects1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButtonAdd5 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextFieldSubName1 = new javax.swing.JTextField();
        jComboBoxYear1 = new javax.swing.JComboBox();
        jComboBoxSemester1 = new javax.swing.JComboBox();
        jLabel46 = new javax.swing.JLabel();
        jTextFieldLectID1 = new javax.swing.JTextField();
        jButtonAdd6 = new javax.swing.JButton();
        jTextFieldSubNo1 = new javax.swing.JTextField();
        jPanelDeleteSubject1 = new javax.swing.JPanel();
        jButtonDelt1 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jTextFieldsubno1 = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel22 = new javax.swing.JPanel();
        jPanelManageLecturer2 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jTextFieldAddress5 = new javax.swing.JTextField();
        jTextFieldFirstName5 = new javax.swing.JTextField();
        jTextFieldLastName5 = new javax.swing.JTextField();
        jTextFieldContactNo2 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jTextFieldEmail5 = new javax.swing.JTextField();
        jButtonAdd11 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jTextFieldLecID4 = new javax.swing.JTextField();
        jButtonReset7 = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        jComboBoxTitle5 = new javax.swing.JComboBox();
        jButtonUpdate5 = new javax.swing.JButton();
        jComboBoxGender5 = new javax.swing.JComboBox();
        jPanelDeleteLecturer2 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jTextFieldLecID5 = new javax.swing.JTextField();
        jButtonReset8 = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanelGenerateAdmissions3 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jTextFieldStudentID7 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane = new javax.swing.JTextPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanelEnrollToSubjects4 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel136 = new javax.swing.JLabel();
        jTextFieldEnrollStudentID = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        jTextFieldEnrollSubjectID = new javax.swing.JTextField();
        jButtonEnroll = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CSU Examination Management System");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWelcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelWelcome.setText("Welcome to the Student Examination Management System,");

        jLabelWelcomeUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jToggleButtonLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Laksh.LAKSH-HP\\Documents\\NetBeansProjects\\CSU_sems\\src\\Assets\\lock-icon.png")); // NOI18N
        jToggleButtonLogout.setText("Logout");
        jToggleButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLogoutActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("This is not you? ");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Laksh.LAKSH-HP\\Documents\\NetBeansProjects\\CSU_sems\\src\\Assets\\download (1).png")); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWelcomeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonLogout)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelWelcomeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelWelcome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel1))
        );

        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        jButtonStdManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/student.png"))); // NOI18N
        jButtonStdManage.setText("Student Management");
        jButtonStdManage.setMaximumSize(new java.awt.Dimension(250, 110));
        jButtonStdManage.setMinimumSize(new java.awt.Dimension(250, 110));
        jButtonStdManage.setPreferredSize(new java.awt.Dimension(250, 110));
        jButtonStdManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStdManageActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonStdManage);

        jToggleButtonLecManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/lecturer.png"))); // NOI18N
        jToggleButtonLecManage.setText("Lecturer Management");
        jToggleButtonLecManage.setFocusable(false);
        jToggleButtonLecManage.setMaximumSize(new java.awt.Dimension(250, 110));
        jToggleButtonLecManage.setMinimumSize(new java.awt.Dimension(250, 110));
        jToggleButtonLecManage.setPreferredSize(new java.awt.Dimension(250, 110));
        jToggleButtonLecManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLecManageActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButtonLecManage);

        jButtonSbjManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/subjects.png"))); // NOI18N
        jButtonSbjManage.setText("Subject Management");
        jButtonSbjManage.setMaximumSize(new java.awt.Dimension(250, 110));
        jButtonSbjManage.setMinimumSize(new java.awt.Dimension(250, 110));
        jButtonSbjManage.setPreferredSize(new java.awt.Dimension(250, 110));
        jButtonSbjManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSbjManageActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSbjManage);

        jButtonGenerateAdmission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/admission.png"))); // NOI18N
        jButtonGenerateAdmission.setText("Generate Admissions");
        jButtonGenerateAdmission.setMaximumSize(new java.awt.Dimension(250, 110));
        jButtonGenerateAdmission.setMinimumSize(new java.awt.Dimension(250, 110));
        jButtonGenerateAdmission.setPreferredSize(new java.awt.Dimension(250, 110));
        jButtonGenerateAdmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerateAdmissionActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonGenerateAdmission);

        jButtonEnrollStd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/enroll.png"))); // NOI18N
        jButtonEnrollStd.setText("Enroll To Subjects");
        jButtonEnrollStd.setMaximumSize(new java.awt.Dimension(250, 110));
        jButtonEnrollStd.setMinimumSize(new java.awt.Dimension(250, 110));
        jButtonEnrollStd.setPreferredSize(new java.awt.Dimension(250, 110));
        jButtonEnrollStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnrollStdActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonEnrollStd);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Gender");

        jLabel5.setText("Title");

        jLabel6.setText("Address");

        jLabel7.setText("Contact Number");

        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });

        jLabel8.setText("Email");

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jComboBoxTitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Miss.", "Mrs." }));
        jComboBoxTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTitleActionPerformed(evt);
            }
        });

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jComboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGenderActionPerformed(evt);
            }
        });

        jLabel9.setText("Date Of Birth");

        jButtonReset.setText("Clear");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabel11.setText("Student ID");

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldStdID)
                                    .addComponent(jComboBoxTitle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldFirstName)
                                    .addComponent(jTextFieldLastName)
                                    .addComponent(jComboBoxGender, 0, 175, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDoB)
                                    .addComponent(jTextFieldAddress)
                                    .addComponent(jTextFieldContactNumber)
                                    .addComponent(jTextFieldEmail)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel10)))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldStdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jLabel10))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonReset))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelManageStudentLayout = new javax.swing.GroupLayout(jPanelManageStudent);
        jPanelManageStudent.setLayout(jPanelManageStudentLayout);
        jPanelManageStudentLayout.setHorizontalGroup(
            jPanelManageStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelManageStudentLayout.setVerticalGroup(
            jPanelManageStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Student", jPanelManageStudent);

        jLabel12.setText("Student ID");

        jTextFieldStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStudentIDActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDeleteStudentLayout = new javax.swing.GroupLayout(jPanelDeleteStudent);
        jPanelDeleteStudent.setLayout(jPanelDeleteStudentLayout);
        jPanelDeleteStudentLayout.setHorizontalGroup(
            jPanelDeleteStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeleteStudentLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel12)
                .addGap(33, 33, 33)
                .addComponent(jTextFieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanelDeleteStudentLayout.setVerticalGroup(
            jPanelDeleteStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeleteStudentLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanelDeleteStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jButtonDelete))
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete Student", jPanelDeleteStudent);

        jButtonAdd5.setText("Add");
        jButtonAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd5ActionPerformed(evt);
            }
        });

        jLabel42.setText("Subject ID");

        jLabel43.setText("Subject Name");

        jLabel44.setText("Year");

        jLabel45.setText("Semester");

        jComboBoxYear1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year 1", "Year 2", "Year 3", "Year 4" }));

        jComboBoxSemester1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semester 1", "Semester 2", " " }));

        jLabel46.setText("LectureID");

        jButtonAdd6.setText("Update");
        jButtonAdd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd6ActionPerformed(evt);
            }
        });

        jTextFieldSubNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubNo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxYear1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxSemester1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButtonAdd5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonAdd6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42)
                            .addComponent(jLabel46))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldSubName1)
                            .addComponent(jTextFieldLectID1)
                            .addComponent(jTextFieldSubNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42)
                    .addComponent(jTextFieldSubNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jTextFieldSubName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLectID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jComboBoxSemester1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd5)
                    .addComponent(jButtonAdd6))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelManageSubjects1Layout = new javax.swing.GroupLayout(jPanelManageSubjects1);
        jPanelManageSubjects1.setLayout(jPanelManageSubjects1Layout);
        jPanelManageSubjects1Layout.setHorizontalGroup(
            jPanelManageSubjects1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageSubjects1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanelManageSubjects1Layout.setVerticalGroup(
            jPanelManageSubjects1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageSubjects1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jTabbedPane2.addTab("Manage Subjects", jPanelManageSubjects1);

        jButtonDelt1.setText("Delete");
        jButtonDelt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelt1ActionPerformed(evt);
            }
        });

        jLabel47.setText("Subject No");

        javax.swing.GroupLayout jPanelDeleteSubject1Layout = new javax.swing.GroupLayout(jPanelDeleteSubject1);
        jPanelDeleteSubject1.setLayout(jPanelDeleteSubject1Layout);
        jPanelDeleteSubject1Layout.setHorizontalGroup(
            jPanelDeleteSubject1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeleteSubject1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldsubno1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDelt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanelDeleteSubject1Layout.setVerticalGroup(
            jPanelDeleteSubject1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeleteSubject1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanelDeleteSubject1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextFieldsubno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelt1))
                .addContainerGap(334, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Delete Subject", jPanelDeleteSubject1);

        jLabel80.setText("First Name");

        jLabel81.setText("Last Name");

        jLabel82.setText("Gender");

        jLabel83.setText("Address");

        jLabel84.setText("Contact Number");

        jLabel85.setText("Email");

        jButtonAdd11.setText("Add");
        jButtonAdd11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd11ActionPerformed(evt);
            }
        });

        jLabel86.setText("Lecturer ID");

        jTextFieldLecID4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLecID4ActionPerformed(evt);
            }
        });

        jButtonReset7.setText("Clear");
        jButtonReset7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReset7ActionPerformed(evt);
            }
        });

        jLabel87.setText("Title");

        jComboBoxTitle5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Miss.", "Mrs." }));
        jComboBoxTitle5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTitle5ActionPerformed(evt);
            }
        });

        jButtonUpdate5.setText("Update");
        jButtonUpdate5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdate5ActionPerformed(evt);
            }
        });

        jComboBoxGender5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jComboBoxGender5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGender5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManageLecturer2Layout = new javax.swing.GroupLayout(jPanelManageLecturer2);
        jPanelManageLecturer2.setLayout(jPanelManageLecturer2Layout);
        jPanelManageLecturer2Layout.setHorizontalGroup(
            jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageLecturer2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86)
                    .addGroup(jPanelManageLecturer2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelManageLecturer2Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAddress5)
                                    .addComponent(jComboBoxTitle5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldFirstName5)
                                    .addComponent(jTextFieldLastName5)
                                    .addComponent(jComboBoxGender5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldContactNo2)
                                    .addComponent(jTextFieldLecID4)
                                    .addComponent(jTextFieldEmail5)))
                            .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel81)
                                .addComponent(jLabel80)
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelManageLecturer2Layout.createSequentialGroup()
                        .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManageLecturer2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAdd11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jButtonUpdate5, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonReset7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanelManageLecturer2Layout.setVerticalGroup(
            jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageLecturer2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jTextFieldLecID4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jComboBoxTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFirstName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80))
                .addGap(12, 12, 12)
                .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLastName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel82)
                    .addComponent(jComboBoxGender5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddress5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldContactNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85))
                .addGap(23, 23, 23)
                .addGroup(jPanelManageLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd11)
                    .addComponent(jButtonUpdate5)
                    .addComponent(jButtonReset7))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanelManageLecturer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelManageLecturer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Manage Lecturer", jPanel22);

        jButton11.setText("Delete");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Cancel");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel88.setText("Lecturer ID");

        jTextFieldLecID5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLecID5ActionPerformed(evt);
            }
        });

        jButtonReset8.setText("Reset");
        jButtonReset8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReset8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jTextFieldLecID5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReset8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jTextFieldLecID5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButtonReset8)
                    .addComponent(jButton12))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDeleteLecturer2Layout = new javax.swing.GroupLayout(jPanelDeleteLecturer2);
        jPanelDeleteLecturer2.setLayout(jPanelDeleteLecturer2Layout);
        jPanelDeleteLecturer2Layout.setHorizontalGroup(
            jPanelDeleteLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeleteLecturer2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        jPanelDeleteLecturer2Layout.setVerticalGroup(
            jPanelDeleteLecturer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeleteLecturer2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Delete Lecturer", jPanelDeleteLecturer2);

        jLabel106.setText("Student ID");

        jButton13.setText("Generate Admission");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jTextPane);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldStudentID7, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton13)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStudentID7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelGenerateAdmissions3Layout = new javax.swing.GroupLayout(jPanelGenerateAdmissions3);
        jPanelGenerateAdmissions3.setLayout(jPanelGenerateAdmissions3Layout);
        jPanelGenerateAdmissions3Layout.setHorizontalGroup(
            jPanelGenerateAdmissions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGenerateAdmissions3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanelGenerateAdmissions3Layout.setVerticalGroup(
            jPanelGenerateAdmissions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGenerateAdmissions3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Generate Admissions", jPanelGenerateAdmissions3);

        jLabel136.setText("Student ID");

        jTextFieldEnrollStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnrollStudentIDActionPerformed(evt);
            }
        });

        jLabel137.setText("Subjects ID");

        jButtonEnroll.setText("Enroll");
        jButtonEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnrollActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonEnroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEnrollStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jTextFieldEnrollSubjectID))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(jTextFieldEnrollStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel137)
                    .addComponent(jTextFieldEnrollSubjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEnroll)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelEnrollToSubjects4Layout = new javax.swing.GroupLayout(jPanelEnrollToSubjects4);
        jPanelEnrollToSubjects4.setLayout(jPanelEnrollToSubjects4Layout);
        jPanelEnrollToSubjects4Layout.setHorizontalGroup(
            jPanelEnrollToSubjects4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnrollToSubjects4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanelEnrollToSubjects4Layout.setVerticalGroup(
            jPanelEnrollToSubjects4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnrollToSubjects4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Enroll To Subjects", jPanelEnrollToSubjects4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLogoutActionPerformed
        Login lgin = new Login();
        lgin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonLogoutActionPerformed

    private void jButtonEnrollStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnrollStdActionPerformed
        jTabbedPane1.setVisible(false);
        jTabbedPane2.setVisible(false);
        jTabbedPane3.setVisible(false);
        jTabbedPane4.setVisible(false);
        jTabbedPane5.setVisible(true);
    }//GEN-LAST:event_jButtonEnrollStdActionPerformed

    private void jButtonGenerateAdmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerateAdmissionActionPerformed
        jTabbedPane1.setVisible(false);
        jTabbedPane2.setVisible(false);
        jTabbedPane3.setVisible(false);
        jTabbedPane4.setVisible(true);
        jTabbedPane5.setVisible(false);
    }//GEN-LAST:event_jButtonGenerateAdmissionActionPerformed

    private void jButtonSbjManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSbjManageActionPerformed
        jTabbedPane1.setVisible(false);
        jTabbedPane2.setVisible(true);
        jTabbedPane3.setVisible(false);
        jTabbedPane4.setVisible(false);
        jTabbedPane5.setVisible(false);
    }//GEN-LAST:event_jButtonSbjManageActionPerformed

    private void jButtonStdManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStdManageActionPerformed
        jTabbedPane1.setVisible(true);
        jTabbedPane2.setVisible(false);
        jTabbedPane3.setVisible(false);
        jTabbedPane4.setVisible(false);
        jTabbedPane5.setVisible(false);
    }//GEN-LAST:event_jButtonStdManageActionPerformed

    private void jButtonAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdd5ActionPerformed
        this.subjectID=Integer.parseInt(jTextFieldSubNo1.getText());
        this.subjectName = jTextFieldSubName1.getText();
        this.lecturerID = Integer.parseInt(jTextFieldLectID1.getText());
        this.year = jComboBoxYear1.getSelectedItem().toString();
        this.semester = jComboBoxSemester1.getSelectedItem().toString();

        try {
            Connectivity.sud("insert into subjects values("+this.subjectID+",'"+this.subjectName+"',"+this.lecturerID+",'"
                +this.year+"','"+this.semester+"')");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        //reset();

        JOptionPane.showMessageDialog(null, "Item Added!");
    }//GEN-LAST:event_jButtonAdd5ActionPerformed

    private void jTextFieldSubNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubNo1ActionPerformed

    private void jButtonAdd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdd6ActionPerformed
        this.subjectID=Integer.parseInt(jTextFieldSubNo1.getText());
        this.subjectName = jTextFieldSubName1.getText();
        this.lecturerID = Integer.parseInt(jTextFieldLectID1.getText());
        this.year = jComboBoxYear1.getSelectedItem().toString();
        this.semester = jComboBoxSemester1.getSelectedItem().toString();

        try {
            Connectivity.sud("update subjects set subject_name='"+this.subjectName+"',lecturer_id="+this.lecturerID+",year='"+this.year+"',semester='"+this.semester+"' where subject_id="+this.subjectID);
            JOptionPane.showMessageDialog(null, "Subject Updated!");
        } catch (Exception ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAdd6ActionPerformed

    private void jButtonDelt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelt1ActionPerformed
        this.subjectID=Integer.parseInt(jTextFieldStudentID.getText());

        try {
            Connectivity.sud("DELETE FROM subjects where subject_id="+this.subjectID);
            JOptionPane.showMessageDialog(null, "Subject Deleted!");
            reset();
        } catch (Exception ex) {
            System.out.println("error:"+ex.getMessage());
        }        
    }//GEN-LAST:event_jButtonDelt1ActionPerformed

    private void jButtonAdd11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdd11ActionPerformed
        this.lecID=Integer.parseInt(jTextFieldLecID4.getText());
        this.lecTitle = jComboBoxTitle5.getSelectedItem().toString();
        this.lecFirst_name = jTextFieldFirstName5.getText();
        this.lecLast_name = jTextFieldLastName5.getText();
        this.lecGender = jComboBoxGender5.getSelectedItem().toString();
        this.lecAddress = jTextFieldAddress5.getText();
        this.lecContact_number =Integer.parseInt(jTextFieldContactNo2.getText());
        this.lecEmail = jTextFieldEmail5.getText();

        try {
            Connectivity.sud("insert into lecturers values("+this.lecID+",'"+this.lecTitle+"','"+this.lecFirst_name+"','"
                +this.lecLast_name+"','"+this.lecGender+"','"+this.lecAddress+"',"+lecContact_number+",'"+this.lecEmail+"')");
            JOptionPane.showMessageDialog(null, "Lecturer Added!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        //reset();

        
    }//GEN-LAST:event_jButtonAdd11ActionPerformed

    private void jTextFieldLecID4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLecID4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLecID4ActionPerformed

    private void jButtonReset7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReset7ActionPerformed
        jTextFieldLecID4.setText("");
        jTextFieldFirstName5.setText("");
        jTextFieldLastName5.setText("");
        jTextFieldAddress5.setText("");
        jTextFieldContactNo2.setText("");
        jTextFieldEmail5.setText("");
    }//GEN-LAST:event_jButtonReset7ActionPerformed

    private void jComboBoxTitle5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTitle5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTitle5ActionPerformed

    private void jButtonUpdate5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdate5ActionPerformed
        this.lecID=Integer.parseInt(jTextFieldLecID4.getText());
        this.lecTitle = jComboBoxTitle5.getSelectedItem().toString();
        this.lecFirst_name = jTextFieldFirstName5.getText();
        this.lecLast_name = jTextFieldLastName5.getText();
        this.lecGender = jComboBoxGender5.getSelectedItem().toString();
        this.lecAddress = jTextFieldAddress5.getText();
        this.lecContact_number =Integer.parseInt(jTextFieldContactNo2.getText());
        this.lecEmail = jTextFieldEmail5.getText();

        try {
            Connectivity.sud("update lecturers set title='"+this.lecTitle+"',first_name='"+this.lecFirst_name+"',last_name='"+this.lecLast_name+"',gender='"+this.lecGender+"',address='"+this.lecAddress+"',contact_number=" + this.lecContact_number+ ",email='" + this.lecEmail + "' where lecturer_id="+this.lecID);
            JOptionPane.showMessageDialog(null, "Lecturer Updated!");
        } catch (Exception ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }

        //reset();
    }//GEN-LAST:event_jButtonUpdate5ActionPerformed

    private void jComboBoxGender5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGender5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGender5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.lecID=Integer.parseInt(jTextFieldLecID5.getText());

        try {
            Connectivity.sud("DELETE FROM lecturers where lecturer_id="+this.lecID);
            JOptionPane.showMessageDialog(null, "Lecturer Deleted!");
            reset();
        } catch (Exception ex) {
            System.out.println("error:"+ex.getMessage());
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextFieldLecID5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLecID5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLecID5ActionPerformed

    private void jButtonReset8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReset8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonReset8ActionPerformed

    private void jTextFieldEnrollStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnrollStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnrollStudentIDActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        this.stdID=Integer.parseInt(jTextFieldStudentID.getText());

        try {
            Connectivity.sud("DELETE FROM students where Student_ID="+this.stdID);
            JOptionPane.showMessageDialog(null, "Item Deleted!");
            reset();
        } catch (Exception ex) {
            System.out.println("error:"+ex.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStudentIDActionPerformed

    }//GEN-LAST:event_jTextFieldStudentIDActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        this.stdID=Integer.parseInt(jTextFieldStdID.getText());
        this.title = jComboBoxTitle.getSelectedItem().toString();
        this.first_name = jTextFieldFirstName.getText();
        this.last_name = jTextFieldLastName.getText();
        this.gender = jComboBoxGender.getSelectedItem().toString();
        this.dob = jTextFieldDoB.getText();
        this.address = jTextFieldAddress.getText();
        this.contact_number = Integer.parseInt(jTextFieldContactNumber.getText());
        this.email = jTextFieldEmail.getText();

        try {
            Connectivity.sud("update students set title='"+this.title+"',first_name='"+this.first_name+"',last_name='"+this.last_name+"',gender='"+this.gender+"',dob='"+this.dob+"',address='"+this.address+"',contact_number=" + this.contact_number+ ",email='" + this.email + "' where student_id="+this.stdID);
        } catch (Exception ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }

        //reset();

        JOptionPane.showMessageDialog(null, "Student Updated!");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        reset();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jComboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGenderActionPerformed

    }//GEN-LAST:event_jComboBoxGenderActionPerformed

    private void jComboBoxTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTitleActionPerformed

    }//GEN-LAST:event_jComboBoxTitleActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        this.stdID=Integer.parseInt(jTextFieldStdID.getText());
        this.title = jComboBoxTitle.getSelectedItem().toString();
        this.first_name = jTextFieldFirstName.getText();
        this.last_name = jTextFieldLastName.getText();
        this.gender = jComboBoxGender.getSelectedItem().toString();
        this.dob = jTextFieldDoB.getText();
        this.address = jTextFieldAddress.getText();
        this.contact_number =Integer.parseInt(jTextFieldContactNumber.getText());
        this.email = jTextFieldEmail.getText();

        try {
            Connectivity.sud("insert into students values("+this.stdID+",'"+this.title+"','"+this.first_name+"','"
                +this.last_name+"','"+this.gender+"','"+this.dob+"','"+this.address+"',"+contact_number+",'"+this.email+"')");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        reset();

        JOptionPane.showMessageDialog(null, "Item Added!");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed

    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void jToggleButtonLecManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLecManageActionPerformed
        jTabbedPane1.setVisible(false);
        jTabbedPane2.setVisible(false);
        jTabbedPane3.setVisible(true);
        jTabbedPane4.setVisible(false);
        jTabbedPane5.setVisible(false);
    }//GEN-LAST:event_jToggleButtonLecManageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnrollActionPerformed
        this.stdID=Integer.parseInt(jTextFieldEnrollStudentID.getText());
        this.subjectID =Integer.parseInt(jTextFieldEnrollSubjectID.getText());
        
        try {
            Connectivity.sud("insert into enroll values("+this.stdID+","+this.subjectID+")");
            JOptionPane.showMessageDialog(null, "Subject Enorolled!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_jButtonEnrollActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
    }//GEN-LAST:event_jButton13ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }
    public void reset(){
        jTextFieldStdID.setText("");
        jTextFieldFirstName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldDoB.setText("");
        jTextFieldAddress.setText("");
        jTextFieldContactNumber.setText("");
        jTextFieldEmail.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAdd11;
    private javax.swing.JButton jButtonAdd5;
    private javax.swing.JButton jButtonAdd6;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDelt1;
    private javax.swing.JButton jButtonEnroll;
    private javax.swing.JButton jButtonEnrollStd;
    private javax.swing.JButton jButtonGenerateAdmission;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonReset7;
    private javax.swing.JButton jButtonReset8;
    private javax.swing.JButton jButtonSbjManage;
    private javax.swing.JButton jButtonStdManage;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonUpdate5;
    private javax.swing.JComboBox jComboBoxGender;
    private javax.swing.JComboBox jComboBoxGender5;
    private javax.swing.JComboBox jComboBoxSemester1;
    private javax.swing.JComboBox jComboBoxTitle;
    private javax.swing.JComboBox jComboBoxTitle5;
    private javax.swing.JComboBox jComboBoxYear1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JLabel jLabelWelcomeUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelDeleteLecturer2;
    private javax.swing.JPanel jPanelDeleteStudent;
    private javax.swing.JPanel jPanelDeleteSubject1;
    private javax.swing.JPanel jPanelEnrollToSubjects4;
    private javax.swing.JPanel jPanelGenerateAdmissions3;
    private javax.swing.JPanel jPanelManageLecturer2;
    private javax.swing.JPanel jPanelManageStudent;
    private javax.swing.JPanel jPanelManageSubjects1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldAddress5;
    private javax.swing.JTextField jTextFieldContactNo2;
    private javax.swing.JTextField jTextFieldContactNumber;
    private javax.swing.JTextField jTextFieldDoB;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmail5;
    private javax.swing.JTextField jTextFieldEnrollStudentID;
    private javax.swing.JTextField jTextFieldEnrollSubjectID;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldFirstName5;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldLastName5;
    private javax.swing.JTextField jTextFieldLecID4;
    private javax.swing.JTextField jTextFieldLecID5;
    private javax.swing.JTextField jTextFieldLectID1;
    private javax.swing.JTextField jTextFieldStdID;
    private javax.swing.JTextField jTextFieldStudentID;
    private javax.swing.JTextField jTextFieldStudentID7;
    private javax.swing.JTextField jTextFieldSubName1;
    private javax.swing.JTextField jTextFieldSubNo1;
    private javax.swing.JTextField jTextFieldsubno1;
    private javax.swing.JTextPane jTextPane;
    private javax.swing.JToggleButton jToggleButtonLecManage;
    private javax.swing.JToggleButton jToggleButtonLogout;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
