public com .example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import.persistence.GenerationType;
import jakarta.persistence.Id;

@Entitypublic class Student{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private int getId(){
        return id;
    }
    public void SetId(Integer id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public Student(Integer id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public Student(){

    }
}