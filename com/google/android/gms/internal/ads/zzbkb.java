package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.ObjectWrapper;
import j..util.Objects;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzbkb implements zzbjp {
    @Nullable
    private final zzb zza;
    @Nullable
    private final zzdrw zzb;
    private final zzu zzc;
    @Nullable
    private final zzbsc zzd;
    @Nullable
    private final zzebk zze;
    @Nullable
    private final zzcmk zzf;
    private zzaa zzg;
    private final zzgcs zzh;

    public zzbkb(zzb zzb0, zzbsc zzbsc0, zzebk zzebk0, zzdrw zzdrw0, zzcmk zzcmk0) {
        this.zzg = null;
        this.zzh = zzbzw.zzg;
        this.zza = zzb0;
        this.zzd = zzbsc0;
        this.zze = zzebk0;
        this.zzb = zzdrw0;
        this.zzc = new zzu(null);
        this.zzf = zzcmk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("u");
        Map map1 = new HashMap();
        if(((zzcex)(((zza)object0))).zzD() != null) {
            map1 = ((zzcex)(((zza)object0))).zzD().zzaw;
        }
        String s1 = zzbyk.zzc(s, ((zzcex)(((zza)object0))).getContext(), true, map1);
        String s2 = (String)map0.get("a");
        if(s2 == null) {
            zzo.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzb0 = this.zza;
        if(zzb0 != null && !zzb0.zzc()) {
            zzb0.zzb(s1);
            return;
        }
        zzgch.zzr((!((Boolean)zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() || this.zzf == null || !zzcmk.zzj(s1) ? zzgch.zzh(s1) : this.zzf.zzb(s1, zzbc.zze())), new zzbjx(this, map0, ((zza)object0), s2), this.zzh);
    }

    public static int zzb(Map map0) {
        String s = (String)map0.get("o");
        if(s != null) {
            if("p".equalsIgnoreCase(s)) {
                return 7;
            }
            if("l".equalsIgnoreCase(s)) {
                return 6;
            }
            return "c".equalsIgnoreCase(s) ? 14 : -1;
        }
        return -1;
    }

    @VisibleForTesting
    static Uri zzc(Context context0, zzava zzava0, Uri uri0, View view0, @Nullable Activity activity0, @Nullable zzfcn zzfcn0) {
        if(zzava0 == null) {
            return uri0;
        }
        try {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzlR)).booleanValue() && zzfcn0 != null) {
                if(zzava0.zze(uri0)) {
                    return zzfcn0.zza(uri0, context0, view0, activity0);
                }
            }
            else if(zzava0.zze(uri0)) {
                return zzava0.zza(uri0, context0, view0, activity0);
            }
            return uri0;
        }
        catch(zzavb unused_ex) {
            return uri0;
        }
        catch(Exception exception0) {
        }
        zzv.zzp().zzw(exception0, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        return uri0;
    }

    @VisibleForTesting
    static Uri zzd(Uri uri0) {
        try {
            if(uri0.getQueryParameter("aclk_ms") != null) {
                return uri0.buildUpon().appendQueryParameter("aclk_upms", "10114966").build();
            }
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            zzo.zzh(("Error adding click uptime parameter to url: " + uri0.toString()), unsupportedOperationException0);
        }
        return uri0;
    }

    public static boolean zzf(Map map0) {
        return "1".equals(map0.get("custom_close"));
    }

    private final void zzh(String s, zza zza0, Map map0, String s1) {
        String s5;
        boolean z7;
        HashMap hashMap1;
        boolean z6;
        String s2;
        boolean z1;
        zzcex zzcex0 = (zzcex)zza0;
        zzfbo zzfbo0 = zzcex0.zzD();
        zzfbr zzfbr0 = zzcex0.zzR();
        boolean z = false;
        if(zzfbo0 == null || zzfbr0 == null) {
            s2 = "";
            z1 = false;
        }
        else {
            z1 = zzfbo0.zzb();
            s2 = zzfbr0.zzb;
        }
        boolean z2 = !((Boolean)zzbe.zzc().zza(zzbcl.zzkC)).booleanValue() || !map0.containsKey("sc") || !((String)map0.get("sc")).equals("0");
        boolean z3 = ((Boolean)zzbe.zzc().zza(zzbcl.zzmC)).booleanValue() && map0.containsKey("ig_cl") && ((String)map0.get("ig_cl")).equals("true");
        Intent intent0 = null;
        if("expand".equalsIgnoreCase(s1)) {
            if(zzcex0.zzaF()) {
                zzo.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            this.zzk(false);
            ((zzcgh)zza0).zzaL(zzbkb.zzf(map0), zzbkb.zzb(map0), z2);
            return;
        }
        if("webapp".equalsIgnoreCase(s1)) {
            this.zzk(false);
            boolean z4 = ((Boolean)zzbe.zzc().zza(zzbcl.zzlM)).booleanValue() && Objects.equals(map0.get("is_allowed_for_lock_screen"), "1");
            if(s != null) {
                ((zzcgh)zza0).zzaN(zzbkb.zzf(map0), zzbkb.zzb(map0), s, z2, z4);
                return;
            }
            ((zzcgh)zza0).zzaM(zzbkb.zzf(map0), zzbkb.zzb(map0), ((String)map0.get("html")), ((String)map0.get("baseurl")), z2);
            return;
        }
        if("chrome_custom_tab".equalsIgnoreCase(s1)) {
            Context context0 = zzcex0.getContext();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzeI)).booleanValue()) {
                zze.zza("User opt out chrome custom tab.");
                this.zzm(10);
                map0.put("use_first_package", "true");
                map0.put("use_running_process", "true");
                this.zzj(zza0, map0, z1, s2, z2, z3);
                return;
            }
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzeG)).booleanValue()) {
                z = zzbdm.zzg(context0);
            }
            else if(CustomTabsClient.h(context0, null) != null) {
                z = true;
            }
            if(!z) {
                this.zzm(4);
                map0.put("use_first_package", "true");
                map0.put("use_running_process", "true");
                this.zzj(zza0, map0, z1, s2, z2, z3);
                return;
            }
            this.zzk(true);
            if(TextUtils.isEmpty(s)) {
                zzo.zzj("Cannot open browser with null or empty url");
                this.zzm(7);
                return;
            }
            Uri uri0 = Uri.parse(s);
            Uri uri1 = zzbkb.zzd(zzbkb.zzc(zzcex0.getContext(), zzcex0.zzI(), uri0, zzcex0.zzF(), zzcex0.zzi(), zzcex0.zzS()));
            if(z1 && this.zze != null && this.zzl(zza0, zzcex0.getContext(), uri1.toString(), s2)) {
                return;
            }
            this.zzg = new zzbjy(this);
            ((zzcgh)zza0).zzaJ(new zzc(null, uri1.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z2, z3, s2);
            return;
        }
        if("app".equalsIgnoreCase(s1) && "true".equalsIgnoreCase(((String)map0.get("system_browser")))) {
            this.zzj(zza0, map0, z1, s2, z2, z3);
            return;
        }
        if("open_app".equalsIgnoreCase(s1)) {
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzid)).booleanValue()) {
                return;
            }
            this.zzk(true);
            String s3 = (String)map0.get("p");
            if(s3 == null) {
                zzo.zzj("Package name missing from open app action.");
                return;
            }
            if(z1 && this.zze != null && this.zzl(zza0, zzcex0.getContext(), s3, s2)) {
                return;
            }
            PackageManager packageManager0 = zzcex0.getContext().getPackageManager();
            if(packageManager0 == null) {
                zzo.zzj("Cannot get package manager from open app action.");
                return;
            }
            Intent intent1 = packageManager0.getLaunchIntentForPackage(s3);
            if(intent1 == null) {
                return;
            }
            ((zzcgh)zza0).zzaJ(new zzc(intent1, this.zzg), z2, z3, s2);
            return;
        }
        this.zzk(true);
        String s4 = (String)map0.get("intent_url");
        if(!TextUtils.isEmpty(s4)) {
            try {
                intent0 = Intent.parseUri(s4, 0);
            }
            catch(URISyntaxException uRISyntaxException0) {
                zzo.zzh(("Error parsing the url: " + s4), uRISyntaxException0);
            }
        }
        if(intent0 != null && intent0.getData() != null) {
            Uri uri2 = intent0.getData();
            if(!Uri.EMPTY.equals(uri2)) {
                Uri uri3 = zzbkb.zzd(zzbkb.zzc(zzcex0.getContext(), zzcex0.zzI(), uri2, zzcex0.zzF(), zzcex0.zzi(), zzcex0.zzS()));
                if(TextUtils.isEmpty(intent0.getType()) || !((Boolean)zzbe.zzc().zza(zzbcl.zzie)).booleanValue()) {
                    intent0.setData(uri3);
                }
                else {
                    intent0.setDataAndType(uri3, intent0.getType());
                }
            }
        }
        boolean z5 = ((Boolean)zzbe.zzc().zza(zzbcl.zziz)).booleanValue() && "intent_async".equalsIgnoreCase(s1) && map0.containsKey("event_id");
        HashMap hashMap0 = new HashMap();
        if(z5) {
            z6 = z3;
            hashMap1 = hashMap0;
            this.zzg = new zzbjz(this, z2, zza0, hashMap0, map0);
            z7 = false;
        }
        else {
            z6 = z3;
            hashMap1 = hashMap0;
            z7 = z2;
        }
        if(intent0 != null) {
            if(z1 && this.zze != null && this.zzl(zza0, zzcex0.getContext(), intent0.getData().toString(), s2)) {
                if(!z5) {
                    return;
                }
                hashMap1.put(((String)map0.get("event_id")), Boolean.TRUE);
                ((zzbmk)zza0).zzd("openIntentAsync", hashMap1);
                return;
            }
            ((zzcgh)zza0).zzaJ(new zzc(intent0, this.zzg), z7, z6, s2);
            return;
        }
        if(TextUtils.isEmpty(s)) {
            s5 = s;
        }
        else {
            Uri uri4 = Uri.parse(s);
            s5 = zzbkb.zzd(zzbkb.zzc(zzcex0.getContext(), zzcex0.zzI(), uri4, zzcex0.zzF(), zzcex0.zzi(), zzcex0.zzS())).toString();
        }
        if(z1 && this.zze != null && this.zzl(zza0, zzcex0.getContext(), s5, s2)) {
            if(z5) {
                hashMap1.put(((String)map0.get("event_id")), Boolean.TRUE);
                ((zzbmk)zza0).zzd("openIntentAsync", hashMap1);
            }
            return;
        }
        ((zzcgh)zza0).zzaJ(new zzc(((String)map0.get("i")), s5, ((String)map0.get("m")), ((String)map0.get("p")), ((String)map0.get("c")), ((String)map0.get("f")), ((String)map0.get("e")), this.zzg), z7, z6, s2);
    }

    private final void zzi(Context context0, String s, String s1) {
        this.zze.zzc(s);
        zzdrw zzdrw0 = this.zzb;
        if(zzdrw0 != null) {
            zzfxq zzfxq0 = zzfxq.zze("dialog_not_shown_reason", s1);
            zzebv.zzd(context0, zzdrw0, this.zze, s, "dialog_not_shown", zzfxq0);
        }
    }

    private final void zzj(zza zza0, Map map0, boolean z, String s, boolean z1, boolean z2) {
        Intent intent2;
        boolean z3 = true;
        this.zzk(true);
        Context context0 = ((zzcex)zza0).getContext();
        zzava zzava0 = ((zzcex)zza0).zzI();
        View view0 = ((zzcex)zza0).zzF();
        zzfcn zzfcn0 = ((zzcex)zza0).zzS();
        Object object0 = context0.getSystemService("activity");
        String s1 = (String)map0.get("u");
        Uri uri0 = null;
        if(TextUtils.isEmpty(s1)) {
            intent2 = null;
        }
        else {
            Uri uri1 = zzbkb.zzd(zzbkb.zzc(context0, zzava0, Uri.parse(s1), view0, null, zzfcn0));
            boolean z4 = Boolean.parseBoolean(((String)map0.get("use_first_package")));
            boolean z5 = Boolean.parseBoolean(((String)map0.get("use_running_process")));
            if(!Boolean.parseBoolean(((String)map0.get("use_custom_tabs"))) && !((Boolean)zzbe.zzc().zza(zzbcl.zzeC)).booleanValue()) {
                z3 = false;
            }
            if("http".equalsIgnoreCase(uri1.getScheme())) {
                uri0 = uri1.buildUpon().scheme("https").build();
            }
            else if("https".equalsIgnoreCase(uri1.getScheme())) {
                uri0 = uri1.buildUpon().scheme("http").build();
            }
            ArrayList arrayList0 = new ArrayList();
            Intent intent0 = zzbka.zza(uri1, context0, zzava0, view0, zzfcn0);
            Intent intent1 = zzbka.zza(uri0, context0, zzava0, view0, zzfcn0);
            if(z3) {
                zzs.zzp(context0, intent0);
                zzs.zzp(context0, intent1);
            }
            ResolveInfo resolveInfo0 = zzbka.zzd(intent0, arrayList0, context0, zzava0, view0, zzfcn0);
            if(resolveInfo0 != null) {
                intent2 = zzbka.zzb(intent0, resolveInfo0, context0, zzava0, view0, zzfcn0);
            }
            else if(intent1 == null) {
            label_35:
                if(arrayList0.isEmpty()) {
                    intent2 = intent0;
                }
                else {
                    if(z5 && ((ActivityManager)object0) != null) {
                        List list0 = ((ActivityManager)object0).getRunningAppProcesses();
                        if(list0 != null) {
                            int v = arrayList0.size();
                            int v1 = 0;
                            while(v1 < v) {
                                ResolveInfo resolveInfo2 = (ResolveInfo)arrayList0.get(v1);
                                for(Object object1: list0) {
                                    if(!((ActivityManager.RunningAppProcessInfo)object1).processName.equals(resolveInfo2.activityInfo.packageName)) {
                                        continue;
                                    }
                                    intent2 = zzbka.zzb(intent0, resolveInfo2, context0, zzava0, view0, zzfcn0);
                                    goto label_59;
                                }
                                ++v1;
                            }
                        }
                    }
                    intent2 = z4 ? zzbka.zzb(intent0, ((ResolveInfo)arrayList0.get(0)), context0, zzava0, view0, zzfcn0) : intent0;
                }
            }
            else {
                ResolveInfo resolveInfo1 = zzbka.zzc(intent1, context0, zzava0, view0, zzfcn0);
                if(resolveInfo1 == null) {
                    goto label_35;
                }
                else {
                    intent2 = zzbka.zzb(intent0, resolveInfo1, context0, zzava0, view0, zzfcn0);
                    if(zzbka.zzc(intent2, context0, zzava0, view0, zzfcn0) == null) {
                        goto label_35;
                    }
                }
            }
        }
    label_59:
        if(z && this.zze != null && intent2 != null && this.zzl(zza0, ((zzcex)zza0).getContext(), intent2.getData().toString(), s)) {
            return;
        }
        try {
            ((zzcgh)zza0).zzaJ(new zzc(intent2, this.zzg), z1, z2, s);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            zzo.zzj(activityNotFoundException0.getMessage());
        }
    }

    private final void zzk(boolean z) {
        zzbsc zzbsc0 = this.zzd;
        if(zzbsc0 != null) {
            zzbsc0.zza(z);
        }
    }

    private final boolean zzl(zza zza0, Context context0, String s, String s1) {
        zzdrw zzdrw0 = this.zzb;
        if(zzdrw0 != null) {
            zzebv.zzc(context0, zzdrw0, this.zze, s1, "offline_open");
        }
        if(zzv.zzp().zzA(context0)) {
            this.zze.zzh(this.zzc, s1);
            return false;
        }
        zzcex zzcex0 = (zzcex)zza0;
        zzfbo zzfbo0 = zzcex0.zzD();
        if((zzfbo0 == null || (zzfbo0.zzay == null || zzfbo0.zzay.zzc())) && (zzfbo0 == null || (zzfbo0.zzad == null || !zzfbo0.zzad.zza || zzfbo0.zzad.zzb == null || !zzfbo0.zzad.zzc) || !((Boolean)zzbe.zzc().zza(zzbcl.zzit)).booleanValue())) {
            zzbr zzbr0 = zzs.zzA(context0);
            boolean z = NotificationManagerCompat.q(context0).a();
            boolean z1 = zzv.zzr().zzi(context0, "offline_notification_channel");
            boolean z2 = zzcex0.zzO().zzi() && zzcex0.zzi() == null;
            if(!z && (NotificationManagerCompat.q(context0).a() || !(Build.VERSION.SDK_INT >= 33 ? ((Boolean)zzbe.zzc().zza(zzbcl.zzin)).booleanValue() : ((Boolean)zzbe.zzc().zza(zzbcl.zzio)).booleanValue()))) {
                this.zzi(context0, s1, "notifications_disabled");
                return false;
            }
            if(z1) {
                this.zzi(context0, s1, "notification_channel_disabled");
                return false;
            }
            if(zzbr0 == null) {
                this.zzi(context0, s1, "work_manager_unavailable");
                return false;
            }
            if(z2) {
                this.zzi(context0, s1, "ad_no_activity");
                return false;
            }
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzil)).booleanValue()) {
                this.zzi(context0, s1, "notification_flow_disabled");
                return false;
            }
            if(zzcex0.zzL() == null || zzcex0.zzi() == null) {
                ((zzcgh)zza0).zzaK(s1, s, 14);
            }
            else {
                zzebw zzebw0 = zzebx.zze();
                zzebw0.zza(zzcex0.zzi());
                zzebw0.zzb(null);
                zzebw0.zzc(s1);
                zzebw0.zzd(s);
                zzebx zzebx0 = zzebw0.zze();
                try {
                    zzcex0.zzL().zzf(zzebx0);
                }
                catch(Exception exception0) {
                    this.zzi(context0, s1, exception0.getMessage());
                    return false;
                }
            }
            zza0.onAdClicked();
            return true;
        }
        zzdrw zzdrw1 = this.zzb;
        if(zzdrw1 != null) {
            zzebv.zzc(context0, zzdrw1, this.zze, s1, "onfs");
        }
        return false;
    }

    private final void zzm(int v) {
        String s;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeF)).booleanValue()) {
            zzdrw zzdrw0 = this.zzb;
            if(zzdrw0 != null) {
                zzdrv zzdrv0 = zzdrw0.zza();
                zzdrv0.zzb("action", "cct_action");
                switch(v) {
                    case 2: {
                        s = "CONTEXT_NOT_AN_ACTIVITY";
                        break;
                    }
                    case 3: {
                        s = "CONTEXT_NULL";
                        break;
                    }
                    case 4: {
                        s = "CCT_NOT_SUPPORTED";
                        break;
                    }
                    case 5: {
                        s = "CCT_READY_TO_OPEN";
                        break;
                    }
                    case 6: {
                        s = "ACTIVITY_NOT_FOUND";
                        break;
                    }
                    case 7: {
                        s = "EMPTY_URL";
                        break;
                    }
                    case 8: {
                        s = "UNKNOWN";
                        break;
                    }
                    case 9: {
                        s = "WRONG_EXP_SETUP";
                        break;
                    }
                    default: {
                        s = "OPT_OUT";
                    }
                }
                zzdrv0.zzb("cct_open_status", s);
                zzdrv0.zzg();
            }
        }
    }
}

