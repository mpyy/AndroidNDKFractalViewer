package com.example.matias.ndkfractalviewer;

/**
 * Load the native library and expose native interfaces through a wrapper class.
 * Created by matias on 2.4.2016.
 */
public class FractalLibJNIWrapper {
    static {
        System.loadLibrary("fractal");
    }

    public static native void on_surface_created();

    public static native void on_surface_changed(int width, int height);

    public static native void on_draw_frame();
}
