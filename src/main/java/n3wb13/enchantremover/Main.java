package n3wb13.enchantremover;

import n3wb13.enchantremover.listeners.EnchantItemListener;
import n3wb13.enchantremover.listeners.ItemHeldListener;
import n3wb13.enchantremover.listeners.JoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getServer().getPluginManager().registerEvents(new EnchantItemListener(), this);
        getServer().getPluginManager().registerEvents(new ItemHeldListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
