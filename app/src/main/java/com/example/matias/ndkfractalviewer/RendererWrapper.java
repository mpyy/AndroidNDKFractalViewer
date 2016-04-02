package com.example.matias.ndkfractalviewer;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import static android.opengl.GLES20.GL_COLOR_BUFFER_BIT;
import static android.opengl.GLES20.glClear;
import static android.opengl.GLES20.glClearColor;

/**
 * Default renderer class.
 * Created by matias on 1.4.2016.
 */
public class RendererWrapper implements GLSurfaceView.Renderer {
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        // glClearColor(0.0f, 0.0f, 1.0f, 0.0f);
        FractalLibJNIWrapper.on_surface_created();
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        // No-op
        FractalLibJNIWrapper.on_surface_changed(width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        // glClear(GL_COLOR_BUFFER_BIT);
        FractalLibJNIWrapper.on_draw_frame();
    }
}
