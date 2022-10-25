package com.schedulemaster.app.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.intellij.uiDesigner.core.*;

public class ResultPanel extends JFrame{
    private JFrame jf;
    public ResultPanel() {
        initComponents();
        jf.setVisible(true);
    }

    private void initComponents() {
        String dayOfWeek[] = {"", " 월", " 화", " 수", " 목", " 금"};
        String periodTime[][] = {
                {" 1교시", "", "", "", "", ""},
                {" 2교시", "", "", "", "", ""},
                {" 3교시", "", "", "", "", ""},
                {" 4교시", "", "", "", "", ""},
                {" 5교시", "", "", "", "", ""},
                {" 6교시", "", "", "", "", ""},
                {" 7교시", "", "", "", "", ""},
                {" 8교시", "", "", "", "", ""},
                {" 9교시", "", "", "", "", ""},
                {" 10교시", "", "", "", "", ""}
        };

        String header[] = {"강좌 번호", "강의명", "교수", "강의실", "정원", "신청", ""};
        String contents[][] = {
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0", ""},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0", ""},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0", ""},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0", ""},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0", ""},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0", ""}
        };

        
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        var panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        panel2 = new JPanel();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        panel3 = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        panel4 = new JPanel();
        panel5 = new JPanel();
        label2 = new JLabel();
        scrollPane3 = new JScrollPane();
        table3 = new JTable();

        //======== panel1 ========
        {

            //======== panel2 ========
            {

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(table2);
                }

                //======== panel3 ========
                {
                    panel3.setBackground(new Color(0x4682b4));

                    //---- label1 ----
                    label1.setText("\ucc45\uac00\ubc29");
                    label1.setFont(new Font(Font.SERIF, Font.BOLD, 16));

                    //---- button1 ----
                    button1.setText("\uac80\uc0c9");

                    GroupLayout panel3Layout = new GroupLayout(panel3);
                    panel3.setLayout(panel3Layout);
                    panel3Layout.setHorizontalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                    );
                    panel3Layout.setVerticalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(13, Short.MAX_VALUE))
                    );
                }

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
                            .addContainerGap())
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addContainerGap())
                );
            }

            //======== panel4 ========
            {

                //======== panel5 ========
                {
                    panel5.setBackground(new Color(0x4682b4));

                    //---- label2 ----
                    label2.setText("\uc2e0\uccad\uc644\ub8cc");
                    label2.setFont(new Font(Font.SERIF, Font.BOLD, 16));

                    GroupLayout panel5Layout = new GroupLayout(panel5);
                    panel5.setLayout(panel5Layout);
                    panel5Layout.setHorizontalGroup(
                        panel5Layout.createParallelGroup()
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(label2)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    panel5Layout.setVerticalGroup(
                        panel5Layout.createParallelGroup()
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(label2)
                                .addContainerGap(23, Short.MAX_VALUE))
                    );
                }

                //======== scrollPane3 ========
                {
                    scrollPane3.setViewportView(table3);
                }

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollPane3))
                            .addContainerGap())
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addContainerGap())
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 620, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JScrollPane scrollPane1;
    private JPanel panel2;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JPanel panel3;
    private JLabel label1;
    private JButton button1;
    private JPanel panel4;
    private JPanel panel5;
    private JLabel label2;
    private JScrollPane scrollPane3;
    private JTable table3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public class MyDefaultTableCellRenderer extends DefaultTableCellRenderer{
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
            Component comp = null;
            if(column == 6){
                comp = new JButton("신청");
            }

            return comp;
        }
    }
}
