package com.fsn.cauly.blackdragoncore.contents;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Handler;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.fsn.cauly.R.drawable;
import com.fsn.cauly.Y.e0.h;
import com.fsn.cauly.Y.e0;
import com.fsn.cauly.Y.f0;
import com.fsn.cauly.Y.g;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.j0;
import com.fsn.cauly.Y.k0;
import com.fsn.cauly.Y.l0;
import com.fsn.cauly.Y.m0;
import com.fsn.cauly.Y.o0;
import com.fsn.cauly.Y.p;
import com.fsn.cauly.Y.q0;
import com.fsn.cauly.Y.r;
import com.fsn.cauly.Y.s0.a;
import com.fsn.cauly.Y.s0;
import com.fsn.cauly.Y.v0;
import com.fsn.cauly.blackdragoncore.utils.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d extends c implements a {
    public interface k {
        void d();
    }

    class l extends v0 {
        final d s;

        @Override  // com.fsn.cauly.Y.v0
        public void c() {
            class com.fsn.cauly.blackdragoncore.contents.d.l.a implements Runnable {
                final l a;

                @Override
                public void run() {
                    if(d.this.A.findViewById(0xC0F3) == null) {
                        int v = d.this.z.getLeft();
                        int v1 = d.this.z.getTop();
                        ImageView imageView0 = new ImageView(d.this.getContext());
                        imageView0.setId(0xC0F3);
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = d.this.z.getHeight() > com.fsn.cauly.blackdragoncore.utils.d.a(d.this.getContext(), 70.0f) || d.this.z.getWidth() > com.fsn.cauly.blackdragoncore.utils.d.a(d.this.getContext(), 70.0f) ? new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(d.this.getContext(), 23.0f), com.fsn.cauly.blackdragoncore.utils.d.a(d.this.getContext(), 17.0f)) : new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(d.this.getContext(), 13.0f), com.fsn.cauly.blackdragoncore.utils.d.a(d.this.getContext(), 10.0f));
                        relativeLayout$LayoutParams0.leftMargin = v + com.fsn.cauly.blackdragoncore.utils.d.a(d.this.getContext(), 4.0f);
                        relativeLayout$LayoutParams0.topMargin = v1 + d.this.z.getHeight() - relativeLayout$LayoutParams0.height - com.fsn.cauly.blackdragoncore.utils.d.a(d.this.getContext(), 4.0f);
                        d.this.A.addView(imageView0, relativeLayout$LayoutParams0);
                        d.this.w(imageView0);
                    }
                }
            }

            d.this.r.post(new com.fsn.cauly.blackdragoncore.contents.d.l.a(this));
        }
    }

    RelativeLayout A;
    boolean B;
    float C;
    long D;
    boolean E;
    boolean F;
    private g g;
    private ViewGroup h;
    int i;
    int j;
    k k;
    com.fsn.cauly.blackdragoncore.contents.c.a l;
    Dialog m;
    final int n;
    double o;
    Bitmap p;
    ImageView q;
    Handler r;
    Drawable s;
    Drawable t;
    Drawable u;
    Drawable v;
    Drawable w;
    Drawable x;
    boolean y;
    View z;

    public d(i0 i00, Dialog dialog0, b c$b0) {
        super(i00, c$b0);
        this.n = 0xC0F3;
        this.o = 1.0;
        this.p = null;
        this.q = null;
        this.r = new Handler();
        this.y = false;
        this.z = null;
        this.B = false;
        this.C = 0.8f;
        this.D = 0L;
        this.E = false;
        this.m = dialog0;
    }

    public d(i0 i00, b c$b0) {
        super(i00, c$b0);
        this.n = 0xC0F3;
        this.o = 1.0;
        this.p = null;
        this.q = null;
        this.r = new Handler();
        this.y = false;
        this.z = null;
        this.B = false;
        this.C = 0.8f;
        this.D = 0L;
        this.E = false;
    }

    private int A(int v) {
        return this.e == b.e ? this.h.getWidth() * v * 1000 / this.i / 1000 : this.d.x * v * 1000 / this.i / 1000;
    }

    boolean B(j0 j00) {
        return j00.t0 <= 0.0f || j00.t0 * 1000.0f <= ((float)(((int)(System.currentTimeMillis() - this.D))));
    }

    private int C(int v) {
        return this.e == b.e ? this.h.getHeight() * v * 100 / this.j / 100 : this.d.y * v * 100 / this.j / 100;
    }

    void D(j0 j00) {
        i0 i00 = this.a;
        if(i00 != null && j00 != null && (i00.r != null && i00.r.z)) {
            p.a(i00, "click", "abuse", "", "", "&ad_cd=" + j00.a);
        }
    }

    private int E(int v) {
        return (int)(((double)v) * this.o);
    }

    private int F(String s) {
        if(!TextUtils.isEmpty(s)) {
            if(s.startsWith("rgb")) {
                String[] arr_s = s.replace("rgb(", "").replace(")", "").replace(" ", "").split(",");
                return arr_s == null || arr_s.length != 3 ? 0xFF000000 : Color.rgb(Integer.parseInt(arr_s[0]), Integer.parseInt(arr_s[1]), Integer.parseInt(arr_s[2]));
            }
            if(s.startsWith("#")) {
                return Color.parseColor(s);
            }
            try {
                return Color.parseColor(('#' + s));
            }
            catch(Exception unused_ex) {
            }
        }
        return 0xFF000000;
    }

    private View G() {
        class com.fsn.cauly.blackdragoncore.contents.d.d implements View.OnClickListener {
            final d a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                k d$k0 = d.this.k;
                if(d$k0 != null) {
                    d$k0.d();
                }
            }
        }


        class e implements View.OnClickListener {
            final d a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                d.this.M();
            }
        }


        class f implements View.OnTouchListener {
            final ImageView a;
            final d b;

            f(ImageView imageView0) {
                this.a = imageView0;
                super();
            }

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                int v = motionEvent0.getAction();
                switch(v) {
                    case 0: {
                        this.a.setImageDrawable(d.this.u);
                        return true;
                    label_5:
                        if(v == 3) {
                            this.a.setImageDrawable(d.this.t);
                            goto label_7;
                        }
                        break;
                    }
                    case 1: {
                    label_7:
                        k d$k0 = d.this.k;
                        if(d$k0 != null) {
                            d$k0.d();
                            return true;
                        }
                        break;
                    }
                    default: {
                        goto label_5;
                    }
                }
                return true;
            }
        }


        class com.fsn.cauly.blackdragoncore.contents.d.g implements View.OnTouchListener {
            final TextView a;
            final d b;

            com.fsn.cauly.blackdragoncore.contents.d.g(TextView textView0) {
                this.a = textView0;
                super();
            }

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                int v = motionEvent0.getAction();
                switch(v) {
                    case 0: {
                        this.a.setBackgroundDrawable(d.this.w);
                        return true;
                    label_5:
                        if(v == 3) {
                            this.a.setBackgroundDrawable(d.this.v);
                            return true;
                        }
                        break;
                    }
                    case 1: {
                        d.this.M();
                        k d$k0 = d.this.k;
                        if(d$k0 != null) {
                            d$k0.d();
                            return true;
                        }
                        break;
                    }
                    default: {
                        goto label_5;
                    }
                }
                return true;
            }
        }

        HashMap hashMap0 = this.a.C;
        if(hashMap0.containsKey("landing_layout_id")) {
            Integer integer0 = (Integer)hashMap0.get("landing_layout_id");
            View view0 = View.inflate(this.a.b, ((int)integer0), null);
            if(hashMap0.get("landing_close_id") != null) {
                TextView textView0 = (TextView)view0.findViewById(((int)(((Integer)hashMap0.get("landing_close_id")))));
                if(textView0 != null) {
                    textView0.setOnClickListener(new com.fsn.cauly.blackdragoncore.contents.d.d(this));
                }
            }
            if(hashMap0.get("landing_main_image_id") != null) {
                ImageView imageView0 = (ImageView)view0.findViewById(((int)(((Integer)hashMap0.get("landing_main_image_id")))));
                imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
                if(!TextUtils.isEmpty(this.b.h)) {
                    this.y(this.b.h, imageView0);
                }
            }
            if(hashMap0.get("landing_icon_image_id") != null) {
                ImageView imageView1 = (ImageView)view0.findViewById(((int)(((Integer)hashMap0.get("landing_icon_image_id")))));
                imageView1.setScaleType(ImageView.ScaleType.FIT_XY);
                if(!TextUtils.isEmpty(this.b.i)) {
                    this.y(this.b.i, imageView1);
                }
            }
            if(hashMap0.get("landing_title_id") != null) {
                TextView textView1 = (TextView)view0.findViewById(((int)(((Integer)hashMap0.get("landing_title_id")))));
                if(!TextUtils.isEmpty(this.b.c)) {
                    textView1.setText(this.b.c);
                }
            }
            if(hashMap0.get("landing_subtitle_id") != null) {
                TextView textView2 = (TextView)view0.findViewById(((int)(((Integer)hashMap0.get("landing_subtitle_id")))));
                if(!TextUtils.isEmpty(this.b.K)) {
                    textView2.setText(this.b.K);
                }
            }
            if(hashMap0.get("landing_text_id") != null) {
                TextView textView3 = (TextView)view0.findViewById(((int)(((Integer)hashMap0.get("landing_text_id")))));
                if(!TextUtils.isEmpty(this.b.d)) {
                    textView3.setText(this.b.d);
                }
            }
            if(hashMap0.get("landing_link_id") != null) {
                view0.findViewById(((int)(((Integer)hashMap0.get("landing_link_id"))))).setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                    if(d.this.h != null && d.this.h.getRootView() != null && d.this.h.getRootView().getContext() instanceof Activity) {
                        i0 i00 = d.this.a;
                        i00.b = d.this.h.getRootView().getContext();
                    }
                    if(!d.this.B(d.this.b)) {
                        d.this.D(d.this.b);
                        return;
                    }
                    String s = d.this.b.l;
                    if(s != null && s.equals("app")) {
                        r.a(d.this.a, d.this.b, 0);
                        return;
                    }
                    Matcher matcher0 = Pattern.compile("cauly_action_param=open_browser").matcher(d.this.b.e);
                    if(Pattern.compile("cauly_action_param=open_youtube").matcher(d.this.b.e).find()) {
                        com.fsn.cauly.blackdragoncore.contents.f.b(((Activity)d.this.a.b), d.this.b.e, null);
                    }
                    else if(matcher0.find()) {
                        com.fsn.cauly.blackdragoncore.contents.f.a(d.this.a.b, d.this.b, d.this.b.e, null, d.this.a.j);
                    }
                    else {
                        new o0(d.this.a.b).a(d.this.a, d.this.b, 0);
                    }
                    com.fsn.cauly.Y.l.a(d.this.a, d.this.b, null, "");
                });
            }
            return view0;
        }
        this.t();
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.b();
        View view1 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), relativeLayout$LayoutParams0);
        RelativeLayout relativeLayout0 = new RelativeLayout(this.getContext());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(this.E(618), this.E(996));
        relativeLayout0.setBackgroundDrawable(this.x);
        relativeLayout0.setLayoutParams(relativeLayout$LayoutParams1);
        TextView textView4 = new TextView(this.getContext());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, this.E(90));
        relativeLayout$LayoutParams2.addRule(14);
        textView4.setTextColor(Color.rgb(94, 94, 94));
        textView4.setTextSize(0, ((float)this.E(34)));
        textView4.setText("상세 정보");
        textView4.setGravity(17);
        relativeLayout0.addView(textView4, relativeLayout$LayoutParams2);
        View view2 = new View(this.getContext());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, this.E(2));
        relativeLayout$LayoutParams3.topMargin = this.E(90);
        view2.setBackgroundDrawable(this.s);
        relativeLayout0.addView(view2, relativeLayout$LayoutParams3);
        TextView textView5 = new TextView(this.getContext());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(11);
        relativeLayout$LayoutParams4.topMargin = this.E(108);
        relativeLayout$LayoutParams4.rightMargin = this.E(30);
        textView5.setTextColor(Color.rgb(0x99, 0x99, 0x99));
        textView5.setTextSize(0, ((float)this.E(14)));
        textView5.setText("Sponsor");
        relativeLayout0.addView(textView5, relativeLayout$LayoutParams4);
        ImageView imageView2 = new ImageView(this.getContext());
        imageView2.setImageDrawable(this.t);
        imageView2.setPadding(this.E(10), this.E(10), this.E(10), this.E(10));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(this.E(54), this.E(54));
        relativeLayout$LayoutParams5.addRule(11);
        relativeLayout$LayoutParams5.rightMargin = this.E(12);
        relativeLayout$LayoutParams5.topMargin = this.E(12);
        imageView2.setOnTouchListener(new f(this, imageView2));
        relativeLayout0.addView(imageView2, relativeLayout$LayoutParams5);
        TextView textView6 = new TextView(this.getContext());
        textView6.setBackgroundDrawable(this.v);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams6 = new RelativeLayout.LayoutParams(-1, this.E(86));
        relativeLayout$LayoutParams6.addRule(12);
        textView6.setTextColor(-1);
        textView6.setGravity(17);
        textView6.setTextSize(0, ((float)this.E(36)));
        textView6.setTypeface(null, 1);
        textView6.setText("자세히 보러 가기");
        textView6.setOnTouchListener(new com.fsn.cauly.blackdragoncore.contents.d.g(this, textView6));
        relativeLayout0.addView(textView6, relativeLayout$LayoutParams6);
        if(!TextUtils.isEmpty(this.b.c)) {
            TextView textView7 = new TextView(this.getContext());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams7.topMargin = this.E(0x92);
            relativeLayout$LayoutParams7.rightMargin = this.E(30);
            relativeLayout$LayoutParams7.leftMargin = this.E(0x100);
            textView7.setTextColor(0xFF000000);
            textView7.setTextSize(0, ((float)this.E(30)));
            textView7.setLines(1);
            textView7.setEllipsize(TextUtils.TruncateAt.END);
            textView7.setText("" + this.b.c);
            relativeLayout0.addView(textView7, relativeLayout$LayoutParams7);
        }
        if(!TextUtils.isEmpty(this.b.K)) {
            TextView textView8 = new TextView(this.getContext());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams8.leftMargin = this.E(0x100);
            relativeLayout$LayoutParams8.rightMargin = this.E(30);
            relativeLayout$LayoutParams8.topMargin = this.E(0xC6);
            textView8.setLines(3);
            textView8.setEllipsize(TextUtils.TruncateAt.END);
            textView8.setTextColor(Color.rgb(0x8A, 0x88, 0x7E));
            textView8.setTextSize(0, ((float)this.E(24)));
            textView8.setText("" + this.b.K);
            relativeLayout0.addView(textView8, relativeLayout$LayoutParams8);
        }
        if(!TextUtils.isEmpty(this.b.d)) {
            ScrollView scrollView0 = new ScrollView(this.getContext());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams9 = new RelativeLayout.LayoutParams(-1, this.E(170));
            relativeLayout$LayoutParams9.topMargin = this.E(716);
            relativeLayout$LayoutParams9.leftMargin = this.E(30);
            relativeLayout$LayoutParams9.rightMargin = this.E(30);
            TextView textView9 = new TextView(this.getContext());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
            textView9.setTextColor(0xFF000000);
            textView9.setTextSize(0, ((float)this.E(22)));
            textView9.setText("" + this.b.d);
            scrollView0.addView(textView9, relativeLayout$LayoutParams10);
            relativeLayout0.addView(scrollView0, relativeLayout$LayoutParams9);
        }
        if(!TextUtils.isEmpty(this.b.i)) {
            ImageView imageView3 = new ImageView(this.getContext());
            imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams11 = new RelativeLayout.LayoutParams(this.E(200), this.E(200));
            relativeLayout$LayoutParams11.leftMargin = this.E(30);
            relativeLayout$LayoutParams11.topMargin = this.E(120);
            relativeLayout0.addView(imageView3, relativeLayout$LayoutParams11);
            this.y(this.b.i, imageView3);
        }
        if(!TextUtils.isEmpty(this.b.h)) {
            ImageView imageView4 = new ImageView(this.getContext());
            imageView4.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams12 = new RelativeLayout.LayoutParams(this.E(614), this.E(344));
            relativeLayout$LayoutParams12.topMargin = this.E(347);
            relativeLayout$LayoutParams12.leftMargin = this.E(2);
            relativeLayout0.addView(imageView4, relativeLayout$LayoutParams12);
            this.y(this.b.h, imageView4);
        }
        ((ViewGroup)view1).addView(relativeLayout0);
        return view1;
    }

    private View H() {
        class com.fsn.cauly.blackdragoncore.contents.d.b implements View.OnTouchListener {
            final d a;

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                if(motionEvent0.getAction() == 1) {
                    com.fsn.cauly.blackdragoncore.contents.c.a c$a0 = d.this.l;
                    if(c$a0 != null) {
                        c$a0.b();
                    }
                    String s = d.this.b.v;
                    if(s != null) {
                        if(s.equalsIgnoreCase("detail")) {
                            new q0(d.this.a.b).a(d.this.a, d.this.b, 0);
                            com.fsn.cauly.Y.l.a(d.this.a, d.this.b, null, "");
                            return false;
                        }
                        if(d.this.b.v.equalsIgnoreCase("detail_custom")) {
                            new q0(d.this.a.b).a(d.this.a, d.this.b);
                            com.fsn.cauly.Y.l.a(d.this.a, d.this.b, null, "");
                            return false;
                        }
                    }
                    d.this.M();
                }
                return false;
            }
        }


        class com.fsn.cauly.blackdragoncore.contents.d.c implements View.OnClickListener {
            final d a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                com.fsn.cauly.blackdragoncore.contents.c.a c$a0 = d.this.l;
                if(c$a0 != null) {
                    c$a0.b();
                }
                String s = d.this.b.v;
                if(s != null) {
                    if(s.equalsIgnoreCase("detail")) {
                        new q0(d.this.a.b).a(d.this.a, d.this.b, 0);
                        com.fsn.cauly.Y.l.a(d.this.a, d.this.b, null, "");
                        return;
                    }
                    if(d.this.b.v.equalsIgnoreCase("detail_custom")) {
                        new q0(d.this.a.b).a(d.this.a, d.this.b);
                        com.fsn.cauly.Y.l.a(d.this.a, d.this.b, null, "");
                        return;
                    }
                }
                d.this.M();
            }
        }

        WebView webView0;
        View view1;
        HashMap hashMap0 = this.a.C;
        View view0 = null;
        if(hashMap0.containsKey("layout_id")) {
            this.A = new RelativeLayout(this.getContext());
            Integer integer0 = (Integer)hashMap0.get("layout_id");
            view0 = View.inflate(this.a.b, ((int)integer0), null);
            if(hashMap0.containsKey("clicking_id")) {
                view1 = view0.findViewById(((int)(((Integer)hashMap0.get("clicking_id")))));
            }
            else if(hashMap0.containsKey("main_image_id")) {
                view1 = view0.findViewById(((int)(((Integer)hashMap0.get("main_image_id")))));
                if(view1 instanceof WebView) {
                    this.E = true;
                }
                else {
                    com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.c, "Recommand use Webview");
                    this.E = false;
                }
            }
            else {
                view1 = view0;
            }
            if(this.E) {
                view1.setOnTouchListener(new com.fsn.cauly.blackdragoncore.contents.d.b(this));
            }
            else {
                view1.setOnClickListener(new com.fsn.cauly.blackdragoncore.contents.d.c(this));
            }
            if(hashMap0.get("icon_image_id") != null) {
                ImageView imageView0 = (ImageView)view0.findViewById(((int)(((Integer)hashMap0.get("icon_image_id")))));
                if(!hashMap0.containsKey("sponsor_visible")) {
                    this.z = imageView0;
                }
                else if("true".equalsIgnoreCase(((String)hashMap0.get("sponsor_visible")))) {
                    this.z = imageView0;
                }
                if(!TextUtils.isEmpty(this.b.i) && this.B) {
                    this.y(this.b.i, imageView0);
                }
            }
            if(hashMap0.get("main_image_id") != null) {
                if(this.E) {
                    webView0 = (WebView)view0.findViewById(((int)(((Integer)hashMap0.get("main_image_id")))));
                    webView0.getSettings().setJavaScriptEnabled(true);
                    webView0.getSettings().setLoadWithOverviewMode(true);
                    webView0.getSettings().setBuiltInZoomControls(false);
                    webView0.getSettings().setUseWideViewPort(true);
                    webView0.getSettings().setDomStorageEnabled(true);
                    webView0.setVerticalScrollBarEnabled(false);
                    webView0.setHorizontalScrollBarEnabled(false);
                    webView0.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                    webView0.setScrollBarStyle(0x2000000);
                    webView0.setScrollbarFadingEnabled(false);
                }
                else {
                    webView0 = (ImageView)view0.findViewById(((int)(((Integer)hashMap0.get("main_image_id")))));
                }
                if(!hashMap0.containsKey("sponsor_visible")) {
                    this.z = webView0;
                }
                else if("true".equalsIgnoreCase(((String)hashMap0.get("sponsor_visible")))) {
                    this.z = webView0;
                }
                if(!TextUtils.isEmpty(this.b.h) && this.B) {
                    if(this.E) {
                        webView0.loadUrl(this.b.h);
                    }
                    else {
                        this.z(this.b.h, ((ImageView)webView0), true);
                    }
                }
            }
            if(hashMap0.get("title_id") != null) {
                TextView textView0 = (TextView)view0.findViewById(((int)(((Integer)hashMap0.get("title_id")))));
                if(!TextUtils.isEmpty(this.b.c)) {
                    textView0.setText(this.b.c);
                }
            }
            if(hashMap0.get("subtitle_id") != null) {
                TextView textView1 = (TextView)view0.findViewById(((int)(((Integer)hashMap0.get("subtitle_id")))));
                if(!TextUtils.isEmpty(this.b.K)) {
                    textView1.setText(this.b.K);
                }
            }
            if(hashMap0.get("text_id") != null) {
                TextView textView2 = (TextView)view0.findViewById(((int)(((Integer)hashMap0.get("text_id")))));
                if(!TextUtils.isEmpty(this.b.d)) {
                    textView2.setText(this.b.d);
                }
            }
        }
        if(view0 != null) {
            this.A.addView(view0);
            return this.A;
        }
        return null;
    }

    private void I() {
        this.L();
        if(this.F) {
            return;
        }
        int[] arr_v = new int[2];
        this.getLocationOnScreen(arr_v);
        Rect rect0 = new Rect();
        this.getWindowVisibleDisplayFrame(rect0);
        int v = rect0.right;
        int v1 = rect0.bottom;
        if(this.C <= 0.0f) {
            this.F = true;
            this.h();
            return;
        }
        if(arr_v[0] <= 0 && arr_v[1] <= 0) {
            return;
        }
        if(this.getWidth() > 0 && ((float)(arr_v[0] + this.getWidth())) * this.C <= ((float)v) && ((float)arr_v[1]) + ((float)this.getHeight()) * this.C <= ((float)v1)) {
            this.F = true;
            this.h();
        }
    }

    void J() {
        g g0 = this.g;
        if(g0 != null) {
            g0.cancel();
            this.g = null;
        }
        if(this.e == b.e && this.A != null) {
            HashMap hashMap0 = this.a.C;
            if(hashMap0.get("icon_image_id") != null) {
                com.fsn.cauly.blackdragoncore.utils.c.a(((ImageView)this.A.findViewById(((int)(((Integer)hashMap0.get("icon_image_id")))))));
            }
            if(hashMap0.get("main_image_id") != null) {
                WebView webView0 = this.E ? ((WebView)this.A.findViewById(((int)(((Integer)hashMap0.get("main_image_id")))))) : ((ImageView)this.A.findViewById(((int)(((Integer)hashMap0.get("main_image_id"))))));
                com.fsn.cauly.blackdragoncore.utils.c.a(webView0);
            }
        }
        if(this.p != null && !this.p.isRecycled()) {
            this.p.recycle();
        }
    }

    private View K() {
        class com.fsn.cauly.blackdragoncore.contents.d.a implements View.OnClickListener {
            final k0 a;
            final d b;

            com.fsn.cauly.blackdragoncore.contents.d.a(k0 k00) {
                this.a = k00;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                com.fsn.cauly.blackdragoncore.contents.f.a(d.this.a.b, d.this.b, this.a.d, "", d.this.a.j);
            }
        }


        class i implements View.OnClickListener {
            final k0 a;
            final d b;

            i(k0 k00) {
                this.a = k00;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                com.fsn.cauly.blackdragoncore.contents.f.a(d.this.a.b, d.this.b, this.a.d, "", d.this.a.j);
            }
        }


        class j implements View.OnClickListener {
            final d a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                k d$k0 = d.this.k;
                if(d$k0 != null) {
                    d$k0.d();
                }
            }
        }

        View view0 = new RelativeLayout(this.a.b);
        j0 j00 = this.b;
        if(j00 != null) {
            ArrayList arrayList0 = j00.L;
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    k0 k00 = (k0)object0;
                    if(TextUtils.isEmpty(k00.a)) {
                    }
                    else if(k00.a.equals("frame")) {
                        this.setBackgroundColor(this.F(k00.b));
                    }
                    else if(k00.a.equals("image")) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(this.A(k00.g), this.C(k00.h));
                        relativeLayout$LayoutParams0.leftMargin = this.A(k00.i);
                        relativeLayout$LayoutParams0.topMargin = this.C(k00.j);
                        ImageView imageView0 = new ImageView(this.a.b);
                        imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
                        if(!TextUtils.isEmpty(k00.e)) {
                            this.y(k00.e, imageView0);
                        }
                        if(!TextUtils.isEmpty(k00.d)) {
                            imageView0.setOnClickListener(new i(this, k00));
                        }
                        ((ViewGroup)view0).addView(imageView0, relativeLayout$LayoutParams0);
                    }
                    else if(k00.a.equals("web")) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(this.A(k00.g), this.C(k00.h));
                        relativeLayout$LayoutParams1.leftMargin = this.A(k00.i);
                        relativeLayout$LayoutParams1.topMargin = this.C(k00.j);
                        f0 f00 = new f0(this.a.b);
                        f00.setHidePackageName(this.a.r.E);
                        if(!TextUtils.isEmpty(k00.e)) {
                            com.fsn.cauly.blackdragoncore.utils.d.a(this.a, com.fsn.cauly.Y.i0.a.b);
                            int v = this.A(k00.g) <= this.C(k00.h) ? this.A(k00.g) : this.C(k00.h);
                            f00.setBackgroundColor(0);
                            f00.b(k00.e, false, true, v * 100 / 720, this.b.k0, this.b.x0);
                        }
                        ((ViewGroup)view0).addView(f00, relativeLayout$LayoutParams1);
                    }
                    else if(k00.a.equals("close")) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(this.A(k00.g), this.C(k00.h));
                        relativeLayout$LayoutParams2.leftMargin = this.A(k00.i);
                        relativeLayout$LayoutParams2.topMargin = this.C(k00.j);
                        ImageView imageView1 = new ImageView(this.a.b);
                        imageView1.setScaleType(ImageView.ScaleType.FIT_XY);
                        if(!TextUtils.isEmpty(k00.e)) {
                            this.y(k00.e, imageView1);
                        }
                        imageView1.setOnClickListener(new j(this));
                        ((ViewGroup)view0).addView(imageView1, relativeLayout$LayoutParams2);
                    }
                    else if(k00.a.equals("text")) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                        relativeLayout$LayoutParams3.leftMargin = this.A(k00.i);
                        relativeLayout$LayoutParams3.topMargin = this.C(k00.j);
                        TextView textView0 = new TextView(this.a.b);
                        textView0.setTextColor(this.F(k00.b));
                        textView0.setText("" + k00.c);
                        if(!TextUtils.isEmpty(k00.f) && k00.f.contains("px")) {
                            int v1 = Integer.parseInt(k00.f.replace("px", ""));
                            textView0.setTextSize(((float)this.A(((int)this.a(this.a.b, v1)))));
                        }
                        if(!TextUtils.isEmpty(k00.d)) {
                            textView0.setOnClickListener(new com.fsn.cauly.blackdragoncore.contents.d.a(this, k00));
                        }
                        ((ViewGroup)view0).addView(textView0, relativeLayout$LayoutParams3);
                    }
                    else if(k00.a.equals("video")) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(this.A(k00.g), this.C(k00.h));
                        relativeLayout$LayoutParams4.leftMargin = this.A(k00.i);
                        relativeLayout$LayoutParams4.topMargin = this.C(k00.j);
                        e0 e00 = new e0(this.a.b);
                        ((ViewGroup)view0).addView(e00, relativeLayout$LayoutParams4);
                        if(!TextUtils.isEmpty(k00.e)) {
                            e00.a(k00.e);
                        }
                        if(this.b.E) {
                            e00.a(h.c);
                        }
                    }
                }
            }
        }
        return view0;
    }

    private void L() {
        if(this.A != null && (this.z != null && this.z.getWidth() > 0 && this.A.findViewById(0xC0F3) == null)) {
            new l(this).execute();
        }
    }

    // 检测为 Lambda 实现
    private void M() [...]

    public float a(Context context0, int v) {
        return ((float)v) / context0.getResources().getDisplayMetrics().scaledDensity;
    }

    protected Drawable a(Context context0, String s) {
        try {
            return Drawable.createFromStream(context0.getResources().getAssets().open(s), null);
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return null;
        }
    }

    public void a(ImageView imageView0, Bitmap bitmap0) {
        float f6;
        float f4;
        if(bitmap0 != null && imageView0 != null) {
            j0 j00 = this.b;
            if(j00 != null && !this.y) {
                if(j00.R <= 0 && j00.S <= 0) {
                    j00.B = 720;
                    j00.C = 480;
                    j00.R = 40;
                    j00.S = 60;
                }
                int v = bitmap0.getWidth();
                int v1 = bitmap0.getHeight();
                int v2 = imageView0.getWidth();
                int v3 = imageView0.getHeight();
                if(v > 0 && v1 > 0 && v2 > 0 && v3 > 0) {
                    Matrix matrix0 = new Matrix();
                    float f = ((float)imageView0.getWidth()) / ((float)imageView0.getHeight());
                    float f1 = (float)this.b.B;
                    float f2 = (float)this.b.C;
                    int v4 = this.b.R;
                    int v5 = this.b.S;
                    float f3 = f1 / f2;
                    if(f < f3) {
                        int v6 = (int)f1;
                        f4 = f1;
                        float f5;
                        while((f5 = (float)v6) > f1 - ((float)(v4 * 2))) {
                            if(f >= f5 / f2) {
                                f4 = f5;
                                break;
                            }
                            --v6;
                            f4 = f5;
                        }
                        f6 = f2;
                    }
                    else if(f > f3) {
                        int v7 = (int)f2;
                        for(float f7 = f2; true; f7 = f6) {
                            f6 = (float)v7;
                            if(f6 <= f2 - ((float)(v5 * 2))) {
                                f6 = f7;
                                break;
                            }
                            if(f <= f1 / f6) {
                                break;
                            }
                            --v7;
                        }
                        f4 = f1;
                    }
                    else {
                        f4 = f1;
                        f6 = f2;
                    }
                    float f8 = ((float)v2) / (f4 * ((float)v) / f1);
                    float f9 = ((float)v3) / (f6 * ((float)v1) / f2);
                    matrix0.postScale(f8, f9);
                    matrix0.postTranslate(-((((float)v) * f8 - ((float)v2)) / 2.0f), -((((float)v1) * f9 - ((float)v3)) / 2.0f));
                    imageView0.setImageMatrix(matrix0);
                    this.y = true;
                }
            }
        }
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        switch(s00.getTag()) {
            case 999: {
                ((g)s00).l();
                this.p = ((g)s00).j();
                this.a(((g)s00).i(), this.p);
                return;
            }
            case 1000: {
                ((g)s00).l();
                return;
            }
            default: {
                ((g)s00).k();
            }
        }
    }

    protected NinePatchDrawable b(Context context0, String s) {
        Bitmap bitmap0 = m.a(context0, s);
        if(bitmap0 == null) {
            return null;
        }
        byte[] arr_b = bitmap0.getNinePatchChunk();
        return NinePatch.isNinePatchChunk(arr_b) ? new NinePatchDrawable(this.getResources(), bitmap0, arr_b, new Rect(), null) : null;
    }

    @Override  // android.view.View
    public void computeScroll() {
        super.computeScroll();
        this.I();
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

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = true;
        this.u();
        this.I();
        this.D = System.currentTimeMillis();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J();
        this.B = false;
    }

    @Override  // android.widget.LinearLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.a(this.q, this.p);
        this.I();
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public void p() {
        this.a(this.q, this.p);
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void q() {
        com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Start Native content" + this.e);
        ArrayList arrayList0 = this.b.L;
        this.h = (ViewGroup)this.a.a();
        this.l = this.c;
        l0 l00 = this.a.r;
        if(l00 != null) {
            this.C = l00.y;
        }
        if(!this.b.k0) {
            this.setLayerType(1, null);
        }
        if(this.b.k0 && m0.l(this.a.b)) {
            this.setLayerType(2, null);
        }
        this.o = com.fsn.cauly.blackdragoncore.utils.d.a(this.a.b) > com.fsn.cauly.blackdragoncore.utils.d.c(this.a.b) ? ((double)com.fsn.cauly.blackdragoncore.utils.d.a(this.a.b)) / 1280.0 : ((double)com.fsn.cauly.blackdragoncore.utils.d.c(this.a.b)) / 1280.0;
        b c$b0 = this.e;
        if(c$b0 == b.e) {
            this.addView(this.H(), new RelativeLayout.LayoutParams(-1, -1));
            this.i();
            return;
        }
        if(c$b0 == b.c && arrayList0 != null) {
            k0 k00 = this.v(arrayList0);
            this.i = k00.g;
            this.j = k00.h;
            this.addView(this.K(), new LinearLayout.LayoutParams(-2, -2));
            this.setGravity(1);
            this.i();
            return;
        }
        if(c$b0 == b.d) {
            this.addView(this.G(), new RelativeLayout.LayoutParams(-1, -1));
            this.i();
            return;
        }
        this.c(-200, "internal error");
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void s() {
        com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Stop NativeAd content " + this.e);
        this.J();
        if(this.e == b.e) {
            ViewGroup viewGroup0 = this.h;
            if(viewGroup0 != null) {
                com.fsn.cauly.blackdragoncore.utils.c.a(viewGroup0);
                return;
            }
        }
        Dialog dialog0 = this.m;
        if(dialog0 != null) {
            com.fsn.cauly.blackdragoncore.utils.c.a(dialog0.getWindow().getDecorView());
        }
    }

    public void setNativeAdListener(k d$k0) {
        this.k = d$k0;
    }

    void t() {
        try {
            this.s = this.a(this.getContext(), "line.png");
            this.t = this.a(this.getContext(), "close_normal.png");
            this.u = this.a(this.getContext(), "close_press.png");
            this.v = this.b(this.getContext(), "detail_btn_normal.9.png");
            this.w = this.b(this.getContext(), "detail_btn_press.9.png");
            this.x = this.b(this.getContext(), "bg.9.png");
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    private void u() {
        View view0;
        if(this.A != null && this.B) {
            HashMap hashMap0 = this.a.C;
            if(hashMap0.get("icon_image_id") != null) {
                ImageView imageView0 = (ImageView)this.A.findViewById(((int)(((Integer)hashMap0.get("icon_image_id")))));
                if(!TextUtils.isEmpty(this.b.i) && this.B) {
                    this.y(this.b.i, imageView0);
                }
            }
            if(hashMap0.get("main_image_id") != null) {
                try {
                    view0 = null;
                    view0 = this.A.findViewById(((int)(((Integer)hashMap0.get("main_image_id")))));
                    if(view0 instanceof WebView) {
                        com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.c, "recommand use Webview");
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
                if(!TextUtils.isEmpty(this.b.h) && this.B) {
                    if(this.E) {
                        ((WebView)view0).loadUrl(this.b.h);
                        return;
                    }
                    this.z(this.b.h, ((ImageView)view0), true);
                }
            }
        }
    }

    private k0 v(ArrayList arrayList0) {
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

    void w(ImageView imageView0) {
        class com.fsn.cauly.blackdragoncore.contents.d.h implements View.OnClickListener {
            final d a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                com.fsn.cauly.blackdragoncore.utils.i.b(d.this.a, d.this.b);
            }
        }

        if(imageView0 != null) {
            try {
                imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView0.setImageResource(drawable.ad_marker);
                imageView0.setOnClickListener(new com.fsn.cauly.blackdragoncore.contents.d.h(this));
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
    }

    private void y(String s, ImageView imageView0) {
        if(s != null && s.startsWith("http")) {
            g g0 = new g(this.a.b, s, imageView0);
            this.g = g0;
            g0.setTag(1000);
            this.g.a(this);
            this.g.execute();
        }
    }

    private void z(String s, ImageView imageView0, boolean z) {
        if(s != null && s.startsWith("http")) {
            g g0 = new g(this.a.b, s, imageView0);
            this.g = g0;
            if(z) {
                g0.setTag(999);
            }
            else {
                g0.setTag(1000);
            }
            this.g.a(this);
            this.g.execute();
        }
    }
}

