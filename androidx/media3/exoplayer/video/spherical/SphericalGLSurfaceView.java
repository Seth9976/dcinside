package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.AnyThread;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

@UnstableApi
public final class SphericalGLSurfaceView extends GLSurfaceView {
    @VisibleForTesting
    final class Renderer implements GLSurfaceView.Renderer, Listener, androidx.media3.exoplayer.video.spherical.TouchTracker.Listener {
        private final SceneRenderer a;
        private final float[] b;
        private final float[] c;
        private final float[] d;
        private final float[] e;
        private final float[] f;
        private float g;
        private float h;
        private final float[] i;
        private final float[] j;
        final SphericalGLSurfaceView k;

        public Renderer(SceneRenderer sceneRenderer0) {
            this.b = new float[16];
            this.c = new float[16];
            float[] arr_f = new float[16];
            this.d = arr_f;
            float[] arr_f1 = new float[16];
            this.e = arr_f1;
            float[] arr_f2 = new float[16];
            this.f = arr_f2;
            this.i = new float[16];
            this.j = new float[16];
            this.a = sceneRenderer0;
            GlUtil.V(arr_f);
            GlUtil.V(arr_f1);
            GlUtil.V(arr_f2);
            this.h = 3.141593f;
        }

        @Override  // androidx.media3.exoplayer.video.spherical.OrientationListener$Listener
        @BinderThread
        public void a(float[] arr_f, float f) {
            synchronized(this) {
                System.arraycopy(arr_f, 0, this.d, 0, this.d.length);
                this.h = -f;
                this.d();
            }
        }

        @Override  // androidx.media3.exoplayer.video.spherical.TouchTracker$Listener
        @UiThread
        public void b(PointF pointF0) {
            synchronized(this) {
                this.g = pointF0.y;
                this.d();
                Matrix.setRotateM(this.f, 0, -pointF0.x, 0.0f, 1.0f, 0.0f);
            }
        }

        // 去混淆评级： 低(30)
        private float c(float f) {
            return f > 1.0f ? ((float)(Math.toDegrees(Math.atan(1.0 / ((double)f))) * 2.0)) : 90.0f;
        }

        @AnyThread
        private void d() {
            Matrix.setRotateM(this.e, 0, -this.g, ((float)Math.cos(this.h)), ((float)Math.sin(this.h)), 0.0f);
        }

        @Override  // android.opengl.GLSurfaceView$Renderer
        public void onDrawFrame(GL10 gL100) {
            synchronized(this) {
                Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
            }
            Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
            this.a.c(this.c, false);
        }

        @Override  // androidx.media3.exoplayer.video.spherical.TouchTracker$Listener
        @UiThread
        public boolean onSingleTapUp(MotionEvent motionEvent0) {
            return SphericalGLSurfaceView.this.performClick();
        }

        @Override  // android.opengl.GLSurfaceView$Renderer
        public void onSurfaceChanged(GL10 gL100, int v, int v1) {
            GLES20.glViewport(0, 0, v, v1);
            float f = ((float)v) / ((float)v1);
            Matrix.perspectiveM(this.b, 0, this.c(f), f, 0.1f, 100.0f);
        }

        @Override  // android.opengl.GLSurfaceView$Renderer
        public void onSurfaceCreated(GL10 gL100, EGLConfig eGLConfig0) {
            synchronized(this) {
                SurfaceTexture surfaceTexture0 = this.a.d();
                SphericalGLSurfaceView.this.g(surfaceTexture0);
            }
        }
    }

    public interface VideoSurfaceListener {
        void D(Surface arg1);

        void E(Surface arg1);
    }

    private final CopyOnWriteArrayList a;
    private final SensorManager b;
    @Nullable
    private final Sensor c;
    private final OrientationListener d;
    private final Handler e;
    private final TouchTracker f;
    private final SceneRenderer g;
    @Nullable
    private SurfaceTexture h;
    @Nullable
    private Surface i;
    private boolean j;
    private boolean k;
    private boolean l;
    private static final int m = 90;
    private static final float n = 0.1f;
    private static final float o = 100.0f;
    private static final float p = 25.0f;
    static final float q = 3.141593f;

    public SphericalGLSurfaceView(Context context0) {
        this(context0, null);
    }

    public SphericalGLSurfaceView(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new CopyOnWriteArrayList();
        this.e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager0 = (SensorManager)Assertions.g(context0.getSystemService("sensor"));
        this.b = sensorManager0;
        Sensor sensor0 = sensorManager0.getDefaultSensor(15);
        if(sensor0 == null) {
            sensor0 = sensorManager0.getDefaultSensor(11);
        }
        this.c = sensor0;
        SceneRenderer sceneRenderer0 = new SceneRenderer();
        this.g = sceneRenderer0;
        Renderer sphericalGLSurfaceView$Renderer0 = new Renderer(this, sceneRenderer0);
        TouchTracker touchTracker0 = new TouchTracker(context0, sphericalGLSurfaceView$Renderer0, 25.0f);
        this.f = touchTracker0;
        this.d = new OrientationListener(((WindowManager)Assertions.g(((WindowManager)context0.getSystemService("window")))).getDefaultDisplay(), new Listener[]{touchTracker0, sphericalGLSurfaceView$Renderer0});
        this.j = true;
        this.setEGLContextClientVersion(2);
        this.setRenderer(sphericalGLSurfaceView$Renderer0);
        this.setOnTouchListener(touchTracker0);
    }

    public void d(VideoSurfaceListener sphericalGLSurfaceView$VideoSurfaceListener0) {
        this.a.add(sphericalGLSurfaceView$VideoSurfaceListener0);
    }

    // 检测为 Lambda 实现
    private void e() [...]

    // 检测为 Lambda 实现
    private void f(SurfaceTexture surfaceTexture0) [...]

    private void g(SurfaceTexture surfaceTexture0) {
        c c0 = () -> {
            SurfaceTexture surfaceTexture1 = this.h;
            Surface surface0 = this.i;
            Surface surface1 = new Surface(surfaceTexture0);
            this.h = surfaceTexture0;
            this.i = surface1;
            for(Object object0: this.a) {
                ((VideoSurfaceListener)object0).E(surface1);
            }
            SphericalGLSurfaceView.h(surfaceTexture1, surface0);
        };
        this.e.post(c0);
    }

    public CameraMotionListener getCameraMotionListener() {
        return this.g;
    }

    public VideoFrameMetadataListener getVideoFrameMetadataListener() {
        return this.g;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.i;
    }

    private static void h(@Nullable SurfaceTexture surfaceTexture0, @Nullable Surface surface0) {
        if(surfaceTexture0 != null) {
            surfaceTexture0.release();
        }
        if(surface0 != null) {
            surface0.release();
        }
    }

    public void i(VideoSurfaceListener sphericalGLSurfaceView$VideoSurfaceListener0) {
        this.a.remove(sphericalGLSurfaceView$VideoSurfaceListener0);
    }

    private void j() {
        boolean z = this.j && this.k;
        Sensor sensor0 = this.c;
        if(sensor0 != null && z != this.l) {
            if(z) {
                this.b.registerListener(this.d, sensor0, 0);
            }
            else {
                this.b.unregisterListener(this.d);
            }
            this.l = z;
        }
    }

    @Override  // android.opengl.GLSurfaceView
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b b0 = () -> {
            Surface surface0 = this.i;
            if(surface0 != null) {
                for(Object object0: this.a) {
                    ((VideoSurfaceListener)object0).D(surface0);
                }
            }
            SphericalGLSurfaceView.h(this.h, surface0);
            this.h = null;
            this.i = null;
        };
        this.e.post(b0);
    }

    @Override  // android.opengl.GLSurfaceView
    public void onPause() {
        this.k = false;
        this.j();
        super.onPause();
    }

    @Override  // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.k = true;
        this.j();
    }

    public void setDefaultStereoMode(int v) {
        this.g.f(v);
    }

    public void setUseSensorRotation(boolean z) {
        this.j = z;
        this.j();
    }
}

