package com.learnJava.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFilterExample {
	
	 public static List<Student> filterStudents(){

	        List<Student> filteredStudentList = StudentDataBase.getAllStudents()
	                .stream()
	                .filter(student -> student.getGpa()>=3.9)
	                .filter(student -> student.getGender().equals("female"))
	                .collect(Collectors.toList());

	        return filteredStudentList;
	    }

	    public static void main(String[] args) {

	        System.out.println("Filtered Students : " + filterStudents());

	    }

}
