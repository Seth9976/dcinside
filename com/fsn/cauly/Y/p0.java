package com.fsn.cauly.Y;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView;
import com.fsn.cauly.blackdragoncore.contents.c.b;
import com.fsn.cauly.blackdragoncore.contents.c;
import com.fsn.cauly.blackdragoncore.contents.d.k;
import com.fsn.cauly.blackdragoncore.utils.f;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.fsn.cauly.blackdragoncore.utils.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class p0 extends RelativeLayout implements View.OnClickListener, n0, a, com.fsn.cauly.blackdragoncore.contents.c.a, k {
    class com.fsn.cauly.Y.p0.a extends v0 {
        final p0 s;

        @Override  // com.fsn.cauly.Y.v0
        public void c() {
            p0.this.d = m.a(p0.this.o.b, "pop_btn_x.png");
            p0.this.e = m.a(p0.this.getContext(), "back_on.png");
            p0.this.f = m.a(p0.this.getContext(), "fwd_on.png");
            p0.this.g = m.a(p0.this.getContext(), "refresh.png");
            p0.this.h = m.a(p0.this.getContext(), "close.png");
            p0 p00 = p0.this;
            Bitmap bitmap0 = p00.d;
            if(bitmap0 != null) {
                p00.d = f.a(bitmap0, f.a(p00.getContext(), p0.this.d.getWidth()), f.a(p0.this.getContext(), p0.this.d.getHeight()), true);
            }
            if(p0.this.d == null) {
                this.c = -100;
            }
        }
    }

    WeakReference a;
    c b;
    RelativeLayout c;
    Bitmap d;
    Bitmap e;
    Bitmap f;
    Bitmap g;
    Bitmap h;
    ImageButton i;
    View j;
    View k;
    View l;
    View m;
    com.fsn.cauly.Y.p0.a n;
    i0 o;
    j0 p;
    ProgressBar q;
    ProgressBar r;
    boolean s;
    String t;
    boolean u;
    int v;
    final int w;
    final int x;
    final int y;
    static boolean z = false;

    static {
    }

    public p0(Context context0) {
        super(context0);
        this.v = -2;
        this.w = 720;
        this.x = 1230;
        this.y = 0x500;
    }

    private k0 a(ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            k0 k00 = (k0)object0;
            if(!TextUtils.isEmpty(k00.a) && k00.a.equals("frame")) {
                return k00;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void a() {
        if(this.s) {
            return;
        }
        this.s = true;
        ProgressBar progressBar0 = this.q;
        if(progressBar0 != null) {
            progressBar0.setVisibility(4);
        }
        ImageButton imageButton0 = this.i;
        if(imageButton0 != null) {
            imageButton0.setVisibility(0);
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void a(int v, String s) {
        if(this.s) {
            return;
        }
        this.s = true;
        ProgressBar progressBar0 = this.q;
        if(progressBar0 != null) {
            progressBar0.setVisibility(4);
        }
        this.j();
    }

    public void a(i0 i00, j0 j00, int v) {
        this.p = j00;
        this.o = i00;
        if(j00 != null) {
            this.b = c.a(i00, j00, b.c);
        }
        c c0 = this.b;
        if(c0 == null) {
            return;
        }
        c0.setListener(this);
        this.t = j00.v;
        if(j00.l == null || !j00.l.equals("richvideo")) {
            this.d(i00, this.b);
        }
        else {
            this.c(i00, j00);
        }
        this.i();
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        if(s00.getErrorCode() == 0) {
            ImageButton imageButton0 = this.i;
            if(imageButton0 != null) {
                imageButton0.setImageBitmap(this.d);
            }
            this.k();
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void a(c c0) {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void a(c c0, MotionEvent motionEvent0) {
    }

    private void b(View view0, Drawable drawable0) {
        view0.setBackground(drawable0);
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void b() {
        if(this.p != null && this.p.T) {
            this.j();
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void c() {
        ProgressBar progressBar0 = this.r;
        if(progressBar0 != null) {
            progressBar0.setVisibility(4);
        }
        c c0 = this.b;
        if(c0 != null) {
            c0.setVisibility(0);
        }
    }

    void c(i0 i00, j0 j00) {
        float f;
        j0 j01 = d.a(j00, j00.e);
        if(j01 != null) {
            ArrayList arrayList0 = j01.L;
            if(arrayList0 != null) {
                k0 k00 = this.a(arrayList0);
                if(k00 == null) {
                    return;
                }
                if(com.fsn.cauly.blackdragoncore.utils.d.a(i00.b) <= com.fsn.cauly.blackdragoncore.utils.d.c(i00.b)) {
                    f = ((float)com.fsn.cauly.blackdragoncore.utils.d.c(i00.b)) / 1280.0f;
                }
                else if(1.777778f >= ((float)com.fsn.cauly.blackdragoncore.utils.d.a(i00.b)) / ((float)com.fsn.cauly.blackdragoncore.utils.d.c(i00.b))) {
                    f = ((float)com.fsn.cauly.blackdragoncore.utils.d.a(i00.b)) / 1280.0f;
                }
                else {
                    f = ((float)com.fsn.cauly.blackdragoncore.utils.d.c(i00.b)) / 720.0f;
                }
                Point point0 = new Point(((int)(((double)k00.g) * ((double)f))), ((int)(((double)k00.h) * ((double)f))));
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.b();
                this.c = com.fsn.cauly.blackdragoncore.utils.c.a(i00.b, relativeLayout$LayoutParams0);
                ((BDRichVideoContentView)this.b).setNativeAdListener(this);
                this.b.setContentSize(point0);
                this.c.addView(this.b, relativeLayout$LayoutParams0);
                if(!j01.P) {
                    this.b.setVisibility(4);
                }
                this.r = new ProgressBar(i00.b, null, 0x101007A);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = com.fsn.cauly.blackdragoncore.utils.c.c();
                relativeLayout$LayoutParams1.addRule(13);
                this.r.setLayoutParams(relativeLayout$LayoutParams1);
                this.c.addView(this.r);
                Context context0 = i00.b;
                if(context0 instanceof Activity) {
                    this.v = ((Activity)context0).getResources().getConfiguration().orientation;
                    ((Activity)context0).setRequestedOrientation(1);
                    if(((Activity)context0).isFinishing()) {
                        return;
                    }
                }
                ((BDRichVideoContentView)this.b).a(j01);
                ((BDRichVideoContentView)this.b).p();
                g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Show RichVideo popup dialog");
                this.addView(this.c);
                p0.z = true;
                com.fsn.cauly.blackdragoncore.c.b().c(i00, j01);
                o.a(i00, j01, null, null);
            }
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.d$k
    public void d() {
        this.u = true;
        this.j();
    }

    void d(i0 i00, c c0) {
        this.o = i00;
        Context context0 = i00.b;
        if(context0 instanceof Activity) {
            this.c = com.fsn.cauly.blackdragoncore.utils.c.a(context0, com.fsn.cauly.blackdragoncore.utils.c.b());
        }
        if(c0 instanceof com.fsn.cauly.blackdragoncore.contents.f) {
            Activity activity0 = (Activity)i00.b;
            int v = activity0 == null ? 0 : com.fsn.cauly.blackdragoncore.utils.d.a(activity0.getWindow());
            this.c.addView(c0, new RelativeLayout.LayoutParams(-1, com.fsn.cauly.blackdragoncore.utils.d.a(i00.b) - v - com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 41.5f)));
        }
        else {
            this.c.addView(c0, com.fsn.cauly.blackdragoncore.utils.c.b());
        }
        this.addView(this.c);
        if(c0.o()) {
            this.q = new ProgressBar(i00.b, null, 0x101007A);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.c();
            relativeLayout$LayoutParams0.addRule(13);
            this.q.setLayoutParams(relativeLayout$LayoutParams0);
            this.c.addView(this.q);
        }
        if(!c0.k()) {
            if(c0 instanceof com.fsn.cauly.blackdragoncore.contents.f) {
                LinearLayout linearLayout0 = new LinearLayout(i00.b);
                linearLayout0.setOrientation(1);
                linearLayout0.setLayoutParams(new LinearLayout.LayoutParams(-1, com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 41.5f)));
                View view0 = new View(i00.b);
                view0.setBackgroundColor(Color.parseColor("#cecece"));
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 1.0f));
                LinearLayout linearLayout1 = new LinearLayout(i00.b);
                linearLayout1.setBackgroundColor(Color.parseColor("#f8f8f8"));
                linearLayout1.setOrientation(0);
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 41.0f));
                linearLayout$LayoutParams1.gravity = 16;
                linearLayout1.setWeightSum(1.0f);
                RelativeLayout relativeLayout0 = new RelativeLayout(i00.b);
                LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                linearLayout$LayoutParams2.weight = 0.25f;
                this.j = new ImageButton(i00.b);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 9.0f), com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 16.0f));
                relativeLayout$LayoutParams1.addRule(13);
                this.j.setLayoutParams(relativeLayout$LayoutParams1);
                relativeLayout0.addView(this.j);
                View view1 = new View(i00.b);
                view1.setId(3);
                view1.setOnClickListener(this);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 30.0f), com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 30.0f));
                relativeLayout$LayoutParams2.addRule(13);
                view1.setLayoutParams(relativeLayout$LayoutParams2);
                relativeLayout0.addView(view1);
                RelativeLayout relativeLayout1 = new RelativeLayout(i00.b);
                LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                linearLayout$LayoutParams3.weight = 0.25f;
                this.k = new ImageButton(i00.b);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 9.0f), com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 16.0f));
                relativeLayout$LayoutParams3.addRule(13);
                this.k.setLayoutParams(relativeLayout$LayoutParams3);
                relativeLayout1.addView(this.k);
                View view2 = new View(i00.b);
                view2.setId(4);
                view2.setOnClickListener(this);
                view2.setLayoutParams(relativeLayout$LayoutParams2);
                relativeLayout1.addView(view2);
                RelativeLayout relativeLayout2 = new RelativeLayout(i00.b);
                LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, -1);
                linearLayout$LayoutParams4.weight = 0.25f;
                this.l = new ImageButton(i00.b);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 16.0f), com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 16.0f));
                relativeLayout$LayoutParams4.addRule(13);
                this.l.setLayoutParams(relativeLayout$LayoutParams4);
                relativeLayout2.addView(this.l);
                View view3 = new View(i00.b);
                view3.setId(5);
                view3.setOnClickListener(this);
                view3.setLayoutParams(relativeLayout$LayoutParams2);
                relativeLayout2.addView(view3);
                RelativeLayout relativeLayout3 = new RelativeLayout(i00.b);
                LinearLayout.LayoutParams linearLayout$LayoutParams5 = new LinearLayout.LayoutParams(-1, -1);
                linearLayout$LayoutParams5.weight = 0.25f;
                this.m = new ImageButton(i00.b);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 13.5f), com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 13.5f));
                relativeLayout$LayoutParams5.addRule(13);
                this.m.setLayoutParams(relativeLayout$LayoutParams5);
                relativeLayout3.addView(this.m);
                View view4 = new View(i00.b);
                view4.setId(1);
                view4.setOnClickListener(this);
                view4.setLayoutParams(relativeLayout$LayoutParams2);
                relativeLayout3.addView(view4);
                linearLayout1.addView(relativeLayout0, linearLayout$LayoutParams2);
                linearLayout1.addView(relativeLayout1, linearLayout$LayoutParams3);
                linearLayout1.addView(relativeLayout2, linearLayout$LayoutParams4);
                linearLayout1.addView(relativeLayout3, linearLayout$LayoutParams5);
                linearLayout0.addView(view0, linearLayout$LayoutParams0);
                linearLayout0.addView(linearLayout1, linearLayout$LayoutParams1);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams6 = com.fsn.cauly.blackdragoncore.utils.c.c();
                relativeLayout$LayoutParams6.addRule(12);
                this.c.addView(linearLayout0, relativeLayout$LayoutParams6);
            }
            else {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams7 = com.fsn.cauly.blackdragoncore.utils.c.c();
                relativeLayout$LayoutParams7.addRule(11);
                relativeLayout$LayoutParams7.addRule(10);
                int v1 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 7.0f);
                relativeLayout$LayoutParams7.setMargins(0, com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 7.0f), v1, 0);
                ImageButton imageButton0 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), this.d, relativeLayout$LayoutParams7);
                this.i = imageButton0;
                imageButton0.setPadding(0, 0, 0, 0);
                this.i.setVisibility(4);
                this.c.addView(this.i);
                this.i.setId(1);
                this.i.setOnClickListener(this);
            }
            com.fsn.cauly.Y.p0.a p0$a0 = new com.fsn.cauly.Y.p0.a(this);
            this.n = p0$a0;
            p0$a0.a(i00.p);
            this.n.a(this);
            this.n.execute();
        }
        Context context1 = i00.b;
        if(context1 instanceof Activity) {
            this.v = ((Activity)context1).getResources().getConfiguration().orientation;
            if(this.p != null && (this.p.l != null && this.p.A != null && !this.p.l.equalsIgnoreCase("video"))) {
                if(this.p.A.equalsIgnoreCase("portrait_fix") || c0.m()) {
                    ((Activity)context1).setRequestedOrientation(1);
                }
                else if(this.p.A.equalsIgnoreCase("landscape_fix")) {
                    ((Activity)context1).setRequestedOrientation(0);
                }
                else if(!this.p.A.equalsIgnoreCase("allow_orientation_change")) {
                    com.fsn.cauly.blackdragoncore.utils.d.d(i00.b);
                }
            }
        }
        if(!(i00.b instanceof Activity) || ((Activity)i00.b).isFinishing()) {
            String s = this.p.e;
            if(s != null && s.startsWith("http")) {
                com.fsn.cauly.blackdragoncore.contents.f.a(i00.b, this.p, this.p.e, "", i00.j);
            }
        }
        else {
            p0.z = true;
            if("coververtical".equals(this.t)) {
                com.fsn.cauly.blackdragoncore.utils.b.a(this.c, com.fsn.cauly.blackdragoncore.utils.d.a(i00.b));
            }
            j0 j00 = this.p;
            if(j00 != null) {
                c0.a(j00);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return keyEvent0.getKeyCode() != 4 || (this.b == null || !this.b.j()) ? super.dispatchKeyEvent(keyEvent0) : false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void e() {
        this.u = true;
        this.j();
    }

    public void f() {
        com.fsn.cauly.Y.p0.a p0$a0 = this.n;
        if(p0$a0 != null) {
            p0$a0.cancel();
            this.n = null;
        }
        if(this.c != null) {
            c c0 = this.b;
            if(c0 != null) {
                c0.r();
                com.fsn.cauly.blackdragoncore.utils.c.a(this.b);
                this.c.removeView(this.b);
                this.b = null;
            }
            this.c = null;
        }
        p0.z = false;
    }

    void g() {
        if(this.p != null) {
            this.o.a(104, null, null);
        }
    }

    void h() {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        com.fsn.cauly.Y.n0.a n0$a0 = (com.fsn.cauly.Y.n0.a)weakReference0.get();
        if(n0$a0 == null) {
            return;
        }
        n0$a0.a(this, this.u);
    }

    void i() {
        if(this.p != null) {
            this.o.a(103, null, null);
        }
    }

    @SuppressLint({"WrongConstant"})
    public void j() {
        i0 i00 = this.o;
        if(i00 != null) {
            Context context0 = i00.b;
            if(context0 != null && context0 instanceof Activity) {
                ((Activity)context0).setRequestedOrientation(this.v);
            }
        }
        this.h();
        this.g();
        this.f();
        p0.z = false;
    }

    private void k() {
        if(this.b != null && this.b instanceof com.fsn.cauly.blackdragoncore.contents.f && ((com.fsn.cauly.blackdragoncore.contents.f)this.b).getWebView() != null) {
            Context context0 = this.o.b;
            if(context0 != null) {
                Resources resources0 = context0.getResources();
                if(resources0 == null) {
                    return;
                }
                View view0 = this.k;
                if(view0 != null && this.f != null) {
                    this.b(view0, new BitmapDrawable(resources0, this.f));
                }
                View view1 = this.j;
                if(view1 != null && this.e != null) {
                    this.b(view1, new BitmapDrawable(resources0, this.e));
                }
                View view2 = this.m;
                if(view2 != null && this.h != null) {
                    this.b(view2, new BitmapDrawable(resources0, this.h));
                }
                View view3 = this.l;
                if(view3 != null && this.g != null) {
                    this.b(view3, new BitmapDrawable(resources0, this.g));
                }
            }
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        switch(view0.getId()) {
            case 1: {
                this.u = true;
                this.j();
                return;
            }
            case 3: {
                c c0 = this.b;
                if(c0 != null && c0 instanceof com.fsn.cauly.blackdragoncore.contents.f) {
                    f0 f00 = ((com.fsn.cauly.blackdragoncore.contents.f)c0).getWebView();
                    if(f00 != null && f00.canGoBack()) {
                        f00.goBack();
                        return;
                    }
                }
                break;
            }
            case 4: {
                c c1 = this.b;
                if(c1 != null && c1 instanceof com.fsn.cauly.blackdragoncore.contents.f) {
                    f0 f01 = ((com.fsn.cauly.blackdragoncore.contents.f)c1).getWebView();
                    if(f01 != null && f01.canGoForward()) {
                        f01.goForward();
                        return;
                    }
                }
                break;
            }
            case 5: {
                c c2 = this.b;
                if(c2 != null && c2 instanceof com.fsn.cauly.blackdragoncore.contents.f) {
                    f0 f02 = ((com.fsn.cauly.blackdragoncore.contents.f)c2).getWebView();
                    if(f02 != null) {
                        f02.reload();
                        return;
                    }
                }
                break;
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j();
    }

    public void setListener(com.fsn.cauly.Y.n0.a n0$a0) {
        this.a = new WeakReference(n0$a0);
    }
}

