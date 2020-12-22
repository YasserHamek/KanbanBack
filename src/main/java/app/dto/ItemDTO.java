package app.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import app.model.Item;
import app.model.Tag;
import app.model.User;


/*@XmlRootElement(name = "Item")*/
public class ItemDTO {

	private long id;

	private String name;
	private String heading;
	private String deadline;
	private User user;
	private int requiredTime;
	private List<Tag> tagsList = new ArrayList<Tag>();
	private String place;
	private String url;
	private String description;

	public ItemDTO() {

	}

	public ItemDTO(Item item) {
		id = item.getId();
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

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getRequiredTime() {
		return requiredTime;
	}

	public void setRequiredTime(int requiredTime) {
		this.requiredTime = requiredTime;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Tag> getTagsList() {
		return tagsList;
	}

	public void setTagsList(List<Tag> tagsList) {
		this.tagsList = tagsList;
	}
}
