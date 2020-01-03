package com.tx.orderdome.pojo;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@Table(name = "t_order")
public class Order implements Serializable {
    private static final long serialVersionUID = -8867272732777764701L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_name")
    private String order_name;

    @Column(name = "order_user")
    private String order_user;
}
