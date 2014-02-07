package me.mrCookieSlime.Slimefun.Setup;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class FortuneCookieMessages {
	
	public static File messages = new File("plugins/Slimefun", "fortune-cookie-messages.yml");
	public static FileConfiguration msgcfg = YamlConfiguration.loadConfiguration(messages);
	
	public static void setup() {
		if (!messages.exists()) {
			List<String> fortune = new ArrayList<String>();
			
			fortune.add("You have luck today");
			fortune.add("Something strange will happen soon");
			fortune.add("I know what you thought, forgot it !");
			fortune.add("OOOGA BOOGA BOO DAAAA DAAAA");
			fortune.add("Yeaaaaaaa, I know what you expected");
			fortune.add("You will taste the flavour of losing tomorrow");
			fortune.add("Are you serious? Hide before something bad will happen...");
			fortune.add("Ooops, too late");
			fortune.add("Ouuuch, why did you eat me?");
			fortune.add("May the force be with you!");
			fortune.add("You won't have luck in the next week");
			fortune.add("Errr, i better don't say what I saw in your future");
			fortune.add("Ask me later");
			fortune.add("Maybe! Maybe in a galaxy far far away");
			fortune.add("Your time is almost over");
			
			msgcfg.set("messages", fortune);
			
			
			
			try {
				msgcfg.save(messages);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
