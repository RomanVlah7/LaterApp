package common.laterapp.item;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
public class ItemRep {

    /*this is a item repository class, an implementation of repository interface to interact with database */


    @Autowired
    private EntityManager entityManager;
    @Autowired
    private ItemRepository itemRepository;

    @Transactional
    public Item saveItem(Item item) {
        entityManager.persist(item);
        return item;
    }

    @Transactional
    public Item editItem(Item item) {
        entityManager.persist(item);
        return item;
    }

    @Transactional
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Transactional
    public void deleteById(Long itemId) {
        itemRepository.deleteById(itemId);
    }
}
