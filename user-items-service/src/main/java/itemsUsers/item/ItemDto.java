package itemsUsers.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/*this class is a data transfer object, it is a copy of class item but
* i use it in HTTP request/response */
public class ItemDto {
    private Long id;
    private Long userID;
    private String url;
}
