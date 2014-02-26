package me.mrCookieSlime.Slimefun.Setup;

import java.io.File;

public class Folder {
	
	public static void cleanup() {
		File trash = new File("plugins/Slimefun/supported-plugins");
		if (trash.exists()) {
			File cleaned = new File("plugins/Slimefun");
			System.out.println("################################################");
			System.out.println("################################################");
			System.out.println("################################################");
			System.out.println("      ");
			System.out.println("Slimefun Warning:");
			System.out.println("         ");
			System.out.println("Slimefun has detected that your Files are too old and no longer work so it deleted your old Slimefun Folder and generated a new one. Your previous Settings are lost though, but at least Slimefun has saved you from a fatal Slimefun Error which would mess everything up and propably would have make Slimefun no longer work!");
			System.out.println("        ");
			System.out.println("################################################");
			System.out.println("################################################");
			System.out.println("################################################");
			
			delete(cleaned);
		}
		else {
			System.out.println("[Slimefun] All Files are up to date and will propably not cause any Errors");
		}
	}
	
	public static void delete(File folder) {
		File[] files = folder.listFiles();
		if (files != null) {
			for (File current: files) {
				if (current.isDirectory()) {
					delete(current);
				}
				else {
					current.delete();
				}
			}
		}
		folder.delete();
	}

}
