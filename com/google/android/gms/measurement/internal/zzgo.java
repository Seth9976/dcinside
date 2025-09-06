package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzok;
import w4.d;

public final class zzgo extends zzjd {
    private char zza;
    private long zzb;
    @GuardedBy("this")
    private String zzc;
    private final zzgq zzd;
    private final zzgq zze;
    private final zzgq zzf;
    private final zzgq zzg;
    private final zzgq zzh;
    private final zzgq zzi;
    private final zzgq zzj;
    private final zzgq zzk;
    private final zzgq zzl;

    zzgo(zzhy zzhy0) {
        super(zzhy0);
        this.zza = '\u0000';
        this.zzb = -1L;
        this.zzd = new zzgq(this, 6, false, false);
        this.zze = new zzgq(this, 6, true, false);
        this.zzf = new zzgq(this, 6, false, true);
        this.zzg = new zzgq(this, 5, false, false);
        this.zzh = new zzgq(this, 5, true, false);
        this.zzi = new zzgq(this, 5, false, true);
        this.zzj = new zzgq(this, 4, false, false);
        this.zzk = new zzgq(this, 3, false, false);
        this.zzl = new zzgq(this, 2, false, false);
    }

    protected static Object zza(String s) {
        return s == null ? null : new zzgp(s);
    }

    @VisibleForTesting
    private static String zza(boolean z, Object object0) {
        String s = "";
        if(object0 == null) {
            return "";
        }
        if(object0 instanceof Integer) {
            object0 = (long)(((int)(((Integer)object0))));
        }
        if(object0 instanceof Long) {
            if(!z) {
                return String.valueOf(object0);
            }
            if(Math.abs(((long)(((Long)object0)))) < 100L) {
                return String.valueOf(object0);
            }
            if(String.valueOf(object0).charAt(0) == 45) {
                s = "-";
            }
            String s1 = String.valueOf(Math.abs(((long)(((Long)object0)))));
            return s + Math.round(Math.pow(10.0, s1.length() - 1)) + "..." + s + Math.round(Math.pow(10.0, s1.length()) - 1.0);
        }
        if(object0 instanceof Boolean) {
            return String.valueOf(object0);
        }
        if(object0 instanceof Throwable) {
            StringBuilder stringBuilder0 = new StringBuilder((z ? ((Throwable)object0).getClass().getName() : ((Throwable)object0).toString()));
            String s2 = zzgo.zzb(zzhy.class.getCanonicalName());
            StackTraceElement[] arr_stackTraceElement = ((Throwable)object0).getStackTrace();
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                if(!stackTraceElement0.isNativeMethod()) {
                    String s3 = stackTraceElement0.getClassName();
                    if(s3 != null && zzgo.zzb(s3).equals(s2)) {
                        stringBuilder0.append(": ");
                        stringBuilder0.append(stackTraceElement0);
                        return stringBuilder0.toString();
                    }
                }
            }
            return stringBuilder0.toString();
        }
        if(object0 instanceof zzgp) {
            return ((zzgp)object0).zza;
        }
        return z ? "-" : String.valueOf(object0);
    }

    static String zza(boolean z, String s, Object object0, Object object1, Object object2) {
        String s1 = "";
        if(s == null) {
            s = "";
        }
        String s2 = zzgo.zza(z, object0);
        String s3 = zzgo.zza(z, object1);
        String s4 = zzgo.zza(z, object2);
        StringBuilder stringBuilder0 = new StringBuilder();
        if(!TextUtils.isEmpty(s)) {
            stringBuilder0.append(s);
            s1 = ": ";
        }
        String s5 = ", ";
        if(!TextUtils.isEmpty(s2)) {
            stringBuilder0.append(s1);
            stringBuilder0.append(s2);
            s1 = ", ";
        }
        if(TextUtils.isEmpty(s3)) {
            s5 = s1;
        }
        else {
            stringBuilder0.append(s1);
            stringBuilder0.append(s3);
        }
        if(!TextUtils.isEmpty(s4)) {
            stringBuilder0.append(s5);
            stringBuilder0.append(s4);
        }
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final Context zza() {
        return super.zza();
    }

    @VisibleForTesting
    protected final void zza(int v, String s) {
        Log.println(v, this.zzy(), s);
    }

    protected final void zza(int v, boolean z, boolean z1, String s, Object object0, Object object1, Object object2) {
        if(!z && this.zza(v)) {
            this.zza(v, zzgo.zza(false, s, object0, object1, object2));
        }
        if(!z1 && v >= 5) {
            Preconditions.checkNotNull(s);
            zzhv zzhv0 = this.zzu.zzo();
            if(zzhv0 == null) {
                this.zza(6, "Scheduler not set. Not logging error/warn");
                return;
            }
            if(!zzhv0.zzaf()) {
                this.zza(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if(v < 0) {
                v = 0;
            }
            zzhv0.zzb(new zzgn(this, (v < 9 ? v : 8), s, object0, object1, object2));
        }
    }

    @VisibleForTesting
    protected final boolean zza(int v) {
        return Log.isLoggable(this.zzy(), v);
    }

    @VisibleForTesting
    private static String zzb(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        int v = s.lastIndexOf(46);
        if(v == -1) {
            return !zzok.zza() || !((Boolean)zzbh.zzcg.zza(null)).booleanValue() ? s : "";
        }
        return s.substring(0, v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    public final zzgq zzc() {
        return this.zzk;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzag zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzaz zzf() {
        return super.zzf();
    }

    public final zzgq zzg() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjd
    protected final boolean zzh() {
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    public final zzgq zzm() {
        return this.zzf;
    }

    public final zzgq zzn() {
        return this.zze;
    }

    public final zzgq zzo() {
        return this.zzj;
    }

    public final zzgq zzp() {
        return this.zzl;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzos zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzt() {
        super.zzt();
    }

    public final zzgq zzu() {
        return this.zzg;
    }

    public final zzgq zzv() {
        return this.zzi;
    }

    public final zzgq zzw() {
        return this.zzh;
    }

    public final String zzx() {
        if(this.zzk().zzb == null) {
            return null;
        }
        Pair pair0 = this.zzk().zzb.zza();
        return pair0 == null || pair0 == zzha.zza ? null : pair0.second + ":" + ((String)pair0.first);
    }

    @VisibleForTesting
    @h4.d({"logTagDoNotUseDirectly"})
    private final String zzy() {
        synchronized(this) {
            if(this.zzc == null) {
                this.zzc = this.zzu.zzw() == null ? "FA" : this.zzu.zzw();
            }
            Preconditions.checkNotNull(this.zzc);
            return this.zzc;
        }
    }
}

