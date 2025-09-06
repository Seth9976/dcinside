package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import com.google.common.base.C;
import com.google.common.base.H;
import com.google.common.base.S;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o3.h;

public abstract class zzhj {
    private static final Object zza = null;
    @h
    private static volatile zzhu zzb = null;
    private static volatile boolean zzc = false;
    private static zzhy zzd;
    private static final AtomicInteger zze;
    private final zzhr zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile Object zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    static {
        zzhj.zza = new Object();
        new AtomicReference();
        zzhj.zzd = new zzhy(new zzho());
        zzhj.zze = new AtomicInteger();
    }

    private zzhj(zzhr zzhr0, String s, Object object0, boolean z) {
        this.zzi = -1;
        String s1 = zzhr0.zza;
        if(s1 == null && zzhr0.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if(s1 != null && zzhr0.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzhr0;
        this.zzg = s;
        this.zzh = object0;
        this.zzk = z;
        this.zzl = false;
    }

    zzhj(zzhr zzhr0, String s, Object object0, boolean z, zzht zzht0) {
        this(zzhr0, s, object0, true);
    }

    static zzhj zza(zzhr zzhr0, String s, Boolean boolean0, boolean z) {
        return new zzhq(zzhr0, s, boolean0, true);
    }

    static zzhj zza(zzhr zzhr0, String s, Double double0, boolean z) {
        return new zzhp(zzhr0, s, double0, true);
    }

    static zzhj zza(zzhr zzhr0, String s, Long long0, boolean z) {
        return new zzhn(zzhr0, s, long0, true);
    }

    static zzhj zza(zzhr zzhr0, String s, String s1, boolean z) {
        return new zzhs(zzhr0, s, s1, true);
    }

    @h
    private final Object zza(zzhu zzhu0) {
        if(!this.zzf.zze && (this.zzf.zzh == null || ((Boolean)this.zzf.zzh.apply(zzhu0.zza())).booleanValue())) {
            Object object0 = zzhc.zza(zzhu0.zza()).zza((this.zzf.zze ? null : this.zza(this.zzf.zzc)));
            return object0 == null ? null : this.zza(object0);
        }
        return null;
    }

    private final String zza(String s) {
        return s == null || !s.isEmpty() ? s + this.zzg : this.zzg;
    }

    public final Object zza() {
        Object object0;
        if(!this.zzk) {
            H.h0(zzhj.zzd.zza(this.zzg), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int v = zzhj.zze.get();
        if(this.zzi < v) {
            synchronized(this) {
                if(this.zzi < v) {
                    zzhu zzhu0 = zzhj.zzb;
                    C c0 = C.a();
                    String s = null;
                    if(zzhu0 != null) {
                        c0 = (C)zzhu0.zzb().get();
                        if(c0.e()) {
                            s = ((zzhh)c0.d()).zza(this.zzf.zzb, this.zzf.zza, this.zzf.zzd, this.zzg);
                        }
                    }
                    H.h0(zzhu0 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    if(this.zzf.zzf) {
                        object0 = this.zza(zzhu0);
                        if(object0 == null) {
                            object0 = this.zzb(zzhu0);
                            if(object0 == null) {
                                object0 = this.zze();
                            }
                        }
                    }
                    else {
                        object0 = this.zzb(zzhu0);
                        if(object0 == null) {
                            object0 = this.zza(zzhu0);
                            if(object0 == null) {
                                object0 = this.zze();
                            }
                        }
                    }
                    if(c0.e()) {
                        object0 = s == null ? this.zze() : this.zza(s);
                    }
                    this.zzj = object0;
                    this.zzi = v;
                }
            }
        }
        return this.zzj;
    }

    abstract Object zza(Object arg1);

    @h
    private final Object zzb(zzhu zzhu0) {
        zzhw zzhw0;
        if(this.zzf.zzb == null) {
            Context context0 = zzhu0.zza();
            zzhm zzhm1 = () -> zzhj.zze.incrementAndGet();
            zzhw0 = zzhw.zza(context0, this.zzf.zza, zzhm1);
        }
        else if(!zzhi.zza(zzhu0.zza(), this.zzf.zzb)) {
            zzhw0 = null;
        }
        else if(this.zzf.zzg) {
            zzhw0 = zzgu.zza(zzhu0.zza().getContentResolver(), zzhk.zza(zzhk.zza(zzhu0.zza(), this.zzf.zzb.getLastPathSegment())), () -> zzhj.zze.incrementAndGet());
        }
        else {
            ContentResolver contentResolver0 = zzhu0.zza().getContentResolver();
            zzhm zzhm0 = () -> zzhj.zze.incrementAndGet();
            zzhw0 = zzgu.zza(contentResolver0, this.zzf.zzb, zzhm0);
        }
        if(zzhw0 != null) {
            Object object0 = zzhw0.zza(this.zzb());
            return object0 == null ? null : this.zza(object0);
        }
        return null;
    }

    public static void zzb(Context context0) {
        if(zzhj.zzb == null && context0 != null) {
            Object object0 = zzhj.zza;
            synchronized(object0) {
                if(zzhj.zzb == null) {
                    synchronized(object0) {
                        zzhu zzhu0 = zzhj.zzb;
                        Context context1 = context0.getApplicationContext();
                        if(context1 != null) {
                            context0 = context1;
                        }
                        if(zzhu0 == null || zzhu0.zza() != context0) {
                            if(zzhu0 != null) {
                                zzgu.zzc();
                                zzhw.zza();
                                zzhc.zza();
                            }
                            zzhj.zzb = new zzgv(context0, S.b(new zzhl(context0)));
                            zzhj.zze.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    public final String zzb() {
        return this.zza(this.zzf.zzd);
    }

    // 检测为 Lambda 实现
    public static void zzc() [...]

    static boolean zzd() [...] // Inlined contents

    private final Object zze() {
        return this.zzh;
    }
}

