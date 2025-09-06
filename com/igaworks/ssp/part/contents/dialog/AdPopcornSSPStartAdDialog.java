package com.igaworks.ssp.part.contents.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.igaworks.ssp.J;
import com.igaworks.ssp.R.drawable;
import com.igaworks.ssp.R.mipmap;
import com.igaworks.ssp.l;
import java.lang.ref.WeakReference;

public class AdPopcornSSPStartAdDialog extends Dialog {
    private WeakReference a;
    private View b;
    private l c;

    public AdPopcornSSPStartAdDialog(Context context0, View view0, l l0, int v) {
        super(context0, v);
        this.a = new WeakReference(context0);
        this.b = view0;
        this.c = l0;
    }

    private View a() {
        class a implements View.OnClickListener {
            final AdPopcornSSPStartAdDialog a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                AdPopcornSSPStartAdDialog.this.dismiss();
            }
        }

        View view0 = new LinearLayout(((Context)this.a.get()));
        view0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        ((LinearLayout)view0).setGravity(16);
        ((LinearLayout)view0).setOrientation(1);
        ImageView imageView0 = new ImageView(((Context)this.a.get()));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(J.a(((Context)this.a.get()), 20), J.a(((Context)this.a.get()), 20));
        linearLayout$LayoutParams0.rightMargin = J.a(((Context)this.a.get()), 16);
        linearLayout$LayoutParams0.bottomMargin = J.a(((Context)this.a.get()), 8);
        linearLayout$LayoutParams0.gravity = 5;
        imageView0.setLayoutParams(linearLayout$LayoutParams0);
        imageView0.setImageResource(mipmap.interstitial_close);
        imageView0.setOnClickListener(new a(this));
        ((ViewGroup)view0).addView(imageView0);
        LinearLayout linearLayout0 = new LinearLayout(((Context)this.a.get()));
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams1.leftMargin = J.a(((Context)this.a.get()), 16);
        linearLayout$LayoutParams1.rightMargin = J.a(((Context)this.a.get()), 16);
        linearLayout0.setLayoutParams(linearLayout$LayoutParams1);
        linearLayout0.setGravity(16);
        linearLayout0.setOrientation(1);
        linearLayout0.setBackgroundResource(drawable.apssp_card_round_bg);
        if(Build.VERSION.SDK_INT > 21) {
            linearLayout0.setClipToOutline(true);
        }
        View view1 = this.b;
        if(view1 != null) {
            ViewGroup viewGroup0 = (ViewGroup)view1.getParent();
            if(viewGroup0 != null) {
                viewGroup0.removeView(this.b);
            }
            linearLayout0.addView(this.b);
        }
        ((ViewGroup)view0).addView(linearLayout0);
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
        windowManager$LayoutParams0.dimAmount = 0.5f;
        this.getWindow().setAttributes(windowManager$LayoutParams0);
        this.setContentView(this.a());
    }

    @Override  // android.app.Dialog
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            View view0 = this.b;
            if(view0 != null) {
                ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
                if(viewGroup0 != null) {
                    viewGroup0.removeView(this.b);
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

