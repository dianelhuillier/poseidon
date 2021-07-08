package com.nnk.springboot.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
//import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rating")
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    // TODO: Map columns in data table RATING with corresponding java fields
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	Integer id;
	@NotBlank
	@NotNull
	String moodysRating;
	@NotBlank
	@NotNull
	String sandPRating;
	@NotBlank
	@NotNull
	String fitchRating;
	@NotBlank
	@NotNull
	Integer orderNumber;
}
