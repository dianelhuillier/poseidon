package com.nnk.springboot.domain;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "trade")
public class Trade {
    // TODO: Map columns in data table TRADE with corresponding java fields
    
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "trade_id")
    @Id
	Integer id;
    @NotBlank(message = "Account is mandatory")
    @Size(max=30, message = "The account name must be of maximum 30 characters")
    @Column(name = "account")
	String account;
	String type;
	@NotNull(message = "Quantity is mandatory")
	Double buyQuantity;
	@NotNull(message = "Quantity is mandatory")
	Double sellQuantity;
	@NotNull(message = "Price is mandatory")
	Double buyPrice;
	@NotNull(message = "Price is mandatory")
	Double sellPrice;
	String benchmark;
//    @FutureOrPresent(message = "The date should be a date in the future or now")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
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
	
	public Trade(Integer id,
			@NotBlank(message = "Account is mandatory") @Size(max = 30, message = "The account name must be of maximum 30 characters") String account,
			String type) {
		super();
		this.id = id;
		this.account = account;
		this.type = type;
	}
	
	
}


