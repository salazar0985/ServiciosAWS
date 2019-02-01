package com.springaws.servicios.serviciosartifact.mvc.model.persistence;

import javax.persistence.*;

/**
 * Created by IDEX1010 on 30/01/2019.
 */
@Entity
public class PersistenceExample {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(nullable = false, insertable = true, updatable = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String rfc;

}
