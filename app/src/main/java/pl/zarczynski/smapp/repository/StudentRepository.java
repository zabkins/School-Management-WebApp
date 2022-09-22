package pl.zarczynski.smapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zarczynski.smapp.domain.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByAccountId(Long id);
}
