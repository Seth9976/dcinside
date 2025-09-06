package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import o3.h;

public final class zzdvx extends zzfqz {
    private final Context zza;
    @h
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdvw zzf;
    private boolean zzg;

    zzdvx(Context context0) {
        super("ShakeDetector", "ads");
        this.zza = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqz
    public final void zza(SensorEvent sensorEvent0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zziR)).booleanValue()) {
            float[] arr_f = sensorEvent0.values;
            float f = arr_f[0];
            float f1 = arr_f[1];
            float f2 = arr_f[2] / 9.80665f;
            if(((float)Math.sqrt(f / 9.80665f * (f / 9.80665f) + f1 / 9.80665f * (f1 / 9.80665f) + f2 * f2)) >= ((float)(((Float)zzbe.zzc().zza(zzbcl.zziS))))) {
                long v = zzv.zzC().currentTimeMillis();
                if(this.zzd + ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zziT)))))) <= v) {
                    if(this.zzd + ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zziU)))))) < v) {
                        this.zze = 0;
                    }
                    zze.zza("Shake detected.");
                    this.zzd = v;
                    int v1 = this.zze + 1;
                    this.zze = v1;
                    zzdvw zzdvw0 = this.zzf;
                    if(zzdvw0 != null && v1 == ((int)(((Integer)zzbe.zzc().zza(zzbcl.zziV))))) {
                        ((zzduv)zzdvw0).zzh(new zzdus(((zzduv)zzdvw0)), zzduu.zzc);
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized(this) {
            if(this.zzg) {
                SensorManager sensorManager0 = this.zzb;
                if(sensorManager0 != null) {
                    sensorManager0.unregisterListener(this, this.zzc);
                    zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    public final void zzc() {
        synchronized(this) {
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zziR)).booleanValue()) {
                return;
            }
            if(this.zzb == null) {
                SensorManager sensorManager0 = (SensorManager)this.zza.getSystemService("sensor");
                this.zzb = sensorManager0;
                if(sensorManager0 == null) {
                    zzo.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                    return;
                }
                this.zzc = sensorManager0.getDefaultSensor(1);
            }
            if(!this.zzg) {
                SensorManager sensorManager1 = this.zzb;
                if(sensorManager1 != null) {
                    Sensor sensor0 = this.zzc;
                    if(sensor0 != null) {
                        sensorManager1.registerListener(this, sensor0, 2);
                        this.zzd = zzv.zzC().currentTimeMillis() - ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zziT))))));
                        this.zzg = true;
                        zze.zza("Listening for shake gestures.");
                    }
                }
            }
        }
    }

    public final void zzd(zzdvw zzdvw0) {
        this.zzf = zzdvw0;
    }
}

