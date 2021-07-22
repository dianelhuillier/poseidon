package com.nnk.springboot.domain;

//import org.springframework.beans.factory.annotation.Required;

import javax.annotation.security.DenyAll;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import java.sql.Date;
import java.sql.Timestamp;

@Entity
//@DenyAll
@Table(name = "bidlist")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BidList {
    // TODO: Map columns in data table BIDLIST with corresponding java fields
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
	Integer id;
	String account;
	String type;
//	@Digits(fraction = 0, integer = 0)
	@NotBlank 
	Double bidQuantity;
//	@Digits(fraction = 0, integer = 0)
	@NotBlank 
	Double askQuantity;
//	@Digits(fraction = 0, integer = 0)
	@NotBlank 
	Double bid;
	Double ask;
	String benchmark;
//date ?
	Timestamp bidListDate;
	String commentary;
	String security;
	String status;
	String trader;
	String book;
	String creationName;
	Timestamp creationDate;
	String revisionName;
	Timestamp revisionDate;
	String dealName;
	String dealType;
	String sourceListId;
	String side;
	

}
