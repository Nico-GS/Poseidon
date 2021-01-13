package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curve_point")
public class CurvePoint {
    // TODO: Map columns in data table CURVEPOINT with corresponding java fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max = 4)
    private Integer id;

    @Column(name = "curve_id")
    @Size(max = 4)
    @NotBlank(message = "CurveId is mandatory")
    @NotNull
    private Integer curveId;

    @Column(name = "as_of_date")
    @NotBlank(message = "AsOfDate is mandatory")
    private Timestamp asOfDate;

    @Column(name = "term")
    @NotBlank(message = "Term is mandatory")
    private Double term;

    @Column(name = "value")
    @NotBlank(message = "Value is mandatory")
    private Double value;

    @Column(name = "creation_date")
    @NotBlank(message = "CreationDate is mandatory")
    private Timestamp creationDate;

    public CurvePoint(int curveId, double term, Double value) {
        this.curveId = curveId;
        this.term = term;
        this.value = value;
    }


}
