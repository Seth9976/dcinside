package com.fsn.cauly.blackdragoncore.contents;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo.DisplayNameComparator;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.fsn.cauly.R.drawable;
import com.fsn.cauly.Y.e0.d;
import com.fsn.cauly.Y.e0.e;
import com.fsn.cauly.Y.e0.g;
import com.fsn.cauly.Y.e0;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.l;
import com.fsn.cauly.Y.m0;
import com.fsn.cauly.Y.o0;
import com.fsn.cauly.Y.s0.a;
import com.fsn.cauly.Y.s0;
import com.fsn.cauly.Y.u0;
import com.fsn.cauly.Y.v0;
import com.fsn.cauly.blackdragoncore.utils.f;
import com.fsn.cauly.blackdragoncore.utils.m;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class h extends c implements View.OnClickListener, d, a {
    static class com.fsn.cauly.blackdragoncore.contents.h.c {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[e.values().length];
            com.fsn.cauly.blackdragoncore.contents.h.c.b = arr_v;
            try {
                arr_v[e.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fsn.cauly.blackdragoncore.contents.h.c.b[e.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fsn.cauly.blackdragoncore.contents.h.c.b[e.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fsn.cauly.blackdragoncore.contents.h.c.b[e.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[g.values().length];
            com.fsn.cauly.blackdragoncore.contents.h.c.a = arr_v1;
            try {
                arr_v1[g.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fsn.cauly.blackdragoncore.contents.h.c.a[g.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fsn.cauly.blackdragoncore.contents.h.c.a[g.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    class com.fsn.cauly.blackdragoncore.contents.h.d extends v0 {
        final h s;

        @Override  // com.fsn.cauly.Y.v0
        public void c() {
            Bitmap bitmap2;
            h h0 = h.this;
            if(h0.b != null && h0.b.I != null) {
                h0.l = m.a(h0.getCurrentContext(), "sound_off_btn.png");
                h.this.m = m.a(h.this.getCurrentContext(), "sound_on_btn.png");
                h h1 = h.this;
                Bitmap bitmap0 = h1.l;
                if(bitmap0 != null) {
                    h1.l = f.a(bitmap0, f.a(h1.a.b, bitmap0.getWidth()), f.a(h.this.a.b, h.this.l.getHeight()), true);
                }
                h h2 = h.this;
                Bitmap bitmap1 = h2.m;
                if(bitmap1 != null) {
                    h2.m = f.a(bitmap1, f.a(h2.a.b, bitmap1.getWidth()), f.a(h.this.a.b, h.this.m.getHeight()), true);
                }
                InputStream inputStream0 = m.b(h.this.getCurrentContext(), "control_custom_btn.png");
                if(inputStream0 != null) {
                    h.this.k = Drawable.createFromStream(inputStream0, "control_custom_btn.png");
                    try {
                        inputStream0.close();
                    }
                    catch(IOException iOException0) {
                        iOException0.printStackTrace();
                    }
                }
                String s = h.this.b.I.a;
                String s1 = m0.e(h.this.getContext());
                if(s != null && s.length() > 0 && s.startsWith("http")) {
                    String s2 = m0.a(s, s1);
                    if(u0.a(s, s2, true)) {
                        h.this.h = Drawable.createFromPath(s2);
                    }
                }
                h h3 = h.this;
                com.fsn.cauly.Y.j0.a[] arr_j0$a = h3.b.I.b;
                if(arr_j0$a != null) {
                    h3.i = new Drawable[arr_j0$a.length];
                    int v = com.fsn.cauly.blackdragoncore.utils.d.a(h3.getContext(), 36.0f);
                    for(int v1 = 0; v1 < arr_j0$a.length; ++v1) {
                        com.fsn.cauly.Y.j0.a j0$a0 = h.this.b.I.b[v1];
                        if(j0$a0.c == null || j0$a0.c.length() <= 0) {
                            bitmap2 = null;
                        }
                        else {
                            String s3 = m0.a(j0$a0.c, s1);
                            if(u0.a(j0$a0.c, s3, true)) {
                                bitmap2 = BitmapFactory.decodeFile(s3);
                                if(bitmap2 != null) {
                                    Bitmap bitmap3 = f.a(bitmap2, v, v, true);
                                    bitmap2.recycle();
                                    bitmap2 = bitmap3;
                                }
                            }
                            else {
                                bitmap2 = null;
                            }
                        }
                        if(bitmap2 == null) {
                            bitmap2 = Bitmap.createBitmap(1, v, Bitmap.Config.ARGB_8888);
                            Canvas canvas0 = new Canvas(bitmap2);
                            Paint paint0 = new Paint();
                            RectF rectF0 = new RectF(new Rect(0, 0, 1, v));
                            paint0.setAntiAlias(true);
                            canvas0.drawARGB(0, 0, 0, 0);
                            paint0.setColor(0);
                            canvas0.drawRect(rectF0, paint0);
                        }
                        Drawable[] arr_drawable = h.this.i;
                        arr_drawable[v1] = new BitmapDrawable(bitmap2);
                    }
                }
            }
        }
    }

    com.fsn.cauly.blackdragoncore.contents.h.d g;
    Drawable h;
    Drawable[] i;
    String j;
    Drawable k;
    Bitmap l;
    Bitmap m;
    ImageButton n;
    RelativeLayout o;
    FrameLayout p;
    e0 q;
    LinearLayout r;
    int s;
    int t;
    boolean u;
    boolean v;
    boolean w;

    public h(i0 i00, b c$b0) {
        super(i00, c$b0);
        this.s = 480;
        this.t = 320;
        this.u = false;
        this.v = false;
        this.setOrientation(1);
        RelativeLayout relativeLayout0 = new RelativeLayout(i00.b);
        this.o = relativeLayout0;
        this.addView(relativeLayout0, com.fsn.cauly.blackdragoncore.utils.c.a());
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(int v) {
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(int v, int v1) {
        this.t(v, v1, this.u);
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(int v, String s) {
        this.c(v, s);
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
        if(this.b == null) {
            return;
        }
        int v = com.fsn.cauly.blackdragoncore.contents.h.c.a[e0$g0.ordinal()];
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        if(this.w) {
            this.i();
            return;
        }
        this.v();
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void d() {
        this.v = true;
        this.q.setVisibility(0);
        this.r.setVisibility(0);
        if(this.w) {
            this.h();
        }
        else {
            this.i();
        }
        Drawable drawable0 = this.h;
        if(drawable0 != null) {
            this.setBackgroundDrawable(drawable0);
        }
        ImageButton imageButton0 = this.n;
        if(imageButton0 != null) {
            imageButton0.setVisibility(0);
            if(this.b.E) {
                this.q.a(com.fsn.cauly.Y.e0.h.c);
            }
            if(this.q.i()) {
                this.n.setImageBitmap(this.m);
                return;
            }
            this.n.setImageBitmap(this.l);
        }
    }

    public e0 getVideoView() {
        return this.q;
    }

    public void h(String s) {
        this.setVideoUrl(s);
        this.v();
    }

    void i(String s) {
        PackageManager packageManager0 = this.a.b.getPackageManager();
        Intent intent0 = new Intent("android.intent.action.MAIN", null);
        intent0.addCategory("android.intent.category.LAUNCHER");
        List list0 = packageManager0.queryIntentActivities(intent0, 0);
        Collections.sort(list0, new ResolveInfo.DisplayNameComparator(packageManager0));
        for(int v = 0; v < list0.size(); ++v) {
            if(((ResolveInfo)list0.get(v)).activityInfo.applicationInfo.packageName.toString().equals("com.google.android.youtube")) {
                com.fsn.cauly.blackdragoncore.contents.f.b(this.a.b, s, null);
                return;
            }
        }
        com.fsn.cauly.blackdragoncore.contents.f.a(this.a.b, this.b, s, null, this.a.j);
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean k() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean l() {
        return true;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean m() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean o() {
        return true;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c, android.view.View$OnClickListener
    public void onClick(View view0) {
        String s1;
        this.q.k();
        String s = this.b.I.b[view0.getId()].d;
        try {
            s1 = "";
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch(UnsupportedEncodingException unused_ex) {
        }
        l.a(this.a, this.b, null, "click_action_param1=" + s1);
        Matcher matcher0 = Pattern.compile("^(https?:\\/\\/)((\\w+\\.)?(youtube.com)|(youtu.be))").matcher(s);
        Matcher matcher1 = Pattern.compile("cauly_action_param=open_browser").matcher(s);
        if(Pattern.compile("cauly_action_param=open_youtube").matcher(s).find()) {
            this.i(s);
            this.f();
            return;
        }
        if(!matcher0.find() && !matcher1.find()) {
            new o0(this.a.b).a(this.a, s, this.b);
            return;
        }
        com.fsn.cauly.blackdragoncore.contents.f.a(this.a.b, this.b, s, null, this.a.j);
        this.f();
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        class com.fsn.cauly.blackdragoncore.contents.h.a implements Runnable {
            final boolean a;
            final h b;

            com.fsn.cauly.blackdragoncore.contents.h.a(boolean z) {
                this.a = z;
                super();
            }

            @Override
            public void run() {
                h.this.t(h.this.s, h.this.t, this.a);
            }
        }

        super.onSizeChanged(v, v1, v2, v3);
        Point point0 = com.fsn.cauly.blackdragoncore.utils.d.b(this.getContext());
        boolean z = false;
        boolean z1 = point0.x > point0.y;
        if(z1 != this.u) {
            z = true;
        }
        if(this.q != null && z) {
            new Handler().post(new com.fsn.cauly.blackdragoncore.contents.h.a(this, z1));
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public void p() {
        this.v();
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void q() {
        com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Start video content");
        Point point0 = com.fsn.cauly.blackdragoncore.utils.d.b(this.a.b);
        this.u = point0.x > point0.y;
        this.setVisibility(0);
        if(this.j == null) {
            this.j = this.a.a == com.fsn.cauly.Y.i0.a.b ? this.b.h : this.b.e;
        }
        com.fsn.cauly.blackdragoncore.contents.h.d h$d0 = new com.fsn.cauly.blackdragoncore.contents.h.d(this);
        this.g = h$d0;
        h$d0.a(this.a.p);
        this.g.a(this);
        this.g.execute();
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void s() {
        com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Stop video content");
        com.fsn.cauly.blackdragoncore.contents.h.d h$d0 = this.g;
        if(h$d0 != null) {
            h$d0.cancel();
            this.g = null;
        }
    }

    public void setPauseOnStart(boolean z) {
        this.w = z;
    }

    void setVideoUrl(String s) {
        this.j = s;
    }

    void t(int v, int v1, boolean z) {
        int v2 = this.getWidth();
        int v3 = this.getHeight();
        if(v2 == 0) {
            v2 = com.fsn.cauly.blackdragoncore.utils.d.c(this.getContext());
            v3 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext());
        }
        if(z != v2 > v3) {
            return;
        }
        this.s = v;
        this.t = v1;
        this.u = z;
        int v4 = v3 - v2 * v1 / v;
        int v5 = v4 / 2;
        int v6 = v4 - v5;
        if(z) {
            v5 = 0;
            v6 = 0;
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, v5);
        relativeLayout$LayoutParams0.addRule(10);
        this.p.setLayoutParams(relativeLayout$LayoutParams0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, v6);
        relativeLayout$LayoutParams1.addRule(12);
        this.r.setLayoutParams(relativeLayout$LayoutParams1);
        if(v6 == 0) {
            this.r.setVisibility(8);
        }
        else if(this.v) {
            this.r.setVisibility(0);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout$LayoutParams2.addRule(3, 101);
        relativeLayout$LayoutParams2.addRule(2, 102);
        this.q.setLayoutParams(relativeLayout$LayoutParams2);
    }

    LinearLayout u(int v) {
        int v2;
        LinearLayout linearLayout0 = new LinearLayout(this.getContext());
        linearLayout0.setBackgroundDrawable(ContextCompat.getDrawable(this.getContext(), drawable.control_custom_btn));
        if(v >= this.i.length) {
            linearLayout0.setVisibility(4);
            return linearLayout0;
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.gravity = 17;
        int v1 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext());
        if(v1 > 1200) {
            v2 = 25;
        }
        else {
            v2 = v1 <= 1000 ? 16 : 21;
        }
        TextView textView0 = new TextView(this.getContext());
        textView0.setText(this.b.I.b[v].b);
        int v3 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 10.0f);
        textView0.setPadding(v3, v3, v3, v3);
        textView0.setTextColor(-1);
        textView0.setGravity(17);
        textView0.setTextSize(0, ((float)v2));
        textView0.setSingleLine(true);
        Drawable drawable0 = this.i[v];
        if(drawable0 != null) {
            textView0.setCompoundDrawablesWithIntrinsicBounds(drawable0, null, null, null);
            textView0.setCompoundDrawablePadding(0);
        }
        linearLayout0.addView(textView0, linearLayout$LayoutParams0);
        return linearLayout0;
    }

    void v() {
        class com.fsn.cauly.blackdragoncore.contents.h.b implements View.OnClickListener {
            final h a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(h.this.q.i()) {
                    h.this.q.a(com.fsn.cauly.Y.e0.h.c);
                    h.this.n.setImageBitmap(h.this.l);
                    l.a(h.this.a, h.this.b, "soundbutton_off", null);
                    return;
                }
                h.this.q.a(com.fsn.cauly.Y.e0.h.b);
                h.this.n.setImageBitmap(h.this.m);
                l.a(h.this.a, h.this.b, "soundbutton_on", null);
            }
        }

        FrameLayout frameLayout0 = new FrameLayout(this.getContext());
        this.p = frameLayout0;
        frameLayout0.setId(101);
        this.o.addView(this.p);
        LinearLayout linearLayout0 = new LinearLayout(this.getContext());
        this.r = linearLayout0;
        linearLayout0.setId(102);
        this.r.setPadding(0, com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 7.0f), 0, 0);
        this.r.setVisibility(4);
        this.r.setOrientation(1);
        this.o.addView(this.r);
        Drawable[] arr_drawable = this.i;
        if(arr_drawable != null) {
            int v = arr_drawable.length / 2;
            for(int v1 = 0; v1 < v; ++v1) {
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                LinearLayout linearLayout1 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), true, linearLayout$LayoutParams0);
                this.r.addView(linearLayout1);
                int v2 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 3.0f);
                int v3 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 33.0f);
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                linearLayout$LayoutParams1.setMargins(v3, v2, v2, 0);
                LinearLayout linearLayout2 = this.u(v1 * 2);
                linearLayout2.setId(v1 * 2);
                linearLayout1.addView(linearLayout2, linearLayout$LayoutParams1);
                linearLayout2.setOnClickListener(this);
                int v4 = v1 * 2 + 1;
                LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                linearLayout$LayoutParams2.setMargins(v2, v2, v3, 0);
                LinearLayout linearLayout3 = this.u(v4);
                linearLayout3.setId(v4);
                linearLayout1.addView(linearLayout3, linearLayout$LayoutParams2);
                linearLayout3.setOnClickListener(this);
            }
        }
        e0 e00 = new e0(this.getContext());
        this.q = e00;
        e00.setListener(this);
        this.q.setVisibility(4);
        this.o.addView(this.q);
        if(this.l != null) {
            int v5 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 7.0f);
            int v6 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 14.0f);
            int v7 = this.l.getWidth();
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(11);
            relativeLayout$LayoutParams0.addRule(10);
            relativeLayout$LayoutParams0.setMargins(0, v5, v6 + v7, 0);
            ImageButton imageButton0 = com.fsn.cauly.blackdragoncore.utils.c.a(this.a.b, null, relativeLayout$LayoutParams0);
            this.n = imageButton0;
            imageButton0.setPadding(0, 0, 0, 0);
            this.n.setOnClickListener(new com.fsn.cauly.blackdragoncore.contents.h.b(this));
            this.o.addView(this.n, relativeLayout$LayoutParams0);
            this.n.setVisibility(4);
        }
        this.t(this.s, this.t, this.u);
        this.q.a(this.j);
    }
}

