package n3wb13.enchantremover.listeners;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;

public class ItemHeldListener implements Listener {

    @EventHandler
    public void onHeld(PlayerItemHeldEvent event) {
        ItemStack newItem = event.getPlayer().getInventory().getItem(event.getNewSlot());
        if (newItem != null) {
            if (newItem.getItemMeta().getEnchants().containsKey(Enchantment.MENDING))
                newItem.getItemMeta().getEnchants().remove(Enchantment.MENDING);
        }
    }
}
