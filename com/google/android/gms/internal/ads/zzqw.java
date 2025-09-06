package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzqw extends zzci {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh;
    private int zzi;
    private long zzj;

    public zzqw() {
        this.zzh = zzei.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final ByteBuffer zzb() {
        if(super.zzh()) {
            int v = this.zzi;
            if(v > 0) {
                this.zzj(v).put(this.zzh, 0, this.zzi).flip();
                this.zzi = 0;
            }
        }
        return super.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final void zze(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit();
        int v2 = v1 - v;
        if(v2 != 0) {
            int v3 = Math.min(v2, this.zzg);
            this.zzj += (long)(v3 / this.zzb.zze);
            this.zzg -= v3;
            byteBuffer0.position(v + v3);
            if(this.zzg <= 0) {
                int v4 = v2 - v3;
                int v5 = this.zzi + v4 - this.zzh.length;
                ByteBuffer byteBuffer1 = this.zzj(v5);
                int v6 = Math.max(0, Math.min(v5, this.zzi));
                byteBuffer1.put(this.zzh, 0, v6);
                int v7 = Math.max(0, Math.min(v5 - v6, v4));
                byteBuffer0.limit(byteBuffer0.position() + v7);
                byteBuffer1.put(byteBuffer0);
                byteBuffer0.limit(v1);
                int v8 = v4 - v7;
                int v9 = this.zzi - v6;
                this.zzi = v9;
                System.arraycopy(this.zzh, v6, this.zzh, 0, v9);
                byteBuffer0.get(this.zzh, this.zzi, v8);
                this.zzi += v8;
                byteBuffer1.flip();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final zzcf zzi(zzcf zzcf0) throws zzcg {
        if(zzcf0.zzd != 2) {
            throw new zzcg("Unhandled input format:", zzcf0);
        }
        this.zzf = true;
        return this.zzd != 0 || this.zze != 0 ? zzcf0 : zzcf.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    protected final void zzk() {
        if(this.zzf) {
            this.zzf = false;
            int v = this.zzb.zze;
            this.zzh = new byte[this.zze * v];
            this.zzg = this.zzd * v;
        }
        this.zzi = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    protected final void zzl() {
        if(this.zzf) {
            int v = this.zzi;
            if(v > 0) {
                this.zzj += (long)(v / this.zzb.zze);
            }
            this.zzi = 0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    protected final void zzm() {
        this.zzh = zzei.zzf;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int v, int v1) {
        this.zzd = v;
        this.zze = v1;
    }
}

