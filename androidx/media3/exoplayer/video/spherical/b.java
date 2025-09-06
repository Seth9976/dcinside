package androidx.media3.exoplayer.video.spherical;

public final class b implements Runnable {
    public final SphericalGLSurfaceView a;

    public b(SphericalGLSurfaceView sphericalGLSurfaceView0) {
        this.a = sphericalGLSurfaceView0;
    }

    @Override
    public final void run() {
        this.a.e();
    }
}

