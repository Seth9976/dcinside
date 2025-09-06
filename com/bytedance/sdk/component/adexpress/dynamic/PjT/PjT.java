package com.bytedance.sdk.component.adexpress.dynamic.PjT;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.PjT.Zh.Zh;
import com.bytedance.sdk.component.adexpress.ReZ;
import com.bytedance.sdk.component.adexpress.Zh.Au;
import com.bytedance.sdk.component.adexpress.Zh.cr;
import com.bytedance.sdk.component.adexpress.Zh.fDm;
import com.bytedance.sdk.component.adexpress.Zh.qj;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.dynamic.JQp.XX;
import com.bytedance.sdk.component.adexpress.dynamic.cr.cz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.SM;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class PjT implements cr, qj {
    class com.bytedance.sdk.component.adexpress.dynamic.PjT.PjT.PjT implements Runnable {
        final PjT PjT;
        private int Zh;

        public com.bytedance.sdk.component.adexpress.dynamic.PjT.PjT.PjT(int v) {
            this.Zh = v;
        }

        @Override
        public void run() {
            if(this.Zh == 2) {
                PjT.this.PjT.callBackRenderFail((PjT.this.Zh instanceof XX ? 0x7F : 0x75), null);
            }
        }
    }

    private AtomicBoolean Au;
    private Au JQp;
    private DynamicRootView PjT;
    private Context ReZ;
    private ScheduledFuture XX;
    private com.bytedance.sdk.component.adexpress.dynamic.JQp.Au Zh;
    private com.bytedance.sdk.component.adexpress.Zh.XX cr;
    private xs cz;

    public PjT(Context context0, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver0, boolean z, com.bytedance.sdk.component.adexpress.dynamic.JQp.Au au0, xs xs0, com.bytedance.sdk.component.adexpress.dynamic.cz.PjT pjT0) {
        this.Au = new AtomicBoolean(false);
        this.ReZ = context0;
        DynamicRootView dynamicRootView0 = new DynamicRootView(context0, themeStatusBroadcastReceiver0, z, xs0, pjT0);
        this.PjT = dynamicRootView0;
        this.Zh = au0;
        this.cz = xs0;
        dynamicRootView0.setRenderListener(this);
        this.cz = xs0;
    }

    private void Au() {
        try {
            if(this.XX != null && !this.XX.isCancelled()) {
                this.XX.cancel(false);
                this.XX = null;
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
    public View JQp() {
        return this.PjT();
    }

    private void PjT(View view0) {
        if(view0 == null) {
            return;
        }
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                this.PjT(((ViewGroup)view0).getChildAt(v));
            }
        }
        if(view0 instanceof wN) {
            ((wN)view0).Zh();
        }
    }

    private void PjT(com.bytedance.sdk.component.adexpress.dynamic.cr.Au au0) {
        if(au0 == null) {
            return;
        }
        List list0 = au0.qj();
        if(list0 != null && list0.size() > 0) {
            Collections.sort(list0, new Comparator() {
                final PjT PjT;

                public int PjT(com.bytedance.sdk.component.adexpress.dynamic.cr.Au au0, com.bytedance.sdk.component.adexpress.dynamic.cr.Au au1) {
                    cz cz0 = au0.DWo().JQp();
                    cz cz1 = au1.DWo().JQp();
                    if(cz0 != null && cz1 != null) {
                        return cz0.MN() < cz1.MN() ? -1 : 1;
                    }
                    return 0;
                }

                @Override
                public int compare(Object object0, Object object1) {
                    return this.PjT(((com.bytedance.sdk.component.adexpress.dynamic.cr.Au)object0), ((com.bytedance.sdk.component.adexpress.dynamic.cr.Au)object1));
                }
            });
            for(Object object0: list0) {
                com.bytedance.sdk.component.adexpress.dynamic.cr.Au au1 = (com.bytedance.sdk.component.adexpress.dynamic.cr.Au)object0;
                if(au1 != null) {
                    this.PjT(au1);
                }
            }
        }
    }

    public DynamicRootView PjT() {
        return this.cr();
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.qj
    public void PjT(View view0, int v, ReZ reZ0) {
        Au au0 = this.JQp;
        if(au0 != null) {
            au0.PjT(view0, v, reZ0);
        }
    }

    public void PjT(Au au0) {
        this.JQp = au0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
    public void PjT(com.bytedance.sdk.component.adexpress.Zh.XX xX0) {
        this.cr = xX0;
        int v = this.cz.cz();
        if(v < 0) {
            this.PjT.callBackRenderFail((this.Zh instanceof XX ? 0x7F : 0x75), "time is " + v);
            return;
        }
        this.XX = com.bytedance.sdk.component.adexpress.cr.cr.PjT(new com.bytedance.sdk.component.adexpress.dynamic.PjT.PjT.PjT(this, 2), ((long)v), TimeUnit.MILLISECONDS);
        if(Looper.getMainLooper() == Looper.myLooper() && this.cz.SM() <= 0L) {
            this.cz();
            return;
        }
        SM.Zh().postDelayed(() -> {
            PjT.this.cz.JQp().Zh(PjT.this.ReZ());
            JSONObject jSONObject0 = PjT.this.cz.ReZ();
            if(!Zh.PjT(jSONObject0)) {
                PjT.this.PjT.callBackRenderFail((PjT.this.Zh instanceof XX ? 0x7B : 0x71), "data null is " + (jSONObject0 == null));
                return;
            }
            PjT.this.Zh.PjT(new com.bytedance.sdk.component.adexpress.dynamic.cz.Zh() {
                final PjT PjT;

                @Override  // com.bytedance.sdk.component.adexpress.dynamic.cz.Zh
                public void PjT(com.bytedance.sdk.component.adexpress.dynamic.cr.Au au0) {
                    PjT.this.Au();
                    PjT.this.cz.JQp().ReZ(PjT.this.ReZ());
                    PjT.this.PjT(au0);
                    PjT.this.Zh(au0);
                    if(Looper.getMainLooper() == Looper.myLooper()) {
                        PjT.this.ReZ(au0);
                    }
                    else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            final com.bytedance.sdk.component.adexpress.dynamic.PjT.PjT.2 Zh;

                            @Override
                            public void run() {
                                PjT.this.ReZ(au0);
                            }
                        });
                    }
                    if(PjT.this.PjT != null && au0 != null) {
                        PjT.this.PjT.setBgColor(au0.PjT());
                        PjT.this.PjT.setBgMaterialCenterCalcColor(au0.Zh());
                    }
                }
            });
            PjT.this.Zh.PjT(PjT.this.cz);
        }, this.cz.SM());

        class com.bytedance.sdk.component.adexpress.dynamic.PjT.PjT.1 implements Runnable {
            final PjT PjT;

            @Override
            public void run() {
                PjT.this.cz();
            }
        }

    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.qj
    public void PjT(fDm fDm0) {
        if(this.Au.get()) {
            return;
        }
        this.Au.set(true);
        if(fDm0.ReZ() && this.XX()) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            this.PjT.setLayoutParams(frameLayout$LayoutParams0);
            this.cr.PjT(this.PjT(), fDm0);
            return;
        }
        this.cr.PjT(fDm0.qj(), fDm0.DWo());
    }

    private void ReZ(com.bytedance.sdk.component.adexpress.dynamic.cr.Au au0) {
        if(au0 == null) {
            this.PjT.callBackRenderFail((this.Zh instanceof XX ? 0x7B : 0x71), "layoutUnit is null");
            return;
        }
        this.cz.JQp().cr(this.ReZ());
        try {
            this.PjT.render(au0, this.ReZ());
        }
        catch(Exception exception0) {
            this.PjT.callBackRenderFail((this.Zh instanceof XX ? 0x80 : 0x76), "exception is " + exception0.getMessage());
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
    public int ReZ() {
        return this.Zh instanceof XX ? 3 : 2;
    }

    private boolean XX() {
        return this.PjT == null ? false : this.PjT.getChildCount() != 0;
    }

    private void Zh(com.bytedance.sdk.component.adexpress.dynamic.cr.Au au0) {
        float f1;
        float f;
        if(au0 == null) {
            return;
        }
        List list0 = au0.qj();
        if(list0 == null || list0.size() <= 0) {
            f = 0.0f;
        }
        else {
            f = 0.0f;
            for(Object object0: list0) {
                com.bytedance.sdk.component.adexpress.dynamic.cr.Au au1 = (com.bytedance.sdk.component.adexpress.dynamic.cr.Au)object0;
                if(au1.XX() <= au0.XX() - au1.SM()) {
                    List list1 = au1.qj();
                    if(list1 != null && list1.size() > 0) {
                        f1 = 0.0f;
                        for(Object object1: list1) {
                            com.bytedance.sdk.component.adexpress.dynamic.cr.Au au2 = (com.bytedance.sdk.component.adexpress.dynamic.cr.Au)object1;
                            if(au2.DWo().Zh().equals("logo-union")) {
                                f1 = (float)au2.DWo().cz();
                                f = au0.XX() - f1 - au1.XX() + ((float)au1.DWo().JQp().Gr());
                            }
                        }
                    }
                }
                else {
                    f1 = 0.0f;
                }
                this.Zh(au1);
                if(f1 <= -15.0f) {
                    au1.cz(au1.SM() - f1);
                    au1.cr(au1.XX() + f1);
                    for(Object object2: au1.qj()) {
                        ((com.bytedance.sdk.component.adexpress.dynamic.cr.Au)object2).cr(((com.bytedance.sdk.component.adexpress.dynamic.cr.Au)object2).XX() - f1);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.cr.Au au3 = au0.xf();
        if(au3 == null) {
            return;
        }
        au0.ReZ(au0.cz() - au3.cz());
        au0.cr(au0.XX() - au3.XX());
        if(f > 0.0f) {
            au0.cr(au0.XX() - f);
            au0.cz(au0.SM() + f);
            for(Object object3: au0.qj()) {
                ((com.bytedance.sdk.component.adexpress.dynamic.cr.Au)object3).cr(((com.bytedance.sdk.component.adexpress.dynamic.cr.Au)object3).XX() + f);
            }
        }
    }

    public void Zh() {
        this.PjT(this.PjT());
    }

    public DynamicRootView cr() {
        return this.PjT;
    }

    // 检测为 Lambda 实现
    private void cz() [...]
}

