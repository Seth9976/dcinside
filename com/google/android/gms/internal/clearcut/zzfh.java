package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

final class zzfh extends zzfg {
    @Override  // com.google.android.gms.internal.clearcut.zzfg
    final int zzb(int v, byte[] arr_b, int v1, int v2) {
        while(v1 < v2 && arr_b[v1] >= 0) {
            ++v1;
        }
        if(v1 >= v2) {
            return 0;
        }
        while(true) {
            if(v1 >= v2) {
                return 0;
            }
            int v3 = v1 + 1;
            int v4 = arr_b[v1];
            if(v4 < 0) {
                if(v4 < 0xFFFFFFE0) {
                    if(v3 >= v2) {
                        return v4;
                    }
                    if(v4 >= -62) {
                        v1 += 2;
                        if(arr_b[v3] > -65) {
                            return -1;
                        }
                        continue;
                    }
                }
                else if(v4 < -16) {
                    if(v3 >= v2 - 1) {
                        return zzff.zzf(arr_b, v3, v2);
                    }
                    int v5 = v1 + 2;
                    int v6 = arr_b[v3];
                    if(v6 <= -65 && (v4 != 0xFFFFFFE0 || v6 >= 0xFFFFFFA0) && (v4 != -19 || v6 < 0xFFFFFFA0)) {
                        v1 += 3;
                        if(arr_b[v5] > -65) {
                            return -1;
                        }
                        continue;
                    }
                }
                else {
                    if(v3 >= v2 - 2) {
                        return zzff.zzf(arr_b, v3, v2);
                    }
                    int v7 = arr_b[v3];
                    if(v7 <= -65 && (v4 << 28) + (v7 + 0x70) >> 30 == 0) {
                        int v8 = v1 + 3;
                        if(arr_b[v1 + 2] <= -65) {
                            v1 += 4;
                            if(arr_b[v8] > -65) {
                                return -1;
                            }
                            continue;
                        }
                    }
                }
                return -1;
            }
            v1 = v3;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfg
    final int zzb(CharSequence charSequence0, byte[] arr_b, int v, int v1) {
        int v2 = charSequence0.length();
        int v3 = v1 + v;
        int v4;
        for(v4 = 0; v4 < v2; ++v4) {
            int v5 = v4 + v;
            if(v5 >= v3) {
                break;
            }
            int v6 = charSequence0.charAt(v4);
            if(v6 >= 0x80) {
                break;
            }
            arr_b[v5] = (byte)v6;
        }
        if(v4 == v2) {
            return v + v2;
        }
        int v7 = v + v4;
        while(v4 < v2) {
            int v8 = charSequence0.charAt(v4);
            if(v8 < 0x80 && v7 < v3) {
                arr_b[v7] = (byte)v8;
                ++v7;
            }
            else if(v8 < 0x800 && v7 <= v3 - 2) {
                int v9 = v7 + 1;
                arr_b[v7] = (byte)(v8 >>> 6 | 960);
                v7 += 2;
                arr_b[v9] = (byte)(v8 & 0x3F | 0x80);
            }
            else if(v8 >= 0xD800 && 0xDFFF >= v8 || v7 > v3 - 3) {
                if(v7 > v3 - 4) {
                    goto label_49;
                }
                if(v4 + 1 == charSequence0.length()) {
                    throw new zzfi(v4 - 1, v2);
                }
                int v11 = charSequence0.charAt(v4 + 1);
                if(!Character.isSurrogatePair(((char)v8), ((char)v11))) {
                    goto label_47;
                }
                int v12 = Character.toCodePoint(((char)v8), ((char)v11));
                arr_b[v7] = (byte)(v12 >>> 18 | 0xF0);
                arr_b[v7 + 1] = (byte)(v12 >>> 12 & 0x3F | 0x80);
                int v13 = v7 + 3;
                arr_b[v7 + 2] = (byte)(v12 >>> 6 & 0x3F | 0x80);
                v7 += 4;
                arr_b[v13] = (byte)(v12 & 0x3F | 0x80);
                ++v4;
            }
            else {
                arr_b[v7] = (byte)(v8 >>> 12 | 480);
                int v10 = v7 + 2;
                arr_b[v7 + 1] = (byte)(v8 >>> 6 & 0x3F | 0x80);
                v7 += 3;
                arr_b[v10] = (byte)(v8 & 0x3F | 0x80);
            }
            ++v4;
            continue;
        label_47:
            ++v4;
            throw new zzfi(v4 - 1, v2);
        label_49:
            if(!(0xD800 <= v8 && v8 <= 0xDFFF && (v4 + 1 == charSequence0.length() || !Character.isSurrogatePair(((char)v8), charSequence0.charAt(v4 + 1))))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v8) + " at index " + v7);
            }
            throw new zzfi(v4, v2);
        }
        return v7;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfg
    final void zzb(CharSequence charSequence0, ByteBuffer byteBuffer0) {
        zzfg.zzc(charSequence0, byteBuffer0);
    }
}

