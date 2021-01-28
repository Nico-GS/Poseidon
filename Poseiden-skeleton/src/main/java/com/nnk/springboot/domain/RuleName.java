package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rulename")
public class RuleName {

    // DONE: Map columns in data table RULENAME with corresponding java fields

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Description RuleName is mandatory")
    private String description;

    @NotBlank(message = "Json is mandatory")
    private String json;

    @NotBlank(message = "Template is mandatory")
    private String template;

    @NotBlank(message = "sqlStr is mandatory")
    private String sqlStr;


    private String sqlPart;

    public RuleName(@NotBlank(message = "name is mandatory")String name,@NotBlank(message = "description is mandatory") String description,@NotBlank(message = "json is mandatory")String json,
                    @NotBlank(message = "template is mandatory")String template,@NotBlank(message = "sqlStr is mandatory") String sqlStr, String sqlPart) {
        this.name = name;
        this.description = description;
        this.json = json;
        this.template = template;
        this.sqlStr = sqlStr;
        this.sqlPart = sqlPart;
    }

}
