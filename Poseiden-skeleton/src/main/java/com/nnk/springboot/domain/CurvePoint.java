package com.nnk.springboot.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curvepoint")
public class CurvePoint {
    // DONE: Map columns in data table CURVEPOINT with corresponding java fields

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotNull(message = "CurveID must be not null")
    private Integer curveId;

    private Timestamp asOfDate;

    @Min(1)
    private double term;

    @Min(1)
    private double value;

    private Timestamp creationDate;

    public CurvePoint(@NotNull(message = "must not be null") Integer curveId, @Min(1) double term, @Min(1) double value) {
        this.curveId = curveId;
        this.term = term;
        this.value = value;
    }

}
