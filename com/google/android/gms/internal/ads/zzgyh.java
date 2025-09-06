package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

final class zzgyh extends InputStream {
    private Iterator zza;
    private ByteBuffer zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    zzgyh(Iterable iterable0) {
        this.zza = iterable0.iterator();
        this.zzc = 0;
        for(Object object0: iterable0) {
            ByteBuffer byteBuffer0 = (ByteBuffer)object0;
            ++this.zzc;
        }
        this.zzd = -1;
        if(!this.zzb()) {
            this.zzb = zzgye.zzc;
            this.zzd = 0;
            this.zze = 0;
            this.zzi = 0L;
        }
    }

    @Override
    public final int read() throws IOException {
        if(this.zzd == this.zzc) {
            return -1;
        }
        if(this.zzf) {
            int v = this.zzg[this.zze + this.zzh] & 0xFF;
            this.zza(1);
            return v;
        }
        int v1 = zzhao.zza(((long)this.zze) + this.zzi);
        this.zza(1);
        return v1 & 0xFF;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) throws IOException {
        if(this.zzd == this.zzc) {
            return -1;
        }
        int v2 = this.zze;
        int v3 = this.zzb.limit() - v2;
        if(v1 > v3) {
            v1 = v3;
        }
        if(this.zzf) {
            System.arraycopy(this.zzg, v2 + this.zzh, arr_b, v, v1);
            this.zza(v1);
            return v1;
        }
        int v4 = this.zzb.position();
        this.zzb.position(this.zze);
        this.zzb.get(arr_b, v, v1);
        this.zzb.position(v4);
        this.zza(v1);
        return v1;
    }

    private final void zza(int v) {
        int v1 = this.zze + v;
        this.zze = v1;
        if(v1 == this.zzb.limit()) {
            this.zzb();
        }
    }

    private final boolean zzb() {
        ++this.zzd;
        if(!this.zza.hasNext()) {
            return false;
        }
        Object object0 = this.zza.next();
        this.zzb = (ByteBuffer)object0;
        this.zze = ((ByteBuffer)object0).position();
        if(this.zzb.hasArray()) {
            this.zzf = true;
            this.zzg = this.zzb.array();
            this.zzh = this.zzb.arrayOffset();
            return true;
        }
        this.zzf = false;
        this.zzi = zzhao.zze(this.zzb);
        this.zzg = null;
        return true;
    }
}

