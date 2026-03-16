package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong();

    public Item reportLostItem(Item item) {
        item.setId(idCounter.incrementAndGet());
        item.setStatus("LOST");
        items.add(item);
        return item;
    }

    public Item reportFoundItem(Item item) {
        item.setId(idCounter.incrementAndGet());
        item.setStatus("FOUND");
        items.add(item);
        return item;
    }

    public List<Item> getAllItems() {
        return items;
    }

    public List<Item> getLostItems() {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if ("LOST".equals(item.getStatus())) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Item> getFoundItems() {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if ("FOUND".equals(item.getStatus())) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Item> searchItems(String keyword) {
        List<Item> result = new ArrayList<>();

        for (Item item : items) {
            if (item.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(item);
            }
        }

        return result;
    }
}