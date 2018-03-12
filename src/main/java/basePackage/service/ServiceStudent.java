package basePackage.service;

import basePackage.dao.DaoSequence;
import basePackage.dao.DaoStudent;
import basePackage.dao.SequenceDao;
import basePackage.dao.StudentDao;
import basePackage.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStudent {
    @Autowired
    private DaoStudent daoStudent;
    @Autowired
    private DaoSequence daoSequence;


    public void add(Student student){
        student.setId(daoSequence.getNextId(Student.COLLECTION_NAME));
        daoStudent.save(student);
    }
    public void update(Student student){
        daoStudent.save(student);
    }

    public Student get(Long id){
        return daoStudent.get(id);
    }

    public List<Student> getAll(){
        return daoStudent.getAll();
    }

    public void remove(Long id){
        daoStudent.remove(id);
    }


}
