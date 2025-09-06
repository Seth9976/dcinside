package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class zzgsx extends zzgxr implements zzgzd {
    private static final zzgsx zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgyd zzd;

    static {
        zzgsx zzgsx0 = new zzgsx();
        zzgsx.zza = zzgsx0;
        zzgxr.zzbZ(zzgsx.class, zzgsx0);
    }

    private zzgsx() {
        this.zzd = zzgxr.zzbK();
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzb() {
        return this.zzc;
    }

    public static zzgst zzc() {
        return (zzgst)zzgsx.zza.zzaZ();
    }

    public final zzgsv zzd(int v) {
        return (zzgsv)this.zzd.get(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgsx.zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000B\u0002\u001B", new Object[]{"zzc", "zzd", zzgsv.class});
            }
            case 3: {
                return new zzgsx();
            }
            case 4: {
                return new zzgst(null);
            }
            case 5: {
                return zzgsx.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgsx.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgsx.class;
                    synchronized(class0) {
                        zzgzk0 = zzgsx.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgsx.zza);
                            zzgsx.zzb = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
            default: {
                throw null;
            }
        }
    }

    public static zzgsx zzg(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzgsx)zzgxr.zzbu(zzgsx.zza, inputStream0, zzgxb0);
    }

    public final List zzh() {
        return this.zzd;
    }

    static void zzi(zzgsx zzgsx0, zzgsv zzgsv0) {
        zzgsv0.getClass();
        zzgyd zzgyd0 = zzgsx0.zzd;
        if(!zzgyd0.zzc()) {
            zzgsx0.zzd = zzgxr.zzbL(zzgyd0);
        }
        zzgsx0.zzd.add(zzgsv0);
    }
}

