package com.example.t2009m1relationship.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
@Table(name = "accouts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)  //chú Ý All hoặc các trường hợp khác
    @JoinColumn(name = "identityCardId")
    private IdentityCard identityCard;

}
