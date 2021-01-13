package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bid_list")
public class BidList {
    // TODO: Map columns in data table BIDLIST with corresponding java fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max = 4)
    private Integer id;

    @Column(name = "account")
    @NotBlank(message = "Account is mandatory")
    @Size(max = 30)
    private String account;

    @Column(name = "type")
    @NotBlank(message = "Type is mandatory")
    @Size(max = 30)
    private String type;

    @Column(name = "bid_quantity")
    @NotBlank(message = "Bid Quantity is mandatory")
    private Double bidQuantity;

    @Column(name = "ask_quantity")
    @NotBlank(message = "Ask Quantity is mandatory")
    private Double askQuantity;

    @Column(name = "bid")
    @NotBlank(message = "Bid is mandatory")
    private Double bid;

    @Column(name = "ask")
    @NotBlank(message = "Ask is mandatory")
    private Double ask;

    @Column(name = "benchmark")
    private String benchmark;

    @Column(name = "bid_list_date")
    private Timestamp bidListDate;

    @Column(name = "commentary")
    private String commentary;

    @Column(name = "security")
    private String security;

    @Column(name = "status")
    private String status;

    @Column(name = "trader")
    private String trader;

    @Column(name = "book")
    private String book;

    @Column(name = "creation_name")
    private String creationName;

    @Column(name = "creation_date")
    private Timestamp creationDate;

    @Column(name = "revision_name")
    private String revisionName;

    @Column(name = "revision_date")
    private Timestamp revisionDate;

    @Column(name = "deal_name")
    private String dealName;

    @Column(name = "deal_type")
    private String dealType;
    
    @Column(name = "source_list_id")
    private String sourceListId;
    
    @Column(name = "side")
    private String side;


    public BidList(String accountTest, String typeTest, double bidQuantity) {
        this.account = accountTest;
        this.type = typeTest;
        this.bidQuantity = bidQuantity;
    }
}
