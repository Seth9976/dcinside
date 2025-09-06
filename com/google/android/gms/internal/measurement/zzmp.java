package com.google.android.gms.internal.measurement;

final class zzmp {
    private static final zzmr zza;

    static {
        zzmp.zza = new zzmq();
    }

    static int zza(String s) {
        int v = s.length();
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < v && s.charAt(v2) < 0x80; ++v2) {
        }
        int v3 = v;
        while(v2 < v) {
            int v4 = s.charAt(v2);
            if(v4 < 0x800) {
                v3 += 0x7F - v4 >>> 0x1F;
                ++v2;
            }
            else {
                int v5 = s.length();
                while(v2 < v5) {
                    int v6 = s.charAt(v2);
                    if(v6 < 0x800) {
                        v1 += 0x7F - v6 >>> 0x1F;
                    }
                    else {
                        v1 += 2;
                        if(0xD800 <= v6 && v6 <= 0xDFFF) {
                            if(Character.codePointAt(s, v2) < 0x10000) {
                                throw new zzmt(v2, v5);
                            }
                            ++v2;
                        }
                    }
                    ++v2;
                }
                v3 += v1;
                if(true) {
                    break;
                }
            }
        }
        if(v3 < v) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long)v3) + 0x100000000L));
        }
        return v3;
    }

    static int zza(String s, byte[] arr_b, int v, int v1) {
        return zzmp.zza.zza(s, arr_b, v, v1);
    }

    static int zza(byte[] arr_b, int v, int v1) {
        int v2 = arr_b[v - 1];
        switch(v1 - v) {
            case 0: {
                return v2 <= -12 ? v2 : -1;
            }
            case 1: {
                int v3 = arr_b[v];
                return v2 > -12 || v3 > -65 ? -1 : v3 << 8 ^ v2;
            }
            case 2: {
                int v4 = arr_b[v];
                int v5 = arr_b[v + 1];
                return v2 > -12 || v4 > -65 || v5 > -65 ? -1 : v5 << 16 ^ (v4 << 8 ^ v2);
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    static String zzb(byte[] arr_b, int v, int v1) throws zzkb {
        return zzmp.zza.zza(arr_b, v, v1);
    }

    static boolean zzc(byte[] arr_b, int v, int v1) {
        return zzmp.zza.zza(0, arr_b, v, v1) == 0;
    }
}

