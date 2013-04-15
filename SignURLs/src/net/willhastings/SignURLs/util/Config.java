package net.willhastings.SignURLs.util;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

import net.willhastings.SignURLs.SignURLs;

public class Config 
{
	public static String SIGN_TEXT;
	public static String SIGN_TEXT_COLOR;
	public static String CHAT_PREFIX;
	
	public static void loadConfig(SignURLs signURLs) 
	{
		FileConfiguration config = signURLs.getConfig();
		
		config.options().copyDefaults(true);
		signURLs.saveConfig();
		
		CHAT_PREFIX = ChatColor.translateAlternateColorCodes('&', config.getString("Chat.Prefix"));
		SIGN_TEXT = config.getString("Sign.Text");
		SIGN_TEXT_COLOR = ChatColor.translateAlternateColorCodes('&', config.getString("Sign.Color"));
		
		signURLs.saveConfig();
	}

}
