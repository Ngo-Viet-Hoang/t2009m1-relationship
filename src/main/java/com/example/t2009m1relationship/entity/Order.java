package com.example.t2009m1relationship.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "orders")
public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @CreatedDate
        private LocalDateTime createdAt;
        private int status;
        @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
        private Set<OrderDetail> orderDetails;
}
