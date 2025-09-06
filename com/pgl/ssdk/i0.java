package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

public class i0 implements SensorEventListener {
    static class a {
        public long a;
        public float[] b;
        public float[] c;
        public float[] d;

        public a(long v) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.a = v;
        }
    }

    private static final float[] a = null;
    public static boolean b = true;
    private static volatile i0 c;
    private Sensor d;
    private Sensor e;
    private Sensor f;
    private volatile boolean g;
    private volatile boolean h;
    private final Context i;
    private AtomicReference j;
    private long k;

    static {
        i0.a = new float[]{999999.0f, 999999.0f, 999999.0f};
    }

    private i0(Context context0) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = false;
        this.j = new AtomicReference();
        this.k = 0xF423FL;
        this.i = context0;
    }

    public static i0 a(Context context0) {
        if(i0.c == null) {
            Class class0 = i0.class;
            __monitor_enter(class0);
            try {
                if(i0.c == null) {
                    i0.c = new i0(context0);
                }
                __monitor_exit(class0);
                goto label_10;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
    label_10:
        if(i0.b) {
            i0.c.c();
        }
        return i0.c;
    }

    private static void a(Object[] arr_object) {
        arr_object[0] = 999999.0f;
        arr_object[1] = 999999.0f;
        arr_object[2] = 999999.0f;
        arr_object[3] = 0xF423FL;
        arr_object[4] = i0.a;
        arr_object[5] = i0.a;
    }

    private static void a(Object[] arr_object, a i0$a0) {
        float[] arr_f = i0$a0.b;
        if(arr_f == null) {
            arr_object[0] = 999999.0f;
            arr_object[1] = 999999.0f;
            arr_object[2] = 999999.0f;
            arr_object[4] = i0.a;
        }
        else {
            float[] arr_f1 = i0$a0.c;
            float[] arr_f2 = arr_f1 == null ? i0.a(arr_object, arr_f) : i0.a(arr_object, arr_f, arr_f1);
            arr_object[0] = (float)arr_f2[0];
            arr_object[1] = (float)arr_f2[1];
            arr_object[2] = (float)arr_f2[2];
            arr_object[4] = i0$a0.b;
        }
        arr_object[3] = i0$a0.a;
        float[] arr_f3 = i0$a0.d;
        if(arr_f3 != null) {
            arr_object[5] = arr_f3;
            return;
        }
        arr_object[5] = i0.a;
    }

    private static float[] a(Object[] arr_object, float[] arr_f) {
        float f = arr_f[0];
        float f1 = arr_f[1];
        float f2 = arr_f[2];
        float f3 = 1.0f / ((float)Math.sqrt(f * f + f1 * f1 + f2 * f2));
        return new float[]{999999.0f, (((float)Math.toDegrees(((float)Math.asin(-(f1 * f3))))) + 360.0f) % 360.0f, (((float)Math.toDegrees(((float)Math.atan2(-(f * f3), f2 * f3)))) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] arr_object, float[] arr_f, float[] arr_f1) {
        float[] arr_f2 = new float[9];
        float[] arr_f3 = new float[3];
        SensorManager.getRotationMatrix(arr_f2, new float[9], arr_f, arr_f1);
        SensorManager.getOrientation(arr_f2, arr_f3);
        return new float[]{(((float)Math.toDegrees(arr_f3[0])) + 360.0f) % 360.0f, (((float)Math.toDegrees(arr_f3[1])) + 360.0f) % 360.0f, (((float)Math.toDegrees(arr_f3[2])) + 360.0f) % 360.0f};
    }

    public void a() {
        if(i0.b && !this.g) {
            this.d();
        }
    }

    public Object[] b() {
        Object[] arr_object = new Object[6];
        a i0$a0 = (a)this.j.get();
        if(i0.b && i0$a0 != null) {
            int v = 0;
            while(this.d != null && i0$a0.b == null || this.e != null && i0$a0.c == null || this.f != null && i0$a0.d == null) {
                x0.a(50L);
                ++v;
                if(v > 20) {
                    break;
                }
            }
            this.e();
            this.g = false;
            i0.a(arr_object, i0$a0);
            this.j.set(null);
            return arr_object;
        }
        i0.a(arr_object);
        return arr_object;
    }

    private void c() {
        if(this.h) {
            return;
        }
        try {
            SensorManager sensorManager0 = (SensorManager)this.i.getApplicationContext().getSystemService("sensor");
            if(sensorManager0 != null) {
                this.d = sensorManager0.getDefaultSensor(1);
                this.e = sensorManager0.getDefaultSensor(2);
                this.f = sensorManager0.getDefaultSensor(4);
            }
        }
        catch(Exception unused_ex) {
        }
        this.h = true;
    }

    public boolean d() {
        if(this.d != null) {
            try {
                SensorManager sensorManager0 = (SensorManager)this.i.getApplicationContext().getSystemService("sensor");
                if(sensorManager0 != null) {
                    boolean z = sensorManager0.registerListener(this, this.d, 1);
                    Sensor sensor0 = this.e;
                    if(sensor0 != null) {
                        sensorManager0.registerListener(this, sensor0, 1);
                    }
                    Sensor sensor1 = this.f;
                    if(sensor1 != null) {
                        sensorManager0.registerListener(this, sensor1, 1);
                    }
                    if(!z) {
                        this.e();
                        return this.g;
                    }
                    long v = System.currentTimeMillis();
                    this.k = v;
                    this.j.set(new a(v));
                    this.g = true;
                    return true;
                }
            }
            catch(Throwable unused_ex) {
                this.e();
            }
        }
        return this.g;
    }

    private void e() {
        try {
            this.k = -1L;
            this.g = false;
            SensorManager sensorManager0 = (SensorManager)this.i.getApplicationContext().getSystemService("sensor");
            if(sensorManager0 != null) {
                sensorManager0.unregisterListener(this);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor0, int v) {
    }

    @Override  // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent0) {
        a i0$a0 = (a)this.j.get();
        if(i0$a0 == null) {
            return;
        }
        switch(sensorEvent0.sensor.getType()) {
            case 1: {
                if(i0$a0.b == null) {
                    i0$a0.b = sensorEvent0.values;
                    return;
                }
                break;
            }
            case 2: {
                if(i0$a0.c == null) {
                    i0$a0.c = sensorEvent0.values;
                    return;
                }
                break;
            }
            case 4: {
                if(i0$a0.d == null) {
                    i0$a0.d = sensorEvent0.values;
                    return;
                }
                break;
            }
        }
    }
}

