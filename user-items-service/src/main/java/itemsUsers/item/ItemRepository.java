package itemsUsers.item;

import org.springframework.data.jpa.repository.JpaRepository;

/*using JpaRepository we can implement into ItemRep class basic CRUD operations*/
public interface ItemRepository extends JpaRepository<Item, Long> {

}
