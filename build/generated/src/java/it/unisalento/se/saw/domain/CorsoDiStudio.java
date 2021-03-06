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
 * CorsoDiStudio generated by hbm2java
 */
@Entity
@Table(name="corso_di_studio"
    ,catalog="se_db"
)
public class CorsoDiStudio  implements java.io.Serializable {


     private Integer idcorsoDiStudio;
     private String nome;
     private String descrizione;
     private Set<Insegnamento> insegnamentos = new HashSet<Insegnamento>(0);
     private Set<User> users = new HashSet<User>(0);

    public CorsoDiStudio() {
    }

    public CorsoDiStudio(String nome, String descrizione, Set<Insegnamento> insegnamentos, Set<User> users) {
       this.nome = nome;
       this.descrizione = descrizione;
       this.insegnamentos = insegnamentos;
       this.users = users;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idcorso_di_studio", unique=true, nullable=false)
    public Integer getIdcorsoDiStudio() {
        return this.idcorsoDiStudio;
    }
    
    public void setIdcorsoDiStudio(Integer idcorsoDiStudio) {
        this.idcorsoDiStudio = idcorsoDiStudio;
    }

    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="descrizione", length=45)
    public String getDescrizione() {
        return this.descrizione;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="corsoDiStudio")
    public Set<Insegnamento> getInsegnamentos() {
        return this.insegnamentos;
    }
    
    public void setInsegnamentos(Set<Insegnamento> insegnamentos) {
        this.insegnamentos = insegnamentos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="corsoDiStudio")
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }




}


