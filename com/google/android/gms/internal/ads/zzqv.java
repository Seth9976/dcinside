package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzqv extends zzci {
    private static final int zzd;

    static {
        zzqv.zzd = 0x7FC00000;
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final void zze(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1;
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit();
        int v2 = v1 - v;
    alab1:
        switch(this.zzb.zzd) {
            case 21: {
                byteBuffer1 = this.zzj(v2 / 3 * 4);
                while(v < v1) {
                    zzqv.zzo((byteBuffer0.get(v) & 0xFF) << 8 | (byteBuffer0.get(v + 1) & 0xFF) << 16 | (byteBuffer0.get(v + 2) & 0xFF) << 24, byteBuffer1);
                    v += 3;
                }
                break;
            }
            case 22: {
                byteBuffer1 = this.zzj(v2);
                while(v < v1) {
                    zzqv.zzo(byteBuffer0.get(v) & 0xFF | (byteBuffer0.get(v + 1) & 0xFF) << 8 | (byteBuffer0.get(v + 2) & 0xFF) << 16 | (byteBuffer0.get(v + 3) & 0xFF) << 24, byteBuffer1);
                    v += 4;
                }
                break;
            }
            case 0x50000000: {
                byteBuffer1 = this.zzj(v2 / 3 * 4);
                while(v < v1) {
                    zzqv.zzo((byteBuffer0.get(v + 2) & 0xFF) << 8 | (byteBuffer0.get(v + 1) & 0xFF) << 16 | (byteBuffer0.get(v) & 0xFF) << 24, byteBuffer1);
                    v += 3;
                }
                break;
            }
            case 0x60000000: {
                byteBuffer1 = this.zzj(v2);
                while(true) {
                    if(v >= v1) {
                        break alab1;
                    }
                    zzqv.zzo(byteBuffer0.get(v + 3) & 0xFF | (byteBuffer0.get(v + 2) & 0xFF) << 8 | (byteBuffer0.get(v + 1) & 0xFF) << 16 | (byteBuffer0.get(v) & 0xFF) << 24, byteBuffer1);
                    v += 4;
                }
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
        int v = zzcf0.zzd;
        if(v != 21 && v != 22 && v != 0x50000000) {
            switch(v) {
                case 4: {
                    return zzcf.zza;
                }
                case 0x60000000: {
                    break;
                }
                default: {
                    throw new zzcg("Unhandled input format:", zzcf0);
                }
            }
        }
        return new zzcf(zzcf0.zzb, zzcf0.zzc, 4);
    }

    private static void zzo(int v, ByteBuffer byteBuffer0) {
        byteBuffer0.putInt((Float.floatToIntBits(((float)(((double)v) * 4.656613E-10))) == zzqv.zzd ? 0 : Float.floatToIntBits(((float)(((double)v) * 4.656613E-10)))));
    }
}

