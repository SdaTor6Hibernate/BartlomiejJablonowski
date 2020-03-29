package model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORD_ID")
    private int ordId;
    @Column(name = "ORD_DATE")
    private String ordDate;
    @Column(name = "ORD_PRICE")
    private String ordPrice;
    //@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USR_ID", referencedColumnName = "ORD_USR_ID")
    private User user;
}
