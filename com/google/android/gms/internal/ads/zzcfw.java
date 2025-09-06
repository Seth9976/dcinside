package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzck;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzk;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o3.j;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
@VisibleForTesting
@j
final class zzcfw extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzcex {
    private final String zzA;
    private zzcfz zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbfk zzE;
    private zzbfi zzF;
    private zzazx zzG;
    private int zzH;
    private int zzI;
    private zzbcx zzJ;
    private final zzbcx zzK;
    private zzbcx zzL;
    private final zzbcy zzM;
    private int zzN;
    private zzm zzO;
    private boolean zzP;
    private final zzck zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbbj zzX;
    private boolean zzY;
    public static final int zza;
    private final zzcgq zzb;
    private final zzava zzc;
    private final zzfcn zzd;
    private final zzbds zze;
    private final VersionInfoParcel zzf;
    private zzn zzg;
    private final zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfbo zzk;
    private zzfbr zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcff zzo;
    private zzm zzp;
    private zzecr zzq;
    private zzecp zzr;
    private zzcgr zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    @VisibleForTesting
    protected zzcfw(zzcgq zzcgq0, zzcgr zzcgr0, String s, boolean z, boolean z1, zzava zzava0, zzbds zzbds0, VersionInfoParcel versionInfoParcel0, zzbda zzbda0, zzn zzn0, zza zza0, zzbbj zzbbj0, zzfbo zzfbo0, zzfbr zzfbr0, zzfcn zzfcn0) {
        super(zzcgq0);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzcgq0;
        this.zzs = zzcgr0;
        this.zzt = s;
        this.zzw = z;
        this.zzc = zzava0;
        this.zzd = zzfcn0;
        this.zze = zzbds0;
        this.zzf = versionInfoParcel0;
        this.zzg = zzn0;
        this.zzh = zza0;
        WindowManager windowManager0 = (WindowManager)this.getContext().getSystemService("window");
        this.zzW = windowManager0;
        DisplayMetrics displayMetrics0 = zzs.zzu(windowManager0);
        this.zzi = displayMetrics0;
        this.zzj = displayMetrics0.density;
        this.zzX = zzbbj0;
        this.zzk = zzfbo0;
        this.zzl = zzfbr0;
        this.zzQ = new zzck(zzcgq0.zza(), this, this, null);
        this.zzY = false;
        this.setBackgroundColor(0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlv)).booleanValue()) {
            this.setSoundEffectsEnabled(false);
        }
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setAllowFileAccess(false);
        try {
            webSettings0.setJavaScriptEnabled(true);
        }
        catch(NullPointerException nullPointerException0) {
            zzo.zzh("Unable to enable Javascript.", nullPointerException0);
        }
        webSettings0.setSavePassword(false);
        webSettings0.setSupportMultipleWindows(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(true);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlu)).booleanValue()) {
            webSettings0.setMixedContentMode(1);
        }
        else {
            webSettings0.setMixedContentMode(2);
        }
        webSettings0.setUserAgentString(zzv.zzq().zzc(zzcgq0, versionInfoParcel0.afmaVersion));
        Context context0 = this.getContext();
        zzcd.zza(context0, new zzk(webSettings0, context0));
        webSettings0.setAllowFileAccessFromFileURLs(false);
        webSettings0.setAllowUniversalAccessFromFileURLs(false);
        webSettings0.setMediaPlaybackRequiresUserGesture(false);
        this.setDownloadListener(this);
        this.zzba();
        this.addJavascriptInterface(new zzcgd(this, new zzcgc(this)), "googleAdsJsInterface");
        this.removeJavascriptInterface("accessibility");
        this.removeJavascriptInterface("accessibilityTraversal");
        this.zzbi();
        zzbcy zzbcy0 = new zzbcy(new zzbda(true, "make_wv", this.zzt));
        this.zzM = zzbcy0;
        zzbcy0.zza().zzc(null);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && (this.zzl != null && this.zzl.zzb != null)) {
            zzbcy0.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbcx zzbcx0 = zzbda.zzf();
        this.zzK = zzbcx0;
        zzbcy0.zzb("native:view_create", zzbcx0);
        this.zzL = null;
        this.zzJ = null;
        zzcg.zza().zzb(zzcgq0);
        zzv.zzp().zzt();
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void destroy() {
        synchronized(this) {
            this.zzbi();
            this.zzQ.zza();
            zzm zzm0 = this.zzp;
            if(zzm0 != null) {
                zzm0.zzb();
                this.zzp.zzm();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzi();
            this.zzG = null;
            this.zzg = null;
            this.setOnClickListener(null);
            this.setOnTouchListener(null);
            if(this.zzv) {
                return;
            }
            zzv.zzz().zzd(this);
            this.zzbh();
            this.zzv = true;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzkF)).booleanValue()) {
                Activity activity0 = this.zzb.zza();
                if(activity0 != null && activity0.isDestroyed()) {
                    zze.zza("Destroying the WebView immediately...");
                    this.zzX();
                    return;
                }
                zze.zza("Initiating WebView self destruct sequence in 3...");
                zze.zza("Loading blank page in WebView, 2...");
                this.zzbf("about:blank");
                return;
            }
            zze.zza("Destroying the WebView immediately...");
            this.zzX();
        }
    }

    @Override  // android.webkit.WebView
    public final void evaluateJavascript(String s, ValueCallback valueCallback0) {
        synchronized(this) {
            if(this.zzaE()) {
                zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
                if(valueCallback0 != null) {
                    valueCallback0.onReceiveValue(null);
                    return;
                }
                return;
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzkG)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
                zzcfq zzcfq0 = () -> super.evaluateJavascript(s, valueCallback0);
                zzbzw.zzf.zza(zzcfq0);
                return;
            }
            super.evaluateJavascript(s, valueCallback0);
        }
    }

    @Override
    protected final void finalize() throws Throwable {
        try {
            synchronized(this) {
                if(!this.zzv) {
                    this.zzo.zzi();
                    zzv.zzz().zzd(this);
                    this.zzbh();
                    this.zzbb();
                }
            }
        }
        finally {
            super.finalize();
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void loadData(String s, String s1, String s2) {
        synchronized(this) {
            if(!this.zzaE()) {
                super.loadData(s, s1, s2);
                return;
            }
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4) {
        synchronized(this) {
            if(!this.zzaE()) {
                super.loadDataWithBaseURL(s, s1, s2, s3, s4);
                return;
            }
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void loadUrl(String s) {
        synchronized(this) {
            if(!this.zzaE()) {
                try {
                    zzcft zzcft0 = () -> super.loadUrl(s);
                    zzs.zza.post(zzcft0);
                }
                catch(Throwable throwable0) {
                    zzv.zzp().zzw(throwable0, "AdWebViewImpl.loadUrl");
                    zzo.zzk("Could not call loadUrl. ", throwable0);
                    return;
                }
                return;
            }
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcff zzcff0 = this.zzo;
        if(zzcff0 != null) {
            zzcff0.onAdClicked();
        }
    }

    @Override  // android.webkit.WebView
    protected final void onAttachedToWindow() {
        synchronized(this) {
            super.onAttachedToWindow();
            if(!this.zzaE()) {
                this.zzQ.zzc();
            }
            if(this.zzY) {
                this.onResume();
                this.zzY = false;
            }
            boolean z = this.zzC;
            if(this.zzo != null && this.zzo.zzU()) {
                if(!this.zzD) {
                    this.zzD = true;
                }
                this.zzaZ();
                z = true;
            }
            this.zzbd(z);
        }
    }

    @Override  // android.view.ViewGroup
    protected final void onDetachedFromWindow() {
        synchronized(this) {
            if(!this.zzaE()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if(this.zzD && (this.zzo != null && this.zzo.zzU() && this.getViewTreeObserver() != null && this.getViewTreeObserver().isAlive())) {
                this.zzD = false;
            }
        }
        this.zzbd(false);
    }

    @Override  // android.webkit.DownloadListener
    public final void onDownloadStart(String s, String s1, String s2, String s3, long v) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setDataAndType(Uri.parse(s), s3);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzkU)).booleanValue() && this.getContext() != null) {
                intent0.setPackage("com.dcinside.app.android");
            }
            zzs.zzT(this.getContext(), intent0);
            return;
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
        }
        zzo.zze(("Couldn\'t find an Activity to view url/mimetype: " + s + " / " + s3));
        zzv.zzp().zzw(activityNotFoundException0, "AdWebViewImpl.onDownloadStart: " + s);
    }

    @Override  // android.webkit.WebView
    protected final void onDraw(Canvas canvas0) {
        if(this.zzaE() || Build.VERSION.SDK_INT == 21 && canvas0.isHardwareAccelerated() && !this.isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas0);
    }

    @Override  // android.webkit.WebView
    public final boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        float f = motionEvent0.getAxisValue(9);
        float f1 = motionEvent0.getAxisValue(10);
        return motionEvent0.getActionMasked() != 8 || (f <= 0.0f || this.canScrollVertically(-1)) && (f >= 0.0f || this.canScrollVertically(1)) && (f1 <= 0.0f || this.canScrollHorizontally(-1)) && (f1 >= 0.0f || this.canScrollHorizontally(1)) ? super.onGenericMotionEvent(motionEvent0) : false;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z = this.zzaZ();
        zzm zzm0 = this.zzL();
        if(zzm0 != null && z) {
            zzm0.zzn();
        }
    }

    @Override  // android.webkit.WebView
    @SuppressLint({"DrawAllocation"})
    protected final void onMeasure(int v, int v1) {
        int v8;
        int v7;
        int v2 = 0;
        synchronized(this) {
            if(this.zzaE()) {
                this.setMeasuredDimension(0, 0);
                return;
            }
            if(!this.isInEditMode() && !this.zzw && !this.zzs.zzf()) {
                if(this.zzs.zzh()) {
                    super.onMeasure(v, v1);
                    return;
                }
                if(this.zzs.zzj()) {
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzdV)).booleanValue()) {
                        super.onMeasure(v, v1);
                        return;
                    }
                    zzcfz zzcfz0 = this.zzq();
                    float f = zzcfz0 == null ? 0.0f : zzcfz0.zze();
                    if(f == 0.0f) {
                        super.onMeasure(v, v1);
                        return;
                    }
                    int v4 = View.MeasureSpec.getSize(v);
                    int v5 = View.MeasureSpec.getSize(v1);
                    float f1 = ((float)v5) * f;
                    int v6 = (int)(((float)v4) / f);
                    if(v5 != 0) {
                    label_36:
                        if(v4 != 0) {
                            v2 = v4;
                            v8 = v5;
                            v7 = (int)f1;
                        }
                        else if(((int)f1) != 0) {
                            v6 = (int)(((float)(((int)f1))) / f);
                            v8 = v5;
                            v7 = (int)f1;
                            v2 = v7;
                        }
                        else {
                            v8 = v5;
                            v7 = (int)f1;
                        }
                    }
                    else if(v6 != 0) {
                        v7 = (int)(((float)v6) * f);
                        v2 = v4;
                        v8 = v6;
                    }
                    else {
                        v5 = 0;
                        goto label_36;
                    }
                    this.setMeasuredDimension(Math.min(v7, v2), Math.min(v6, v8));
                    return;
                }
                if(this.zzs.zzg()) {
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzea)).booleanValue()) {
                        super.onMeasure(v, v1);
                        return;
                    }
                    this.zzag("/contentHeight", new zzcfu(this));
                    this.zzaT("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = \'gmsg://mobileads.google.com/contentHeight?\';  url += \'height=\' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById(\'afma-notify-fluid\');    if (!frame) {      frame = document.createElement(\'IFRAME\');      frame.id = \'afma-notify-fluid\';      frame.style.display = \'none\';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f2 = this.zzi.density;
                    int v9 = View.MeasureSpec.getSize(v);
                    int v10 = this.zzI;
                    this.setMeasuredDimension(v9, (v10 == -1 ? View.MeasureSpec.getSize(v1) : ((int)(((float)v10) * f2))));
                    return;
                }
                if(this.zzs.zzi()) {
                    this.setMeasuredDimension(this.zzi.widthPixels, this.zzi.heightPixels);
                    return;
                }
                int v11 = View.MeasureSpec.getMode(v);
                int v12 = View.MeasureSpec.getSize(v);
                int v13 = View.MeasureSpec.getMode(v1);
                int v14 = View.MeasureSpec.getSize(v1);
                int v15 = 0x7FFFFFFF;
                int v16 = v11 == 0x80000000 || v11 == 0x40000000 ? v12 : 0x7FFFFFFF;
                if(v13 == 0x80000000 || v13 == 0x40000000) {
                    v15 = v14;
                }
                int v17 = this.zzs.zzb <= v16 && this.zzs.zza <= v15 ? 0 : 1;
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzfs)).booleanValue()) {
                    v17 &= (((float)this.zzs.zzb) / this.zzj > ((float)v16) / this.zzj || ((float)this.zzs.zza) / this.zzj > ((float)v15) / this.zzj ? 0 : 1);
                }
                if(v17 != 0) {
                    zzo.zzj(("Not enough space to show ad. Needs " + ((int)(((float)this.zzs.zzb) / this.zzj)) + "x" + ((int)(((float)this.zzs.zza) / this.zzj)) + " dp, but only has " + ((int)(((float)v12) / this.zzj)) + "x" + ((int)(((float)v14) / this.zzj)) + " dp."));
                    if(this.getVisibility() != 8) {
                        this.setVisibility(4);
                    }
                    this.setMeasuredDimension(0, 0);
                    if(!this.zzm) {
                        this.zzX.zzc(10001);
                        this.zzm = true;
                        return;
                    }
                    return;
                }
                if(this.getVisibility() != 8) {
                    this.setVisibility(0);
                }
                if(!this.zzn) {
                    this.zzX.zzc(10002);
                    this.zzn = true;
                }
                this.setMeasuredDimension(this.zzs.zzb, this.zzs.zza);
                return;
            }
            super.onMeasure(v, v1);
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void onPause() {
        if(!this.zzaE()) {
            try {
                super.onPause();
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzmu)).booleanValue() && WebViewFeature.a("MUTE_AUDIO")) {
                    zzo.zze("Muting webview");
                    WebViewCompat.x(this, true);
                }
            }
            catch(Exception exception0) {
                zzo.zzh("Could not pause webview.", exception0);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzmx)).booleanValue()) {
                    zzv.zzp().zzw(exception0, "AdWebViewImpl.onPause");
                }
            }
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void onResume() {
        if(!this.zzaE()) {
            try {
                super.onResume();
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzmu)).booleanValue() && WebViewFeature.a("MUTE_AUDIO")) {
                    zzo.zze("Unmuting webview");
                    WebViewCompat.x(this, false);
                }
            }
            catch(Exception exception0) {
                zzo.zzh("Could not resume webview.", exception0);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzmx)).booleanValue()) {
                    zzv.zzp().zzw(exception0, "AdWebViewImpl.onResume");
                }
            }
        }
    }

    @Override  // android.webkit.WebView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzdD)).booleanValue() && this.zzo.zzR();
        if(this.zzo.zzU() && !this.zzo.zzS() || z) {
            synchronized(this) {
                zzbfk zzbfk0 = this.zzE;
                if(zzbfk0 != null) {
                    zzbfk0.zzd(motionEvent0);
                }
            }
            return this.zzaE() ? false : super.onTouchEvent(motionEvent0);
        }
        zzava zzava0 = this.zzc;
        if(zzava0 != null) {
            zzava0.zzd(motionEvent0);
        }
        zzbds zzbds0 = this.zze;
        if(zzbds0 != null) {
            zzbds0.zzb(motionEvent0);
        }
        return this.zzaE() ? false : super.onTouchEvent(motionEvent0);
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void setWebViewClient(WebViewClient webViewClient0) {
        super.setWebViewClient(webViewClient0);
        if(webViewClient0 instanceof zzcff) {
            this.zzo = (zzcff)webViewClient0;
        }
    }

    @Override  // android.webkit.WebView
    public final void stopLoading() {
        if(this.zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        }
        catch(Exception exception0) {
            zzo.zzh("Could not stop loading webview.", exception0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzA(int v) {
        synchronized(this) {
            this.zzN = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzB(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzC(zzcfz zzcfz0) {
        synchronized(this) {
            if(this.zzB != null) {
                zzo.zzg("Attempt to create multiple AdWebViewVideoControllers.");
                return;
            }
            this.zzB = zzcfz0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzfbo zzD() {
        return this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final View zzF() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final WebView zzG() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzava zzI() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzazx zzJ() {
        synchronized(this) {
        }
        return this.zzG;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzbfk zzK() {
        synchronized(this) {
        }
        return this.zzE;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzm zzL() {
        synchronized(this) {
        }
        return this.zzp;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzm zzM() {
        synchronized(this) {
        }
        return this.zzO;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzcgp zzN() {
        return this.zzo;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzcgr zzO() {
        synchronized(this) {
        }
        return this.zzs;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzecp zzP() {
        synchronized(this) {
        }
        return this.zzr;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzecr zzQ() {
        synchronized(this) {
        }
        return this.zzq;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzfbr zzR() {
        return this.zzl;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzfcn zzS() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final t0 zzT() {
        return this.zze == null ? zzgch.zzh(null) : this.zze.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final String zzU() {
        synchronized(this) {
        }
        return this.zzt;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final List zzV() {
        return new ArrayList();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzW(zzfbo zzfbo0, zzfbr zzfbr0) {
        this.zzk = zzfbo0;
        this.zzl = zzfbr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzX() {
        synchronized(this) {
            zze.zza("Destroying WebView!");
            this.zzbb();
            zzcfv zzcfv0 = new zzcfv(this);
            zzs.zza.post(zzcfv0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzY() {
        this.zzbg();
        HashMap hashMap0 = new HashMap(1);
        hashMap0.put("version", this.zzf.afmaVersion);
        this.zzd("onhide", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzZ(int v) {
        if(v == 0) {
            zzbcs.zza(this.zzM.zza(), this.zzK, new String[]{"aebb2"});
        }
        this.zzbg();
        this.zzM.zza().zzd("close_type", String.valueOf(v));
        HashMap hashMap0 = new HashMap(2);
        hashMap0.put("closetype", String.valueOf(v));
        hashMap0.put("version", this.zzf.afmaVersion);
        this.zzd("onhide", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmw
    public final void zza(String s) {
        this.zzaT(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaA(String s, Predicate predicate0) {
        zzcff zzcff0 = this.zzo;
        if(zzcff0 != null) {
            zzcff0.zzQ(s, predicate0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaB() {
        synchronized(this) {
        }
        return this.zzu;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaC() {
        synchronized(this) {
        }
        return this.zzH > 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaD(boolean z, int v) {
        this.destroy();
        zzcfs zzcfs0 = new zzcfs(z, v);
        this.zzX.zzb(zzcfs0);
        this.zzX.zzc(10003);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaE() {
        synchronized(this) {
        }
        return this.zzv;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaF() {
        synchronized(this) {
        }
        return this.zzw;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaG() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaH() {
        synchronized(this) {
        }
        return this.zzz;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgh
    public final void zzaJ(zzc zzc0, boolean z, boolean z1, String s) {
        this.zzo.zzv(zzc0, z, z1, s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgh
    public final void zzaK(String s, String s1, int v) {
        this.zzo.zzw(s, s1, 14);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgh
    public final void zzaL(boolean z, int v, boolean z1) {
        this.zzo.zzx(z, v, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgh
    public final void zzaM(boolean z, int v, String s, String s1, boolean z1) {
        this.zzo.zzz(z, v, s, s1, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgh
    public final void zzaN(boolean z, int v, String s, boolean z1, boolean z2) {
        this.zzo.zzA(z, v, s, z1, z2);
    }

    public final zzcff zzaO() {
        return this.zzo;
    }

    @VisibleForTesting
    final Boolean zzaP() {
        synchronized(this) {
        }
        return this.zzy;
    }

    protected final void zzaS(String s, ValueCallback valueCallback0) {
        synchronized(this) {
            if(!this.zzaE()) {
                this.evaluateJavascript(s, null);
                return;
            }
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final void zzaT(String s) {
        if(this.zzaP() == null) {
            this.zzbj();
        }
        if(this.zzaP().booleanValue()) {
            this.zzaS(s, null);
            return;
        }
        this.zzaX("javascript:" + s);
    }

    // 检测为 Lambda 实现
    final void zzaU(String s, ValueCallback valueCallback0) [...]

    // 检测为 Lambda 实现
    final void zzaV(String s) [...]

    // 检测为 Lambda 实现
    final void zzaW(String s) [...]

    protected final void zzaX(String s) {
        synchronized(this) {
            if(!this.zzaE()) {
                this.loadUrl(s);
                return;
            }
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @VisibleForTesting
    final void zzaY(Boolean boolean0) {
        synchronized(this) {
            this.zzy = boolean0;
        }
        zzv.zzp().zzy(boolean0);
    }

    public final boolean zzaZ() {
        int v4;
        int v3;
        boolean z = false;
        if(this.zzo.zzT() || this.zzo.zzU()) {
            int v = zzf.zzv(this.zzi, this.zzi.widthPixels);
            int v1 = zzf.zzv(this.zzi, this.zzi.heightPixels);
            Activity activity0 = this.zzb.zza();
            if(activity0 == null || activity0.getWindow() == null) {
                v4 = v;
                v3 = v1;
            }
            else {
                int[] arr_v = zzs.zzQ(activity0);
                int v2 = zzf.zzv(this.zzi, arr_v[0]);
                v3 = zzf.zzv(this.zzi, arr_v[1]);
                v4 = v2;
            }
            int v5 = this.zzS;
            if(v5 != v || this.zzR != v1 || this.zzT != v4 || this.zzU != v3) {
                if(v5 != v || this.zzR != v1) {
                    z = true;
                }
                this.zzS = v;
                this.zzR = v1;
                this.zzT = v4;
                this.zzU = v3;
                new zzbsi(this, "").zzj(v, v1, v4, v3, this.zzi.density, this.zzW.getDefaultDisplay().getRotation());
                return z;
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaa() {
        if(this.zzJ == null) {
            zzbcs.zza(this.zzM.zza(), this.zzK, new String[]{"aes2"});
            zzbcx zzbcx0 = zzbda.zzf();
            this.zzJ = zzbcx0;
            this.zzM.zzb("native:view_show", zzbcx0);
        }
        HashMap hashMap0 = new HashMap(1);
        hashMap0.put("version", this.zzf.afmaVersion);
        this.zzd("onshow", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzab() {
        HashMap hashMap0 = new HashMap(3);
        hashMap0.put("app_muted", String.valueOf(zzv.zzs().zze()));
        hashMap0.put("app_volume", String.valueOf(zzv.zzs().zza()));
        hashMap0.put("device_volume", String.valueOf(zzab.zzb(this.getContext())));
        this.zzd("volume", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzac(boolean z) {
        this.zzo.zzj(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzad() {
        this.zzQ.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzae(String s, String s1, String s2) {
        String s4;
        synchronized(this) {
            if(!this.zzaE()) {
                String s3 = (String)zzbe.zzc().zza(zzbcl.zzab);
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("version", s3);
                    jSONObject0.put("sdk", "Google Mobile Ads");
                    jSONObject0.put("sdkVersion", "12.4.51-000");
                    s4 = "<script>Object.defineProperty(window,\'MRAID_ENV\',{get:function(){return " + jSONObject0.toString() + "}});</script>";
                }
                catch(JSONException jSONException0) {
                    zzo.zzk("Unable to build MRAID_ENV", jSONException0);
                    s4 = null;
                }
                super.loadDataWithBaseURL(s, zzcgi.zzb(s1, new String[]{s4}), "text/html", "UTF-8", null);
                return;
            }
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaf() {
        if(this.zzL == null) {
            zzbcx zzbcx0 = zzbda.zzf();
            this.zzL = zzbcx0;
            this.zzM.zzb("native:view_load", zzbcx0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzag(String s, zzbjp zzbjp0) {
        zzcff zzcff0 = this.zzo;
        if(zzcff0 != null) {
            zzcff0.zzB(s, zzbjp0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzah() {
        zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzai(zzm zzm0) {
        synchronized(this) {
            this.zzp = zzm0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaj(zzcgr zzcgr0) {
        synchronized(this) {
            this.zzs = zzcgr0;
            this.requestLayout();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzak(zzazx zzazx0) {
        synchronized(this) {
            this.zzG = zzazx0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzal(boolean z) {
        synchronized(this) {
            this.zzz = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzam() {
        this.setBackgroundColor(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzan(Context context0) {
        this.zzb.setBaseContext(context0);
        this.zzQ.zze(this.zzb.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzao(boolean z) {
        synchronized(this) {
            zzm zzm0 = this.zzp;
            if(zzm0 != null) {
                zzm0.zzy(this.zzo.zzT(), z);
                return;
            }
            this.zzu = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzap(zzbfi zzbfi0) {
        synchronized(this) {
            this.zzF = zzbfi0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaq(boolean z) {
        synchronized(this) {
            boolean z1 = this.zzw;
            this.zzw = z;
            this.zzba();
            if(z != z1 && (!((Boolean)zzbe.zzc().zza(zzbcl.zzac)).booleanValue() || !this.zzs.zzi())) {
                new zzbsi(this, "").zzl((z ? "expanded" : "default"));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzar(zzbfk zzbfk0) {
        synchronized(this) {
            this.zzE = zzbfk0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzas(zzecp zzecp0) {
        synchronized(this) {
            this.zzr = zzecp0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzat(zzecr zzecr0) {
        synchronized(this) {
            this.zzq = zzecr0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzau(int v) {
        synchronized(this) {
            zzm zzm0 = this.zzp;
            if(zzm0 != null) {
                zzm0.zzA(v);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzav(boolean z) {
        this.zzY = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaw(zzm zzm0) {
        synchronized(this) {
            this.zzO = zzm0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzax(boolean z) {
        synchronized(this) {
            int v1 = this.zzH + (z ? 1 : -1);
            this.zzH = v1;
            if(v1 <= 0) {
                zzm zzm0 = this.zzp;
                if(zzm0 != null) {
                    zzm0.zzE();
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzay(boolean z) {
        synchronized(this) {
            if(z) {
                this.setBackgroundColor(0);
            }
            zzm zzm0 = this.zzp;
            if(zzm0 != null) {
                zzm0.zzB(z);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzaz(String s, zzbjp zzbjp0) {
        zzcff zzcff0 = this.zzo;
        if(zzcff0 != null) {
            zzcff0.zzP(s, zzbjp0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbmw
    public final void zzb(String s, String s1) {
        this.zzaT(s + "(" + s1 + ");");
    }

    private final void zzba() {
        synchronized(this) {
            if(this.zzk != null && this.zzk.zzam) {
                zzo.zze("Disabling hardware acceleration on an overlay.");
                this.zzbc();
                return;
            }
            if(!this.zzw && !this.zzs.zzi()) {
                zzo.zze("Enabling hardware acceleration on an AdView.");
                this.zzbe();
                return;
            }
            zzo.zze("Enabling hardware acceleration on an overlay.");
            this.zzbe();
        }
    }

    private final void zzbb() {
        synchronized(this) {
            if(!this.zzP) {
                this.zzP = true;
                zzv.zzp().zzr();
            }
        }
    }

    private final void zzbc() {
        synchronized(this) {
            if(!this.zzx) {
                this.setLayerType(1, null);
            }
            this.zzx = true;
        }
    }

    private final void zzbd(boolean z) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("isVisible", (z ? "1" : "0"));
        this.zzd("onAdVisibilityChanged", hashMap0);
    }

    private final void zzbe() {
        synchronized(this) {
            if(this.zzx) {
                this.setLayerType(0, null);
            }
            this.zzx = false;
        }
    }

    private final void zzbf(String s) {
        synchronized(this) {
            try {
                zzcfr zzcfr0 = () -> super.loadUrl("about:blank");
                zzs.zza.post(zzcfr0);
            }
            catch(Throwable throwable0) {
                zzv.zzp().zzw(throwable0, "AdWebViewImpl.loadUrlUnsafe");
                zzo.zzk("Could not call loadUrl in destroy(). ", throwable0);
            }
        }
    }

    private final void zzbg() {
        zzbcs.zza(this.zzM.zza(), this.zzK, new String[]{"aeh2"});
    }

    private final void zzbh() {
        synchronized(this) {
            Map map0 = this.zzV;
            if(map0 != null) {
                for(Object object0: map0.values()) {
                    ((zzcde)object0).release();
                }
            }
            this.zzV = null;
        }
    }

    private final void zzbi() {
        zzbcy zzbcy0 = this.zzM;
        if(zzbcy0 != null) {
            zzbda zzbda0 = zzbcy0.zza();
            zzbcq zzbcq0 = zzv.zzp().zzg();
            if(zzbcq0 != null) {
                zzbcq0.zzf(zzbda0);
            }
        }
    }

    private final void zzbj() {
        synchronized(this) {
            Boolean boolean0 = zzv.zzp().zzl();
            this.zzy = boolean0;
            if(boolean0 == null) {
                try {
                    this.evaluateJavascript("(function(){})()", null);
                    this.zzaY(Boolean.TRUE);
                }
                catch(IllegalStateException unused_ex) {
                    this.zzaY(Boolean.FALSE);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbmk
    public final void zzd(String s, Map map0) {
        JSONObject jSONObject0;
        try {
            jSONObject0 = zzbc.zzb().zzj(map0);
        }
        catch(JSONException unused_ex) {
            zzo.zzj("Could not convert parameters to JSON.");
            return;
        }
        this.zze(s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzcff zzcff0 = this.zzo;
        if(zzcff0 != null) {
            zzcff0.zzdd();
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzn
    public final void zzde() {
        synchronized(this) {
            zzn zzn0 = this.zzg;
            if(zzn0 != null) {
                zzn0.zzde();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzn
    public final void zzdf() {
        synchronized(this) {
            zzn zzn0 = this.zzg;
            if(zzn0 != null) {
                zzn0.zzdf();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzdg() {
        zzm zzm0 = this.zzL();
        if(zzm0 != null) {
            zzm0.zzd();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayj0) {
        synchronized(this) {
            this.zzC = zzayj0.zzj;
        }
        this.zzbd(zzayj0.zzj);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmk
    public final void zze(String s, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("(window.AFMA_ReceiveMessage || function() {})(\'");
        stringBuilder0.append(s);
        stringBuilder0.append("\',");
        stringBuilder0.append(jSONObject0.toString());
        stringBuilder0.append(");");
        zzo.zze(("Dispatching AFMA event: " + stringBuilder0.toString()));
        this.zzaT(stringBuilder0.toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final int zzf() {
        synchronized(this) {
        }
        return this.zzN;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final int zzg() {
        return this.getMeasuredHeight();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final int zzh() {
        return this.getMeasuredWidth();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zza zzj() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final zzbcx zzk() {
        return this.zzK;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmw
    public final void zzl(String s, JSONObject jSONObject0) {
        this.zzb(s, jSONObject0.toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzbcy zzm() {
        return this.zzM;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final VersionInfoParcel zzn() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final zzcbh zzo() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final zzcde zzp(String s) {
        synchronized(this) {
            Map map0 = this.zzV;
            return map0 == null ? null : ((zzcde)map0.get(s));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final zzcfz zzq() {
        synchronized(this) {
        }
        return this.zzB;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final String zzr() {
        synchronized(this) {
            zzfbr zzfbr0 = this.zzl;
            if(zzfbr0 != null) {
                return zzfbr0.zzb;
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final String zzs() {
        synchronized(this) {
        }
        return this.zzA;
    }

    @Override  // com.google.android.gms.internal.ads.zzcex
    public final void zzt(String s, zzcde zzcde0) {
        synchronized(this) {
            if(this.zzV == null) {
                this.zzV = new HashMap();
            }
            this.zzV.put(s, zzcde0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        zzcff zzcff0 = this.zzo;
        if(zzcff0 != null) {
            zzcff0.zzu();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzv(boolean z, long v) {
        HashMap hashMap0 = new HashMap(2);
        hashMap0.put("success", (z ? "1" : "0"));
        hashMap0.put("duration", Long.toString(v));
        this.zzd("onCacheAccessComplete", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzw() {
        synchronized(this) {
            zzbfi zzbfi0 = this.zzF;
            if(zzbfi0 != null) {
                zzdmk zzdmk0 = new zzdmk(((zzdmm)zzbfi0));
                zzs.zza.post(zzdmk0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzx(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzy(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbs
    public final void zzz(boolean z) {
        this.zzo.zzE(false);
    }
}

