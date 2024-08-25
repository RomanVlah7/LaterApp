package common.laterapp.item;

import common.laterapp.user.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
