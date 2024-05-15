package com.example.demo.Try;

import jakarta.persistence.*;


@Entity
@Table(name = "ground_id")

public class Ground {
    @GeneratedValue(generator = "ground_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ground_seq_gen", sequenceName = "ground_seq_gen", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "Ground")
    private String name;

    public void setId(Integer id) {
    }

    public void setName(String groundName) {
    }
}