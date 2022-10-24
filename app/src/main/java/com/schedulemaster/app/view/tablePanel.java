package com.schedulemaster.app.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import com.intellij.uiDesigner.core.*;

public class tablePanel {
    public tablePanel() {
        initComponents();
        myinit();
    }
    private void myinit(){

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        var panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        timeTable = new JTable();
        String rowTime[][] = {{"09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00"}
                , {"1교시","2교시","3교시","4교시","5교시","6교시","7교시","8교시","9교시","10교시","11교시"}};
        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout());

            //======== scrollPane1 ========
            {

                //---- timeTable ----
                timeTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {rowTime[0][0], null, null, null, null, null},
                        {rowTime[0][1], null, null, null, null, null},
                        {rowTime[0][2], null, null, null, null, null},
                        {rowTime[0][3], null, null, null, null, null},
                        {rowTime[0][4], null, null, null, null, null},
                        {rowTime[0][5], null, null, null, null, null},
                        {rowTime[0][6], null, null, null, null, null},
                        {rowTime[0][7], null, null, null, null, null},
                        {rowTime[0][8], null, null, null, null, null},
                        {rowTime[0][9], null, null, null, null, null},
                        {rowTime[0][10], null, null, null, null, null},
                    },
                    new String[] {
                        "", "\uc6d4", "\ud654", "\uc218", "\ubaa9", "\uae08"
                    }
                ));
                {
                    TableColumnModel cm = timeTable.getColumnModel();
                    cm.getColumn(0).setPreferredWidth(10);
                }
                timeTable.setName("timeTable");
                timeTable.setRowHeight(50);
                scrollPane1.setViewportView(timeTable);
            }
            panel1.add(scrollPane1);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JScrollPane scrollPane1;
    private JTable timeTable;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
