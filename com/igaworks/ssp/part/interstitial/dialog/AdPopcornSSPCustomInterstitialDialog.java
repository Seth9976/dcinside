package com.igaworks.ssp.part.interstitial.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.igaworks.ssp.J;
import com.igaworks.ssp.R.string;
import com.igaworks.ssp.s0;
import com.naver.gfpsdk.GfpBannerAdView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class AdPopcornSSPCustomInterstitialDialog extends Dialog {
    private WeakReference a;
    private GfpBannerAdView b;
    private HashMap c;
    private TextView d;

    public AdPopcornSSPCustomInterstitialDialog(Context context0, GfpBannerAdView gfpBannerAdView0, HashMap hashMap0, int v) {
        super(context0, v);
        this.a = new WeakReference(context0);
        this.b = gfpBannerAdView0;
        this.c = hashMap0;
    }

    private View a() {
        class a implements View.OnClickListener {
            final AdPopcornSSPCustomInterstitialDialog a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                AdPopcornSSPCustomInterstitialDialog.this.dismiss();
            }
        }

        int v = Color.parseColor("#000000");
        HashMap hashMap0 = this.c;
        if(hashMap0 != null) {
            v = (int)(((Integer)hashMap0.get("backgroundColor")));
        }
        View view0 = new LinearLayout(((Context)this.a.get()));
        ((LinearLayout)view0).setOrientation(1);
        view0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        ((LinearLayout)view0).setGravity(17);
        ((LinearLayout)view0).setOrientation(1);
        view0.setBackgroundColor(v);
        this.d = new TextView(((Context)this.a.get()));
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, J.a(((Context)this.a.get()), 26));
        frameLayout$LayoutParams0.topMargin = J.a(((Context)this.a.get()), -13);
        frameLayout$LayoutParams0.gravity = 5;
        this.d.setLayoutParams(frameLayout$LayoutParams0);
        this.d.setGravity(5);
        s0.a(this.d, ((Context)this.a.get()).getString(string.close_ad), 16, Color.parseColor("#ffffff"), null, 0, 1, TextUtils.TruncateAt.END, false);
        ((ViewGroup)view0).addView(this.d);
        this.d.setOnClickListener(new a(this));
        ((ViewGroup)view0).addView(((View)this.b));
        return view0;
    }

    @Override  // android.app.Dialog
    public void onAttachedToWindow() {
    }

    @Override  // android.app.Dialog
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
        windowManager$LayoutParams0.flags = 2;
        windowManager$LayoutParams0.dimAmount = 1.0f;
        this.getWindow().setAttributes(windowManager$LayoutParams0);
        this.setContentView(this.a());
    }

    @Override  // android.app.Dialog
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            GfpBannerAdView gfpBannerAdView0 = this.b;
            if(gfpBannerAdView0 != null) {
                ViewGroup viewGroup0 = (ViewGroup)((View)gfpBannerAdView0).getParent();
                if(viewGroup0 != null) {
                    viewGroup0.removeView(((View)this.b));
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.app.Dialog
    protected void onStop() {
        super.onStop();
    }
}

