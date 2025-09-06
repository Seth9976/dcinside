package com.fsn.cauly.Y;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fsn.cauly.blackdragoncore.contents.c;
import com.fsn.cauly.blackdragoncore.contents.f;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.fsn.cauly.blackdragoncore.utils.h;
import com.fsn.cauly.blackdragoncore.utils.i;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

public class s extends q implements DialogInterface.OnCancelListener, View.OnClickListener, a, com.fsn.cauly.Y.s0.a {
    class d extends v0 {
        final s s;

        @Override  // com.fsn.cauly.Y.v0
        public void c() {
            try {
                s.this.f = s.this.a(s.this.a.b, "btn_left_normal");
                s.this.g = s.this.a(s.this.a.b, "btn_left_pressed");
                s.this.h = s.this.a(s.this.a.b, "btn_right_normal");
                s.this.i = s.this.a(s.this.a.b, "btn_right_pressed");
                s.this.j = s.this.a(s.this.a.b, "btn_left_normal_b");
                s.this.k = s.this.a(s.this.a.b, "btn_left_pressed_b");
                s.this.l = s.this.a(s.this.a.b, "btn_right_normal_b");
                s.this.m = s.this.a(s.this.a.b, "btn_right_pressed_b");
                if(s.this.f == null) {
                    this.c = -100;
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
    }

    boolean A;
    int B;
    int C;
    boolean D;
    static int E = 1;
    static int F = 2;
    b0 e;
    Drawable f;
    Drawable g;
    Drawable h;
    Drawable i;
    Drawable j;
    Drawable k;
    Drawable l;
    Drawable m;
    d n;
    Button o;
    Button p;
    int q;
    j0 r;
    RelativeLayout s;
    double t;
    ProgressBar u;
    LinearLayout v;
    TextView w;
    LinearLayout x;
    LinearLayout y;
    boolean z;

    static {
    }

    public s(i0 i00) {
        super(i00);
        this.t = 1.0;
        this.z = false;
        this.A = false;
        this.B = Color.rgb(0xEA, 0xEA, 0xEA);
        this.C = Color.rgb(41, 41, 41);
        this.D = false;
        g.a(b.e, "Created CloseAd container ");
        HashMap hashMap0 = i00.C;
        this.t = com.fsn.cauly.blackdragoncore.utils.d.a(i00.b) > com.fsn.cauly.blackdragoncore.utils.d.c(i00.b) ? ((double)com.fsn.cauly.blackdragoncore.utils.d.a(i00.b)) / 1280.0 : ((double)com.fsn.cauly.blackdragoncore.utils.d.c(i00.b)) / 1280.0;
        if(hashMap0.containsKey("layout_id")) {
            this.A = true;
            this.n();
            return;
        }
        d s$d0 = new d(this);
        this.n = s$d0;
        s$d0.a(this);
        this.n.execute();
    }

    protected Drawable a(Context context0, String s) {
        try {
            return context0.getResources().getDrawable(context0.getResources().getIdentifier(s, "drawable", "com.dcinside.app.android"));
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return null;
        }
    }

    @Override  // com.fsn.cauly.Y.q
    public void a() {
        if(this.s != null && this.r != null && this.s.getVisibility() == 0) {
            o.a(this.a, this.r, null, this.e);
            this.r.O = System.currentTimeMillis();
        }
        ProgressBar progressBar0 = this.u;
        if(progressBar0 != null) {
            this.s.removeView(progressBar0);
        }
        this.D = true;
        super.a();
    }

    @Override  // com.fsn.cauly.Y.q
    public void a(int v, String s) {
        ProgressBar progressBar0 = this.u;
        if(progressBar0 != null) {
            this.s.removeView(progressBar0);
        }
        super.a(v, s);
    }

    @Override  // com.fsn.cauly.Y.b0$a
    public void a(Dialog dialog0) {
        g.a(b.e, "Popup dialog dismissed  ");
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.setCallback(null);
        }
        Drawable drawable1 = this.g;
        if(drawable1 != null) {
            drawable1.setCallback(null);
        }
        Drawable drawable2 = this.h;
        if(drawable2 != null) {
            drawable2.setCallback(null);
        }
        Drawable drawable3 = this.i;
        if(drawable3 != null) {
            drawable3.setCallback(null);
        }
        com.fsn.cauly.Y.q.a q$a0 = this.d;
        if(q$a0 == null) {
            return;
        }
        q$a0.a(this.r);
        ((Activity)this.a.b).setRequestedOrientation(this.q);
        if(this.b == null && this.c == null) {
            return;
        }
        c c0 = this.b;
        if(c0 != null) {
            c0.r();
            return;
        }
        this.c.r();
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        this.m();
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(c c0, j0 j00) {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(c c0, c c1) {
    }

    public void b(j0 j00) {
        this.r = j00;
        if(this.A) {
            if(j00 != null && (this.e != null && this.e.isShowing())) {
                this.l();
                return;
            }
            if(this.e != null && this.e.isShowing()) {
                RelativeLayout relativeLayout0 = this.s;
                if(relativeLayout0 != null) {
                    ProgressBar progressBar0 = this.u;
                    if(progressBar0 != null) {
                        relativeLayout0.removeView(progressBar0);
                        this.u = null;
                    }
                }
            }
        }
        else {
            if(j00 != null && (this.e != null && this.e.isShowing())) {
                this.k();
                return;
            }
            if(this.e != null && this.e.isShowing()) {
                RelativeLayout relativeLayout1 = this.s;
                if(relativeLayout1 != null) {
                    ProgressBar progressBar1 = this.u;
                    if(progressBar1 != null) {
                        relativeLayout1.removeView(progressBar1);
                        this.u = null;
                    }
                }
            }
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected void b(c c0, MotionEvent motionEvent0) {
        if(this.D && motionEvent0.getAction() == 0 && "popup_mini".equals(c0.getAdItem().f) && "img".equals(c0.getAdItem().g) && !TextUtils.isEmpty(c0.getAdItem().e)) {
            String s = "";
            f.a(this.a.b, c0.getAdItem(), c0.getAdItem().e, "", this.a.j);
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

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void c() {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void c(c c0) {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void e() {
        b0 b00 = this.e;
        if(b00 != null) {
            b00.dismiss();
            this.e = null;
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected void e(c c0) {
    }

    @Override  // com.fsn.cauly.Y.q
    protected Point f() {
        return com.fsn.cauly.blackdragoncore.utils.d.b(this.a.b);
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
        d s$d0 = this.n;
        if(s$d0 != null) {
            s$d0.cancel();
            this.n = null;
        }
        super.g();
    }

    private int h(int v) {
        return (int)(((double)v) * this.t);
    }

    private void h() {
        if(this.w != null && this.v != null) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(this.h(550), this.h(94));
            linearLayout$LayoutParams0.topMargin = this.h(10);
            this.w.setLayoutParams(linearLayout$LayoutParams0);
            this.w.setBackgroundColor(0);
            this.w.setTextColor(Color.rgb(0xFF, 0xFF, 0xFF));
            this.v.setLayoutParams(new LinearLayout.LayoutParams(this.h(550), this.h(230)));
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = (LinearLayout.LayoutParams)this.o.getLayoutParams();
            linearLayout$LayoutParams1.height = this.h(104);
            this.o.setLayoutParams(linearLayout$LayoutParams1);
            LinearLayout.LayoutParams linearLayout$LayoutParams2 = (LinearLayout.LayoutParams)this.p.getLayoutParams();
            linearLayout$LayoutParams2.height = this.h(104);
            this.p.setLayoutParams(linearLayout$LayoutParams2);
            this.x.setVisibility(8);
            this.y.setVisibility(8);
            this.i(this.o, this.j, this.k, Color.rgb(0xFF, 0xFF, 0xFF), Color.rgb(0xBB, 0xBB, 0xBB));
            this.i(this.p, this.l, this.m, Color.rgb(0xFF, 0xFF, 0xFF), Color.rgb(0xBB, 0xBB, 0xBB));
        }
        this.s.setVisibility(8);
    }

    private void i(Button button0, Drawable drawable0, Drawable drawable1, int v, int v1) {
        class com.fsn.cauly.Y.s.c implements View.OnTouchListener {
            final Button a;
            final Drawable b;
            final int c;
            final Drawable d;
            final int e;
            final s f;

            com.fsn.cauly.Y.s.c(Button button0, Drawable drawable0, int v, Drawable drawable1, int v1) {
                this.a = button0;
                this.b = drawable0;
                this.c = v;
                this.d = drawable1;
                this.e = v1;
                super();
            }

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                if(motionEvent0.getAction() == 0) {
                    this.a.setBackgroundDrawable(this.b);
                    this.a.setTextColor(this.c);
                }
                switch(motionEvent0.getAction()) {
                    case 1: 
                    case 3: {
                        this.a.setBackgroundDrawable(this.d);
                        this.a.setTextColor(this.e);
                        return false;
                    }
                    default: {
                        return false;
                    }
                }
            }
        }

        if(button0 != null) {
            button0.setBackgroundDrawable(drawable0);
            button0.setTextColor(v);
            button0.setOnTouchListener(new com.fsn.cauly.Y.s.c(this, button0, drawable1, v1, drawable0, v));
        }
    }

    private void j() {
        this.s.setVisibility(8);
    }

    private void k() {
        j0 j00 = this.r;
        if(j00 != null) {
            if(!TextUtils.isEmpty(j00.a) && "0".equals(this.r.a)) {
                this.h();
            }
            else if(TextUtils.isEmpty(this.r.f) || !this.r.f.equals("text") && !this.r.f.equals("banner")) {
                this.s.setVisibility(0);
            }
            else {
                this.h();
            }
            super.a(this.r);
        }
        if(this.c != null && this.s.getVisibility() == 0) {
            this.s.addView(this.c, new RelativeLayout.LayoutParams(-1, -1));
            i.b(this.s, this.a, this.r);
            this.s.setBackgroundColor(0xFF000000);
            this.s.setPadding(this.h(2), this.h(2), this.h(2), 0);
            this.c.setListener(this);
            this.c.p();
        }
    }

    private void l() {
        j0 j00 = this.r;
        if(j00 != null) {
            if(!TextUtils.isEmpty(j00.a) && "0".equals(this.r.a)) {
                this.j();
            }
            else if(TextUtils.isEmpty(this.r.f) || !this.r.f.equals("text") && !this.r.f.equals("banner")) {
                this.s.setVisibility(0);
            }
            else {
                this.j();
            }
            super.a(this.r);
        }
        if(this.c != null && this.s.getVisibility() == 0) {
            this.s.addView(this.c, new RelativeLayout.LayoutParams(-1, -1));
            this.c.setListener(this);
            this.c.p();
        }
    }

    void m() {
        class com.fsn.cauly.Y.s.b implements DialogInterface.OnKeyListener {
            final s a;

            @Override  // android.content.DialogInterface$OnKeyListener
            public boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
                if(keyEvent0.getAction() != 0) {
                    return true;
                }
                if(v == 4) {
                    try {
                        i0 i00 = s.this.a;
                        if(i00 != null && (i00.C != null && i00.C.containsKey("closeOnBackKey") && !((Boolean)s.this.a.C.get("closeOnBackKey")).booleanValue())) {
                            return true;
                        }
                        c c0 = s.this.b;
                        if(c0 != null && !TextUtils.isEmpty(c0.getAdItem().h) && h.a(s.this.b.getAdItem().h).contains("cauly_b_button=n")) {
                            return true;
                        }
                        dialogInterface0.dismiss();
                        l.a(s.this.a, s.this.r, "back", null);
                        return true;
                    }
                    catch(Exception exception0) {
                    }
                    exception0.printStackTrace();
                }
                return true;
            }
        }

        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.b();
        RelativeLayout relativeLayout0 = com.fsn.cauly.blackdragoncore.utils.c.a(this.a.b, relativeLayout$LayoutParams0);
        relativeLayout0.setBackgroundColor(Color.argb(140, 0, 0, 0));
        LinearLayout linearLayout0 = new LinearLayout(this.a.b);
        linearLayout0.setOrientation(1);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(this.h(550), this.h(940));
        RelativeLayout relativeLayout1 = new RelativeLayout(this.a.b);
        this.s = relativeLayout1;
        linearLayout0.addView(relativeLayout1, relativeLayout$LayoutParams1);
        LinearLayout linearLayout1 = new LinearLayout(this.a.b);
        this.x = linearLayout1;
        linearLayout1.setBackgroundColor(0xFF000000);
        View view0 = new View(this.a.b);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(this.h(546), this.h(1));
        linearLayout$LayoutParams0.leftMargin = this.h(2);
        view0.setBackgroundColor(0xFF000000);
        this.x.addView(view0, linearLayout$LayoutParams0);
        linearLayout0.addView(this.x, new LinearLayout.LayoutParams(this.h(550), this.h(1)));
        this.v = new LinearLayout(this.a.b);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setColor(this.C);
        gradientDrawable0.setCornerRadius(((float)this.h(10)));
        gradientDrawable0.setStroke(this.h(2), 0xFF000000);
        this.v.setBackgroundDrawable(gradientDrawable0);
        this.v.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(this.a.b);
        this.y = linearLayout2;
        linearLayout2.setBackgroundColor(0xFF000000);
        ImageView imageView0 = new ImageView(this.a.b);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, this.h(10));
        linearLayout$LayoutParams1.setMargins(this.h(2), 0, this.h(2), 0);
        imageView0.setBackgroundColor(this.C);
        this.y.addView(imageView0, linearLayout$LayoutParams1);
        this.v.addView(this.y);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(this.h(546), this.h(46));
        linearLayout$LayoutParams2.leftMargin = this.h(2);
        TextView textView0 = new TextView(this.a.b);
        this.w = textView0;
        textView0.setText((TextUtils.isEmpty(this.a.B) ? "종료하시겠습니까?" : this.a.B));
        this.w.setTextColor(Color.rgb(0xC2, 0xC2, 0xC2));
        this.w.setGravity(17);
        this.w.setBackgroundColor(this.C);
        this.v.addView(this.w, linearLayout$LayoutParams2);
        LinearLayout linearLayout3 = new LinearLayout(this.a.b);
        Button button0 = new Button(this.a.b);
        this.o = button0;
        button0.setId(s.E);
        this.o.setText((TextUtils.isEmpty(this.a.z) ? "취소" : this.a.z));
        this.o.setOnClickListener(this);
        this.o.setPadding(0, 0, 0, 0);
        this.o.setTypeface(Typeface.defaultFromStyle(1));
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(this.h(260), this.h(88));
        linearLayout$LayoutParams3.leftMargin = this.h(15);
        this.o.setLayoutParams(linearLayout$LayoutParams3);
        Button button1 = new Button(this.a.b);
        this.p = button1;
        button1.setText((TextUtils.isEmpty(this.a.A) ? "확인" : this.a.A));
        this.p.setId(s.F);
        this.p.setTypeface(Typeface.defaultFromStyle(1));
        this.p.setOnClickListener(this);
        this.p.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(this.h(260), this.h(88));
        this.p.setLayoutParams(linearLayout$LayoutParams4);
        this.i(this.o, this.j, this.k, Color.rgb(0xD8, 0xD8, 0xD8), Color.rgb(0xBB, 0xBB, 0xBB));
        this.i(this.p, this.l, this.m, Color.rgb(0xD8, 0xD8, 0xD8), Color.rgb(0xBB, 0xBB, 0xBB));
        linearLayout3.addView(this.o);
        linearLayout3.addView(this.p);
        LinearLayout.LayoutParams linearLayout$LayoutParams5 = new LinearLayout.LayoutParams(this.h(550), this.h(104));
        linearLayout$LayoutParams5.topMargin = this.h(10);
        this.v.addView(linearLayout3, linearLayout$LayoutParams5);
        LinearLayout.LayoutParams linearLayout$LayoutParams6 = new LinearLayout.LayoutParams(this.h(550), this.h(0xA4));
        linearLayout0.addView(this.v, linearLayout$LayoutParams6);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = com.fsn.cauly.blackdragoncore.utils.c.c();
        relativeLayout$LayoutParams2.addRule(13);
        relativeLayout0.addView(linearLayout0, relativeLayout$LayoutParams2);
        g.a(b.e, "Show popup dialog");
        if(!this.z) {
            this.u = new ProgressBar(this.a.b, null, 0x101007A);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = com.fsn.cauly.blackdragoncore.utils.c.c();
            relativeLayout$LayoutParams3.addRule(13);
            this.u.setLayoutParams(relativeLayout$LayoutParams3);
            this.s.addView(this.u);
        }
        if(this.r == null) {
            this.h();
        }
        else {
            this.k();
        }
        Activity activity0 = (Activity)this.a.a();
        if(activity0 != null) {
            this.q = activity0.getRequestedOrientation();
            if(com.fsn.cauly.blackdragoncore.utils.d.b(this.a.b, 1) || com.fsn.cauly.blackdragoncore.utils.d.b(this.a.b, -1)) {
                activity0.setRequestedOrientation(1);
            }
            else {
                this.h();
            }
            this.e = ((Boolean)this.a.C.get("statusbar_hide")).booleanValue() ? new b0(activity0, 0x1030011) : new b0(activity0, 0x1030010);
            this.e.setContentView(relativeLayout0);
            this.e.a(this);
            this.e.setOnKeyListener(new com.fsn.cauly.Y.s.b(this));
            if(!activity0.isFinishing()) {
                this.e.show();
            }
        }
    }

    void n() {
        class com.fsn.cauly.Y.s.a implements DialogInterface.OnKeyListener {
            final s a;

            @Override  // android.content.DialogInterface$OnKeyListener
            public boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
                if(keyEvent0.getAction() != 0) {
                    return true;
                }
                if(v == 4) {
                    dialogInterface0.dismiss();
                    l.a(s.this.a, s.this.r, "back", null);
                }
                return true;
            }
        }

        HashMap hashMap0 = this.a.C;
        Integer integer0 = (Integer)hashMap0.get("layout_id");
        View view0 = View.inflate(this.a.b, ((int)integer0), null);
        s.E = (int)(((Integer)hashMap0.get("left_btn_id")));
        s.F = (int)(((Integer)hashMap0.get("right_btn_id")));
        View view1 = view0.findViewById(s.E);
        View view2 = view0.findViewById(s.F);
        view1.setOnClickListener(this);
        view2.setOnClickListener(this);
        this.s = (RelativeLayout)view0.findViewById(((int)(((Integer)hashMap0.get("ad_content_id")))));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(this.h(550), this.h(940));
        this.s.setLayoutParams(linearLayout$LayoutParams0);
        g.a(b.e, "Show popup dialog");
        if(!this.z) {
            this.u = new ProgressBar(this.a.b, null, 0x101007A);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.c();
            relativeLayout$LayoutParams0.addRule(13);
            this.u.setLayoutParams(relativeLayout$LayoutParams0);
            this.s.addView(this.u);
        }
        if(this.r == null) {
            this.j();
        }
        else {
            this.l();
        }
        Activity activity0 = (Activity)this.a.a();
        if(activity0 != null) {
            this.q = activity0.getRequestedOrientation();
            if(com.fsn.cauly.blackdragoncore.utils.d.b(this.a.b, 1) || com.fsn.cauly.blackdragoncore.utils.d.b(this.a.b, -1)) {
                activity0.setRequestedOrientation(1);
            }
            else {
                this.j();
            }
        }
        this.e = ((Boolean)this.a.C.get("statusbar_hide")).booleanValue() ? new b0(activity0, 0x1030011) : new b0(activity0, 0x1030010);
        this.e.setContentView(view0);
        this.e.a(this);
        this.e.setOnKeyListener(new com.fsn.cauly.Y.s.a(this));
        if(!activity0.isFinishing()) {
            this.e.show();
        }
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public void onCancel(DialogInterface dialogInterface0) {
        dialogInterface0.dismiss();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        b0 b00 = this.e;
        if(b00 != null) {
            b00.dismiss();
            this.e = null;
        }
        if(view0.getId() == s.F) {
            this.a.a(0x6F, null, null);
            l.a(this.a, this.r, "right", null);
            return;
        }
        this.a.a(110, null, null);
        l.a(this.a, this.r, "left", null);
    }
}

