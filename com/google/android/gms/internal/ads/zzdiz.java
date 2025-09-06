package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import o3.j;
import org.json.JSONObject;

@j
public final class zzdiz extends zzbgf implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkd {
    private final WeakReference zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;
    private zzdia zze;
    private zzayl zzf;

    public zzdiz(View view0, HashMap hashMap0, HashMap hashMap1) {
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
        view0.setOnTouchListener(this);
        view0.setOnClickListener(this);
        zzcaj.zza(view0, this);
        zzcaj.zzb(view0, this);
        this.zza = new WeakReference(view0);
        for(Object object0: hashMap0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            View view1 = (View)((Map.Entry)object0).getValue();
            if(view1 != null) {
                WeakReference weakReference0 = new WeakReference(view1);
                this.zzb.put(s, weakReference0);
                if(!"1098".equals(s) && !"3011".equals(s)) {
                    view1.setOnTouchListener(this);
                    view1.setClickable(true);
                    view1.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for(Object object1: hashMap1.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            View view2 = (View)map$Entry0.getValue();
            if(view2 != null) {
                String s1 = (String)map$Entry0.getKey();
                WeakReference weakReference1 = new WeakReference(view2);
                this.zzc.put(s1, weakReference1);
                view2.setOnTouchListener(this);
                view2.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzayl(view0.getContext(), view0);
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        synchronized(this) {
            zzdia zzdia0 = this.zze;
            if(zzdia0 != null) {
                zzdia0.zzD(view0, this.zzf(), this.zzl(), this.zzm(), true);
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        synchronized(this) {
            zzdia zzdia0 = this.zze;
            if(zzdia0 != null) {
                zzdia0.zzB(this.zzf(), this.zzl(), this.zzm(), zzdia.zzY(this.zzf()));
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        synchronized(this) {
            zzdia zzdia0 = this.zze;
            if(zzdia0 != null) {
                zzdia0.zzB(this.zzf(), this.zzl(), this.zzm(), zzdia.zzY(this.zzf()));
            }
        }
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        synchronized(this) {
            zzdia zzdia0 = this.zze;
            if(zzdia0 != null) {
                zzdia0.zzL(view0, motionEvent0, this.zzf());
            }
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbgg
    public final void zzb(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            if(this.zze != null) {
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                if(!(object0 instanceof View)) {
                    zzo.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.zze.zzN(((View)object0));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbgg
    public final void zzc(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            if(!(object0 instanceof zzdia)) {
                zzo.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
                return;
            }
            zzdia zzdia0 = this.zze;
            if(zzdia0 != null) {
                zzdia0.zzT(this);
            }
            if(((zzdia)object0).zzU()) {
                this.zze = (zzdia)object0;
                ((zzdia)object0).zzS(this);
                this.zze.zzK(this.zzf());
                return;
            }
            zzo.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbgg
    public final void zzd() {
        synchronized(this) {
            zzdia zzdia0 = this.zze;
            if(zzdia0 != null) {
                zzdia0.zzT(this);
                this.zze = null;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final View zzf() {
        return (View)this.zza.get();
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final View zzg(String s) {
        synchronized(this) {
            WeakReference weakReference0 = (WeakReference)this.zzd.get(s);
            return weakReference0 == null ? null : ((View)weakReference0.get());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final FrameLayout zzh() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final zzayl zzi() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final IObjectWrapper zzj() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final String zzk() {
        synchronized(this) {
        }
        return "1007";
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final Map zzl() {
        synchronized(this) {
        }
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final Map zzm() {
        synchronized(this) {
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final Map zzn() {
        synchronized(this) {
        }
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final JSONObject zzo() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final JSONObject zzp() {
        synchronized(this) {
            zzdia zzdia0 = this.zze;
            return zzdia0 != null ? zzdia0.zzj(this.zzf(), this.zzl(), this.zzm()) : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdkd
    public final void zzq(String s, View view0, boolean z) {
        synchronized(this) {
            WeakReference weakReference0 = new WeakReference(view0);
            this.zzd.put(s, weakReference0);
            if(!"1098".equals(s) && !"3011".equals(s)) {
                WeakReference weakReference1 = new WeakReference(view0);
                this.zzb.put(s, weakReference1);
                view0.setClickable(true);
                view0.setOnClickListener(this);
                view0.setOnTouchListener(this);
            }
        }
    }
}

