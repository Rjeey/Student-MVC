package basePackage.dao;

import basePackage.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentDao implements DaoStudent {
    @Autowired
    private MongoOperations mongoOperations;

    public void save(Student student){
        mongoOperations.save(student);
    }

    public Student get(Long id){
        return mongoOperations.findOne(Query.query(Criteria.where("id").is(id)),Student.class);
    }

    public List<Student> getAll(){
        return mongoOperations.findAll(Student.class);
    }

    public void remove(Long id){
        mongoOperations.remove(Query.query(Criteria.where("id").is(id)),Student.class);
    }
}
