package tn.esprit.spring.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Consultation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idconsultation;
	private String description;
	@DateTimeFormat(pattern="dd-MM-yyyy")
	@Temporal(TemporalType.DATE)
	private Date dateconsultation;
	private String maladie;
	private double prix;
	@Enumerated(EnumType.STRING)
	private TypeCons typecons;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_enfant")
	Enfant enfant;
}
