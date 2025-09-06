package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzcfp extends FrameLayout implements zzcex {
    private final zzcex zza;
    private final zzcbh zzb;
    private final AtomicBoolean zzc;

    public zzcfp(zzcex zzcex0) {
        super(zzcex0.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcex0;
        this.zzb = new zzcbh(zzcex0.zzE(), this, this);
        this.addView(((View)zzcex0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void destroy() {
        zzecr zzecr0 = this.zzQ();
        if(zzecr0 != null) {
            zzcfm zzcfm0 = new zzcfm(zzecr0);
            zzs.zza.post(zzcfm0);
            Objects.requireNonNull(this.zza);
            zzcfl zzcfl0 = new zzcfl(this.zza);
            long v = (long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfd)))));
            zzs.zza.postDelayed(zzcfl0, v);
            return;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzff)).booleanValue()) {
            zzecp zzecp0 = this.zzP();
            if(zzecp0 != null) {
                zzcfn zzcfn0 = new zzcfn(this, zzecp0);
                zzs.zza.post(zzcfn0);
                return;
            }
        }
        this.zza.destroy();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void goBack() {
        this.zza.goBack();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void loadData(String s, String s1, String s2) {
        this.zza.loadData(s, "text/html", s2);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4) {
        this.zza.loadDataWithBaseURL(s, s1, "text/html", "UTF-8", null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void loadUrl(String s) {
        this.zza.loadUrl(s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcex zzcex0 = this.zza;
        if(zzcex0 != null) {
            zzcex0.onAdClicked();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void onResume() {
        this.zza.onResume();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex, android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.zza.setOnClickListener(view$OnClickListener0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex, android.view.View
    public final void setOnTouchListener(View.OnTouchListener view$OnTouchListener0) {
        this.zza.setOnTouchListener(view$OnTouchListener0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void setWebChromeClient(WebChromeClient webChromeClient0) {
        this.zza.setWebChromeClient(webChromeClient0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void setWebViewClient(WebViewClient webViewClient0) {
        this.zza.setWebViewClient(webViewClient0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzA(int v) {
        this.zza.zzA(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzB(int v) {
        this.zzb.zzg(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzC(zzcfz zzcfz0) {
        this.zza.zzC(zzcfz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzfbo zzD() {
        return this.zza.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final View zzF() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final WebView zzG() {
        return (WebView)this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzava zzI() {
        return this.zza.zzI();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzazx zzJ() {
        return this.zza.zzJ();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    @Nullable
    public final zzbfk zzK() {
        return this.zza.zzK();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzm zzL() {
        return this.zza.zzL();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzm zzM() {
        return this.zza.zzM();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzcgp zzN() {
        return ((zzcfw)this.zza).zzaO();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzcgr zzO() {
        return this.zza.zzO();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzecp zzP() {
        return this.zza.zzP();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzecr zzQ() {
        return this.zza.zzQ();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzfbr zzR() {
        return this.zza.zzR();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzfcn zzS() {
        return this.zza.zzS();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final t0 zzT() {
        return this.zza.zzT();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final String zzU() {
        return this.zza.zzU();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final List zzV() {
        List list0 = new ArrayList();
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(view0 != this.zza) {
                list0.add(view0);
            }
        }
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzW(zzfbo zzfbo0, zzfbr zzfbr0) {
        this.zza.zzW(zzfbo0, zzfbr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzY() {
        this.zza.zzY();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzZ(int v) {
        this.zza.zzZ(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmw
    public final void zza(String s) {
        ((zzcfw)this.zza).zzaT(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaA(String s, Predicate predicate0) {
        this.zza.zzaA(s, predicate0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaD(boolean z, int v) {
        if(!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaW)).booleanValue()) {
            return false;
        }
        if(this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.zza.getParent()).removeView(((View)this.zza));
        }
        this.zza.zzaD(z, v);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaG() {
        return this.zzc.get();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    final void zzaI(boolean z) {
        Objects.requireNonNull(this.zza);
        zzcfl zzcfl0 = new zzcfl(this.zza);
        zzs.zza.post(zzcfl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgh
    public final void zzaJ(zzc zzc0, boolean z, boolean z1, String s) {
        this.zza.zzaJ(zzc0, z, z1, s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgh
    public final void zzaK(String s, String s1, int v) {
        this.zza.zzaK(s, s1, 14);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgh
    public final void zzaL(boolean z, int v, boolean z1) {
        this.zza.zzaL(z, v, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgh
    public final void zzaM(boolean z, int v, String s, String s1, boolean z1) {
        this.zza.zzaM(z, v, s, s1, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgh
    public final void zzaN(boolean z, int v, String s, boolean z1, boolean z2) {
        this.zza.zzaN(z, v, s, z1, z2);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzab() {
        this.zza.zzab();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzac(boolean z) {
        this.zza.zzac(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzad() {
        this.zza.zzad();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzae(String s, String s1, @Nullable String s2) {
        this.zza.zzae(s, s1, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaf() {
        this.zza.zzaf();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzag(String s, zzbjp zzbjp0) {
        this.zza.zzag(s, zzbjp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzah() {
        TextView textView0 = new TextView(this.getContext());
        textView0.setText(zzs.zzz());
        textView0.setTextSize(15.0f);
        textView0.setTextColor(-1);
        textView0.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(0);
        gradientDrawable0.setColor(-12303292);
        gradientDrawable0.setCornerRadius(8.0f);
        textView0.setBackground(gradientDrawable0);
        this.addView(textView0, new FrameLayout.LayoutParams(-2, -2, 49));
        this.bringChildToFront(textView0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzff)).booleanValue()) {
            zzecp zzecp0 = this.zzP();
            if(zzecp0 != null) {
                zzecp0.zza(textView0);
                return;
            }
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfe)).booleanValue()) {
            zzecr zzecr0 = this.zzQ();
            if(zzecr0 != null && zzecr0.zzb()) {
                zzv.zzB().zzg(zzecr0.zza(), textView0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzai(zzm zzm0) {
        this.zza.zzai(zzm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaj(zzcgr zzcgr0) {
        this.zza.zzaj(zzcgr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzak(zzazx zzazx0) {
        this.zza.zzak(zzazx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzal(boolean z) {
        this.zza.zzal(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzam() {
        this.setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzan(Context context0) {
        this.zza.zzan(context0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzao(boolean z) {
        this.zza.zzao(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzap(zzbfi zzbfi0) {
        this.zza.zzap(zzbfi0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaq(boolean z) {
        this.zza.zzaq(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzar(@Nullable zzbfk zzbfk0) {
        this.zza.zzar(zzbfk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzas(@Nullable zzecp zzecp0) {
        this.zza.zzas(zzecp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzat(zzecr zzecr0) {
        this.zza.zzat(zzecr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzau(int v) {
        this.zza.zzau(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzav(boolean z) {
        this.zza.zzav(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaw(zzm zzm0) {
        this.zza.zzaw(zzm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzax(boolean z) {
        this.zza.zzax(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzay(boolean z) {
        this.zza.zzay(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaz(String s, zzbjp zzbjp0) {
        this.zza.zzaz(s, zzbjp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmw
    public final void zzb(String s, String s1) {
        this.zza.zzb("window.inspectorInfo", s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmk
    public final void zzd(String s, Map map0) {
        this.zza.zzd(s, map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzcex zzcex0 = this.zza;
        if(zzcex0 != null) {
            zzcex0.zzdd();
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzn
    public final void zzde() {
        this.zza.zzde();
    }

    @Override  // com.google.android.gms.ads.internal.zzn
    public final void zzdf() {
        this.zza.zzdf();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzdg() {
        this.zza.zzdg();
    }

    @Override  // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayj0) {
        this.zza.zzdn(zzayj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmk
    public final void zze(String s, JSONObject jSONObject0) {
        this.zza.zze(s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final int zzf() {
        return this.zza.zzf();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final int zzg() {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzdW)).booleanValue() ? this.zza.getMeasuredHeight() : this.getMeasuredHeight();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final int zzh() {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzdW)).booleanValue() ? this.zza.getMeasuredWidth() : this.getMeasuredWidth();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    @Nullable
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zza zzj() {
        return this.zza.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final zzbcx zzk() {
        return this.zza.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmw
    public final void zzl(String s, JSONObject jSONObject0) {
        ((zzcfw)this.zza).zzb(s, jSONObject0.toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzbcy zzm() {
        return this.zza.zzm();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final VersionInfoParcel zzn() {
        return this.zza.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final zzcbh zzo() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final zzcde zzp(String s) {
        return this.zza.zzp(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzcfz zzq() {
        return this.zza.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final String zzr() {
        return this.zza.zzr();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final String zzs() {
        return this.zza.zzs();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzt(String s, zzcde zzcde0) {
        this.zza.zzt(s, zzcde0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        zzcex zzcex0 = this.zza;
        if(zzcex0 != null) {
            zzcex0.zzu();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzv(boolean z, long v) {
        this.zza.zzv(z, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzw() {
        this.zza.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzx(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzy(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}

