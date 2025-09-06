package com.bytedance.sdk.component.adexpress.cz;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.adsdk.Zh.cz;
import com.bytedance.sdk.component.adexpress.dynamic.cr.DWo;
import com.bytedance.sdk.component.utils.cRA;

public class yIW extends LinearLayout {
    public interface PjT {
    }

    private LinearLayout JQp;
    private TextView PjT;
    private TextView ReZ;
    private DWo XX;
    private cRA Zh;
    private PjT cr;
    private cz cz;

    public yIW(@NonNull Context context0, View view0, DWo dWo0) {
        super(context0);
        this.XX = dWo0;
        this.PjT(context0, view0);
    }

    private void PjT(Context context0, View view0) {
        this.setClipChildren(false);
        this.addView(view0);
        this.JQp = (LinearLayout)this.findViewById(0x7D06FFE2);
        this.PjT = (TextView)this.findViewById(0x7D06FFDF);
        this.ReZ = (TextView)this.findViewById(0x7D06FFDE);
        cz cz0 = (cz)this.findViewById(0x7D06FFD2);
        this.cz = cz0;
        cz0.setAnimation("lottie_json/twist_multi_angle.json");
        this.cz.setImageAssetsFolder("images/");
        this.cz.PjT(true);
    }

    public void PjT() {
        this.postDelayed(new Runnable() {
            final yIW PjT;

            @Override
            public void run() {
                try {
                    yIW.this.cz.PjT();
                }
                catch(Throwable unused_ex) {
                }
            }
        }, 500L);
    }

    public TextView getTopTextView() {
        return this.PjT;
    }

    public LinearLayout getWriggleLayout() {
        return this.JQp;
    }

    public View getWriggleProgressIv() {
        return this.cz;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.isShown()) {
            if(this.Zh == null) {
                this.Zh = new cRA(this.getContext().getApplicationContext(), 2);
            }
            new Object() {
                final yIW PjT;

            };
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            cz cz0 = this.cz;
            if(cz0 != null) {
                cz0.JQp();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public void setOnShakeViewListener(PjT yIW$PjT0) {
        this.cr = yIW$PjT0;
    }

    public void setShakeText(String s) {
        this.ReZ.setText(s);
    }
}

