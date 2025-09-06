package com.google.android.gms.internal.vision;

import com.google.android.gms.vision.L;
import java.util.HashMap;
import jeb.synthetic.FIN;

public final class zzr {
    private static final Object zza;
    private static final HashMap zzb;

    static {
        zzr.zza = new Object();
        zzr.zzb = new HashMap();
    }

    public static boolean zza(String s, String s1) {
        Object object0 = zzr.zza;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        String s2 = String.valueOf(s);
        String s3 = String.valueOf(s1);
        String s4 = s3.length() == 0 ? new String(s2) : s2 + s3;
        HashMap hashMap0 = zzr.zzb;
        int v1 = hashMap0.containsKey(s4) ? ((int)(((Integer)hashMap0.get(s4)))) : 0;
        if((v1 & 1) != 0) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return true;
        }
        try {
            System.loadLibrary(s1);
            hashMap0.put(s4, ((int)(v1 | 1)));
            FIN.finallyExec$NT(v);
            return true;
        }
        catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
            if((v1 & 4) == 0) {
                L.e(unsatisfiedLinkError0, "System.loadLibrary failed: %s", new Object[]{s1});
                zzr.zzb.put(s4, ((int)(v1 | 4)));
            }
            FIN.finallyExec$NT(v);
            return false;
        }
    }
}

