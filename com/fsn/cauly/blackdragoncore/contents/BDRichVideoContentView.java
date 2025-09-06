package com.fsn.cauly.blackdragoncore.contents;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fsn.cauly.Y.e0.d;
import com.fsn.cauly.Y.e0.e;
import com.fsn.cauly.Y.e0.g;
import com.fsn.cauly.Y.e0;
import com.fsn.cauly.Y.f0;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.j0;
import com.fsn.cauly.Y.k0;
import com.fsn.cauly.Y.l;
import com.fsn.cauly.Y.m0;
import com.fsn.cauly.Y.o0;
import com.fsn.cauly.Y.o;
import com.fsn.cauly.Y.s0.a;
import com.fsn.cauly.Y.s0;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BDRichVideoContentView extends c implements d, a {
    public class RichVideoWebInterface {
        f0 a;
        final BDRichVideoContentView b;
        public boolean isWebLoaded;

        public RichVideoWebInterface(f0 f00) {
            this.isWebLoaded = false;
            this.a = f00;
        }

        @JavascriptInterface
        public void closePopup() {
            BDRichVideoContentView.this.t.sendEmptyMessage(3);
        }

        @JavascriptInterface
        public void dismiss() {
            class com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.RichVideoWebInterface.a implements Runnable {
                final RichVideoWebInterface a;

                @Override
                public void run() {
                    for(int v = 0; v < BDRichVideoContentView.this.getChildCount(); ++v) {
                        if(BDRichVideoContentView.this.getChildAt(v).equals(RichVideoWebInterface.this.a)) {
                            BDRichVideoContentView.this.removeView(RichVideoWebInterface.this.a);
                            return;
                        }
                    }
                }
            }

            BDRichVideoContentView.this.t.post(new com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.RichVideoWebInterface.a(this));
        }

        @JavascriptInterface
        public boolean isPlaying() {
            e0 e00 = BDRichVideoContentView.this.p;
            return e00 != null && e00.j();
        }

        @JavascriptInterface
        public void onWebLoaded() {
            this.isWebLoaded = true;
        }

        @JavascriptInterface
        public void open(String s, String s1) {
            class b implements Runnable {
                final String a;
                final String b;
                final RichVideoWebInterface c;

                b(String s, String s1) {
                    this.a = s;
                    this.b = s1;
                    super();
                }

                @Override
                public void run() {
                    BDRichVideoContentView.this.y(this.a, this.b);
                }
            }

            BDRichVideoContentView.this.t.post(new b(this, s, s1));
        }

        @JavascriptInterface
        public void pause() {
            BDRichVideoContentView.this.t.sendEmptyMessage(1);
        }

        @JavascriptInterface
        public void resume() {
            BDRichVideoContentView.this.t.sendEmptyMessage(2);
        }

        @JavascriptInterface
        public void sendClickInform(String s) {
            l.a(BDRichVideoContentView.this.a, BDRichVideoContentView.this.b, s, null);
        }

        @JavascriptInterface
        public void sendRealInform(String s) {
            o.a(BDRichVideoContentView.this.a, BDRichVideoContentView.this.b, "charge");
        }

        @JavascriptInterface
        public void showController(boolean z) {
            if(z) {
                BDRichVideoContentView.this.t.sendEmptyMessage(4);
                return;
            }
            BDRichVideoContentView.this.t.sendEmptyMessage(6);
        }

        @JavascriptInterface
        public void start() {
            BDRichVideoContentView.this.t.sendEmptyMessage(0);
        }
    }

    class com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.a extends Handler {
        final BDRichVideoContentView a;

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            switch(message0.what) {
                case 0: {
                    e0 e00 = BDRichVideoContentView.this.p;
                    if(e00 != null) {
                        e00.l();
                        ArrayList arrayList0 = BDRichVideoContentView.this.r;
                        if(arrayList0 != null && arrayList0.size() > 0) {
                            e0 e01 = BDRichVideoContentView.this.p;
                            if(e01 != null) {
                                e01.a(false);
                            }
                        }
                    }
                    break;
                }
                case 1: {
                    e0 e02 = BDRichVideoContentView.this.p;
                    if(e02 != null) {
                        e02.k();
                    }
                    break;
                }
                case 2: {
                    e0 e03 = BDRichVideoContentView.this.p;
                    if(e03 != null) {
                        e03.n();
                    }
                    break;
                }
                case 3: {
                    k d$k0 = BDRichVideoContentView.this.j;
                    if(d$k0 != null) {
                        d$k0.d();
                    }
                    break;
                }
                case 4: {
                    e0 e04 = BDRichVideoContentView.this.p;
                    if(e04 != null) {
                        e04.a(true);
                    }
                    break;
                }
                case 5: {
                    e0 e05 = BDRichVideoContentView.this.p;
                    if(e05 != null && e05.j()) {
                        BDRichVideoContentView.this.p.k();
                        BDRichVideoContentView.this.t.sendEmptyMessageDelayed(5, 100L);
                    }
                    break;
                }
                case 6: {
                    e0 e06 = BDRichVideoContentView.this.p;
                    if(e06 != null) {
                        e06.a(false);
                    }
                }
            }
            super.handleMessage(message0);
        }
    }

    static class h {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[e.values().length];
            h.b = arr_v;
            try {
                arr_v[e.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                h.b[e.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                h.b[e.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                h.b[e.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[g.values().length];
            h.a = arr_v1;
            try {
                arr_v1[g.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                h.a[g.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                h.a[g.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    com.fsn.cauly.Y.g g;
    int h;
    int i;
    k j;
    Dialog k;
    double l;
    Bitmap m;
    Bitmap n;
    int o;
    e0 p;
    ImageView q;
    ArrayList r;
    ArrayList s;
    Handler t;
    f0 u;

    public BDRichVideoContentView(i0 i00, com.fsn.cauly.blackdragoncore.contents.c.b c$b0) {
        super(i00, c$b0);
        this.l = 1.0;
        this.n = null;
        this.o = -1;
        this.t = new com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.a(this);
    }

    private int A(int v) {
        return this.d.x * v * 1000 / this.h / 1000;
    }

    private int B(int v) {
        return this.d.y * v * 100 / this.i / 100;
    }

    private int C(String s) {
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

    private RelativeLayout D() {
        class com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.c implements View.OnClickListener {
            final k0 a;
            final BDRichVideoContentView b;

            com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.c(k0 k00) {
                this.a = k00;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                BDRichVideoContentView.this.y(this.a.l, this.a.d);
            }
        }


        class com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.d implements View.OnClickListener {
            final BDRichVideoContentView a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                k d$k0 = BDRichVideoContentView.this.j;
                if(d$k0 != null) {
                    d$k0.d();
                }
            }
        }


        class com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.e implements View.OnClickListener {
            final k0 a;
            final BDRichVideoContentView b;

            com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.e(k0 k00) {
                this.a = k00;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                BDRichVideoContentView.this.y(this.a.l, this.a.d);
            }
        }


        class f implements View.OnClickListener {
            final BDRichVideoContentView a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                BDRichVideoContentView.this.z(true);
            }
        }

        RelativeLayout relativeLayout0 = new RelativeLayout(this.a.b);
        j0 j00 = this.b;
        if(j00 != null) {
            ArrayList arrayList0 = j00.L;
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    k0 k00 = (k0)object0;
                    if(TextUtils.isEmpty(k00.a)) {
                    }
                    else if(k00.a.equals("frame")) {
                        this.setBackgroundColor(this.C(k00.b));
                    }
                    else if(k00.a.equals("image")) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(this.A(k00.g), this.B(k00.h));
                        relativeLayout$LayoutParams0.leftMargin = this.A(k00.i);
                        relativeLayout$LayoutParams0.topMargin = this.B(k00.j);
                        ImageView imageView0 = new ImageView(this.a.b);
                        imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
                        if(!TextUtils.isEmpty(k00.e)) {
                            this.x(k00.e, imageView0);
                        }
                        if(!TextUtils.isEmpty(k00.d)) {
                            imageView0.setOnClickListener(new com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.c(this, k00));
                        }
                        relativeLayout0.addView(imageView0, relativeLayout$LayoutParams0);
                    }
                    else if(k00.a.equals("web")) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(this.A(k00.g), this.B(k00.h));
                        relativeLayout$LayoutParams1.leftMargin = this.A(k00.i);
                        relativeLayout$LayoutParams1.topMargin = this.B(k00.j);
                        f0 f00 = new f0(this.a.b);
                        this.u = f00;
                        f00.setHidePackageName(this.a.r.E);
                        this.r.add(this.u);
                        if(!TextUtils.isEmpty(k00.e)) {
                            com.fsn.cauly.blackdragoncore.utils.d.a(this.a, com.fsn.cauly.Y.i0.a.b);
                            int v = this.A(k00.g) <= this.B(k00.h) ? this.A(k00.g) : this.B(k00.h);
                            this.u.setBackgroundColor(0);
                            this.u.b(k00.e, false, true, v * 100 / 720, this.b.k0, this.b.x0);
                        }
                        relativeLayout0.addView(this.u, relativeLayout$LayoutParams1);
                    }
                    else if(k00.a.equals("close")) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(this.A(k00.g), this.B(k00.h));
                        relativeLayout$LayoutParams2.leftMargin = this.A(k00.i);
                        relativeLayout$LayoutParams2.topMargin = this.B(k00.j);
                        ImageView imageView1 = new ImageView(this.a.b);
                        imageView1.setScaleType(ImageView.ScaleType.FIT_XY);
                        if(!TextUtils.isEmpty(k00.e)) {
                            this.x(k00.e, imageView1);
                        }
                        imageView1.setOnClickListener(new com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.d(this));
                        relativeLayout0.addView(imageView1, relativeLayout$LayoutParams2);
                    }
                    else if(k00.a.equals("text")) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                        relativeLayout$LayoutParams3.leftMargin = this.A(k00.i);
                        relativeLayout$LayoutParams3.topMargin = this.B(k00.j);
                        TextView textView0 = new TextView(this.a.b);
                        textView0.setTextColor(this.C(k00.b));
                        textView0.setText("" + k00.c);
                        if(!TextUtils.isEmpty(k00.f) && k00.f.contains("px")) {
                            int v1 = Integer.parseInt(k00.f.replace("px", ""));
                            textView0.setTextSize(((float)this.A(((int)this.a(this.a.b, v1)))));
                        }
                        if(!TextUtils.isEmpty(k00.d)) {
                            textView0.setOnClickListener(new com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.e(this, k00));
                        }
                        relativeLayout0.addView(textView0, relativeLayout$LayoutParams3);
                    }
                    else if(k00.a.equals("video")) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(this.A(k00.g), this.B(k00.h));
                        relativeLayout$LayoutParams4.leftMargin = this.A(k00.i);
                        relativeLayout$LayoutParams4.topMargin = this.B(k00.j);
                        e0 e00 = new e0(this.a.b);
                        e00.setListener(this);
                        this.p = e00;
                        relativeLayout0.addView(e00, relativeLayout$LayoutParams4);
                        if(!TextUtils.isEmpty(k00.e)) {
                            e00.a(k00.e);
                        }
                        e00.a(com.fsn.cauly.Y.e0.h.a);
                        if(!this.b.E) {
                            continue;
                        }
                        e00.a(com.fsn.cauly.Y.e0.h.c);
                    }
                    else if(k00.a.equals("sound")) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(this.A(k00.g), this.B(k00.h));
                        relativeLayout$LayoutParams5.leftMargin = this.A(k00.i);
                        relativeLayout$LayoutParams5.topMargin = this.B(k00.j);
                        ImageView imageView2 = new ImageView(this.a.b);
                        this.q = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                        if(!TextUtils.isEmpty(k00.e)) {
                            this.w(k00.e, 999, imageView2);
                            this.w(k00.k, 998, imageView2);
                        }
                        imageView2.setOnClickListener((/* 缺少LAMBDA参数 */) -> if(BDRichVideoContentView.this.q != null) {
                            e0 e00 = BDRichVideoContentView.this.p;
                            if(e00 != null && BDRichVideoContentView.this.n != null && BDRichVideoContentView.this.m != null) {
                                if(e00.i()) {
                                    if(true) {
                                        BDRichVideoContentView.this.p.a(com.fsn.cauly.Y.e0.h.c);
                                        BDRichVideoContentView.this.q.setImageBitmap(BDRichVideoContentView.this.m);
                                        l.a(BDRichVideoContentView.this.a, BDRichVideoContentView.this.b, "soundbutton_off", null);
                                        return;
                                    }
                                    if(BDRichVideoContentView.this.b.E) {
                                        BDRichVideoContentView.this.q.setImageBitmap(BDRichVideoContentView.this.m);
                                        return;
                                    }
                                    BDRichVideoContentView.this.q.setImageBitmap(BDRichVideoContentView.this.n);
                                    return;
                                }
                                if(true) {
                                    BDRichVideoContentView.this.p.a(com.fsn.cauly.Y.e0.h.b);
                                    BDRichVideoContentView.this.q.setImageBitmap(BDRichVideoContentView.this.n);
                                    l.a(BDRichVideoContentView.this.a, BDRichVideoContentView.this.b, "soundbutton_on", null);
                                    return;
                                }
                                BDRichVideoContentView.this.q.setImageBitmap(BDRichVideoContentView.this.m);
                            }
                        });
                        relativeLayout0.addView(imageView2, relativeLayout$LayoutParams5);
                    }
                }
            }
        }
        for(Object object1: this.r) {
            RichVideoWebInterface bDRichVideoContentView$RichVideoWebInterface0 = new RichVideoWebInterface(this, ((f0)object1));
            this.s.add(bDRichVideoContentView$RichVideoWebInterface0);
            ((f0)object1).addJavascriptInterface(bDRichVideoContentView$RichVideoWebInterface0, "android");
        }
        return relativeLayout0;
    }

    public float a(Context context0, int v) {
        return ((float)v) / context0.getResources().getDisplayMetrics().scaledDensity;
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(int v) {
        this.o = v;
        for(Object object0: this.r) {
            ((f0)object0).loadUrl("javascript:window.video_time(" + v + ")");
        }
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(int v, int v1) {
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(int v, String s) {
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(e e0$e0) {
        String s;
        if(this.b == null) {
            return;
        }
        switch(e0$e0) {
            case 1: {
                s = "video_prev";
                break;
            }
            case 2: {
                s = "video_play";
                break;
            }
            case 3: {
                s = "video_pause";
                break;
            }
            case 4: {
                s = "video_next";
                break;
            }
            default: {
                s = "";
            }
        }
        l.a(this.a, this.b, s, null);
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(g e0$g0) {
        class com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.g implements Runnable {
            final BDRichVideoContentView a;

            @Override
            public void run() {
                e0 e00 = BDRichVideoContentView.this.p;
                if(e00 != null) {
                    e00.a(false);
                }
            }
        }

        if(this.b == null) {
            return;
        }
        switch(e0$g0) {
            case 1: {
                this.t.post(new com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.g(this));
                return;
            }
            case 2: {
                this.h();
            }
        }
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        switch(s00.getTag()) {
            case 999: {
                ((com.fsn.cauly.Y.g)s00).l();
                this.m = ((com.fsn.cauly.Y.g)s00).j();
                this.z(false);
                return;
            }
            case 1000: {
                ((com.fsn.cauly.Y.g)s00).l();
                return;
            }
            default: {
                this.n = ((com.fsn.cauly.Y.g)s00).j();
                this.z(false);
            }
        }
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void d() {
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
        ArrayList arrayList0 = this.b.L;
        if(arrayList0 != null) {
            com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Start Native content");
            this.r = new ArrayList();
            if(!this.b.k0) {
                this.setLayerType(1, null);
            }
            if(this.b.k0 && m0.l(this.a.b)) {
                this.setLayerType(2, null);
            }
            this.s = new ArrayList();
            this.l = com.fsn.cauly.blackdragoncore.utils.d.a(this.a.b) > com.fsn.cauly.blackdragoncore.utils.d.c(this.a.b) ? ((double)com.fsn.cauly.blackdragoncore.utils.d.a(this.a.b)) / 1280.0 : ((double)com.fsn.cauly.blackdragoncore.utils.d.c(this.a.b)) / 1280.0;
            k0 k00 = this.t(arrayList0);
            this.h = k00.g;
            this.i = k00.h;
            this.addView(this.D(), new LinearLayout.LayoutParams(-2, -2));
            this.setGravity(1);
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void q() {
        if(this.b != null && !TextUtils.isEmpty(this.b.h)) {
            j0 j00 = this.b;
            if(j00.L == null) {
                this.b = com.fsn.cauly.Y.d.a(j00, j00.h);
            }
        }
        this.i();
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void s() {
        com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Stop NativeAd content " + this.e);
        com.fsn.cauly.Y.g g0 = this.g;
        if(g0 == null) {
            return;
        }
        g0.cancel();
        this.g = null;
        e0 e00 = this.p;
        if(e00 != null) {
            e00.r();
        }
        Dialog dialog0 = this.k;
        if(dialog0 != null) {
            com.fsn.cauly.blackdragoncore.utils.c.a(dialog0.getWindow().getDecorView());
        }
        f0 f00 = this.u;
        if(f00 != null) {
            f00.destroy();
        }
    }

    public void setNativeAdListener(k d$k0) {
        this.j = d$k0;
    }

    private k0 t(ArrayList arrayList0) {
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

    private void w(String s, int v, ImageView imageView0) {
        if(s != null && s.startsWith("http")) {
            com.fsn.cauly.Y.g g0 = new com.fsn.cauly.Y.g(this.a.b, s, imageView0);
            this.g = g0;
            g0.setTag(v);
            this.g.a(this);
            this.g.execute();
        }
    }

    private void x(String s, ImageView imageView0) {
        this.w(s, 1000, imageView0);
    }

    private void y(String s, String s1) {
        class com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.b implements Runnable {
            final BDRichVideoContentView a;

            @Override
            public void run() {
                BDRichVideoContentView.this.j.d();
            }
        }

        if(TextUtils.isEmpty(s1)) {
            return;
        }
        Matcher matcher0 = Pattern.compile("cauly_action_param=open_browser").matcher(s1);
        if(Pattern.compile("cauly_action_param=open_youtube").matcher(s1).find()) {
            com.fsn.cauly.blackdragoncore.contents.f.b(this.a.b, s1, null);
        }
        else if(matcher0.find()) {
            com.fsn.cauly.blackdragoncore.contents.f.a(this.a.b, this.b, s1, null, this.a.j);
        }
        else if(s1.startsWith("http")) {
            new o0(this.a.b).a(this.a, s1, this.b);
        }
        else {
            com.fsn.cauly.blackdragoncore.contents.f.a(this.a.b, this.b, s1, null, this.a.j);
        }
        l.a(this.a, this.b, s, "play_time=" + this.o);
        e0 e00 = this.p;
        if(e00 != null) {
            e00.k();
        }
        if(this.j != null) {
            new Handler().postDelayed(new com.fsn.cauly.blackdragoncore.contents.BDRichVideoContentView.b(this), 500L);
        }
    }

    // 检测为 Lambda 实现
    private void z(boolean z) [...]
}

