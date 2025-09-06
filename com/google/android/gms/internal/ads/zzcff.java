package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o3.j;

@VisibleForTesting(otherwise = 3)
@j
public class zzcff extends WebViewClient implements zzcgp {
    @Nullable
    private zzdrw zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final HashSet zzF;
    @Nullable
    private final zzebv zzG;
    private View.OnAttachStateChangeListener zzH;
    @Nullable
    protected zzbxu zza;
    public static final int zzb;
    private final zzcex zzc;
    @Nullable
    private final zzbbj zzd;
    private final HashMap zze;
    private final Object zzf;
    private zza zzg;
    private zzr zzh;
    private zzcgn zzi;
    private zzcgo zzj;
    private zzbif zzk;
    private zzbih zzl;
    private zzdds zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private String zzq;
    private String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private zzac zzw;
    @Nullable
    private zzbsh zzx;
    private zzb zzy;
    private zzbsc zzz;

    @VisibleForTesting
    public zzcff(zzcex zzcex0, @Nullable zzbbj zzbbj0, boolean z, zzbsh zzbsh0, @Nullable zzbsc zzbsc0, @Nullable zzebv zzebv0) {
        this.zze = new HashMap();
        this.zzf = new Object();
        this.zzp = 0;
        this.zzq = "";
        this.zzr = "";
        this.zzd = zzbbj0;
        this.zzc = zzcex0;
        this.zzs = z;
        this.zzx = zzbsh0;
        this.zzz = null;
        this.zzF = new HashSet(Arrays.asList(((String)zzbe.zzc().zza(zzbcl.zzfC)).split(",")));
        this.zzG = zzebv0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zza zza0 = this.zzg;
        if(zza0 != null) {
            zza0.onAdClicked();
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView0, String s) {
        zze.zza(("Loading resource: " + s));
        Uri uri0 = Uri.parse(s);
        if("gmsg".equalsIgnoreCase(uri0.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri0.getHost())) {
            this.zzk(uri0);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        synchronized(this.zzf) {
            if(this.zzc.zzaE()) {
                zze.zza("Blank page loaded, 1...");
                this.zzc.zzX();
                return;
            }
        }
        this.zzB = true;
        zzcgo zzcgo0 = this.zzj;
        if(zzcgo0 != null) {
            zzcgo0.zza();
            this.zzj = null;
        }
        this.zzh();
        if(this.zzc.zzL() != null && ((Boolean)zzbe.zzc().zza(zzbcl.zzlM)).booleanValue()) {
            this.zzc.zzL().zzG(s);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, int v, String s, String s1) {
        this.zzo = true;
        this.zzp = v;
        this.zzq = s;
        this.zzr = s1;
    }

    @Override  // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
        boolean z = renderProcessGoneDetail0.didCrash();
        int v = renderProcessGoneDetail0.rendererPriorityAtExit();
        return this.zzc.zzaD(z, v);
    }

    @Override  // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
        return this.zzc(s, Collections.emptyMap());
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView0, KeyEvent keyEvent0) {
        int v = keyEvent0.getKeyCode();
        if(v != 0x4F && v != 0xDE) {
            switch(v) {
                case 85: 
                case 86: 
                case 87: 
                case 88: 
                case 89: 
                case 90: 
                case 91: {
                    break;
                }
                default: {
                    return v == 0x7E || v == 0x7F || v == 0x80 || v == 0x81 || v == 130;
                }
            }
        }
        return true;
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        zze.zza(("AdWebView shouldOverrideUrlLoading: " + s));
        Uri uri0 = Uri.parse(s);
        if("gmsg".equalsIgnoreCase(uri0.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri0.getHost())) {
            this.zzk(uri0);
            return true;
        }
        if(this.zzn && webView0 == this.zzc.zzG()) {
            String s1 = uri0.getScheme();
            if("http".equalsIgnoreCase(s1) || "https".equalsIgnoreCase(s1)) {
                zza zza0 = this.zzg;
                if(zza0 != null) {
                    zza0.onAdClicked();
                    zzbxu zzbxu0 = this.zza;
                    if(zzbxu0 != null) {
                        zzbxu0.zzh(s);
                    }
                    this.zzg = null;
                }
                zzdds zzdds0 = this.zzm;
                if(zzdds0 != null) {
                    zzdds0.zzdd();
                    this.zzm = null;
                }
                return super.shouldOverrideUrlLoading(webView0, s);
            }
        }
        if(!this.zzc.zzG().willNotDraw()) {
            try {
                zzava zzava0 = this.zzc.zzI();
                zzfcn zzfcn0 = this.zzc.zzS();
                if(!((Boolean)zzbe.zzc().zza(zzbcl.zzlR)).booleanValue() || zzfcn0 == null) {
                    if(zzava0 != null && zzava0.zzf(uri0)) {
                        Context context1 = this.zzc.getContext();
                        Activity activity1 = this.zzc.zzi();
                        uri0 = zzava0.zza(uri0, context1, ((View)this.zzc), activity1);
                    }
                }
                else if(zzava0 != null && zzava0.zzf(uri0)) {
                    Context context0 = this.zzc.getContext();
                    Activity activity0 = this.zzc.zzi();
                    uri0 = zzfcn0.zza(uri0, context0, ((View)this.zzc), activity0);
                }
            }
            catch(zzavb unused_ex) {
                zzo.zzj(("Unable to append parameter to URL: " + s));
            }
            zzb zzb0 = this.zzy;
            if(zzb0 != null && !zzb0.zzc()) {
                zzb0.zzb(s);
                return true;
            }
            this.zzv(new zzc("android.intent.action.VIEW", uri0.toString(), null, null, null, null, null, null), true, false, (this.zzc == null ? "" : this.zzc.zzr()));
            return true;
        }
        zzo.zzj(("AdWebView unable to handle URL: " + s));
        return true;
    }

    public final void zzA(boolean z, int v, String s, boolean z1, boolean z2) {
        boolean z3 = this.zzc.zzaF();
        boolean z4 = zzcff.zzac(z3, this.zzc);
        zza zza0 = z4 ? null : this.zzg;
        zzcfe zzcfe0 = z3 ? null : new zzcfe(this.zzc, this.zzh);
        zzbif zzbif0 = this.zzk;
        zzbih zzbih0 = this.zzl;
        zzac zzac0 = this.zzw;
        VersionInfoParcel versionInfoParcel0 = this.zzc.zzn();
        this.zzy(new AdOverlayInfoParcel(zza0, zzcfe0, zzbif0, zzbih0, zzac0, this.zzc, z, v, s, versionInfoParcel0, (z4 || !z1 ? null : this.zzm), (zzcff.zzab(this.zzc) ? this.zzG : null), z2));
    }

    public final void zzB(String s, zzbjp zzbjp0) {
        synchronized(this.zzf) {
            List list0 = (List)this.zze.get(s);
            if(list0 == null) {
                list0 = new CopyOnWriteArrayList();
                this.zze.put(s, list0);
            }
            list0.add(zzbjp0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzC(zzcgn zzcgn0) {
        this.zzi = zzcgn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzD(int v, int v1) {
        zzbsc zzbsc0 = this.zzz;
        if(zzbsc0 != null) {
            zzbsc0.zze(v, v1);
        }
    }

    public final void zzE(boolean z) {
        this.zzn = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzF(boolean z) {
        synchronized(this.zzf) {
            this.zzu = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzG(boolean z) {
        synchronized(this.zzf) {
            this.zzv = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzH() {
        synchronized(this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcez zzcez0 = () -> {
                this.zzc.zzad();
                zzm zzm0 = this.zzc.zzL();
                if(zzm0 != null) {
                    zzm0.zzz();
                }
            };
            zzbzw.zzf.execute(zzcez0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzI(boolean z) {
        synchronized(this.zzf) {
            this.zzt = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzJ(zzcgo zzcgo0) {
        this.zzj = zzcgo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzK(zzcmk zzcmk0, @Nullable zzebk zzebk0, @Nullable zzfja zzfja0) {
        this.zzO("/click");
        if(zzebk0 != null && zzfja0 != null) {
            this.zzB("/click", new zzfcr(this.zzm, zzcmk0, zzfja0, zzebk0));
            return;
        }
        this.zzB("/click", new zzbin(this.zzm, zzcmk0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzL(zzcmk zzcmk0) {
        this.zzO("/click");
        this.zzB("/click", new zzbin(this.zzm, zzcmk0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzM(zzcmk zzcmk0, @Nullable zzebk zzebk0, @Nullable zzdrw zzdrw0) {
        this.zzO("/open");
        this.zzB("/open", new zzbkb(this.zzy, this.zzz, zzebk0, zzdrw0, zzcmk0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzN(zzfbo zzfbo0) {
        if(zzv.zzo().zzp(this.zzc.getContext())) {
            this.zzO("/logScionEvent");
            new HashMap();
            this.zzB("/logScionEvent", new zzbjv(this.zzc.getContext(), zzfbo0.zzaw));
        }
    }

    public final void zzO(String s) {
        synchronized(this.zzf) {
            List list0 = (List)this.zze.get(s);
            if(list0 == null) {
                return;
            }
            list0.clear();
        }
    }

    public final void zzP(String s, zzbjp zzbjp0) {
        synchronized(this.zzf) {
            List list0 = (List)this.zze.get(s);
            if(list0 == null) {
                return;
            }
            list0.remove(zzbjp0);
        }
    }

    public final void zzQ(String s, Predicate predicate0) {
        synchronized(this.zzf) {
            List list0 = (List)this.zze.get(s);
            if(list0 == null) {
                return;
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: list0) {
                zzbjp zzbjp0 = (zzbjp)object1;
                if(predicate0.apply(zzbjp0)) {
                    arrayList0.add(zzbjp0);
                }
            }
            list0.removeAll(arrayList0);
        }
    }

    public final boolean zzR() {
        synchronized(this.zzf) {
        }
        return this.zzu;
    }

    public final boolean zzS() {
        synchronized(this.zzf) {
        }
        return this.zzv;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final boolean zzT() {
        synchronized(this.zzf) {
        }
        return this.zzs;
    }

    public final boolean zzU() {
        synchronized(this.zzf) {
        }
        return this.zzt;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzV(@Nullable zza zza0, @Nullable zzbif zzbif0, @Nullable zzr zzr0, @Nullable zzbih zzbih0, @Nullable zzac zzac0, boolean z, @Nullable zzbjs zzbjs0, @Nullable zzb zzb0, @Nullable zzbsj zzbsj0, @Nullable zzbxu zzbxu0, @Nullable zzebk zzebk0, @Nullable zzfja zzfja0, @Nullable zzdrw zzdrw0, @Nullable zzbkj zzbkj0, @Nullable zzdds zzdds0, @Nullable zzbki zzbki0, @Nullable zzbkc zzbkc0, @Nullable zzbjq zzbjq0, @Nullable zzcmk zzcmk0) {
        zzb zzb1 = zzb0 == null ? new zzb(this.zzc.getContext(), zzbxu0, null) : zzb0;
        this.zzz = new zzbsc(this.zzc, zzbsj0);
        this.zza = zzbxu0;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzbb)).booleanValue()) {
            this.zzB("/adMetadata", new zzbie(zzbif0));
        }
        if(zzbih0 != null) {
            this.zzB("/appEvent", new zzbig(zzbih0));
        }
        this.zzB("/backButton", zzbjo.zzj);
        this.zzB("/refresh", zzbjo.zzk);
        this.zzB("/canOpenApp", zzbjo.zzb);
        this.zzB("/canOpenURLs", zzbjo.zza);
        this.zzB("/canOpenIntents", zzbjo.zzc);
        this.zzB("/close", zzbjo.zzd);
        this.zzB("/customClose", zzbjo.zze);
        this.zzB("/instrument", zzbjo.zzn);
        this.zzB("/delayPageLoaded", zzbjo.zzp);
        this.zzB("/delayPageClosed", zzbjo.zzq);
        this.zzB("/getLocationInfo", zzbjo.zzr);
        this.zzB("/log", zzbjo.zzg);
        this.zzB("/mraid", new zzbjw(zzb1, this.zzz, zzbsj0));
        zzbsh zzbsh0 = this.zzx;
        if(zzbsh0 != null) {
            this.zzB("/mraidLoaded", zzbsh0);
        }
        this.zzB("/open", new zzbkb(zzb1, this.zzz, zzebk0, zzdrw0, zzcmk0));
        this.zzB("/precache", new zzcdf());
        this.zzB("/touch", zzbjo.zzi);
        this.zzB("/video", zzbjo.zzl);
        this.zzB("/videoMeta", zzbjo.zzm);
        if(zzebk0 == null || zzfja0 == null) {
            this.zzB("/click", new zzbin(zzdds0, zzcmk0));
            this.zzB("/httpTrack", zzbjo.zzf);
        }
        else {
            this.zzB("/click", new zzfcr(zzdds0, zzcmk0, zzfja0, zzebk0));
            this.zzB("/httpTrack", new zzfcs(zzfja0, zzebk0));
        }
        if(zzv.zzo().zzp(this.zzc.getContext())) {
            Map map0 = new HashMap();
            if(this.zzc.zzD() != null) {
                map0 = this.zzc.zzD().zzaw;
            }
            this.zzB("/logScionEvent", new zzbjv(this.zzc.getContext(), map0));
        }
        if(zzbjs0 != null) {
            this.zzB("/setInterstitialProperties", new zzbjr(zzbjs0));
        }
        if(zzbkj0 != null && ((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
            this.zzB("/inspectorNetworkExtras", zzbkj0);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjg)).booleanValue() && zzbki0 != null) {
            this.zzB("/shareSheet", zzbki0);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjl)).booleanValue() && zzbkc0 != null) {
            this.zzB("/inspectorOutOfContextTest", zzbkc0);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjp)).booleanValue() && zzbjq0 != null) {
            this.zzB("/inspectorStorage", zzbjq0);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlr)).booleanValue()) {
            this.zzB("/bindPlayStoreOverlay", zzbjo.zzu);
            this.zzB("/presentPlayStoreOverlay", zzbjo.zzv);
            this.zzB("/expandPlayStoreOverlay", zzbjo.zzw);
            this.zzB("/collapsePlayStoreOverlay", zzbjo.zzx);
            this.zzB("/closePlayStoreOverlay", zzbjo.zzy);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdr)).booleanValue()) {
            this.zzB("/setPAIDPersonalizationEnabled", zzbjo.zzA);
            this.zzB("/resetPAID", zzbjo.zzz);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlL)).booleanValue() && (this.zzc.zzD() != null && this.zzc.zzD().zzar)) {
            this.zzB("/writeToLocalStorage", zzbjo.zzB);
            this.zzB("/clearLocalStorageKeys", zzbjo.zzC);
        }
        this.zzg = zza0;
        this.zzh = zzr0;
        this.zzk = zzbif0;
        this.zzl = zzbih0;
        this.zzw = zzac0;
        this.zzy = zzb1;
        this.zzm = zzdds0;
        this.zzA = zzdrw0;
        this.zzn = z;
    }

    // 去混淆评级： 低(20)
    @Nullable
    private static WebResourceResponse zzW() {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzaU)).booleanValue() ? new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0])) : null;
    }

    @Nullable
    private final WebResourceResponse zzX(String s, Map map0) throws IOException {
        String s6;
        WebResourceResponse webResourceResponse0;
        URL uRL0 = new URL(s);
        try {
            TrafficStats.setThreadStatsTag(0x108);
            int v = 0;
            while(true) {
                ++v;
                if(v > 20) {
                    goto label_72;
                }
                URLConnection uRLConnection0 = uRL0.openConnection();
                uRLConnection0.setConnectTimeout(10000);
                uRLConnection0.setReadTimeout(10000);
                for(Object object0: map0.entrySet()) {
                    uRLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
                if(!(uRLConnection0 instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                zzv.zzq().zzf(this.zzc.getContext(), this.zzc.zzn().afmaVersion, false, ((HttpURLConnection)uRLConnection0), false, 60000);
                webResourceResponse0 = null;
                zzl zzl0 = new zzl(null);
                zzl0.zzc(((HttpURLConnection)uRLConnection0), null);
                int v1 = ((HttpURLConnection)uRLConnection0).getResponseCode();
                zzl0.zze(((HttpURLConnection)uRLConnection0), v1);
                if(v1 >= 300 && v1 < 400) {
                    String s5 = ((HttpURLConnection)uRLConnection0).getHeaderField("Location");
                    if(s5 == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if(!s5.startsWith("tel:")) {
                        URL uRL1 = new URL(uRL0, s5);
                        s6 = uRL1.getProtocol();
                        if(s6 == null) {
                            zzo.zzj("Protocol is null");
                            webResourceResponse0 = zzcff.zzW();
                            TrafficStats.clearThreadStatsTag();
                            return webResourceResponse0;
                        }
                        else {
                            if(s6.equals("http") || s6.equals("https")) {
                                zzo.zze(("Redirecting to " + s5));
                                ((HttpURLConnection)uRLConnection0).disconnect();
                                uRL0 = uRL1;
                                continue;
                            }
                            break;
                        }
                    }
                }
                else {
                    String s1 = "";
                    String s2 = ((HttpURLConnection)uRLConnection0).getContentType();
                    String s3 = TextUtils.isEmpty(s2) ? "" : s2.split(";")[0].trim();
                    String s4 = ((HttpURLConnection)uRLConnection0).getContentType();
                    if(!TextUtils.isEmpty(s4)) {
                        String[] arr_s = s4.split(";");
                        if(arr_s.length != 1) {
                            for(int v2 = 1; v2 < arr_s.length; ++v2) {
                                if(arr_s[v2].trim().startsWith("charset")) {
                                    String[] arr_s1 = arr_s[v2].trim().split("=");
                                    if(arr_s1.length > 1) {
                                        s1 = arr_s1[1].trim();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    Map map1 = ((HttpURLConnection)uRLConnection0).getHeaderFields();
                    HashMap hashMap0 = new HashMap(map1.size());
                    for(Object object1: map1.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object1;
                        if(map$Entry0.getKey() != null && map$Entry0.getValue() != null && !((List)map$Entry0.getValue()).isEmpty()) {
                            hashMap0.put(((String)map$Entry0.getKey()), ((String)((List)map$Entry0.getValue()).get(0)));
                        }
                    }
                    webResourceResponse0 = zzv.zzr().zzb(s3, s1, ((HttpURLConnection)uRLConnection0).getResponseCode(), ((HttpURLConnection)uRLConnection0).getResponseMessage(), hashMap0, ((HttpURLConnection)uRLConnection0).getInputStream());
                }
                goto label_70;
            }
            zzo.zzj(("Unsupported scheme: " + s6));
            webResourceResponse0 = zzcff.zzW();
        }
        catch(Throwable throwable0) {
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        }
    label_70:
        TrafficStats.clearThreadStatsTag();
        return webResourceResponse0;
    label_72:
        TrafficStats.clearThreadStatsTag();
        throw new IOException("Too many redirects (20)");
    }

    private final void zzY(Map map0, List list0, String s) {
        if(zze.zzc()) {
            zze.zza(("Received GMSG: " + s));
            for(Object object0: map0.keySet()) {
                zze.zza(("  " + ((String)object0) + ": " + ((String)map0.get(((String)object0)))));
            }
        }
        for(Object object1: list0) {
            ((zzbjp)object1).zza(this.zzc, map0);
        }
    }

    private final void zzZ() {
        View.OnAttachStateChangeListener view$OnAttachStateChangeListener0 = this.zzH;
        if(view$OnAttachStateChangeListener0 == null) {
            return;
        }
        ((View)this.zzc).removeOnAttachStateChangeListener(view$OnAttachStateChangeListener0);
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized(this.zzf) {
        }
        return null;
    }

    private final void zzaa(View view0, zzbxu zzbxu0, int v) {
        if(zzbxu0.zzi() && v > 0) {
            zzbxu0.zzg(view0);
            if(zzbxu0.zzi()) {
                zzcey zzcey0 = () -> this.zzaa(view0, zzbxu0, v - 1);
                zzs.zza.postDelayed(zzcey0, 100L);
            }
        }
    }

    private static final boolean zzab(zzcex zzcex0) {
        return zzcex0.zzD() != null && zzcex0.zzD().zzb();
    }

    // 去混淆评级： 低(30)
    private static final boolean zzac(boolean z, zzcex zzcex0) {
        return z && !zzcex0.zzO().zzi() && !zzcex0.zzU().equals("interstitial_mb");
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized(this.zzf) {
        }
        return null;
    }

    @Nullable
    protected final WebResourceResponse zzc(String s, Map map0) {
        String s2;
        boolean z;
        InputStream inputStream2;
        zzbbh zzbbh0;
        InputStream inputStream1;
        Future future0;
        long v4;
        long v3;
        int v2;
        HashMap hashMap0;
        try {
            Map map1 = new HashMap();
            if(this.zzc.zzD() != null) {
                map1 = this.zzc.zzD().zzaw;
            }
            String s1 = zzbyk.zzc(s, this.zzc.getContext(), this.zzE, map1);
            if(!s1.equals(s)) {
                return this.zzX(s1, map0);
            }
            zzbav zzbav0 = zzbav.zza(Uri.parse(s));
            if(zzbav0 != null) {
                hashMap0 = new HashMap();
                hashMap0.put("Access-Control-Allow-Origin", "*");
                Uri uri0 = Uri.parse(s);
                if(uri0.getQueryParameterNames().contains("range")) {
                    List list0 = zzfvc.zzb(zzfty.zzc('-')).zzf(uri0.getQueryParameter("range"));
                    if(list0.size() == 2) {
                        int v = Integer.parseInt(((String)list0.get(0)));
                        int v1 = Integer.parseInt(((String)list0.get(1)));
                        if(v > 0) {
                            zzbav0.zzh = (long)v;
                        }
                        v2 = v1 + 1 - v;
                    }
                    else {
                        v2 = -1;
                    }
                }
                else {
                    v2 = -1;
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzeq)).booleanValue()) {
                    zzbav0.zzi = zzfve.zzc(this.zzc.zzr());
                    zzbav0.zzj = this.zzc.zzf();
                    v3 = (long)(zzbav0.zzg ? ((Long)zzbe.zzc().zza(zzbcl.zzes)) : ((Long)zzbe.zzc().zza(zzbcl.zzer)));
                    v4 = zzv.zzC().elapsedRealtime();
                    future0 = zzbbg.zza(this.zzc.getContext(), zzbav0);
                    goto label_43;
                }
                else {
                    zzbas zzbas0 = zzv.zzc().zzb(zzbav0);
                    if(zzbas0 == null || !zzbas0.zze()) {
                        inputStream1 = null;
                    }
                    else {
                        hashMap0.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbas0.zzd()));
                        hashMap0.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbas0.zzg()));
                        hashMap0.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbas0.zzf()));
                        hashMap0.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbas0.zza()));
                        InputStream inputStream0 = zzbas0.zzc();
                        inputStream1 = v2 == -1 ? inputStream0 : zzgad.zza(inputStream0, ((long)v2));
                    }
                }
                goto label_105;
            }
            return !zzl.zzk() || !((Boolean)zzbeh.zzb.zze()).booleanValue() ? null : this.zzX(s, map0);
        }
        catch(Exception | NoClassDefFoundError exception0) {
            zzv.zzp().zzw(exception0, "AdWebViewClient.interceptRequest");
            return zzcff.zzW();
        }
        try {
        label_43:
            zzbbh0 = (zzbbh)future0.get(v3, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | TimeoutException executionException0) {
            inputStream2 = null;
            z = false;
            goto label_70;
        }
        catch(InterruptedException interruptedException0) {
            inputStream2 = null;
            z = false;
            goto label_80;
        }
        catch(Throwable throwable0) {
            z = false;
            goto label_94;
        }
        try {
            hashMap0.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbbh0.zzd()));
            hashMap0.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbbh0.zzf()));
            hashMap0.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbbh0.zze()));
            hashMap0.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbbh0.zza()));
            inputStream2 = zzbbh0.zzc();
            goto label_65;
        }
        catch(ExecutionException | TimeoutException executionException0) {
        }
        catch(InterruptedException interruptedException0) {
            goto label_79;
        }
        catch(Throwable throwable0) {
            goto label_93;
        }
        inputStream2 = null;
        goto label_69;
    label_65:
        if(v2 == -1) {
            goto label_99;
        }
        else {
            try {
                inputStream2 = zzgad.zza(inputStream2, ((long)v2));
                goto label_99;
            }
            catch(ExecutionException | TimeoutException executionException0) {
            }
            catch(InterruptedException interruptedException0) {
                goto label_79;
            }
            catch(Throwable throwable0) {
                goto label_93;
            }
        label_69:
            z = true;
            try {
            label_70:
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzev)).booleanValue()) {
                    zzv.zzp().zzw(executionException0, "AdWebViewClient.interceptRequest.gcache");
                }
                future0.cancel(true);
            }
            catch(Throwable throwable0) {
                goto label_94;
            }
            try {
                long v5 = zzv.zzC().elapsedRealtime() - v4;
                zzcfb zzcfb0 = () -> this.zzc.zzv(z, v5);
                zzs.zza.post(zzcfb0);
                s2 = "Cache connection took " + v5 + "ms";
                goto label_103;
            }
            catch(Exception | NoClassDefFoundError exception0) {
                zzv.zzp().zzw(exception0, "AdWebViewClient.interceptRequest");
                return zzcff.zzW();
            }
        label_79:
            z = true;
            try {
            label_80:
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzev)).booleanValue()) {
                    zzv.zzp().zzw(interruptedException0, "AdWebViewClient.interceptRequest.gcache");
                }
                future0.cancel(true);
                Thread.currentThread().interrupt();
                goto label_87;
            }
            catch(Throwable throwable0) {
            }
            goto label_94;
            try {
            label_87:
                long v6 = zzv.zzC().elapsedRealtime() - v4;
                zzcfb zzcfb1 = () -> this.zzc.zzv(z, v6);
                zzs.zza.post(zzcfb1);
                s2 = "Cache connection took " + v6 + "ms";
                goto label_103;
            label_93:
                z = true;
            label_94:
                long v7 = zzv.zzC().elapsedRealtime() - v4;
                zzcfb zzcfb2 = () -> this.zzc.zzv(z, v7);
                zzs.zza.post(zzcfb2);
                zze.zza(("Cache connection took " + v7 + "ms"));
                throw throwable0;
            label_99:
                long v8 = zzv.zzC().elapsedRealtime() - v4;
                zzcfb zzcfb3 = () -> this.zzc.zzv(true, v8);
                zzs.zza.post(zzcfb3);
                s2 = "Cache connection took " + v8 + "ms";
            label_103:
                zze.zza(s2);
                inputStream1 = inputStream2;
            label_105:
                if(inputStream1 != null) {
                    return new WebResourceResponse("", "", 200, "OK", hashMap0, inputStream1);
                }
                return !zzl.zzk() || !((Boolean)zzbeh.zzb.zze()).booleanValue() ? null : this.zzX(s, map0);
            }
            catch(Exception | NoClassDefFoundError exception0) {
            }
        }
        zzv.zzp().zzw(exception0, "AdWebViewClient.interceptRequest");
        return zzcff.zzW();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final zzb zzd() {
        return this.zzy;
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzdds zzdds0 = this.zzm;
        if(zzdds0 != null) {
            zzdds0.zzdd();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final zzdrw zze() {
        return this.zzA;
    }

    static void zzg(zzcff zzcff0, View view0, zzbxu zzbxu0, int v) {
        zzcff0.zzaa(view0, zzbxu0, 10);
    }

    public final void zzh() {
        if(this.zzi != null && (this.zzB && this.zzD <= 0 || this.zzC || this.zzo)) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && this.zzc.zzm() != null) {
                zzbcs.zza(this.zzc.zzm().zza(), this.zzc.zzk(), new String[]{"awfllc"});
            }
            this.zzi.zza(!this.zzC && !this.zzo, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzi() {
        zzbxu zzbxu0 = this.zza;
        if(zzbxu0 != null) {
            zzbxu0.zze();
            this.zza = null;
        }
        this.zzZ();
        synchronized(this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbsc zzbsc0 = this.zzz;
            if(zzbsc0 != null) {
                zzbsc0.zza(true);
                this.zzz = null;
            }
        }
    }

    public final void zzj(boolean z) {
        this.zzE = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzk(Uri uri0) {
        zze.zza(("Received GMSG: " + uri0));
        String s = uri0.getPath();
        List list0 = (List)this.zze.get(s);
        if(s != null && list0 != null) {
            String s1 = uri0.getEncodedQuery();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzfB)).booleanValue() && this.zzF.contains(s) && s1 != null && s1.length() >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfD))))) {
                zze.zza(("Parsing gmsg query params on BG thread: " + s));
                zzgch.zzr(zzv.zzq().zzb(uri0), new zzcfd(this, list0, s, uri0), zzbzw.zzf);
                return;
            }
            this.zzY(zzs.zzP(uri0), list0, s);
            return;
        }
        zze.zza(("No GMSG handler found for GMSG: " + uri0));
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgB)).booleanValue() && zzv.zzp().zzg() != null) {
            zzcfa zzcfa0 = new zzcfa((s == null || s.length() < 2 ? "null" : s.substring(1)));
            zzbzw.zza.execute(zzcfa0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzl() {
        zzbbj zzbbj0 = this.zzd;
        if(zzbbj0 != null) {
            zzbbj0.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        this.zzh();
        this.zzc.destroy();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzm() {
        synchronized(this.zzf) {
        }
        ++this.zzD;
        this.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzn() {
        --this.zzD;
        this.zzh();
    }

    // 检测为 Lambda 实现
    final void zzo() [...]

    // 检测为 Lambda 实现
    final void zzp(boolean z, long v) [...]

    // 检测为 Lambda 实现
    final void zzq(View view0, zzbxu zzbxu0, int v) [...]

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzr(int v, int v1, boolean z) {
        zzbsh zzbsh0 = this.zzx;
        if(zzbsh0 != null) {
            zzbsh0.zzb(v, v1);
        }
        zzbsc zzbsc0 = this.zzz;
        if(zzbsc0 != null) {
            zzbsc0.zzd(v, v1, false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgp
    public final void zzs() {
        zzbxu zzbxu0 = this.zza;
        if(zzbxu0 != null) {
            WebView webView0 = this.zzc.zzG();
            if(ViewCompat.T0(webView0)) {
                this.zzaa(webView0, zzbxu0, 10);
                return;
            }
            this.zzZ();
            zzcfc zzcfc0 = new zzcfc(this, zzbxu0);
            this.zzH = zzcfc0;
            ((View)this.zzc).addOnAttachStateChangeListener(zzcfc0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        zzdds zzdds0 = this.zzm;
        if(zzdds0 != null) {
            zzdds0.zzu();
        }
    }

    public final void zzv(zzc zzc0, boolean z, boolean z1, String s) {
        boolean z2 = this.zzc.zzaF();
        boolean z3 = false;
        boolean z4 = zzcff.zzac(z2, this.zzc) || z1;
        if(z4 || !z) {
            z3 = true;
        }
        this.zzy(new AdOverlayInfoParcel(zzc0, (z4 ? null : this.zzg), (z2 ? null : this.zzh), this.zzw, this.zzc.zzn(), this.zzc, (z3 ? null : this.zzm), s));
    }

    public final void zzw(String s, String s1, int v) {
        VersionInfoParcel versionInfoParcel0 = this.zzc.zzn();
        this.zzy(new AdOverlayInfoParcel(this.zzc, versionInfoParcel0, s, s1, 14, this.zzG));
    }

    public final void zzx(boolean z, int v, boolean z1) {
        boolean z2 = zzcff.zzac(this.zzc.zzaF(), this.zzc);
        zza zza0 = z2 ? null : this.zzg;
        zzr zzr0 = this.zzh;
        zzac zzac0 = this.zzw;
        VersionInfoParcel versionInfoParcel0 = this.zzc.zzn();
        this.zzy(new AdOverlayInfoParcel(zza0, zzr0, zzac0, this.zzc, z, v, versionInfoParcel0, (z2 || !z1 ? null : this.zzm), (zzcff.zzab(this.zzc) ? this.zzG : null)));
    }

    public final void zzy(AdOverlayInfoParcel adOverlayInfoParcel0) {
        boolean z = this.zzz == null ? false : this.zzz.zzf();
        zzn.zza(this.zzc.getContext(), adOverlayInfoParcel0, !z, this.zzA);
        zzbxu zzbxu0 = this.zza;
        if(zzbxu0 != null) {
            String s = adOverlayInfoParcel0.zzl;
            if(s == null) {
                zzc zzc0 = adOverlayInfoParcel0.zza;
                if(zzc0 != null) {
                    s = zzc0.zzb;
                }
            }
            zzbxu0.zzh(s);
        }
    }

    public final void zzz(boolean z, int v, String s, String s1, boolean z1) {
        boolean z2 = this.zzc.zzaF();
        boolean z3 = zzcff.zzac(z2, this.zzc);
        zza zza0 = z3 ? null : this.zzg;
        zzcfe zzcfe0 = z2 ? null : new zzcfe(this.zzc, this.zzh);
        zzbif zzbif0 = this.zzk;
        zzbih zzbih0 = this.zzl;
        zzac zzac0 = this.zzw;
        VersionInfoParcel versionInfoParcel0 = this.zzc.zzn();
        this.zzy(new AdOverlayInfoParcel(zza0, zzcfe0, zzbif0, zzbih0, zzac0, this.zzc, z, v, s, s1, versionInfoParcel0, (z3 || !z1 ? null : this.zzm), (zzcff.zzab(this.zzc) ? this.zzG : null)));
    }
}

