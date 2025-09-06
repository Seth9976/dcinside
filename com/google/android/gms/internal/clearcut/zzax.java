package com.google.android.gms.internal.clearcut;

import java.io.IOException;

final class zzax {
    static int zza(int v, byte[] arr_b, int v1, int v2, zzay zzay0) throws zzco {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    return zzax.zzb(arr_b, v1, zzay0);
                }
                case 1: {
                    return v1 + 8;
                }
                case 2: {
                    return zzax.zza(arr_b, v1, zzay0) + zzay0.zzfd;
                }
                case 3: {
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        v1 = zzax.zza(arr_b, v1, zzay0);
                        v4 = zzay0.zzfd;
                        if(v4 == v3) {
                            break;
                        }
                        v1 = zzax.zza(v4, arr_b, v1, v2, zzay0);
                    }
                    if(v1 > v2 || v4 != v3) {
                        throw zzco.zzbo();
                    }
                    return v1;
                }
                case 5: {
                    return v1 + 4;
                }
                default: {
                    throw zzco.zzbm();
                }
            }
        }
        throw zzco.zzbm();
    }

    static int zza(int v, byte[] arr_b, int v1, int v2, zzcn zzcn0, zzay zzay0) {
        int v3;
        for(v3 = zzax.zza(arr_b, v1, zzay0); true; v3 = zzax.zza(arr_b, v4, zzay0)) {
            ((zzch)zzcn0).zzac(zzay0.zzfd);
            if(v3 >= v2) {
                break;
            }
            int v4 = zzax.zza(arr_b, v3, zzay0);
            if(v != zzay0.zzfd) {
                break;
            }
        }
        return v3;
    }

    static int zza(int v, byte[] arr_b, int v1, int v2, zzey zzey0, zzay zzay0) throws IOException {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v3 = zzax.zzb(arr_b, v1, zzay0);
                    zzey0.zzb(v, zzay0.zzfe);
                    return v3;
                }
                case 1: {
                    zzey0.zzb(v, zzax.zzd(arr_b, v1));
                    return v1 + 8;
                }
                case 2: {
                    int v4 = zzax.zza(arr_b, v1, zzay0);
                    int v5 = zzay0.zzfd;
                    zzey0.zzb(v, (v5 == 0 ? zzbb.zzfi : zzbb.zzb(arr_b, v4, v5)));
                    return v4 + v5;
                }
                case 3: {
                    zzey zzey1 = zzey.zzeb();
                    int v6 = v & -8 | 4;
                    int v7 = 0;
                    while(v1 < v2) {
                        int v8 = zzax.zza(arr_b, v1, zzay0);
                        int v9 = zzay0.zzfd;
                        v7 = v9;
                        if(v9 == v6) {
                            v1 = v8;
                            if(true) {
                                break;
                            }
                        }
                        else {
                            int v10 = zzax.zza(v7, arr_b, v8, v2, zzey1, zzay0);
                            v7 = v9;
                            v1 = v10;
                        }
                    }
                    if(v1 > v2 || v7 != v6) {
                        throw zzco.zzbo();
                    }
                    zzey0.zzb(v, zzey1);
                    return v1;
                }
                case 5: {
                    zzey0.zzb(v, zzax.zzc(arr_b, v1));
                    return v1 + 4;
                }
                default: {
                    throw zzco.zzbm();
                }
            }
        }
        throw zzco.zzbm();
    }

    static int zza(int v, byte[] arr_b, int v1, zzay zzay0) {
        int v5;
        int v2 = v & 0x7F;
        int v3 = v1 + 1;
        int v4 = arr_b[v1];
        if(v4 >= 0) {
            v5 = v4 << 7;
            zzay0.zzfd = v2 | v5;
            return v3;
        }
        int v6 = v2 | (v4 & 0x7F) << 7;
        int v7 = arr_b[v3];
        if(v7 >= 0) {
            zzay0.zzfd = v6 | v7 << 14;
            return v1 + 2;
        }
        v2 = v6 | (v7 & 0x7F) << 14;
        v3 = v1 + 3;
        int v8 = arr_b[v1 + 2];
        if(v8 >= 0) {
            v5 = v8 << 21;
            zzay0.zzfd = v2 | v5;
            return v3;
        }
        int v9 = v2 | (v8 & 0x7F) << 21;
        int v10 = v1 + 4;
        int v11 = arr_b[v3];
        if(v11 >= 0) {
            zzay0.zzfd = v9 | v11 << 28;
            return v10;
        }
        while(arr_b[v10] < 0) {
            ++v10;
        }
        zzay0.zzfd = v9 | (v11 & 0x7F) << 28;
        return v10 + 1;
    }

    static int zza(byte[] arr_b, int v, zzay zzay0) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            zzay0.zzfd = v1;
            return v + 1;
        }
        return zzax.zza(v1, arr_b, v + 1, zzay0);
    }

    static int zza(byte[] arr_b, int v, zzcn zzcn0, zzay zzay0) throws IOException {
        int v1 = zzax.zza(arr_b, v, zzay0);
        int v2 = zzay0.zzfd + v1;
        while(v1 < v2) {
            v1 = zzax.zza(arr_b, v1, zzay0);
            ((zzch)zzcn0).zzac(zzay0.zzfd);
        }
        if(v1 != v2) {
            throw zzco.zzbl();
        }
        return v1;
    }

    static int zzb(byte[] arr_b, int v, zzay zzay0) {
        long v1 = (long)arr_b[v];
        if(v1 >= 0L) {
            zzay0.zzfe = v1;
            return v + 1;
        }
        int v2 = v + 2;
        int v3 = arr_b[v + 1];
        long v4 = v1 & 0x7FL | ((long)(v3 & 0x7F)) << 7;
        int v5 = 7;
        while(v3 < 0) {
            int v6 = arr_b[v2];
            v5 += 7;
            v4 |= ((long)(v6 & 0x7F)) << v5;
            v3 = v6;
            ++v2;
        }
        zzay0.zzfe = v4;
        return v2;
    }

    static int zzc(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    static int zzc(byte[] arr_b, int v, zzay zzay0) {
        int v1 = zzax.zza(arr_b, v, zzay0);
        int v2 = zzay0.zzfd;
        if(v2 == 0) {
            zzay0.zzff = "";
            return v1;
        }
        zzay0.zzff = new String(arr_b, v1, v2, zzci.UTF_8);
        return v1 + v2;
    }

    static int zzd(byte[] arr_b, int v, zzay zzay0) throws IOException {
        int v1 = zzax.zza(arr_b, v, zzay0);
        int v2 = zzay0.zzfd;
        if(v2 == 0) {
            zzay0.zzff = "";
            return v1;
        }
        int v3 = v1 + v2;
        if(!zzff.zze(arr_b, v1, v3)) {
            throw zzco.zzbp();
        }
        zzay0.zzff = new String(arr_b, v1, v2, zzci.UTF_8);
        return v3;
    }

    static long zzd(byte[] arr_b, int v) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }

    static double zze(byte[] arr_b, int v) {
        return Double.longBitsToDouble(zzax.zzd(arr_b, v));
    }

    static int zze(byte[] arr_b, int v, zzay zzay0) {
        int v1 = zzax.zza(arr_b, v, zzay0);
        int v2 = zzay0.zzfd;
        if(v2 == 0) {
            zzay0.zzff = zzbb.zzfi;
            return v1;
        }
        zzay0.zzff = zzbb.zzb(arr_b, v1, v2);
        return v1 + v2;
    }

    static float zzf(byte[] arr_b, int v) {
        return Float.intBitsToFloat(zzax.zzc(arr_b, v));
    }
}

