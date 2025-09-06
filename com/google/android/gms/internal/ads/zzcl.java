package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzcl extends zzci {
    @Override  // com.google.android.gms.internal.ads.zzch
    public final void zze(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit();
        int v2 = v1 - v;
        switch(this.zzb.zzd) {
            case 3: {
                v2 += v2;
                break;
            }
            case 0x10000000: {
                break;
            }
            case 21: 
            case 0x50000000: {
                v2 = v2 / 3 + v2 / 3;
                break;
            }
            case 4: 
            case 22: 
            case 0x60000000: {
                v2 /= 2;
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        ByteBuffer byteBuffer1 = this.zzj(v2);
    alab1:
        switch(this.zzb.zzd) {
            case 3: {
                while(true) {
                    if(v >= v1) {
                        break alab1;
                    }
                    byteBuffer1.put(0);
                    byteBuffer1.put(((byte)((byteBuffer0.get(v) & 0xFF) - 0x80)));
                    ++v;
                }
            }
            case 4: {
                while(v < v1) {
                    int v3 = (short)(((int)(Math.max(-1.0f, Math.min(byteBuffer0.getFloat(v), 1.0f)) * 32767.0f)));
                    byteBuffer1.put(((byte)(v3 & 0xFF)));
                    byteBuffer1.put(((byte)(v3 >> 8 & 0xFF)));
                    v += 4;
                }
                break;
            }
            case 21: {
                while(v < v1) {
                    byteBuffer1.put(byteBuffer0.get(v + 1));
                    byteBuffer1.put(byteBuffer0.get(v + 2));
                    v += 3;
                }
                break;
            }
            case 22: {
                while(v < v1) {
                    byteBuffer1.put(byteBuffer0.get(v + 2));
                    byteBuffer1.put(byteBuffer0.get(v + 3));
                    v += 4;
                }
                break;
            }
            case 0x10000000: {
                while(v < v1) {
                    byteBuffer1.put(byteBuffer0.get(v + 1));
                    byteBuffer1.put(byteBuffer0.get(v));
                    v += 2;
                }
                break;
            }
            case 0x50000000: {
                while(v < v1) {
                    byteBuffer1.put(byteBuffer0.get(v + 1));
                    byteBuffer1.put(byteBuffer0.get(v));
                    v += 3;
                }
                break;
            }
            case 0x60000000: {
                while(v < v1) {
                    byteBuffer1.put(byteBuffer0.get(v + 1));
                    byteBuffer1.put(byteBuffer0.get(v));
                    v += 4;
                }
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        byteBuffer0.position(byteBuffer0.limit());
        byteBuffer1.flip();
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final zzcf zzi(zzcf zzcf0) throws zzcg {
        switch(zzcf0.zzd) {
            case 2: {
                return zzcf.zza;
            }
            case 3: 
            case 4: 
            case 21: 
            case 22: 
            case 0x10000000: 
            case 0x50000000: 
            case 0x60000000: {
                return new zzcf(zzcf0.zzb, zzcf0.zzc, 2);
            }
            default: {
                throw new zzcg("Unhandled input format:", zzcf0);
            }
        }
    }
}

