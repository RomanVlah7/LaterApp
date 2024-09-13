package items.laterapp.item;

import items.laterapp.tools.LogTools;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
public class ItemRep {
    private static final Logger log = LoggerFactory.getLogger(ItemRep.class);
    @Autowired
    private LogTools logTools;

    /*this is a item repository class, an implementation of repository interface to interact with database */


    @Autowired
    private EntityManager entityManager;
    @Autowired
    private ItemRepository itemRepository;

    @Transactional
    public Item saveItem(Item item) {
        entityManager.persist(item);
        logTools.logMethodInfoDebug(item.toString(), log);
        return item;
    }

    @Transactional
    public Item editItem(Item item) {
        entityManager.persist(item);
        logTools.logMethodInfoDebug(item.toString(),log);
        return item;
    }

    @Transactional
    public List<ItemDto> findAll() {
        return itemRepository.findAll();
    }

    @Transactional
    public List<ItemDto> findItemById(Long itemId){
        logTools.logMethodInfoDebug(itemId.toString(),log);
        return itemRepository.findByItemId(itemId);
    }

    @Transactional
    public List<ItemDto> findAllItemsOfUser(Long userId){
        logTools.logMethodInfoDebug(userId.toString(), log);
        return itemRepository.findByAuthorId(userId);
    }

    @Transactional
    public void deleteById(Long itemId) {
        logTools.logMethodInfoDebug(itemId.toString(), log);
        itemRepository.deleteById(itemId);
    }
}
