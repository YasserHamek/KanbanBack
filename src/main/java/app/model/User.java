package app.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Users_")
public class User implements Serializable {
	
	private static final long serialVersionUID = 7950535615328459300L;
	
	private int id;
	private String name;
	private String function;
	private List<Item> itemList = new ArrayList<Item>();
	
	public User() {

	}
	
	public User(String name, String function) {
		this.name = name;
		this.function = function;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public String getFunction() {
		return function;
	}

	public User setFunction(String function) {
		this.function = function;
		return this;
	}
	
	@OneToMany(mappedBy = "user",cascade = {CascadeType.PERSIST,CascadeType.REFRESH})
	public List<Item> getItemList() {
		return itemList;
	}

	public User addItem(Item item) {
		this.getItemList().add(item);
		item.setUser(this);
		return this;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

}
