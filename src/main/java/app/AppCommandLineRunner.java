package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.model.Item;
import app.model.Tag;
import app.model.User;
import app.service.ItemService;

@Component
public class AppCommandLineRunner implements CommandLineRunner {

	@Autowired
	ItemService itemService;

	@Override
	public void run(String... args) throws Exception
	{
		itemService.addItem(
				new Item().setDeadline("Fev-2021")
				.setDescription("Trouver un stage")
				.setHeading("Processing")
				.setName("Stage")
				.setPlace("Rennes ou France")
				.setRequiredTime(130)
				.setUrl("url")
				.setUser(new User("Yasser","dev"))
				.addTag(new Tag())
				);
		
		itemService.addItem(
				new Item().setDeadline("dec-2020")
				.setDescription("Finir le 1er semestre")
				.setHeading("Done")
				.setName("M2-S1")
				.setPlace("Rennes")
				.setRequiredTime(90)
				.setUrl("url")
				.setUser(new User("Yasser","dev"))
				.addTag(new Tag())
				);
		
		itemService.addItem(
				new Item().setDeadline("sept-2021")
				.setDescription("Soutenance du stage de fin d'étude")
				.setHeading("Waiting")
				.setName("M2-S2")
				.setPlace("Rennes")
				.setRequiredTime(1)
				.setUrl("url")
				.setUser(new User("Yasser","dev"))
				.addTag(new Tag())
				);

	}

}
