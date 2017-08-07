package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "")
public class CoachModel {

    public CoachModel(){

    }

    private String id;
    private String name;
    private String mobile;
    private String introduction;

    private String create_name;
    private Timestamp create_time;
    private String update_name;
    private Timestamp update_time;

    @Id
    @GenericGenerator(name="Generator",strategy = "uuid2")
    @GeneratedValue(generator = "Generator")
    @Column(nullable = false)
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
}
