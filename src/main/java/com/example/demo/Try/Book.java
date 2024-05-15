package com.example.demo.Try;

import jakarta.persistence.*;

@Entity
@Table(name = "book_id")
public class Book {
    @GeneratedValue(generator = "books_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "books_seq_gen", sequenceName = "books_seq_gen", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "Book_Name", nullable = false,length =50)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id", foreignKey = @ForeignKey(name="fk_books_user_id"))
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ground_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_books_ground_id"))
    private Ground ground;

    public void setGround(Ground ground) {
    }

    public void setName(String bookName) {
    }

    public void setUser(User user) {

    }
}