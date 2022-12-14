package com.schedulemaster.app.view.content;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.schedulemaster.app.controller.MagicController;
import com.schedulemaster.app.controller.UserController;
import com.schedulemaster.app.observers.Observer;
import com.schedulemaster.app.view.*;
import com.schedulemaster.app.view.table.EnrolledLectureTableForm;
import com.schedulemaster.app.view.table.SelectedLectureTableForm;
import com.schedulemaster.misc.LinkedList;
import com.schedulemaster.model.Lecture;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

public class LectureBagForm extends ContentForm {

    private class SuggestionChangeListener implements ChangeListener, Observer {
        @Override
        public void update() {
            updateSelectedLectureTable();
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            updateSelectedLectureTable();
        }
    }

    private JPanel panel;
    private JPanel selectedLecturePanel;
    private JPanel enrolledLecturePanel;
    private JPanel timeTablePanel;
    private JLabel selectedLectureLabel;
    private JLabel enrolledLecturesLabel;
    private JLabel timeTableLabel;
    private JCheckBox suggestionCheckBox;

    private final MainFrame frame;

    private final SelectedLectureTableForm selectedLectureTableForm;
    private final EnrolledLectureTableForm enrolledLectureTableForm;
    private final TimeTableForm timeTableForm;

    private final SuggestionChangeListener changeListener = new SuggestionChangeListener();

    public LectureBagForm(MainFrame frame) {
        this.frame = frame;
        this.selectedLectureTableForm = new SelectedLectureTableForm(frame);
        this.enrolledLectureTableForm = new EnrolledLectureTableForm(frame);
        this.timeTableForm = new TimeTableForm();

        $$$setupUI$$$();

        enrolledLecturesLabel.setBorder(BorderFactory.createEmptyBorder(5, 35, 0, 5));
        selectedLectureLabel.setBorder(BorderFactory.createEmptyBorder(23, 35, 0, 5));
        timeTableLabel.setBorder(BorderFactory.createEmptyBorder(20, 35, 0, 5));
        suggestionCheckBox.setBorder(BorderFactory.createEmptyBorder(23, 0, 0, 15));
        suggestionCheckBox.addChangeListener(changeListener);

        addComponentForm(selectedLectureTableForm);
        addComponentForm(enrolledLectureTableForm);
        addComponentForm(timeTableForm);
    }

    @Override
    public JPanel getPanel() {
        return panel;
    }

    private void updateSelectedLectureTable() {
        if (suggestionCheckBox.isSelected()) {
            MagicController magicController = frame.getMagicController();
            selectedLectureTableForm.setLectures(magicController.suggest(10));
        } else {
            UserController userController = frame.getUserController();
            LinkedList<Lecture> selectedLectures = userController.getSelectedLectures();
            selectedLectureTableForm.setLectures(selectedLectures);
        }
    }

    @Override
    public void load() {
        UserController userController = frame.getUserController();
        LinkedList<Lecture> enrolledLectures = userController.getEnrolledLectures();

        updateSelectedLectureTable();
        enrolledLectureTableForm.setLectures(enrolledLectures);
        timeTableForm.setLectures(enrolledLectures);

        userController.addObserver(changeListener);
        frame.getLectureController().addObserver(changeListener);
        frame.addEnrolledLectureView(enrolledLectureTableForm);
        frame.addEnrolledLectureView(timeTableForm);
    }

    private void createUIComponents() {
        selectedLecturePanel = selectedLectureTableForm.getPanel();
        enrolledLecturePanel = enrolledLectureTableForm.getPanel();
        timeTablePanel = timeTableForm.getPanel();

        enrolledLecturesLabel = new HeaderLabel();
        timeTableLabel = new HeaderLabel();
        selectedLectureLabel = new HeaderLabel();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        panel = new JPanel();
        panel.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel1.add(selectedLecturePanel, new GridConstraints(1, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel1.add(enrolledLecturePanel, new GridConstraints(3, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        this.$$$loadLabelText$$$(selectedLectureLabel, this.$$$getMessageFromBundle$$$("string", "lecture_bag"));
        panel1.add(selectedLectureLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        this.$$$loadLabelText$$$(enrolledLecturesLabel, this.$$$getMessageFromBundle$$$("string", "enrolled_lecture"));
        panel1.add(enrolledLecturesLabel, new GridConstraints(2, 0, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        suggestionCheckBox = new JCheckBox();
        this.$$$loadButtonText$$$(suggestionCheckBox, this.$$$getMessageFromBundle$$$("string", "suggest_check_box"));
        panel1.add(suggestionCheckBox, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel.add(panel2, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, 1, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel2.add(timeTablePanel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        this.$$$loadLabelText$$$(timeTableLabel, this.$$$getMessageFromBundle$$$("string", "enrolled_lecture"));
        panel2.add(timeTableLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    private static Method $$$cachedGetBundleMethod$$$ = null;

    private String $$$getMessageFromBundle$$$(String path, String key) {
        ResourceBundle bundle;
        try {
            Class<?> thisClass = this.getClass();
            if ($$$cachedGetBundleMethod$$$ == null) {
                Class<?> dynamicBundleClass = thisClass.getClassLoader().loadClass("com.intellij.DynamicBundle");
                $$$cachedGetBundleMethod$$$ = dynamicBundleClass.getMethod("getBundle", String.class, Class.class);
            }
            bundle = (ResourceBundle) $$$cachedGetBundleMethod$$$.invoke(null, path, thisClass);
        } catch (Exception e) {
            bundle = ResourceBundle.getBundle(path);
        }
        return bundle.getString(key);
    }

    /**
     * @noinspection ALL
     */
    private void $$$loadLabelText$$$(JLabel component, String text) {
        StringBuffer result = new StringBuffer();
        boolean haveMnemonic = false;
        char mnemonic = '\0';
        int mnemonicIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '&') {
                i++;
                if (i == text.length()) break;
                if (!haveMnemonic && text.charAt(i) != '&') {
                    haveMnemonic = true;
                    mnemonic = text.charAt(i);
                    mnemonicIndex = result.length();
                }
            }
            result.append(text.charAt(i));
        }
        component.setText(result.toString());
        if (haveMnemonic) {
            component.setDisplayedMnemonic(mnemonic);
            component.setDisplayedMnemonicIndex(mnemonicIndex);
        }
    }

    /**
     * @noinspection ALL
     */
    private void $$$loadButtonText$$$(AbstractButton component, String text) {
        StringBuffer result = new StringBuffer();
        boolean haveMnemonic = false;
        char mnemonic = '\0';
        int mnemonicIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '&') {
                i++;
                if (i == text.length()) break;
                if (!haveMnemonic && text.charAt(i) != '&') {
                    haveMnemonic = true;
                    mnemonic = text.charAt(i);
                    mnemonicIndex = result.length();
                }
            }
            result.append(text.charAt(i));
        }
        component.setText(result.toString());
        if (haveMnemonic) {
            component.setMnemonic(mnemonic);
            component.setDisplayedMnemonicIndex(mnemonicIndex);
        }
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

}
