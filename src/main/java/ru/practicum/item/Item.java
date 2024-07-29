package ru.practicum.item;

import lombok.Data;

@Data
public class Item {
    private Long id;
    private Long userID;
    private String url;
}
