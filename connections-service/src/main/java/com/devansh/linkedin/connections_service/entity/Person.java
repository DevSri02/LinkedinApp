package com.devansh.linkedin.connections_service.entity;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Person {

    @Id
    @GeneratedValue
    private Long id;  //id related to Node

    //store only minimal information here
    //store data related connections

    private Long userId;

    private  String name;



}
