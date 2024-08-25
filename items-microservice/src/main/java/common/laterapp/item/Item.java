package common.laterapp.item;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import itemsUsers.user.UserDto;

@Entity
@Table(name = "items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    /*this class represents an entity from the database*/

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "userId")
    UserDto authorInfo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    @Column(name = "url")
    private String url;


}
