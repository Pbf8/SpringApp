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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="se_db"
)
public class User  implements java.io.Serializable {


     private Integer iduser;
     private CorsoDiStudio corsoDiStudio;
     private UserType userType;
     private String name;
     private String surname;
     private String email;
     private String password;
     private Set<Insegnamento> insegnamentos = new HashSet<Insegnamento>(0);

    public User() {
    }

    public User(CorsoDiStudio corsoDiStudio, UserType userType, String name, String surname, String email, String password, Set<Insegnamento> insegnamentos) {
       this.corsoDiStudio = corsoDiStudio;
       this.userType = userType;
       this.name = name;
       this.surname = surname;
       this.email = email;
       this.password = password;
       this.insegnamentos = insegnamentos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="iduser", unique=true, nullable=false)
    public Integer getIduser() {
        return this.iduser;
    }
    
    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_corso_di_studio")
    public CorsoDiStudio getCorsoDiStudio() {
        return this.corsoDiStudio;
    }
    
    public void setCorsoDiStudio(CorsoDiStudio corsoDiStudio) {
        this.corsoDiStudio = corsoDiStudio;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="type")
    public UserType getUserType() {
        return this.userType;
    }
    
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    
    @Column(name="name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="surname", length=45)
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    @Column(name="email", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="password", length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Insegnamento> getInsegnamentos() {
        return this.insegnamentos;
    }
    
    public void setInsegnamentos(Set<Insegnamento> insegnamentos) {
        this.insegnamentos = insegnamentos;
    }




}

