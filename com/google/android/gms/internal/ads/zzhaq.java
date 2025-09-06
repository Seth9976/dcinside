package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

abstract class zzhaq {
    abstract int zza(int arg1, byte[] arg2, int arg3, int arg4);

    abstract String zzb(byte[] arg1, int arg2, int arg3) throws zzgyg;

    static final String zzc(ByteBuffer byteBuffer0, int v, int v1) throws zzgyg {
        if((byteBuffer0.limit() - v - v1 | (v | v1)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer0.limit(), v, v1));
        }
        int v2 = v + v1;
        char[] arr_c = new char[v1];
        int v3;
        for(v3 = 0; v < v2; ++v3) {
            int v4 = byteBuffer0.get(v);
            if(!zzhap.zzd(((byte)v4))) {
                break;
            }
            ++v;
            arr_c[v3] = (char)v4;
        }
        int v5 = v3;
        while(v < v2) {
            int v6 = v + 1;
            int v7 = byteBuffer0.get(v);
            if(zzhap.zzd(((byte)v7))) {
                arr_c[v5] = (char)v7;
                ++v5;
                v = v6;
                while(v < v2) {
                    int v8 = byteBuffer0.get(v);
                    if(!zzhap.zzd(((byte)v8))) {
                        break;
                    }
                    ++v;
                    arr_c[v5] = (char)v8;
                    ++v5;
                }
                continue;
            }
            if(zzhap.zzf(((byte)v7))) {
                if(v6 < v2) {
                    v += 2;
                    zzhap.zzc(((byte)v7), byteBuffer0.get(v6), arr_c, v5);
                    ++v5;
                    continue;
                }
            }
            else if(!zzhap.zze(((byte)v7))) {
                if(v6 < v2 - 2) {
                    int v10 = byteBuffer0.get(v6);
                    int v11 = v + 3;
                    int v12 = byteBuffer0.get(v + 2);
                    v += 4;
                    zzhap.zza(((byte)v7), ((byte)v10), ((byte)v12), byteBuffer0.get(v11), arr_c, v5);
                    v5 += 2;
                    continue;
                }
            }
            else if(v6 < v2 - 1) {
                int v9 = v + 2;
                v += 3;
                zzhap.zzb(((byte)v7), byteBuffer0.get(v6), byteBuffer0.get(v9), arr_c, v5);
                ++v5;
                continue;
            }
            throw new zzgyg("Protocol message had invalid UTF-8.");
        }
        return new String(arr_c, 0, v5);
    }
}

