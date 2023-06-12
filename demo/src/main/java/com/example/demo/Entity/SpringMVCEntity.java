package com.example.demo.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "springmvc")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SpringMVCEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_password")
    private String password;
    @Column(name = "user_email")
    private String email;
}
