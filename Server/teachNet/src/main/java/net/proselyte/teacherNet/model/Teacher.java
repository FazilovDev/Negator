package net.proselyte.teacherNet.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "teachers")
@Getter
@Setter
@ToString
public class Teacher extends BaseEntity {

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "lections")
    private String lections;
}