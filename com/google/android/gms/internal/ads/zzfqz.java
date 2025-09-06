package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

public abstract class zzfqz implements SensorEventListener {
    protected zzfqz(String s, String s1) {
    }

    @Override  // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor0, int v) {
    }

    @Override  // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent0) {
        this.zza(sensorEvent0);
    }

    public abstract void zza(SensorEvent arg1);
}

