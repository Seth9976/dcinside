package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import androidx.annotation.VisibleForTesting;
import j..util.concurrent.ThreadLocalRandom;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

public final class zzauu {
    @VisibleForTesting
    protected static volatile zzfpk zza;
    @VisibleForTesting
    protected volatile Boolean zzb;
    private static final ConditionVariable zzc;
    private static volatile Random zzd;
    private final zzawd zze;

    static {
        zzauu.zzc = new ConditionVariable();
        zzauu.zza = null;
        zzauu.zzd = null;
    }

    public zzauu(zzawd zzawd0) {
        this.zze = zzawd0;
        zzawd0.zzk().execute(new zzaut(this));
    }

    public final void zzc(int v, int v1, long v2, String s, Exception exception0) {
        try {
            zzauu.zzc.block();
            if(this.zzb.booleanValue() && zzauu.zza != null) {
                zzari zzari0 = zzarm.zza();
                zzari0.zza("com.dcinside.app.android");
                zzari0.zze(v2);
                if(s != null) {
                    zzari0.zzb(s);
                }
                if(exception0 != null) {
                    StringWriter stringWriter0 = new StringWriter();
                    exception0.printStackTrace(new PrintWriter(stringWriter0));
                    zzari0.zzf(stringWriter0.toString());
                    zzari0.zzd(exception0.getClass().getName());
                }
                zzfpi zzfpi0 = zzauu.zza.zza(((zzarm)zzari0.zzbn()).zzaV());
                zzfpi0.zza(v);
                if(v1 != -1) {
                    zzfpi0.zzb(v1);
                }
                zzfpi0.zzc();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        }
        catch(RuntimeException unused_ex) {
            if(zzauu.zzd == null) {
                Class class0 = zzauu.class;
                synchronized(class0) {
                    if(zzauu.zzd == null) {
                        zzauu.zzd = new Random();
                    }
                }
            }
            return zzauu.zzd.nextInt();
        }
    }
}

