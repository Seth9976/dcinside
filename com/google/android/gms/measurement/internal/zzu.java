package com.google.android.gms.measurement.internal;

import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;

public final class zzu {
    private final zzhy zza;

    public zzu(zzhy zzhy0) {
        this.zza = zzhy0;
    }

    @WorkerThread
    final void zza() {
        this.zza.zzl().zzt();
        if(!this.zzc()) {
            return;
        }
        if(this.zzd()) {
            this.zza.zzn().zzr.zza(null);
            Bundle bundle0 = new Bundle();
            bundle0.putString("source", "(not set)");
            bundle0.putString("medium", "(not set)");
            bundle0.putString("_cis", "intent");
            bundle0.putLong("_cc", 1L);
            this.zza.zzp().zzc("auto", "_cmpx", bundle0);
        }
        else {
            String s = this.zza.zzn().zzr.zza();
            if(TextUtils.isEmpty(s)) {
                this.zza.zzj().zzn().zza("Cache still valid but referrer not found");
            }
            else {
                long v = this.zza.zzn().zzs.zza();
                Uri uri0 = Uri.parse(s);
                Bundle bundle1 = new Bundle();
                Pair pair0 = new Pair(uri0.getPath(), bundle1);
                for(Object object0: uri0.getQueryParameterNames()) {
                    bundle1.putString(((String)object0), uri0.getQueryParameter(((String)object0)));
                }
                ((Bundle)pair0.second).putLong("_cc", (v / 3600000L - 1L) * 3600000L);
                String s1 = pair0.first == null ? "app" : ((String)pair0.first);
                this.zza.zzp().zzc(s1, "_cmp", ((Bundle)pair0.second));
            }
            this.zza.zzn().zzr.zza(null);
        }
        this.zza.zzn().zzs.zza(0L);
    }

    @WorkerThread
    final void zza(String s, Bundle bundle0) {
        CharSequence charSequence0;
        this.zza.zzl().zzt();
        if(!this.zza.zzac()) {
            if(bundle0 == null || bundle0.isEmpty()) {
                charSequence0 = null;
            }
            else {
                if(s == null || s.isEmpty()) {
                    s = "auto";
                }
                Uri.Builder uri$Builder0 = new Uri.Builder();
                uri$Builder0.path(s);
                for(Object object0: bundle0.keySet()) {
                    uri$Builder0.appendQueryParameter(((String)object0), bundle0.getString(((String)object0)));
                }
                charSequence0 = uri$Builder0.build().toString();
            }
            if(!TextUtils.isEmpty(charSequence0)) {
                this.zza.zzn().zzr.zza(((String)charSequence0));
                zzha zzha0 = this.zza.zzn();
                long v = this.zza.zzb().currentTimeMillis();
                zzha0.zzs.zza(v);
            }
        }
    }

    final void zzb() {
        if(this.zzc() && this.zzd()) {
            this.zza.zzn().zzr.zza(null);
        }
    }

    private final boolean zzc() {
        return this.zza.zzn().zzs.zza() > 0L;
    }

    private final boolean zzd() {
        return this.zzc() ? this.zza.zzb().currentTimeMillis() - this.zza.zzn().zzs.zza() > this.zza.zzf().zzc(null, zzbh.zzav) : false;
    }
}

