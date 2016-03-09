/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import datechooser.beans.DateChooserCombo;
import datechooser.view.WeekDaysStyle;
import studentmanagementsystem.models.DataService;

/**
 *
 * @author nouman
 */
public class attendencePortal extends javax.swing.JFrame {

  private static final long serialVersionUID = 1L;
	public attendencePortal() {
		setResizable(false);
		setTitle("Attendence Management");
        dataService = new DataService();
        initComponents();
        initData();
    }

    private void initComponents() {

        layoutHolder = new JPanel();
        details = new JPanel();
        classList = new JComboBox<>();
        classList.setBackground(Color.WHITE);
        selectClassLable = new JLabel();
        getReportBtn = new JButton();
        selectDateLable = new JLabel();
       
        attendence = new JPanel();
        classListForAttendence = new JComboBox<>();
        classListForAttendence.setBackground(Color.WHITE);
        selectClassLable1 = new JLabel();
        markPresentBtn = new JButton();
        selectDateLable1 = new JLabel();
        
        studentsListForAttendence = new JComboBox<>();
        studentsListForAttendence.setBackground(Color.WHITE);
        selectStudentLable1 = new JLabel();
        markAbsentbtn = new JButton();
        todayStats = new JPanel();
        present = new JLabel();
        absent = new JLabel();
        viewPresentDetailsBtn = new JButton();
        viewPresentDetailsBtn.setBackground(Color.LIGHT_GRAY);
        viewAbsentDetailsBtn = new JButton();
        viewAbsentDetailsBtn.setBackground(Color.LIGHT_GRAY);
        currentDate = new JLabel();
        currentDate.setFont(new Font("Dialog", Font.BOLD, 16));
        presentStudent = new JLabel();
        presentStudent.setFont(new Font("Dialog", Font.BOLD, 14));
        absentStudent = new JLabel();
        absentStudent.setFont(new Font("Dialog", Font.BOLD, 14));
        
        menue = new JMenuBar();
        fileMenue = new JMenu();
        HomeSubMenue = new JMenuItem();
        jSeparator = new JPopupMenu.Separator();
        exitSubMenue = new JMenuItem();
        leavesMenue = new JMenu();
        attendenceMenue = new JMenu();
        ReportsMenue = new JMenu();
        MonthlySubmenue = new JMenuItem();
        yearlySubmenue = new JMenuItem();
        SETTINGSsUBMENUE = new JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        layoutHolder.setLayout(new java.awt.CardLayout());

        details.setOpaque(false);
        details.setPreferredSize(new java.awt.Dimension(400, 215));
        details.setVerifyInputWhenFocusTarget(false);
        details.setLayout(null);
        details.add(classList);
        classList.setBounds(159, 122, 239, 39);

        selectClassLable.setForeground(new java.awt.Color(107, 55, 106));
        selectClassLable.setText("Select Class");
        details.add(selectClassLable);
        selectClassLable.setBounds(38, 120, 98, 42);

        getReportBtn.setText("Get Report");
        details.add(getReportBtn);
        getReportBtn.setBounds(159, 202, 141, 42);

        selectDateLable.setForeground(new java.awt.Color(107, 55, 106));
        selectDateLable.setText("Select Date");
        details.add(selectDateLable);
        selectDateLable.setBounds(38, 68, 98, 40);
      
        layoutHolder.add(details, "details");
        
        DateChooserCombo reportDateChooser = new DateChooserCombo();
        reportDateChooser.setWeekStyle(WeekDaysStyle.SHORT);
        reportDateChooser.setBounds(158, 68, 240, 42);
        details.add(reportDateChooser);

        attendence.setOpaque(false);
        attendence.setPreferredSize(new java.awt.Dimension(400, 215));
        attendence.setVerifyInputWhenFocusTarget(false);
        attendence.setLayout(null);
        attendence.add(classListForAttendence);
        classListForAttendence.setBounds(159, 86, 248, 39);

        selectClassLable1.setForeground(new java.awt.Color(107, 55, 106));
        selectClassLable1.setText("Select Class");
        attendence.add(selectClassLable1);
        selectClassLable1.setBounds(42, 83, 105, 42);

        markPresentBtn.setText("Present");
        attendence.add(markPresentBtn);
        markPresentBtn.setBounds(159, 202, 105, 42);

        selectDateLable1.setForeground(new java.awt.Color(107, 55, 106));
        selectDateLable1.setText("Select Date");
        attendence.add(selectDateLable1);
        selectDateLable1.setBounds(42, 31, 105, 40);
      
        attendence.add(studentsListForAttendence);
        studentsListForAttendence.setBounds(159, 145, 248, 39);

        selectStudentLable1.setForeground(new java.awt.Color(107, 55, 106));
        selectStudentLable1.setText("Select Student");
        attendence.add(selectStudentLable1);
        selectStudentLable1.setBounds(42, 142, 105, 42);

        markAbsentbtn.setText("Absent");
        attendence.add(markAbsentbtn);
        markAbsentbtn.setBounds(289, 202, 118, 42);

        layoutHolder.add(attendence, "attendence");
        
        DateChooserCombo dateChooserCombo = new DateChooserCombo();
        dateChooserCombo.setBounds(162, 44, 245, 30);
        attendence.add(dateChooserCombo);

        todayStats.setLayout(null);

        todayStats.add(present);
        present.setBounds(135, 97, 162, 38);

       todayStats.add(absent);
        absent.setBounds(135, 162, 162, 38);

        viewPresentDetailsBtn.setForeground(new java.awt.Color(107, 55, 106));
        viewPresentDetailsBtn.setText("View Details");
        todayStats.add(viewPresentDetailsBtn);
        viewPresentDetailsBtn.setBounds(295, 97, 128, 38);

        viewAbsentDetailsBtn.setForeground(new java.awt.Color(107, 55, 106));
        viewAbsentDetailsBtn.setText("View Details");
        todayStats.add(viewAbsentDetailsBtn);
        viewAbsentDetailsBtn.setBounds(295, 162, 128, 38);

        currentDate.setForeground(new java.awt.Color(107, 55, 106));
        todayStats.add(currentDate);
        currentDate.setBounds(113, 45, 237, 34);

        presentStudent.setForeground(new java.awt.Color(107, 55, 106));
        presentStudent.setText("Present");
        todayStats.add(presentStudent);
        presentStudent.setBounds(31, 97, 71, 38);

        absentStudent.setForeground(new java.awt.Color(107, 55, 106));
        absentStudent.setText("Absent");
        todayStats.add(absentStudent);
        absentStudent.setBounds(31, 162, 70, 38);

        layoutHolder.add(todayStats, "todayStats");

        menue.setBackground(new java.awt.Color(120, 38, 140));
        menue.setBackground(new java.awt.Color(120, 38, 140));
        menue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 64, 129)));
        menue.setForeground(new java.awt.Color(1, 1, 1));
        menue.setBorderPainted(false);
        menue.setMargin(new java.awt.Insets(2, 3, 3, 30));
        menue.setPreferredSize(new java.awt.Dimension(263, 60));

        fileMenue.setBackground(new java.awt.Color(132, 91, 144));
        fileMenue.setText("File");
        fileMenue.setToolTipText("");
        fileMenue.setBorderPainted(true);
        fileMenue.setPreferredSize(new java.awt.Dimension(40, 15));

        HomeSubMenue.setBackground(new java.awt.Color(131, 91, 153));
        HomeSubMenue.setText("Home");
        HomeSubMenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeSubMenueActionPerformed(evt);
            }
        });
        fileMenue.add(HomeSubMenue);
        fileMenue.add(jSeparator);

        exitSubMenue.setBackground(new java.awt.Color(131, 91, 153));
        exitSubMenue.setText("Exit");
        exitSubMenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitSubMenueActionPerformed(evt);
            }
        });
        fileMenue.add(exitSubMenue);

        menue.add(fileMenue);

        leavesMenue.setText("Leaves");
        leavesMenue.setPreferredSize(new java.awt.Dimension(60, 15));
        leavesMenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leavesMenueMouseClicked(evt);
            }
        });
        menue.add(leavesMenue);

        attendenceMenue.setText("Attendence");
        attendenceMenue.setPreferredSize(new java.awt.Dimension(90, 15));
        attendenceMenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendenceMenueMouseClicked(evt);
            }
        });
        menue.add(attendenceMenue);

        ReportsMenue.setText("Reports");
        ReportsMenue.setPreferredSize(new java.awt.Dimension(70, 15));

        MonthlySubmenue.setBackground(new java.awt.Color(131, 91, 153));
        MonthlySubmenue.setText("Monthly");
        ReportsMenue.add(MonthlySubmenue);

        yearlySubmenue.setBackground(new java.awt.Color(131, 91, 153));
        yearlySubmenue.setText("Yearly");
        ReportsMenue.add(yearlySubmenue);

        SETTINGSsUBMENUE.setBackground(new java.awt.Color(131, 91, 153));
        SETTINGSsUBMENUE.setText("Settings");
        ReportsMenue.add(SETTINGSsUBMENUE);

        menue.add(ReportsMenue);

        setJMenuBar(menue);

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(layoutHolder, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(12)
        			.addComponent(layoutHolder, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        			.addGap(12))
        );
        getContentPane().setLayout(layout);
      //  getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{layoutHolder, details, classList, selectClassLable, getReportBtn, selectDateLable, attendence, classListForAttendence, selectClassLable1, markPresentBtn, selectDateLable1, studentsListForAttendence, selectStudentLable1, markAbsentbtn, todayStats, present, absent, viewPresentDetailsBtn, viewAbsentDetailsBtn, currentDate, presentStudent, absentStudent}));

        pack();
    }                       
    
    private void initData(){
    	
    	 classList.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    	 classListForAttendence.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    	 studentsListForAttendence.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    	 present.setText(dataService.getstats().presentStudent+"/"+dataService.getstats().totalStudent);
    	 absent.setText(dataService.getstats().absentStudent+"/"+dataService.getstats().totalStudent);
    	 currentDate.setText("Current Date :"+dataService.getstats().date);
    	 
    }
    
    private void HomeSubMenueActionPerformed(java.awt.event.ActionEvent evt) {                                             
        CardLayout card = (CardLayout)layoutHolder.getLayout();
         card.show(layoutHolder, "todayStats");
    }                                            

    private void exitSubMenueActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.dispose();
    }                                            

    private void leavesMenueMouseClicked(java.awt.event.MouseEvent evt) {                                         
        CardLayout card = (CardLayout)layoutHolder.getLayout();
         card.show(layoutHolder, "details");
    }                                        

    private void attendenceMenueMouseClicked(java.awt.event.MouseEvent evt) {                                             
        CardLayout card = (CardLayout)layoutHolder.getLayout();
        card.show(layoutHolder, "attendence");
    }                                            

    DataService dataService;
    private JPanel layoutHolder;
    
    private JPanel todayStats;
    private JLabel currentDate;
    private JLabel absent;
    private JLabel absentStudent;
    private JLabel present;
    private JLabel presentStudent;
    private JButton viewPresentDetailsBtn;
    private JButton viewAbsentDetailsBtn;
    
    private JPanel attendence;
    private JLabel selectClassLable1;
    private JLabel selectDateLable1;
    private JLabel selectStudentLable1;
    private JComboBox<String> classListForAttendence;
    private JComboBox<String> studentsListForAttendence;
    private JButton markAbsentbtn;
    private JButton markPresentBtn;
    
    private JPanel details;
    private JComboBox<String> classList;
    private JButton getReportBtn;
   
    private JLabel selectClassLable;
    private JLabel selectDateLable;
    
    private JMenuBar menue;
    private JMenu fileMenue;
    private JMenuItem HomeSubMenue;
    private JPopupMenu.Separator jSeparator;
    private JMenuItem exitSubMenue;
    
    private JMenu leavesMenue;
    private JMenu attendenceMenue;
    
    private JMenu ReportsMenue;
    private JMenuItem MonthlySubmenue;
    private JMenuItem SETTINGSsUBMENUE;
    private JMenuItem yearlySubmenue;
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(attendencePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendencePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendencePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendencePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendencePortal().setVisible(true);
            }
        });
    }
}
