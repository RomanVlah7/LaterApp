package items.laterapp.item;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*using JpaRepository we can implement into ItemRep class basic CRUD operations*/
public interface ItemRepository extends JpaRepository<ItemDto, Long> {
    List<ItemDto> findByItemId(Long itemId);
    List<ItemDto> findByAuthorId(Long authorId);

}
