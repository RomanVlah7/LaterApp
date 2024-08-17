package project.item;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRep itemRep;
    EntityManager entityManager;
    static Class<String> Object;

    public Item saveItem(Item item){
        return itemRep.saveItem(item);
    }

    public List<Item> findAll(){
        return itemRep.findAll();
    }

    public void deleteById(Long itemId){
        itemRep.deleteById(itemId);
    }
}
