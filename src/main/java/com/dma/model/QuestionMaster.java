package com.dma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "question_master")
public class QuestionMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long question_id;
	
	@Column(name = "question_name")
	private String question_name;
	
	@ManyToOne
	private SectionMaster section;
	
	
}
