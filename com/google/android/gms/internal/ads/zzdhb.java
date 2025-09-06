package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView.ScaleType;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.Map.Entry;
import java.util.Map;
import o3.j;
import org.json.JSONException;
import org.json.JSONObject;

@j
public final class zzdhb implements zzdin {
    private long zzA;
    private long zzB;
    private zzdd zzC;
    private final zzdjh zzD;
    private final Context zza;
    private final zzdiq zzb;
    private final JSONObject zzc;
    private final zzdnl zzd;
    private final zzdif zze;
    private final zzava zzf;
    private final zzcwl zzg;
    private final zzcvr zzh;
    private final zzddq zzi;
    private final zzfbo zzj;
    private final VersionInfoParcel zzk;
    private final zzfcj zzl;
    private final zzcnh zzm;
    private final zzdjl zzn;
    private final Clock zzo;
    private final zzddm zzp;
    private final zzfja zzq;
    private final zzdpb zzr;
    private final zzfhh zzs;
    private final zzebv zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Point zzy;
    private Point zzz;

    public zzdhb(Context context0, zzdiq zzdiq0, JSONObject jSONObject0, zzdnl zzdnl0, zzdif zzdif0, zzava zzava0, zzcwl zzcwl0, zzcvr zzcvr0, zzddq zzddq0, zzfbo zzfbo0, VersionInfoParcel versionInfoParcel0, zzfcj zzfcj0, zzcnh zzcnh0, zzdjl zzdjl0, Clock clock0, zzddm zzddm0, zzfja zzfja0, zzfhh zzfhh0, zzebv zzebv0, zzdpb zzdpb0, zzdjh zzdjh0) {
        this.zzu = false;
        this.zzw = false;
        this.zzx = false;
        this.zzy = new Point();
        this.zzz = new Point();
        this.zzA = 0L;
        this.zzB = 0L;
        this.zza = context0;
        this.zzb = zzdiq0;
        this.zzc = jSONObject0;
        this.zzd = zzdnl0;
        this.zze = zzdif0;
        this.zzf = zzava0;
        this.zzg = zzcwl0;
        this.zzh = zzcvr0;
        this.zzi = zzddq0;
        this.zzj = zzfbo0;
        this.zzk = versionInfoParcel0;
        this.zzl = zzfcj0;
        this.zzm = zzcnh0;
        this.zzn = zzdjl0;
        this.zzo = clock0;
        this.zzp = zzddm0;
        this.zzq = zzfja0;
        this.zzs = zzfhh0;
        this.zzt = zzebv0;
        this.zzr = zzdpb0;
        this.zzD = zzdjh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzA(@Nullable View view0, @Nullable Map map0) {
        this.zzy = new Point();
        this.zzz = new Point();
        if(view0 != null) {
            this.zzp.zzb(view0);
        }
        this.zzv = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final boolean zzB() {
        return this.zza() == 0 || !((Boolean)zzbe.zzc().zza(zzbcl.zzls)).booleanValue() ? true : this.zzl.zzi.zzj;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final boolean zzC() {
        return this.zzH();
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final boolean zzD(Bundle bundle0) {
        if(!this.zzG("impression_reporting")) {
            zzo.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        String s = null;
        JSONObject jSONObject0 = zzbc.zzb().zzk(bundle0, null);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlo)).booleanValue()) {
            s = this.zzE(null);
        }
        return this.zzI(null, null, null, null, s, jSONObject0, false, null);
    }

    @Nullable
    private final String zzE(View view0) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzdE)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view0, null);
        }
        catch(Exception unused_ex) {
            zzo.zzg("Exception getting data.");
            return null;
        }
    }

    @Nullable
    private final String zzF(@Nullable View view0, @Nullable Map map0) {
        if(map0 != null && view0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(view0.equals(((View)((WeakReference)map$Entry0.getValue()).get()))) {
                    return (String)map$Entry0.getKey();
                }
                if(false) {
                    break;
                }
            }
        }
        switch(this.zze.zzc()) {
            case 1: {
                return "1099";
            }
            case 2: {
                return "2099";
            }
            case 6: {
                return "3099";
            }
            default: {
                return null;
            }
        }
    }

    private final boolean zzG(String s) {
        JSONObject jSONObject0 = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObject0 != null && jSONObject0.optBoolean(s, false);
    }

    private final boolean zzH() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzI(@Nullable JSONObject jSONObject0, @Nullable JSONObject jSONObject1, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable String s, @Nullable JSONObject jSONObject4, boolean z, @Nullable View view0) {
        DisplayMetrics displayMetrics0;
        JSONObject jSONObject6;
        JSONObject jSONObject5;
        try {
            jSONObject5 = new JSONObject();
            jSONObject5.put("ad", this.zzc);
            jSONObject5.put("asset_view_signal", jSONObject1);
            jSONObject5.put("ad_view_signal", jSONObject0);
            jSONObject5.put("scroll_view_signal", jSONObject2);
            jSONObject5.put("lock_screen_signal", jSONObject3);
            jSONObject5.put("provided_signals", jSONObject4);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzdE)).booleanValue()) {
                jSONObject5.put("view_signals", s);
            }
            jSONObject5.put("policy_validator_enabled", z);
            jSONObject6 = new JSONObject();
            displayMetrics0 = zzs.zzu(((WindowManager)this.zza.getSystemService("window")));
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Unable to create impression JSON.", jSONException0);
            return false;
        }
        try {
            jSONObject6.put("width", zzbc.zzb().zzb(this.zza, displayMetrics0.widthPixels));
            jSONObject6.put("height", zzbc.zzb().zzb(this.zza, displayMetrics0.heightPixels));
        }
        catch(JSONException unused_ex) {
            jSONObject6 = null;
        }
        try {
            jSONObject5.put("screen", jSONObject6);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzix)).booleanValue()) {
                zzdgy zzdgy0 = new zzdgy(this, null);
                this.zzd.zzl("/clickRecorded", zzdgy0);
            }
            else {
                zzdgx zzdgx0 = new zzdgx(this, null);
                this.zzd.zzl("/logScionEvent", zzdgx0);
            }
            zzdgz zzdgz0 = new zzdgz(this, view0, null);
            this.zzd.zzl("/nativeImpression", zzdgz0);
            zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleImpression", jSONObject5), "Error during performing handleImpression");
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Unable to create impression JSON.", jSONException0);
            return false;
        }
        if(!this.zzu) {
            this.zzu = zzv.zzt().zzn(this.zza, this.zzk.afmaVersion, this.zzj.zzC.toString(), this.zzl.zzf);
        }
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final int zza() {
        return this.zzl.zzi == null || !((Boolean)zzbe.zzc().zza(zzbcl.zzls)).booleanValue() ? 0 : this.zzl.zzi.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    @Nullable
    public final JSONObject zze(@Nullable View view0, @Nullable Map map0, @Nullable Map map1, @Nullable ImageView.ScaleType imageView$ScaleType0) {
        JSONObject jSONObject0 = zzbv.zzd(this.zza, map0, map1, view0, imageView$ScaleType0);
        JSONObject jSONObject1 = zzbv.zzg(this.zza, view0);
        JSONObject jSONObject2 = zzbv.zzf(view0);
        JSONObject jSONObject3 = zzbv.zze(this.zza, view0);
        try {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("asset_view_signal", jSONObject0);
            jSONObject4.put("ad_view_signal", jSONObject1);
            jSONObject4.put("scroll_view_signal", jSONObject2);
            jSONObject4.put("lock_screen_signal", jSONObject3);
            return jSONObject4;
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Unable to create native ad view signals JSON.", jSONException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    @Nullable
    public final JSONObject zzf(@Nullable View view0, @Nullable Map map0, @Nullable Map map1, @Nullable ImageView.ScaleType imageView$ScaleType0) {
        JSONObject jSONObject0 = this.zze(view0, map0, map1, imageView$ScaleType0);
        JSONObject jSONObject1 = new JSONObject();
        try {
            if(this.zzx && this.zzH()) {
                jSONObject1.put("custom_click_gesture_eligible", true);
            }
            if(jSONObject0 != null) {
                jSONObject1.put("nas", jSONObject0);
                return jSONObject1;
            }
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Unable to create native click meta data JSON.", jSONException0);
        }
        return jSONObject1;
    }

    static void zzg(zzdhb zzdhb0, View view0) {
        zzdhb0.zzD.zza(view0, zzdhb0.zzj);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzh() {
        try {
            zzdd zzdd0 = this.zzC;
            if(zzdd0 != null) {
                zzdd0.zze();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzi() {
        if(!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            return;
        }
        this.zzn.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzj() {
        this.zzd.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzk(@Nullable zzdh zzdh0) {
        try {
            if(this.zzw) {
                return;
            }
            if(zzdh0 == null) {
                zzdif zzdif0 = this.zze;
                if(zzdif0.zzk() != null) {
                    this.zzw = true;
                    String s = zzdif0.zzk().zzf();
                    this.zzq.zzd(s, this.zzj.zzax, this.zzs);
                    this.zzh();
                    return;
                }
            }
            this.zzw = true;
            String s1 = zzdh0.zzf();
            this.zzq.zzd(s1, this.zzj.zzax, this.zzs);
            this.zzh();
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzl("#007 Could not call remote method.", remoteException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzl(View view0, @Nullable View view1, @Nullable Map map0, @Nullable Map map1, boolean z, @Nullable ImageView.ScaleType imageView$ScaleType0) {
        JSONObject jSONObject0 = zzbv.zzd(this.zza, map0, map1, view1, imageView$ScaleType0);
        JSONObject jSONObject1 = zzbv.zzg(this.zza, view1);
        JSONObject jSONObject2 = zzbv.zzf(view1);
        JSONObject jSONObject3 = zzbv.zze(this.zza, view1);
        String s = this.zzF(view0, map0);
        JSONObject jSONObject4 = zzbv.zzc(s, this.zza, this.zzz, this.zzy);
        this.zzo((((Boolean)zzbe.zzc().zza(zzbcl.zzdL)).booleanValue() ? view1 : view0), jSONObject1, jSONObject0, jSONObject2, jSONObject3, s, jSONObject4, null, z, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzm(String s) {
        this.zzo(null, null, null, null, null, s, null, null, false, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzn(@Nullable Bundle bundle0) {
        if(bundle0 == null) {
            zzo.zze("Click data is null. No click is reported.");
            return;
        }
        if(!this.zzG("click_reporting")) {
            zzo.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle1 = bundle0.getBundle("click_signal");
        this.zzo(null, null, null, null, null, (bundle1 == null ? null : bundle1.getString("asset_id")), null, zzbc.zzb().zzk(bundle0, null), false, false);
    }

    @VisibleForTesting
    protected final void zzo(@Nullable View view0, @Nullable JSONObject jSONObject0, @Nullable JSONObject jSONObject1, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable String s, @Nullable JSONObject jSONObject4, @Nullable JSONObject jSONObject5, boolean z, boolean z1) {
        String s5;
        String s3;
        JSONObject jSONObject7;
        JSONObject jSONObject6;
        try {
            jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject1);
            jSONObject6.put("ad_view_signal", jSONObject0);
            jSONObject6.put("click_signal", jSONObject4);
            jSONObject6.put("scroll_view_signal", jSONObject2);
            jSONObject6.put("lock_screen_signal", jSONObject3);
            String s1 = this.zze.zzA();
            boolean z2 = false;
            jSONObject6.put("has_custom_click_handler", this.zzb.zzc(s1) != null);
            jSONObject6.put("provided_signals", jSONObject5);
            jSONObject7 = new JSONObject();
            jSONObject7.put("asset_id", s);
            jSONObject7.put("template", this.zze.zzc());
            jSONObject7.put("view_aware_api_used", z);
            zzbfl zzbfl0 = this.zzl.zzi;
            jSONObject7.put("custom_mute_requested", zzbfl0 != null && zzbfl0.zzg);
            jSONObject7.put("custom_mute_enabled", !this.zze.zzH().isEmpty() && this.zze.zzk() != null);
            if(this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject7.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject7.put("timestamp", this.zzo.currentTimeMillis());
            if(this.zzx && this.zzH()) {
                jSONObject7.put("custom_click_gesture_eligible", true);
            }
            if(z1) {
                jSONObject7.put("is_custom_click_gesture", true);
            }
            String s2 = this.zze.zzA();
            if(this.zzb.zzc(s2) != null) {
                z2 = true;
            }
            jSONObject7.put("has_custom_click_handler", z2);
            s3 = null;
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Unable to create click JSON.", jSONException0);
            return;
        }
        try {
            JSONObject jSONObject8 = this.zzc.optJSONObject("tracking_urls_and_actions");
            if(jSONObject8 == null) {
                jSONObject8 = new JSONObject();
            }
            String s4 = jSONObject8.optString("click_string");
            s5 = this.zzf.zzc().zzd(this.zza, s4, view0);
            goto label_39;
        }
        catch(Exception exception0) {
        }
        try {
            zzo.zzh("Exception obtaining click signals", exception0);
            s5 = null;
        label_39:
            jSONObject7.put("click_signals", s5);
            jSONObject7.put("open_chrome_custom_tab", true);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zziB)).booleanValue()) {
                jSONObject7.put("try_fallback_for_deep_link", true);
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zziC)).booleanValue()) {
                jSONObject7.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject6.put("click", jSONObject7);
            JSONObject jSONObject9 = new JSONObject();
            long v = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", v - this.zzA);
            jSONObject9.put("time_from_last_touch", v - this.zzB);
            jSONObject6.put("touch_signal", jSONObject9);
            if(this.zzj.zzb()) {
                JSONObject jSONObject10 = (JSONObject)this.zzc.get("tracking_urls_and_actions");
                if(jSONObject10 != null) {
                    s3 = jSONObject10.getString("gws_query_id");
                }
                if(s3 != null) {
                    this.zzt.zzq(s3, this.zze);
                }
            }
            zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject6), "Error during performing handleClick");
            return;
        }
        catch(JSONException jSONException0) {
        }
        zzo.zzh("Unable to create click JSON.", jSONException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzp(@Nullable View view0, @Nullable View view1, @Nullable Map map0, @Nullable Map map1, boolean z, @Nullable ImageView.ScaleType imageView$ScaleType0, int v) {
        if(!this.zzc.optBoolean("allow_sdk_custom_click_gesture", false) || !((Boolean)zzbe.zzc().zza(zzbcl.zzls)).booleanValue()) {
            if(!this.zzx) {
                zzo.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            }
            if(!this.zzH()) {
                zzo.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObject0 = zzbv.zzd(this.zza, map0, map1, view1, imageView$ScaleType0);
        JSONObject jSONObject1 = zzbv.zzg(this.zza, view1);
        JSONObject jSONObject2 = zzbv.zzf(view1);
        JSONObject jSONObject3 = zzbv.zze(this.zza, view1);
        String s = this.zzF(view0, map0);
        this.zzo(view1, jSONObject1, jSONObject0, jSONObject2, jSONObject3, s, zzbv.zzc(s, this.zza, this.zzz, this.zzy), null, z, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzq() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("ad", this.zzc);
            zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject0), "Error during performing handleDownloadedImpression");
        }
        catch(JSONException jSONException0) {
            zzo.zzh("", jSONException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzr(@Nullable View view0, @Nullable Map map0, @Nullable Map map1, @Nullable ImageView.ScaleType imageView$ScaleType0) {
        JSONObject jSONObject0 = zzbv.zzd(this.zza, map0, map1, view0, imageView$ScaleType0);
        this.zzI(zzbv.zzg(this.zza, view0), jSONObject0, zzbv.zzf(view0), zzbv.zze(this.zza, view0), this.zzE(view0), null, zzbv.zzh(this.zza, this.zzj), view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzs() {
        this.zzI(null, null, null, null, null, null, false, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzt(@Nullable View view0, MotionEvent motionEvent0, @Nullable View view1) {
        this.zzy = zzbv.zza(motionEvent0, view1);
        long v = this.zzo.currentTimeMillis();
        this.zzB = v;
        if(motionEvent0.getAction() == 0) {
            this.zzr.zzb(motionEvent0);
            this.zzA = v;
            this.zzz = this.zzy;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.setLocation(((float)this.zzy.x), ((float)this.zzy.y));
        this.zzf.zzd(motionEvent1);
        motionEvent1.recycle();
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzu(@Nullable Bundle bundle0) {
        if(bundle0 == null) {
            zzo.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if(!this.zzG("touch_reporting")) {
            zzo.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        int v = (int)bundle0.getFloat("x");
        int v1 = (int)bundle0.getFloat("y");
        int v2 = bundle0.getInt("duration_ms");
        this.zzf.zzc().zzl(v, v1, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzv(View view0) {
        if(!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzo.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdjl zzdjl0 = this.zzn;
        if(view0 == null) {
            return;
        }
        view0.setOnClickListener(zzdjl0);
        view0.setClickable(true);
        zzdjl0.zzc = new WeakReference(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzw() {
        this.zzx = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzx(zzdd zzdd0) {
        this.zzC = zzdd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzy(zzbhq zzbhq0) {
        if(!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzo.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        this.zzn.zzc(zzbhq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzz(View view0, @Nullable Map map0, @Nullable Map map1, View.OnTouchListener view$OnTouchListener0, View.OnClickListener view$OnClickListener0) {
        this.zzy = new Point();
        this.zzz = new Point();
        if(!this.zzv) {
            this.zzp.zza(view0);
            this.zzv = true;
        }
        view0.setOnTouchListener(view$OnTouchListener0);
        view0.setClickable(true);
        view0.setOnClickListener(view$OnClickListener0);
        this.zzm.zzi(this);
        boolean z = zzbv.zzi(this.zzk.clientJarVersion);
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                View view1 = (View)((WeakReference)((Map.Entry)object0).getValue()).get();
                if(view1 != null) {
                    if(z) {
                        view1.setOnTouchListener(view$OnTouchListener0);
                    }
                    view1.setClickable(true);
                    view1.setOnClickListener(view$OnClickListener0);
                }
            }
        }
        if(map1 != null) {
            for(Object object1: map1.entrySet()) {
                View view2 = (View)((WeakReference)((Map.Entry)object1).getValue()).get();
                if(view2 != null) {
                    if(z) {
                        view2.setOnTouchListener(view$OnTouchListener0);
                    }
                    view2.setClickable(false);
                }
            }
        }
    }
}

