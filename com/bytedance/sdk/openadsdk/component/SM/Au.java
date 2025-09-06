package com.bytedance.sdk.openadsdk.component.SM;

import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class Au {
    private static boolean PjT;
    private xE ReZ;
    private static Drawable Zh;
    private TextView cr;

    public void PjT() {
        this.cr.setVisibility(8);
        this.Zh();
        try {
            Drawable drawable0 = Au.Zh;
            if(drawable0 == null) {
                this.ReZ.setVisibility(8);
                return;
            }
            this.ReZ.setImageDrawable(drawable0);
            if(this.cr.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.ReZ.getLayoutParams();
                viewGroup$MarginLayoutParams0.setMargins(0, 0, 0, 0);
                this.ReZ.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
        }
        catch(Throwable unused_ex) {
            this.ReZ.setVisibility(8);
        }
    }

    public void PjT(ReZ reZ0, Owx owx0, float f, float f1, boolean z) {
        if(reZ0 != null) {
            this.ReZ = reZ0.getHostAppIcon();
            this.cr = reZ0.getHostAppName();
            View view0 = reZ0.getUserInfo();
            if(reZ0 instanceof cr) {
                xE xE0 = this.ReZ;
                if(xE0 != null) {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = xE0.getLayoutParams();
                    if(viewGroup$LayoutParams0 != null) {
                        if(owx0.jK() == 1) {
                            int v = qZS.Zh(this.ReZ.getContext(), 40.0f);
                            viewGroup$LayoutParams0.width = v;
                            viewGroup$LayoutParams0.height = v;
                        }
                        else {
                            int v1 = qZS.Zh(this.ReZ.getContext(), 30.0f);
                            viewGroup$LayoutParams0.width = v1;
                            viewGroup$LayoutParams0.height = v1;
                        }
                        this.ReZ.setLayoutParams(viewGroup$LayoutParams0);
                    }
                }
                if(this.cr != null) {
                    if(owx0.jK() == 1) {
                        this.cr.setTextSize(30.0f);
                    }
                    else {
                        this.cr.setTextSize(24.0f);
                    }
                }
                if(view0 != null) {
                    ViewGroup.LayoutParams viewGroup$LayoutParams1 = view0.getLayoutParams();
                    if(viewGroup$LayoutParams1 != null) {
                        viewGroup$LayoutParams1.height = owx0.jK() == 1 ? qZS.Zh(view0.getContext(), 107.0f) : qZS.Zh(view0.getContext(), 60.0f);
                        view0.setLayoutParams(viewGroup$LayoutParams1);
                    }
                }
            }
            if(view0 != null) {
                view0.setOnClickListener(new View.OnClickListener() {
                    final Au PjT;

                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                    }
                });
            }
        }
    }

    public static Drawable ReZ() {
        return Au.Zh;
    }

    public void Zh() {
        if(!Au.PjT) {
            try {
                int v = SM.Zh().SM();
                if(v != 0) {
                    Au.Zh = ub.PjT().getResources().getDrawable(v);
                }
            }
            catch(Throwable unused_ex) {
            }
            Au.PjT = true;
        }
    }
}

