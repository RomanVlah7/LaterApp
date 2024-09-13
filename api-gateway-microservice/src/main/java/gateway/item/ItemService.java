package gateway.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpResponse;
import java.util.List;

@Service
public class ItemService {

    RestTemplate restTemplate = new RestTemplate();

    /*this is a service for Item Class, it is a layer between Controller and repository class*/
    public Item saveItem(Item item){
        return restTemplate.postForObject("http://localhost:82/items/save-item", item, Item.class);
    }

    public List<ItemDto> getItemById(Long itemId){
        return restTemplate.getForEntity("http://localhost:82/items/get-item/" + itemId.toString(), List.class).getBody();
    }

    public List<ItemDto> getAllItemsOfUser(Long userId){
        return restTemplate.getForEntity("http://localhost:82/items/get-items-of-user/" + userId.toString(),
                List.class).getBody();
    }

    public List<ItemDto> getAllItems(){
        return restTemplate.getForEntity("http://localhost:82/items/find-all-items", List.class).getBody();
    }

    public ResponseEntity<String> deleteItemById(Long itemId){
        restTemplate.delete("http://loclahost:82/items/delete-item/" + itemId.toString());
        return new ResponseEntity<String>(
                "Item deleted successful",
                HttpStatus.OK
        );
    }

}
