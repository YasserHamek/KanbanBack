package app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class,  property = "id")
/*@NamedQuery(name = "findByName", query = "select distinct e from Item e where e.name=:name")*/
public class Item implements Serializable{

	private static final long serialVersionUID = -8367750265030996672L;

	private Long id;

	private String name;
	private String heading;
	private String deadline;
	private User user;
	private int requiredTime;
	private List<Tag> tagsList = new ArrayList<Tag>();
	private String place;
	private String url;
	private String description;

	public Item() {

	}

	public Item(User user) {
		super();
		this.user = user;
	}
	
	//this constructor is for generating an item with an auto-generated Id 
	//from the item passed as parameter in PostMapping
	public Item(Item item) {
		name = item.getName();
		heading = item.getHeading();
		deadline = item.getDeadline();
		user = new User(item.getUser().getName(),item.getUser().getFunction());
		user.setId(item.getUser().getId());
		requiredTime = item.getRequiredTime();
		tagsList = new ArrayList<Tag>(item.getTagsList());
		place = item.getPlace();
		url = item.getUrl();
		description = item.getDescription();
	}
	
	public Item addTag(Tag tag) {
		tag.setItem(this);
		getTagsList().add(tag);
		return this;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public Item setName(String name) {
		this.name = name;
		return this;
	}
	public String getHeading() {
		return heading;
	}

	public Item setHeading(String heading) {
		this.heading = heading;
		return this;
	}

	public String getDeadline() {
		return deadline;
	}

	public Item setDeadline(String deadline) {
		this.deadline = deadline;
		return this;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "User_ID")
	public User getUser() {
		return user;
	}

	public Item setUser(User user) {
		this.user = user;
		return this;
	}

	public int getRequiredTime() {
		return requiredTime;
	}

	public Item setRequiredTime(int requiredTime) {
		this.requiredTime = requiredTime;
		return this;
	}

	public String getPlace() {
		return place;
	}

	public Item setPlace(String place) {
		this.place = place;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public Item setUrl(String url) {
		this.url = url;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Item setDescription(String description) {
		this.description = description;
		return this;
	}

	@OneToMany(mappedBy="item",cascade=CascadeType.ALL)
	public List<Tag> getTagsList() {
		return tagsList;
	}

	public void setTagsList(List<Tag> tagsList) {
		this.tagsList = tagsList;
	}
	
	public Item updateState(String newState) {
		this.heading = newState;
		return this;
	}
}
