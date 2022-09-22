package pl.zarczynski.smapp.domain.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "student")
public class Student extends Person{
    @OneToMany(mappedBy = "student")
    private List<Grade> grades;
    @ManyToMany
    @JoinTable(name = "student_courses",
    joinColumns = @JoinColumn(name = "student_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "course_id",referencedColumnName = "id"))
    private List<Course> courses;
}
