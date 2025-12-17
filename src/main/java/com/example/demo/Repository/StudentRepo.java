package com.example.demo.Repository;
import org.springframework.web.bind.annotation.;
importorg.springframework.data.jpa.repository.jpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepo extends jpaRepository<Student,Integer>{
    
}