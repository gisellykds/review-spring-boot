package br.com.review.entities;

import javax.persistence.*;

@Entity
@Table(name="client")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phone;

}
