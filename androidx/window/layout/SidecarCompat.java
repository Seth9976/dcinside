package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.Version;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class SidecarCompat implements ExtensionInterfaceCompat {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @m
        public final IBinder a(@m Activity activity0) {
            if(activity0 != null) {
                Window window0 = activity0.getWindow();
                if(window0 != null) {
                    WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                    return windowManager$LayoutParams0 == null ? null : windowManager$LayoutParams0.token;
                }
            }
            return null;
        }

        @m
        public final SidecarInterface b(@l Context context0) {
            L.p(context0, "context");
            return SidecarProvider.getSidecarImpl(context0.getApplicationContext());
        }

        @m
        public final Version c() {
            try {
                String s = SidecarProvider.getApiVersion();
                return TextUtils.isEmpty(s) ? null : Version.f.e(s);
            }
            catch(NoClassDefFoundError | UnsupportedOperationException unused_ex) {
            }
            return null;
        }
    }

    static final class DistinctElementCallback implements ExtensionCallbackInterface {
        @l
        private final ExtensionCallbackInterface a;
        @l
        private final ReentrantLock b;
        @GuardedBy("mLock")
        @l
        private final WeakHashMap c;

        public DistinctElementCallback(@l ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface0) {
            L.p(extensionInterfaceCompat$ExtensionCallbackInterface0, "callbackInterface");
            super();
            this.a = extensionInterfaceCompat$ExtensionCallbackInterface0;
            this.b = new ReentrantLock();
            this.c = new WeakHashMap();
        }

        @Override  // androidx.window.layout.ExtensionInterfaceCompat$ExtensionCallbackInterface
        public void a(@l Activity activity0, @l WindowLayoutInfo windowLayoutInfo0) {
            L.p(activity0, "activity");
            L.p(windowLayoutInfo0, "newLayout");
            ReentrantLock reentrantLock0 = this.b;
            reentrantLock0.lock();
            try {
                if(L.g(windowLayoutInfo0, ((WindowLayoutInfo)this.c.get(activity0)))) {
                    return;
                }
                WindowLayoutInfo windowLayoutInfo1 = (WindowLayoutInfo)this.c.put(activity0, windowLayoutInfo0);
            }
            finally {
                reentrantLock0.unlock();
            }
            this.a.a(activity0, windowLayoutInfo0);
        }
    }

    static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        @l
        private final SidecarAdapter a;
        @l
        private final SidecarInterface.SidecarCallback b;
        @l
        private final ReentrantLock c;
        @GuardedBy("lock")
        @m
        private SidecarDeviceState d;
        @GuardedBy("mLock")
        @l
        private final WeakHashMap e;

        public DistinctSidecarElementCallback(@l SidecarAdapter sidecarAdapter0, @l SidecarInterface.SidecarCallback sidecarInterface$SidecarCallback0) {
            L.p(sidecarAdapter0, "sidecarAdapter");
            L.p(sidecarInterface$SidecarCallback0, "callbackInterface");
            super();
            this.a = sidecarAdapter0;
            this.b = sidecarInterface$SidecarCallback0;
            this.c = new ReentrantLock();
            this.e = new WeakHashMap();
        }

        public void onDeviceStateChanged(@l SidecarDeviceState sidecarDeviceState0) {
            L.p(sidecarDeviceState0, "newDeviceState");
            ReentrantLock reentrantLock0 = this.c;
            reentrantLock0.lock();
            try {
                if(this.a.a(this.d, sidecarDeviceState0)) {
                    return;
                }
                this.d = sidecarDeviceState0;
                this.b.onDeviceStateChanged(sidecarDeviceState0);
            }
            finally {
                reentrantLock0.unlock();
            }
        }

        public void onWindowLayoutChanged(@l IBinder iBinder0, @l SidecarWindowLayoutInfo sidecarWindowLayoutInfo0) {
            L.p(iBinder0, "token");
            L.p(sidecarWindowLayoutInfo0, "newLayout");
            synchronized(this.c) {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo1 = (SidecarWindowLayoutInfo)this.e.get(iBinder0);
                if(this.a.d(sidecarWindowLayoutInfo1, sidecarWindowLayoutInfo0)) {
                    return;
                }
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo)this.e.put(iBinder0, sidecarWindowLayoutInfo0);
            }
            this.b.onWindowLayoutChanged(iBinder0, sidecarWindowLayoutInfo0);
        }
    }

    static final class FirstAttachAdapter implements View.OnAttachStateChangeListener {
        @l
        private final SidecarCompat a;
        @l
        private final WeakReference b;

        public FirstAttachAdapter(@l SidecarCompat sidecarCompat0, @l Activity activity0) {
            L.p(sidecarCompat0, "sidecarCompat");
            L.p(activity0, "activity");
            super();
            this.a = sidecarCompat0;
            this.b = new WeakReference(activity0);
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewAttachedToWindow(@l View view0) {
            L.p(view0, "view");
            view0.removeOnAttachStateChangeListener(this);
            Activity activity0 = (Activity)this.b.get();
            IBinder iBinder0 = SidecarCompat.f.a(activity0);
            if(activity0 == null) {
                return;
            }
            if(iBinder0 == null) {
                return;
            }
            this.a.j(iBinder0, activity0);
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@l View view0) {
            L.p(view0, "view");
        }
    }

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        final SidecarCompat a;

        public TranslatingCallback() {
            L.p(sidecarCompat0, "this$0");
            this.a = sidecarCompat0;
            super();
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@l SidecarDeviceState sidecarDeviceState0) {
            L.p(sidecarDeviceState0, "newDeviceState");
            Iterable iterable0 = this.a.c.values();
            SidecarCompat sidecarCompat0 = this.a;
            for(Object object0: iterable0) {
                Activity activity0 = (Activity)object0;
                IBinder iBinder0 = SidecarCompat.f.a(activity0);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo0 = null;
                if(iBinder0 != null) {
                    SidecarInterface sidecarInterface0 = sidecarCompat0.h();
                    if(sidecarInterface0 != null) {
                        sidecarWindowLayoutInfo0 = sidecarInterface0.getWindowLayoutInfo(iBinder0);
                    }
                }
                ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface0 = sidecarCompat0.e;
                if(extensionInterfaceCompat$ExtensionCallbackInterface0 != null) {
                    extensionInterfaceCompat$ExtensionCallbackInterface0.a(activity0, sidecarCompat0.b.e(sidecarWindowLayoutInfo0, sidecarDeviceState0));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@l IBinder iBinder0, @l SidecarWindowLayoutInfo sidecarWindowLayoutInfo0) {
            L.p(iBinder0, "windowToken");
            L.p(sidecarWindowLayoutInfo0, "newLayout");
            Activity activity0 = (Activity)this.a.c.get(iBinder0);
            if(activity0 == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarAdapter sidecarAdapter0 = this.a.b;
            SidecarInterface sidecarInterface0 = this.a.h();
            SidecarDeviceState sidecarDeviceState0 = sidecarInterface0 == null ? null : sidecarInterface0.getDeviceState();
            if(sidecarDeviceState0 == null) {
                sidecarDeviceState0 = new SidecarDeviceState();
            }
            WindowLayoutInfo windowLayoutInfo0 = sidecarAdapter0.e(sidecarWindowLayoutInfo0, sidecarDeviceState0);
            ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface0 = this.a.e;
            if(extensionInterfaceCompat$ExtensionCallbackInterface0 != null) {
                extensionInterfaceCompat$ExtensionCallbackInterface0.a(activity0, windowLayoutInfo0);
            }
        }
    }

    @m
    private final SidecarInterface a;
    @l
    private final SidecarAdapter b;
    @l
    private final Map c;
    @l
    private final Map d;
    @m
    private ExtensionCallbackInterface e;
    @l
    public static final Companion f = null;
    @l
    private static final String g = "SidecarCompat";

    static {
        SidecarCompat.f = new Companion(null);
    }

    public SidecarCompat(@l Context context0) {
        L.p(context0, "context");
        this(SidecarCompat.f.b(context0), new SidecarAdapter(null, 1, null));
    }

    @VisibleForTesting
    public SidecarCompat(@VisibleForTesting @m SidecarInterface sidecarInterface0, @l SidecarAdapter sidecarAdapter0) {
        L.p(sidecarAdapter0, "sidecarAdapter");
        super();
        this.a = sidecarInterface0;
        this.b = sidecarAdapter0;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override  // androidx.window.layout.ExtensionInterfaceCompat
    public void a(@l ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface0) {
        L.p(extensionInterfaceCompat$ExtensionCallbackInterface0, "extensionCallback");
        this.e = new DistinctElementCallback(extensionInterfaceCompat$ExtensionCallbackInterface0);
        SidecarInterface sidecarInterface0 = this.a;
        if(sidecarInterface0 != null) {
            SidecarInterface.SidecarCallback sidecarInterface$SidecarCallback0 = new TranslatingCallback(this);
            sidecarInterface0.setSidecarCallback(new DistinctSidecarElementCallback(this.b, sidecarInterface$SidecarCallback0));
        }
    }

    @Override  // androidx.window.layout.ExtensionInterfaceCompat
    @SuppressLint({"BanUncheckedReflection"})
    public boolean b() {
        Method method3;
        Method method2;
        Method method1;
        Method method0;
        try {
            SidecarInterface sidecarInterface0 = this.a;
            if(sidecarInterface0 == null) {
                method0 = null;
            }
            else {
                Class class0 = sidecarInterface0.getClass();
                method0 = class0 == null ? null : class0.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            }
            Class class1 = method0 == null ? null : method0.getReturnType();
            Class class2 = Void.TYPE;
            if(L.g(class1, class2)) {
                SidecarInterface sidecarInterface1 = this.a;
                if(sidecarInterface1 != null) {
                    sidecarInterface1.getDeviceState();
                }
                SidecarInterface sidecarInterface2 = this.a;
                if(sidecarInterface2 != null) {
                    sidecarInterface2.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface3 = this.a;
                Class class3 = IBinder.class;
                if(sidecarInterface3 == null) {
                    method1 = null;
                }
                else {
                    Class class4 = sidecarInterface3.getClass();
                    method1 = class4 == null ? null : class4.getMethod("getWindowLayoutInfo", class3);
                }
                if(L.g((method1 == null ? null : method1.getReturnType()), SidecarWindowLayoutInfo.class)) {
                    SidecarInterface sidecarInterface4 = this.a;
                    if(sidecarInterface4 == null) {
                        method2 = null;
                    }
                    else {
                        Class class5 = sidecarInterface4.getClass();
                        method2 = class5 == null ? null : class5.getMethod("onWindowLayoutChangeListenerAdded", class3);
                    }
                    if(L.g((method2 == null ? null : method2.getReturnType()), class2)) {
                        SidecarInterface sidecarInterface5 = this.a;
                        if(sidecarInterface5 == null) {
                            method3 = null;
                        }
                        else {
                            Class class6 = sidecarInterface5.getClass();
                            method3 = class6 == null ? null : class6.getMethod("onWindowLayoutChangeListenerRemoved", class3);
                        }
                        if(L.g((method3 == null ? null : method3.getReturnType()), class2)) {
                            new SidecarDeviceState().posture = 3;
                            SidecarDisplayFeature sidecarDisplayFeature0 = new SidecarDisplayFeature();
                            Rect rect0 = sidecarDisplayFeature0.getRect();
                            L.o(rect0, "displayFeature.rect");
                            sidecarDisplayFeature0.setRect(rect0);
                            sidecarDisplayFeature0.getType();
                            sidecarDisplayFeature0.setType(1);
                            new SidecarWindowLayoutInfo();
                            return true;
                        }
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    @Override  // androidx.window.layout.ExtensionInterfaceCompat
    public void c(@l Activity activity0) {
        L.p(activity0, "activity");
        IBinder iBinder0 = SidecarCompat.f.a(activity0);
        if(iBinder0 != null) {
            this.j(iBinder0, activity0);
            return;
        }
        FirstAttachAdapter sidecarCompat$FirstAttachAdapter0 = new FirstAttachAdapter(this, activity0);
        activity0.getWindow().getDecorView().addOnAttachStateChangeListener(sidecarCompat$FirstAttachAdapter0);
    }

    @Override  // androidx.window.layout.ExtensionInterfaceCompat
    public void d(@l Activity activity0) {
        L.p(activity0, "activity");
        IBinder iBinder0 = SidecarCompat.f.a(activity0);
        if(iBinder0 == null) {
            return;
        }
        SidecarInterface sidecarInterface0 = this.a;
        if(sidecarInterface0 != null) {
            sidecarInterface0.onWindowLayoutChangeListenerRemoved(iBinder0);
        }
        this.l(activity0);
        this.c.remove(iBinder0);
        if(this.c.size() == 1) {
            SidecarInterface sidecarInterface1 = this.a;
            if(sidecarInterface1 != null) {
                sidecarInterface1.onDeviceStateListenersChanged(true);
            }
        }
    }

    @m
    public final SidecarInterface h() {
        return this.a;
    }

    @VisibleForTesting
    @l
    public final WindowLayoutInfo i(@l Activity activity0) {
        L.p(activity0, "activity");
        IBinder iBinder0 = SidecarCompat.f.a(activity0);
        if(iBinder0 == null) {
            return new WindowLayoutInfo(u.H());
        }
        SidecarDeviceState sidecarDeviceState0 = null;
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo0 = this.a == null ? null : this.a.getWindowLayoutInfo(iBinder0);
        SidecarAdapter sidecarAdapter0 = this.b;
        SidecarInterface sidecarInterface0 = this.a;
        if(sidecarInterface0 != null) {
            sidecarDeviceState0 = sidecarInterface0.getDeviceState();
        }
        if(sidecarDeviceState0 == null) {
            sidecarDeviceState0 = new SidecarDeviceState();
        }
        return sidecarAdapter0.e(sidecarWindowLayoutInfo0, sidecarDeviceState0);
    }

    public final void j(@l IBinder iBinder0, @l Activity activity0) {
        L.p(iBinder0, "windowToken");
        L.p(activity0, "activity");
        this.c.put(iBinder0, activity0);
        SidecarInterface sidecarInterface0 = this.a;
        if(sidecarInterface0 != null) {
            sidecarInterface0.onWindowLayoutChangeListenerAdded(iBinder0);
        }
        if(this.c.size() == 1) {
            SidecarInterface sidecarInterface1 = this.a;
            if(sidecarInterface1 != null) {
                sidecarInterface1.onDeviceStateListenersChanged(false);
            }
        }
        ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface0 = this.e;
        if(extensionInterfaceCompat$ExtensionCallbackInterface0 != null) {
            extensionInterfaceCompat$ExtensionCallbackInterface0.a(activity0, this.i(activity0));
        }
        this.k(activity0);
    }

    private final void k(Activity activity0) {
        if(this.d.get(activity0) == null) {
            androidx.window.layout.SidecarCompat.registerConfigurationChangeListener.configChangeObserver.1 sidecarCompat$registerConfigurationChangeListener$configChangeObserver$10 = new ComponentCallbacks() {
                @Override  // android.content.ComponentCallbacks
                public void onConfigurationChanged(@l Configuration configuration0) {
                    L.p(configuration0, "newConfig");
                    ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface0 = activity0.e;
                    if(extensionInterfaceCompat$ExtensionCallbackInterface0 != null) {
                        WindowLayoutInfo windowLayoutInfo0 = activity0.i(this.b);
                        extensionInterfaceCompat$ExtensionCallbackInterface0.a(this.b, windowLayoutInfo0);
                    }
                }

                @Override  // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            };
            this.d.put(activity0, sidecarCompat$registerConfigurationChangeListener$configChangeObserver$10);
            activity0.registerComponentCallbacks(sidecarCompat$registerConfigurationChangeListener$configChangeObserver$10);
        }
    }

    private final void l(Activity activity0) {
        activity0.unregisterComponentCallbacks(((ComponentCallbacks)this.d.get(activity0)));
        this.d.remove(activity0);
    }
}

