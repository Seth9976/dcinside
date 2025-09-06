package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public final class zzbbj {
    private final zzbbp zza;
    private final zzbbq.zzt.zza zzb;
    private final boolean zzc;

    private zzbbj() {
        this.zzb = zzbbq.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbbp();
    }

    public zzbbj(zzbbp zzbbp0) {
        this.zzb = zzbbq.zzt.zzj();
        this.zza = zzbbp0;
        this.zzc = ((Boolean)zzbe.zzc().zza(zzbcl.zzeW)).booleanValue();
    }

    public static zzbbj zza() {
        return new zzbbj();
    }

    public final void zzb(zzbbi zzbbi0) {
        synchronized(this) {
            if(this.zzc) {
                try {
                    zzbbi0.zza(this.zzb);
                }
                catch(NullPointerException nullPointerException0) {
                    zzv.zzp().zzw(nullPointerException0, "AdMobClearcutLogger.modify");
                }
            }
        }
    }

    public final void zzc(int v) {
        synchronized(this) {
            if(!this.zzc) {
                return;
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzeX)).booleanValue()) {
                this.zze(v);
                return;
            }
            this.zzf(v);
        }
    }

    private final String zzd(int v) {
        Object[] arr_object;
        synchronized(this) {
            arr_object = new Object[]{this.zzb.zzah(), zzv.zzC().elapsedRealtime(), ((int)(v - 1)), Base64.encodeToString(((zzbbq.zzt)this.zzb.zzbn()).zzaV(), 3)};
        }
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", arr_object);
    }

    private final void zze(int v) {
        FileOutputStream fileOutputStream0;
        synchronized(this) {
            File file0 = Environment.getExternalStorageDirectory();
            if(file0 == null) {
                return;
            }
            File file1 = new File(zzfpv.zza(zzfpu.zza(), file0, "clearcut_events.txt"));
            try {
                fileOutputStream0 = new FileOutputStream(file1, true);
            }
            catch(FileNotFoundException unused_ex) {
                zze.zza("Could not find file for Clearcut");
                return;
            }
            try {
                try {
                    fileOutputStream0.write(this.zzd(v).getBytes());
                    goto label_25;
                }
                catch(IOException unused_ex) {
                }
                zze.zza("Could not write Clearcut to file.");
            }
            catch(Throwable throwable0) {
                goto label_20;
            }
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
                try {
                    zze.zza("Could not close Clearcut output stream.");
                }
                catch(FileNotFoundException unused_ex) {
                    zze.zza("Could not find file for Clearcut");
                }
            }
            return;
            try {
            label_20:
                fileOutputStream0.close();
                throw throwable0;
            }
            catch(IOException unused_ex) {
                try {
                    zze.zza("Could not close Clearcut output stream.");
                    throw throwable0;
                }
                catch(FileNotFoundException unused_ex) {
                    zze.zza("Could not find file for Clearcut");
                    return;
                }
            }
            try {
            label_25:
                fileOutputStream0.close();
                return;
            }
            catch(IOException unused_ex) {
                try {
                    zze.zza("Could not close Clearcut output stream.");
                    return;
                }
                catch(FileNotFoundException unused_ex) {
                }
            }
            zze.zza("Could not find file for Clearcut");
        }
    }

    private final void zzf(int v) {
        synchronized(this) {
            this.zzb.zzq();
            List list0 = zzs.zzd();
            this.zzb.zzj(list0);
            byte[] arr_b = ((zzbbq.zzt)this.zzb.zzbn()).zzaV();
            zzbbn zzbbn0 = new zzbbn(this.zza, arr_b, null);
            zzbbn0.zza(v - 1);
            zzbbn0.zzc();
            zze.zza(("Logging Event with event code : " + Integer.toString(v - 1, 10)));
        }
    }
}

