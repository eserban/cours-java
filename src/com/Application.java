package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        StudentList list = new StudentList();
        File file = new File("students.txt");
        try {
            list.load(file);
            System.out.println(list);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        NoteList noteList = new NoteList();
        noteList.append(2.0);
        noteList.append(3.0);
        noteList.append(4.0);
        noteList.append(20.0);
        System.out.println(noteList);

    }

    public static float max(float first, float... values) {
        float max = first;
        for (float x : values) {
            if (x > max)
                max = x;
        }
        return max;
    }

    public static float[] maxN(float[] array, int count) {
        float[] results = new float[count];
        Arrays.sort(array);

        results = Arrays.copyOfRange(array,
                array.length - count,
                array.length);


        return results;
    }
}
