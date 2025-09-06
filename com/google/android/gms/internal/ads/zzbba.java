package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.IOException;

public final class zzbba implements Runnable {
    public final zzbbd zza;
    public final zzbau zzb;
    public final zzbav zzc;
    public final zzcab zzd;

    public zzbba(zzbbd zzbbd0, zzbau zzbau0, zzbav zzbav0, zzcab zzcab0) {
        this.zza = zzbbd0;
        this.zzb = zzbau0;
        this.zzc = zzbav0;
        this.zzd = zzcab0;
    }

    @Override
    public final void run() {
        zzcab zzcab0;
        zzbbd zzbbd0;
        try {
            zzbbd0 = this.zza;
            zzcab0 = this.zzd;
            zzbax zzbax0 = this.zzb.zzq();
            zzbas zzbas0 = this.zzb.zzp() ? zzbax0.zzg(this.zzc) : zzbax0.zzf(this.zzc);
            if(!zzbas0.zze()) {
                zzcab0.zzd(new RuntimeException("No entry contents."));
                zzbbf.zze(zzbbd0.zzc);
                return;
            }
            zzbbc zzbbc0 = new zzbbc(zzbbd0, zzbas0.zzc(), 1);
            int v = zzbbc0.read();
            if(v == -1) {
                throw new IOException("Unable to read from cache.");
            }
            zzbbc0.unread(v);
            zzcab0.zzc(zzbbh.zzb(zzbbc0, zzbas0.zzd(), zzbas0.zzg(), zzbas0.zza(), zzbas0.zzf()));
            return;
        }
        catch(IOException | RemoteException iOException0) {
        }
        zzo.zzh("Unable to obtain a cache service instance.", iOException0);
        zzcab0.zzd(iOException0);
        zzbbf.zze(zzbbd0.zzc);
    }
}

