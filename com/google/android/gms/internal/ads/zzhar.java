package com.google.android.gms.internal.ads;

final class zzhar extends zzhaq {
    @Override  // com.google.android.gms.internal.ads.zzhaq
    final int zza(int v, byte[] arr_b, int v1, int v2) {
        int v6;
        if(v != 0) {
            if(v1 >= v2) {
                return v;
            }
            if(((byte)v) < 0xFFFFFFE0) {
                if(((byte)v) >= -62 && arr_b[v1] <= -65) {
                    ++v1;
                    goto label_41;
                }
            }
            else if(((byte)v) < -16) {
                int v3 = (byte)(~(v >> 8));
                if(v3 == 0) {
                    int v4 = arr_b[v1];
                    if(v1 + 1 < v2) {
                        ++v1;
                        v3 = v4;
                        goto label_17;
                    }
                    return zzhat.zzj(((byte)v), v4);
                }
            label_17:
                if(v3 <= -65 && (((byte)v) != 0xFFFFFFE0 || v3 >= 0xFFFFFFA0) && (((byte)v) != -19 || v3 < 0xFFFFFFA0) && arr_b[v1] <= -65) {
                    ++v1;
                    goto label_41;
                }
            }
            else {
                int v5 = (byte)(~(v >> 8));
                if(v5 == 0) {
                    v5 = arr_b[v1];
                    if(v1 + 1 < v2) {
                        ++v1;
                        v6 = 0;
                        goto label_30;
                    }
                    return zzhat.zzj(((byte)v), v5);
                }
                else {
                    v6 = v >> 16;
                }
            label_30:
                if(v6 == 0) {
                    int v7 = arr_b[v1];
                    if(v1 + 1 < v2) {
                        ++v1;
                        v6 = v7;
                        goto label_37;
                    }
                    return zzhat.zzk(((byte)v), v5, v7);
                }
            label_37:
                if(v5 <= -65 && (((byte)v) << 28) + (v5 + 0x70) >> 30 == 0 && v6 <= -65 && arr_b[v1] <= -65) {
                    ++v1;
                    goto label_41;
                }
            }
            return -1;
        }
    label_41:
        while(v1 < v2 && arr_b[v1] >= 0) {
            ++v1;
        }
        if(v1 < v2) {
            while(v1 < v2) {
                int v8 = v1 + 1;
                int v9 = arr_b[v1];
                if(v9 < 0) {
                    if(v9 < 0xFFFFFFE0) {
                        if(v8 >= v2) {
                            return v9;
                        }
                        if(v9 >= -62) {
                            v1 += 2;
                            if(arr_b[v8] <= -65) {
                                continue;
                            }
                            return -1;
                        }
                    }
                    else if(v9 < -16) {
                        if(v8 >= v2 - 1) {
                            return zzhat.zzc(arr_b, v8, v2);
                        }
                        int v10 = v1 + 2;
                        int v11 = arr_b[v8];
                        if(v11 <= -65 && (v9 != 0xFFFFFFE0 || v11 >= 0xFFFFFFA0) && (v9 != -19 || v11 < 0xFFFFFFA0)) {
                            v1 += 3;
                            if(arr_b[v10] <= -65) {
                                continue;
                            }
                            return -1;
                        }
                    }
                    else {
                        if(v8 >= v2 - 2) {
                            return zzhat.zzc(arr_b, v8, v2);
                        }
                        int v12 = arr_b[v8];
                        if(v12 <= -65 && (v9 << 28) + (v12 + 0x70) >> 30 == 0) {
                            int v13 = v1 + 3;
                            if(arr_b[v1 + 2] <= -65) {
                                v1 += 4;
                                if(arr_b[v13] <= -65) {
                                    continue;
                                }
                                return -1;
                            }
                        }
                    }
                    return -1;
                }
                v1 = v8;
            }
        }
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzhaq
    final String zzb(byte[] arr_b, int v, int v1) throws zzgyg {
        if((arr_b.length - v - v1 | (v | v1)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", ((int)arr_b.length), v, v1));
        }
        int v2 = v + v1;
        char[] arr_c = new char[v1];
        int v3;
        for(v3 = 0; v < v2; ++v3) {
            int v4 = arr_b[v];
            if(!zzhap.zzd(((byte)v4))) {
                break;
            }
            ++v;
            arr_c[v3] = (char)v4;
        }
        int v5 = v3;
        while(v < v2) {
            int v6 = v + 1;
            int v7 = arr_b[v];
            if(zzhap.zzd(((byte)v7))) {
                arr_c[v5] = (char)v7;
                ++v5;
                v = v6;
                while(v < v2) {
                    int v8 = arr_b[v];
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
                    zzhap.zzc(((byte)v7), arr_b[v6], arr_c, v5);
                    ++v5;
                    continue;
                }
            }
            else if(!zzhap.zze(((byte)v7))) {
                if(v6 < v2 - 2) {
                    int v10 = arr_b[v6];
                    int v11 = v + 3;
                    int v12 = arr_b[v + 2];
                    v += 4;
                    zzhap.zza(((byte)v7), ((byte)v10), ((byte)v12), arr_b[v11], arr_c, v5);
                    v5 += 2;
                    continue;
                }
            }
            else if(v6 < v2 - 1) {
                int v9 = v + 2;
                v += 3;
                zzhap.zzb(((byte)v7), arr_b[v6], arr_b[v9], arr_c, v5);
                ++v5;
                continue;
            }
            throw new zzgyg("Protocol message had invalid UTF-8.");
        }
        return new String(arr_c, 0, v5);
    }
}

