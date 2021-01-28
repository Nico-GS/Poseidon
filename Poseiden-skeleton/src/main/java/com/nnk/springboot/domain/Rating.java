package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "rating")
public class Rating {

    // DONE: Map columns in data table RATING with corresponding java fields

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotNull(message = "MoodysRating is mandatory")
    private String moodysRating;

    @NotNull(message = "SandPRating is mandatory")
    private String sandPRating;

    @NotNull(message = "FitchRating is mandatory")
    private String fitchRating;

    @NotNull(message = "OrderNumber must not be null")
    private Integer orderNumber;


    public Rating(@NotNull(message = "MoodysRating is mandatory") String moodysRating, @NotNull(message = "sandPRating is mandatory") String sandPRating, @NotNull(message = "fitchRating is mandatory") String fitchRating, @NotNull(message = "must not be null") Integer orderNumber) {
        this.moodysRating = moodysRating;
        this.sandPRating = sandPRating;
        this.fitchRating = fitchRating;
        this.orderNumber = orderNumber;
    }


    public Rating() {

    }
}
