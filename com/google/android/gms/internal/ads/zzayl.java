package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class zzayl implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    @Nullable
    @VisibleForTesting
    BroadcastReceiver zza;
    final WeakReference zzb;
    private static final long zzc;
    private final Context zzd;
    private Application zze;
    private final WindowManager zzf;
    private final PowerManager zzg;
    private final KeyguardManager zzh;
    private WeakReference zzi;
    private zzayx zzj;
    private final zzbx zzk;
    private boolean zzl;
    private int zzm;
    private final HashSet zzn;
    private final DisplayMetrics zzo;
    private final Rect zzp;

    static {
        zzayl.zzc = (long)(((Long)zzbe.zzc().zza(zzbcl.zzbv)));
    }

    public zzayl(Context context0, View view0) {
        this.zzk = new zzbx(zzayl.zzc);
        this.zzl = false;
        this.zzm = -1;
        this.zzn = new HashSet();
        Context context1 = context0.getApplicationContext();
        this.zzd = context1;
        WindowManager windowManager0 = (WindowManager)context1.getSystemService("window");
        this.zzf = windowManager0;
        this.zzg = (PowerManager)context1.getSystemService("power");
        this.zzh = (KeyguardManager)context1.getSystemService("keyguard");
        if(context1 instanceof Application) {
            this.zze = (Application)context1;
            this.zzj = new zzayx(((Application)context1), this);
        }
        this.zzo = context0.getResources().getDisplayMetrics();
        Rect rect0 = new Rect();
        this.zzp = rect0;
        rect0.right = windowManager0.getDefaultDisplay().getWidth();
        rect0.bottom = windowManager0.getDefaultDisplay().getHeight();
        View view1 = this.zzb == null ? null : ((View)this.zzb.get());
        if(view1 != null) {
            view1.removeOnAttachStateChangeListener(this);
            this.zzm(view1);
        }
        this.zzb = new WeakReference(view0);
        if(view0 != null) {
            if(view0.isAttachedToWindow()) {
                this.zzl(view0);
            }
            view0.addOnAttachStateChangeListener(this);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        this.zzi(activity0, 0);
        this.zzj(3);
        this.zzk();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        this.zzj(3);
        this.zzk();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.zzi(activity0, 4);
        this.zzj(3);
        this.zzk();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        this.zzi(activity0, 0);
        this.zzj(3);
        this.zzk();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        this.zzj(3);
        this.zzk();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        this.zzi(activity0, 0);
        this.zzj(3);
        this.zzk();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        this.zzj(3);
        this.zzk();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.zzj(2);
        this.zzk();
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        this.zzj(1);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.zzm = -1;
        this.zzl(view0);
        this.zzj(3);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        this.zzm = -1;
        this.zzj(3);
        this.zzk();
        this.zzm(view0);
    }

    final Rect zza(Rect rect0) {
        return new Rect(this.zzh(rect0.left), this.zzh(rect0.top), this.zzh(rect0.right), this.zzh(rect0.bottom));
    }

    static void zzb(zzayl zzayl0, int v) {
        zzayl0.zzj(3);
    }

    public final void zzc(zzayk zzayk0) {
        this.zzn.add(zzayk0);
        this.zzj(3);
    }

    // 检测为 Lambda 实现
    final void zzd() [...]

    public final void zze(zzayk zzayk0) {
        this.zzn.remove(zzayk0);
    }

    public final void zzf() {
        this.zzk.zza(zzayl.zzc);
    }

    public final void zzg(long v) {
        this.zzk.zza(v);
    }

    private final int zzh(int v) {
        return (int)(((float)v) / this.zzo.density);
    }

    private final void zzi(Activity activity0, int v) {
        if(this.zzb != null) {
            Window window0 = activity0.getWindow();
            if(window0 != null) {
                View view0 = window0.peekDecorView();
                View view1 = (View)this.zzb.get();
                if(view1 != null && view0 != null && view1.getRootView() == view0.getRootView()) {
                    this.zzm = v;
                }
            }
        }
    }

    private final void zzj(int v) {
        boolean z2;
        List list0;
        View view1;
        boolean z1;
        boolean z;
        if(!this.zzn.isEmpty()) {
            WeakReference weakReference0 = this.zzb;
            if(weakReference0 != null) {
                View view0 = (View)weakReference0.get();
                Rect rect0 = new Rect();
                Rect rect1 = new Rect();
                Rect rect2 = new Rect();
                Rect rect3 = new Rect();
                int[] arr_v = new int[2];
                int[] arr_v1 = new int[2];
                if(view0 == null) {
                    view1 = null;
                    z = false;
                    z1 = false;
                }
                else {
                    z = view0.getGlobalVisibleRect(rect1);
                    z1 = view0.getLocalVisibleRect(rect2);
                    view0.getHitRect(rect3);
                    try {
                        view0.getLocationOnScreen(arr_v);
                        view0.getLocationInWindow(arr_v1);
                    }
                    catch(Exception exception0) {
                        zzo.zzh("Failure getting view location.", exception0);
                    }
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzeU)).booleanValue()) {
                        rect0.left = arr_v1[0];
                        rect0.top = arr_v1[1];
                    }
                    else {
                        rect0.left = arr_v[0];
                        rect0.top = arr_v[1];
                    }
                    rect0.right = rect0.left + view0.getWidth();
                    rect0.bottom = rect0.top + view0.getHeight();
                    view1 = view0;
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzby)).booleanValue() && view1 != null) {
                    try {
                        list0 = new ArrayList();
                        ViewParent viewParent0 = view1.getParent();
                        while(true) {
                            if(!(viewParent0 instanceof View)) {
                                goto label_46;
                            }
                            Rect rect4 = new Rect();
                            if(((View)viewParent0).isScrollContainer() && ((View)viewParent0).getGlobalVisibleRect(rect4)) {
                                list0.add(this.zza(rect4));
                            }
                            viewParent0 = viewParent0.getParent();
                        }
                    }
                    catch(Exception exception1) {
                    }
                    zzv.zzp().zzw(exception1, "PositionWatcher.getParentScrollViewRects");
                }
                list0 = Collections.emptyList();
            label_46:
                int v1 = view1 == null ? 8 : view1.getWindowVisibility();
                int v2 = this.zzm;
                if(v2 != -1) {
                    v1 = v2;
                }
                long v3 = zzs.zzx(view1);
                if(!((Boolean)zzbe.zzc().zza(zzbcl.zzku)).booleanValue()) {
                    if(view0 == null || !zzs.zzS(view1, this.zzg, this.zzh)) {
                        z2 = false;
                    }
                    else if(!z) {
                        z2 = false;
                        z = false;
                    }
                    else if(z1) {
                        if(v1 == 0) {
                            z2 = true;
                            v1 = 0;
                        }
                        else {
                            z2 = false;
                        }
                        z = true;
                        z1 = true;
                    }
                    else {
                        z2 = false;
                        z = true;
                        z1 = false;
                    }
                }
                else if(view0 == null || !zzs.zzS(view1, this.zzg, this.zzh)) {
                    z2 = false;
                }
                else if(!z) {
                    z2 = false;
                    z = false;
                }
                else if(!z1) {
                    z2 = false;
                    z = true;
                    z1 = false;
                }
                else if(v3 >= ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzkx)))))) && v1 == 0) {
                    z2 = true;
                    v1 = 0;
                    z = true;
                    z1 = true;
                }
                else {
                    z2 = false;
                    z = true;
                    z1 = true;
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
                    int v4 = zzs.zzS(view1, this.zzg, this.zzh) ? 0x40 : 0;
                    zzs.zzK(view1, (v3 < ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzkx)))))) ? 0 : 0x20) | ((v1 == 0 ? 0x80 : 0) | (v4 | (z ? 8 : 0) | (z1 ? 16 : 0))) | z2, null);
                }
                if((v != 1 || this.zzk.zzb() || z2 != this.zzl) && (z2 || this.zzl || v != 1)) {
                    zzayj zzayj0 = new zzayj(zzv.zzC().elapsedRealtime(), this.zzg.isScreenOn(), view1 != null && view1.isAttachedToWindow(), (view1 == null ? 8 : view1.getWindowVisibility()), this.zza(this.zzp), this.zza(rect0), this.zza(rect1), z, this.zza(rect2), z1, v3, this.zza(rect3), this.zzo.density, z2, list0);
                    for(Object object0: this.zzn) {
                        ((zzayk)object0).zzdn(zzayj0);
                    }
                    this.zzl = z2;
                }
            }
        }
    }

    private final void zzk() {
        zzayh zzayh0 = () -> this.zzj(3);
        zzs.zza.post(zzayh0);
    }

    private final void zzl(View view0) {
        ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
        if(viewTreeObserver0.isAlive()) {
            this.zzi = new WeakReference(viewTreeObserver0);
            viewTreeObserver0.addOnScrollChangedListener(this);
            viewTreeObserver0.addOnGlobalLayoutListener(this);
        }
        if(this.zza == null) {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.SCREEN_ON");
            intentFilter0.addAction("android.intent.action.SCREEN_OFF");
            intentFilter0.addAction("android.intent.action.USER_PRESENT");
            this.zza = new zzayi(this);
            zzv.zzw().zzc(this.zzd, this.zza, intentFilter0);
        }
        Application application0 = this.zze;
        if(application0 != null) {
            try {
                application0.registerActivityLifecycleCallbacks(this.zzj);
            }
            catch(Exception exception0) {
                zzo.zzh("Error registering activity lifecycle callbacks.", exception0);
            }
        }
    }

    private final void zzm(View view0) {
        try {
            WeakReference weakReference0 = this.zzi;
            if(weakReference0 != null) {
                ViewTreeObserver viewTreeObserver0 = (ViewTreeObserver)weakReference0.get();
                if(viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
                    viewTreeObserver0.removeOnScrollChangedListener(this);
                    viewTreeObserver0.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
            goto label_10;
        }
        catch(Exception exception0) {
        }
        zzo.zzh("Error while unregistering listeners from the last ViewTreeObserver.", exception0);
        try {
        label_10:
            ViewTreeObserver viewTreeObserver1 = view0.getViewTreeObserver();
            if(viewTreeObserver1.isAlive()) {
                viewTreeObserver1.removeOnScrollChangedListener(this);
                viewTreeObserver1.removeGlobalOnLayoutListener(this);
            }
        }
        catch(Exception exception1) {
            zzo.zzh("Error while unregistering listeners from the ViewTreeObserver.", exception1);
        }
        if(this.zza != null) {
            try {
                zzv.zzw().zzd(this.zzd, this.zza);
            }
            catch(IllegalStateException illegalStateException0) {
                zzo.zzh("Failed trying to unregister the receiver", illegalStateException0);
            }
            catch(Exception exception2) {
                zzv.zzp().zzw(exception2, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zza = null;
        }
        Application application0 = this.zze;
        if(application0 != null) {
            try {
                application0.unregisterActivityLifecycleCallbacks(this.zzj);
            }
            catch(Exception exception3) {
                zzo.zzh("Error registering activity lifecycle callbacks.", exception3);
            }
        }
    }
}

