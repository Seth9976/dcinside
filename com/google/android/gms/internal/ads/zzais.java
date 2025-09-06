package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzais {
    @Nullable
    public static zzax zza(zzdy zzdy0) {
        String s1;
        int v = zzdy0.zzd() + zzdy0.zzg();
        int v1 = zzdy0.zzg();
        zzax zzax0 = null;
        try {
            if((v1 >> 24 & 0xFF) == 0xA9 || (v1 >> 24 & 0xFF) == 0xFD) {
                switch(v1 & 0xFFFFFF) {
                    case 4280916: {
                        zzax0 = zzais.zze(v1, "TPE1", zzdy0);
                        break;
                    }
                    case 0x616C62: {
                        zzax0 = zzais.zze(v1, "TALB", zzdy0);
                        break;
                    }
                    case 6516084: {
                        int v10 = zzdy0.zzg();
                        if(zzdy0.zzg() == 1684108385) {
                            zzdy0.zzM(8);
                            String s4 = zzdy0.zzA(v10 - 16);
                            zzax0 = new zzagb("und", s4, s4);
                        }
                        else {
                            zzdo.zzf("MetadataUtil", "Failed to parse comment attribute: " + zzeq.zze(v1));
                        }
                        break;
                    }
                    case 0x646179: {
                        zzax0 = zzais.zze(v1, "TDRC", zzdy0);
                        break;
                    }
                    case 0x67656E: {
                        zzax0 = zzais.zze(v1, "TCON", zzdy0);
                        break;
                    }
                    case 0x677270: {
                        zzax0 = zzais.zze(v1, "TIT1", zzdy0);
                        break;
                    }
                    case 7108978: {
                        zzax0 = zzais.zze(v1, "USLT", zzdy0);
                        break;
                    }
                    case 0x746F6F: {
                        zzax0 = zzais.zze(v1, "TSSE", zzdy0);
                        break;
                    }
                    case 7233901: 
                    case 0x74726B: {
                        zzax0 = zzais.zze(v1, "TIT2", zzdy0);
                        break;
                    }
                    case 0x636F6D: 
                    case 7828084: {
                        zzax0 = zzais.zze(v1, "TCOM", zzdy0);
                        break;
                    }
                    default: {
                        zzdo.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzeq.zze(v1));
                    }
                }
            }
            else {
                switch(v1) {
                    case 757935405: {
                        String s2 = null;
                        String s3 = null;
                        int v5 = -1;
                        int v6 = -1;
                        while(zzdy0.zzd() < v) {
                            int v7 = zzdy0.zzd();
                            int v8 = zzdy0.zzg();
                            int v9 = zzdy0.zzg();
                            zzdy0.zzM(4);
                            if(v9 == 1835360622) {
                                s2 = zzdy0.zzA(v8 - 12);
                            }
                            else {
                                switch(v9) {
                                    case 1684108385: {
                                        v6 = v8;
                                    label_78:
                                        if(v9 == 1684108385) {
                                            v5 = v7;
                                        }
                                        zzdy0.zzM(v8 - 12);
                                        continue;
                                    }
                                    case 0x6E616D65: {
                                        break;
                                    }
                                    default: {
                                        goto label_78;
                                    }
                                }
                                s3 = zzdy0.zzA(v8 - 12);
                            }
                        }
                        if(s2 != null && s3 != null && v5 != -1) {
                            zzdy0.zzL(v5);
                            zzdy0.zzM(16);
                            zzax0 = new zzagk(s2, s3, zzdy0.zzA(v6 - 16));
                        }
                        break;
                    }
                    case 1631670868: {
                        zzax0 = zzais.zze(1631670868, "TPE2", zzdy0);
                        break;
                    }
                    case 0x636F7672: {
                        int v3 = zzdy0.zzg();
                        if(zzdy0.zzg() == 1684108385) {
                            int v4 = zzdy0.zzg() & 0xFFFFFF;
                            if(v4 == 13) {
                                s1 = "image/jpeg";
                            }
                            else if(v4 == 14) {
                                s1 = "image/png";
                                v4 = 14;
                            }
                            else {
                                s1 = null;
                            }
                            if(s1 == null) {
                                zzdo.zzf("MetadataUtil", "Unrecognized cover art flags: " + v4);
                            }
                            else {
                                zzdy0.zzM(4);
                                byte[] arr_b = new byte[v3 - 16];
                                zzdy0.zzH(arr_b, 0, v3 - 16);
                                zzax0 = new zzaft(s1, null, 3, arr_b);
                            }
                        }
                        else {
                            zzdo.zzf("MetadataUtil", "Failed to parse cover art attribute");
                        }
                        break;
                    }
                    case 0x6370696C: {
                        zzax0 = zzais.zzc(0x6370696C, "TCMP", zzdy0, true, true);
                        break;
                    }
                    case 0x6469736B: {
                        zzax0 = zzais.zzd(0x6469736B, "TPOS", zzdy0);
                        break;
                    }
                    case 0x676E7265: {
                        String s = zzagi.zza(zzais.zzb(zzdy0) - 1);
                        if(s == null) {
                            zzdo.zzf("MetadataUtil", "Failed to parse standard genre code");
                        }
                        else {
                            zzax0 = new zzagq("TCON", null, zzfxn.zzo(s));
                        }
                        break;
                    }
                    case 0x70676170: {
                        zzax0 = zzais.zzc(0x70676170, "ITUNESGAPLESS", zzdy0, false, true);
                        break;
                    }
                    case 1920233063: {
                        zzax0 = zzais.zzc(1920233063, "ITUNESADVISORY", zzdy0, false, false);
                        break;
                    }
                    case 0x736F6161: {
                        zzax0 = zzais.zze(0x736F6161, "TSO2", zzdy0);
                        break;
                    }
                    case 0x736F616C: {
                        zzax0 = zzais.zze(0x736F616C, "TSOA", zzdy0);
                        break;
                    }
                    case 0x736F6172: {
                        zzax0 = zzais.zze(0x736F6172, "TSOP", zzdy0);
                        break;
                    }
                    case 0x736F636F: {
                        zzax0 = zzais.zze(0x736F636F, "TSOC", zzdy0);
                        break;
                    }
                    case 0x736F6E6D: {
                        zzax0 = zzais.zze(0x736F6E6D, "TSOT", zzdy0);
                        break;
                    }
                    case 0x736F736E: {
                        zzax0 = zzais.zze(0x736F736E, "TVSHOWSORT", zzdy0);
                        break;
                    }
                    case 0x746D706F: {
                        zzax0 = zzais.zzc(0x746D706F, "TBPM", zzdy0, true, false);
                        break;
                    }
                    case 0x74726B6E: {
                        zzax0 = zzais.zzd(0x74726B6E, "TRCK", zzdy0);
                        break;
                    }
                    case 0x74767368: {
                        zzax0 = zzais.zze(0x74767368, "TVSHOW", zzdy0);
                        break;
                    }
                    default: {
                        zzdo.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzeq.zze(v1));
                    }
                }
            }
            return zzax0;
        }
        finally {
            zzdy0.zzL(v);
        }
    }

    private static int zzb(zzdy zzdy0) {
        int v = zzdy0.zzg();
        if(zzdy0.zzg() == 1684108385) {
            zzdy0.zzM(8);
            switch(v - 16) {
                case 1: {
                    return zzdy0.zzm();
                }
                case 2: {
                    return zzdy0.zzq();
                }
                case 3: {
                    return zzdy0.zzo();
                }
                case 4: {
                    if((zzdy0.zzf() & 0x80) == 0) {
                        return zzdy0.zzp();
                    }
                }
            }
        }
        zzdo.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzagh zzc(int v, String s, zzdy zzdy0, boolean z, boolean z1) {
        int v1 = zzais.zzb(zzdy0);
        if(z1) {
            v1 = Math.min(1, v1);
        }
        if(v1 >= 0) {
            return z ? new zzagq(s, null, zzfxn.zzo(Integer.toString(v1))) : new zzagb("und", s, Integer.toString(v1));
        }
        zzdo.zzf("MetadataUtil", "Failed to parse uint8 attribute: " + zzeq.zze(v));
        return null;
    }

    @Nullable
    private static zzagq zzd(int v, String s, zzdy zzdy0) {
        int v1 = zzdy0.zzg();
        if(zzdy0.zzg() == 1684108385 && v1 >= 22) {
            zzdy0.zzM(10);
            int v2 = zzdy0.zzq();
            if(v2 > 0) {
                String s1 = v2;
                int v3 = zzdy0.zzq();
                if(v3 > 0) {
                    s1 = s1 + "/" + v3;
                }
                return new zzagq(s, null, zzfxn.zzo(s1));
            }
        }
        zzdo.zzf("MetadataUtil", "Failed to parse index/count attribute: " + zzeq.zze(v));
        return null;
    }

    @Nullable
    private static zzagq zze(int v, String s, zzdy zzdy0) {
        int v1 = zzdy0.zzg();
        if(zzdy0.zzg() == 1684108385) {
            zzdy0.zzM(8);
            return new zzagq(s, null, zzfxn.zzo(zzdy0.zzA(v1 - 16)));
        }
        zzdo.zzf("MetadataUtil", "Failed to parse text attribute: " + zzeq.zze(v));
        return null;
    }
}

