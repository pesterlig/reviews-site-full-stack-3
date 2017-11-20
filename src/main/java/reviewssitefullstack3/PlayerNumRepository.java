package reviewssitefullstack3;

import javax.annotation.Resource;

import org.springframework.data.repository.CrudRepository;

@Resource
public interface PlayerNumRepository extends CrudRepository<PlayerNum, Long> {
	
}
