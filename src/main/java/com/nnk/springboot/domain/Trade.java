package com.nnk.springboot.domain;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
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
    @Column(name = "type")
    @Size(max=125)
    @NotBlank(message = "Type is mandatory")
	String type;
	@NotNull(message = "Quantity is mandatory")
	@Column(name = "buy_quantity")
    @Positive(message = "Buy Quantity must be positive")
	Double buyQuantity;
	@Column(name = "sell_quantity")
    @Positive(message = "Sell Quantity must be positive")
	Double sellQuantity;
	@Column(name = "buy_price")
    @Positive(message = "Buy price must be positive")
	Double buyPrice;
	@Column(name = "sell_price")
    @Positive(message = "Sell price must be positive")
	Double sellPrice;
	@Column(name = "benchmark")
	String benchmark;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @Column(name = "trade_date")
    Timestamp tradeDate;
    @Column(name = "security")
    @Size(max=125)
	String security;
    @Column(name = "status")
    @Size(max=125)
	String status;
    @Column(name = "trader")
    @Size(max=125)
	String trader;
    @Column(name = "book")
    @Size(max=125)
	String book;
    @Column(name = "creation_name")
    @Size(max=125)
	String creationName;
    @Column(name = "creation_date")
	Timestamp creationDate;
    @Column(name = "revision_name")
    @Size(max=125)
	String revisionName;
    @Column(name = "revision_date")
	Timestamp revisionDate;
    @Column(name = "deal_name")
    @Size(max=125)
	String dealName;
    @Column(name = "deal_type")
    @Size(max=125)
	String dealType;
    @Column(name = "source_list_id")
	String sourceListId;
    @Column(name = "side")
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


