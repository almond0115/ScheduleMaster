package com.schedulemaster.app.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;

public class MagicMain {
    public MagicMain() {
        initComponents();
        MagicMainFrame.setVisible(true);
    }

    private void initComponents() {
        String dayOfWeek[] = {"", "월 ", "화 ", "수 ", "목 ", "금 "};

        String periodTime[][] = {
                {"1교시 ", "", "", "", "", ""},
                {"2교시 ", "", "", "", "", ""},
                {"3교시 ", "", "", "", "", ""},
                {"4교시 ", "", "", "", "", ""},
                {"5교시 ", "", "", "", "", ""},
                {"6교시 ", "", "", "", "", ""},
                {"7교시 ", "", "", "", "", ""},
                {"8교시 ", "", "", "", "", ""},
                {"9교시 ", "", "", "", "", ""},
                {"10교시 ", "", "", "", "", ""}
        };

        String header[] = {"강좌 번호 ", "강의명 ", "교수 ", "강의실 ", "정원 ", "신청 "};

        String contents[][] = {
                {"0001", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0002", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0003", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0004", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0005", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0006", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0007", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0008", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0009", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0010", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0011", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0012", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0013", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0014", "강의 이름", "홍길동", "어디어디", "30", "0"},
                {"0015", "강의 이름", "홍길동", "어디어디", "30", "0"}
        };

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        MagicMainFrame = new JFrame();
        TopPanel = new JPanel();
        topTitle = new JLabel();
        topTitle2 = new JLabel();
        ButtonPanel = new JPanel();
        AddButton2 = new JButton();
        AddButton3 = new JButton();
        RightPanel = new JScrollPane();
        TimeTable = new JTable(periodTime, dayOfWeek);
        LeftPanel = new JPanel();
        GrpListPanel = new JScrollPane();
        ListPanel = new JPanel();
        GrpPiecePanel = new JPanel();
        PieceTimePanel = new JScrollPane();
        PieceTimeTable = new JTable(contents, header);
        panel4 = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();

        TimeTable = new JTable(periodTime, dayOfWeek){
            public boolean isCellEditable(int r, int c){
                return false;
            }
        };

        PieceTimeTable = new JTable(contents, header){
            public boolean isCellEditable(int r, int c){
                return false;
            }
        };

        TimeTable.setRowHeight(48);

        PieceTimeTable.getTableHeader().setReorderingAllowed(false);
        TimeTable.getTableHeader().setReorderingAllowed(false);
        PieceTimeTable.getTableHeader().setResizingAllowed(false);
        TimeTable.getTableHeader().setResizingAllowed(false);

        //======== MagicMainFrame ========
        {
            var MagicMainFrameContentPane = MagicMainFrame.getContentPane();

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
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 732, Short.MAX_VALUE)
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

            //======== ButtonPanel ========
            {

                //---- AddButton2 ----
                AddButton2.setText("\uadf8\ub8f9 \ucd94\uac00");

                //---- AddButton3 ----
                AddButton3.setText("\uc644\ub8cc");

                GroupLayout ButtonPanelLayout = new GroupLayout(ButtonPanel);
                ButtonPanel.setLayout(ButtonPanelLayout);
                ButtonPanelLayout.setHorizontalGroup(
                    ButtonPanelLayout.createParallelGroup()
                        .addGroup(ButtonPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AddButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AddButton3, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                ButtonPanelLayout.setVerticalGroup(
                    ButtonPanelLayout.createParallelGroup()
                        .addGroup(ButtonPanelLayout.createSequentialGroup()
                            .addContainerGap(19, Short.MAX_VALUE)
                            .addGroup(ButtonPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(AddButton2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddButton3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                            .addGap(14, 14, 14))
                );
            }

            //======== RightPanel ========
            {
                RightPanel.setViewportView(TimeTable);
            }

            //======== LeftPanel ========
            {

                //======== GrpListPanel ========
                {

                    //======== ListPanel ========
                    {

                        //======== GrpPiecePanel ========
                        {

                            //======== PieceTimePanel ========
                            {
                                PieceTimePanel.setViewportView(PieceTimeTable);
                            }

                            //======== panel4 ========
                            {
                                panel4.setBackground(new Color(0xc4dff9));

                                //---- label1 ----
                                label1.setText("\uadf8\ub8f9 1");
                                label1.setFont(new Font(Font.SERIF, Font.BOLD, 16));

                                //---- button1 ----
                                button1.setText("\ucd94\uac00");

                                GroupLayout panel4Layout = new GroupLayout(panel4);
                                panel4.setLayout(panel4Layout);
                                panel4Layout.setHorizontalGroup(
                                    panel4Layout.createParallelGroup()
                                        .addGroup(panel4Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(label1)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20))
                                );
                                panel4Layout.setVerticalGroup(
                                    panel4Layout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                            .addContainerGap(14, Short.MAX_VALUE)
                                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(label1)
                                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                            .addGap(14, 14, 14))
                                );
                            }

                            GroupLayout GrpPiecePanelLayout = new GroupLayout(GrpPiecePanel);
                            GrpPiecePanel.setLayout(GrpPiecePanelLayout);
                            GrpPiecePanelLayout.setHorizontalGroup(
                                GrpPiecePanelLayout.createParallelGroup()
                                    .addGroup(GrpPiecePanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(GrpPiecePanelLayout.createParallelGroup()
                                            .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PieceTimePanel, GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
                                        .addContainerGap())
                            );
                            GrpPiecePanelLayout.setVerticalGroup(
                                GrpPiecePanelLayout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, GrpPiecePanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PieceTimePanel, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                        .addContainerGap())
                            );
                        }

                        GroupLayout ListPanelLayout = new GroupLayout(ListPanel);
                        ListPanel.setLayout(ListPanelLayout);
                        ListPanelLayout.setHorizontalGroup(
                            ListPanelLayout.createParallelGroup()
                                .addGroup(ListPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(GrpPiecePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(16, Short.MAX_VALUE))
                        );
                        ListPanelLayout.setVerticalGroup(
                            ListPanelLayout.createParallelGroup()
                                .addGroup(ListPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(GrpPiecePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(259, Short.MAX_VALUE))
                        );
                    }
                    GrpListPanel.setViewportView(ListPanel);
                }

                GroupLayout LeftPanelLayout = new GroupLayout(LeftPanel);
                LeftPanel.setLayout(LeftPanelLayout);
                LeftPanelLayout.setHorizontalGroup(
                    LeftPanelLayout.createParallelGroup()
                        .addGroup(LeftPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(GrpListPanel)
                            .addContainerGap())
                );
                LeftPanelLayout.setVerticalGroup(
                    LeftPanelLayout.createParallelGroup()
                        .addGroup(LeftPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(GrpListPanel, GroupLayout.PREFERRED_SIZE, 470, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            GroupLayout MagicMainFrameContentPaneLayout = new GroupLayout(MagicMainFrameContentPane);
            MagicMainFrameContentPane.setLayout(MagicMainFrameContentPaneLayout);
            MagicMainFrameContentPaneLayout.setHorizontalGroup(
                MagicMainFrameContentPaneLayout.createParallelGroup()
                    .addComponent(TopPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MagicMainFrameContentPaneLayout.createSequentialGroup()
                        .addGroup(MagicMainFrameContentPaneLayout.createParallelGroup()
                            .addGroup(MagicMainFrameContentPaneLayout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(ButtonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(GroupLayout.Alignment.TRAILING, MagicMainFrameContentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addComponent(RightPanel, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
            );
            MagicMainFrameContentPaneLayout.setVerticalGroup(
                MagicMainFrameContentPaneLayout.createParallelGroup()
                    .addGroup(MagicMainFrameContentPaneLayout.createSequentialGroup()
                        .addComponent(TopPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(MagicMainFrameContentPaneLayout.createParallelGroup()
                            .addGroup(MagicMainFrameContentPaneLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(LeftPanel, GroupLayout.PREFERRED_SIZE, 447, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(MagicMainFrameContentPaneLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(RightPanel, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(108, Short.MAX_VALUE))))
            );
            MagicMainFrame.pack();
            MagicMainFrame.setLocationRelativeTo(MagicMainFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JFrame MagicMainFrame;
    private JPanel TopPanel;
    private JLabel topTitle;
    private JLabel topTitle2;
    private JPanel ButtonPanel;
    private JButton AddButton2;
    private JButton AddButton3;
    private JScrollPane RightPanel;
    private JTable TimeTable;
    private JPanel LeftPanel;
    private JScrollPane GrpListPanel;
    private JPanel ListPanel;
    private JPanel GrpPiecePanel;
    private JScrollPane PieceTimePanel;
    private JTable PieceTimeTable;
    private JPanel panel4;
    private JLabel label1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
