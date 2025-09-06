package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.annotation.BinderThread;

final class OrientationListener implements SensorEventListener {
    public interface Listener {
        void a(float[] arg1, float arg2);
    }

    private final float[] a;
    private final float[] b;
    private final float[] c;
    private final float[] d;
    private final Display e;
    private final Listener[] f;
    private boolean g;

    public OrientationListener(Display display0, Listener[] arr_orientationListener$Listener) {
        this.a = new float[16];
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[3];
        this.e = display0;
        this.f = arr_orientationListener$Listener;
    }

    private float a(float[] arr_f) {
        SensorManager.remapCoordinateSystem(arr_f, 1, 0x83, this.b);
        SensorManager.getOrientation(this.b, this.d);
        return this.d[2];
    }

    private void b(float[] arr_f, float f) {
        Listener[] arr_orientationListener$Listener = this.f;
        for(int v = 0; v < arr_orientationListener$Listener.length; ++v) {
            arr_orientationListener$Listener[v].a(arr_f, f);
        }
    }

    private void c(float[] arr_f) {
        if(!this.g) {
            FrameRotationQueue.a(this.c, arr_f);
            this.g = true;
        }
        System.arraycopy(arr_f, 0, this.b, 0, this.b.length);
        Matrix.multiplyMM(arr_f, 0, this.b, 0, this.c, 0);
    }

    private void d(float[] arr_f, int v) {
        if(v != 0) {
            int v1 = 0x81;
            int v2 = 1;
            switch(v) {
                case 1: {
                    v1 = 2;
                    v2 = 0x81;
                    break;
                }
                case 2: {
                    v2 = 130;
                    break;
                }
                case 3: {
                    v1 = 130;
                    break;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
            System.arraycopy(arr_f, 0, this.b, 0, this.b.length);
            SensorManager.remapCoordinateSystem(this.b, v1, v2, arr_f);
        }
    }

    private static void e(float[] arr_f) {
        Matrix.rotateM(arr_f, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override  // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor0, int v) {
    }

    @Override  // android.hardware.SensorEventListener
    @BinderThread
    public void onSensorChanged(SensorEvent sensorEvent0) {
        SensorManager.getRotationMatrixFromVector(this.a, sensorEvent0.values);
        int v = this.e.getRotation();
        this.d(this.a, v);
        float f = this.a(this.a);
        OrientationListener.e(this.a);
        this.c(this.a);
        this.b(this.a, f);
    }
}

