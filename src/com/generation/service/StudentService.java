package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();
    private final Map<String, Course> courses = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        //TODO
        if (this.students.containsKey(studentId))
        {
            return this.students.get(studentId);
        }
        return null;
    }

    public Course findCourse ( String courseId )
    {
        if (this.courses.containsKey(courseId))
        {
            return this.courses.get(courseId);
        }
        return null;
    }

    public boolean showSummary()
    {
        //TODO
        for ( String key : students.keySet() )
        {
            Student student = students.get( key );
            System.out.println( student);
        }
        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        Student student = this.students.get(studentId);
        Course courses = this.courses.get(course);
        student.enrollToCourse(course);
    }

}
