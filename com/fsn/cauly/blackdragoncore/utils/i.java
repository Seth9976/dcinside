package com.fsn.cauly.blackdragoncore.utils;

import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.fsn.cauly.R.drawable;
import com.fsn.cauly.Y.i0.a;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.j0;
import com.fsn.cauly.blackdragoncore.contents.f;

public class i {
    static RelativeLayout.LayoutParams a(i0 i00, int v, int v1) {
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v, v1);
        if(i00 != null && (i00.a == a.b || i00.a == a.d)) {
            relativeLayout$LayoutParams0.rightMargin = d.a(i00.b, 10.0f);
            relativeLayout$LayoutParams0.bottomMargin = d.a(i00.b, 10.0f);
            relativeLayout$LayoutParams0.addRule(11);
            relativeLayout$LayoutParams0.addRule(12);
            return relativeLayout$LayoutParams0;
        }
        relativeLayout$LayoutParams0.rightMargin = d.a(i00.b, 3.0f);
        relativeLayout$LayoutParams0.topMargin = d.a(i00.b, 3.0f);
        relativeLayout$LayoutParams0.addRule(11);
        return relativeLayout$LayoutParams0;
    }

    public static void a(i0 i00, j0 j00) {
        if(i00 != null && j00 != null) {
            try {
                if(i00.a() instanceof ViewGroup) {
                    RelativeLayout relativeLayout0 = (RelativeLayout)i00.a();
                    if(relativeLayout0 == null) {
                        return;
                    }
                    i.b(relativeLayout0, i00, j00);
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public static void b(RelativeLayout relativeLayout0, i0 i00, j0 j00) {
        class com.fsn.cauly.blackdragoncore.utils.i.a implements View.OnClickListener {
            final ImageView a;
            final ImageView b;

            com.fsn.cauly.blackdragoncore.utils.i.a(ImageView imageView0, ImageView imageView1) {
                this.b = imageView1;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                this.a.setVisibility(8);
                this.b.setVisibility(0);
            }
        }


        class b implements View.OnClickListener {
            final i0 a;
            final j0 b;

            b(i0 i00, j0 j00) {
                this.b = j00;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                i.b(this.a, this.b);
            }
        }

        if(j00 != null && i00 != null && relativeLayout0 != null) {
            try {
                if(i00.b != null && j00.n0) {
                    if(i.c(relativeLayout0, i00, j00)) {
                        return;
                    }
                    ImageView imageView0 = new ImageView(i00.b);
                    ImageView.ScaleType imageView$ScaleType0 = ImageView.ScaleType.FIT_XY;
                    imageView0.setScaleType(imageView$ScaleType0);
                    imageView0.setTag("optout");
                    imageView0.setImageResource(drawable.optout);
                    ImageView imageView1 = new ImageView(i00.b);
                    imageView1.setScaleType(imageView$ScaleType0);
                    imageView1.setTag("optout_exp");
                    imageView1.setImageResource(drawable.optout_exp);
                    imageView0.setOnClickListener(new com.fsn.cauly.blackdragoncore.utils.i.a(imageView0, imageView1));
                    imageView1.setOnClickListener(new b(i00, j00));
                    relativeLayout0.addView(imageView0, i.a(i00, d.a(i00.b, 15.0f), d.a(i00.b, 15.0f)));
                    relativeLayout0.addView(imageView1, i.a(i00, d.a(i00.b, 56.0f), d.a(i00.b, 15.0f)));
                    imageView1.setVisibility(8);
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public static void b(i0 i00, j0 j00) {
        if(i00 != null && j00 != null) {
            String s = i00.f;
            String s1 = j.a(i00.b, "GID", "");
            f.a(i00.b, j00, "http://rd.cauly.co.kr/opt-out?sdk_type=native&platform=Android&code=" + s + "&scode=" + s1 + "&ad_cd=" + j00.a, "", i00.j);
        }
    }

    private static boolean c(RelativeLayout relativeLayout0, i0 i00, j0 j00) {
        class c implements View.OnClickListener {
            final i0 a;
            final j0 b;

            c(i0 i00, j0 j00) {
                this.b = j00;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                i.b(this.a, this.b);
            }
        }

        View view0 = relativeLayout0.findViewWithTag("optout");
        View view1 = relativeLayout0.findViewWithTag("optout_exp");
        if(view0 != null && view1 != null) {
            view0.setVisibility(0);
            view0.bringToFront();
            view1.setVisibility(8);
            view1.bringToFront();
            view1.setOnClickListener(new c(i00, j00));
            return true;
        }
        return false;
    }
}

