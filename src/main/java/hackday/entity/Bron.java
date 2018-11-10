package hackday.entity;

import hackday.classes.Mode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "brons")
public class Bron extends Mode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "bron_date")
    private Date bronDate;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date")
    private Date updateDate;

    public Bron() {
    }

    public Bron(Bank bank, Person person, Date bronDate) {
        this.bank = bank;
        this.person = person;
        this.bronDate = bronDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getBronDate() {
        return bronDate;
    }

    public void setBronDate(Date bronDate) {
        this.bronDate = bronDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Bron{" +
                "id=" + id +
                ", bank=" + bank +
                ", person=" + person +
                ", bronDate=" + bronDate +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
