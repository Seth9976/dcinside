package com.google.android.gms.internal.vision;

final class zzmj extends zzme {
    private static int zza(byte[] arr_b, int v, long v1, int v2) {
        switch(v2) {
            case 0: {
                return zzmd.zzb(v);
            }
            case 1: {
                return zzmd.zzb(v, zzma.zza(arr_b, v1));
            }
            case 2: {
                return zzmd.zzb(v, zzma.zza(arr_b, v1), zzma.zza(arr_b, v1 + 1L));
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzme
    final int zza(int v, byte[] arr_b, int v1, int v2) {
        int v8;
        int v4;
        if((v1 | v2 | arr_b.length - v2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", ((int)arr_b.length), v1, v2));
        }
        int v3 = (int)(((long)v2) - ((long)v1));
        if(v3 < 16) {
            v4 = 0;
        }
        else {
            long v5 = (long)v1;
            v4 = 0;
            while(true) {
                if(v4 >= v3) {
                    v4 = v3;
                    break;
                }
                if(zzma.zza(arr_b, v5) < 0) {
                    break;
                }
                ++v4;
                ++v5;
            }
        }
        int v6 = v3 - v4;
        long v7 = ((long)v1) + ((long)v4);
        while(true) {
            while(true) {
            label_16:
                v8 = 0;
                while(v6 > 0) {
                    v8 = zzma.zza(arr_b, v7);
                    if(v8 >= 0) {
                        --v6;
                        ++v7;
                    }
                    else {
                        ++v7;
                        if(true) {
                            break;
                        }
                    }
                }
                if(v6 == 0) {
                    return 0;
                }
                if(v8 < 0xFFFFFFE0) {
                    if(v6 - 1 == 0) {
                        return v8;
                    }
                    v6 -= 2;
                    if(v8 >= -62 && zzma.zza(arr_b, v7) <= -65) {
                        ++v7;
                        continue;
                    }
                    return -1;
                }
                if(v8 < -16) {
                    if(v6 - 1 < 2) {
                        return zzmj.zza(arr_b, v8, v7, v6 - 1);
                    }
                    v6 -= 3;
                    long v9 = v7 + 1L;
                    int v10 = zzma.zza(arr_b, v7);
                    if(v10 <= -65 && (v8 != 0xFFFFFFE0 || v10 >= 0xFFFFFFA0) && (v8 != -19 || v10 < 0xFFFFFFA0)) {
                        v7 += 2L;
                        if(zzma.zza(arr_b, v9) <= -65) {
                            continue;
                        }
                    }
                    return -1;
                }
                break;
            }
            if(v6 - 1 < 3) {
                return zzmj.zza(arr_b, v8, v7, v6 - 1);
            }
            v6 -= 4;
            int v11 = zzma.zza(arr_b, v7);
            if(v11 > -65 || (v8 << 28) + (v11 + 0x70) >> 30 != 0) {
                break;
            }
            long v12 = v7 + 2L;
            if(zzma.zza(arr_b, v7 + 1L) > -65) {
                break;
            }
            v7 += 3L;
            if(zzma.zza(arr_b, v12) <= -65) {
                goto label_16;
            }
            break;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.vision.zzme
    final int zza(CharSequence charSequence0, byte[] arr_b, int v, int v1) {
        long v2 = (long)v;
        long v3 = ((long)v1) + v2;
        int v4 = charSequence0.length();
        if(v4 > v1 || arr_b.length - v1 < v) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v4 - 1) + " at index " + (v + v1));
        }
        int v5 = 0;
        while(v5 < v4) {
            int v6 = charSequence0.charAt(v5);
            if(v6 >= 0x80) {
                break;
            }
            zzma.zza(arr_b, v2, ((byte)v6));
            ++v5;
            ++v2;
        }
        if(v5 == v4) {
            return (int)v2;
        }
        while(v5 < v4) {
            int v7 = charSequence0.charAt(v5);
            if(v7 < 0x80 && v2 < v3) {
                zzma.zza(arr_b, v2, ((byte)v7));
                ++v2;
            }
            else if(v7 < 0x800 && v2 <= v3 - 2L) {
                long v8 = v2 + 1L;
                zzma.zza(arr_b, v2, ((byte)(v7 >>> 6 | 960)));
                v2 += 2L;
                zzma.zza(arr_b, v8, ((byte)(v7 & 0x3F | 0x80)));
            }
            else if(v7 >= 0xD800 && 0xDFFF >= v7 || v2 > v3 - 3L) {
                if(v2 > v3 - 4L) {
                    goto label_49;
                }
                if(v5 + 1 == v4) {
                    throw new zzmg(v5 - 1, v4);
                }
                int v10 = charSequence0.charAt(v5 + 1);
                if(!Character.isSurrogatePair(((char)v7), ((char)v10))) {
                    goto label_47;
                }
                int v11 = Character.toCodePoint(((char)v7), ((char)v10));
                zzma.zza(arr_b, v2, ((byte)(v11 >>> 18 | 0xF0)));
                zzma.zza(arr_b, v2 + 1L, ((byte)(v11 >>> 12 & 0x3F | 0x80)));
                long v12 = v2 + 3L;
                zzma.zza(arr_b, v2 + 2L, ((byte)(v11 >>> 6 & 0x3F | 0x80)));
                v2 += 4L;
                zzma.zza(arr_b, v12, ((byte)(v11 & 0x3F | 0x80)));
                ++v5;
            }
            else {
                zzma.zza(arr_b, v2, ((byte)(v7 >>> 12 | 480)));
                long v9 = v2 + 2L;
                zzma.zza(arr_b, v2 + 1L, ((byte)(v7 >>> 6 & 0x3F | 0x80)));
                v2 += 3L;
                zzma.zza(arr_b, v9, ((byte)(v7 & 0x3F | 0x80)));
            }
            ++v5;
            continue;
        label_47:
            ++v5;
            throw new zzmg(v5 - 1, v4);
        label_49:
            if(0xD800 > v7 || v7 > 0xDFFF || v5 + 1 != v4 && Character.isSurrogatePair(((char)v7), charSequence0.charAt(v5 + 1))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v7) + " at index " + v2);
            }
            throw new zzmg(v5, v4);
        }
        return (int)v2;
    }

    @Override  // com.google.android.gms.internal.vision.zzme
    final String zzb(byte[] arr_b, int v, int v1) throws zzjk {
        if((v | v1 | arr_b.length - v - v1) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", ((int)arr_b.length), v, v1));
        }
        int v2 = v + v1;
        char[] arr_c = new char[v1];
        int v3;
        for(v3 = 0; v < v2; ++v3) {
            int v4 = zzma.zza(arr_b, ((long)v));
            if(!zzmf.zzd(((byte)v4))) {
                break;
            }
            ++v;
            zzmf.zzb(((byte)v4), arr_c, v3);
        }
        int v5 = v3;
        while(v < v2) {
            int v6 = v + 1;
            int v7 = zzma.zza(arr_b, ((long)v));
            if(zzmf.zzd(((byte)v7))) {
                int v8 = v5 + 1;
                zzmf.zzb(((byte)v7), arr_c, v5);
                while(v6 < v2) {
                    int v9 = zzma.zza(arr_b, ((long)v6));
                    if(!zzmf.zzd(((byte)v9))) {
                        break;
                    }
                    ++v6;
                    zzmf.zzb(((byte)v9), arr_c, v8);
                    ++v8;
                }
                v5 = v8;
                v = v6;
                continue;
            }
            if(zzmf.zze(((byte)v7))) {
                if(v6 < v2) {
                    v += 2;
                    zzmf.zzb(((byte)v7), zzma.zza(arr_b, ((long)v6)), arr_c, v5);
                    ++v5;
                    continue;
                }
            }
            else if(!zzmf.zzf(((byte)v7))) {
                if(v6 < v2 - 2) {
                    int v11 = zzma.zza(arr_b, ((long)v6));
                    int v12 = v + 3;
                    int v13 = zzma.zza(arr_b, ((long)(v + 2)));
                    v += 4;
                    zzmf.zzb(((byte)v7), ((byte)v11), ((byte)v13), zzma.zza(arr_b, ((long)v12)), arr_c, v5);
                    v5 += 2;
                    continue;
                }
            }
            else if(v6 < v2 - 1) {
                int v10 = v + 2;
                v += 3;
                zzmf.zzb(((byte)v7), zzma.zza(arr_b, ((long)v6)), zzma.zza(arr_b, ((long)v10)), arr_c, v5);
                ++v5;
                continue;
            }
            throw zzjk.zzh();
        }
        return new String(arr_c, 0, v5);
    }
}

