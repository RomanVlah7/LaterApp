package items.laterapp.item;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "items")
public class ItemDto {
    @Id
    private Long itemId;
    @Column(name = "author_id")
    private Long authorId;
    private String url;
}
