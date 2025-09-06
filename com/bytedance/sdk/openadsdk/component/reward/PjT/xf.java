package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.View;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.activity.cz;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class xf {
    static abstract class PjT implements View.OnLayoutChangeListener {
        private int PjT;
        private int Zh;

        private PjT() {
        }

        PjT(com.bytedance.sdk.openadsdk.component.reward.PjT.xf.1 xf$10) {
        }

        abstract void PjT(int arg1, int arg2);

        @Override  // android.view.View$OnLayoutChangeListener
        public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
            int v8 = v2 - v;
            int v9 = v3 - v1;
            if(v8 != this.PjT || v9 != this.Zh) {
                this.PjT = v8;
                this.Zh = v9;
                this.PjT(v8, v9);
            }
        }
    }

    protected int PjT;
    private boolean ReZ;
    private final com.bytedance.sdk.openadsdk.component.reward.PjT.PjT Zh;
    private PjT cr;

    public xf(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        this.ReZ = true;
        this.PjT = 0;
        this.Zh = pjT0;
        this.ReZ();
        if(pjT0.PjT == 2) {
            return;
        }
        try {
            float f = qZS.PjT();
            this.PjT = qZS.ReZ(pjT0.rds, f);
            if(!pjT0.rds.getWindow().hasFeature(1)) {
                pjT0.rds.requestWindowFeature(1);
            }
            pjT0.rds.getWindow().addFlags(0x1000080);
            if(pjT0.cI == 2 || !qZS.ReZ(pjT0.rds)) {
                pjT0.rds.getWindow().addFlags(0x400);
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        Log.e("TTAD.RFSM", "init: ", throwable0);
    }

    private float JQp() {
        int v = qZS.xf(this.Zh.rds);
        return (float)qZS.ReZ(this.Zh.rds, ((float)v));
    }

    private static void PjT(Activity activity0, int v) {
        if(activity0.getRequestedOrientation() == v) {
            return;
        }
        activity0.setRequestedOrientation(v);
    }

    public void PjT() {
        qZS.PjT(this.Zh.rds);
        this.Zh.rds.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            final xf PjT;

            @Override  // android.view.View$OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int v) {
                if(v == 0) {
                    try {
                        if(xf.this.Zh.rds.isFinishing()) {
                            return;
                        }
                        xf.this.Zh.rds.getWindow().getDecorView().postDelayed(new Runnable() {
                            final com.bytedance.sdk.openadsdk.component.reward.PjT.xf.3 PjT;

                            @Override
                            public void run() {
                                qZS.PjT(xf.this.Zh.rds);
                            }
                        }, 2500L);
                    }
                    catch(Exception exception0) {
                        RD.Zh("TTAD.RFSM", exception0.getMessage());
                    }
                }
            }
        });
    }

    public void PjT(KM kM0) {
        if(kM0 == null) {
            return;
        }
        kM0.postDelayed(new Runnable() {
            final xf PjT;

            @Override
            public void run() {
                try {
                    View view0 = xf.this.Zh.rds.getWindow().getDecorView();
                    if(view0 != null) {
                        View view1 = view0.findViewById(0x102002F);
                        if(view1 != null) {
                            view1.setVisibility(8);
                        }
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }, 300L);
    }

    public void PjT(boolean z) {
        int v5;
        int v4;
        int v3;
        float f3;
        float f2;
        int v = Build.VERSION.SDK_INT;
        if(v != 26) {
            if(v == 27) {
                try {
                    this.cr();
                }
                catch(Throwable unused_ex) {
                }
            }
            else {
                this.cr();
            }
        }
        float f = this.JQp();
        float f1 = this.cz();
        if(this.Zh.cI == 2) {
            f2 = Math.max(f, f1);
            f3 = Math.min(f, f1);
        }
        else {
            f2 = Math.min(f, f1);
            f3 = Math.max(f, f1);
        }
        Activity activity0 = this.Zh.rds;
        int v1 = qZS.ReZ(activity0, qZS.PjT());
        if(this.Zh.cI == 2) {
            if(qZS.ReZ(activity0)) {
                f2 -= (float)v1;
            }
        }
        else if(qZS.ReZ(activity0)) {
            f3 -= (float)v1;
        }
        if(z) {
            this.Zh.HG = (int)f2;
            this.Zh.zZ = (int)f3;
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
        int v2 = 20;
        if(pjT0.cI == 2) {
            float f5 = pjT0.oG;
            if(f5 == 0 || f5 == 0x42C80000) {
            label_42:
                v2 = 0;
                v5 = 0;
                v3 = 0;
                v4 = 0;
            }
            else {
                v5 = (int)Math.max((f2 - (f3 - 20.0f - 20.0f) * f5) / 2.0f, 0.0f);
                v2 = v5;
                v3 = 20;
                v4 = 20;
            }
        }
        else {
            float f4 = pjT0.oG;
            if(f4 == 0 || f4 == 0x42C80000) {
                goto label_42;
            }
            else {
                v3 = (int)Math.max((f3 - (f2 - 20.0f - 20.0f) / f4) / 2.0f, 0.0f);
                v4 = v3;
                v5 = 20;
            }
        }
        this.Zh.HG = (int)(f2 - ((float)v2) - ((float)v5));
        this.Zh.zZ = (int)(f3 - ((float)v3) - ((float)v4));
        cz cz0 = this.Zh.hN;
        if(cz0 != null && cz0.SM > 0) {
            return;
        }
        int v6 = qZS.Zh(activity0, ((float)v3));
        int v7 = qZS.Zh(activity0, ((float)v4));
        int v8 = qZS.Zh(activity0, ((float)v2));
        int v9 = qZS.Zh(activity0, ((float)v5));
        activity0.getWindow().getDecorView().setPadding(v8, v6, v9, v7);
    }

    public float[] PjT(int v) {
        float[] arr_f = new float[2];
        Activity activity0 = this.Zh.rds;
        View view0 = activity0.getWindow().getDecorView();
        int v1 = Build.VERSION.SDK_INT;
        if(v1 < 35 || this.Zh.Zh.Qtm() != 100.0f) {
            arr_f[0] = (float)(view0.getWidth() - view0.getPaddingLeft() * 2);
            arr_f[1] = (float)(view0.getHeight() - view0.getPaddingTop() * 2);
        }
        else {
            arr_f[0] = (float)(view0.getWidth() - view0.getPaddingLeft());
            arr_f[1] = (float)(view0.getHeight() - view0.getPaddingTop());
        }
        arr_f[0] = (float)qZS.ReZ(activity0, arr_f[0]);
        float f = (float)qZS.ReZ(activity0, arr_f[1]);
        arr_f[1] = f;
        if(arr_f[0] < 10.0f || f < 10.0f) {
            arr_f = this.Zh(this.PjT);
        }
        if(v1 != 26 && v1 != 27 && activity0.getResources() != null && activity0.getResources().getConfiguration() != null && (activity0.getResources().getConfiguration().orientation == 2 ? 2 : 1) != v) {
            if(v == 2) {
                float f1 = arr_f[0];
                float f2 = arr_f[1];
                if(f1 < f2) {
                    arr_f[1] = f1;
                    arr_f[0] = f2;
                    return arr_f;
                }
            }
            else {
                float f3 = arr_f[0];
                float f4 = arr_f[1];
                if(f3 > f4) {
                    arr_f[1] = f3;
                    arr_f[0] = f4;
                }
            }
        }
        return arr_f;
    }

    private void ReZ() {
        this.Zh.oG = this.Zh.Zh.Qtm();
        if(26 == Build.VERSION.SDK_INT) {
            if(this.Zh.rds.getResources().getConfiguration().orientation == 1) {
                this.Zh.cI = 1;
                return;
            }
            this.Zh.cI = 2;
            return;
        }
        this.Zh.cI = this.Zh.Zh.jK();
    }

    private float[] Zh(int v) {
        float f = this.cz();
        float f1 = this.JQp();
        int v1 = this.Zh.cI;
        if((v1 == 1 ? 1 : 0) != (f > f1 ? 1 : 0)) {
            float f2 = f + f1;
            f1 = f2 - f1;
            f = f2 - f1;
        }
        return v1 == 1 ? new float[]{f1, f - ((float)v)} : new float[]{f1 - ((float)v), f};
    }

    public void Zh() {
        if(this.cr != null) {
            this.Zh.rds.getWindow().getDecorView().removeOnLayoutChangeListener(this.cr);
            this.cr = null;
        }
    }

    public void Zh(KM kM0) {
        try {
            boolean z = true;
            cz cz0 = this.Zh.hN;
            if(cz0 != null && cz0.SM > 0) {
                return;
            }
            boolean z1 = this.ReZ && ub.cr().Co() == 1;
            if(this.ReZ && qZS.ReZ(this.Zh.rds)) {
            label_8:
                if(this.cr == null) {
                    this.cr = new PjT(z, z1) {
                        boolean PjT;
                        final boolean ReZ;
                        final boolean Zh;
                        final xf cr;

                        {
                            xf.this = xf0;
                            this.Zh = z;
                            this.ReZ = z1;
                            super(null);
                        }

                        @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.xf$PjT
                        void PjT(int v, int v1) {
                            int v3;
                            try {
                                if(xf.this.Zh.cI != 2 || xf.this.Zh.rds.getResources().getConfiguration().orientation != 2) {
                                    int v4 = xf.this.Zh.rds.getWindow().getDecorView().getHeight();
                                    v3 = Math.abs(qZS.qj(xf.this.Zh.rds) - v4);
                                }
                                else {
                                    int v2 = xf.this.Zh.rds.getWindow().getDecorView().getWidth();
                                    v3 = Math.abs(qZS.xf(xf.this.Zh.rds) - v2);
                                }
                                View view0 = xf.this.Zh.rds.getWindow().getDecorView();
                                int v5 = view0.getPaddingLeft();
                                int v6 = view0.getPaddingRight();
                                int v7 = view0.getPaddingBottom();
                                if(v3 == 0) {
                                    int v8 = view0.getPaddingTop();
                                    if(xf.this.Zh.cI == 1 && xf.this.Zh.rds.getResources().getConfiguration().orientation == 1) {
                                        v8 += (int)qZS.PjT();
                                    }
                                    else if(xf.this.Zh.cI == 2 && xf.this.Zh.rds.getResources().getConfiguration().orientation == 2) {
                                        if(this.Zh) {
                                            v5 += (int)qZS.PjT();
                                        }
                                        if(this.ReZ) {
                                            v8 += (int)qZS.PjT();
                                        }
                                    }
                                    if(view0.isAttachedToWindow()) {
                                        view0.setPadding(v5, v8, v6, v7);
                                        this.PjT = true;
                                    }
                                    if(xf.this.Zh.oG == 100.0f) {
                                        view0.setBackgroundColor(0xFF000000);
                                    }
                                    return;
                                }
                                if(this.PjT) {
                                    view0.setPadding(v5, 0, v6, v7);
                                    this.PjT = false;
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                        }
                    };
                }
                this.Zh.rds.getWindow().getDecorView().addOnLayoutChangeListener(this.cr);
            }
            else {
                z = false;
                if(z1) {
                    goto label_8;
                }
            }
            this.ReZ = false;
        }
        catch(Exception unused_ex) {
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void cr() {
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.Zh;
        if(pjT0.cI == 2) {
            if(pjT0.Xe) {
                xf.PjT(pjT0.rds, 8);
                return;
            }
            xf.PjT(pjT0.rds, 0);
            return;
        }
        xf.PjT(pjT0.rds, 1);
    }

    private float cz() {
        int v = qZS.qj(this.Zh.rds);
        return (float)qZS.ReZ(this.Zh.rds, ((float)v));
    }
}

