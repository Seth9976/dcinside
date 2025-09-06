package com.fsn.cauly.blackdragoncore.contents;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.LinearLayout.LayoutParams;
import com.fsn.cauly.Y.f0.e;
import com.fsn.cauly.Y.f0;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.j0;
import com.fsn.cauly.Y.l;
import com.fsn.cauly.Y.m0;
import com.fsn.cauly.Y.n0.a;
import com.fsn.cauly.Y.n0;
import com.fsn.cauly.blackdragoncore.d;
import com.fsn.cauly.blackdragoncore.utils.g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class f extends c implements e, a {
    class b {
        final f a;

        private b() {
        }

        b(com.fsn.cauly.blackdragoncore.contents.f.a f$a0) {
        }

        @JavascriptInterface
        public void dismiss() {
            class com.fsn.cauly.blackdragoncore.contents.f.b.a implements Runnable {
                final b a;

                @Override
                public void run() {
                    com.fsn.cauly.blackdragoncore.contents.c.a c$a0 = f.this.c;
                    if(c$a0 != null) {
                        c$a0.e();
                    }
                }
            }

            f.this.k.post(new com.fsn.cauly.blackdragoncore.contents.f.b.a(this));
        }

        @JavascriptInterface
        public void useCustomClose() {
            class com.fsn.cauly.blackdragoncore.contents.f.b.b implements Runnable {
                final b a;

                @Override
                public void run() {
                    com.fsn.cauly.blackdragoncore.contents.c.a c$a0 = f.this.c;
                    if(c$a0 != null) {
                        c$a0.e();
                    }
                }
            }

            f.this.k.post(new com.fsn.cauly.blackdragoncore.contents.f.b.b(this));
        }
    }

    public class com.fsn.cauly.blackdragoncore.contents.f.c {
        final f a;

        @JavascriptInterface
        public void closePopup() {
            class com.fsn.cauly.blackdragoncore.contents.f.c.a implements Runnable {
                final com.fsn.cauly.blackdragoncore.contents.f.c a;

                @Override
                public void run() {
                    com.fsn.cauly.blackdragoncore.contents.c.a c$a0 = f.this.c;
                    if(c$a0 != null) {
                        c$a0.e();
                    }
                }
            }

            f.this.k.post(new com.fsn.cauly.blackdragoncore.contents.f.c.a(this));
        }
    }

    f0 g;
    String h;
    String i;
    boolean j;
    Handler k;
    final int l;
    final int m;
    long n;
    float o;
    float p;
    boolean q;

    public f(i0 i00, com.fsn.cauly.blackdragoncore.contents.c.b c$b0) {
        super(i00, c$b0);
        this.j = false;
        this.k = new Handler();
        this.l = 1000;
        this.m = 15;
    }

    public f(i0 i00, com.fsn.cauly.blackdragoncore.contents.c.b c$b0, j0 j00) {
        super(i00, c$b0);
        this.j = false;
        this.k = new Handler();
        this.l = 1000;
        this.m = 15;
        this.b = j00;
    }

    public static String a(Context context0, String s) {
        try {
            Intent intent0 = new Intent("android.intent.action.MAIN");
            intent0.setPackage(s);
            List list0 = context0.getPackageManager().queryIntentActivities(intent0, 0x40);
            return list0.size() <= 0 ? "" : ((ResolveInfo)list0.get(0)).activityInfo.name;
        }
        catch(Exception unused_ex) {
        }
        return "";
    }

    public static boolean a(Context context0, j0 j00, String s, String s1, String s2) {
        List list0;
        if(context0 != null && s != null && j00 != null) {
            d.a().a(context0, j00);
            if(s.startsWith("intent:")) {
                return f.a(context0, s, s1);
            }
            if(s.startsWith("https://play.google.com/store/apps/details?id=")) {
                s = s.replace("https://play.google.com/store/apps/details?id=", "market://details?id=");
            }
            Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
            if(context0.getPackageManager() != null && (s.startsWith("http") || j00.g.startsWith("embed_tag"))) {
                if(j00.u0 == null || j00.u0.length() <= 1) {
                    list0 = TextUtils.isEmpty(s2) ? f.v(new String[]{"com.android.browser", "com.sec.android.app.sbrowser", "com.android.chrome"}) : f.v(new String[]{s2});
                }
                else {
                    list0 = f.v(j00.u0.split(","));
                }
                if(j00.v0) {
                    Collections.shuffle(list0);
                }
                if(!list0.contains("com.android.browser")) {
                    list0.add("com.android.browser");
                }
                if(!list0.contains("com.sec.android.app.sbrowser")) {
                    list0.add("com.sec.android.app.sbrowser");
                }
                if(!list0.contains("com.android.chrome")) {
                    list0.add("com.android.chrome");
                }
                for(int v = 0; v < list0.size(); ++v) {
                    String s3 = (String)list0.get(v);
                    if(s3 != null && s3.length() > 0) {
                        String s4 = f.a(context0, s3);
                        if(!TextUtils.isEmpty(s4)) {
                            intent0.setClassName(s3, s4);
                            break;
                        }
                    }
                }
            }
            if(com.fsn.cauly.blackdragoncore.e.a().b()) {
                intent0.addFlags(0x34000000);
            }
            else {
                intent0.addFlags(0x10000000);
            }
            intent0.addCategory("android.intent.category.DEFAULT");
            intent0.addCategory("android.intent.category.BROWSABLE");
            intent0.putExtra("com.android.browser.application_id", "com.dcinside.app.android");
            try {
                context0.getApplicationContext().startActivity(intent0);
                if("coververtical".equals(s1) && context0 instanceof Activity) {
                    ((Activity)context0).overridePendingTransition(context0.getResources().getIdentifier("cauly_slide_up", "anim", "com.dcinside.app.android"), 0);
                }
                return true;
            }
            catch(Throwable unused_ex) {
                if(!s.contains("://")) {
                    return false;
                }
                Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                if(com.fsn.cauly.blackdragoncore.e.a().b()) {
                    intent1.addFlags(0x34000000);
                }
                else {
                    intent1.addFlags(0x10000000);
                }
                intent1.addCategory("android.intent.category.DEFAULT");
                intent1.addCategory("android.intent.category.BROWSABLE");
                intent1.putExtra("com.android.browser.application_id", "com.dcinside.app.android");
                context0.getApplicationContext().startActivity(intent1);
            }
        }
        return false;
    }

    public static boolean a(Context context0, String s, String s1) {
        String s8;
        String s5;
        String s4;
        String s2;
        String[] arr_s;
        Intent intent0 = null;
        try {
            arr_s = s.split(";");
            int v = 0;
            s2 = null;
            while(v < arr_s.length) {
                String s3 = arr_s[v];
                if(!s3.startsWith("package=")) {
                    if(s3.startsWith("scheme=")) {
                        s2 = s3.replace("scheme=", "");
                    }
                    ++v;
                    continue;
                }
                s4 = s3.replace("package=", "");
                intent0 = context0.getPackageManager().getLaunchIntentForPackage(s3.replace("package=", ""));
                goto label_17;
            }
        }
        catch(Exception unused_ex) {
            s5 = null;
            goto label_41;
        }
        s4 = null;
        try {
        label_17:
            int v1 = 0;
            while(true) {
                if(v1 >= arr_s.length) {
                    goto label_51;
                }
                String s6 = arr_s[v1];
                if(s6.startsWith("intent:")) {
                    if(!TextUtils.isEmpty(s2)) {
                        String s7 = s.replace("intent://", s2 + "://");
                        Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(s7));
                        if(s7.startsWith("market://details?id=")) {
                            intent1.setPackage("com.android.vending");
                        }
                        context0.startActivity(intent1);
                        return true;
                    }
                    s8 = s2;
                    intent0.setData(Uri.parse(s6));
                }
                else {
                    s8 = s2;
                    if(s6.startsWith("action=")) {
                        intent0.setAction(s6.replace("action=", ""));
                    }
                    else if(s6.startsWith("category=")) {
                        intent0.setAction(s6.replace("category=", ""));
                    }
                }
                ++v1;
                s2 = s8;
            }
        }
        catch(Exception unused_ex) {
            s5 = s4;
        }
    label_41:
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.addCategory("android.intent.category.DEFAULT");
        intent2.setData(Uri.parse(("market://details?id=" + s5)));
        intent2.addFlags(0x10000000);
        try {
            intent2.setPackage("com.android.vending");
            context0.startActivity(intent2);
            if(context0 instanceof Activity) {
                ((Activity)context0).overridePendingTransition(context0.getResources().getIdentifier("cauly_slide_up", "anim", "com.dcinside.app.android"), 0);
            }
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
        try {
        label_51:
            intent0.setPackage("com.android.vending");
            context0.getApplicationContext().startActivity(intent0);
            if("coververtical".equals(s1) && context0 instanceof Activity) {
                ((Activity)context0).overridePendingTransition(context0.getResources().getIdentifier("cauly_slide_up", "anim", "com.dcinside.app.android"), 0);
            }
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    @Override  // com.fsn.cauly.Y.n0$a
    public void a(n0 n00, boolean z) {
    }

    public void a(String s, boolean z, boolean z1) {
        this.i = "coververtical";
        f0 f00 = new f0(this.a.b);
        this.g = f00;
        f00.setHidePackageName(this.a.r.E);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
        this.g.setListener(this);
        this.addView(this.g, linearLayout$LayoutParams0);
        this.h = s;
        this.g.b(s, false, false, -1, z, z1);
    }

    @Override  // com.fsn.cauly.Y.f0$e
    public boolean a(String s) {
        boolean z = f.b(this.a.b, s, this.i);
        this.f();
        return z;
    }

    public static boolean b(Context context0, String s) {
        try {
            Uri.parse(s);
            Intent intent0 = new Intent();
            intent0.setAction("android.intent.action.VIEW");
            intent0.setData(Uri.parse(s));
            intent0.setFlags(0x10000000);
            context0.getApplicationContext().startActivity(intent0);
        }
        catch(Exception exception0) {
            g.a(com.fsn.cauly.blackdragoncore.utils.g.b.b, exception0.getMessage());
        }
        return false;
    }

    public static boolean b(Context context0, String s, String s1) {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(Uri.parse(s));
        if(com.fsn.cauly.blackdragoncore.e.a().b()) {
            intent0.addFlags(0x34000000);
        }
        else {
            intent0.setFlags(0x10200000);
        }
        intent0.setClassName("com.google.android.youtube", f.a(context0, "com.google.android.youtube"));
        try {
            context0.getApplicationContext().startActivity(intent0);
            if("coververtical".equals(s1) && context0 instanceof Activity) {
                ((Activity)context0).overridePendingTransition(context0.getResources().getIdentifier("cauly_slide_up", "anim", "com.dcinside.app.android"), 0);
                return true;
            }
            return true;
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            return false;
        }
    }

    @Override  // com.fsn.cauly.Y.f0$e
    public void b(int v, String s) {
        this.c(v, s);
    }

    @Override  // com.fsn.cauly.Y.f0$e
    public void b(String s) {
        this.f();
    }

    public static boolean c(Context context0, String s) {
        try {
            Uri uri0 = Uri.parse(s);
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setDataAndType(uri0, "video/*");
            intent0.setFlags(0x10000000);
            context0.getApplicationContext().startActivity(intent0);
            return true;
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    // 去混淆评级： 低(40)
    @Override  // com.fsn.cauly.Y.f0$e
    public boolean c() {
        return this.b != null && this.b.s0 && ("embed_html5".equalsIgnoreCase(this.b.g) || "embed_tag".equalsIgnoreCase(this.b.g)) && this.b.h0;
    }

    @Override  // com.fsn.cauly.Y.f0$e
    public boolean c(String s) {
        String s2;
        String s1 = "";
        boolean z = false;
        if(this.b != null && !s.equals(this.h)) {
            try {
                s2 = URLEncoder.encode(s, "UTF-8");
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                unsupportedEncodingException0.printStackTrace();
                s2 = "";
            }
            if(("embed_html5".equalsIgnoreCase(this.b.g) || "embed_tag".equalsIgnoreCase(this.b.g)) && !this.j && this.b.h0) {
                try {
                    s1 = URLEncoder.encode(("" + this.b.e), "UTF-8");
                }
                catch(UnsupportedEncodingException unsupportedEncodingException1) {
                    unsupportedEncodingException1.printStackTrace();
                }
                this.j = true;
                l.a(this.a, this.b, null, "click_action_param1=" + s1);
                String s3 = this.w(s);
                if(!this.b.h.contains("&cauly_use_browser=n") && !this.b.l.equalsIgnoreCase("fullsite") || this.b.g.equalsIgnoreCase("embed_tag")) {
                    f.a(this.a.b, this.b, s3, this.i, this.a.j);
                    z = true;
                }
                this.f();
                if(this.b.T) {
                    this.g();
                }
            }
            d.a().a(this.getContext(), this.b);
            l.a(this.a, this.b, null, "click_action_param1=" + s2);
        }
        return z;
    }

    @Override  // com.fsn.cauly.Y.f0$e
    public boolean d(String s) {
        String s1 = "";
        if(!this.b.h.contains("&cauly_use_browser=n")) {
            if(this.b != null && this.a != null) {
                try {
                    s1 = URLEncoder.encode(("" + this.b.e), "UTF-8");
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    unsupportedEncodingException0.printStackTrace();
                }
                l.a(this.a, this.b, null, "click_action_param1=" + s1);
                String s2 = this.w(s);
                f.a(this.a.b, this.b, s2, this.i, this.a.j);
                this.f();
            }
            return true;
        }
        return false;
    }

    @Override  // com.fsn.cauly.Y.f0$e
    public void e() {
        this.i();
    }

    @Override  // com.fsn.cauly.Y.f0$e
    public boolean e(String s) {
        boolean z;
        if(s == null || !s.startsWith("intent:")) {
            z = f.a(this.a.b, this.b, s, this.i, this.a.j);
        }
        else {
            f.a(this.a.b, s, this.i);
            z = true;
        }
        this.f();
        return z;
    }

    @Override  // com.fsn.cauly.Y.f0$e
    public boolean f(String s) {
        boolean z = f.b(this.a.b, s);
        this.f();
        return z;
    }

    @Override  // com.fsn.cauly.Y.f0$e
    public boolean g(String s) {
        boolean z = f.c(this.a.b, s);
        this.f();
        return z;
    }

    public f0 getWebView() {
        return this.g;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean j() {
        f0 f00 = this.g;
        if(f00 == null) {
            return false;
        }
        if(this.b.G) {
            return false;
        }
        if(f00.canGoBack()) {
            this.g.goBack();
            return true;
        }
        return false;
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
    @SuppressLint({"JavascriptInterface"})
    protected void q() {
        boolean z1;
        int v2;
        int v4;
        g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Start web content");
        if(this.g != null) {
            return;
        }
        this.i = this.b.v;
        f0 f00 = new f0(this.a.b);
        this.g = f00;
        f00.setHidePackageName(this.a.r.E);
        if(this.b.f.equalsIgnoreCase("popup")) {
            this.g.setBackgroundColor(0);
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
        this.g.setListener(this);
        this.addView(this.g, linearLayout$LayoutParams0);
        if(!this.b.k0) {
            this.setLayerType(1, null);
        }
        if(this.b.k0 && m0.l(this.a.b)) {
            this.setLayerType(2, null);
        }
        boolean z = "Y".equals(this.b.w);
        if(this.e != com.fsn.cauly.blackdragoncore.contents.c.b.a) {
            if(this.b.B > 0) {
                Point point1 = com.fsn.cauly.blackdragoncore.utils.d.a(this.a, com.fsn.cauly.Y.i0.a.b);
                int v3 = point1.x;
                if(this.b.A.equalsIgnoreCase("portrait_fix")) {
                    v3 = point1.x;
                    v4 = point1.y;
                    if(v3 <= v4) {
                        v4 = v3;
                    }
                }
                else if(this.b.A.equalsIgnoreCase("landscape_fix")) {
                    v3 = point1.x;
                    v4 = point1.y;
                    if(v3 > v4) {
                        v4 = v3;
                    }
                }
                else {
                    v4 = v3;
                }
                v2 = v4 * 100 / this.b.B;
                z1 = false;
            }
            else {
                z1 = false;
                v2 = -1;
            }
        }
        else if(this.b.B > 0 && this.b.C > 0) {
            Point point0 = com.fsn.cauly.blackdragoncore.utils.d.a(this.a, com.fsn.cauly.Y.i0.a.a);
            j0 j00 = this.b;
            int v = point0.x * 100 / j00.B;
            int v1 = point0.y * 100 / j00.C;
            v2 = v >= v1 ? v1 : v;
            z1 = true;
        }
        else {
            z1 = true;
            v2 = -1;
        }
        g.a(com.fsn.cauly.blackdragoncore.utils.g.b.f, "Set webview initial scale to   " + v2 + " for " + this.b.B + "x" + this.b.C + "  " + com.fsn.cauly.blackdragoncore.utils.d.a(this.a, com.fsn.cauly.Y.i0.a.b).x);
        this.h = this.e == com.fsn.cauly.blackdragoncore.contents.c.b.c ? this.b.e : this.b.h;
        if(("embed_tag".equalsIgnoreCase(this.b.g) || "embed_html5".equalsIgnoreCase(this.b.g)) && this.b.o0) {
            com.fsn.cauly.blackdragoncore.contents.f.c f$c0 = new com.fsn.cauly.blackdragoncore.contents.f.c(this);
            this.g.addJavascriptInterface(f$c0, "android");
        }
        if(this.b.H) {
            b f$b0 = new b(this, null);
            this.g.addJavascriptInterface(f$b0, "android");
        }
        this.g.b(this.h, z1, z, v2, this.b.k0, this.b.x0);
        if(this.b != null && this.b.q0) {
            this.x();
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void s() {
        g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Stop web content");
        if(this.g == null) {
            return;
        }
        this.removeAllViews();
        this.g.destroy();
        this.g = null;
    }

    private int t(float f, float f1, float f2, float f3) {
        return (int)Math.sqrt(Math.pow(f - f2, 2.0) + Math.pow(f1 - f3, 2.0));
    }

    static List v(String[] arr_s) {
        List list0 = new ArrayList();
        if(arr_s == null) {
            return list0;
        }
        for(int v = 0; v < arr_s.length; ++v) {
            list0.add(arr_s[v]);
        }
        return list0;
    }

    private String w(String s) {
        if(s.startsWith("intent:")) {
            return s;
        }
        if(s.startsWith("http")) {
            return s;
        }
        if(s.startsWith("intent:")) {
            return s;
        }
        int v = s.indexOf("://");
        return "intent://" + s.substring(v + 3) + "#Intent;scheme=" + s.substring(0, v);
    }

    private void x() {
        class com.fsn.cauly.blackdragoncore.contents.f.a implements View.OnTouchListener {
            final f a;

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                try {
                    int v = motionEvent0.getAction();
                    switch(v) {
                        case 0: {
                            f.this.n = System.currentTimeMillis();
                            f.this.o = motionEvent0.getX();
                            f.this.p = motionEvent0.getY();
                            f.this.q = true;
                            return false;
                        label_8:
                            if(v == 2 && (f.this.q && f.this.t(f.this.o, f.this.p, motionEvent0.getX(), motionEvent0.getY()) > 15)) {
                                f.this.q = false;
                                return false;
                            }
                            break;
                        }
                        case 1: {
                            f f0 = f.this;
                            if(System.currentTimeMillis() - f0.n < 1000L && f0.q) {
                                f0.onClick(f0);
                                return false;
                            }
                            break;
                        }
                        default: {
                            goto label_8;
                        }
                    }
                }
                catch(Exception unused_ex) {
                }
                return false;
            }
        }

        f0 f00 = this.g;
        if(f00 != null) {
            f00.setOnTouchListener(new com.fsn.cauly.blackdragoncore.contents.f.a(this));
        }
    }
}

