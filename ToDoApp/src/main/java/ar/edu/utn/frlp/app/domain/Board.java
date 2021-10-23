package ar.edu.utn.frlp.app.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "board")
    private List<ColumnBoard> columnBoards;
    @ManyToOne
    private User user;

    public Board() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ColumnBoard> getColumnBoards() {
        return columnBoards;
    }

    public void setColumnBoards(List<ColumnBoard> columnBoards) {
        this.columnBoards = columnBoards;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
