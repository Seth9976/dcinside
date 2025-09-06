package pl.droidsonroids.gif;

import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;

class q implements TextureView.SurfaceTextureListener {
    private final b a;

    q(b gifTextureView$b0) {
        this.a = gifTextureView$b0;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        Surface surface0 = new Surface(surfaceTexture0);
        Canvas canvas0 = surface0.lockCanvas(null);
        this.a.a(canvas0);
        surface0.unlockCanvasAndPost(canvas0);
        surface0.release();
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        return false;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
    }
}

