package androidx.media3.exoplayer.video;

import O1.l;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.EGLSurfaceTexture;
import androidx.media3.common.util.GlUtil.GlException;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class PlaceholderSurface extends Surface {
    static class PlaceholderSurfaceThread extends HandlerThread implements Handler.Callback {
        private EGLSurfaceTexture a;
        private Handler b;
        @Nullable
        private Error c;
        @Nullable
        private RuntimeException d;
        @Nullable
        private PlaceholderSurface e;
        private static final int f = 1;
        private static final int g = 2;

        public PlaceholderSurfaceThread() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public PlaceholderSurface a(int v) {
            this.start();
            this.b = new Handler(this.getLooper(), this);
            this.a = new EGLSurfaceTexture(this.b);
            synchronized(this) {
                boolean z = false;
                this.b.obtainMessage(1, v, 0).sendToTarget();
                while(this.e == null && this.d == null && this.c == null) {
                    try {
                        this.wait();
                    }
                    catch(InterruptedException unused_ex) {
                        z = true;
                    }
                }
            }
            if(z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException0 = this.d;
            if(runtimeException0 != null) {
                throw runtimeException0;
            }
            Error error0 = this.c;
            if(error0 != null) {
                throw error0;
            }
            return (PlaceholderSurface)Assertions.g(this.e);
        }

        private void b(int v) throws GlException {
            Assertions.g(this.a);
            this.a.h(v);
            this.e = new PlaceholderSurface(this, this.a.g(), v != 0, null);
        }

        public void c() {
            Assertions.g(this.b);
            this.b.sendEmptyMessage(2);
        }

        private void d() {
            Assertions.g(this.a);
            this.a.i();
        }

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            switch(message0.what) {
                case 1: {
                    try {
                        try {
                            this.b(message0.arg1);
                            goto label_45;
                        }
                        catch(RuntimeException runtimeException0) {
                        }
                        catch(GlException glUtil$GlException0) {
                            goto label_15;
                        }
                        catch(Error error0) {
                            goto label_26;
                        }
                        Log.e("PlaceholderSurface", "Failed to initialize placeholder surface", runtimeException0);
                        this.d = runtimeException0;
                    }
                    catch(Throwable throwable0) {
                        goto label_37;
                    }
                    synchronized(this) {
                        this.notify();
                    }
                    return true;
                    try {
                    label_15:
                        Log.e("PlaceholderSurface", "Failed to initialize placeholder surface", glUtil$GlException0);
                        this.d = new IllegalStateException(glUtil$GlException0);
                    }
                    catch(Throwable throwable0) {
                        goto label_37;
                    }
                    synchronized(this) {
                        this.notify();
                    }
                    return true;
                    try {
                    label_26:
                        Log.e("PlaceholderSurface", "Failed to initialize placeholder surface", error0);
                        this.c = error0;
                    }
                    catch(Throwable throwable0) {
                        goto label_37;
                    }
                    synchronized(this) {
                        this.notify();
                    }
                    return true;
                label_37:
                    synchronized(this) {
                        this.notify();
                    }
                    throw throwable0;
                label_45:
                    synchronized(this) {
                        this.notify();
                    }
                    return true;
                }
                case 2: {
                    try {
                        this.d();
                    }
                    catch(Throwable throwable6) {
                        Log.e("PlaceholderSurface", "Failed to release placeholder surface", throwable6);
                    }
                    finally {
                        this.quit();
                    }
                    return true;
                }
                default: {
                    return true;
                }
            }
        }
    }

    public final boolean a;
    private final PlaceholderSurfaceThread b;
    private boolean c;
    private static final String d = "PlaceholderSurface";
    private static int e;
    private static boolean f;

    private PlaceholderSurface(PlaceholderSurfaceThread placeholderSurface$PlaceholderSurfaceThread0, SurfaceTexture surfaceTexture0, boolean z) {
        super(surfaceTexture0);
        this.b = placeholderSurface$PlaceholderSurfaceThread0;
        this.a = z;
    }

    PlaceholderSurface(PlaceholderSurfaceThread placeholderSurface$PlaceholderSurfaceThread0, SurfaceTexture surfaceTexture0, boolean z, androidx.media3.exoplayer.video.PlaceholderSurface.1 placeholderSurface$10) {
        this(placeholderSurface$PlaceholderSurfaceThread0, surfaceTexture0, z);
    }

    private static int a(Context context0) {
        if(GlUtil.R(context0)) {
            return GlUtil.S() ? 1 : 2;
        }
        return 0;
    }

    public static boolean c(Context context0) {
        boolean z = true;
        synchronized(PlaceholderSurface.class) {
            if(!PlaceholderSurface.f) {
                PlaceholderSurface.e = PlaceholderSurface.a(context0);
                PlaceholderSurface.f = true;
            }
            if(PlaceholderSurface.e == 0) {
                z = false;
            }
            return z;
        }
    }

    public static PlaceholderSurface d(Context context0, boolean z) {
        int v = 0;
        Assertions.i(!z || PlaceholderSurface.c(context0));
        PlaceholderSurfaceThread placeholderSurface$PlaceholderSurfaceThread0 = new PlaceholderSurfaceThread();
        if(z) {
            v = PlaceholderSurface.e;
        }
        return placeholderSurface$PlaceholderSurfaceThread0.a(v);
    }

    @l(imports = {"androidx.media3.exoplayer.video.PlaceholderSurface"}, replacement = "PlaceholderSurface.newInstance(context, secure)")
    @Deprecated
    public static PlaceholderSurface e(Context context0, boolean z) {
        return PlaceholderSurface.d(context0, z);
    }

    @Override  // android.view.Surface
    public void release() {
        super.release();
        synchronized(this.b) {
            if(!this.c) {
                this.b.c();
                this.c = true;
            }
        }
    }

    class androidx.media3.exoplayer.video.PlaceholderSurface.1 {
    }

}

