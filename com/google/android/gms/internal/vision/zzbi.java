package com.google.android.gms.internal.vision;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o3.h;

public abstract class zzbi {
    private static final Object zza = null;
    @h
    private static volatile zzbr zzb = null;
    private static volatile boolean zzc = false;
    private static final AtomicReference zzd;
    private static zzbs zze;
    private final zzbo zzf;
    private final String zzg;
    private final Object zzh;
    private static final AtomicInteger zzi;
    private volatile int zzj;
    private volatile Object zzk;
    private final boolean zzl;

    static {
        zzbi.zza = new Object();
        zzbi.zzd = new AtomicReference();
        zzbi.zze = new zzbs(zzbk.zza);
        zzbi.zzi = new AtomicInteger();
    }

    private zzbi(zzbo zzbo0, String s, Object object0, boolean z) {
        this.zzj = -1;
        String s1 = zzbo0.zza;
        if(s1 == null && zzbo0.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if(s1 != null && zzbo0.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzbo0;
        this.zzg = s;
        this.zzh = object0;
        this.zzl = z;
    }

    zzbi(zzbo zzbo0, String s, Object object0, boolean z, zzbn zzbn0) {
        this(zzbo0, s, object0, z);
    }

    static zzbi zza(zzbo zzbo0, String s, Object object0, zzbp zzbp0, boolean z) {
        return zzbi.zzb(zzbo0, s, object0, zzbp0, true);
    }

    @h
    private final Object zza(zzbr zzbr0) {
        zzbq zzbq0;
        if(this.zzf.zzg) {
        label_7:
            if(this.zzf.zzb == null) {
                zzbq0 = zzbq.zza(zzbr0.zza(), this.zzf.zza);
            }
            else if(!zzbg.zza(zzbr0.zza(), this.zzf.zzb)) {
                zzbq0 = null;
            }
            else if(this.zzf.zzh) {
                zzbq0 = zzau.zza(zzbr0.zza().getContentResolver(), zzbj.zza((this.zzf.zzb.getLastPathSegment() + "#" + "com.dcinside.app.android")));
            }
            else {
                zzbq0 = zzau.zza(zzbr0.zza().getContentResolver(), this.zzf.zzb);
            }
            if(zzbq0 != null) {
                Object object0 = zzbq0.zza(this.zzb());
                return object0 == null ? null : this.zza(object0);
            }
        }
        else {
            String s = (String)zzbd.zza(zzbr0.zza()).zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
            if(s == null || !zzaq.zzb.matcher(s).matches()) {
                goto label_7;
            }
            else if(Log.isLoggable("PhenotypeFlag", 3)) {
                String s1 = this.zzb();
                Log.d("PhenotypeFlag", (s1.length() == 0 ? new String("Bypass reading Phenotype values for flag: ") : "Bypass reading Phenotype values for flag: " + s1));
                return null;
            }
        }
        return null;
    }

    private final String zza(String s) {
        if(s != null && s.isEmpty()) {
            return this.zzg;
        }
        String s1 = String.valueOf(s);
        String s2 = String.valueOf(this.zzg);
        return s2.length() == 0 ? new String(s1) : s1 + s2;
    }

    static void zza() {
        zzbi.zzi.incrementAndGet();
    }

    @Deprecated
    public static void zza(Context context0) {
        synchronized(zzbi.zza) {
            zzbr zzbr0 = zzbi.zzb;
            Context context1 = context0.getApplicationContext();
            if(context1 != null) {
                context0 = context1;
            }
            if(zzbr0 == null || zzbr0.zza() != context0) {
                zzau.zzb();
                zzbq.zza();
                zzbd.zza();
                zzbi.zzb = new zzav(context0, zzdi.zza(new zzbl(context0)));
                zzbi.zzi.incrementAndGet();
            }
        }
    }

    abstract Object zza(Object arg1);

    private static zzbi zzb(zzbo zzbo0, String s, Object object0, zzbp zzbp0, boolean z) {
        return new zzbm(zzbo0, s, object0, true, zzbp0);
    }

    @h
    private final Object zzb(zzbr zzbr0) {
        if(!this.zzf.zze && (this.zzf.zzi == null || ((Boolean)this.zzf.zzi.zza(zzbr0.zza())).booleanValue())) {
            Object object0 = zzbd.zza(zzbr0.zza()).zza((this.zzf.zze ? null : this.zza(this.zzf.zzc)));
            return object0 == null ? null : this.zza(object0);
        }
        return null;
    }

    public static void zzb(Context context0) {
        if(zzbi.zzb != null) {
            return;
        }
        synchronized(zzbi.zza) {
            if(zzbi.zzb == null) {
                zzbi.zza(context0);
            }
        }
    }

    public final String zzb() {
        return this.zza(this.zzf.zzd);
    }

    public final Object zzc() {
        Object object0;
        if(!this.zzl) {
            zzde.zzb(zzbi.zze.zza(this.zzg), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int v = zzbi.zzi.get();
        if(this.zzj < v) {
            synchronized(this) {
                if(this.zzj < v) {
                    zzbr zzbr0 = zzbi.zzb;
                    zzde.zzb(zzbr0 != null, "Must call PhenotypeFlag.init() first");
                    if(this.zzf.zzf) {
                        object0 = this.zzb(zzbr0);
                        if(object0 == null) {
                            object0 = this.zza(zzbr0);
                            if(object0 == null) {
                                object0 = this.zzh;
                            }
                        }
                    }
                    else {
                        object0 = this.zza(zzbr0);
                        if(object0 == null) {
                            object0 = this.zzb(zzbr0);
                            if(object0 == null) {
                                object0 = this.zzh;
                            }
                        }
                    }
                    zzcy zzcy0 = (zzcy)zzbr0.zzb().zza();
                    if(zzcy0.zza()) {
                        String s = ((zzbe)zzcy0.zzb()).zza(this.zzf.zzb, this.zzf.zza, this.zzf.zzd, this.zzg);
                        object0 = s == null ? this.zzh : this.zza(s);
                    }
                    this.zzk = object0;
                    this.zzj = v;
                }
            }
        }
        return this.zzk;
    }

    static final boolean zzd() [...] // Inlined contents
}

