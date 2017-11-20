package reviewssitefullstack3;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	PlayerNumRepository playerNumRepo;

	@Resource
	GameRepository gameRepo;

	 @Resource
	 TagRepository tagRepo;

	@RequestMapping("/")
	public String redirectToPlayerNum(Model model) {
		return "redirect:/playerNums";
	}

	@RequestMapping("/playerNums")
	public String showAllPlayerNums(Model model) {
		model.addAttribute("playerNums", playerNumRepo.findAll());
		return "playerNums";
		
	}
	
	@RequestMapping("/playerNum")
	public String showOnePlayerNum(@RequestParam("id")Long id, Model model) {
		model.addAttribute("playerNum", playerNumRepo.findOne(id));
//		model.addAttribute(attributeValue);
		return "playerNum";
	}
	
	@RequestMapping("/game")
	public String showOneGame(@RequestParam("id")Long id, Model model) {
		Game gameToBeShown = gameRepo.findOne(id);
		
		System.out.println(gameToBeShown.getPlayerNum());
		System.out.println(gameToBeShown.getPlayerNum().getId());
		
		model.addAttribute("game", gameToBeShown);
		
		return "game";
	}
	@RequestMapping("/tag")
	public String showOneTag(@RequestParam("id")Long id, Model model) {
//		Tag tagToBeShown = tagRepo.findOne(id);
		model.addAttribute("tag", tagRepo.findOne(id));
		return "tag";
	}
	
	@RequestMapping("/add-tag")
	public String addTag(@RequestParam("id")Long id, String name) {
		Tag tag = new Tag (name);
		tagRepo.save(tag);
		Game gameReview = gameRepo.findOne(id);
		gameReview.addTag(tag);
		gameRepo.save(gameReview);
		return "redirect:/game?id=" + id;
	}
	
	@RequestMapping("/remove-tag")
	public String removeTag(@RequestParam("id")Long id, String tag) {
		Tag toRemove = tagRepo.findByTag(tag);
		//tagRepo.delete(toRemove);
		Game gameReview = gameRepo.findOne(id);
		gameReview.removeTag(toRemove);
		gameRepo.save(gameReview);
		return "redirect:/game?id=" + id;
	}

	@RequestMapping("/games")
	public String showAllGames(Model model) {
		model.addAttribute("games", gameRepo.findAll());
		return "games";
	}

	

	@RequestMapping("/tags")
	public String showAllTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

} // closes the controller class