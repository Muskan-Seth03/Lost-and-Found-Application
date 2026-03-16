package net.engineeringdigest.journalApp.controllers;

import net.engineeringdigest.journalApp.entity.Item;
import net.engineeringdigest.journalApp.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/lost")
    public Item reportLostItem(@RequestBody Item item) {
        return itemService.reportLostItem(item);
    }

    @PostMapping("/found")
    public Item reportFoundItem(@RequestBody Item item) {
        return itemService.reportFoundItem(item);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/lost")
    public List<Item> getLostItems() {
        return itemService.getLostItems();
    }

    @GetMapping("/found")
    public List<Item> getFoundItems() {
        return itemService.getFoundItems();
    }

    @GetMapping("/search")
    public List<Item> searchItems(@RequestParam String keyword) {
        return itemService.searchItems(keyword);
    }
}