package xyz.joscodes.chatreportsgone;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChatReportsGone extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		// Plugin startup logic
		Bukkit.getPluginManager().registerEvents(this, this);
		getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "Plugin Enabled");
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Plugin Disabled");
	}


	@EventHandler
	public void onChatSend(final AsyncPlayerChatEvent event) {
		event.setMessage(event.getMessage() + " ");
	}

}