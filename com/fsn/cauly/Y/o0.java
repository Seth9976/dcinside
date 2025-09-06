package com.fsn.cauly.Y;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
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
import com.fsn.cauly.Logger.LogLevel;
import com.fsn.cauly.Logger;
import com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView;
import com.fsn.cauly.blackdragoncore.contents.c;
import com.fsn.cauly.blackdragoncore.contents.d.k;
import com.fsn.cauly.blackdragoncore.contents.h;
import com.fsn.cauly.blackdragoncore.utils.f;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.fsn.cauly.blackdragoncore.utils.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class o0 extends b0 implements View.OnClickListener, a, n0, com.fsn.cauly.Y.s0.a, com.fsn.cauly.blackdragoncore.contents.c.a, k {
    class b extends v0 {
        final o0 s;

        @Override  // com.fsn.cauly.Y.v0
        public void c() {
            o0.this.f = m.a(o0.this.q.b, "pop_btn_x.png");
            o0.this.g = m.a(o0.this.q.b, "back_on.png");
            o0.this.h = m.a(o0.this.q.b, "fwd_on.png");
            o0.this.i = m.a(o0.this.q.b, "refresh.png");
            o0.this.j = m.a(o0.this.q.b, "close.png");
            o0 o00 = o0.this;
            Bitmap bitmap0 = o00.f;
            if(bitmap0 != null) {
                o00.f = f.a(bitmap0, f.a(o00.getContext(), o0.this.f.getWidth()), f.a(o0.this.getContext(), o0.this.f.getHeight()), true);
            }
            if(o0.this.f == null) {
                this.c = -100;
            }
        }
    }

    final int A;
    static boolean B = false;
    WeakReference c;
    c d;
    RelativeLayout e;
    Bitmap f;
    Bitmap g;
    Bitmap h;
    Bitmap i;
    Bitmap j;
    ImageButton k;
    View l;
    View m;
    View n;
    View o;
    b p;
    i0 q;
    j0 r;
    ProgressBar s;
    ProgressBar t;
    boolean u;
    String v;
    boolean w;
    int x;
    final int y;
    final int z;

    static {
    }

    public o0(Context context0) {
        super(context0, 0x1030010);
        this.x = -2;
        this.y = 720;
        this.z = 1230;
        this.A = 0x500;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void a() {
        if(this.u) {
            return;
        }
        this.u = true;
        ProgressBar progressBar0 = this.s;
        if(progressBar0 != null) {
            progressBar0.setVisibility(4);
        }
        ImageButton imageButton0 = this.k;
        if(imageButton0 != null) {
            imageButton0.setVisibility(0);
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void a(int v, String s) {
        if(this.u) {
            return;
        }
        this.u = true;
        ProgressBar progressBar0 = this.s;
        if(progressBar0 != null) {
            progressBar0.setVisibility(4);
        }
        this.dismiss();
    }

    @Override  // com.fsn.cauly.Y.b0$a
    @SuppressLint({"WrongConstant"})
    public void a(Dialog dialog0) {
        i0 i00 = this.q;
        if(i00 != null) {
            Context context0 = i00.b;
            if(context0 != null && context0 instanceof Activity) {
                ((Activity)context0).setRequestedOrientation(this.x);
            }
        }
        this.h();
        this.g();
        this.f();
        o0.B = false;
    }

    void a(i0 i00, j0 j00) {
        float f;
        j0 j01 = d.a(j00, j00.e);
        if(j01 != null) {
            ArrayList arrayList0 = j01.L;
            if(arrayList0 != null) {
                k0 k00 = this.b(arrayList0);
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
                this.e = com.fsn.cauly.blackdragoncore.utils.c.a(i00.b, relativeLayout$LayoutParams0);
                ((BDRichVideoContentView)this.d).setNativeAdListener(this);
                this.d.setContentSize(point0);
                this.e.addView(this.d, relativeLayout$LayoutParams0);
                if(!j01.P) {
                    this.d.setVisibility(4);
                }
                this.t = new ProgressBar(i00.b, null, 0x101007A);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = com.fsn.cauly.blackdragoncore.utils.c.c();
                relativeLayout$LayoutParams1.addRule(13);
                this.t.setLayoutParams(relativeLayout$LayoutParams1);
                this.e.addView(this.t);
                Context context0 = i00.b;
                if(context0 instanceof Activity) {
                    this.x = ((Activity)context0).getResources().getConfiguration().orientation;
                    ((Activity)context0).setRequestedOrientation(1);
                    if(((Activity)context0).isFinishing()) {
                        return;
                    }
                }
                ((BDRichVideoContentView)this.d).a(j01);
                ((BDRichVideoContentView)this.d).p();
                g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Show RichVideo popup dialog");
                this.setContentView(this.e);
                this.a(this);
                this.show();
                o0.B = true;
                com.fsn.cauly.blackdragoncore.c.b().c(i00, j01);
                o.a(i00, j01, null, this);
            }
        }
    }

    public void a(i0 i00, j0 j00, int v) {
        this.r = j00;
        this.q = i00;
        if(j00 != null) {
            this.d = c.a(i00, j00, com.fsn.cauly.blackdragoncore.contents.c.b.c);
        }
        c c0 = this.d;
        if(c0 == null) {
            return;
        }
        c0.setListener(this);
        this.v = j00.v;
        if(j00.l == null || !j00.l.equals("richvideo")) {
            this.d(i00, this.d);
        }
        else {
            this.a(i00, j00);
        }
        this.i();
    }

    public void a(i0 i00, String s) {
        h h0 = new h(i00, com.fsn.cauly.blackdragoncore.contents.c.b.d);
        this.d = h0;
        h0.setListener(this);
        this.d(i00, this.d);
        h0.h(s);
    }

    public void a(i0 i00, String s, j0 j00) {
        com.fsn.cauly.blackdragoncore.contents.f f0 = new com.fsn.cauly.blackdragoncore.contents.f(i00, com.fsn.cauly.blackdragoncore.contents.c.b.d, j00);
        this.d = f0;
        f0.setListener(this);
        this.d(i00, this.d);
        f0.a(s, j00.k0, j00.x0);
        this.r = j00;
    }

    public void a(com.fsn.cauly.Y.n0.a n0$a0) {
        this.c = new WeakReference(n0$a0);
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        if(s00.getErrorCode() == 0) {
            ImageButton imageButton0 = this.k;
            if(imageButton0 != null) {
                imageButton0.setImageBitmap(this.f);
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

    private k0 b(ArrayList arrayList0) {
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
    public void b() {
        class com.fsn.cauly.Y.o0.a implements Runnable {
            final o0 a;

            @Override
            public void run() {
                try {
                    if(((Activity)o0.this.q.b).isFinishing()) {
                        o0.this.cancel();
                        return;
                    }
                    if(o0.this.isShowing()) {
                        o0.this.dismiss();
                    }
                }
                catch(Exception exception0) {
                    Logger.writeLog(LogLevel.Debug, "dialog dismiss:" + exception0.getMessage());
                    g.a(com.fsn.cauly.blackdragoncore.utils.g.b.d, exception0.getMessage());
                }
            }
        }

        if(this.r != null && this.r.T) {
            new Handler().postDelayed(new com.fsn.cauly.Y.o0.a(this), 1000L);
        }
    }

    private void c(View view0, Drawable drawable0) {
        view0.setBackground(drawable0);
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void c() {
        ProgressBar progressBar0 = this.t;
        if(progressBar0 != null) {
            progressBar0.setVisibility(4);
        }
        c c0 = this.d;
        if(c0 != null) {
            c0.setVisibility(0);
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.d$k
    public void d() {
        this.w = true;
        this.dismiss();
    }

    void d(i0 i00, c c0) {
        this.q = i00;
        this.a(this);
        Context context0 = i00.b;
        if(context0 instanceof Activity) {
            this.e = com.fsn.cauly.blackdragoncore.utils.c.a(context0, com.fsn.cauly.blackdragoncore.utils.c.b());
        }
        if(c0 instanceof com.fsn.cauly.blackdragoncore.contents.f) {
            Activity activity0 = (Activity)i00.b;
            int v = activity0 == null ? 0 : com.fsn.cauly.blackdragoncore.utils.d.a(activity0.getWindow());
            this.e.addView(c0, new RelativeLayout.LayoutParams(-1, com.fsn.cauly.blackdragoncore.utils.d.a(i00.b) - v - com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 41.5f)));
        }
        else {
            this.e.addView(c0, com.fsn.cauly.blackdragoncore.utils.c.b());
        }
        this.setContentView(this.e);
        if(c0.o()) {
            this.s = new ProgressBar(i00.b, null, 0x101007A);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.c();
            relativeLayout$LayoutParams0.addRule(13);
            this.s.setLayoutParams(relativeLayout$LayoutParams0);
            this.e.addView(this.s);
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
                this.l = new ImageButton(i00.b);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 9.0f), com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 16.0f));
                relativeLayout$LayoutParams1.addRule(13);
                this.l.setLayoutParams(relativeLayout$LayoutParams1);
                relativeLayout0.addView(this.l);
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
                this.m = new ImageButton(i00.b);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 9.0f), com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 16.0f));
                relativeLayout$LayoutParams3.addRule(13);
                this.m.setLayoutParams(relativeLayout$LayoutParams3);
                relativeLayout1.addView(this.m);
                View view2 = new View(i00.b);
                view2.setId(4);
                view2.setOnClickListener(this);
                view2.setLayoutParams(relativeLayout$LayoutParams2);
                relativeLayout1.addView(view2);
                RelativeLayout relativeLayout2 = new RelativeLayout(i00.b);
                LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, -1);
                linearLayout$LayoutParams4.weight = 0.25f;
                this.n = new ImageButton(i00.b);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 16.0f), com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 16.0f));
                relativeLayout$LayoutParams4.addRule(13);
                this.n.setLayoutParams(relativeLayout$LayoutParams4);
                relativeLayout2.addView(this.n);
                View view3 = new View(i00.b);
                view3.setId(5);
                view3.setOnClickListener(this);
                view3.setLayoutParams(relativeLayout$LayoutParams2);
                relativeLayout2.addView(view3);
                RelativeLayout relativeLayout3 = new RelativeLayout(i00.b);
                LinearLayout.LayoutParams linearLayout$LayoutParams5 = new LinearLayout.LayoutParams(-1, -1);
                linearLayout$LayoutParams5.weight = 0.25f;
                this.o = new ImageButton(i00.b);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 13.5f), com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 13.5f));
                relativeLayout$LayoutParams5.addRule(13);
                this.o.setLayoutParams(relativeLayout$LayoutParams5);
                relativeLayout3.addView(this.o);
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
                this.e.addView(linearLayout0, relativeLayout$LayoutParams6);
            }
            else {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams7 = com.fsn.cauly.blackdragoncore.utils.c.c();
                relativeLayout$LayoutParams7.addRule(11);
                relativeLayout$LayoutParams7.addRule(10);
                int v1 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 7.0f);
                relativeLayout$LayoutParams7.setMargins(0, com.fsn.cauly.blackdragoncore.utils.d.a(i00.b, 7.0f), v1, 0);
                ImageButton imageButton0 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), this.f, relativeLayout$LayoutParams7);
                this.k = imageButton0;
                imageButton0.setPadding(0, 0, 0, 0);
                this.k.setVisibility(4);
                this.e.addView(this.k);
                this.k.setId(1);
                this.k.setOnClickListener(this);
            }
            b o0$b0 = new b(this);
            this.p = o0$b0;
            o0$b0.a(i00.p);
            this.p.a(this);
            this.p.execute();
        }
        Context context1 = i00.b;
        if(context1 instanceof Activity) {
            this.x = ((Activity)context1).getResources().getConfiguration().orientation;
            if(this.r != null && (this.r.l != null && this.r.A != null && !this.r.l.equalsIgnoreCase("video"))) {
                if(this.r.A.equalsIgnoreCase("portrait_fix") || c0.m()) {
                    ((Activity)context1).setRequestedOrientation(1);
                }
                else if(this.r.A.equalsIgnoreCase("landscape_fix")) {
                    ((Activity)context1).setRequestedOrientation(0);
                }
                else if(!this.r.A.equalsIgnoreCase("allow_orientation_change")) {
                    com.fsn.cauly.blackdragoncore.utils.d.d(i00.b);
                }
            }
        }
        if(!(i00.b instanceof Activity) || ((Activity)i00.b).isFinishing()) {
            String s = this.r.e;
            if(s != null && s.startsWith("http")) {
                com.fsn.cauly.blackdragoncore.contents.f.a(i00.b, this.r, this.r.e, "", i00.j);
            }
        }
        else {
            this.show();
            o0.B = true;
            if("coververtical".equals(this.v)) {
                com.fsn.cauly.blackdragoncore.utils.b.a(this.e, com.fsn.cauly.blackdragoncore.utils.d.a(i00.b));
            }
            j0 j00 = this.r;
            if(j00 != null) {
                c0.a(j00);
            }
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void e() {
        this.w = true;
        this.dismiss();
    }

    public void f() {
        b o0$b0 = this.p;
        if(o0$b0 != null) {
            o0$b0.cancel();
            this.p = null;
        }
        if(this.e != null) {
            c c0 = this.d;
            if(c0 != null) {
                c0.r();
                com.fsn.cauly.blackdragoncore.utils.c.a(this.d);
                this.e.removeView(this.d);
                this.d = null;
            }
            this.e = null;
        }
        o0.B = false;
    }

    void g() {
        if(this.r != null) {
            this.q.a(104, null, null);
        }
    }

    void h() {
        WeakReference weakReference0 = this.c;
        if(weakReference0 == null) {
            return;
        }
        com.fsn.cauly.Y.n0.a n0$a0 = (com.fsn.cauly.Y.n0.a)weakReference0.get();
        if(n0$a0 == null) {
            return;
        }
        n0$a0.a(this, this.w);
    }

    void i() {
        if(this.r != null) {
            this.q.a(103, null, null);
        }
    }

    public static boolean j() [...] // 潜在的解密器

    private void k() {
        if(this.d != null && this.d instanceof com.fsn.cauly.blackdragoncore.contents.f && ((com.fsn.cauly.blackdragoncore.contents.f)this.d).getWebView() != null) {
            Context context0 = this.q.b;
            if(context0 != null) {
                Resources resources0 = context0.getResources();
                if(resources0 == null) {
                    return;
                }
                View view0 = this.m;
                if(view0 != null && this.h != null) {
                    this.c(view0, new BitmapDrawable(resources0, this.h));
                }
                View view1 = this.l;
                if(view1 != null && this.g != null) {
                    this.c(view1, new BitmapDrawable(resources0, this.g));
                }
                View view2 = this.o;
                if(view2 != null && this.j != null) {
                    this.c(view2, new BitmapDrawable(resources0, this.j));
                }
                View view3 = this.n;
                if(view3 != null && this.i != null) {
                    this.c(view3, new BitmapDrawable(resources0, this.i));
                }
            }
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        switch(view0.getId()) {
            case 1: {
                this.w = true;
                this.dismiss();
                return;
            }
            case 3: {
                c c0 = this.d;
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
                c c1 = this.d;
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
                c c2 = this.d;
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

    @Override  // android.app.Dialog
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        return v != 4 || (this.d == null || !this.d.j()) ? super.onKeyDown(v, keyEvent0) : false;
    }
}

