package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.fDm.qla;
import com.bytedance.sdk.openadsdk.utils.qZS;
import v.c;

public class gK {
    public static enum PjT {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO;

    }

    public interface Zh {
        boolean DWo();

        void qj();
    }

    private ViewGroup Au;
    private Zh JQp;
    private View PjT;
    private Context ReZ;
    private c XX;
    private TextView Zh;
    private com.bytedance.sdk.openadsdk.core.xf.Zh.PjT cr;
    private boolean cz;

    public gK() {
        this.cz = false;
    }

    private ViewGroup.LayoutParams PjT(ViewGroup viewGroup0) {
        if(viewGroup0 instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if(viewGroup0 instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        return viewGroup0 instanceof FrameLayout ? new FrameLayout.LayoutParams(-1, -1) : null;
    }

    private void PjT(Context context0, View view0, boolean z) {
        if(context0 != null && view0 != null && this.PjT == null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.PjT(this.Au);
            if(viewGroup$LayoutParams0 == null) {
                return;
            }
            qla qla0 = new qla(context0);
            this.PjT = qla0;
            qla0.setLayoutParams(viewGroup$LayoutParams0);
            this.Au.addView(this.PjT);
            this.Zh = (TextView)this.PjT.findViewById(com.bytedance.sdk.openadsdk.utils.qla.Tn);
            View view1 = this.PjT.findViewById(com.bytedance.sdk.openadsdk.utils.qla.XWz);
            if(z) {
                view1.setClickable(true);
                view1.setOnClickListener(new View.OnClickListener() {
                    final gK PjT;

                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        gK.this.ReZ();
                        if(gK.this.cr != null) {
                            gK.this.cr.PjT(PjT.ReZ, null);
                        }
                    }
                });
                return;
            }
            view1.setOnClickListener(null);
            view1.setClickable(false);
        }
    }

    private void PjT(c c0, boolean z) {
        if(c0 == null || (this.PjT == null || this.ReZ == null || this.PjT.getVisibility() == 0)) {
            return;
        }
        Zh gK$Zh0 = this.JQp;
        if(gK$Zh0 != null) {
            gK$Zh0.qj();
        }
        String s = z ? String.format(Lrd.PjT(this.ReZ, "tt_video_without_wifi_tips"), Math.ceil(((double)c0.e()) * 1.0 / 1048576.0).floatValue()) : Lrd.PjT(this.ReZ, "tt_video_without_wifi_tips") + Lrd.PjT(this.ReZ, "tt_video_bytesize");
        qZS.PjT(this.PjT, 0);
        qZS.PjT(this.Zh, s);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if(qZS.cr(this.PjT)) {
            View view0 = this.PjT;
            if(view0 != null) {
                view0.bringToFront();
                Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
            }
        }
    }

    private boolean PjT(int v) {
        if(this.PjT()) {
            return true;
        }
        if(!this.cz) {
            if(this.cr != null) {
                Zh gK$Zh0 = this.JQp;
                if(gK$Zh0 != null) {
                    if(gK$Zh0.DWo()) {
                        this.cr.JQp(null, null);
                    }
                    this.cr.PjT(PjT.PjT, null);
                }
            }
            this.PjT(this.XX, true);
            return false;
        }
        return true;
    }

    public void PjT(Context context0, ViewGroup viewGroup0) {
        if(context0 != null && viewGroup0 instanceof ViewGroup) {
            this.Au = viewGroup0;
            this.ReZ = ub.PjT().getApplicationContext();
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.xf.Zh.PjT pjT0, Zh gK$Zh0) {
        this.JQp = gK$Zh0;
        this.cr = pjT0;
    }

    public void PjT(boolean z) {
        if(z) {
            this.Zh();
        }
        this.cr();
    }

    public boolean PjT() {
        return this.PjT != null && this.PjT.getVisibility() == 0;
    }

    public boolean PjT(int v, c c0, boolean z) {
        Context context0 = this.ReZ;
        if(context0 != null && c0 != null) {
            this.PjT(context0, this.Au, z);
            this.XX = c0;
            return v == 1 || v == 2 ? this.PjT(v) : true;
        }
        return true;
    }

    private void ReZ() {
        if(this.ReZ == null) {
            return;
        }
        this.cr();
    }

    private void Zh() {
        this.XX = null;
    }

    private void cr() {
        View view0 = this.PjT;
        if(view0 != null) {
            view0.setVisibility(8);
        }
    }
}

