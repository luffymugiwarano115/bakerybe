package com.example.bakery.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address_table")
public class Address extends AbstractEntityId {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
