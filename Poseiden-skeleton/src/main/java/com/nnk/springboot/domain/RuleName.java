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
@Table(name = "rule_name")
public class RuleName {
    // TODO: Map columns in data table RULENAME with corresponding java fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Length(max = 4)
    private Integer id;

    @Column(name = "name")
    @NotBlank
    @NotNull
    @Length(max = 125)
    private String name;

    @Column(name = "description")
    @NotBlank
    @NotNull
    @Length(max = 125)
    private String description;

    @Column(name = "json")
    @NotBlank
    @NotNull
    @Length(max = 125)
    private String json;

    @Column(name = "template")
    @NotBlank
    @NotNull
    @Length(max = 512)
    private String template;

    @Column(name = "sql_str")
    @NotBlank
    @NotNull
    @Length(max = 125)
    private String sqlStr;

    @Column(name = "sql_part")
    @NotBlank
    @NotNull
    @Length(max = 125)
    private String sqlPart;


    public RuleName(String ruleName, String description, String json, String template, String sqlStr, String sqlPart) {
        this.name = ruleName;
        this.description = description;
        this.json = json;
        this.template = template;
        this.sqlStr = sqlStr;
        this.sqlPart = sqlPart;
    }
}
