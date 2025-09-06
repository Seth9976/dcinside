package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzduu;
import com.google.android.gms.internal.ads.zzduv;
import com.google.common.util.concurrent.t0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzay {
    @VisibleForTesting
    protected String zza;
    private final Object zzb;
    private String zzc;
    private String zzd;
    private boolean zze;
    private boolean zzf;
    private zzduv zzg;

    public zzay() {
        this.zzb = new Object();
        this.zzc = "";
        this.zzd = "";
        this.zze = false;
        this.zzf = false;
        this.zza = "";
    }

    public final zzduv zza() {
        return this.zzg;
    }

    public final String zzb() [...] // 潜在的解密器

    public final void zzc(Context context0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
            zzduv zzduv0 = this.zzg;
            if(zzduv0 != null) {
                zzduv0.zzh(new zzav(this, context0), zzduu.zzd);
            }
        }
    }

    public final void zzd(Context context0, String s, String s1) {
        zzs.zzU(context0, this.zzp(context0, ((String)zzbe.zzc().zza(zzbcl.zzeK)), s, s1));
    }

    public final void zze(Context context0, String s, String s1, String s2) {
        Uri.Builder uri$Builder0 = this.zzp(context0, ((String)zzbe.zzc().zza(zzbcl.zzeN)), s2, s).buildUpon();
        uri$Builder0.appendQueryParameter("debugData", s1);
        zzs.zzM(context0, s, uri$Builder0.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized(this.zzb) {
            this.zzf = z;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                zzv.zzp().zzi().zzx(z);
                zzduv zzduv0 = this.zzg;
                if(zzduv0 != null) {
                    zzduv0.zzl(z);
                }
            }
        }
    }

    public final void zzg(zzduv zzduv0) {
        this.zzg = zzduv0;
    }

    public final void zzh(boolean z) {
        synchronized(this.zzb) {
            this.zze = z;
        }
    }

    @VisibleForTesting
    protected final void zzi(Context context0, String s, boolean z, boolean z1) {
        if(!(context0 instanceof Activity)) {
            zzo.zzi("Can not create dialog without Activity Context");
            return;
        }
        zzax zzax0 = new zzax(this, context0, s, z, z1);
        zzs.zza.post(zzax0);
    }

    public final boolean zzj(Context context0, String s, String s1) {
        String s4;
        String s2 = zzay.zzo(context0, this.zzp(context0, ((String)zzbe.zzc().zza(zzbcl.zzeM)), s, s1).toString(), s1);
        if(TextUtils.isEmpty(s2)) {
            zzo.zze("Not linked for debug signals.");
            return false;
        }
        String s3 = s2.trim();
        try {
            s4 = new JSONObject(s3).optString("debug_mode");
        }
        catch(JSONException jSONException0) {
            zzo.zzk("Fail to get debug mode response json.", jSONException0);
            return false;
        }
        boolean z = "1".equals(s4);
        this.zzf(z);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
            zzg zzg0 = zzv.zzp().zzi();
            if(!z) {
                s = "";
            }
            zzg0.zzw(s);
        }
        return z;
    }

    @VisibleForTesting
    final boolean zzk(Context context0, String s, String s1) {
        String s4;
        String s2 = zzay.zzo(context0, this.zzp(context0, ((String)zzbe.zzc().zza(zzbcl.zzeL)), s, s1).toString(), s1);
        if(TextUtils.isEmpty(s2)) {
            zzo.zze("Not linked for in app preview.");
            return false;
        }
        String s3 = s2.trim();
        try {
            JSONObject jSONObject0 = new JSONObject(s3);
            s4 = jSONObject0.optString("gct");
            this.zza = jSONObject0.optString("status");
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                boolean z = "0".equals(this.zza) || "2".equals(this.zza);
                this.zzf(z);
                zzg zzg0 = zzv.zzp().zzi();
                if(!z) {
                    s = "";
                }
                zzg0.zzw(s);
            }
        }
        catch(JSONException jSONException0) {
            zzo.zzk("Fail to get in app preview response json.", jSONException0);
            return false;
        }
        synchronized(this.zzb) {
            this.zzd = s4;
        }
        return true;
    }

    public final boolean zzl() {
        synchronized(this.zzb) {
        }
        return this.zzf;
    }

    public final boolean zzm() {
        synchronized(this.zzb) {
        }
        return this.zze;
    }

    public final boolean zzn(Context context0, String s, String s1, String s2) {
        if(!TextUtils.isEmpty(s1) && this.zzm()) {
            zzo.zze("Sending troubleshooting signals to the server.");
            this.zze(context0, s, s1, s2);
            return true;
        }
        return false;
    }

    @Nullable
    @VisibleForTesting
    protected static final String zzo(Context context0, String s, String s1) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("User-Agent", zzv.zzq().zzc(context0, s1));
        t0 t00 = new zzbo(context0).zzb(0, s, hashMap0, null);
        try {
            return (String)t00.get(((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzeO)))))), TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException timeoutException0) {
            zzo.zzh(("Timeout while retrieving a response from: " + s), timeoutException0);
            t00.cancel(true);
            return null;
        }
        catch(InterruptedException interruptedException0) {
            zzo.zzh(("Interrupted while retrieving a response from: " + s), interruptedException0);
            t00.cancel(true);
            return null;
        }
        catch(Exception exception0) {
            zzo.zzh(("Error retrieving a response from: " + s), exception0);
            return null;
        }
    }

    private final Uri zzp(Context context0, String s, String s1, String s2) {
        String s3;
        Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
        synchronized(this.zzb) {
            if(TextUtils.isEmpty(this.zzc)) {
                try {
                    s3 = new String(IOUtils.readInputStreamFully(context0.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                }
                catch(IOException unused_ex) {
                    zzo.zze("Error reading from internal storage.");
                    s3 = "";
                }
                this.zzc = s3;
                if(TextUtils.isEmpty(s3)) {
                    try {
                        this.zzc = "6874a638-a73e-4ece-ac47-01272149ec2d";
                        FileOutputStream fileOutputStream0 = context0.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStream0.write("6874a638-a73e-4ece-ac47-01272149ec2d".getBytes("UTF-8"));
                        fileOutputStream0.close();
                    }
                    catch(Exception exception0) {
                        zzo.zzh("Error writing to file in internal storage.", exception0);
                    }
                }
            }
        }
        uri$Builder0.appendQueryParameter("linkedDeviceId", this.zzc);
        uri$Builder0.appendQueryParameter("adSlotPath", s1);
        uri$Builder0.appendQueryParameter("afmaVersion", s2);
        return uri$Builder0.build();
    }
}

