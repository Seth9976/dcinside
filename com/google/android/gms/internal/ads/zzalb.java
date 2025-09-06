package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;

final class zzalb {
    public final int zza;
    public final int zzb;
    public final int zzc;
    private static final Pattern zzd;
    private static final zzfxs zze;
    private static final zzfxs zzf;
    private static final zzfxs zzg;
    private static final zzfxs zzh;

    static {
        zzalb.zzd = Pattern.compile("\\s+");
        zzalb.zze = zzfxs.zzp("auto", "none");
        zzalb.zzf = zzfxs.zzq("dot", "sesame", "circle");
        zzalb.zzg = zzfxs.zzp("filled", "open");
        zzalb.zzh = zzfxs.zzq("after", "before", "outside");
    }

    private zzalb(int v, int v1, int v2) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
    }

    @Nullable
    public static zzalb zza(@Nullable String s) {
        int v2;
        if(s != null) {
            String s1 = zzftt.zza(s.trim());
            if(!s1.isEmpty()) {
                zzfxs zzfxs0 = zzfxs.zzm(TextUtils.split(s1, zzalb.zzd));
                int v = -1;
                int v1 = 0;
                switch(((String)zzfxt.zza(zzfzp.zzb(zzalb.zzh, zzfxs0), "outside"))) {
                    case "after": {
                        v2 = 2;
                        break;
                    }
                    case "outside": {
                        v2 = -2;
                        break;
                    }
                    default: {
                        v2 = 1;
                    }
                }
                zzfzn zzfzn0 = zzfzp.zzb(zzalb.zze, zzfxs0);
                if(!zzfzn0.isEmpty()) {
                    Object object0 = zzfzn0.iterator().next();
                    return ((String)object0).hashCode() != 0x33AF38 || !((String)object0).equals("none") ? new zzalb(-1, 0, v2) : new zzalb(0, 0, v2);
                }
                zzfzn zzfzn1 = zzfzp.zzb(zzalb.zzg, zzfxs0);
                zzfzn zzfzn2 = zzfzp.zzb(zzalb.zzf, zzfxs0);
                if(!zzfzn1.isEmpty() || !zzfzn2.isEmpty()) {
                    String s2 = (String)zzfxt.zza(zzfzn1, "filled");
                    int v3 = s2.hashCode() != 0x34264A || !s2.equals("open") ? 1 : 2;
                    switch(((String)zzfxt.zza(zzfzn2, "circle"))) {
                        case "dot": {
                            v1 = v3;
                            v = 2;
                            break;
                        }
                        case "sesame": {
                            return new zzalb(3, v3, v2);
                        }
                        default: {
                            return new zzalb(1, v3, v2);
                        }
                    }
                }
                return new zzalb(v, v1, v2);
            }
        }
        return null;
    }
}

