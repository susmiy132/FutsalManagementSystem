package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "Content")

public class Content {
    @GeneratedValue(generator = "content_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "content_seq_gen", sequenceName = "Content_seq_gen", allocationSize = 100)
    @Id
    private Integer id;

    @Column(name="context_name",nullable=false,length=100)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "information_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_contexts_information_id"))
    private Information information;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",
            foreignKey = @ForeignKey(name = "FK_users_roles_userId"),
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseForeignKey = @ForeignKey(name = "FK_users_roles_roleId"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(name = "UNIQUE_users_roles_userIdRoleId",
                    columnNames = {"user_id", "role_id"})
    )
    private Collection<Content> contents;


}
