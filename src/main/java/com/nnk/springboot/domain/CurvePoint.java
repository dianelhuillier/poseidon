package com.nnk.springboot.domain;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import java.sql.Timestamp;
import java.util.Set;


@Entity
@Table(name = "curvepoint")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CurvePoint {
    // TODO: Map columns in data table CURVEPOINT with corresponding java fields

	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	Integer id;
    @NotNull(message = "Curve point Id is mandatory")
    @Positive(message = "Curve point Id must be positive")
    @Column(name = "curve_id")
	Integer curveId;
    @Column(name = "as_of_date")
	Timestamp asOfDate;
	@NotNull(message = "term is mandatory")
	@Column(name = "term")
	Double term;
	@NotNull(message = "value is mandatory")
	@Column(name = "value")
	Double value;
	@Column(name = "creation_date")
	Timestamp creationDate;

}
