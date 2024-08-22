package notification.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ItemDto {
    private Long id;
    private Long userID;
    private String url;
}
