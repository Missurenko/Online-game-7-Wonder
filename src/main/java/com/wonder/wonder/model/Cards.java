package com.wonder.wonder.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

/**
 * Creator: bm
 * Date: 07.06.17.
 */
// Class example
@Entity
@Table(name = "cards")
@Getter
@Setter
public class Cards {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;
    @Column(name = "color")
    String color;
    @Column(name = "name")
    String name;
    @Column(name = "resouceBuild")
    String resouceBuild;
    @Column(name = "ability")
    String ability;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}