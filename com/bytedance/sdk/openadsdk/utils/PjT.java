package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.cr.PjT.cr;
import com.bytedance.sdk.openadsdk.cr.PjT.fDm;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class PjT implements Application.ActivityLifecycleCallbacks {
    public class JQp implements Runnable {
        final PjT PjT;
        private long ReZ;
        private long Zh;
        private boolean cr;

        public JQp(long v, long v1, boolean z) {
            this.Zh = v;
            this.ReZ = v1;
            this.cr = z;
        }

        @Override
        public void run() {
            if(this.cr) {
                ReZ.PjT().PjT(this.Zh / 1000L, this.ReZ / 1000L);
            }
            PjT.this.cr();
        }
    }

    static class com.bytedance.sdk.openadsdk.utils.PjT.PjT implements Runnable {
        @Override
        public void run() {
            Jo.ReZ(new Au("reportPvFromBackGround") {
                final com.bytedance.sdk.openadsdk.utils.PjT.PjT PjT;

                @Override
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    class com.bytedance.sdk.openadsdk.utils.PjT.ReZ implements Runnable {
        final PjT PjT;

        // 去混淆评级： 低(30)
        @Override
        public void run() {
        }
    }

    static class Zh implements Runnable {
        private Zh() {
        }

        Zh(com.bytedance.sdk.openadsdk.utils.PjT.1 pjT$10) {
        }

        @Override
        public void run() {
            com.bytedance.sdk.openadsdk.cz.Zh.PjT().Zh();
            fDm fDm0 = xs.Gr().uQg();
            if(fDm0 == null) {
                return;
            }
            if(!fDm0.PjT() && ltE.Au(ub.PjT())) {
                cr.PjT(xf.PjT(ub.PjT()));
            }
        }
    }

    class com.bytedance.sdk.openadsdk.utils.PjT.cr implements Runnable {
        final PjT PjT;

        @Override
        public void run() {
            com.bytedance.sdk.openadsdk.core.fDm.Zh().removeMessages(1001);
            ub.PjT();
        }
    }

    private final Zh Au;
    private volatile CopyOnWriteArrayList DWo;
    private final com.bytedance.sdk.openadsdk.utils.PjT.PjT JQp;
    public static boolean PjT = false;
    public static long ReZ;
    private int SM;
    private final com.bytedance.sdk.openadsdk.utils.PjT.ReZ XX;
    public static long Zh;
    private final AtomicBoolean cr;
    private final com.bytedance.sdk.openadsdk.utils.PjT.cr cz;
    private final LinkedList fDm;
    private HandlerThread qj;
    private Handler xf;
    private volatile WeakReference xs;

    static {
    }

    public PjT() {
        this.cr = new AtomicBoolean(false);
        this.JQp = new com.bytedance.sdk.openadsdk.utils.PjT.PjT();
        this.cz = new com.bytedance.sdk.openadsdk.utils.PjT.cr(this);
        this.XX = new com.bytedance.sdk.openadsdk.utils.PjT.ReZ(this);
        this.Au = new Zh(null);
        this.SM = 0;
        this.DWo = new CopyOnWriteArrayList();
        this.qj = null;
        this.xf = null;
        this.fDm = new LinkedList();
        this.ReZ();
    }

    static com.bytedance.sdk.openadsdk.utils.PjT.PjT PjT(PjT pjT0) {
        return pjT0.JQp;
    }

    private void PjT(Runnable runnable0) {
        if(!this.qj.isAlive()) {
            this.ReZ();
        }
        this.xf.postDelayed(runnable0, 1000L);
    }

    public void PjT(com.bytedance.sdk.component.adexpress.PjT pjT0) {
        WeakReference weakReference0 = new WeakReference(pjT0);
        this.DWo.add(weakReference0);
    }

    public boolean PjT() {
        return this.cr.get();
    }

    public boolean PjT(boolean z) {
        if(this.xs == null) {
            return z;
        }
        Activity activity0 = (Activity)this.xs.get();
        if(activity0 == null) {
            return z;
        }
        Window window0 = activity0.getWindow();
        return window0 == null ? z : window0.getDecorView().hasWindowFocus();
    }

    private void ReZ() {
        this.qj = com.bytedance.sdk.component.utils.Au.PjT("lifecycle", 10);
        this.xf = new Handler(this.qj.getLooper());
    }

    public Activity Zh() {
        return this.fDm.isEmpty() ? null : ((Activity)this.fDm.getFirst());
    }

    public boolean Zh(com.bytedance.sdk.component.adexpress.PjT pjT0) {
        WeakReference weakReference0 = new WeakReference(pjT0);
        return this.DWo.remove(weakReference0);
    }

    private void cr() {
        com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
        this.fDm.addFirst(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
        if(this.DWo != null && this.DWo.size() > 0) {
            for(Object object0: this.DWo) {
                WeakReference weakReference0 = (WeakReference)object0;
                if(weakReference0 != null && weakReference0.get() != null) {
                    try {
                        ((com.bytedance.sdk.component.adexpress.PjT)weakReference0.get()).PjT(activity0);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        }
        if(this.xs != null && this.xs.get() == activity0) {
            this.xs = null;
        }
        this.fDm.remove(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
        int v = this.SM - 1;
        this.SM = v;
        if(v < 0) {
            this.SM = 0;
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
        this.PjT(this.cz);
        if(!PjT.PjT) {
            PjT.Zh = System.currentTimeMillis();
            PjT.PjT = true;
        }
        this.xs = new WeakReference(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.getDecorView();
            view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                final PjT ReZ;

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NonNull View view0) {
                    view0.removeOnAttachStateChangeListener(this);
                    if(qZS.cr(activity0)) {
                        qZS.PjT(true);
                    }
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NonNull View view0) {
                    view0.removeOnAttachStateChangeListener(this);
                }
            });
        }
        ++this.SM;
        this.xf.removeCallbacks(this.Au);
        if(this.cr.get()) {
            this.PjT(this.Au);
        }
        this.cr.set(false);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
        if(this.SM <= 0) {
            this.cr.set(true);
        }
        if(this.PjT()) {
            PjT.PjT = false;
            com.bytedance.sdk.openadsdk.core.fDm.Zh.set(false);
            PjT.ReZ = System.currentTimeMillis();
            this.PjT(this.Au);
        }
        this.PjT(new JQp(this, PjT.Zh, PjT.ReZ, this.PjT()));
    }
}

