package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trade")
public class Trade {
    // DONE: Map columns in data table TRADE with corresponding java fields

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trade_id")
    private Integer tradeId;

    @Column(name = "account")
    @NotBlank(message = "Account is mandatory")
    @Size(max = 30)
    private String account;

    @Column(name = "type")
    @NotBlank(message = "Type is mandatory")
    @Size(max = 30)
    private String type;

    @Column(name = "buy_quantity")
    private Double buyQuantity;

    @Column(name = "sell_quantity")
    private Double sellQuantity;

    @Column(name = "buy_price")
    private BigDecimal buyPrice;

    @Column(name = "sell_price")
    private BigDecimal sellPrice;

    @Column(name = "trade_date")
    private Timestamp tradeDate;

    @Column(name = "security")
    @Size(max = 125)
    private String security;

    @Column(name = "status")
    @Size(max = 10)
    private String status;

    @Column(name = "trader")
    @Size(max = 125)
    private String trader;

    @Column(name = "benchmark")
    @Size(max = 125)
    private String benchmark;

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
    public String revisionName;

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


    public Trade(String tradeAccount, String type) {
        this.account = tradeAccount;
        this.type = type;
    }
}
