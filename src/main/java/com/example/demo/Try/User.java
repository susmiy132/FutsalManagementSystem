package com.example.demo.Try;

import jakarta.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user_id")
public class User {
    @GeneratedValue(generator = "user_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_seq_gen", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "user_name")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
            foreignKey = @ForeignKey(name = "FK_users_roles_userId"),
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseForeignKey = @ForeignKey(name = "FK_users_roles_roleId"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(name = "UNIQUE_users_roles_userIdRoleId",
                    columnNames = {"user_id", "role_id"})
    )
    private Collection<Role> roles;

    // Getters and setters
}