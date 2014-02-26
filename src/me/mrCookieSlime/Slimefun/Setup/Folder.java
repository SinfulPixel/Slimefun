package me.mrCookieSlime.Slimefun.Setup;

import java.io.File;

public class Folder {
	
	public static void cleanup() {
		File trash = new File("plugins/Slimefun/supported-plugins");
		if (trash.exists()) {
			File cleaned = new File("plugins/Slimefun");
			cleaned.delete();
			System.out.println("#########################################");
			System.out.println("");
			System.out.println("Slimefun Warning:");
			System.out.println("");
			System.out.println("Slimefun has detected that your Files are too old and no longer work so it deleted your old Slimefun Folder and generated a new one. Your previous Settings are lost though, but at least Slimefun has saved you from a fatal Slimefun Error which would mess everything up and propably would have make Slimefun no longer work!");
			System.out.println("");
			System.out.println("#########################################");
		}
		else {
			System.out.println("[Slimefun] All Files are up to date and will propably not cause any Errors");
		}
	}

}
