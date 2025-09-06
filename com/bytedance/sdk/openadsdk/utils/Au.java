package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.component.utils.RD;
import java.util.concurrent.atomic.AtomicBoolean;

public class Au implements xs, Runnable {
    public interface PjT {
        View PjT();

        void Zh();
    }

    private boolean Au;
    private long JQp;
    private View PjT;
    private final Handler ReZ;
    private final AtomicBoolean SM;
    private final PjT XX;
    private final Activity Zh;
    private long cr;
    private boolean cz;

    private Au(Activity activity0, int v, PjT au$PjT0) {
        this.SM = new AtomicBoolean(false);
        this.XX = au$PjT0;
        this.Zh = activity0;
        this.ReZ = new Handler(Looper.getMainLooper());
        this.cr = (long)v;
        this.PjT = this.cr();
    }

    private void JQp() {
        this.Au = false;
        this.JQp = SystemClock.elapsedRealtime();
        Handler handler0 = this.ReZ;
        if(handler0 != null) {
            handler0.postDelayed(this, this.cr);
        }
    }

    public static xs PjT(Activity activity0, PjT au$PjT0) {
        int v = com.bytedance.sdk.openadsdk.core.settings.xs.Gr().Wo();
        return v < 0 ? new xs() {
            @Override  // com.bytedance.sdk.openadsdk.utils.xs
            public void PjT() {
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.xs
            public void PjT(long v) {
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.xs
            public void ReZ() {
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.xs
            public void Zh() {
            }
        } : new Au(activity0, Math.min(v, 50) * 1000, au$PjT0);
    }

    private void PjT(View view0) {
        view0.setVisibility(0);
        view0.setAlpha(1.0f);
    }

    @Override  // com.bytedance.sdk.openadsdk.utils.xs
    public void PjT() {
        if(this.JQp != 0L && this.Au) {
            this.JQp();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.utils.xs
    public void PjT(long v) {
        if(!this.SM.compareAndSet(false, true)) {
            return;
        }
        if(v < 0L) {
            v = 0L;
        }
        this.cr += v;
        this.JQp();
    }

    @Override  // com.bytedance.sdk.openadsdk.utils.xs
    public void ReZ() {
        try {
            if(this.cz) {
                return;
            }
            this.cz = true;
            Handler handler0 = this.ReZ;
            if(handler0 != null) {
                handler0.removeCallbacks(this);
            }
        }
        catch(Throwable throwable0) {
            RD.Zh(throwable0.getMessage(), new Object[0]);
        }
    }

    private void XX() {
        ViewParent viewParent0 = this.PjT.getParent();
        if(viewParent0 instanceof ViewGroup && ((ViewGroup)viewParent0).indexOfChild(this.PjT) != ((ViewGroup)viewParent0).getChildCount() - 1) {
            this.PjT.bringToFront();
        }
    }

    // 去混淆评级： 低(20)
    private boolean Zh(View view0) {
        return view0 == null ? true : !view0.isShown() || ((double)view0.getAlpha()) <= 0.9;
    }

    @Override  // com.bytedance.sdk.openadsdk.utils.xs
    public void Zh() {
        if(this.JQp > 0L && !this.cz) {
            if(!this.Au) {
                long v = SystemClock.elapsedRealtime();
                this.cr -= v - this.JQp;
            }
            this.Au = true;
            if(this.cr <= 0L) {
                this.cz();
                return;
            }
            Handler handler0 = this.ReZ;
            if(handler0 != null) {
                try {
                    handler0.removeCallbacks(this);
                }
                catch(Throwable throwable0) {
                    RD.Zh(throwable0.getMessage(), new Object[0]);
                }
            }
        }
    }

    private View cr() {
        return this.XX == null ? null : this.XX.PjT();
    }

    private void cz() {
        if(this.cz) {
            return;
        }
        if(this.Zh == null || this.Zh.isFinishing() || this.Zh.isDestroyed()) {
            return;
        }
        if(this.PjT == null) {
            this.PjT = this.cr();
        }
        View view0 = this.PjT;
        if(view0 != null) {
            if(this.Zh(view0)) {
                this.PjT(this.PjT);
                if(this.PjT instanceof ViewGroup && ((ViewGroup)this.PjT).getChildCount() > 0) {
                    View view1 = ((ViewGroup)this.PjT).getChildAt(0);
                    if(view1 != null && this.Zh(view1)) {
                        this.PjT(view1);
                    }
                }
                PjT au$PjT0 = this.XX;
                if(au$PjT0 != null) {
                    au$PjT0.Zh();
                }
            }
            this.XX();
        }
        this.cz = true;
    }

    @Override
    public void run() {
        this.cz();
    }
}

