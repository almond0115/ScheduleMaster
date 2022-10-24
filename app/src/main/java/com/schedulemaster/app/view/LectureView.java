package com.schedulemaster.app.view;

import com.schedulemaster.misc.LinkedList;
import com.schedulemaster.model.Lecture;

import javax.swing.*;

public abstract class LectureView extends JPanel {
    private LinkedList<Lecture> lectures;

    protected abstract void updateView();

    public void setLectures(LinkedList<Lecture> lectures) {
        this.lectures = lectures;
        updateView();
    }
}
