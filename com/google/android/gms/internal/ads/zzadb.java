package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzadb {
    public int zza;
    public int zzb;
    private static final Pattern zzc;

    static {
        zzadb.zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    }

    public zzadb() {
        this.zza = -1;
        this.zzb = -1;
    }

    public final boolean zza() {
        return this.zza != -1 && this.zzb != -1;
    }

    public final boolean zzb(zzay zzay0) {
        for(int v = 0; v < zzay0.zza(); ++v) {
            zzax zzax0 = zzay0.zzb(v);
            if(zzax0 instanceof zzagb) {
                if("iTunSMPB".equals(((zzagb)zzax0).zzb) && this.zzc(((zzagb)zzax0).zzc)) {
                    return true;
                }
            }
            else if(zzax0 instanceof zzagk && "com.apple.iTunes".equals(((zzagk)zzax0).zza) && "iTunSMPB".equals(((zzagk)zzax0).zzb) && this.zzc(((zzagk)zzax0).zzc)) {
                return true;
            }
        }
        return false;
    }

    private final boolean zzc(String s) {
        Matcher matcher0 = zzadb.zzc.matcher(s);
        if(matcher0.find()) {
            try {
                int v = Integer.parseInt(matcher0.group(1), 16);
                int v1 = Integer.parseInt(matcher0.group(2), 16);
                if(v > 0 || v1 > 0) {
                    this.zza = v;
                    this.zzb = v1;
                    return true;
                }
                return false;
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return false;
    }
}

