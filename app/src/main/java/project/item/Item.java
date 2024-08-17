package project.item;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.user.UserDto;

@Entity
@Table(name = "items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "userId")
    UserDto authorInfo;

    @Column(name = "url")
    private String url;



/*    @Entity
    @Table(name = "users")
    private static class AuthorId{
        @Column(name = "user_id")
        long authorId;
    }*/
}
