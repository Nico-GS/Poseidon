package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rating")
public class Rating {
    // TODO: Map columns in data table RATING with corresponding java fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Length(max = 4)
    private Integer id;

    @Column(name = "moodys_rating")
    @NotBlank
    @NotNull
    @Length(max = 125)
    private String moodysRating;

    @Column(name = "sand_p_rating")
    @NotBlank
    @NotNull
    @Length(max = 125)
    private String sandPRating;

    @Column(name = "fitch_rating")
    @NotBlank
    @NotNull
    @Length(max = 125)
    private String fitchRating;

    @Column(name = "order_number")
    @NotBlank
    @NotNull
    @Length(max = 4)
    private Integer orderNumber;


    public Rating(String moodysRating, String sandPRating, String fitchRating, int orderNb) {
        this.moodysRating = moodysRating;
        this.sandPRating = sandPRating;
        this.fitchRating = fitchRating;
        this.orderNumber = orderNb;
    }
}
