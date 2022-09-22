package pl.zarczynski.smapp.domain.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private CourseSubject subject;
    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
