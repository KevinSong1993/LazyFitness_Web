package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_lesson")
public class LessonModel {

    public LessonModel(){

    }
    private String id;

    @Id
    @GenericGenerator(name="Generator",strategy = "uuid2")
    @GeneratedValue(generator = "Generator")
    @Column(name = "id", length = 36, nullable = false)
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

}
