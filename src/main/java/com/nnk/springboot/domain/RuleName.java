package com.nnk.springboot.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
//import java.sql.Timestamp;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rulename")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RuleName {
    // TODO: Map columns in data table RULENAME with corresponding java fields
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	Integer id;
	@NotNull
	@NotBlank
	@Column(name = "name")
	String name;
	@NotNull
	@NotBlank
	@Column(name = "description")
	String description;
	@Column(name = "json")
	String json;
	@Column(name = "template")
	String template;
	@Column(name = "sql_str")
	String sqlStr;
	@Column(name = "sql_part")
	String sqlPart;

}
