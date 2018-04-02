package n3wb13.enchantremover.listeners;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        for (ItemStack itemStack : player.getInventory().getContents()) {
            if (itemStack.getItemMeta().getEnchants().containsKey(Enchantment.MENDING))
                itemStack.getItemMeta().getEnchants().remove(Enchantment.MENDING);
        }

        for (ItemStack itemStack : player.getInventory().getArmorContents()) {
            if (itemStack.getItemMeta().getEnchants().containsKey(Enchantment.MENDING))
                itemStack.getItemMeta().getEnchants().remove(Enchantment.MENDING);
        }
    }
}
