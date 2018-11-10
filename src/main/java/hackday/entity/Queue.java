package hackday.entity;

import hackday.classes.Mode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "queue")
public class Queue extends Mode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "priority")
    private boolean priority;

    @Column(name = "isComplete")
    private boolean isComplete;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    public Queue() {
    }

    public Queue(boolean priority, boolean isComplete, Bank bank) {
        this.priority = priority;
        this.isComplete = isComplete;
        this.bank = bank;
    }

    @PrePersist
    private void newTasks() {
        createDate = new Timestamp(System.currentTimeMillis());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "id=" + id +
                ", priority=" + priority +
                ", isComplete=" + isComplete +
                ", bank=" + bank +
                ", createDate=" + createDate +
                '}';
    }
}
