package utils;

import edu.wpi.first.wpilibj.Preferences;

public class Prefs {
		
	private static Preferences mPrefs;

	public Prefs() {
	}
	
	public static Preferences get() {
		if (mPrefs == null) {
			return mPrefs = Preferences.getInstance();
		}
		return mPrefs;
	}
	
}
