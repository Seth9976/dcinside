package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import o3.j;
import org.json.JSONException;
import org.json.JSONObject;

@j
public final class zzbcj implements SharedPreferences.OnSharedPreferenceChangeListener {
    @VisibleForTesting
    volatile boolean zza;
    private final Object zzb;
    private final ConditionVariable zzc;
    private volatile boolean zzd;
    @Nullable
    private SharedPreferences zze;
    private Bundle zzf;
    private Context zzg;
    private JSONObject zzh;
    private boolean zzi;
    private boolean zzj;

    public zzbcj() {
        this.zzb = new Object();
        this.zzc = new ConditionVariable();
        this.zzd = false;
        this.zza = false;
        this.zze = null;
        this.zzf = new Bundle();
        this.zzh = new JSONObject();
        this.zzi = false;
        this.zzj = false;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        if("flag_configuration".equals(s)) {
            this.zzg(sharedPreferences0);
        }
    }

    public final Object zza(zzbcc zzbcc0) {
        if(!this.zzc.block(5000L)) {
            Object object0 = this.zzb;
            synchronized(object0) {
                if(this.zza) {
                    goto label_11;
                }
            }
            throw new IllegalStateException("Flags.initialize() was not called!");
        }
    label_11:
        if(!this.zzd || this.zze == null || this.zzj) {
            synchronized(this.zzb) {
                if(this.zzd && this.zze != null && !this.zzj) {
                    goto label_19;
                }
            }
            return zzbcc0.zzk();
        }
    label_19:
        switch(zzbcc0.zze()) {
            case 1: {
                return this.zzh.has(zzbcc0.zzl()) ? zzbcc0.zza(this.zzh) : zzbcn.zza(() -> zzbcc0.zzc(this.zze));
            }
            case 2: {
                return this.zzf == null ? zzbcc0.zzk() : zzbcc0.zzb(this.zzf);
            }
            default: {
                return zzbcn.zza(() -> zzbcc0.zzc(this.zze));
            }
        }
    }

    // 去混淆评级： 低(20)
    public final Object zzb(zzbcc zzbcc0) {
        return this.zzd || this.zza ? this.zza(zzbcc0) : zzbcc0.zzk();
    }

    // 检测为 Lambda 实现
    final Object zzc(zzbcc zzbcc0) [...]

    public final void zzd(Context context0) {
        Context context1;
        if(this.zzd) {
            return;
        }
        synchronized(this.zzb) {
            if(this.zzd) {
                return;
            }
            if(!this.zza) {
                this.zza = true;
            }
            this.zzi = TextUtils.equals("com.dcinside.app.android", "com.google.android.gms");
            if(context0.getApplicationContext() != null) {
                context0 = context0.getApplicationContext();
            }
            try {
                this.zzg = context0;
                this.zzf = Wrappers.packageManager(context0).getApplicationInfo("com.dcinside.app.android", 0x80).metaData;
            }
            catch(PackageManager.NameNotFoundException | NullPointerException unused_ex) {
            }
            try {
                context1 = this.zzg;
                Context context2 = GooglePlayServicesUtilLight.getRemoteContext(context1);
                if(context2 != null || context1 == null) {
                    context1 = context2;
                }
                else {
                    context2 = context1.getApplicationContext();
                    if(context2 != null) {
                        context1 = context2;
                    }
                }
                SharedPreferences sharedPreferences0 = context1 == null ? null : zzbce.zza(context1);
                if(sharedPreferences0 != null) {
                    zzbfc.zzc(new zzbci(this, sharedPreferences0));
                }
                if(this.zzi || (((long)(((Long)zzbed.zzd.zze()))) <= 0L || ((long)zzbbv.zza(this.zzg)) < ((long)(((Long)zzbed.zzd.zze()))))) {
                    if(this.zzi || (((long)(((Long)zzbed.zzf.zze()))) <= 0L || ((long)zzbbv.zzb(this.zzg)) < ((long)(((Long)zzbed.zzf.zze()))))) {
                        Context context3 = this.zzg;
                        if(((Boolean)zzbel.zzg.zze()).booleanValue()) {
                            context1 = this.zzg;
                        }
                        else if(((Boolean)zzbel.zzh.zze()).booleanValue()) {
                            SharedPreferences sharedPreferences1 = context3.getSharedPreferences("admob", 0);
                            if(sharedPreferences1 != null) {
                                String s = (String)zzbcn.zza(new zzbcf(sharedPreferences1));
                                try {
                                    if(new JSONObject(s).optBoolean("local_flags_enabled")) {
                                        context1 = this.zzg;
                                    }
                                }
                                catch(JSONException unused_ex) {
                                }
                            }
                        }
                        goto label_40;
                    }
                    goto label_56;
                }
                this.zzj = true;
                this.zzd = true;
                goto label_70;
            }
            catch(Throwable throwable0) {
                this.zza = false;
                this.zzc.open();
                throw throwable0;
            }
        label_40:
            if(context1 == null) {
                this.zza = false;
                this.zzc.open();
                return;
            }
            try {
                this.zze = zzbce.zza(context1);
                if(!((Boolean)zzbel.zza.zze()).booleanValue()) {
                    SharedPreferences sharedPreferences2 = this.zze;
                    if(sharedPreferences2 != null) {
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                    }
                }
                this.zzg(this.zze);
                this.zzd = true;
            }
            catch(Throwable throwable0) {
                this.zza = false;
                this.zzc.open();
                throw throwable0;
            }
            this.zza = false;
            this.zzc.open();
            return;
            try {
            label_56:
                this.zzj = true;
                this.zzd = true;
            }
            catch(Throwable throwable0) {
                this.zza = false;
                this.zzc.open();
                throw throwable0;
            }
            this.zza = false;
            this.zzc.open();
            return;
            try {
                this.zzj = true;
                this.zzd = true;
            }
            catch(Throwable throwable0) {
                this.zza = false;
                this.zzc.open();
                throw throwable0;
            }
        label_70:
            this.zza = false;
            this.zzc.open();
        }
    }

    public final boolean zze() {
        return this.zzj;
    }

    final boolean zzf() {
        return this.zzi;
    }

    private final void zzg(SharedPreferences sharedPreferences0) {
        if(sharedPreferences0 == null) {
            return;
        }
        try {
            this.zzh = new JSONObject(((String)zzbcn.zza(new zzbcg(sharedPreferences0))));
        }
        catch(JSONException unused_ex) {
        }
    }
}

