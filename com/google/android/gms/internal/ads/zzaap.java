package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;

public final class zzaap {
    private final zzzj zza;
    @Nullable
    private final zzaan zzb;
    @Nullable
    private final zzaao zzc;
    private boolean zzd;
    @Nullable
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzaap(@Nullable Context context0) {
        zzaan zzaan0;
        this.zza = new zzzj();
        zzaao zzaao0 = null;
        if(context0 == null) {
            zzaan0 = null;
        }
        else {
            DisplayManager displayManager0 = (DisplayManager)context0.getSystemService("display");
            zzaan0 = displayManager0 == null ? null : new zzaan(this, displayManager0);
        }
        this.zzb = zzaan0;
        if(zzaan0 != null) {
            zzaao0 = zzaao.zza();
        }
        this.zzc = zzaao0;
        this.zzk = 0x8000000000000001L;
        this.zzl = 0x8000000000000001L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public final long zza(long v) {
        long v6;
        if(this.zzp != -1L && this.zza.zzg()) {
            long v1 = this.zza.zzc();
            long v2 = this.zzq + ((long)(((float)(v1 * (this.zzm - this.zzp))) / this.zzi));
            if(Math.abs(v - v2) > 20000000L) {
                this.zzl();
            }
            else {
                v = v2;
            }
        }
        this.zzn = this.zzm;
        this.zzo = v;
        zzaao zzaao0 = this.zzc;
        if(zzaao0 != null && this.zzk != 0x8000000000000001L) {
            long v3 = zzaao0.zza;
            if(v3 != 0x8000000000000001L) {
                long v4 = this.zzk;
                long v5 = v3 + (v - v3) / v4 * v4;
                if(v <= v5) {
                    v6 = v5 - v4;
                }
                else {
                    long v7 = v5;
                    v5 = v4 + v5;
                    v6 = v7;
                }
                long v8 = this.zzl;
                if(v5 - v >= v - v6) {
                    v5 = v6;
                }
                return v5 - v8;
            }
        }
        return v;
    }

    static void zzb(zzaap zzaap0, Display display0) {
        if(display0 != null) {
            long v = (long)(1000000000.0 / ((double)display0.getRefreshRate()));
            zzaap0.zzk = v;
            zzaap0.zzl = v * 80L / 100L;
            return;
        }
        zzdo.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        zzaap0.zzk = 0x8000000000000001L;
        zzaap0.zzl = 0x8000000000000001L;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        this.zzm();
    }

    public final void zzd(long v) {
        long v1 = this.zzn;
        if(v1 != -1L) {
            this.zzp = v1;
            this.zzq = this.zzo;
        }
        ++this.zzm;
        this.zza.zze(v * 1000L);
        this.zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        this.zzl();
        this.zzn(false);
    }

    public final void zzf() {
        this.zzl();
    }

    public final void zzg() {
        this.zzd = true;
        this.zzl();
        if(this.zzb != null) {
            this.zzc.getClass();
            this.zzc.zzb();
            this.zzb.zza();
        }
        this.zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzaan zzaan0 = this.zzb;
        if(zzaan0 != null) {
            zzaan0.zzb();
            this.zzc.getClass();
            this.zzc.zzc();
        }
        this.zzk();
    }

    public final void zzi(@Nullable Surface surface0) {
        if(this.zze == surface0) {
            return;
        }
        this.zzk();
        this.zze = surface0;
        this.zzn(true);
    }

    public final void zzj(int v) {
        if(this.zzj == v) {
            return;
        }
        this.zzj = v;
        this.zzn(true);
    }

    private final void zzk() {
        if(zzei.zza >= 30) {
            Surface surface0 = this.zze;
            if(surface0 != null && this.zzj != 0x80000000 && this.zzh != 0.0f) {
                this.zzh = 0.0f;
                zzaam.zza(surface0, 0.0f);
            }
        }
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzm() {
        if(zzei.zza >= 30 && this.zze != null) {
            float f = this.zza.zzg() ? this.zza.zza() : this.zzf;
            float f1 = this.zzg;
            if(f != f1) {
                float f2 = 1.0f;
                int v = Float.compare(f, -1.0f);
                if(v != 0 && f1 != -1.0f) {
                    if(this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                        f2 = 0.02f;
                    }
                    if(Math.abs(f - this.zzg) >= f2) {
                        this.zzg = f;
                        this.zzn(false);
                    }
                }
                else if(v != 0 || this.zza.zzb() >= 30) {
                    this.zzg = f;
                    this.zzn(false);
                }
            }
        }
    }

    private final void zzn(boolean z) {
        if(zzei.zza >= 30) {
            float f = 0.0f;
            Surface surface0 = this.zze;
            if(surface0 != null && this.zzj != 0x80000000) {
                if(this.zzd) {
                    float f1 = this.zzg;
                    if(f1 != -1.0f) {
                        f = this.zzi * f1;
                    }
                }
                if(z || this.zzh != f) {
                    this.zzh = f;
                    zzaam.zza(surface0, f);
                }
            }
        }
    }
}

