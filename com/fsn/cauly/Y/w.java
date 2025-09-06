package com.fsn.cauly.Y;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.fsn.cauly.blackdragoncore.c;
import com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView;
import com.fsn.cauly.blackdragoncore.contents.d.k;
import com.fsn.cauly.blackdragoncore.utils.d;
import com.fsn.cauly.blackdragoncore.utils.f;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.fsn.cauly.blackdragoncore.utils.h;
import com.fsn.cauly.blackdragoncore.utils.i;
import com.fsn.cauly.blackdragoncore.utils.m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

public class w extends q implements DialogInterface.OnCancelListener, View.OnClickListener, a, com.fsn.cauly.Y.s0.a, k {
    class e extends v0 {
        final w s;

        @Override  // com.fsn.cauly.Y.v0
        public void c() {
            try {
                w w0 = w.this;
                if(w0.p) {
                    w0.f = m.a(w0.a.b, "mini_btn_x.png");
                }
                else {
                    w0.f = m.a(w0.a.b, "pop_btn_x.png");
                    w w1 = w.this;
                    Bitmap bitmap0 = w1.f;
                    if(bitmap0 != null) {
                        w1.f = f.a(bitmap0, f.a(w1.a.b, bitmap0.getWidth()), f.a(w.this.a.b, w.this.f.getHeight()), true);
                    }
                }
                if(w.this.f == null) {
                    this.c = -100;
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
    }

    b0 e;
    Bitmap f;
    e g;
    ImageButton h;
    ProgressBar i;
    int j;
    boolean k;
    final int l;
    final int m;
    final int n;
    double o;
    boolean p;

    public w(i0 i00) {
        super(i00);
        this.l = 720;
        this.m = 1230;
        this.n = 0x500;
        this.o = 1.0;
        this.p = false;
        g.a(b.e, "Created popup container");
    }

    @Override  // com.fsn.cauly.Y.q
    public void a() {
        if(this.a.v) {
            this.b(this.b);
            g.a(b.e, "AdItem Blocked");
            return;
        }
        super.a();
    }

    @Override  // com.fsn.cauly.Y.q
    public void a(int v, String s) {
        ProgressBar progressBar0 = this.i;
        if(progressBar0 != null) {
            progressBar0.setVisibility(4);
        }
        ImageButton imageButton0 = this.h;
        if(imageButton0 != null) {
            imageButton0.setVisibility(0);
        }
        super.a(v, s);
    }

    @Override  // com.fsn.cauly.Y.b0$a
    public void a(Dialog dialog0) {
        c.b().i(this.a);
        ((Activity)this.a.b).setRequestedOrientation(this.j);
        g.a(b.e, "Popup dialog dismissed");
        j0 j00 = this.k();
        if(j00 != null) {
            if(this.k) {
                l.a(this.a, j00, "x", null);
            }
            else {
                l.a(this.a, j00, "back", null);
            }
        }
        com.fsn.cauly.Y.q.a q$a0 = this.d;
        if(q$a0 == null) {
            return;
        }
        q$a0.a(j00);
        com.fsn.cauly.blackdragoncore.contents.c c0 = this.b;
        if(c0 == null && this.c == null) {
            return;
        }
        if(c0 != null) {
            c0.r();
            return;
        }
        this.c.r();
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        ImageButton imageButton0 = this.h;
        if(imageButton0 != null) {
            Bitmap bitmap0 = this.f;
            if(bitmap0 != null) {
                imageButton0.setImageBitmap(bitmap0);
            }
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(com.fsn.cauly.blackdragoncore.contents.c c0, j0 j00) {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(com.fsn.cauly.blackdragoncore.contents.c c0, com.fsn.cauly.blackdragoncore.contents.c c1) {
    }

    public void a(Object object0) {
        int v6;
        int v5;
        int v3;
        int v2;
        if(object0 != null) {
            this.a.C.put("viewgroup_id", object0);
        }
        if(!c.b().b(this.a, this.b.getAdItem()) && !"banner".equals(this.b.getAdItem().f)) {
            if(this.b != null && this.b.getAdItem() != null) {
                this.b.getAdItem().O = System.currentTimeMillis();
                if(this.b.getAdItem().l0 && m0.a(this.a.b)) {
                    c.b().i(this.a);
                    c.b().a("interstitial", this.a, this.b.getAdItem(), this.b, this);
                    Intent intent0 = new Intent();
                    intent0.setClassName(this.a.b, "com.fsn.cauly.blackdragoncore.LandingActivity");
                    this.a.b.startActivity(intent0);
                    return;
                }
                if(this.a.C.containsKey("viewgroup_id")) {
                    this.m();
                    return;
                }
                if("variable".equalsIgnoreCase(this.b.getAdItem().p0)) {
                    this.p = false;
                    int v = this.b.getAdItem().B;
                    int v1 = this.b.getAdItem().C;
                    if(v > 0 && v1 > 0) {
                        if(v1 <= 1170 && v <= 660) {
                            v2 = v;
                            v3 = v1;
                        }
                        else if(((float)v) / 660.0f > ((float)v1) / 1170.0f) {
                            v2 = v / (((int)(((float)v) / 660.0f)) + 1);
                            v3 = v1 / (((int)(((float)v) / 660.0f)) + 1);
                        }
                        else {
                            v2 = v / (((int)(((float)v1) / 1170.0f)) + 1);
                            v3 = v1 / (((int)(((float)v1) / 1170.0f)) + 1);
                        }
                        for(int v4 = 10; true; v4 += 10) {
                            v5 = v;
                            v6 = v1;
                            if(v4 >= 660 - v2) {
                                break;
                            }
                            v = v2 + v4;
                            v1 = (int)(((float)(v * v3)) / ((float)v2));
                            if(1170 < v1) {
                                break;
                            }
                        }
                        this.j(v5, v6, 70, 70, 5);
                        return;
                    }
                    this.l();
                    return;
                }
                if("popup_mini".equals(this.b.getAdItem().f)) {
                    this.p = true;
                    this.n();
                    return;
                }
                if("popup_richvideo".equals(this.b.getAdItem().f)) {
                    this.p = false;
                    this.o();
                    return;
                }
                this.p = false;
                this.l();
                return;
            }
            com.fsn.cauly.Y.q.a q$a0 = this.d;
            if(q$a0 == null) {
                return;
            }
            q$a0.a(this.b.getAdItem());
            return;
        }
        com.fsn.cauly.Y.q.a q$a1 = this.d;
        if(q$a1 == null) {
            return;
        }
        q$a1.a(this.b.getAdItem());
    }

    @Override  // com.fsn.cauly.Y.q
    protected void b(com.fsn.cauly.blackdragoncore.contents.c c0, MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0 && this.k() != null) {
            this.k().h0 = true;
        }
        String s = "";
        if(motionEvent0.getAction() == 0 && "popup_mini".equals(c0.getAdItem().f) && "img".equals(c0.getAdItem().g)) {
            if(!TextUtils.isEmpty(c0.getAdItem().e)) {
                if(!c0.getAdItem().h.contains("&cauly_use_browser=n")) {
                    com.fsn.cauly.blackdragoncore.contents.f.a(this.a.b, c0.getAdItem(), c0.getAdItem().e, "", this.a.j);
                }
                try {
                    s = URLEncoder.encode(c0.getAdItem().e, "UTF-8");
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    unsupportedEncodingException0.printStackTrace();
                }
                l.a(this.a, c0.getAdItem(), null, "click_action_param1=" + s);
                this.b();
            }
        }
        else if(motionEvent0.getAction() == 0 && "fullsite".equals(c0.getAdItem().l)) {
            this.e.dismiss();
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void c() {
        ProgressBar progressBar0 = this.i;
        if(progressBar0 != null) {
            progressBar0.setVisibility(4);
        }
        com.fsn.cauly.blackdragoncore.contents.c c0 = this.b;
        if(c0 != null) {
            c0.setVisibility(0);
        }
        ImageButton imageButton0 = this.h;
        if(imageButton0 != null) {
            imageButton0.setVisibility(0);
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected void c(com.fsn.cauly.blackdragoncore.contents.c c0) {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.d$k
    public void d() {
        this.k = true;
        b0 b00 = this.e;
        if(b00 != null) {
            b00.dismiss();
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void e() {
        b0 b00 = this.e;
        if(b00 != null) {
            this.k = true;
            b00.dismiss();
            this.e = null;
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected void e(com.fsn.cauly.blackdragoncore.contents.c c0) {
        b0 b00 = this.e;
        if(b00 == null) {
            return;
        }
        b00.dismiss();
        this.e = null;
        e w$e0 = this.g;
        if(w$e0 != null) {
            w$e0.cancel();
            this.g = null;
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected Point f() {
        return d.b(this.a.b);
    }

    @Override  // com.fsn.cauly.Y.q
    public void g() {
        g.a(b.e, "Stopped popup container");
        b0 b00 = this.e;
        if(b00 != null) {
            b00.a(null);
            this.e.dismiss();
            this.e = null;
        }
        e w$e0 = this.g;
        if(w$e0 != null) {
            w$e0.cancel();
            this.g = null;
        }
        this.f = null;
        this.h = null;
        super.g();
    }

    private int h(int v) {
        return (int)(((double)v) * this.o);
    }

    private k0 i(ArrayList arrayList0) {
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

    void j(int v, int v1, int v2, int v3, int v4) {
        class com.fsn.cauly.Y.w.a implements DialogInterface.OnKeyListener {
            final w a;

            @Override  // android.content.DialogInterface$OnKeyListener
            public boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
                if(keyEvent0.getAction() == 0 && v == 4) {
                    try {
                        i0 i00 = w.this.a;
                        if(i00 != null && (i00.C != null && i00.C.containsKey("closeOnBackKey") && !((Boolean)w.this.a.C.get("closeOnBackKey")).booleanValue())) {
                            return true;
                        }
                        com.fsn.cauly.blackdragoncore.contents.c c0 = w.this.b;
                        if(c0 != null && !TextUtils.isEmpty(c0.getAdItem().h) && h.a(w.this.b.getAdItem().h).contains("cauly_b_button=n")) {
                            return true;
                        }
                        com.fsn.cauly.blackdragoncore.contents.c c1 = w.this.b;
                        return c1 == null ? false : c1.j();
                    }
                    catch(Exception exception0) {
                    }
                    exception0.printStackTrace();
                }
                return false;
            }
        }

        e w$e0 = new e(this);
        this.g = w$e0;
        w$e0.a(this.a.p);
        this.g.a(this);
        this.g.execute();
        this.o = d.a(this.a.b) > d.c(this.a.b) ? ((double)d.a(this.a.b)) / 1280.0 : ((double)d.c(this.a.b)) / 1280.0;
        com.fsn.cauly.blackdragoncore.contents.c c0 = this.b;
        c0.p();
        j0 j00 = this.b.getAdItem();
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.b();
        RelativeLayout relativeLayout0 = com.fsn.cauly.blackdragoncore.utils.c.a(this.a.b, relativeLayout$LayoutParams0);
        relativeLayout0.setBackgroundColor(Color.argb(140, 0, 0, 0));
        RelativeLayout relativeLayout1 = new RelativeLayout(this.a.b);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(this.h(v), this.h(v1));
        RelativeLayout relativeLayout2 = new RelativeLayout(this.a.b);
        relativeLayout2.addView(c0, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout2.setBackgroundColor(0xFF000000);
        relativeLayout2.setPadding(this.h(2), this.h(2), this.h(2), this.h(2));
        i.b(relativeLayout2, this.a, this.k());
        c0.setListener(this);
        relativeLayout1.addView(relativeLayout2, relativeLayout$LayoutParams1);
        if(!c0.k() && !j00.o0) {
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(this.h(v2), this.h(v3));
            int v5 = v - v2 - v4;
            relativeLayout$LayoutParams2.leftMargin = this.h(v5) + relativeLayout$LayoutParams2.width > d.c(this.a.b) ? d.c(this.a.b) - this.h(v2 - v4) : this.h(v5);
            relativeLayout$LayoutParams2.topMargin = this.h(v4);
            ImageButton imageButton0 = new ImageButton(this.a.b);
            this.h = imageButton0;
            imageButton0.setScaleType(ImageView.ScaleType.FIT_XY);
            this.h.setBackgroundColor(0);
            this.h.setId(1);
            this.h.setOnClickListener(this);
            if(this.b.getAdItem().f.equalsIgnoreCase("popup_mini")) {
                this.h.setPadding(this.h(20), this.h(20), this.h(20), this.h(20));
            }
            else {
                this.h.setPadding(0, 0, 0, 0);
            }
            relativeLayout1.addView(this.h, relativeLayout$LayoutParams2);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = com.fsn.cauly.blackdragoncore.utils.c.c();
        relativeLayout$LayoutParams3.addRule(13);
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
        g.a(b.e, "Show popup dialog");
        Activity activity0 = (Activity)this.a.a();
        if(activity0 != null) {
            this.j = activity0.getRequestedOrientation();
            if(!j00.f.equalsIgnoreCase("popup_customplayer")) {
                if(j00.A.equalsIgnoreCase("portrait_fix") || c0.m()) {
                    activity0.setRequestedOrientation(1);
                }
                else if(j00.A.equalsIgnoreCase("landscape_fix")) {
                    activity0.setRequestedOrientation(0);
                }
                else if(!j00.A.equalsIgnoreCase("allow_orientation_change")) {
                    d.d(this.a.b);
                }
            }
        }
        this.e = ((Boolean)this.a.C.get("statusbar_hide")).booleanValue() ? new b0(activity0, 0x1030011) : new b0(activity0, 0x1030010);
        this.e.setContentView(relativeLayout0);
        this.e.a(this);
        this.e.setOnKeyListener(new com.fsn.cauly.Y.w.a(this));
        if(activity0 != null && !activity0.isFinishing()) {
            this.e.show();
            c.b().c(this.a, j00);
            if(!c0.l()) {
                this.c();
            }
            o.a(this.a, j00, null, this.e);
        }
    }

    private j0 k() {
        return this.b == null ? this.c.getAdItem() : this.b.getAdItem();
    }

    void l() {
        class com.fsn.cauly.Y.w.b implements DialogInterface.OnKeyListener {
            final w a;

            @Override  // android.content.DialogInterface$OnKeyListener
            public boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
                if(keyEvent0.getAction() == 0 && v == 4) {
                    try {
                        i0 i00 = w.this.a;
                        if(i00 != null && (i00.C != null && i00.C.containsKey("closeOnBackKey") && !((Boolean)w.this.a.C.get("closeOnBackKey")).booleanValue())) {
                            return true;
                        }
                        com.fsn.cauly.blackdragoncore.contents.c c0 = w.this.b;
                        if(c0 != null && !TextUtils.isEmpty(c0.getAdItem().h) && h.a(w.this.b.getAdItem().h).contains("cauly_b_button=n")) {
                            return true;
                        }
                        com.fsn.cauly.blackdragoncore.contents.c c1 = w.this.b;
                        return c1 == null ? false : c1.j();
                    }
                    catch(Exception exception0) {
                    }
                    exception0.printStackTrace();
                }
                return false;
            }
        }

        com.fsn.cauly.blackdragoncore.contents.c c0 = this.b;
        c0.p();
        j0 j00 = this.b.getAdItem();
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.b();
        RelativeLayout relativeLayout0 = com.fsn.cauly.blackdragoncore.utils.c.a(this.a.b, relativeLayout$LayoutParams0);
        c0.setLayoutParams(relativeLayout$LayoutParams0);
        c0.setListener(this);
        relativeLayout0.addView(c0);
        i.b(relativeLayout0, this.a, this.k());
        if("coververtical".equals(j00.v)) {
            com.fsn.cauly.blackdragoncore.utils.b.a(relativeLayout0, d.a(this.a.b));
        }
        if(!c0.k() && !j00.o0) {
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = com.fsn.cauly.blackdragoncore.utils.c.c();
            relativeLayout$LayoutParams1.addRule(11);
            relativeLayout$LayoutParams1.addRule(10);
            int v = d.a(this.a.b, 7.0f);
            relativeLayout$LayoutParams1.setMargins(0, d.a(this.a.b, 7.0f), v, 0);
            if(!j00.H) {
                ImageButton imageButton0 = com.fsn.cauly.blackdragoncore.utils.c.a(this.a.b, null, relativeLayout$LayoutParams1);
                this.h = imageButton0;
                relativeLayout0.addView(imageButton0);
                this.h.setId(1);
                this.h.setVisibility(4);
                this.h.setOnClickListener(this);
                this.h.setPadding(0, 0, 0, 0);
            }
            e w$e0 = new e(this);
            this.g = w$e0;
            w$e0.a(this.a.p);
            this.g.a(this);
            this.g.execute();
        }
        this.i = new ProgressBar(this.a.b, null, 0x101007A);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = com.fsn.cauly.blackdragoncore.utils.c.c();
        relativeLayout$LayoutParams2.addRule(13);
        this.i.setLayoutParams(relativeLayout$LayoutParams2);
        relativeLayout0.addView(this.i);
        g.a(b.e, "Show popup dialog");
        Activity activity0 = (Activity)this.a.a();
        if(activity0 != null) {
            this.j = activity0.getRequestedOrientation();
            if(!j00.f.equalsIgnoreCase("popup_customplayer")) {
                if(j00.A.equalsIgnoreCase("portrait_fix") || c0.m()) {
                    activity0.setRequestedOrientation(1);
                }
                else if(j00.A.equalsIgnoreCase("landscape_fix")) {
                    activity0.setRequestedOrientation(0);
                }
                else if(!j00.A.equalsIgnoreCase("allow_orientation_change")) {
                    d.d(this.a.b);
                }
            }
        }
        this.e = ((Boolean)this.a.C.get("statusbar_hide")).booleanValue() ? new b0(activity0, 0x1030011) : new b0(activity0, 0x1030010);
        this.e.setContentView(relativeLayout0);
        this.e.a(this);
        this.e.setOnKeyListener(new com.fsn.cauly.Y.w.b(this));
        if(activity0 != null && !activity0.isFinishing()) {
            this.e.show();
            c.b().c(this.a, j00);
            if(!c0.l()) {
                this.c();
            }
            o.a(this.a, j00, null, this.e);
        }
    }

    private void m() {
        class com.fsn.cauly.Y.w.c implements View.OnAttachStateChangeListener {
            final j0 a;
            final w b;

            com.fsn.cauly.Y.w.c(j0 j00) {
                this.a = j00;
                super();
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                if(view0 != null) {
                    o.a(w.this.a, this.a, null, null, true);
                }
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
            }
        }

        com.fsn.cauly.blackdragoncore.contents.c c0 = this.b;
        c0.p();
        j0 j00 = this.b.getAdItem();
        if(this.a.C.get("viewgroup_id") instanceof ViewGroup) {
            ViewGroup viewGroup0 = (ViewGroup)this.a.C.get("viewgroup_id");
            c0.setLayoutParams(com.fsn.cauly.blackdragoncore.utils.c.b());
            c0.setListener(this);
            viewGroup0.addView(c0);
            i.b(((RelativeLayout)viewGroup0), this.a, this.k());
            viewGroup0.addOnAttachStateChangeListener(new com.fsn.cauly.Y.w.c(this, j00));
        }
    }

    void n() {
        this.j(550, 940, 90, 90, 0);
    }

    private void o() {
        class com.fsn.cauly.Y.w.d implements DialogInterface.OnKeyListener {
            final w a;

            @Override  // android.content.DialogInterface$OnKeyListener
            public boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
                if(keyEvent0.getAction() == 0 && v == 4) {
                    try {
                        i0 i00 = w.this.a;
                        if(i00 != null && (i00.C != null && i00.C.containsKey("closeOnBackKey") && !((Boolean)w.this.a.C.get("closeOnBackKey")).booleanValue())) {
                            return true;
                        }
                        com.fsn.cauly.blackdragoncore.contents.c c0 = w.this.b;
                        if(c0 != null && !TextUtils.isEmpty(c0.getAdItem().h) && h.a(w.this.b.getAdItem().h).contains("cauly_b_button=n")) {
                            return true;
                        }
                        com.fsn.cauly.blackdragoncore.contents.c c1 = w.this.b;
                        return c1 == null ? false : c1.j();
                    }
                    catch(Exception exception0) {
                    }
                    exception0.printStackTrace();
                }
                return false;
            }
        }

        float f;
        com.fsn.cauly.blackdragoncore.contents.c c0 = this.b;
        if(c0 != null) {
            j0 j00 = c0.getAdItem();
            if(j00 != null && j00.L == null) {
                j00 = com.fsn.cauly.Y.d.a(j00, j00.h);
            }
            if(j00 != null) {
                ArrayList arrayList0 = j00.L;
                if(arrayList0 != null) {
                    k0 k00 = this.i(arrayList0);
                    if(k00 == null) {
                        return;
                    }
                    if(d.a(this.a.b) <= d.c(this.a.b)) {
                        f = ((float)d.c(this.a.b)) / 1280.0f;
                    }
                    else if(1.777778f >= ((float)d.a(this.a.b)) / ((float)d.c(this.a.b))) {
                        f = ((float)d.a(this.a.b)) / 1280.0f;
                    }
                    else {
                        f = ((float)d.c(this.a.b)) / 720.0f;
                    }
                    Point point0 = new Point(((int)(((double)k00.g) * ((double)f))), ((int)(((double)k00.h) * ((double)f))));
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.b();
                    RelativeLayout relativeLayout0 = com.fsn.cauly.blackdragoncore.utils.c.a(this.a.b, relativeLayout$LayoutParams0);
                    ((BDRichVideoContentView)this.b).setNativeAdListener(this);
                    this.b.setContentSize(point0);
                    relativeLayout0.addView(this.b, relativeLayout$LayoutParams0);
                    Activity activity0 = (Activity)this.a.b;
                    this.j = activity0.getRequestedOrientation();
                    d.d(this.a.b);
                    if(activity0.isFinishing()) {
                        return;
                    }
                    ((BDRichVideoContentView)this.b).p();
                    if(!j00.P) {
                        this.b.setVisibility(4);
                    }
                    this.i = new ProgressBar(this.a.b, null, 0x101007A);
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = com.fsn.cauly.blackdragoncore.utils.c.c();
                    relativeLayout$LayoutParams1.addRule(13);
                    this.i.setLayoutParams(relativeLayout$LayoutParams1);
                    relativeLayout0.addView(this.i);
                    g.a(b.e, "Show popup dialog");
                    i.b(relativeLayout0, this.a, this.k());
                    this.j = activity0.getRequestedOrientation();
                    if(!j00.f.equalsIgnoreCase("popup_customplayer")) {
                        if(j00.A.equalsIgnoreCase("portrait_fix") || c0.m()) {
                            activity0.setRequestedOrientation(1);
                        }
                        else if(j00.A.equalsIgnoreCase("landscape_fix")) {
                            activity0.setRequestedOrientation(0);
                        }
                        else if(!j00.A.equalsIgnoreCase("allow_orientation_change")) {
                            d.d(this.a.b);
                        }
                    }
                    this.e = ((Boolean)this.a.C.get("statusbar_hide")).booleanValue() ? new b0(activity0, 0x1030011) : new b0(activity0, 0x1030010);
                    this.e.setContentView(relativeLayout0);
                    this.e.a(this);
                    this.e.setOnKeyListener(new com.fsn.cauly.Y.w.d(this));
                    this.e.show();
                    c.b().c(this.a, j00);
                    o.a(this.a, j00, null, this.e);
                    for(Object object0: arrayList0) {
                        if(!TextUtils.isEmpty(((k0)object0).a) && ((k0)object0).a.equals("video")) {
                            this.c();
                            return;
                        }
                        if(false) {
                            break;
                        }
                    }
                    this.c();
                }
            }
        }
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public void onCancel(DialogInterface dialogInterface0) {
        dialogInterface0.dismiss();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.k = true;
        b0 b00 = this.e;
        if(b00 != null) {
            b00.dismiss();
            this.e = null;
        }
    }
}

