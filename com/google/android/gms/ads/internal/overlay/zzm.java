package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.impl.R.drawable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgr;
import com.google.android.gms.internal.ads.zzcwg;
import com.google.android.gms.internal.ads.zzdds;
import com.google.android.gms.internal.ads.zzdrv;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzebw;
import com.google.android.gms.internal.ads.zzebx;
import com.google.android.gms.internal.ads.zzecp;
import com.google.android.gms.internal.ads.zzecr;
import com.google.android.gms.internal.ads.zzfve;
import java.util.Collections;

public class zzm extends zzbtd implements zzag {
    @VisibleForTesting
    static final int zza;
    protected final Activity zzb;
    @Nullable
    @VisibleForTesting
    AdOverlayInfoParcel zzc;
    @VisibleForTesting
    zzcex zzd;
    @VisibleForTesting
    zzi zze;
    @VisibleForTesting
    zzu zzf;
    @VisibleForTesting
    boolean zzg;
    @VisibleForTesting
    FrameLayout zzh;
    @VisibleForTesting
    WebChromeClient.CustomViewCallback zzi;
    @VisibleForTesting
    boolean zzj;
    @VisibleForTesting
    boolean zzk;
    @VisibleForTesting
    zzh zzl;
    @VisibleForTesting
    boolean zzm;
    @VisibleForTesting
    int zzn;
    private final Object zzo;
    private final View.OnClickListener zzp;
    private Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Toolbar zzw;

    static {
        zzm.zza = 0;
    }

    public zzm(Activity activity0) {
        this.zzg = false;
        this.zzj = false;
        this.zzk = false;
        this.zzm = false;
        this.zzn = 1;
        this.zzo = new Object();
        this.zzp = new zzf(this);
        this.zzt = false;
        this.zzu = false;
        this.zzv = true;
        this.zzb = activity0;
    }

    public final void zzA(int v) {
        if(35 >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfQ)))) && 35 <= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfR))))) {
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfS)))) && v1 <= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfT))))) {
                return;
            }
        }
        try {
            this.zzb.setRequestedOrientation(v);
        }
        catch(Throwable throwable0) {
            zzv.zzp().zzv(throwable0, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z) {
        if(z) {
            this.zzl.setBackgroundColor(0);
            return;
        }
        this.zzl.setBackgroundColor(0xFF000000);
    }

    public final void zzC(View view0, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        FrameLayout frameLayout0 = new FrameLayout(this.zzb);
        this.zzh = frameLayout0;
        frameLayout0.setBackgroundColor(0xFF000000);
        this.zzh.addView(view0, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzs = true;
        this.zzi = webChromeClient$CustomViewCallback0;
        this.zzg = true;
    }

    protected final void zzD(boolean z) throws zzg {
        zzcex zzcex4;
        boolean z2;
        if(!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        Window window0 = this.zzb.getWindow();
        if(window0 != null) {
            zzcex zzcex0 = this.zzc.zzd;
            zzcgp zzcgp0 = zzcex0 == null ? null : zzcex0.zzN();
            boolean z1 = zzcgp0 != null && zzcgp0.zzT();
            this.zzm = false;
            if(z1) {
                int v = this.zzc.zzj;
                if(v == 6) {
                    z2 = this.zzb.getResources().getConfiguration().orientation == 1;
                    this.zzm = z2;
                }
                else if(v == 7) {
                    z2 = this.zzb.getResources().getConfiguration().orientation == 2;
                    this.zzm = z2;
                }
                else {
                    z2 = false;
                }
            }
            else {
                z2 = false;
            }
            zzo.zze(("Delay onShow to next orientation change: " + z2));
            this.zzA(this.zzc.zzj);
            window0.setFlags(0x1000000, 0x1000000);
            zzo.zze("Hardware acceleration on the AdActivity window enabled.");
            if(this.zzk) {
                this.zzl.setBackgroundColor(zzm.zza);
            }
            else {
                this.zzl.setBackgroundColor(0xFF000000);
            }
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
            if(z) {
                try {
                    zzcex zzcex1 = this.zzc.zzd;
                    zzcgr zzcgr0 = zzcex1 == null ? null : zzcex1.zzO();
                    zzcex zzcex2 = this.zzc.zzd;
                    String s = zzcex2 == null ? null : zzcex2.zzU();
                    zzcex zzcex3 = this.zzc.zzd;
                    zzcex4 = zzcfk.zza(this.zzb, zzcgr0, s, true, z1, null, null, this.zzc.zzm, null, null, (zzcex3 == null ? null : zzcex3.zzj()), zzbbj.zza(), null, null, null, null);
                    this.zzd = zzcex4;
                }
                catch(Exception exception0) {
                    zzo.zzh("Error obtaining webview.", exception0);
                    throw new zzg("Could not obtain webview for the overlay.", exception0);
                }
                zzcgp zzcgp1 = zzcex4.zzN();
                zzcex zzcex5 = this.zzc.zzd;
                zzcgp1.zzV(null, this.zzc.zzp, null, this.zzc.zze, this.zzc.zzi, true, null, (zzcex5 == null ? null : zzcex5.zzN().zzd()), null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzN().zzC(new zze(this));
                AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
                String s1 = adOverlayInfoParcel0.zzl;
                if(s1 == null) {
                    String s2 = adOverlayInfoParcel0.zzh;
                    if(s2 == null) {
                        throw new zzg("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel0.zzf, s2, "text/html", "UTF-8", null);
                }
                else {
                    this.zzd.loadUrl(s1);
                }
                zzcex zzcex6 = this.zzc.zzd;
                if(zzcex6 != null) {
                    zzcex6.zzaw(this);
                }
            }
            else {
                zzcex zzcex7 = this.zzc.zzd;
                this.zzd = zzcex7;
                zzcex7.zzan(this.zzb);
            }
            if(this.zzc.zzw) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzG(), false);
            }
            this.zzd.zzai(this);
            zzcex zzcex8 = this.zzc.zzd;
            if(zzcex8 != null) {
                zzm.zzL(zzcex8.zzQ(), this.zzl);
            }
            if(this.zzc.zzk != 5) {
                ViewParent viewParent0 = this.zzd.getParent();
                if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(this.zzd.zzF());
                }
                if(this.zzk) {
                    this.zzd.zzam();
                }
                if(!this.zzc.zzw || Build.VERSION.SDK_INT < 24) {
                    this.zzl.addView(this.zzd.zzF(), -1, -1);
                }
                else {
                    Toolbar toolbar0 = new Toolbar(this.zzb);
                    this.zzw = toolbar0;
                    toolbar0.setId(View.generateViewId());
                    this.zzd.zzF().setId(View.generateViewId());
                    this.zzw.setBackgroundColor(-12303292);
                    this.zzw.setVisibility(0);
                    try {
                        Drawable drawable0 = zzv.zzp().zze().getDrawable(drawable.admob_close_button_white_cross, null);
                        this.zzw.setNavigationIcon(drawable0);
                    }
                    catch(NullPointerException | Resources.NotFoundException nullPointerException0) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", nullPointerException0);
                    }
                    this.zzw.setNavigationOnClickListener(this.zzp);
                    this.zzw.setTitleMarginStart(0);
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
                    relativeLayout$LayoutParams0.addRule(10);
                    this.zzl.addView(this.zzw, relativeLayout$LayoutParams0);
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
                    relativeLayout$LayoutParams1.addRule(3, this.zzw.getId());
                    relativeLayout$LayoutParams1.addRule(12);
                    this.zzl.addView(this.zzd.zzF(), relativeLayout$LayoutParams1);
                    this.zzJ(this.zzw);
                }
            }
            if(!z && !this.zzm) {
                this.zze();
            }
            if(this.zzc.zzk != 5) {
                this.zzw(z1);
                if(this.zzd.zzaB()) {
                    this.zzy(z1, true);
                }
                return;
            }
            zzebw zzebw0 = zzebx.zze();
            zzebw0.zza(this.zzb);
            zzebw0.zzb(this);
            zzebw0.zzc(this.zzc.zzq);
            zzebw0.zzd(this.zzc.zzr);
            zzebx zzebx0 = zzebw0.zze();
            try {
                this.zzf(zzebx0);
                return;
            }
            catch(zzg | RemoteException zzg0) {
                throw new zzg(zzg0.getMessage(), zzg0);
            }
        }
        throw new zzg("Invalid activity, no window available.");
    }

    public final void zzE() {
        synchronized(this.zzo) {
            this.zzr = true;
            Runnable runnable0 = this.zzq;
            if(runnable0 != null) {
                zzs.zza.removeCallbacks(runnable0);
                zzs.zza.post(this.zzq);
            }
        }
    }

    protected final void zzF() {
        if(this.zzb.isFinishing() && !this.zzt) {
            this.zzt = true;
            zzcex zzcex0 = this.zzd;
            if(zzcex0 != null) {
                zzcex0.zzZ(this.zzn - 1);
                Object object0 = this.zzo;
                synchronized(object0) {
                    if(!this.zzr && this.zzd.zzaC()) {
                        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeQ)).booleanValue() && !this.zzu) {
                            AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
                            if(adOverlayInfoParcel0 != null) {
                                zzr zzr0 = adOverlayInfoParcel0.zzc;
                                if(zzr0 != null) {
                                    zzr0.zzdo();
                                }
                            }
                        }
                        zzd zzd0 = () -> if(!this.zzu) {
                            this.zzu = true;
                            zzcex zzcex0 = this.zzd;
                            if(zzcex0 != null) {
                                this.zzl.removeView(zzcex0.zzF());
                                zzi zzi0 = this.zze;
                                if(zzi0 != null) {
                                    this.zzd.zzan(zzi0.zzd);
                                    this.zzd.zzaq(false);
                                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzmz)).booleanValue() && this.zzd.getParent() != null) {
                                        ((ViewGroup)this.zzd.getParent()).removeView(this.zzd.zzF());
                                    }
                                    this.zze.zzc.addView(this.zzd.zzF(), this.zze.zza, this.zze.zzb);
                                    this.zze = null;
                                }
                                else if(this.zzb.getApplicationContext() != null) {
                                    this.zzd.zzan(this.zzb.getApplicationContext());
                                }
                                this.zzd = null;
                            }
                            AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
                            if(adOverlayInfoParcel0 != null) {
                                zzr zzr0 = adOverlayInfoParcel0.zzc;
                                if(zzr0 != null) {
                                    zzr0.zzds(this.zzn);
                                }
                            }
                            AdOverlayInfoParcel adOverlayInfoParcel1 = this.zzc;
                            if(adOverlayInfoParcel1 != null) {
                                zzcex zzcex1 = adOverlayInfoParcel1.zzd;
                                if(zzcex1 != null) {
                                    zzm.zzL(zzcex1.zzQ(), this.zzc.zzd.zzF());
                                }
                            }
                        };
                        this.zzq = zzd0;
                        long v1 = (long)(((Long)zzbe.zzc().zza(zzbcl.zzbg)));
                        zzs.zza.postDelayed(zzd0, v1);
                        return;
                    }
                }
            }
            this.zzc();
        }
    }

    public final void zzG(String s) {
        Toolbar toolbar0 = this.zzw;
        if(toolbar0 != null) {
            toolbar0.setSubtitle(s);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final boolean zzH() {
        this.zzn = 1;
        if(this.zzd == null) {
            return true;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean z = this.zzd.zzaH();
        if(!z) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return z;
    }

    private final void zzJ(View view0) {
        zzcex zzcex0 = this.zzd;
        if(zzcex0 != null) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzff)).booleanValue()) {
                zzecp zzecp0 = zzcex0.zzP();
                if(zzecp0 != null) {
                    zzecp0.zza(view0);
                    return;
                }
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzfe)).booleanValue()) {
                zzecr zzecr0 = zzcex0.zzQ();
                if(zzecr0 != null && zzecr0.zzb()) {
                    zzv.zzB().zzg(zzecr0.zza(), view0);
                }
            }
        }
    }

    private final void zzK(Configuration configuration0) {
        int v;
        boolean z = true;
        boolean z1 = false;
        boolean z2 = this.zzc != null && (this.zzc.zzo != null && this.zzc.zzo.zzb);
        boolean z3 = zzv.zzr().zzd(this.zzb, configuration0);
        if(this.zzk && !z2 && !((Boolean)zzbe.zzc().zza(zzbcl.zzaQ)).booleanValue()) {
            z = false;
        }
        else if(z3 && !((Boolean)zzbe.zzc().zza(zzbcl.zzaP)).booleanValue()) {
            z = false;
        }
        else if(this.zzc != null && (this.zzc.zzo != null && this.zzc.zzo.zzg)) {
            z1 = true;
        }
        Window window0 = this.zzb.getWindow();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzbn)).booleanValue()) {
            View view0 = window0.getDecorView();
            if(!z) {
                v = 0x100;
            }
            else if(z1) {
                v = 0x1706;
            }
            else {
                v = 5380;
            }
            view0.setSystemUiVisibility(v);
            return;
        }
        if(z) {
            window0.addFlags(0x400);
            window0.clearFlags(0x800);
            if(z1) {
                window0.getDecorView().setSystemUiVisibility(0x1002);
            }
            return;
        }
        window0.addFlags(0x800);
        window0.clearFlags(0x400);
    }

    private static final void zzL(@Nullable zzecr zzecr0, @Nullable View view0) {
        if(zzecr0 != null && view0 != null && (!((Boolean)zzbe.zzc().zza(zzbcl.zzfe)).booleanValue() || !zzecr0.zzb())) {
            zzv.zzB().zzj(zzecr0.zza(), view0);
        }
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        if(this.zzc != null && this.zzc.zzk == 5) {
            this.zzb.overridePendingTransition(0, 0);
            zzcex zzcex0 = this.zzd;
            if(zzcex0 != null) {
                zzcex0.zzai(null);
            }
        }
    }

    // 检测为 Lambda 实现
    @VisibleForTesting
    final void zzc() [...]

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzaa();
    }

    public final void zzf(zzebx zzebx0) throws zzg, RemoteException {
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
        if(adOverlayInfoParcel0 != null) {
            zzbsx zzbsx0 = adOverlayInfoParcel0.zzv;
            if(zzbsx0 != null) {
                zzbsx0.zzg(ObjectWrapper.wrap(zzebx0));
                return;
            }
        }
        throw new zzg("noioou");
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
        if(adOverlayInfoParcel0 != null && this.zzg) {
            this.zzA(adOverlayInfoParcel0.zzj);
        }
        if(this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0 = this.zzi;
        if(webChromeClient$CustomViewCallback0 != null) {
            webChromeClient$CustomViewCallback0.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzh(int v, int v1, Intent intent0) {
        if(v == 0xEC) {
            zzbcc zzbcc0 = zzbcl.zzmV;
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza(("Callback from intent launch with requestCode: 236 and resultCode: " + v1));
                zzcex zzcex0 = this.zzd;
                if(zzcex0 != null && zzcex0.zzN() != null) {
                    zzdrw zzdrw0 = zzcex0.zzN().zze();
                    if(zzdrw0 != null) {
                        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
                        if(adOverlayInfoParcel0 != null && ((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                            zzdrv zzdrv0 = zzdrw0.zza();
                            zzdrv0.zzb("action", "hilca");
                            zzdrv0.zzb("gqi", zzfve.zzc(adOverlayInfoParcel0.zzq));
                            zzdrv0.zzb("hilr", v1);
                            if(v1 == -1 && intent0 != null) {
                                String s = intent0.getStringExtra("callerPackage");
                                String s1 = intent0.getStringExtra("loadingStage");
                                if(s != null) {
                                    zzdrv0.zzb("hilcp", s);
                                }
                                if(s1 != null) {
                                    zzdrv0.zzb("hills", s1);
                                }
                            }
                            zzdrv0.zzf();
                        }
                    }
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzi() {
        this.zzn = 1;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzag
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzk(IObjectWrapper iObjectWrapper0) {
        this.zzK(((Configuration)ObjectWrapper.unwrap(iObjectWrapper0)));
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public void zzl(Bundle bundle0) {
        if(!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = bundle0 != null && bundle0.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            this.zzj = z;
            AdOverlayInfoParcel adOverlayInfoParcel0 = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = adOverlayInfoParcel0;
            if(adOverlayInfoParcel0 != null) {
                if(adOverlayInfoParcel0.zzw) {
                    if(Build.VERSION.SDK_INT >= 28) {
                        this.zzb.setShowWhenLocked(true);
                    }
                    else {
                        this.zzb.getWindow().addFlags(0x80000);
                    }
                }
                if(this.zzc.zzm.clientJarVersion > 7500000) {
                    this.zzn = 4;
                }
                if(this.zzb.getIntent() != null) {
                    this.zzv = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel1 = this.zzc;
                zzl zzl0 = adOverlayInfoParcel1.zzo;
                if(zzl0 != null) {
                    this.zzk = zzl0.zza;
                    if(zzl0.zza) {
                        goto label_24;
                    }
                }
                else if(adOverlayInfoParcel1.zzk == 5) {
                    this.zzk = true;
                label_24:
                    if(adOverlayInfoParcel1.zzk != 5 && zzl0.zzf != -1) {
                        new zzk(this, null).zzb();
                    }
                }
                else {
                    this.zzk = false;
                }
                if(bundle0 == null) {
                    if(this.zzv) {
                        zzcwg zzcwg0 = this.zzc.zzt;
                        if(zzcwg0 != null) {
                            zzcwg0.zze();
                        }
                        zzr zzr0 = this.zzc.zzc;
                        if(zzr0 != null) {
                            zzr0.zzdp();
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    if(adOverlayInfoParcel2.zzk != 1) {
                        zza zza0 = adOverlayInfoParcel2.zzb;
                        if(zza0 != null) {
                            zza0.onAdClicked();
                        }
                        zzdds zzdds0 = this.zzc.zzu;
                        if(zzdds0 != null) {
                            zzdds0.zzdd();
                        }
                    }
                }
                zzh zzh0 = new zzh(this.zzb, this.zzc.zzn, this.zzc.zzm.afmaVersion, this.zzc.zzs);
                this.zzl = zzh0;
                zzh0.setId(1000);
                zzv.zzr().zzk(this.zzb);
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                switch(adOverlayInfoParcel3.zzk) {
                    case 1: {
                        this.zzD(false);
                        return;
                    }
                    case 2: {
                        this.zze = new zzi(adOverlayInfoParcel3.zzd);
                        this.zzD(false);
                        return;
                    }
                    case 3: {
                        this.zzD(true);
                        return;
                    }
                    case 5: {
                        this.zzD(false);
                        return;
                    }
                    default: {
                        throw new zzg("Could not determine ad overlay type.");
                    }
                }
            }
            throw new zzg("Could not get info for ad overlay.");
        }
        catch(zzg zzg0) {
        }
        zzo.zzj(zzg0.getMessage());
        this.zzn = 4;
        this.zzb.finish();
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzm() {
        zzcex zzcex0 = this.zzd;
        if(zzcex0 != null) {
            try {
                this.zzl.removeView(zzcex0.zzF());
            }
            catch(NullPointerException unused_ex) {
            }
        }
        this.zzF();
    }

    public final void zzn() {
        if(this.zzm) {
            this.zzm = false;
            this.zze();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzo() {
        this.zzg();
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
        if(adOverlayInfoParcel0 != null) {
            zzr zzr0 = adOverlayInfoParcel0.zzc;
            if(zzr0 != null) {
                zzr0.zzdi();
            }
        }
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzeS)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        this.zzF();
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzp(int v, String[] arr_s, int[] arr_v) {
        if(v == 0x3039) {
            zzebw zzebw0 = zzebx.zze();
            zzebw0.zza(this.zzb);
            zzebw0.zzb((this.zzc.zzk == 5 ? this : null));
            zzebx zzebx0 = zzebw0.zze();
            try {
                this.zzc.zzv.zzf(arr_s, arr_v, ObjectWrapper.wrap(zzebx0));
            }
            catch(RemoteException unused_ex) {
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzq() {
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzr() {
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
        if(adOverlayInfoParcel0 != null) {
            zzr zzr0 = adOverlayInfoParcel0.zzc;
            if(zzr0 != null) {
                zzr0.zzdE();
            }
        }
        this.zzK(this.zzb.getResources().getConfiguration());
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzeS)).booleanValue()) {
            if(this.zzd != null && !this.zzd.zzaE()) {
                this.zzd.onResume();
                return;
            }
            zzo.zzj("The webview does not exist. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzs(Bundle bundle0) {
        bundle0.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzt() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeS)).booleanValue()) {
            if(this.zzd != null && !this.zzd.zzaE()) {
                this.zzd.onResume();
                return;
            }
            zzo.zzj("The webview does not exist. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzu() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeS)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        this.zzF();
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzv() {
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
        if(adOverlayInfoParcel0 != null) {
            zzr zzr0 = adOverlayInfoParcel0.zzc;
            if(zzr0 != null) {
                zzr0.zzdr();
            }
        }
    }

    public final void zzw(boolean z) {
        if(this.zzc.zzw) {
            return;
        }
        int v = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzeV)));
        int v1 = 0;
        int v2 = !((Boolean)zzbe.zzc().zza(zzbcl.zzbj)).booleanValue() && !z ? 0 : 1;
        zzt zzt0 = new zzt();
        zzt0.zzd = 50;
        zzt0.zza = 1 == v2 ? v : 0;
        if(1 != v2) {
            v1 = v;
        }
        zzt0.zzb = v1;
        zzt0.zzc = v;
        this.zzf = new zzu(this.zzb, zzt0, this);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10);
        relativeLayout$LayoutParams0.addRule((1 == v2 ? 11 : 9));
        this.zzy(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, relativeLayout$LayoutParams0);
        this.zzJ(this.zzf);
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzx() {
        this.zzs = true;
    }

    public final void zzy(boolean z, boolean z1) {
        boolean z2 = true;
        boolean z3 = ((Boolean)zzbe.zzc().zza(zzbcl.zzbh)).booleanValue() && (this.zzc != null && (this.zzc.zzo != null && this.zzc.zzo.zzh));
        boolean z4 = ((Boolean)zzbe.zzc().zza(zzbcl.zzbi)).booleanValue() && (this.zzc != null && (this.zzc.zzo != null && this.zzc.zzo.zzi));
        if(z && z1 && z3 && !z4) {
            new zzbsi(this.zzd, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzu0 = this.zzf;
        if(zzu0 != null) {
            if(!z4 && (!z1 || z3)) {
                z2 = false;
            }
            zzu0.zzb(z2);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        this.zzw(true);
    }
}

