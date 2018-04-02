package n3wb13.enchantremover.listeners;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;

public class EnchantItemListener implements Listener {

    @EventHandler
    public void onEnchant(EnchantItemEvent event) {
        if (event.getItem().getItemMeta().getEnchants().containsKey(Enchantment.MENDING))
            event.getItem().getItemMeta().getEnchants().remove(Enchantment.MENDING);
    }
}
