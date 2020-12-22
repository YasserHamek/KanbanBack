package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.ItemRepository;
import app.model.Item;
import app.model.Tag;
import app.model.User;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepo;
	
	
	public Item addItem(Item item) {
		return itemRepo.saveAndFlush(new Item().setDeadline(item.getDeadline())
				.setDescription(item.getDescription())
				.setHeading(item.getHeading())
				.setName(item.getName())
				.setPlace(item.getPlace())
				.setRequiredTime(item.getRequiredTime())
				.setUrl(item.getUrl())
				.setUser(new User(item.getUser().getName(),item.getUser().getFunction()))
				.addTag(new Tag())
				);
	}
	
	public Optional<Item> findItemById(Long id) {
		return itemRepo.findById(id);
	}
	
	public void deleteItem(Long id) {
		itemRepo.deleteById(id);
		itemRepo.flush();
	}

	
	public List<Item> findAll() {
		return itemRepo.findAll();
	}

	public Item putItemState(Long itemId, String itemHeading) {
		Item itemupdated = itemRepo.findById(itemId).get().updateState(itemHeading);
		itemRepo.flush();
		return itemupdated;
	}
}
