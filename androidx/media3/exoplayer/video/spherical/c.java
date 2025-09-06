package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;

public final class c implements Runnable {
    public final SphericalGLSurfaceView a;
    public final SurfaceTexture b;

    public c(SphericalGLSurfaceView sphericalGLSurfaceView0, SurfaceTexture surfaceTexture0) {
        this.a = sphericalGLSurfaceView0;
        this.b = surfaceTexture0;
    }

    @Override
    public final void run() {
        this.a.f(this.b);
    }
}

