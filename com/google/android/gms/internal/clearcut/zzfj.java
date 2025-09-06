package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

final class zzfj extends zzfg {
    private static int zza(byte[] arr_b, int v, long v1, int v2) {
        switch(v2) {
            case 0: {
                return zzff.zzam(v);
            }
            case 1: {
                return zzff.zzp(v, zzfd.zza(arr_b, v1));
            }
            case 2: {
                return zzff.zzd(v, zzfd.zza(arr_b, v1), zzfd.zza(arr_b, v1 + 1L));
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfg
    final int zzb(int v, byte[] arr_b, int v1, int v2) {
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
                if(zzfd.zza(arr_b, v5) < 0) {
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
                    v8 = zzfd.zza(arr_b, v7);
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
                    if(v8 >= -62 && zzfd.zza(arr_b, v7) <= -65) {
                        ++v7;
                        continue;
                    }
                    return -1;
                }
                if(v8 < -16) {
                    if(v6 - 1 < 2) {
                        return zzfj.zza(arr_b, v8, v7, v6 - 1);
                    }
                    v6 -= 3;
                    long v9 = v7 + 1L;
                    int v10 = zzfd.zza(arr_b, v7);
                    if(v10 <= -65 && (v8 != 0xFFFFFFE0 || v10 >= 0xFFFFFFA0) && (v8 != -19 || v10 < 0xFFFFFFA0)) {
                        v7 += 2L;
                        if(zzfd.zza(arr_b, v9) <= -65) {
                            continue;
                        }
                    }
                    return -1;
                }
                break;
            }
            if(v6 - 1 < 3) {
                return zzfj.zza(arr_b, v8, v7, v6 - 1);
            }
            v6 -= 4;
            int v11 = zzfd.zza(arr_b, v7);
            if(v11 > -65 || (v8 << 28) + (v11 + 0x70) >> 30 != 0) {
                break;
            }
            long v12 = v7 + 2L;
            if(zzfd.zza(arr_b, v7 + 1L) > -65) {
                break;
            }
            v7 += 3L;
            if(zzfd.zza(arr_b, v12) <= -65) {
                goto label_16;
            }
            break;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfg
    final int zzb(CharSequence charSequence0, byte[] arr_b, int v, int v1) {
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
            zzfd.zza(arr_b, v2, ((byte)v6));
            ++v5;
            ++v2;
        }
        if(v5 == v4) {
            return (int)v2;
        }
        while(v5 < v4) {
            int v7 = charSequence0.charAt(v5);
            if(v7 < 0x80 && v2 < v3) {
                zzfd.zza(arr_b, v2, ((byte)v7));
                ++v2;
            }
            else if(v7 < 0x800 && v2 <= v3 - 2L) {
                long v8 = v2 + 1L;
                zzfd.zza(arr_b, v2, ((byte)(v7 >>> 6 | 960)));
                v2 += 2L;
                zzfd.zza(arr_b, v8, ((byte)(v7 & 0x3F | 0x80)));
            }
            else if(v7 >= 0xD800 && 0xDFFF >= v7 || v2 > v3 - 3L) {
                if(v2 > v3 - 4L) {
                    goto label_49;
                }
                if(v5 + 1 == v4) {
                    throw new zzfi(v5 - 1, v4);
                }
                int v10 = charSequence0.charAt(v5 + 1);
                if(!Character.isSurrogatePair(((char)v7), ((char)v10))) {
                    goto label_47;
                }
                int v11 = Character.toCodePoint(((char)v7), ((char)v10));
                zzfd.zza(arr_b, v2, ((byte)(v11 >>> 18 | 0xF0)));
                zzfd.zza(arr_b, v2 + 1L, ((byte)(v11 >>> 12 & 0x3F | 0x80)));
                long v12 = v2 + 3L;
                zzfd.zza(arr_b, v2 + 2L, ((byte)(v11 >>> 6 & 0x3F | 0x80)));
                v2 += 4L;
                zzfd.zza(arr_b, v12, ((byte)(v11 & 0x3F | 0x80)));
                ++v5;
            }
            else {
                zzfd.zza(arr_b, v2, ((byte)(v7 >>> 12 | 480)));
                long v9 = v2 + 2L;
                zzfd.zza(arr_b, v2 + 1L, ((byte)(v7 >>> 6 & 0x3F | 0x80)));
                v2 += 3L;
                zzfd.zza(arr_b, v9, ((byte)(v7 & 0x3F | 0x80)));
            }
            ++v5;
            continue;
        label_47:
            ++v5;
            throw new zzfi(v5 - 1, v4);
        label_49:
            if(0xD800 > v7 || v7 > 0xDFFF || v5 + 1 != v4 && Character.isSurrogatePair(((char)v7), charSequence0.charAt(v5 + 1))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v7) + " at index " + v2);
            }
            throw new zzfi(v5, v4);
        }
        return (int)v2;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfg
    final void zzb(CharSequence charSequence0, ByteBuffer byteBuffer0) {
        int v8;
        int v6;
        long v = zzfd.zzb(byteBuffer0);
        long v1 = ((long)byteBuffer0.position()) + v;
        long v2 = ((long)byteBuffer0.limit()) + v;
        int v3 = charSequence0.length();
        if(((long)v3) > v2 - v1) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v3 - 1) + " at index " + byteBuffer0.limit());
        }
        int v4 = 0;
        while(v4 < v3) {
            int v5 = charSequence0.charAt(v4);
            if(v5 >= 0x80) {
                break;
            }
            zzfd.zza(v1, ((byte)v5));
            ++v4;
            ++v1;
        }
        if(v4 != v3) {
            while(v4 < v3) {
                int v7 = charSequence0.charAt(v4);
                if(v7 < 0x80 && v1 < v2) {
                    zzfd.zza(v1, ((byte)v7));
                    v8 = v4;
                    ++v1;
                }
                else if(v7 < 0x800 && v1 <= v2 - 2L) {
                    long v9 = v1 + 1L;
                    zzfd.zza(v1, ((byte)(v7 >>> 6 | 960)));
                    v1 += 2L;
                    zzfd.zza(v9, ((byte)(v7 & 0x3F | 0x80)));
                    v8 = v4;
                }
                else if(v7 >= 0xD800 && 0xDFFF >= v7 || v1 > v2 - 3L) {
                    if(v1 > v2 - 4L) {
                        goto label_54;
                    }
                    v8 = v4 + 1;
                    if(v8 == v3) {
                        throw new zzfi(v4 - 1, v3);
                    }
                    int v11 = charSequence0.charAt(v8);
                    if(!Character.isSurrogatePair(((char)v7), ((char)v11))) {
                        goto label_52;
                    }
                    int v12 = Character.toCodePoint(((char)v7), ((char)v11));
                    zzfd.zza(v1, ((byte)(v12 >>> 18 | 0xF0)));
                    zzfd.zza(v1 + 1L, ((byte)(v12 >>> 12 & 0x3F | 0x80)));
                    long v13 = v1 + 3L;
                    zzfd.zza(v1 + 2L, ((byte)(v12 >>> 6 & 0x3F | 0x80)));
                    v1 += 4L;
                    zzfd.zza(v13, ((byte)(v12 & 0x3F | 0x80)));
                }
                else {
                    zzfd.zza(v1, ((byte)(v7 >>> 12 | 480)));
                    long v10 = v1 + 2L;
                    zzfd.zza(v1 + 1L, ((byte)(v7 >>> 6 & 0x3F | 0x80)));
                    v1 += 3L;
                    zzfd.zza(v10, ((byte)(v7 & 0x3F | 0x80)));
                    v8 = v4;
                }
                v4 = v8 + 1;
                continue;
            label_52:
                v4 = v8;
                throw new zzfi(v4 - 1, v3);
            label_54:
                if(!(0xD800 > v7 || v7 > 0xDFFF || v4 + 1 != v3 && Character.isSurrogatePair(((char)v7), charSequence0.charAt(v4 + 1)))) {
                    throw new zzfi(v4, v3);
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v7) + " at index " + v1);
            }
        }
        v6 = (int)(v1 - v);
        byteBuffer0.position(v6);
        return;
    }
}

