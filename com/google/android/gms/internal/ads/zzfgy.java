package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;

public final class zzfgy implements zzfgw {
    private final Context zza;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private zzfhm zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private boolean zzn;
    private boolean zzo;
    private final int zzp;
    private int zzq;
    private int zzr;

    zzfgy(Context context0, int v) {
        this.zzb = 0L;
        this.zzc = -1L;
        this.zzd = false;
        this.zzq = 2;
        this.zzr = 2;
        this.zze = 0;
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = zzfhm.zzb;
        this.zzk = "";
        this.zzl = "";
        this.zzm = "";
        this.zzn = false;
        this.zzo = false;
        this.zza = context0;
        this.zzp = v;
    }

    public final zzfgy zzA() {
        synchronized(this) {
            this.zzc = zzv.zzC().elapsedRealtime();
            return this;
        }
    }

    public final zzfgy zzK(int v) {
        synchronized(this) {
            this.zzq = v;
        }
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final zzfgw zza(zze zze0) {
        this.zzr(zze0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final zzfgw zzb(zzfbz zzfbz0) {
        this.zzs(zzfbz0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final zzfgw zzc(String s) {
        this.zzt(s);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final zzfgw zzd(String s) {
        this.zzu(s);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final zzfgw zze(String s) {
        this.zzv(s);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final zzfgw zzf(zzfhm zzfhm0) {
        this.zzw(zzfhm0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final zzfgw zzg(boolean z) {
        this.zzx(z);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final zzfgw zzh(Throwable throwable0) {
        this.zzy(throwable0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final zzfgw zzi() {
        this.zzz();
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final zzfgw zzj() {
        this.zzA();
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final boolean zzk() {
        synchronized(this) {
        }
        return this.zzo;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    @Nullable
    public final zzfha zzm() {
        synchronized(this) {
            if(this.zzn) {
                return null;
            }
            this.zzn = true;
            if(!this.zzo) {
                this.zzz();
            }
            if(this.zzc < 0L) {
                this.zzA();
            }
            return new zzfha(this, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgw
    public final zzfgw zzn(int v) {
        this.zzK(v);
        return this;
    }

    public final zzfgy zzr(zze zze0) {
        synchronized(this) {
            IBinder iBinder0 = zze0.zze;
            if(iBinder0 != null) {
                String s = ((zzcvm)iBinder0).zzk();
                if(!TextUtils.isEmpty(s)) {
                    this.zzf = s;
                }
                String s1 = ((zzcvm)iBinder0).zzi();
                if(!TextUtils.isEmpty(s1)) {
                    this.zzg = s1;
                }
            }
            return this;
        }
    }

    public final zzfgy zzs(zzfbz zzfbz0) {
        synchronized(this) {
            if(!TextUtils.isEmpty(zzfbz0.zzb.zzb)) {
                this.zzf = zzfbz0.zzb.zzb;
            }
            for(Object object0: zzfbz0.zza) {
                zzfbo zzfbo0 = (zzfbo)object0;
                if(!TextUtils.isEmpty(zzfbo0.zzab)) {
                    this.zzg = zzfbo0.zzab;
                    break;
                }
                if(false) {
                    break;
                }
            }
            return this;
        }
    }

    public final zzfgy zzt(String s) {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zziI)).booleanValue()) {
                this.zzm = s;
            }
            return this;
        }
    }

    public final zzfgy zzu(String s) {
        synchronized(this) {
            this.zzh = s;
        }
        return this;
    }

    public final zzfgy zzv(String s) {
        synchronized(this) {
            this.zzi = s;
        }
        return this;
    }

    public final zzfgy zzw(zzfhm zzfhm0) {
        synchronized(this) {
            this.zzj = zzfhm0;
        }
        return this;
    }

    public final zzfgy zzx(boolean z) {
        synchronized(this) {
            this.zzd = z;
        }
        return this;
    }

    public final zzfgy zzy(Throwable throwable0) {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zziI)).booleanValue()) {
                this.zzl = zzbuh.zzf(throwable0);
                String s = zzbuh.zze(throwable0);
                Object object0 = zzfvc.zzb(zzfty.zzc('\n')).zzd(s).iterator().next();
                this.zzk = (String)object0;
            }
            return this;
        }
    }

    public final zzfgy zzz() {
        synchronized(this) {
            this.zze = zzv.zzr().zzm(this.zza);
            Resources resources0 = this.zza.getResources();
            int v1 = 2;
            if(resources0 != null) {
                Configuration configuration0 = resources0.getConfiguration();
                if(configuration0 != null) {
                    v1 = configuration0.orientation == 2 ? 4 : 3;
                }
            }
            this.zzr = v1;
            this.zzb = zzv.zzC().elapsedRealtime();
            this.zzo = true;
            return this;
        }
    }
}

