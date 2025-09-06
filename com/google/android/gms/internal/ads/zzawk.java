package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

public final class zzawk implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler zza;
    private final Context zzb;
    private Application zzc;
    @Nullable
    private final PowerManager zzd;
    @Nullable
    private final KeyguardManager zze;
    private BroadcastReceiver zzf;
    private final zzavw zzg;
    private WeakReference zzh;
    @Nullable
    private WeakReference zzi;
    private zzavs zzj;
    private byte zzk;
    private int zzl;
    private long zzm;

    static {
        zzawk.zza = new Handler(Looper.getMainLooper());
    }

    public zzawk(Context context0, zzavw zzavw0) {
        this.zzk = -1;
        this.zzl = -1;
        this.zzm = -3L;
        Context context1 = context0.getApplicationContext();
        this.zzb = context1;
        this.zzg = zzavw0;
        this.zzd = (PowerManager)context1.getSystemService("power");
        this.zze = (KeyguardManager)context1.getSystemService("keyguard");
        if(context1 instanceof Application) {
            this.zzc = (Application)context1;
            this.zzj = new zzavs(((Application)context1), this);
        }
        this.zzd(null);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        this.zze(activity0, 0);
        this.zzf();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        this.zzf();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.zze(activity0, 4);
        this.zzf();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        this.zze(activity0, 0);
        this.zzf();
        this.zzg();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        this.zzf();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        this.zze(activity0, 0);
        this.zzf();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        this.zzf();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.zzf();
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        this.zzf();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.zzl = -1;
        this.zzh(view0);
        this.zzf();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        this.zzl = -1;
        this.zzf();
        this.zzg();
        this.zzi(view0);
    }

    public final long zza() {
        if(this.zzm <= -2L && this.zzb() == null) {
            this.zzm = -3L;
        }
        return this.zzm;
    }

    @Nullable
    final View zzb() {
        return this.zzi == null ? null : ((View)this.zzi.get());
    }

    final void zzd(View view0) {
        long v;
        View view1 = this.zzb();
        if(view1 != null) {
            view1.removeOnAttachStateChangeListener(this);
            this.zzi(view1);
        }
        this.zzi = new WeakReference(view0);
        if(view0 == null) {
            v = -3L;
        }
        else {
            if(view0.getWindowToken() != null || view0.getWindowVisibility() != 8) {
                this.zzh(view0);
            }
            view0.addOnAttachStateChangeListener(this);
            v = -2L;
        }
        this.zzm = v;
    }

    private final void zze(Activity activity0, int v) {
        if(this.zzi != null) {
            Window window0 = activity0.getWindow();
            if(window0 != null) {
                View view0 = window0.peekDecorView();
                View view1 = this.zzb();
                if(view1 != null && view0 != null && view1.getRootView() == view0.getRootView()) {
                    this.zzl = v;
                }
            }
        }
    }

    private final void zzf() {
        WindowManager.LayoutParams windowManager$LayoutParams0;
        Activity activity0;
        if(this.zzi != null) {
            View view0 = this.zzb();
            if(view0 == null) {
                this.zzm = -3L;
                this.zzk = -1;
                return;
            }
            int v1 = view0.getVisibility() == 0 ? 0 : 1;
            if(!view0.isShown()) {
                v1 |= 2;
            }
            if(this.zzd != null && !this.zzd.isScreenOn()) {
                v1 |= 4;
            }
            if(!this.zzg.zza()) {
                if(this.zze == null || !this.zze.inKeyguardRestrictedInputMode()) {
                    v1 |= 8;
                }
                else {
                    View view1 = view0.getRootView();
                    if(view1 == null) {
                        view1 = view0;
                    }
                    Context context0 = view1.getContext();
                    for(int v = 0; true; ++v) {
                        activity0 = null;
                        windowManager$LayoutParams0 = null;
                        if(!(context0 instanceof ContextWrapper) || v >= 10) {
                            break;
                        }
                        if(context0 instanceof Activity) {
                            activity0 = (Activity)context0;
                            break;
                        }
                        context0 = ((ContextWrapper)context0).getBaseContext();
                    }
                    if(activity0 == null) {
                        v1 |= 8;
                    }
                    else {
                        Window window0 = activity0.getWindow();
                        if(window0 != null) {
                            windowManager$LayoutParams0 = window0.getAttributes();
                        }
                        if(windowManager$LayoutParams0 == null || (windowManager$LayoutParams0.flags & 0x80000) == 0) {
                            v1 |= 8;
                        }
                    }
                }
            }
            if(!view0.getGlobalVisibleRect(new Rect())) {
                v1 |= 16;
            }
            if(!view0.getLocalVisibleRect(new Rect())) {
                v1 |= 0x20;
            }
            int v2 = view0.getWindowVisibility();
            int v3 = this.zzl;
            if(v3 != -1) {
                v2 = v3;
            }
            if(v2 != 0) {
                v1 |= 0x40;
            }
            if(this.zzk != v1) {
                this.zzk = (byte)v1;
                this.zzm = v1 == 0 ? SystemClock.elapsedRealtime() : -3L - ((long)v1);
            }
        }
    }

    private final void zzg() {
        zzawi zzawi0 = new zzawi(this);
        zzawk.zza.post(zzawi0);
    }

    private final void zzh(View view0) {
        ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
        if(viewTreeObserver0.isAlive()) {
            this.zzh = new WeakReference(viewTreeObserver0);
            viewTreeObserver0.addOnScrollChangedListener(this);
            viewTreeObserver0.addOnGlobalLayoutListener(this);
        }
        if(this.zzf == null) {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.SCREEN_ON");
            intentFilter0.addAction("android.intent.action.SCREEN_OFF");
            intentFilter0.addAction("android.intent.action.USER_PRESENT");
            zzawj zzawj0 = new zzawj(this);
            this.zzf = zzawj0;
            this.zzb.registerReceiver(zzawj0, intentFilter0);
        }
        Application application0 = this.zzc;
        if(application0 != null) {
            try {
                application0.registerActivityLifecycleCallbacks(this.zzj);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    private final void zzi(View view0) {
        try {
            WeakReference weakReference0 = this.zzh;
            if(weakReference0 != null) {
                ViewTreeObserver viewTreeObserver0 = (ViewTreeObserver)weakReference0.get();
                if(viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
                    viewTreeObserver0.removeOnScrollChangedListener(this);
                    viewTreeObserver0.removeGlobalOnLayoutListener(this);
                }
                this.zzh = null;
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            ViewTreeObserver viewTreeObserver1 = view0.getViewTreeObserver();
            if(viewTreeObserver1.isAlive()) {
                viewTreeObserver1.removeOnScrollChangedListener(this);
                viewTreeObserver1.removeGlobalOnLayoutListener(this);
            }
        }
        catch(Exception unused_ex) {
        }
        BroadcastReceiver broadcastReceiver0 = this.zzf;
        if(broadcastReceiver0 != null) {
            try {
                this.zzb.unregisterReceiver(broadcastReceiver0);
            }
            catch(Exception unused_ex) {
            }
            this.zzf = null;
        }
        Application application0 = this.zzc;
        if(application0 != null) {
            try {
                application0.unregisterActivityLifecycleCallbacks(this.zzj);
            }
            catch(Exception unused_ex) {
            }
        }
    }
}

