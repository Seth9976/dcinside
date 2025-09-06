package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class zzdjb extends zzbfz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkd {
    public static final zzfxn zza;
    private final String zzb;
    private Map zzc;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgcs zzf;
    private View zzg;
    private final int zzh;
    private zzdia zzi;
    private zzayl zzj;
    private IObjectWrapper zzk;
    private zzbft zzl;
    private boolean zzm;
    private boolean zzn;
    private GestureDetector zzo;

    static {
        zzdjb.zza = zzfxn.zzq("2011", "1009", "3010");
    }

    public zzdjb(FrameLayout frameLayout0, FrameLayout frameLayout1, int v) {
        String s1;
        this.zzc = new HashMap();
        this.zzk = null;
        this.zzn = false;
        this.zzd = frameLayout0;
        this.zze = frameLayout1;
        this.zzh = 244410000;
        String s = frameLayout0.getClass().getCanonicalName();
        if("com.google.android.gms.ads.formats.NativeContentAdView".equals(s)) {
            s1 = "1007";
        }
        else if("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(s)) {
            s1 = "2009";
        }
        else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(s);
            s1 = "3012";
        }
        this.zzb = s1;
        zzcaj.zza(frameLayout0, this);
        zzcaj.zzb(frameLayout0, this);
        this.zzf = zzbzw.zzf;
        this.zzj = new zzayl(this.zzd.getContext(), this.zzd);
        frameLayout0.setOnTouchListener(this);
        frameLayout0.setOnClickListener(this);
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        synchronized(this) {
            if(this.zzi != null && this.zzi.zzV()) {
                this.zzi.zzv();
                this.zzi.zzD(view0, this.zzd, this.zzl(), this.zzm(), false);
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        synchronized(this) {
            zzdia zzdia0 = this.zzi;
            if(zzdia0 != null) {
                FrameLayout frameLayout0 = this.zzd;
                zzdia0.zzB(frameLayout0, this.zzl(), this.zzm(), zzdia.zzY(frameLayout0));
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        synchronized(this) {
            zzdia zzdia0 = this.zzi;
            if(zzdia0 != null) {
                FrameLayout frameLayout0 = this.zzd;
                zzdia0.zzB(frameLayout0, this.zzl(), this.zzm(), zzdia.zzY(frameLayout0));
            }
        }
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        synchronized(this) {
            zzdia zzdia0 = this.zzi;
            if(zzdia0 != null) {
                zzdia0.zzL(view0, motionEvent0, this.zzd);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzls)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
                    this.zzo.onTouchEvent(motionEvent0);
                }
            }
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final IObjectWrapper zzb(String s) {
        synchronized(this) {
            return ObjectWrapper.wrap(this.zzg(s));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzc() {
        synchronized(this) {
            if(this.zzn) {
                return;
            }
            zzdia zzdia0 = this.zzi;
            if(zzdia0 != null) {
                zzdia0.zzT(this);
                this.zzi = null;
            }
            this.zzc.clear();
            this.zzd.removeAllViews();
            this.zze.removeAllViews();
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzg = null;
            this.zzj = null;
            this.zzn = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzd(IObjectWrapper iObjectWrapper0) {
        MotionEvent motionEvent0 = (MotionEvent)ObjectWrapper.unwrap(iObjectWrapper0);
        this.onTouch(this.zzd, motionEvent0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzdt(String s, IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            this.zzq(s, ((View)ObjectWrapper.unwrap(iObjectWrapper0)), true);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzdu(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            this.zzi.zzN(((View)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzdv(zzbft zzbft0) {
        synchronized(this) {
            if(!this.zzn) {
                this.zzm = true;
                this.zzl = zzbft0;
                zzdia zzdia0 = this.zzi;
                if(zzdia0 != null) {
                    zzdia0.zzc().zzb(zzbft0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzdw(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            if(this.zzn) {
                return;
            }
            this.zzk = iObjectWrapper0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzdx(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            if(this.zzn) {
                return;
            }
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            if(!(object0 instanceof zzdia)) {
                zzo.zzj("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            zzdia zzdia0 = this.zzi;
            if(zzdia0 != null) {
                zzdia0.zzT(this);
            }
            this.zzu();
            this.zzi = (zzdia)object0;
            ((zzdia)object0).zzS(this);
            this.zzi.zzK(this.zzd);
            this.zzi.zzu(this.zze);
            if(this.zzm) {
                this.zzi.zzc().zzb(this.zzl);
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzdY)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
                this.zzt(this.zzi.zzg());
            }
            this.zzv();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zze(IObjectWrapper iObjectWrapper0, int v) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final View zzf() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final View zzg(String s) {
        synchronized(this) {
            if(!this.zzn) {
                WeakReference weakReference0 = (WeakReference)this.zzc.get(s);
                if(weakReference0 != null) {
                    return (View)weakReference0.get();
                }
            }
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final zzayl zzi() {
        return this.zzj;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final IObjectWrapper zzj() {
        return this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final String zzk() {
        synchronized(this) {
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final Map zzl() {
        synchronized(this) {
        }
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final Map zzm() {
        synchronized(this) {
        }
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final Map zzn() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final JSONObject zzo() {
        synchronized(this) {
            zzdia zzdia0 = this.zzi;
            return zzdia0 != null ? zzdia0.zzi(this.zzd, this.zzl(), this.zzm()) : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final JSONObject zzp() {
        synchronized(this) {
            zzdia zzdia0 = this.zzi;
            return zzdia0 != null ? zzdia0.zzj(this.zzd, this.zzl(), this.zzm()) : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final void zzq(String s, View view0, boolean z) {
        synchronized(this) {
            if(!this.zzn) {
                if(view0 == null) {
                    this.zzc.remove(s);
                    return;
                }
                this.zzc.put(s, new WeakReference(view0));
                if(!"1098".equals(s) && !"3011".equals(s)) {
                    if(zzbv.zzi(this.zzh)) {
                        view0.setOnTouchListener(this);
                    }
                    view0.setClickable(true);
                    view0.setOnClickListener(this);
                }
            }
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    // 检测为 Lambda 实现
    final void zzs() [...]

    private final void zzt(String s) {
        byte[] arr_b;
        synchronized(this) {
            FrameLayout frameLayout0 = new FrameLayout(this.zze.getContext());
            frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context0 = this.zze.getContext();
            frameLayout0.setClickable(false);
            frameLayout0.setFocusable(false);
            if(!TextUtils.isEmpty(s)) {
                if(context0.getApplicationContext() != null) {
                    context0 = context0.getApplicationContext();
                }
                Resources resources0 = context0.getResources();
                if(resources0 != null) {
                    DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
                    if(displayMetrics0 != null) {
                        try {
                            arr_b = Base64.decode(s, 0);
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            zzo.zzk("Encountered invalid base64 watermark.", illegalArgumentException0);
                            this.zze.addView(frameLayout0);
                            return;
                        }
                        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
                        bitmapDrawable0.setTargetDensity(displayMetrics0.densityDpi);
                        bitmapDrawable0.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                        frameLayout0.setBackground(bitmapDrawable0);
                    }
                }
            }
            this.zze.addView(frameLayout0);
        }
    }

    private final void zzu() {
        synchronized(this) {
            zzdja zzdja0 = () -> {
                if(this.zzg == null) {
                    View view0 = new View(this.zzd.getContext());
                    this.zzg = view0;
                    view0.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if(this.zzd != this.zzg.getParent()) {
                    this.zzd.addView(this.zzg);
                }
            };
            this.zzf.execute(zzdja0);
        }
    }

    private final void zzv() {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzls)).booleanValue() && this.zzi.zza() != 0) {
                this.zzo = new GestureDetector(this.zzd.getContext(), new zzdjj(this.zzi, this));
            }
        }
    }
}

