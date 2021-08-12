package com.nnk.springboot.domain;

//import org.springframework.beans.factory.annotation.Required;

import javax.annotation.security.DenyAll;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

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
    @Size(max=125)
    @Column(name = "account")
	String account;
    @Size(max=125)
    @Column(name = "type")
	String type;
	@NotNull(message = "BidQuantity is mandatory")
    @Positive(message = "Bid Quantity must be positive")
	@Column(name = "bid_quantity")
	Double bidQuantity;
    @Positive(message = "Ask Quantity must be positive")
	@Column(name = "ask_quantity")
	Double askQuantity;
    @Positive(message = "Bid  must be positive")
	@Column(name = "bid")
	Double bid;
	@Column(name = "ask")
    @Positive(message = "Ask must be positive")
	Double ask;
    @Size(max=125)
    @Column(name = "benchmark")
	String benchmark;
    @Column(name = "bid_list_date")
	Timestamp bidListDate;
	@Size(max=125)
	@Column(name = "commentary")
	String commentary;
	@Size(max=125)
	@Column(name = "security")
	String security;
	@Size(max=125)
	@Column(name = "status")
	String status;
	@Size(max=125)
	@Column(name = "trader")
	String trader;
	@Size(max=125)
	@Column(name = "book")
	String book;
	@Size(max=125)
	@Column(name = "creation_name")
	String creationName;
	@Column(name = "creation_date")
	Timestamp creationDate;
	@Size(max=125)
	@Column(name = "revision_name")
	String revisionName;
	@Column(name = "revision_date")
	Timestamp revisionDate;
	@Size(max=125)
	@Column(name = "deal_name")
	String dealName;
	@Size(max=125)
	@Column(name = "deal_type")
	String dealType;
	@Column(name = "source_list_id")
	String sourceListId;
	@Column(name = "side")
	String side;
	

}
