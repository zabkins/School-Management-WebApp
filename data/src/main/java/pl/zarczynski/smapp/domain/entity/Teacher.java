package pl.zarczynski.smapp.domain.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "teacher")
public class Teacher extends Person{
    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;
}
