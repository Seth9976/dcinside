package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.graphics.SurfaceTexture;

public final class a implements SurfaceTexture.OnFrameAvailableListener {
    public final SceneRenderer a;

    public a(SceneRenderer sceneRenderer0) {
        this.a = sceneRenderer0;
    }

    @Override  // android.graphics.SurfaceTexture$OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture0) {
        this.a.e(surfaceTexture0);
    }
}

