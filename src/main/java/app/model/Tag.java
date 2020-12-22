package app.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Tag implements Serializable {

	private static final long serialVersionUID = 5441332746807117649L;
	
	private int id;
	private String description;
	private Item item;

	public Tag() {
	}

	public Tag(String description) {
		this.description = description;
	}

	@Id
	@GeneratedValue()
	public int getId() {
		return id;
	}

	@ManyToOne()
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public Tag setDescription(String description) {
		this.description = description;
		return this;
	}

}
