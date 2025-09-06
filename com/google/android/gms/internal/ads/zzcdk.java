package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzcdk extends zzcde implements zzgy {
    private static final AtomicInteger zzd;
    private String zze;
    private final zzcbr zzf;
    private boolean zzg;
    private final zzcdj zzh;
    private final zzcco zzi;
    private ByteBuffer zzj;
    private boolean zzk;
    private final Object zzl;
    private final String zzm;
    private final int zzn;
    private boolean zzo;

    static {
        zzcdk.zzd = new AtomicInteger(0);
    }

    public zzcdk(zzcbs zzcbs0, zzcbr zzcbr0) {
        super(zzcbs0);
        this.zzf = zzcbr0;
        this.zzh = new zzcdj();
        this.zzi = new zzcco();
        this.zzl = new Object();
        this.zzm = (String)zzful.zzd((zzcbs0 == null ? null : zzcbs0.zzr())).zzb("");
        this.zzn = zzcbs0 == null ? 0 : zzcbs0.zzf();
        zzcdk.zzd.incrementAndGet();
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final void release() {
        zzcdk.zzd.decrementAndGet();
    }

    @Override  // com.google.android.gms.internal.ads.zzgy
    public final void zza(zzfy zzfy0, zzgd zzgd0, boolean z, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgy
    public final void zzb(zzfy zzfy0, zzgd zzgd0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgy
    public final void zzc(zzfy zzfy0, zzgd zzgd0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgy
    public final void zzd(zzfy zzfy0, zzgd zzgd0, boolean z) {
        if(zzfy0 instanceof zzgl) {
            this.zzh.zzb(((zzgl)zzfy0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
        this.zzg = true;
    }

    public static int zzi() {
        return zzcdk.zzd.get();
    }

    public final String zzk() {
        return this.zze;
    }

    public final ByteBuffer zzl() {
        synchronized(this.zzl) {
            ByteBuffer byteBuffer0 = this.zzj;
            if(byteBuffer0 != null && !this.zzk) {
                byteBuffer0.flip();
                this.zzk = true;
            }
            this.zzg = true;
            return this.zzj;
        }
    }

    public final boolean zzm() {
        return this.zzo;
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(String s) {
        String s2;
        long v2;
        this.zze = s;
        String s1 = zzcdk.zzv(s);
        try {
            zzgg zzgg0 = new zzgg();
            zzgg0.zzf(this.zzb);
            zzgg0.zzc(this.zzf.zzd);
            zzgg0.zzd(this.zzf.zze);
            zzgg0.zzb(true);
            zzgg0.zze(this);
            zzgl zzgl0 = zzgg0.zzg();
            if(this.zzf.zzi) {
                zzgl0 = new zzccm(this.zza, zzgl0, this.zzm, this.zzn, null, null);
            }
            zzgl0.zzb(new zzgd(Uri.parse(s), 0L, -1L, null));
            zzcbs zzcbs0 = (zzcbs)this.zzc.get();
            if(zzcbs0 != null) {
                zzcbs0.zzt(s1, this);
            }
            Clock clock0 = zzv.zzC();
            long v = clock0.currentTimeMillis();
            long v1 = (long)(((Long)zzbe.zzc().zza(zzbcl.zzL)));
            v2 = (long)(((Long)zzbe.zzc().zza(zzbcl.zzK)));
            this.zzj = ByteBuffer.allocate(this.zzf.zzc);
            byte[] arr_b = new byte[0x2000];
            long v3 = v;
            while(true) {
            label_22:
                int v4 = zzgl0.zza(arr_b, 0, Math.min(this.zzj.remaining(), 0x2000));
                if(v4 == -1) {
                    this.zzo = true;
                    this.zzj(s, s1, ((long)(((int)this.zzi.zza(this.zzj)))));
                    return true;
                }
                synchronized(this.zzl) {
                    if(!this.zzg) {
                        this.zzj.put(arr_b, 0, v4);
                    }
                }
                if(this.zzj.remaining() <= 0) {
                    this.zzx();
                    return true;
                }
                if(this.zzg) {
                    goto label_47;
                }
                long v6 = clock0.currentTimeMillis();
                if(v6 - v3 >= v1) {
                    this.zzx();
                    v3 = v6;
                }
                if(v6 - v > 1000L * v2) {
                    s2 = "downloadTimeout";
                    break;
                }
            }
        }
        catch(Exception exception0) {
            s2 = "error";
            goto label_54;
        }
        try {
            throw new IOException("Timeout exceeded. Limit: " + v2 + " sec");
        }
        catch(Exception exception0) {
            goto label_54;
        }
        goto label_22;
        try {
        label_47:
            s2 = "externalAbort";
        }
        catch(Exception exception0) {
            s2 = "error";
            goto label_54;
        }
        try {
            throw new IOException("Precache abort at " + this.zzj.limit() + " bytes");
        }
        catch(Exception exception0) {
        }
    label_54:
        String s3 = exception0.getClass().getCanonicalName() + ":" + exception0.getMessage();
        zzo.zzj(("Failed to preload url " + s + " Exception: " + s3));
        this.zzg(s, s1, s2, s3);
        return false;
    }

    protected static final String zzv(String s) {
        return "cache:" + zzf.zzf(s);
    }

    private final void zzx() {
        int v = (int)this.zzh.zza();
        int v1 = (int)this.zzi.zza(this.zzj);
        int v2 = this.zzj.position();
        int v3 = Math.round(((float)v1) * (((float)v2) / ((float)v)));
        int v4 = zzcbj.zzs();
        int v5 = zzcbj.zzu();
        this.zzn(this.zze, zzcdk.zzv(this.zze), v2, v, ((long)v3), ((long)v1), v3 > 0, v4, v5);
    }
}

