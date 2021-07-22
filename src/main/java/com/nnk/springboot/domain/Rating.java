package com.nnk.springboot.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
//import java.sql.Timestamp;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rating")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rating {
    // TODO: Map columns in data table RATING with corresponding java fields
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
	Integer id;
	@NotBlank
	@Column(name = "moodys_rating")
	@Size(max=125)
	String moodysRating;
	@Column(name = "sandprating")
	@Size(max=125)
	String sandPRating;
	@NotBlank
	@Column(name = "fitch_rating")
	@Size(max=125)
	String fitchRating;
	@NotNull(message = "order Number is mandatory")
	@Column(name = "order_number")
	Integer orderNumber;

}
