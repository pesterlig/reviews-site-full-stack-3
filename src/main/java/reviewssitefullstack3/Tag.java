package reviewssitefullstack3;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	

	@Id
	@GeneratedValue
	private Long id;
	private String tag;
	
	@ManyToMany(mappedBy = "tags")
	private Set<Game>gamesByTag;
	
	protected Tag() {
		
	} 
	
	public Tag(Long id, String tag, Set<Game> gamesByTag) {
		this.id = id;
		this.tag = tag;
		this.gamesByTag = gamesByTag;
	}
	
	public Tag(String tag) {
		this.tag = tag;
		
	}
	
	
	@Override
	public String toString() {
		return tag;
	}

	public Long getId() {
		return id;
	}

	public String getTag() {
		return tag;
	}

	public Set<Game> getGamesByTag() {
		return gamesByTag;
	}


}


