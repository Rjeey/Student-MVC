package basePackage.dao;

import basePackage.model.Student;
import org.springframework.data.mongodb.core.MongoOperations;

import java.util.List;

public interface DaoStudent {
    void save(Student student);
    Student get(Long id);
    List<Student>getAll();
    void remove(Long id);

}
