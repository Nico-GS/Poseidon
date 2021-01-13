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
import java.sql.Timestamp;
import java.util.List;

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
    private Double bidQuantity;

    @Column(name = "ask_quantity")
    private Double askQuantity;

    @Column(name = "bid")
    private Double bid;

    @Column(name = "ask")
    private Double ask;

    @Column(name = "benchmark")
    @Size(max = 125)
    private String benchmark;

    @Column(name = "bid_list_date")
    private Timestamp bidListDate;

    @Column(name = "commentary")
    @Size(max = 125)
    private String commentary;

    @Column(name = "security")
    @Size(max = 125)
    private String security;

    @Column(name = "status")
    @Size(max = 10)
    private String status;

    @Column(name = "trader")
    @Size(max = 125)
    private String trader;

    @Column(name = "book")
    @Size(max = 125)
    private String book;

    @Column(name = "creation_name")
    @Size(max = 125)
    private String creationName;

    @Column(name = "creation_date")
    private Timestamp creationDate;

    @Column(name = "revision_name")
    @Size(max = 125)
    private String revisionName;

    @Column(name = "revision_date")
    private Timestamp revisionDate;

    @Column(name = "deal_name")
    @Size(max = 125)
    private String dealName;

    @Column(name = "deal_type")
    @Size(max = 125)
    private String dealType;
    
    @Column(name = "source_list_id")
    @Size(max = 125)
    private String sourceListId;
    
    @Column(name = "side")
    @Size(max = 125)
    private String side;



    public BidList(String accountTest, String typeTest, double bidQuantity) {
        this.account = accountTest;
        this.type = typeTest;
        this.bidQuantity = bidQuantity;
    }

    public Integer getBidListId() {
        return null;
    }
}
