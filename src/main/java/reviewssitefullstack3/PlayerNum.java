package reviewssitefullstack3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// oneToMany

@Entity
public class PlayerNum {

	@Id
	@GeneratedValue
	private Long id;
	private String playerNum;

	protected PlayerNum() {

	}

	public PlayerNum(String playerNum) {
		this.playerNum = playerNum;
	}

	@OneToMany(mappedBy = "playerNum")
	private Set<Game> gamesOfPlayerNum = new HashSet<Game>();

	public Set<Game> getGamesOfPlayerNum() {
		return gamesOfPlayerNum;
	}

	

	@Override
	public String toString() {
		return playerNum;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getPlayerNum() {
		return playerNum;
	}

} //this bracket closes numPlayer class
