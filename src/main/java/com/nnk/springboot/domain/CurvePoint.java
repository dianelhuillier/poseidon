package com.nnk.springboot.domain;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;


@Entity
@Table(name = "curvepoint")
@AllArgsConstructor
@NoArgsConstructor
public class CurvePoint {
    // TODO: Map columns in data table CURVEPOINT with corresponding java fields
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	Integer id;
	Integer curveId;
	@NotNull
	@NotBlank
	Timestamp asOfDate;
	@Length
	Double term;
	@NotBlank
	Double value;
	@NotNull
	@NotBlank
	Timestamp creationDate;

}
