package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.t0;
import java.util.List;
import o3.j;

@j
public interface zzcex extends zza, zzn, zzayk, zzbmk, zzbmw, zzcbs, zzceo, zzcga, zzcge, zzcgh, zzcgk, zzcgl, zzcgm, zzdds {
    boolean canGoBack();

    void destroy();

    @Override  // com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbs
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] arg1);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String arg1, String arg2, String arg3);

    void loadDataWithBaseURL(String arg1, String arg2, String arg3, String arg4, String arg5);

    void loadUrl(String arg1);

    void measure(int arg1, int arg2);

    void onPause();

    void onResume();

    @Override  // com.google.android.gms.internal.ads.zzcbs
    void setBackgroundColor(int arg1);

    void setOnClickListener(View.OnClickListener arg1);

    void setOnTouchListener(View.OnTouchListener arg1);

    void setWebChromeClient(WebChromeClient arg1);

    void setWebViewClient(WebViewClient arg1);

    @Override  // com.google.android.gms.internal.ads.zzcbs
    void zzC(zzcfz arg1);

    @Override  // com.google.android.gms.internal.ads.zzceo
    zzfbo zzD();

    Context zzE();

    @Override  // com.google.android.gms.internal.ads.zzcgm
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override  // com.google.android.gms.internal.ads.zzcgk
    zzava zzI();

    zzazx zzJ();

    zzbfk zzK();

    zzm zzL();

    zzm zzM();

    zzcgp zzN();

    @Override  // com.google.android.gms.internal.ads.zzcgj
    zzcgr zzO();

    zzecp zzP();

    zzecr zzQ();

    @Override  // com.google.android.gms.internal.ads.zzcga
    zzfbr zzR();

    zzfcn zzS();

    t0 zzT();

    String zzU();

    List zzV();

    void zzW(zzfbo arg1, zzfbr arg2);

    void zzX();

    void zzY();

    void zzZ(int arg1);

    void zzaA(String arg1, Predicate arg2);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean arg1, int arg2);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean arg1);

    void zzad();

    void zzae(String arg1, String arg2, String arg3);

    void zzaf();

    void zzag(String arg1, zzbjp arg2);

    void zzah();

    void zzai(zzm arg1);

    void zzaj(zzcgr arg1);

    void zzak(zzazx arg1);

    void zzal(boolean arg1);

    void zzam();

    void zzan(Context arg1);

    void zzao(boolean arg1);

    void zzap(zzbfi arg1);

    void zzaq(boolean arg1);

    void zzar(zzbfk arg1);

    void zzas(zzecp arg1);

    void zzat(zzecr arg1);

    void zzau(int arg1);

    void zzav(boolean arg1);

    void zzaw(zzm arg1);

    void zzax(boolean arg1);

    void zzay(boolean arg1);

    void zzaz(String arg1, zzbjp arg2);

    @Override  // com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbs
    Activity zzi();

    @Override  // com.google.android.gms.internal.ads.zzcbs
    com.google.android.gms.ads.internal.zza zzj();

    @Override  // com.google.android.gms.internal.ads.zzcbs
    zzbcy zzm();

    @Override  // com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbs
    VersionInfoParcel zzn();

    @Override  // com.google.android.gms.internal.ads.zzcbs
    zzcfz zzq();

    @Override  // com.google.android.gms.internal.ads.zzcbs
    void zzt(String arg1, zzcde arg2);
}

