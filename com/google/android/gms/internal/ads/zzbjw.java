package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

public final class zzbjw implements zzbjp {
    static final Map zza;
    private final zzb zzb;
    private final zzbsc zzc;
    private final zzbsj zzd;

    static {
        zzbjw.zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    }

    public zzbjw(zzb zzb0, zzbsc zzbsc0, zzbsj zzbsj0) {
        this.zzb = zzb0;
        this.zzc = zzbsc0;
        this.zzd = zzbsj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("a");
        int v = (int)(((Integer)zzbjw.zza.get(s)));
        int v1 = 6;
        boolean z = true;
        switch(v) {
            case 5: {
                String s1 = (String)map0.get("forceOrientation");
                if(map0.containsKey("allowOrientationChange")) {
                    z = Boolean.parseBoolean(((String)map0.get("allowOrientationChange")));
                }
                if(((zzcex)object0) == null) {
                    zzo.zzj("AdWebView is null");
                    return;
                }
                if("portrait".equalsIgnoreCase(s1)) {
                    v1 = 7;
                }
                else if(!"landscape".equalsIgnoreCase(s1)) {
                    v1 = z ? -1 : 14;
                }
                ((zzcex)object0).zzau(v1);
                return;
            }
            case 7: {
                this.zzd.zzc();
                return;
            }
            default: {
                zzb zzb0 = this.zzb;
                if(zzb0.zzc()) {
                    switch(v) {
                        case 1: {
                            this.zzc.zzb(map0);
                            return;
                        }
                        case 3: {
                            new zzbsf(((zzcex)object0), map0).zzb();
                            return;
                        }
                        case 4: {
                            new zzbrz(((zzcex)object0), map0).zzc();
                            return;
                        }
                        case 6: {
                            this.zzc.zza(true);
                            return;
                        }
                        default: {
                            zzo.zzi("Unknown MRAID command called.");
                            return;
                        }
                    }
                }
                zzb0.zzb(null);
            }
        }
    }
}

