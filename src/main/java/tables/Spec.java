package tables;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Spec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String title;
    @OneToMany(mappedBy = "Spec")
    private Collection<Student> Students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Collection<Student> getStudents() {
        return Students;
    }

    public void setStudents(Collection<Student> students) {
        Students = students;
    }
}
