package app.controller;

import app.dto.ItemDTO;
import app.model.Item;
import app.service.ItemService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "item")
/* @Produces({ "application/json"}) */
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@CrossOrigin
	@GetMapping()
	public List<ItemDTO> getAllItem() {
		return itemService.findAll().stream().map(item -> new ItemDTO(item)).collect(Collectors.toList());
	}

	@CrossOrigin
	@PostMapping(consumes = "application/json")
	public ItemDTO addItem(@RequestBody Item item) {
		ItemDTO itemDTO = new ItemDTO(itemService.addItem(item));
		return itemDTO;
	}

	@CrossOrigin
	@PutMapping()
	public ItemDTO putItemState(@RequestParam Long itemId, @RequestParam String itemHeading) {
		ItemDTO itemDTO = new ItemDTO(itemService.putItemState(itemId, itemHeading));
		return itemDTO;
	}
	
	@CrossOrigin
	@DeleteMapping()
	public long deleteItem(@RequestParam Long itemId) {
		itemService.deleteItem(itemId);
		return itemId;
	}
}
