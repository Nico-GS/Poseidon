package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
    @Length(max = 4)
    private Integer id;

    @Column(name = "curve_id")
    @Length(max = 4)
    @NotBlank(message = "CurveId is mandatory")
    @NotNull
    private Integer curveId;

    @Column(name = "as_of_date")
    @NotBlank(message = "As of date is mandatory")
    @NotNull
    private Timestamp asOfDate;

    @Column(name = "term")
    @NotBlank(message = "Term is mandatory")
    @NotNull
    private Double term;

    @Column(name = "value")
    @NotBlank(message = "Value is mandatory")
    @NotNull
    private Double value;

    @Column(name = "creation_date")
    @NotBlank(message = "Creation date is mandatory")
    @NotNull
    private Timestamp creationDate;

    public CurvePoint(int curveId, double term, double value) {
        this.curveId = curveId;
        this.term = term;
        this.value = value;
    }
}
