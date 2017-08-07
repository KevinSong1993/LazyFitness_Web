package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_user")
public class UserModel {

    public UserModel(){

    }

    private String id;
    private String name;
    private String mobile;
    private String password;

    private String create_name;
    private Timestamp create_time;
    private String update_name;
    private Timestamp update_time;

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
