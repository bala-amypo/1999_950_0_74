// package com.example.demo.Repository;
// import org.springframework.web.bind.annotation.;
// importorg.springframework.data.jpa.repository.jpaRepository;
// import org.springframework.stereotype.Repository;
// @Repository
// public interface StudentRepo extends jpaRepository<Student,Integer>{

// }


package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    
}