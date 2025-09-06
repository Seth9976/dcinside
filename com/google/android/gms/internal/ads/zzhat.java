package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzhat {
    private static final zzhaq zza;

    static {
        zzhat.zza = new zzhar();
    }

    static int zzc(byte[] arr_b, int v, int v1) {
        int v2 = arr_b[v - 1];
        switch(v1 - v) {
            case 0: {
                return v2 <= -12 ? v2 : -1;
            }
            case 1: {
                return zzhat.zzj(v2, arr_b[v]);
            }
            case 2: {
                return zzhat.zzk(v2, arr_b[v], arr_b[v + 1]);
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    static int zzd(String s, byte[] arr_b, int v, int v1) {
        int v2 = s.length();
        int v3;
        for(v3 = 0; true; ++v3) {
            int v4 = v + v1;
            if(v3 >= v2) {
                break;
            }
            int v5 = v3 + v;
            if(v5 >= v4) {
                break;
            }
            int v6 = s.charAt(v3);
            if(v6 >= 0x80) {
                break;
            }
            arr_b[v5] = (byte)v6;
        }
        if(v3 == v2) {
            return v + v2;
        }
        int v7 = v + v3;
        while(v3 < v2) {
            int v8 = s.charAt(v3);
            if(v8 < 0x80 && v7 < v4) {
                arr_b[v7] = (byte)v8;
                ++v7;
            }
            else if(v8 < 0x800 && v7 <= v4 - 2) {
                arr_b[v7] = (byte)(v8 >>> 6 | 960);
                arr_b[v7 + 1] = (byte)(v8 & 0x3F | 0x80);
                v7 += 2;
            }
            else if(v8 >= 0xD800 && v8 <= 0xDFFF || v7 > v4 - 3) {
                if(v7 > v4 - 4) {
                    goto label_47;
                }
                if(v3 + 1 == s.length()) {
                    throw new zzhas(v3 - 1, v2);
                }
                int v9 = s.charAt(v3 + 1);
                if(!Character.isSurrogatePair(((char)v8), ((char)v9))) {
                    goto label_45;
                }
                int v10 = v7 + 3;
                int v11 = Character.toCodePoint(((char)v8), ((char)v9));
                arr_b[v7] = (byte)(v11 >>> 18 | 0xF0);
                arr_b[v7 + 1] = (byte)(v11 >>> 12 & 0x3F | 0x80);
                arr_b[v7 + 2] = (byte)(v11 >>> 6 & 0x3F | 0x80);
                v7 += 4;
                arr_b[v10] = (byte)(v11 & 0x3F | 0x80);
                ++v3;
            }
            else {
                arr_b[v7] = (byte)(v8 >>> 12 | 480);
                arr_b[v7 + 1] = (byte)(v8 >>> 6 & 0x3F | 0x80);
                arr_b[v7 + 2] = (byte)(v8 & 0x3F | 0x80);
                v7 += 3;
            }
            ++v3;
            continue;
        label_45:
            ++v3;
            throw new zzhas(v3 - 1, v2);
        label_47:
            if(!(v8 >= 0xD800 && v8 <= 0xDFFF && (v3 + 1 == s.length() || !Character.isSurrogatePair(((char)v8), s.charAt(v3 + 1))))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v8) + " at index " + v7);
            }
            throw new zzhas(v3, v2);
        }
        return v7;
    }

    static int zze(String s) {
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
                        if(v6 >= 0xD800 && v6 <= 0xDFFF) {
                            if(Character.codePointAt(s, v2) < 0x10000) {
                                throw new zzhas(v2, v5);
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

    static int zzf(int v, byte[] arr_b, int v1, int v2) {
        return zzhat.zza.zza(v, arr_b, v1, v2);
    }

    static String zzg(ByteBuffer byteBuffer0, int v, int v1) throws zzgyg {
        zzhaq zzhaq0 = zzhat.zza;
        if(byteBuffer0.hasArray()) {
            int v2 = byteBuffer0.arrayOffset();
            return zzhaq0.zzb(byteBuffer0.array(), v2 + v, v1);
        }
        return byteBuffer0.isDirect() ? zzhaq.zzc(byteBuffer0, v, v1) : zzhaq.zzc(byteBuffer0, v, v1);
    }

    static String zzh(byte[] arr_b, int v, int v1) throws zzgyg {
        return zzhat.zza.zzb(arr_b, v, v1);
    }

    static boolean zzi(byte[] arr_b, int v, int v1) {
        return zzhat.zza.zza(0, arr_b, v, v1) == 0;
    }

    private static int zzj(int v, int v1) {
        return v > -12 || v1 > -65 ? -1 : v ^ v1 << 8;
    }

    private static int zzk(int v, int v1, int v2) {
        return v > -12 || v1 > -65 || v2 > -65 ? -1 : v ^ v1 << 8 ^ v2 << 16;
    }
}

