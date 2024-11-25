package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name="customer_id")
    private Long customerId;
    
    private String name;

    private String email;

    @Column(name="mobile_number")
    private String mobileNumber;
}
