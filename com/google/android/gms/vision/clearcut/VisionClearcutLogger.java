package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.internal.vision.zzfe;
import com.google.android.gms.internal.vision.zzfi.zzo.zza;
import com.google.android.gms.internal.vision.zzfi.zzo;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.vision.L;

@Keep
public class VisionClearcutLogger {
    private final ClearcutLogger zza;
    private boolean zzb;

    public VisionClearcutLogger(@RecentlyNonNull Context context0) {
        this.zzb = true;
        this.zza = new ClearcutLogger(context0, "VISION", null);
    }

    public final void zza(int v, zzo zzfi$zzo0) {
        zza zzfi$zzo$zza0;
        byte[] arr_b = zzfi$zzo0.zzh();
        if(v >= 0 && v <= 3) {
            try {
                if(this.zzb) {
                    this.zza.newEvent(arr_b).setEventCode(v).log();
                    return;
                }
                zzfi$zzo$zza0 = zzo.zza();
            }
            catch(Exception exception0) {
                zzfe.zza(exception0);
                L.e(exception0, "Failed to log", new Object[0]);
                return;
            }
            try {
                zzio zzio0 = zzio.zzc();
                zzfi$zzo$zza0.zza(arr_b, 0, arr_b.length, zzio0);
                L.e("Would have logged:\n%s", new Object[]{zzfi$zzo$zza0.toString()});
                return;
            }
            catch(Exception exception1) {
                try {
                    L.e(exception1, "Parsing error", new Object[0]);
                    return;
                }
                catch(Exception exception0) {
                }
            }
            zzfe.zza(exception0);
            L.e(exception0, "Failed to log", new Object[0]);
            return;
        }
        L.i("Illegal event code: %d", new Object[]{v});
    }
}

