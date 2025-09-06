package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public interface zzaq {
    public static final zzaq zzc;
    public static final zzaq zzd;
    public static final zzaq zze;
    public static final zzaq zzf;
    public static final zzaq zzg;
    public static final zzaq zzh;
    public static final zzaq zzi;
    public static final zzaq zzj;

    static {
        zzaq.zzc = new zzax();
        zzaq.zzd = new zzao();
        zzaq.zze = new zzaj("continue");
        zzaq.zzf = new zzaj("break");
        zzaq.zzg = new zzaj("return");
        zzaq.zzh = new zzag(Boolean.TRUE);
        zzaq.zzi = new zzag(Boolean.FALSE);
        zzaq.zzj = new zzas("");
    }

    zzaq zza(String arg1, zzh arg2, List arg3);

    zzaq zzc();

    Boolean zzd();

    Double zze();

    String zzf();

    Iterator zzh();
}

