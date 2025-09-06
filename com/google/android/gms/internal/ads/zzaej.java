package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzaej implements zzaeb {
    public final zzfxn zza;
    private final int zzb;

    private zzaej(int v, zzfxn zzfxn0) {
        this.zzb = v;
        this.zza = zzfxn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaeb
    public final int zza() {
        return this.zzb;
    }

    @Nullable
    public final zzaeb zzb(Class class0) {
        zzfxn zzfxn0 = this.zza;
        int v = zzfxn0.size();
        int v1 = 0;
        while(v1 < v) {
            zzaeb zzaeb0 = (zzaeb)zzfxn0.get(v1);
            ++v1;
            if(zzaeb0.getClass() == class0) {
                return zzaeb0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    // This method was un-flattened
    public static zzaej zzc(int v, zzdy zzdy0) {
        String s1;
        String s;
        zzaej zzaej0;
        zzfxk zzfxk0 = new zzfxk();
        int v1 = zzdy0.zze();
        int v2 = -2;
        while(zzdy0.zzb() > 8) {
            int v3 = zzdy0.zzi();
            int v4 = zzdy0.zzd() + zzdy0.zzi();
            zzdy0.zzK(v4);
            if(v3 == 0x5453494C) {
                zzaej0 = zzaej.zzc(zzdy0.zzi(), zzdy0);
            }
            else {
                zzaej zzaej1 = null;
            alab2:
                switch(v3) {
                    case 0x66727473: {
                    alab1:
                        switch(v2) {
                            case 1: {
                                int v5 = zzdy0.zzk();
                                switch(v5) {
                                    case 1: {
                                        break;
                                    }
                                    case 85: {
                                        s = "audio/mpeg";
                                        break;
                                    }
                                    case 0xFF: {
                                        s = "audio/mp4a-latm";
                                        break;
                                    }
                                    case 0x2000: {
                                        s = "audio/ac3";
                                        break;
                                    }
                                    case 0x2001: {
                                        s = "audio/vnd.dts";
                                        break;
                                    }
                                    default: {
                                        s = null;
                                        zzdo.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + v5);
                                        break alab1;
                                    }
                                }
                                int v6 = zzdy0.zzk();
                                int v7 = zzdy0.zzi();
                                zzdy0.zzM(6);
                                int v8 = zzei.zzn(zzdy0.zzk());
                                int v9 = zzdy0.zzb() <= 0 ? 0 : zzdy0.zzk();
                                byte[] arr_b = new byte[v9];
                                zzdy0.zzH(arr_b, 0, v9);
                                zzz zzz0 = new zzz();
                                zzz0.zzaa(s);
                                zzz0.zzz(v6);
                                zzz0.zzab(v7);
                                if("audio/raw".equals(s) && v8 != 0) {
                                    zzz0.zzU(v8);
                                }
                                if("audio/mp4a-latm".equals(s) && v9 > 0) {
                                    zzz0.zzN(zzfxn.zzo(arr_b));
                                }
                                zzaej0 = new zzaek(zzz0.zzag());
                                break alab2;
                            }
                            case 2: {
                                zzdy0.zzM(4);
                                int v10 = zzdy0.zzi();
                                int v11 = zzdy0.zzi();
                                zzdy0.zzM(4);
                                int v12 = zzdy0.zzi();
                                switch(v12) {
                                    case 0x3234504D: {
                                        s1 = "video/mp42";
                                        goto label_62;
                                    }
                                    case 0x3334504D: {
                                        s1 = "video/mp43";
                                        goto label_62;
                                    }
                                    case 0x31435641: 
                                    case 828601953: 
                                    case 875967048: {
                                        s1 = "video/avc";
                                        goto label_62;
                                    }
                                    case 0x47504A4D: 
                                    case 0x67706A6D: {
                                        s1 = "video/mjpeg";
                                        goto label_62;
                                    }
                                    case 808802372: 
                                    case 0x34504D46: 
                                    case 0x44495633: 
                                    case 1145656920: 
                                    case 1482049860: 
                                    case 1684633208: 
                                    case 2021026148: {
                                    label_62:
                                        zzz zzz1 = new zzz();
                                        zzz1.zzaf(v10);
                                        zzz1.zzK(v11);
                                        zzz1.zzaa(s1);
                                        zzaej1 = new zzaek(zzz1.zzag());
                                        break alab1;
                                    }
                                    default: {
                                        s1 = null;
                                        zzdo.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + v12);
                                        break alab1;
                                    }
                                }
                            }
                            default: {
                                zzdo.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + zzei.zzD(v2));
                            }
                        }
                        zzaej0 = zzaej1;
                        break;
                    }
                    case 1751742049: {
                        zzaej0 = zzaeg.zzb(zzdy0);
                        break;
                    }
                    case 0x68727473: {
                        zzaej0 = zzaeh.zzb(zzdy0);
                        break;
                    }
                    case 0x6E727473: {
                        zzaej0 = zzael.zzb(zzdy0);
                        break;
                    }
                    default: {
                        zzaej0 = null;
                    }
                }
            }
            if(zzaej0 != null) {
                if(zzaej0.zza() == 0x68727473) {
                    int v13 = ((zzaeh)zzaej0).zza;
                    switch(v13) {
                        case 1935960438: {
                            v2 = 2;
                            break;
                        }
                        case 0x73647561: {
                            v2 = 1;
                            break;
                        }
                        case 1937012852: {
                            v2 = 3;
                            break;
                        }
                        default: {
                            zzdo.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(v13));
                            v2 = -1;
                        }
                    }
                }
                zzfxk0.zzf(zzaej0);
            }
            zzdy0.zzL(v4);
            zzdy0.zzK(v1);
        }
        return new zzaej(v, zzfxk0.zzi());
    }
}

