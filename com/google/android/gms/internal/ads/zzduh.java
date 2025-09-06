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

public final class zzduh extends zzfqz {
    @h
    private final SensorManager zza;
    @h
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    @h
    private zzdug zzi;
    private boolean zzj;

    zzduh(Context context0) {
        super("FlickDetector", "ads");
        this.zzc = 0.0f;
        this.zzd = 0.0f;
        this.zze = zzv.zzC().currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
        this.zza = sensorManager0;
        if(sensorManager0 != null) {
            this.zzb = sensorManager0.getDefaultSensor(4);
            return;
        }
        this.zzb = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqz
    public final void zza(SensorEvent sensorEvent0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zziW)).booleanValue()) {
            long v = zzv.zzC().currentTimeMillis();
            if(this.zze + ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zziY)))))) < v) {
                this.zzf = 0;
                this.zze = v;
                this.zzg = false;
                this.zzh = false;
                this.zzc = (float)this.zzd;
            }
            Float float0 = (float)(((float)this.zzd) + sensorEvent0.values[1] * 4.0f);
            this.zzd = float0;
            zzbcc zzbcc0 = zzbcl.zziX;
            if(((float)float0) > this.zzc + ((float)(((Float)zzbe.zzc().zza(zzbcc0))))) {
                this.zzc = (float)this.zzd;
                this.zzh = true;
            }
            else if(((float)this.zzd) < this.zzc - ((float)(((Float)zzbe.zzc().zza(zzbcc0))))) {
                this.zzc = (float)this.zzd;
                this.zzg = true;
            }
            if(this.zzd.isInfinite()) {
                this.zzd = 0.0f;
                this.zzc = 0.0f;
            }
            if(this.zzg && this.zzh) {
                zze.zza("Flick detected.");
                this.zze = v;
                int v1 = this.zzf + 1;
                this.zzf = v1;
                this.zzg = false;
                this.zzh = false;
                zzdug zzdug0 = this.zzi;
                if(zzdug0 != null && v1 == ((int)(((Integer)zzbe.zzc().zza(zzbcl.zziZ))))) {
                    ((zzduv)zzdug0).zzh(new zzdut(((zzduv)zzdug0)), zzduu.zzc);
                }
            }
        }
    }

    public final void zzb() {
        synchronized(this) {
            if(this.zzj) {
                SensorManager sensorManager0 = this.zza;
                if(sensorManager0 != null) {
                    Sensor sensor0 = this.zzb;
                    if(sensor0 != null) {
                        sensorManager0.unregisterListener(this, sensor0);
                        this.zzj = false;
                        zze.zza("Stopped listening for flick gestures.");
                    }
                }
            }
        }
    }

    public final void zzc() {
        synchronized(this) {
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zziW)).booleanValue()) {
                return;
            }
            if(!this.zzj) {
                SensorManager sensorManager0 = this.zza;
                if(sensorManager0 != null) {
                    Sensor sensor0 = this.zzb;
                    if(sensor0 != null) {
                        sensorManager0.registerListener(this, sensor0, 2);
                        this.zzj = true;
                        zze.zza("Listening for flick gestures.");
                    }
                }
            }
        }
        if(this.zza != null && this.zzb != null) {
            return;
        }
        zzo.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
    }

    public final void zzd(zzdug zzdug0) {
        this.zzi = zzdug0;
    }
}

