package gateway.item;


import gateway.user.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    /*this class represents an entity from the database*/

    UserDto authorInfo;
    private Long itemId;

    private String url;


}
