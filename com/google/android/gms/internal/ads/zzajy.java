package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzajy implements zzakd {
    @Override  // com.google.android.gms.internal.ads.zzakd
    public final int zza(zzab zzab0) {
        String s = zzab0.zzo;
        if(s != null) {
            switch(s) {
                case "application/dvbsubs": 
                case "application/pgs": {
                    return 2;
                }
                case "application/ttml+xml": {
                    return 1;
                }
                case "application/x-mp4-vtt": {
                    return 2;
                }
                case "application/x-quicktime-tx3g": {
                    return 2;
                }
                case "application/x-subrip": {
                    return 1;
                }
                case "text/vtt": {
                    return 1;
                }
                case "text/x-ssa": {
                    return 1;
                }
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + s);
    }

    @Override  // com.google.android.gms.internal.ads.zzakd
    public final zzakf zzb(zzab zzab0) {
        String s = zzab0.zzo;
        if(s != null) {
            switch(s) {
                case "application/dvbsubs": {
                    return new zzakr(zzab0.zzr);
                }
                case "application/pgs": {
                    return new zzakt();
                }
                case "application/ttml+xml": {
                    return new zzalf();
                }
                case "application/x-mp4-vtt": {
                    return new zzall();
                }
                case "application/x-quicktime-tx3g": {
                    return new zzalk(zzab0.zzr);
                }
                case "application/x-subrip": {
                    return new zzakz();
                }
                case "text/vtt": {
                    return new zzalw();
                }
                case "text/x-ssa": {
                    return new zzakv(zzab0.zzr);
                }
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + s);
    }

    // 去混淆评级： 中等(80)
    @Override  // com.google.android.gms.internal.ads.zzakd
    public final boolean zzc(zzab zzab0) {
        return Objects.equals(zzab0.zzo, "text/x-ssa") || Objects.equals(zzab0.zzo, "text/vtt") || Objects.equals(zzab0.zzo, "application/x-mp4-vtt") || Objects.equals(zzab0.zzo, "application/x-subrip") || Objects.equals(zzab0.zzo, "application/x-quicktime-tx3g") || Objects.equals(zzab0.zzo, "application/pgs") || Objects.equals(zzab0.zzo, "application/dvbsubs") || Objects.equals(zzab0.zzo, "application/ttml+xml");
    }
}

