package com.learnJava.streams_terminal;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsSumAvgExample {

	
	public static int sum(){

        int totalNoOfNotebooks = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));

        return totalNoOfNotebooks;
    }

    public static double average(){

        double totalNoOfNotebooks = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));

        return totalNoOfNotebooks;
    }
}
