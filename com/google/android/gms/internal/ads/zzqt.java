package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public final class zzqt {
    private static final byte[] zza;
    private static final byte[] zzb;
    private ByteBuffer zzc;
    private int zzd;
    private int zze;

    static {
        zzqt.zza = new byte[]{0x4F, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 0x4F, 0x70, 0x75, 0x73, 72, 101, 97, 100, 1, 2, 56, 1, (byte)0x80, -69, 0, 0, 0, 0, 0};
        zzqt.zzb = new byte[]{0x4F, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 0x4F, 0x70, 0x75, 0x73, 84, 97, 103, 0x73, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    public zzqt() {
        this.zzc = zzch.zza;
        this.zze = 0;
        this.zzd = 2;
    }

    public final void zza(zzhh zzhh0, List list0) {
        int v5;
        byte[] arr_b = null;
        ByteBuffer byteBuffer0 = zzhh0.zzc;
        byteBuffer0.getClass();
        if(byteBuffer0.limit() - zzhh0.zzc.position() == 0) {
            return;
        }
        if(this.zzd == 2) {
            switch(list0.size()) {
                case 1: 
                case 3: {
                    arr_b = (byte[])list0.get(0);
                }
            }
        }
        ByteBuffer byteBuffer1 = zzhh0.zzc;
        int v = byteBuffer1.position();
        int v1 = byteBuffer1.limit();
        int v2 = v1 - v;
        int v3 = (v2 + 0xFF) / 0xFF;
        int v4 = v3 + 27 + v2;
        if(this.zzd == 2) {
            v5 = arr_b == null ? 0x2F : arr_b.length + 28;
            v4 += v5 + 44;
        }
        else {
            v5 = 0;
        }
        if(this.zzc.capacity() < v4) {
            this.zzc = ByteBuffer.allocate(v4).order(ByteOrder.LITTLE_ENDIAN);
        }
        else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer2 = this.zzc;
        if(this.zzd == 2) {
            if(arr_b == null) {
                byteBuffer2.put(zzqt.zza);
            }
            else {
                zzqt.zzc(byteBuffer2, 0L, 0, 1, true);
                byteBuffer2.put(zzgat.zza(arr_b.length));
                byteBuffer2.put(arr_b);
                byteBuffer2.putInt(22, zzei.zzf(byteBuffer2.array(), byteBuffer2.arrayOffset(), arr_b.length + 28, 0));
                byteBuffer2.position(arr_b.length + 28);
            }
            byteBuffer2.put(zzqt.zzb);
        }
        int v6 = zzadi.zzc(byteBuffer1);
        int v7 = this.zze + v6;
        this.zze = v7;
        zzqt.zzc(byteBuffer2, ((long)v7), this.zzd, v3, false);
        for(int v8 = 0; v8 < v3; ++v8) {
            if(v2 >= 0xFF) {
                byteBuffer2.put(-1);
                v2 -= 0xFF;
            }
            else {
                byteBuffer2.put(((byte)v2));
                v2 = 0;
            }
        }
        while(v < v1) {
            byteBuffer2.put(byteBuffer1.get(v));
            ++v;
        }
        byteBuffer1.position(byteBuffer1.limit());
        byteBuffer2.flip();
        if(this.zzd == 2) {
            byteBuffer2.putInt(v5 + 66, zzei.zzf(byteBuffer2.array(), byteBuffer2.arrayOffset() + v5 + 44, byteBuffer2.limit() - byteBuffer2.position(), 0));
        }
        else {
            byteBuffer2.putInt(22, zzei.zzf(byteBuffer2.array(), byteBuffer2.arrayOffset(), byteBuffer2.limit() - byteBuffer2.position(), 0));
        }
        ++this.zzd;
        this.zzc = byteBuffer2;
        zzhh0.zzb();
        zzhh0.zzj(this.zzc.remaining());
        zzhh0.zzc.put(this.zzc);
        zzhh0.zzk();
    }

    public final void zzb() {
        this.zzc = zzch.zza;
        this.zze = 0;
        this.zzd = 2;
    }

    private static final void zzc(ByteBuffer byteBuffer0, long v, int v1, int v2, boolean z) {
        byteBuffer0.put(0x4F);
        byteBuffer0.put(103);
        byteBuffer0.put(103);
        byteBuffer0.put(83);
        byteBuffer0.put(0);
        byteBuffer0.put(((byte)(z ? 2 : 0)));
        byteBuffer0.putLong(v);
        byteBuffer0.putInt(0);
        byteBuffer0.putInt(v1);
        byteBuffer0.putInt(0);
        byteBuffer0.put(zzgat.zza(v2));
    }
}

