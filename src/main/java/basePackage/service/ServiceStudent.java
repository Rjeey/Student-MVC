package basePackage.service;

import basePackage.dao.SequenceDao;
import basePackage.dao.StudentDao;
import basePackage.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStudent {
    @Autowired
    private SequenceDao sequenceDao;
    @Autowired
    private StudentDao studentDao;


    public void add(Student student){
        student.setId(sequenceDao.getNextId(Student.COLLECTION_NAME));
        studentDao.save(student);
    }
    public void update(Student student){
        studentDao.save(student);
    }

    public Student get(Long id){
        return studentDao.get(id);
    }

    public List<Student> getAll(){
        return studentDao.getAll();
    }

    public void remove(Long id){
        studentDao.remove(id);
    }


}
