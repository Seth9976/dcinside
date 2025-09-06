package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class zzhdy implements zzaqz {
    protected final String zza;
    boolean zzb;
    boolean zzc;
    long zzd;
    long zze;
    zzhed zzf;
    private static final zzhej zzg;
    private ByteBuffer zzh;

    static {
        zzhdy.zzg = zzhej.zzb(zzhdy.class);
    }

    protected zzhdy(String s) {
        this.zze = -1L;
        this.zza = s;
        this.zzc = true;
        this.zzb = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqz
    public final String zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqz
    public final void zzb(zzhed zzhed0, ByteBuffer byteBuffer0, long v, zzaqw zzaqw0) throws IOException {
        this.zzd = zzhed0.zzb();
        byteBuffer0.remaining();
        this.zze = v;
        this.zzf = zzhed0;
        zzhed0.zze(zzhed0.zzb() + v);
        this.zzc = false;
        this.zzb = false;
        this.zzf();
    }

    private final void zzc() {
        synchronized(this) {
            if(!this.zzc) {
                try {
                    zzhdy.zzg.zza((this.zza.length() == 0 ? new String("mem mapping ") : "mem mapping " + this.zza));
                    this.zzh = this.zzf.zzd(this.zzd, this.zze);
                    this.zzc = true;
                    return;
                }
                catch(IOException iOException0) {
                }
                throw new RuntimeException(iOException0);
            }
        }
    }

    protected abstract void zze(ByteBuffer arg1);

    public final void zzf() {
        synchronized(this) {
            this.zzc();
            zzhdy.zzg.zza((this.zza.length() == 0 ? new String("parsing details of ") : "parsing details of " + this.zza));
            ByteBuffer byteBuffer0 = this.zzh;
            if(byteBuffer0 != null) {
                this.zzb = true;
                byteBuffer0.rewind();
                this.zze(byteBuffer0);
                if(byteBuffer0.remaining() > 0) {
                    byteBuffer0.slice();
                }
                this.zzh = null;
            }
        }
    }
}

