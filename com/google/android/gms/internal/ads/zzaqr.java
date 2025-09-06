package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class zzaqr extends zzapm {
    private final Object zza;
    @GuardedBy("mLock")
    @Nullable
    private final zzapr zzb;

    public zzaqr(int v, String s, zzapr zzapr0, @Nullable zzapq zzapq0) {
        super(v, s, zzapq0);
        this.zza = new Object();
        this.zzb = zzapr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzapm
    protected final zzaps zzh(zzapi zzapi0) {
        try {
            byte[] arr_b = zzapi0.zzb;
            Map map0 = zzapi0.zzc;
            String s = "ISO-8859-1";
            if(map0 != null) {
                String s1 = (String)map0.get("Content-Type");
                if(s1 != null) {
                    String[] arr_s = s1.split(";", 0);
                    int v = 1;
                    while(v < arr_s.length) {
                        String[] arr_s1 = arr_s[v].trim().split("=", 0);
                        if(arr_s1.length != 2 || !arr_s1[0].equals("charset")) {
                            ++v;
                        }
                        else {
                            s = arr_s1[1];
                            if(true) {
                                break;
                            }
                        }
                    }
                }
            }
            return zzaps.zzb(new String(arr_b, s), zzaqj.zzb(zzapi0));
        }
        catch(UnsupportedEncodingException unused_ex) {
            return zzaps.zzb(new String(zzapi0.zzb), zzaqj.zzb(zzapi0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzapm
    protected void zzo(Object object0) {
        this.zzz(((String)object0));
    }

    protected void zzz(String s) {
        synchronized(this.zza) {
        }
        this.zzb.zza(s);
    }
}

