package it.unisalento.se.saw.domain;
// Generated May 7, 2018 5:17:37 PM by Hibernate Tools 5.2.0.Final


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * UserType generated by hbm2java
 */
@Entity
@Table(name="user_type"
    ,catalog="se_db"
)
public class UserType  implements java.io.Serializable {


     private Integer iduserType;
     private String name;
     private Set<User> users = new HashSet<User>(0);

    public UserType() {
    }

    public UserType(String name, Set<User> users) {
       this.name = name;
       this.users = users;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="iduser_type", unique=true, nullable=false)
    public Integer getIduserType() {
        return this.iduserType;
    }
    
    public void setIduserType(Integer iduserType) {
        this.iduserType = iduserType;
    }

    
    @Column(name="name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="userType")
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }




}


