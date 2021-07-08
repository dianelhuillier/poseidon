package com.nnk.springboot.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trade")
public class Trade {
    // TODO: Map columns in data table TRADE with corresponding java fields
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	Integer tradeId;
	String account;
	String type;
	@NotBlank(message = "Quantity is mandatory")
	Double buyQuantity;
	@NotBlank(message = "Quantity is mandatory")
	Double sellQuantity;
	@NotBlank(message = "Price is mandatory")
	Double buyPrice;
	@NotBlank(message = "Price is mandatory")
	Double sellPrice;
	String benchmark;
	@NotBlank
	Timestamp tradeDate;
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


