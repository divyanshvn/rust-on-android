package pl.svgames.blog.RustOnAndroid;

import pl.svgames.blog.RustOnAndroid.Result;

public class SimCalculator {
	// Used to load the 'native-lib' library on application startup.
	static {
		System.loadLibrary("Sim");
	}

	public static native Result Sim(String expression);
}
