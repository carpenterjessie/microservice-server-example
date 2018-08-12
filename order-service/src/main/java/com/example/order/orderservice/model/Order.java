package com.example.order.orderservice.model;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "order_header")
public class Order {

    @Id
    @Column
    private String orderId;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date placeAt;

    @CollectionTable(joinColumns = @JoinColumn(name = "order_id"))
    @ElementCollection
    @Fetch(FetchMode.JOIN)
    private List<OrderEntry> entries;

    @Column
    private String           transactionId;

}
