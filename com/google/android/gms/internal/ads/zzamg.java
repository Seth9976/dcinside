package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzamg implements zzanw {
    private final List zza;

    public zzamg() {
        this(0);
    }

    public zzamg(int v) {
        this.zza = zzfxn.zzn();
    }

    public zzamg(int v, List list0) {
        this.zza = list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzanw
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override  // com.google.android.gms.internal.ads.zzanw
    @Nullable
    public final zzany zzb(int v, zzanv zzanv0) {
        switch(v) {
            case 3: 
            case 4: {
                int v1 = zzanv0.zza();
                return new zzand(new zzamv(zzanv0.zzb, v1));
            }
            case 15: {
                int v2 = zzanv0.zza();
                return new zzand(new zzamf(false, zzanv0.zzb, v2));
            }
            case 16: {
                return new zzand(new zzamo(this.zzd(zzanv0)));
            }
            case 17: {
                int v3 = zzanv0.zza();
                return new zzand(new zzamu(zzanv0.zzb, v3));
            }
            case 21: {
                return new zzand(new zzamt());
            }
            case 27: {
                return new zzand(new zzamq(this.zzc(zzanv0), false, false));
            }
            case 36: {
                return new zzand(new zzams(this.zzc(zzanv0)));
            }
            case 45: {
                return new zzand(new zzamw());
            }
            case 89: {
                return new zzand(new zzami(zzanv0.zzd));
            }
            case 2: 
            case 0x80: {
                return new zzand(new zzaml(this.zzd(zzanv0)));
            }
            case 0x86: {
                return new zzanl(new zzanc("application/x-scte35"));
            }
            case 0x81: 
            case 0x87: {
                int v4 = zzanv0.zza();
                return new zzand(new zzamb(zzanv0.zzb, v4));
            }
            case 0x88: 
            case 0x8A: {
                int v5 = zzanv0.zza();
                return new zzand(new zzamh(zzanv0.zzb, v5, 0x1000));
            }
            case 0x8B: {
                int v6 = zzanv0.zza();
                return new zzand(new zzamh(zzanv0.zzb, v6, 5408));
            }
            case 0xAC: {
                int v7 = zzanv0.zza();
                return new zzand(new zzamd(zzanv0.zzb, v7));
            }
            case 0x101: {
                return new zzanl(new zzanc("application/vnd.dvb.ait"));
            }
            default: {
                return null;
            }
        }
    }

    private final zzann zzc(zzanv zzanv0) {
        return new zzann(this.zze(zzanv0));
    }

    private final zzaoa zzd(zzanv zzanv0) {
        return new zzaoa(this.zze(zzanv0));
    }

    private final List zze(zzanv zzanv0) {
        String s1;
        int v6;
        zzdy zzdy0 = new zzdy(zzanv0.zze);
        List list0 = this.zza;
        while(zzdy0.zzb() > 0) {
            int v = zzdy0.zzm();
            int v1 = zzdy0.zzm();
            int v2 = zzdy0.zzd();
            if(v == 0x86) {
                list0 = new ArrayList();
                int v3 = zzdy0.zzm();
                for(int v4 = 0; v4 < (v3 & 0x1F); ++v4) {
                    String s = zzdy0.zzB(3, StandardCharsets.UTF_8);
                    int v5 = zzdy0.zzm();
                    boolean z = (v5 & 0x80) != 0;
                    if(z) {
                        v6 = v5 & 0x3F;
                        s1 = "application/cea-708";
                    }
                    else {
                        s1 = "application/cea-608";
                        v6 = 1;
                    }
                    int v7 = (byte)zzdy0.zzm();
                    zzdy0.zzM(1);
                    List list1 = z ? Collections.singletonList(((v7 & 0x40) == 0 ? new byte[]{0} : new byte[]{1})) : null;
                    zzz zzz0 = new zzz();
                    zzz0.zzaa(s1);
                    zzz0.zzQ(s);
                    zzz0.zzx(v6);
                    zzz0.zzN(list1);
                    list0.add(zzz0.zzag());
                }
            }
            zzdy0.zzL(v2 + v1);
        }
        return list0;
    }
}

