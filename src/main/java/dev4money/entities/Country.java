package dev4money.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="country")
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long Id;
	@Column(name="Name")
	private String Name;
	@Column(name="Continent")
	private String Continent;
	@Column(name="Currency")
	private String Currency;
	@Column(name="President")
	private String President;
	@Column(name="CallingCode")
	private int CallingCode;
	
	public Country() {
		super();
	}
	public Country(String name, String continent, String currency, String president, int callingCode) {
		super();
		Name = name;
		Continent = continent;
		Currency = currency;
		President = president;
		CallingCode = callingCode;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContinent() {
		return Continent;
	}
	public void setContinent(String continent) {
		Continent = continent;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getPresident() {
		return President;
	}
	public void setPresident(String president) {
		President = president;
	}
	public int getCallingCode() {
		return CallingCode;
	}
	public void setCallingCode(int callingCode) {
		CallingCode = callingCode;
	}
}
