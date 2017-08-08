package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_coach")
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
    @Column(name = "id", length = 36, nullable = false)
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    @Column(name = "name", length = 30, nullable = true)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "mobile", length = 20, nullable = false)
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(name = "introduction", length = 500, nullable = true)
    public String getIntroduction() {
        return introduction;
    }
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Column(name = "create_name", length = 30, nullable = true)
    public String getCreate_name() {
        return create_name;
    }
    public void setCreate_name(String create_name) {
        this.create_name = create_name;
    }

    @Column(name = "create_time", nullable = true)
    public Timestamp getCreate_time() {
        return create_time;
    }
    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    @Column(name = "update_name", length = 30, nullable = true)
    public String getUpdate_name() {
        return update_name;
    }
    public void setUpdate_name(String update_name) {
        this.update_name = update_name;
    }

    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdate_time() {
        return update_time;
    }
    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }


}
