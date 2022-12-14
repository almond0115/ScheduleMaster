package com.schedulemaster.app.controller;

import com.schedulemaster.app.Client;
import com.schedulemaster.app.Subject;
import com.schedulemaster.app.view.MainFrame;
import com.schedulemaster.misc.LinkedList;
import com.schedulemaster.model.Lecture;
import com.schedulemaster.model.LectureBook;

import java.io.IOException;
import java.util.ResourceBundle;

public class LectureController extends Subject {
    public enum AttributeName {
        Professor {
            @Override
            public String toString() {
                return ResourceBundle.getBundle(MainFrame.RESOURCE_BUNDLE_NAME).getString("professor");
            }
        }, Major {
            @Override
            public String toString() {
                return ResourceBundle.getBundle(MainFrame.RESOURCE_BUNDLE_NAME).getString("major");
            }
        }, Name {
            @Override
            public String toString() {
                return ResourceBundle.getBundle(MainFrame.RESOURCE_BUNDLE_NAME).getString("lecture_name");
            }
        }, Grade
    }

    private final LectureBook lectureBook;
    private final Client client;

    public LectureController(Client client) throws IOException {
        this.client = client;
        lectureBook = new LectureBook(client.getLectures());

        lectureBook.addIndex(AttributeName.Professor.name(), Lecture::getProfessor);
        lectureBook.addIndex(AttributeName.Major.name(), Lecture::getMajor);
        lectureBook.addIndex(AttributeName.Name.name(), Lecture::getName);
    }

    public void refresh() throws IOException {
        LinkedList<Lecture> lectures = client.getLectures();
        lectureBook.setLectures(lectures);
        notice();
    }

    public LinkedList<Lecture> findByAttributeName(AttributeName attributeName, String value) {
        return lectureBook.findLectures(attributeName.name(), value);
    }

    public LectureBook getLectureBook() {
        return lectureBook;
    }
}
