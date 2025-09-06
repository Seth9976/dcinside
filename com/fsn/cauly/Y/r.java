package com.fsn.cauly.Y;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo.DisplayNameComparator;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.fsn.cauly.blackdragoncore.contents.c;
import com.fsn.cauly.blackdragoncore.contents.f;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.fsn.cauly.blackdragoncore.utils.i;
import com.fsn.cauly.blackdragoncore.utils.k;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class r extends q implements Animation.AnimationListener, a {
    static class d {
        static final int[] a;

        static {
            int[] arr_v = new int[com.fsn.cauly.Y.i0.d.values().length];
            d.a = arr_v;
            try {
                arr_v[com.fsn.cauly.Y.i0.d.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                d.a[com.fsn.cauly.Y.i0.d.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                d.a[com.fsn.cauly.Y.i0.d.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                d.a[com.fsn.cauly.Y.i0.d.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                d.a[com.fsn.cauly.Y.i0.d.f.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                d.a[com.fsn.cauly.Y.i0.d.g.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    j0 e;
    int f;
    float g;
    float h;
    ImageView i;
    Bitmap j;
    o0 k;
    long l;

    public r(i0 i00) {
        super(i00);
        this.l = 0L;
        g.a(b.e, "Created banner container");
    }

    public static void a(i0 i00, j0 j00, int v) {
        String s1;
        boolean z = false;
        if(i00 != null) {
            com.fsn.cauly.blackdragoncore.d.a().a(i00.b, j00);
        }
        String s = j00.j;
        if(!TextUtils.isEmpty(j00.x)) {
            if(j00.x.startsWith("intent:") && f.a(i00.b, j00.x, null)) {
                l.a(i00, j00, null, "click_level=" + v);
                l.a(i00, j00, "app_running", null);
                return;
            }
            if(j00.x.contains("://")) {
                try {
                    Intent intent0 = new Intent();
                    intent0.setAction("android.intent.action.VIEW");
                    intent0.setData(Uri.parse(j00.x));
                    i00.b.startActivity(intent0);
                    l.a(i00, j00, null, "click_level=" + v);
                    l.a(i00, j00, "app_running", null);
                    return;
                }
                catch(Exception unused_ex) {
                }
            }
        }
        if("2".equals(s)) {
            if(TextUtils.isEmpty(j00.x)) {
                s1 = j00.e;
            }
            else {
                s1 = j00.x.contains("://") ? j00.e : j00.x;
            }
            if(s1 != null && s1.length() != 0) {
                PackageManager packageManager0 = i00.b.getPackageManager();
                Intent intent1 = new Intent("android.intent.action.MAIN", null);
                intent1.addCategory("android.intent.category.LAUNCHER");
                List list0 = packageManager0.queryIntentActivities(intent1, 0);
                Collections.sort(list0, new ResolveInfo.DisplayNameComparator(packageManager0));
                int v1;
                for(v1 = 0; true; ++v1) {
                    if(v1 >= list0.size()) {
                        v1 = 0;
                        break;
                    }
                    if(((ResolveInfo)list0.get(v1)).activityInfo.applicationInfo.packageName.toString().equals(s1)) {
                        z = true;
                        break;
                    }
                }
                if(z && !TextUtils.isEmpty(j00.x)) {
                    l.a(i00, j00, null, "click_level=" + v);
                    l.a(i00, j00, "app_running", null);
                    Intent intent2 = new Intent();
                    intent2.setAction("android.intent.action.MAIN");
                    intent2.addCategory("android.intent.category.LAUNCHER");
                    intent2.setFlags(0x10200000);
                    intent2.setComponent(new ComponentName(((ResolveInfo)list0.get(v1)).activityInfo.applicationInfo.packageName, ((ResolveInfo)list0.get(v1)).activityInfo.name));
                    i00.b.startActivity(intent2);
                    return;
                }
                r.j(s1, j00, i00, v);
                return;
            }
            r.j(j00.e, j00, i00, v);
            return;
        }
        if("4".equals(s)) {
            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse((j00.e.startsWith("tstore://") || j00.e.startsWith("http://") ? j00.e : String.format("tstore://PRODUCT_VIEW/%s/0", j00.e))));
            intent3.addFlags(0x10000000);
            try {
                l.a(i00, j00, null, "click_level=" + v);
                if(!"2".equals(j00.q)) {
                    l.a(i00, j00, "app_download_page", null);
                    i00.b.getApplicationContext().startActivity(intent3);
                }
                else if(v == 2) {
                    l.a(i00, j00, "app_download_page", null);
                    i00.b.getApplicationContext().startActivity(intent3);
                }
                if("coververtical".equals(j00.v)) {
                    Context context0 = i00.b;
                    if(context0 instanceof Activity) {
                        ((Activity)context0).overridePendingTransition(context0.getResources().getIdentifier("cauly_slide_up", "anim", "com.dcinside.app.android"), 0);
                    }
                }
            }
            catch(Exception unused_ex) {
                g.a(b.e, "click App AD CPC");
            }
        }
    }

    void a(Context context0) {
        o0 o00 = new o0(context0);
        this.k = o00;
        o00.a(this);
        this.k.a(this.a, this.e, this.f);
        l.a(this.a, this.e, null, "click_level=" + this.f);
    }

    @Override  // com.fsn.cauly.Y.n0$a
    public void a(n0 n00, boolean z) {
        if(!z) {
            l.a(this.a, this.e, "back", null);
        }
        else if(this.e != null && this.e.l.equalsIgnoreCase("video")) {
            l.a(this.a, this.e, "video_x", null);
        }
        else {
            l.a(this.a, this.e, "landing_x", null);
        }
        this.k = null;
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(c c0, j0 j00) {
        class com.fsn.cauly.Y.r.a implements Runnable {
            final RelativeLayout a;
            final c b;
            final r c;

            com.fsn.cauly.Y.r.a(RelativeLayout relativeLayout0, c c0) {
                this.a = relativeLayout0;
                this.b = c0;
                super();
            }

            @Override
            public void run() {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, r.this.f().y);
                this.a.addView(this.b, relativeLayout$LayoutParams0);
            }
        }

        i0 i00 = this.a;
        if(i00.c == null) {
            return;
        }
        RelativeLayout relativeLayout0 = (RelativeLayout)i00.a();
        if(relativeLayout0 != null) {
            Context context0 = this.a.b;
            if(context0 instanceof Activity) {
                ((Activity)context0).runOnUiThread(new com.fsn.cauly.Y.r.a(this, relativeLayout0, c0));
            }
            else {
                relativeLayout0.addView(c0, new RelativeLayout.LayoutParams(-1, this.f().y));
            }
            this.l = System.currentTimeMillis();
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(c c0, c c1) {
        class com.fsn.cauly.Y.r.b implements Runnable {
            final RelativeLayout a;
            final r b;

            com.fsn.cauly.Y.r.b(RelativeLayout relativeLayout0) {
                this.a = relativeLayout0;
                super();
            }

            @Override
            public void run() {
                ImageView imageView0 = r.this.i;
                if(imageView0 != null) {
                    this.a.addView(imageView0);
                }
            }
        }


        class com.fsn.cauly.Y.r.c implements Runnable {
            final RelativeLayout a;
            final r b;

            com.fsn.cauly.Y.r.c(RelativeLayout relativeLayout0) {
                this.a = relativeLayout0;
                super();
            }

            @Override
            public void run() {
                ImageView imageView0 = r.this.i;
                if(imageView0 != null) {
                    this.a.addView(imageView0);
                }
            }
        }

        try {
            i0 i00 = this.a;
            if(i00.l == com.fsn.cauly.Y.i0.d.a) {
                if(c1 != null) {
                    i.a(i00, c1.getAdItem());
                }
                return;
            }
            if(c0 != null && c0.getWidth() > 0 && c0.getHeight() > 0) {
                RelativeLayout relativeLayout0 = (RelativeLayout)this.a.a();
                if(relativeLayout0 == null) {
                    return;
                }
                if(this.i == null) {
                    ImageView imageView0 = new ImageView(this.a.b);
                    this.i = imageView0;
                    imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
                    this.i.setVisibility(8);
                    Context context0 = this.a.b;
                    if(context0 instanceof Activity) {
                        ((Activity)context0).runOnUiThread(new com.fsn.cauly.Y.r.b(this, relativeLayout0));
                    }
                    else {
                        new Handler().post(new com.fsn.cauly.Y.r.c(this, relativeLayout0));
                    }
                }
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(c0.getWidth(), c0.getHeight());
                this.i.setLayoutParams(relativeLayout$LayoutParams0);
                Animation animation0 = this.q();
                if(animation0 != null) {
                    if(this.j != null && this.j.getWidth() != c0.getWidth()) {
                        this.h();
                    }
                    if(this.j == null) {
                        Bitmap bitmap0 = Bitmap.createBitmap(c0.getWidth(), c0.getHeight(), Bitmap.Config.ARGB_8888);
                        this.j = bitmap0;
                        this.i.setImageBitmap(bitmap0);
                    }
                    if(!com.fsn.cauly.blackdragoncore.utils.f.a(c0, this.j)) {
                        return;
                    }
                    this.i.setVisibility(0);
                    this.i.bringToFront();
                    animation0.setFillAfter(true);
                    animation0.setDuration(500L);
                    this.i.startAnimation(animation0);
                }
            }
            else if(c1 != null && !(c1 instanceof com.fsn.cauly.blackdragoncore.contents.g)) {
                c1.setBackgroundColor(0);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected void b(c c0, MotionEvent motionEvent0) {
        try {
            c c1 = this.b;
            if(c1 == null) {
                return;
            }
            j0 j00 = c1.getAdItem();
            this.e = j00;
            if(j00.q0) {
                return;
            }
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.g = motionEvent0.getY();
                    this.h = motionEvent0.getX();
                    j0 j01 = c0.getAdItem();
                    if(j01 != null) {
                        int v = j01.u * 4;
                        int v1 = j01.u * 3;
                        if(motionEvent0.getX() < ((float)v) || motionEvent0.getX() >= ((float)(c0.getWidth() - v)) || motionEvent0.getY() < ((float)v1) || motionEvent0.getY() >= ((float)(c0.getHeight() - v1))) {
                            this.g = -10000.0f;
                        }
                    }
                    return;
                }
                case 1: {
                    if(this.g == -10000.0f || com.fsn.cauly.blackdragoncore.c.b().a(this.a, c0.getAdItem(), true)) {
                        return;
                    }
                    float f = motionEvent0.getY();
                    float f1 = motionEvent0.getX();
                    int v2 = (int)Math.abs(this.g - f);
                    int v3 = (int)Math.abs(this.h - f1);
                    float f2 = (float)Float.valueOf(this.e.t);
                    float f3 = (float)Float.valueOf(this.e.r0);
                    if(((float)v2) > ((float)c0.getHeight()) * f2) {
                        this.f = 1;
                    }
                    else {
                        this.f = 2;
                        if(f3 > -1.0f && ((float)v3) > ((float)c0.getHeight()) * f3) {
                            this.f = 1;
                        }
                    }
                    this.i(c0, v3, v2);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void c() {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void c(c c0) {
        if(this.a.l == com.fsn.cauly.Y.i0.d.a) {
            return;
        }
        if(c0 == null) {
            return;
        }
        Animation animation0 = this.p();
        if(animation0 != null) {
            if(this.a.l == com.fsn.cauly.Y.i0.d.g) {
                animation0.setDuration(1000L);
            }
            else {
                animation0.setDuration(500L);
            }
            animation0.setAnimationListener(this);
            c0.startAnimation(animation0);
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected void d(c c0) {
        c c1 = this.b;
        if(c1 == null) {
            return;
        }
        j0 j00 = c1.getAdItem();
        this.e = j00;
        if(!j00.q0) {
            return;
        }
        if(com.fsn.cauly.blackdragoncore.c.b().a(this.a, c0.getAdItem(), true)) {
            return;
        }
        this.n(c0);
        this.i(c0, 0, 0);
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void e() {
        Context context0 = this.a.b;
        if(context0 != null && !(context0 instanceof Activity)) {
            this.h();
        }
        o0 o00 = this.k;
        if(o00 != null) {
            o00.dismiss();
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected void e(c c0) {
        i0 i00 = this.a;
        if(i00.c == null) {
            return;
        }
        RelativeLayout relativeLayout0 = (RelativeLayout)i00.a();
        if(relativeLayout0 != null) {
            relativeLayout0.removeView(c0);
            com.fsn.cauly.blackdragoncore.utils.c.a(c0);
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected Point f() {
        return com.fsn.cauly.blackdragoncore.utils.d.a(this.a, com.fsn.cauly.Y.i0.a.a);
    }

    @Override  // com.fsn.cauly.Y.q
    public void g() {
        g.a(b.e, "Stopped banner container");
        this.e = null;
        this.h();
        if(this.i != null) {
            ViewGroup viewGroup0 = (ViewGroup)this.a.a();
            com.fsn.cauly.blackdragoncore.utils.c.a(this.i);
            if(viewGroup0 != null) {
                viewGroup0.removeView(this.i);
            }
            this.i = null;
        }
        super.g();
    }

    void h() {
        if(this.j != null) {
            this.i.setImageBitmap(null);
            this.j.recycle();
            this.j = null;
        }
    }

    void h(int v, int v1, j0 j00) {
        i0 i00 = this.a;
        if(i00 != null && j00 != null && (i00.r != null && i00.r.z)) {
            p.a(i00, "click", "swipe", ((int)com.fsn.cauly.blackdragoncore.utils.d.a(this.a.b, v)) + "", ((int)com.fsn.cauly.blackdragoncore.utils.d.a(this.a.b, v1)) + "", "&ad_cd=" + j00.a);
        }
    }

    private void i(c c0, int v, int v1) {
        if(!this.k(this.e, this.f)) {
            this.h(v, v1, this.e);
            return;
        }
        if(!this.l(this.e)) {
            this.m(this.e);
            return;
        }
        String s = this.e.g;
        if(s != null && (s.startsWith("embed_html5") || this.e.g.startsWith("embed_tag"))) {
            this.e.h0 = true;
            return;
        }
        Context context0 = this.b.getCurrentContext();
        String s1 = this.e.l;
        com.fsn.cauly.Y.q.a q$a0 = this.d;
        if(q$a0 != null) {
            q$a0.onClickAd();
        }
        if(TextUtils.isEmpty(this.a.j)) {
            String s2 = this.e.u0;
            if(s2 == null || s2.length() <= 1) {
                if("site".equals(s1)) {
                    this.r();
                    return;
                }
                if("call".equals(s1)) {
                    return;
                }
                if("app".equals(s1)) {
                    r.a(this.a, this.e, this.f);
                    return;
                }
                try {
                    if(m0.a(this.a.b) && this.e.l0) {
                        com.fsn.cauly.blackdragoncore.c.b().a("landing", this.a, this.e, c0, this);
                        Intent intent0 = new Intent();
                        intent0.setClassName(this.a.b, "com.fsn.cauly.blackdragoncore.LandingActivity");
                        this.a.b.startActivity(intent0);
                        l.a(this.a, this.e, null, "click_level=" + this.f);
                        return;
                    }
                    this.a(context0);
                }
                catch(Exception unused_ex) {
                    this.a(context0);
                }
                return;
            }
        }
        this.r();
    }

    static void j(String s, j0 j00, i0 i00, int v) {
        if(s != null && !s.startsWith("http")) {
            s = String.format(("market://details?id=" + s));
        }
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
        intent0.addFlags(0x10000000);
        try {
            l.a(i00, j00, null, null);
            if(!"2".equals(j00.q)) {
                l.a(i00, j00, "app_download_page", null);
                i00.b.getApplicationContext().startActivity(intent0);
            }
            else if(v == 2) {
                l.a(i00, j00, "app_download_page", null);
                i00.b.getApplicationContext().startActivity(intent0);
            }
            if("coververtical".equals(j00.v)) {
                Context context0 = i00.b;
                if(context0 instanceof Activity) {
                    ((Activity)context0).overridePendingTransition(context0.getResources().getIdentifier("cauly_slide_up", "anim", "com.dcinside.app.android"), 0);
                }
            }
        }
        catch(Exception unused_ex) {
            g.a(b.e, "click App AD CPC");
        }
    }

    boolean k(j0 j00, int v) {
        return "2".equals(j00.q) ? v == 2 : true;
    }

    boolean l(j0 j00) {
        return j00.t0 <= 0.0f || j00.t0 * 1000.0f <= ((float)(((int)(System.currentTimeMillis() - this.l))));
    }

    void m(j0 j00) {
        i0 i00 = this.a;
        if(i00 != null && j00 != null && (i00.r != null && i00.r.z)) {
            p.a(i00, "click", "abuse", "", "", "&ad_cd=" + j00.a);
        }
    }

    private void n(c c0) {
        this.f = 2;
    }

    private boolean o(c c0) [...] // Inlined contents

    @Override  // android.view.animation.Animation$AnimationListener
    public void onAnimationEnd(Animation animation0) {
        ImageView imageView0 = this.i;
        if(imageView0 != null) {
            imageView0.clearAnimation();
            this.i.setVisibility(8);
        }
        c c0 = this.b;
        if(c0 != null) {
            i.a(this.a, c0.getAdItem());
        }
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public void onAnimationRepeat(Animation animation0) {
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public void onAnimationStart(Animation animation0) {
    }

    Animation p() {
        Point point0 = this.f();
        int v = point0.x;
        int v1 = point0.y;
        switch(this.a.l) {
            case 1: {
                return new TranslateAnimation(((float)v), 0.0f, 0.0f, 0.0f);
            }
            case 2: {
                return new TranslateAnimation(((float)(-v)), 0.0f, 0.0f, 0.0f);
            }
            case 3: {
                return new TranslateAnimation(0.0f, 0.0f, ((float)v1), 0.0f);
            }
            case 4: {
                return new TranslateAnimation(0.0f, 0.0f, ((float)(-v1)), 0.0f);
            }
            case 5: {
                return new AlphaAnimation(0.0f, 1.0f);
            }
            case 6: {
                return new k(0.0f, 359.899994f, ((float)(v / 2)), 0.0f, 0.0f, false);
            }
            default: {
                return null;
            }
        }
    }

    Animation q() {
        Point point0 = this.f();
        int v = point0.x;
        int v1 = point0.y;
        switch(this.a.l) {
            case 1: {
                return new TranslateAnimation(0.0f, ((float)(-v)), 0.0f, 0.0f);
            }
            case 2: {
                return new TranslateAnimation(0.0f, ((float)v), 0.0f, 0.0f);
            }
            case 3: {
                return new TranslateAnimation(0.0f, 0.0f, 0.0f, ((float)(-v1)));
            }
            case 4: {
                return new TranslateAnimation(0.0f, 0.0f, 0.0f, ((float)v1));
            }
            case 5: {
                return new AlphaAnimation(1.0f, 0.0f);
            }
            default: {
                return null;
            }
        }
    }

    void r() {
        String s = this.e.e;
        if(Pattern.compile("cauly_action_param=open_youtube").matcher(s).find()) {
            f.b(this.a.b, s, this.e.v);
            return;
        }
        f.a(this.a.b, this.e, s, this.e.v, this.a.j);
        l.a(this.a, this.e, null, "click_level=" + this.f);
    }
}

