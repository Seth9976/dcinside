package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.UiThread;
import j..util.Objects;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

final class zzca implements zzd {
    private final Application zza;
    private final zzbw zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzan zzf;
    private final zzbb zzg;
    private final zzap zzh;

    zzca(Application application0, zzbw zzbw0, Handler handler0, Executor executor0, zze zze0, zzan zzan0, zzbb zzbb0, zzap zzap0) {
        this.zza = application0;
        this.zzb = zzbw0;
        this.zzc = handler0;
        this.zzd = executor0;
        this.zze = zze0;
        this.zzf = zzan0;
        this.zzg = zzbb0;
        this.zzh = zzap0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        Objects.requireNonNull(this.zzc);
        return new zzby(this.zzc);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzd
    @UiThread
    public final boolean zzb(String s, JSONObject jSONObject0) {
        int v = -1;
        switch(s) {
            case "browser": {
                this.zzg(jSONObject0);
                return true;
            }
            case "configure_app_assets": {
                this.zzc();
                return true;
            }
            case "dismiss": {
                switch(jSONObject0.optString("status")) {
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS": {
                        v = 3;
                        break;
                    }
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS": {
                        v = 1;
                        break;
                    }
                    case "CONSENT_SIGNAL_SUFFICIENT": {
                        v = 4;
                        break;
                    }
                    case "non_personalized": {
                        v = 2;
                        break;
                    }
                    case "personalized": {
                        v = 0;
                    }
                }
                if(v != 0 && v != 1 && v != 2 && v != 3 && v != 4) {
                    zzg zzg0 = new zzg(1, "We are getting something wrong with the webview.");
                    this.zzg.zzh(zzg0);
                    return true;
                }
                this.zzg.zzg(3);
                return true;
            }
            case "load_complete": {
                this.zzg.zzi();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @UiThread
    public final void zzc() {
        zzbz zzbz0 = () -> {
            String s;
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("app_name", this.zza.getPackageManager().getApplicationLabel(this.zza.getApplicationInfo()).toString());
                Drawable drawable0 = this.zza.getPackageManager().getApplicationIcon(this.zza.getApplicationInfo());
                if(drawable0 == null) {
                    s = null;
                }
                else {
                    Bitmap bitmap0 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas0 = new Canvas(bitmap0);
                    drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
                    drawable0.draw(canvas0);
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    bitmap0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
                    s = "data:image/png;base64," + Base64.encodeToString(byteArrayOutputStream0.toByteArray(), 2);
                }
                jSONObject0.put("app_icon", s);
                JSONObject jSONObject1 = new JSONObject();
                for(Object object0: this.zzh.zzc().keySet()) {
                    jSONObject1.put(((String)object0), this.zzh.zzc().get(((String)object0)));
                }
                jSONObject0.put("stored_infos_map", jSONObject1);
            }
            catch(JSONException unused_ex) {
            }
            this.zzg.zzc().zzd("UMP_configureFormWithAppAssets", jSONObject0.toString());
        };
        this.zzd.execute(zzbz0);
    }

    // 检测为 Lambda 实现
    final void zzd() [...]

    final void zze(String s) {
        Log.d("UserMessagingPlatform", "Receive consent action: " + s);
        Uri uri0 = Uri.parse(s);
        String s1 = uri0.getQueryParameter("action");
        String s2 = uri0.getQueryParameter("args");
        this.zze.zzb(s1, s2, new zzd[]{this, this.zzf});
    }

    final void zzf(int v, String s, String s1) {
        zzg zzg0 = new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", v, s1, s));
        this.zzg.zzj(zzg0);
    }

    @UiThread
    private final void zzg(JSONObject jSONObject0) {
        String s = jSONObject0.optString("url");
        if(TextUtils.isEmpty(s)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri uri0 = Uri.parse(s);
        if(uri0.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: " + s);
        }
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
            this.zzb.startActivity(intent0);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: " + s, activityNotFoundException0);
        }
    }
}

