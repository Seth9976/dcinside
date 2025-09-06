package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import j..util.Objects;

public final class zzecl implements zzecm {
    // 去混淆评级： 低(40)
    @Override  // com.google.android.gms.internal.ads.zzecm
    @Nullable
    public final zzecr zza(String s, WebView webView0, String s1, String s2, @Nullable String s3, zzeco zzeco0, zzecn zzecn0, @Nullable String s4) {
        return !((Boolean)zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() || true ? null : ((zzecr)zzecl.zzq(() -> {
            zzflc zzflc0 = zzflc.zza("Google", s);
            zzflb zzflb0 = zzecl.zzp("javascript");
            zzfku zzfku0 = zzecl.zzn(zzecn0.toString());
            zzflb zzflb1 = zzflb.zzc;
            if(zzflb0 == zzflb1) {
                zzo.zzj("Omid html session error; Unable to parse impression owner: javascript");
                return null;
            }
            if(zzfku0 == null) {
                zzo.zzj(("Omid html session error; Unable to parse creative type: " + zzecn0));
                return null;
            }
            zzflb zzflb2 = zzecl.zzp(s3);
            if(zzfku0 == zzfku.zzd && zzflb2 == zzflb1) {
                zzo.zzj(("Omid html session error; Video events owner unknown for video creative: " + s3));
                return null;
            }
            zzfkr zzfkr0 = zzfkr.zzb(zzflc0, webView0, s4, "");
            return new zzecr(zzfkp.zza(zzfkq.zza(zzfku0, zzecl.zzo(zzeco0.toString()), zzflb0, zzflb2, true), zzfkr0), zzfkr0);
        }));
    }

    // 去混淆评级： 低(40)
    @Override  // com.google.android.gms.internal.ads.zzecm
    @Nullable
    public final zzecr zzb(String s, WebView webView0, String s1, String s2, @Nullable String s3, String s4, zzeco zzeco0, zzecn zzecn0, @Nullable String s5) {
        return !((Boolean)zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() || true ? null : ((zzecr)zzecl.zzq(() -> {
            zzflc zzflc0 = zzflc.zza(s4, s);
            zzflb zzflb0 = zzecl.zzp("javascript");
            zzflb zzflb1 = zzecl.zzp(s3);
            zzfku zzfku0 = zzecl.zzn(zzecn0.toString());
            zzflb zzflb2 = zzflb.zzc;
            if(zzflb0 == zzflb2) {
                zzo.zzj("Omid js session error; Unable to parse impression owner: javascript");
                return null;
            }
            if(zzfku0 == null) {
                zzo.zzj(("Omid js session error; Unable to parse creative type: " + zzecn0));
                return null;
            }
            if(zzfku0 == zzfku.zzd && zzflb1 == zzflb2) {
                zzo.zzj(("Omid js session error; Video events owner unknown for video creative: " + s3));
                return null;
            }
            zzfkr zzfkr0 = zzfkr.zzc(zzflc0, webView0, s5, "");
            return new zzecr(zzfkp.zza(zzfkq.zza(zzfku0, zzecl.zzo(zzeco0.toString()), zzflb0, zzflb1, true), zzfkr0), zzfkr0);
        }));
    }

    // 检测为 Lambda 实现
    static zzecr zzc(String s, String s1, String s2, zzecn zzecn0, String s3, WebView webView0, String s4, String s5, zzeco zzeco0) [...]

    // 检测为 Lambda 实现
    static zzecr zzd(String s, String s1, String s2, String s3, zzecn zzecn0, WebView webView0, String s4, String s5, zzeco zzeco0) [...]

    @Override  // com.google.android.gms.internal.ads.zzecm
    @Nullable
    public final zzfla zze(VersionInfoParcel versionInfoParcel0, WebView webView0, boolean z) {
        return (zzfla)zzecl.zzq(new zzeci(versionInfoParcel0, webView0, true));
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzecm
    @Nullable
    public final String zzf(Context context0) {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() ? "a.1.5.2-google_20241009" : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzecm
    public final void zzg(zzfkp zzfkp0, View view0) {
        zzecl.zzr(new zzebz(zzfkp0, view0));
    }

    @Override  // com.google.android.gms.internal.ads.zzecm
    public final void zzh(zzfla zzfla0, View view0) {
        zzecl.zzr(new zzecf(zzfla0, view0));
    }

    @Override  // com.google.android.gms.internal.ads.zzecm
    public final void zzi(zzfkp zzfkp0) {
        zzecl.zzr(new zzecj(zzfkp0));
    }

    @Override  // com.google.android.gms.internal.ads.zzecm
    public final void zzj(zzfkp zzfkp0, View view0) {
        zzecl.zzr(new zzecb(zzfkp0, view0));
    }

    @Override  // com.google.android.gms.internal.ads.zzecm
    public final void zzk(zzfkp zzfkp0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && false) {
            Objects.requireNonNull(zzfkp0);
            zzecl.zzr(new zzecc(zzfkp0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzecm
    public final boolean zzl(Context context0) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzfc)).booleanValue()) {
            zzo.zzj("Omid flag is disabled");
            return false;
        }
        Boolean boolean0 = (Boolean)zzecl.zzq(new zzece(context0));
        return boolean0 != null && boolean0.booleanValue();
    }

    @Override  // com.google.android.gms.internal.ads.zzecm
    public final void zzm(zzfla zzfla0, zzcfo zzcfo0) {
        zzecl.zzr(new zzech(zzfla0, zzcfo0));
    }

    @Nullable
    private static zzfku zzn(String s) {
        switch(s) {
            case "htmlDisplay": {
                return zzfku.zzb;
            }
            case "nativeDisplay": {
                return zzfku.zzc;
            }
            case "video": {
                return zzfku.zzd;
            }
            default: {
                return null;
            }
        }
    }

    private static zzfkx zzo(String s) {
        switch(s) {
            case "beginToRender": {
                return zzfkx.zzd;
            }
            case "definedByJavascript": {
                return zzfkx.zza;
            }
            case "onePixel": {
                return zzfkx.zze;
            }
            default: {
                return zzfkx.zzb;
            }
        }
    }

    private static zzflb zzp(@Nullable String s) {
        if("native".equals(s)) {
            return zzflb.zza;
        }
        return "javascript".equals(s) ? zzflb.zzb : zzflb.zzc;
    }

    @Nullable
    private static final Object zzq(zzeck zzeck0) {
        try {
            return zzeck0.zza();
        }
        catch(RuntimeException runtimeException0) {
            zzv.zzp().zzv(runtimeException0, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable0) {
        try {
            runnable0.run();
        }
        catch(RuntimeException runtimeException0) {
            zzv.zzp().zzv(runtimeException0, "omid exception");
        }
    }
}

