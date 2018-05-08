package it.unisalento.se.saw.domain;
// Generated May 7, 2018 5:17:37 PM by Hibernate Tools 5.2.0.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * InsegnamentoAula generated by hbm2java
 */
@Entity
@Table(name="insegnamento_aula"
    ,catalog="se_db"
)
public class InsegnamentoAula  implements java.io.Serializable {


     private Integer idinsegnamentoAula;
     private Aula aula;
     private Insegnamento insegnamento;
     private String slotTempo;

    public InsegnamentoAula() {
    }

	
    public InsegnamentoAula(Aula aula, Insegnamento insegnamento) {
        this.aula = aula;
        this.insegnamento = insegnamento;
    }
    public InsegnamentoAula(Aula aula, Insegnamento insegnamento, String slotTempo) {
       this.aula = aula;
       this.insegnamento = insegnamento;
       this.slotTempo = slotTempo;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idinsegnamento_aula", unique=true, nullable=false)
    public Integer getIdinsegnamentoAula() {
        return this.idinsegnamentoAula;
    }
    
    public void setIdinsegnamentoAula(Integer idinsegnamentoAula) {
        this.idinsegnamentoAula = idinsegnamentoAula;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idaula", nullable=false)
    public Aula getAula() {
        return this.aula;
    }
    
    public void setAula(Aula aula) {
        this.aula = aula;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idinsegnamento", nullable=false)
    public Insegnamento getInsegnamento() {
        return this.insegnamento;
    }
    
    public void setInsegnamento(Insegnamento insegnamento) {
        this.insegnamento = insegnamento;
    }

    
    @Column(name="slot_tempo", length=45)
    public String getSlotTempo() {
        return this.slotTempo;
    }
    
    public void setSlotTempo(String slotTempo) {
        this.slotTempo = slotTempo;
    }




}


