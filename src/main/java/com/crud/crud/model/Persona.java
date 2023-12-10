package com.crud.crud.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="persona")
public class Persona {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String telefono;

  public Persona(int id, String name, String telefono) {
    this.id = id;
    this.name = name;
    this.telefono = telefono;
  }

  public Persona() {
  }
}
