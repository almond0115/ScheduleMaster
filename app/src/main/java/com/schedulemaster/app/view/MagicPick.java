package com.schedulemaster.app.view;

import java.awt.*;
import java.awt.image.ImageObserver;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

import com.intellij.uiDesigner.core.*;
import info.clearthought.layout.*;
import net.miginfocom.swing.*;

public class MagicPick extends DefaultTableModel{
    public MagicPick() {
        initComponents();
        MagicFrame.setVisible(true);
    }

    private void initComponents() {
        String header[] = {"강좌 번호", "강의명", "교수", "강의실", "정원", "신청"};
        String contents[][] = {
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"}
        };

        String dayOfWeek[] = {"", "월", "화", "수", "목", "금"};
        String periodTime[][] = {
                {"1교시", "", "", "", "", ""},
                {"2교시", "", "", "", "", ""},
                {"3교시", "", "", "", "", ""},
                {"4교시", "", "", "", "", ""},
                {"5교시", "", "", "", "", ""},
                {"6교시", "", "", "", "", ""},
                {"7교시", "", "", "", "", ""},
                {"8교시", "", "", "", "", ""},
                {"9교시", "", "", "", "", ""},
                {"10교시", "", "", "", "", ""}
        };

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        MagicFrame = new JFrame();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        panel2 = new JPanel();
        TopPanel = new JPanel();
        topTitle = new JLabel();
        topTitle2 = new JLabel();
        LeftPanel = new JPanel();
        BagPanel = new JScrollPane();
        BagTable = new JTable(contents, header);
        RightPanel = new JPanel();
        TimePanel = new JScrollPane();
        TimeTable = new JTable(periodTime, dayOfWeek);

        BagTable = new JTable(contents, header){
            public boolean isCellEditable(int r, int c){
                return false;
            }
        };

        TimeTable = new JTable(periodTime, dayOfWeek){
            public boolean isCellEditable(int r, int c){
                return false;
            }
        };

        TimeTable.setRowHeight(48);

        BagTable.getTableHeader().setReorderingAllowed(false);
        TimeTable.getTableHeader().setReorderingAllowed(false);
        BagTable.getTableHeader().setResizingAllowed(false);
        TimeTable.getTableHeader().setResizingAllowed(false);

        //======== MagicFrame ========
        {
            var MagicFrameContentPane = MagicFrame.getContentPane();

            //---- button1 ----
            button1.setText("\uc120\ud0dd");

            //---- button2 ----
            button2.setText("\uc774\uc804");

            //---- button3 ----
            button3.setText("\ub2e4\uc74c");

            //======== panel2 ========
            {

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
            }

            //======== TopPanel ========
            {
                TopPanel.setBackground(new Color(0x008dff));

                //---- topTitle ----
                topTitle.setText("Schedule Master");
                topTitle.setFont(new Font(Font.SERIF, Font.BOLD, 24));

                //---- topTitle2 ----
                topTitle2.setText("User \ub2d8");
                topTitle2.setFont(new Font(Font.SERIF, Font.BOLD, 24));

                GroupLayout TopPanelLayout = new GroupLayout(TopPanel);
                TopPanel.setLayout(TopPanelLayout);
                TopPanelLayout.setHorizontalGroup(
                    TopPanelLayout.createParallelGroup()
                        .addGroup(TopPanelLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(topTitle)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 731, Short.MAX_VALUE)
                            .addComponent(topTitle2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34))
                );
                TopPanelLayout.setVerticalGroup(
                    TopPanelLayout.createParallelGroup()
                        .addGroup(TopPanelLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(TopPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(topTitle)
                                .addComponent(topTitle2))
                            .addContainerGap(16, Short.MAX_VALUE))
                );
            }

            //======== LeftPanel ========
            {

                //======== BagPanel ========
                {
                    BagPanel.setViewportView(BagTable);
                }

                GroupLayout LeftPanelLayout = new GroupLayout(LeftPanel);
                LeftPanel.setLayout(LeftPanelLayout);
                LeftPanelLayout.setHorizontalGroup(
                    LeftPanelLayout.createParallelGroup()
                        .addComponent(BagPanel, GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                );
                LeftPanelLayout.setVerticalGroup(
                    LeftPanelLayout.createParallelGroup()
                        .addComponent(BagPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                );
            }

            //======== RightPanel ========
            {

                //======== TimePanel ========
                {

                    //---- TimeTable ----
                    TimeTable.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 17));
                    TimeTable.setBorder(new EmptyBorder(5, 5, 5, 5));
                    TimePanel.setViewportView(TimeTable);
                }

                GroupLayout RightPanelLayout = new GroupLayout(RightPanel);
                RightPanel.setLayout(RightPanelLayout);
                RightPanelLayout.setHorizontalGroup(
                    RightPanelLayout.createParallelGroup()
                        .addComponent(TimePanel, GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                );
                RightPanelLayout.setVerticalGroup(
                    RightPanelLayout.createParallelGroup()
                        .addComponent(TimePanel, GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                );
            }

            GroupLayout MagicFrameContentPaneLayout = new GroupLayout(MagicFrameContentPane);
            MagicFrameContentPane.setLayout(MagicFrameContentPaneLayout);
            MagicFrameContentPaneLayout.setHorizontalGroup(
                MagicFrameContentPaneLayout.createParallelGroup()
                    .addGroup(MagicFrameContentPaneLayout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1093, 1093, 1093))
                    .addGroup(MagicFrameContentPaneLayout.createSequentialGroup()
                        .addGroup(MagicFrameContentPaneLayout.createParallelGroup()
                            .addGroup(MagicFrameContentPaneLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(MagicFrameContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(MagicFrameContentPaneLayout.createSequentialGroup()
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                        .addGap(188, 188, 188)
                                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(RightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addComponent(TopPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            MagicFrameContentPaneLayout.setVerticalGroup(
                MagicFrameContentPaneLayout.createParallelGroup()
                    .addGroup(MagicFrameContentPaneLayout.createSequentialGroup()
                        .addComponent(TopPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(MagicFrameContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(MagicFrameContentPaneLayout.createSequentialGroup()
                                .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(MagicFrameContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(LeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addComponent(RightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(93, Short.MAX_VALUE))
            );
            MagicFrame.pack();
            MagicFrame.setLocationRelativeTo(MagicFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JFrame MagicFrame;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel panel2;
    private JPanel TopPanel;
    private JLabel topTitle;
    private JLabel topTitle2;
    private JPanel LeftPanel;
    private JScrollPane BagPanel;
    private JTable BagTable;
    private JPanel RightPanel;
    private JScrollPane TimePanel;
    private JTable TimeTable;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
