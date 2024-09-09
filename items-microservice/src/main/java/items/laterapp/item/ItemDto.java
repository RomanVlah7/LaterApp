package items.laterapp.item;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
/*this class is a data transfer object, it is a copy of class item but
 * i use it in HTTP request/response */
public class ItemDto {
    @Id
    private Long id;
    private Long userID;
    private String url;
}
