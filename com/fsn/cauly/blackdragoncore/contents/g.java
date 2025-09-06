package com.fsn.cauly.blackdragoncore.contents;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.m0;
import com.fsn.cauly.Y.s0.a;
import com.fsn.cauly.Y.s0;
import com.fsn.cauly.Y.u0;
import com.fsn.cauly.Y.v0;
import com.fsn.cauly.blackdragoncore.utils.f;
import com.fsn.cauly.blackdragoncore.utils.m;

public class g extends c implements a {
    class com.fsn.cauly.blackdragoncore.contents.g.a extends v0 {
        final g s;

        @Override  // com.fsn.cauly.Y.v0
        public void c() {
            try {
                g.this.h = g.this.v();
                g g0 = g.this;
                if(g0.h == null) {
                    g0.h = m.a(g0.getCurrentContext(), "b_left.png");
                    g.this.h = g.this.t(g.this.h, g.this.d.y);
                }
                else {
                    g0.m = true;
                }
                String s = m0.a(g.this.b.m, true);
                g.this.i = m.a(g.this.getCurrentContext(), s);
                g.this.i = g.this.t(g.this.i, g.this.d.y);
                String s1 = m0.a(g.this.b.m, false);
                g.this.j = Drawable.createFromStream(m.b(g.this.getCurrentContext(), s1), s1);
                int[] arr_v = m0.b(g.this.b.m);
                g.this.k = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, arr_v);
                String s2 = m0.a(g.this.b.l);
                g.this.l = m.a(g.this.getCurrentContext(), s2);
                g.this.l = g.this.t(g.this.l, g.this.d.y);
                return;
            }
            catch(Throwable throwable0) {
            }
            throwable0.printStackTrace();
        }
    }

    com.fsn.cauly.blackdragoncore.contents.g.a g;
    Bitmap h;
    Bitmap i;
    Drawable j;
    GradientDrawable k;
    Bitmap l;
    boolean m;

    public g(i0 i00, b c$b0) {
        super(i00, c$b0);
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        int v = s00.getErrorCode();
        if(v == 0) {
            this.u();
            this.i();
        }
        else {
            this.c(v, "Failed to load AD image");
        }
        this.g = null;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean k() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean l() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean m() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean o() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public void p() {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void q() {
        com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Start text content");
        com.fsn.cauly.blackdragoncore.contents.g.a g$a0 = new com.fsn.cauly.blackdragoncore.contents.g.a(this);
        this.g = g$a0;
        g$a0.a(this.a.p);
        this.g.a(this);
        this.g.execute();
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void s() {
        com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Stop text content");
        com.fsn.cauly.blackdragoncore.contents.g.a g$a0 = this.g;
        if(g$a0 != null) {
            g$a0.cancel();
            this.g = null;
        }
        Bitmap bitmap0 = this.h;
        if(bitmap0 != null) {
            bitmap0.recycle();
            this.h = null;
        }
        Bitmap bitmap1 = this.i;
        if(bitmap1 != null) {
            bitmap1.recycle();
            this.i = null;
        }
        Bitmap bitmap2 = this.l;
        if(bitmap2 != null) {
            bitmap2.recycle();
            this.l = null;
        }
    }

    Bitmap t(Bitmap bitmap0, int v) {
        if(bitmap0 == null) {
            return null;
        }
        double f = ((double)v) / ((double)bitmap0.getHeight());
        return f.a(bitmap0, ((int)(((double)bitmap0.getWidth()) * f)), v, true);
    }

    void u() {
        int v2;
        this.setBackgroundDrawable(this.j);
        ImageView imageView0 = new ImageView(this.a.b);
        imageView0.setImageBitmap(this.h);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -1);
        if(this.m) {
            linearLayout$LayoutParams0.setMargins(5, 5, 10, 5);
        }
        else {
            linearLayout$LayoutParams0.setMargins(0, 0, 10, 0);
        }
        this.addView(imageView0, linearLayout$LayoutParams0);
        LinearLayout linearLayout0 = new LinearLayout(this.a.b);
        linearLayout0.setOrientation(1);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(0, -2);
        int v = 16;
        linearLayout$LayoutParams1.gravity = 16;
        linearLayout$LayoutParams1.weight = 1.0f;
        linearLayout$LayoutParams1.setMargins(10, 0, 0, 0);
        this.addView(linearLayout0, linearLayout$LayoutParams1);
        int v1 = this.d.y;
        if(v1 > 120) {
            v2 = 27;
            v = 25;
        }
        else if(v1 > 100) {
            v2 = 23;
            v = 21;
        }
        else {
            v2 = 18;
        }
        TextView textView0 = new TextView(this.a.b);
        textView0.setText(this.b.c);
        textView0.setTextColor(-1);
        textView0.setSingleLine(true);
        textView0.setTextSize(0, ((float)v2));
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams2.setMargins(0, 0, 0, 2);
        linearLayout0.addView(textView0, linearLayout$LayoutParams2);
        TextView textView1 = new TextView(this.a.b);
        textView1.setText(this.b.d);
        textView1.setTextColor(-1);
        textView1.setSingleLine(true);
        textView1.setTextSize(0, ((float)v));
        linearLayout0.addView(textView1, new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView1 = new ImageView(this.a.b);
        imageView1.setBackgroundDrawable(this.k);
        imageView1.setImageBitmap(this.l);
        this.addView(imageView1, new LinearLayout.LayoutParams(-2, -1));
        ImageView imageView2 = new ImageView(this.a.b);
        imageView2.setImageBitmap(this.i);
        this.addView(imageView2, new LinearLayout.LayoutParams(-2, -1));
    }

    Bitmap v() {
        String s = this.b.i;
        int v = this.d.y - 10;
        if(s != null && s.length() > 0 && s.startsWith("http")) {
            String s1 = m0.a(s, m0.e(this.a.b));
            if(!u0.a(s, s1, true)) {
                return null;
            }
            Bitmap bitmap0 = BitmapFactory.decodeFile(s1);
            if(bitmap0 == null) {
                return null;
            }
            Bitmap bitmap1 = f.a(bitmap0, v, v, true);
            bitmap0.recycle();
            if(bitmap1 == null) {
                return null;
            }
            Bitmap bitmap2 = f.a(bitmap1, 10);
            bitmap1.recycle();
            return bitmap2;
        }
        return null;
    }
}

