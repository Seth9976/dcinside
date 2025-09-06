package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a;
import com.bytedance.sdk.openadsdk.SM.Zh;
import com.bytedance.sdk.openadsdk.SM.cr;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.ltE;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.bytedance.sdk.openadsdk.utils.yIW;

public class xf extends ReZ {
    private int Au;
    private Runnable JQp;
    protected qj PjT;
    private int ReZ;
    private PAGLogoView XX;
    protected boolean Zh;
    private long cr;
    private Runnable cz;

    public xf(@NonNull Context context0) {
        super(context0);
        this.cr = 10L;
        this.Zh = true;
        this.Au = 1;
        this.ReZ();
    }

    public void PjT() {
        this.post(new Runnable() {
            final xf PjT;

            @Override
            public void run() {
                xf xf0 = xf.this;
                if(xf0.PjT != null) {
                    xf0.setVisibility(0);
                }
            }
        });
        if(this.JQp == null) {
            this.JQp = () -> {
                xf.this.ReZ = 0;
                qj qj0 = xf.this.PjT;
                if(qj0 != null) {
                    xf.this.removeView(qj0.PjT);
                    xf.this.PjT.cr();
                }
                xf.this.setVisibility(8);
                xf.this.PjT = null;
                Runnable runnable0 = xf.this.JQp;
                if(runnable0 != null) {
                    xf.this.removeCallbacks(runnable0);
                }
                Runnable runnable1 = xf.this.cz;
                if(runnable1 != null) {
                    xf.this.removeCallbacks(runnable1);
                }
                xf.this.cz = null;
                xf.this.JQp = null;
            };
        }
        this.postDelayed(this.JQp, this.cr * 1000L);

        class com.bytedance.sdk.openadsdk.common.xf.3 implements Runnable {
            final xf PjT;

            @Override
            public void run() {
                xf.this.Zh();
            }
        }

    }

    public void PjT(int v) {
        if(v != 100 && Math.abs(v - this.ReZ) < 7) {
            return;
        }
        this.ReZ = v;
        if(a.x()) {
            this.Zh(this.ReZ);
            return;
        }
        if(this.cz == null) {
            this.cz = new Runnable() {
                final xf PjT;

                @Override
                public void run() {
                    int v = xf.this.ReZ;
                    xf.this.Zh(v);
                }
            };
        }
        this.post(this.cz);
    }

    public void PjT(Owx owx0) {
        if(owx0 != null) {
            ltE ltE0 = owx0.xs();
            if(ltE0 != null) {
                this.cr = ltE0.PjT();
            }
        }
        qj qj0 = new qj(this.getContext());
        this.PjT = qj0;
        View view0 = qj0.PjT();
        if(view0.getParent() instanceof ViewGroup) {
            ((ViewGroup)view0.getParent()).removeView(view0);
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 17;
        view0.setLayoutParams(frameLayout$LayoutParams0);
        if(owx0 != null) {
            boolean z = owx0.HG();
            xE xE0 = this.PjT.Zh();
            if(xE0 != null) {
                if(z) {
                    xE0.setVisibility(8);
                }
                else {
                    com.bytedance.sdk.openadsdk.core.model.xE xE1 = owx0.Xe() == null || TextUtils.isEmpty(owx0.Xe().PjT()) ? null : owx0.Xe();
                    if(xE1 == null || TextUtils.isEmpty(xE1.PjT())) {
                    label_23:
                        xE0.setVisibility(8);
                    }
                    else {
                        try {
                            cr.PjT(xE1).ReZ(2).PjT(new Zh(owx0, xE1.PjT(), new yIW(xE0)));
                            goto label_24;
                        }
                        catch(Throwable unused_ex) {
                        }
                        goto label_23;
                    }
                }
            }
        label_24:
            Au au0 = this.PjT.ReZ();
            if(au0 != null) {
                if(z) {
                    au0.setText("Loading");
                }
                else if(TextUtils.isEmpty(owx0.Xtz())) {
                    au0.setVisibility(8);
                }
                else {
                    au0.setText(owx0.Xtz());
                }
            }
        }
        this.addView(view0);
        this.XX = PAGLogoView.createPAGLogoViewByMaterial(this.getContext(), owx0);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(qZS.Zh(this.getContext(), 64.0f), qZS.Zh(this.getContext(), 24.0f));
        frameLayout$LayoutParams1.bottomMargin = qZS.Zh(this.getContext(), 60.0f);
        frameLayout$LayoutParams1.gravity = 81;
        this.XX.setLayoutParams(frameLayout$LayoutParams1);
        this.addView(this.XX);
        this.XX.setOnClickListener(new View.OnClickListener() {
            final xf Zh;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                Context context0 = xf.this.getContext();
                String s = wN.PjT(owx0);
                TTWebsiteActivity.PjT(context0, owx0, s);
            }
        });
        this.ReZ(this.getResources().getConfiguration().orientation);
    }

    private void ReZ() {
        this.setBackgroundColor(Color.parseColor("#2E2E2E"));
        this.setVisibility(8);
    }

    private void ReZ(int v) {
        if(this.Au != v) {
            this.Au = v;
            PAGLogoView pAGLogoView0 = this.XX;
            if(pAGLogoView0 != null) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)pAGLogoView0.getLayoutParams();
                if(this.Au == 1) {
                    viewGroup$MarginLayoutParams0.width = qZS.Zh(this.getContext(), 64.0f);
                    viewGroup$MarginLayoutParams0.height = qZS.Zh(this.getContext(), 24.0f);
                    viewGroup$MarginLayoutParams0.bottomMargin = qZS.Zh(this.getContext(), 60.0f);
                }
                else {
                    viewGroup$MarginLayoutParams0.width = qZS.Zh(this.getContext(), 41.0f);
                    viewGroup$MarginLayoutParams0.height = qZS.Zh(this.getContext(), 15.0f);
                    viewGroup$MarginLayoutParams0.bottomMargin = qZS.Zh(this.getContext(), 24.0f);
                }
                this.XX.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
        }
    }

    private void Zh(int v) {
        qj qj0 = this.PjT;
        if(qj0 != null) {
            qj0.PjT(v);
        }
        if(v == 100 && this.Zh) {
            this.Zh();
        }
    }

    // 检测为 Lambda 实现
    public void Zh() [...]

    public qj getLoadingStyle() {
        return this.PjT;
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.ReZ(configuration0.orientation);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable0 = this.JQp;
        if(runnable0 != null) {
            this.removeCallbacks(runnable0);
            this.JQp = null;
        }
    }
}

