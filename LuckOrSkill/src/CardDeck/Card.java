package CardDeck;

public class Card {
	
	private String name;
	private String description;

	public Card(String name,String description) {
		setName(name);
		setDescription(description);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
}
