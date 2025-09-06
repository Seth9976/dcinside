package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public final class zzti implements zzuz {
    private final zzacs zza;
    @Nullable
    private zzacn zzb;
    @Nullable
    private zzaco zzc;

    public zzti(zzacs zzacs0) {
        this.zza = zzacs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzuz
    public final int zza(zzadj zzadj0) throws IOException {
        zzacn zzacn0 = this.zzb;
        zzacn0.getClass();
        zzaco zzaco0 = this.zzc;
        zzaco0.getClass();
        return zzacn0.zzb(zzaco0, zzadj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzuz
    public final long zzb() {
        return this.zzc == null ? -1L : this.zzc.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzuz
    public final void zzc() {
        zzacn zzacn0 = this.zzb;
        if(zzacn0 != null && zzacn0 instanceof zzahs) {
            ((zzahs)zzacn0).zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzuz
    public final void zzd(zzl zzl0, Uri uri0, Map map0, long v, long v1, zzacq zzacq0) throws IOException {
        boolean z1;
        zzacc zzacc0 = new zzacc(zzl0, v, v1);
        this.zzc = zzacc0;
        if(this.zzb != null) {
            return;
        }
        zzacn[] arr_zzacn = this.zza.zza(uri0, map0);
        zzfxk zzfxk0 = zzfxn.zzi(arr_zzacn.length);
        boolean z = false;
        if(arr_zzacn.length == 1) {
            this.zzb = arr_zzacn[0];
            this.zzb.zze(zzacq0);
            return;
        }
        int v2 = 0;
        while(v2 < arr_zzacn.length) {
            zzacn zzacn0 = arr_zzacn[v2];
            try {
                if(zzacn0.zzi(zzacc0)) {
                    this.zzb = zzacn0;
                    goto label_15;
                }
                goto label_18;
            }
            catch(EOFException unused_ex) {
                z1 = this.zzb == null && zzacc0.zzf() != v ? false : true;
                goto label_32;
            }
            catch(Throwable throwable0) {
                goto label_26;
            }
        label_15:
            zzcw.zzf(true);
            zzacc0.zzj();
            break;
            try {
            label_18:
                zzfxk0.zzh(zzacn0.zzd());
            }
            catch(EOFException unused_ex) {
                z1 = this.zzb == null && zzacc0.zzf() != v ? false : true;
                goto label_32;
            }
            catch(Throwable throwable0) {
            label_26:
                if(this.zzb != null || zzacc0.zzf() == v) {
                    z = true;
                }
                zzcw.zzf(z);
                zzacc0.zzj();
                throw throwable0;
            }
            z1 = this.zzb != null || zzacc0.zzf() == v;
        label_32:
            zzcw.zzf(z1);
            zzacc0.zzj();
            ++v2;
        }
        if(this.zzb != null) {
            this.zzb.zze(zzacq0);
            return;
        }
        Iterator iterator0 = zzfyd.zzb(zzfxn.zzm(arr_zzacn), new zzth()).iterator();
        StringBuilder stringBuilder0 = new StringBuilder();
        zzfuf.zzc(stringBuilder0, iterator0, ", ");
        throw new zzwk("None of the available extractors (" + stringBuilder0.toString() + ") could read the stream.", uri0, zzfxk0.zzi());
    }

    @Override  // com.google.android.gms.internal.ads.zzuz
    public final void zze() {
        if(this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzuz
    public final void zzf(long v, long v1) {
        zzacn zzacn0 = this.zzb;
        zzacn0.getClass();
        zzacn0.zzf(v, v1);
    }
}

