package com.igaworks.ssp;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.HashMap;

public class s extends Dialog {
    private WeakReference a;
    private View b;
    private HashMap c;
    private TextView d;
    private AdPopcornSSPModalAd e;

    public s(Context context0, AdPopcornSSPModalAd adPopcornSSPModalAd0, View view0, HashMap hashMap0, int v) {
        super(context0, v);
        this.a = new WeakReference(context0);
        this.e = adPopcornSSPModalAd0;
        this.b = view0;
        this.c = hashMap0;
    }

    private View a() {
        class a implements View.OnClickListener {
            final s a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                try {
                    if(s.this.e.getCloseBtnType() == 1) {
                        SharedPreferences.Editor sharedPreferences$Editor0 = ((Context)s.this.a.get()).getSharedPreferences("adpopcorn_parameter", 0).edit();
                        sharedPreferences$Editor0.putInt("modal_ad_impression_day", Calendar.getInstance().get(6));
                        sharedPreferences$Editor0.commit();
                    }
                }
                catch(Exception unused_ex) {
                }
                s.this.dismiss();
            }
        }

        View view0 = new LinearLayout(((Context)this.a.get()));
        view0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        if(this.e.getAdGravity() == 0x30) {
            ((LinearLayout)view0).setGravity(0x30);
        }
        else if(this.e.getAdGravity() == 80) {
            ((LinearLayout)view0).setGravity(80);
        }
        else {
            ((LinearLayout)view0).setGravity(16);
        }
        ((LinearLayout)view0).setOrientation(1);
        this.d = new TextView(((Context)this.a.get()));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, J.a(((Context)this.a.get()), 26));
        linearLayout$LayoutParams0.topMargin = this.e.getAdGravity() == 0x30 ? J.a(((Context)this.a.get()), 13) : J.a(((Context)this.a.get()), -13);
        linearLayout$LayoutParams0.rightMargin = J.a(((Context)this.a.get()), 20);
        linearLayout$LayoutParams0.gravity = 5;
        this.d.setLayoutParams(linearLayout$LayoutParams0);
        this.d.setGravity(5);
        if(this.e.getCloseBtnType() == 0) {
            s0.a(this.d, ((Context)this.a.get()).getString(string.close_ad), 16, Color.parseColor("#e9e9e9"), null, 0, 1, TextUtils.TruncateAt.END, false);
        }
        else {
            s0.a(this.d, ((Context)this.a.get()).getString(string.close_today_ad), 16, Color.parseColor("#e9e9e9"), null, 0, 1, TextUtils.TruncateAt.END, false);
        }
        ((ViewGroup)view0).addView(this.d);
        this.d.setOnClickListener(new a(this));
        ((ViewGroup)view0).addView(this.b);
        TextView textView0 = new TextView(((Context)this.a.get()));
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, J.a(((Context)this.a.get()), 26));
        linearLayout$LayoutParams1.topMargin = J.a(((Context)this.a.get()), -13);
        textView0.setLayoutParams(linearLayout$LayoutParams0);
        ((ViewGroup)view0).addView(textView0);
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
        windowManager$LayoutParams0.dimAmount = this.e.getBackgroundAlpha();
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

