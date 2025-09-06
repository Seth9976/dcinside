package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

public final class zzall implements zzakf {
    private final zzdy zza;

    public zzall() {
        this.zza = new zzdy();
    }

    @Override  // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] arr_b, int v, int v1, zzake zzake0, zzdb zzdb0) {
        zzco zzco0;
        this.zza.zzJ(arr_b, v1 + v);
        this.zza.zzL(v);
        ArrayList arrayList0 = new ArrayList();
        while(true) {
            zzdy zzdy0 = this.zza;
            if(zzdy0.zzb() <= 0) {
                break;
            }
            zzcw.zze(zzdy0.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int v2 = this.zza.zzg() - 8;
            if(this.zza.zzg() == 0x76747463) {
                zzdy zzdy1 = this.zza;
                String s = null;
                zzcm zzcm0 = null;
                while(v2 > 0) {
                    zzcw.zze(v2 >= 8, "Incomplete vtt cue box header found.");
                    int v3 = zzdy1.zzg();
                    int v4 = zzdy1.zzg();
                    String s1 = zzei.zzC(zzdy1.zzN(), zzdy1.zzd(), v3 - 8);
                    zzdy1.zzM(v3 - 8);
                    if(v4 == 1937011815) {
                        zzcm0 = zzalv.zzb(s1);
                    }
                    else if(v4 == 0x7061796C) {
                        s = zzalv.zza(null, s1.trim(), Collections.emptyList());
                    }
                    v2 = v2 - 8 - (v3 - 8);
                }
                if(s == null) {
                    s = "";
                }
                if(zzcm0 == null) {
                    zzalt zzalt0 = new zzalt();
                    zzalt0.zzc = s;
                    zzco0 = zzalt0.zza().zzp();
                }
                else {
                    zzcm0.zzl(s);
                    zzco0 = zzcm0.zzp();
                }
                arrayList0.add(zzco0);
            }
            else {
                this.zza.zzM(v2);
            }
        }
        zzdb0.zza(new zzajx(arrayList0, 0x8000000000000001L, 0x8000000000000001L));
    }
}

