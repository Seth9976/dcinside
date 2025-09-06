package com.fsn.cauly.blackdragoncore.contents;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo.DisplayNameComparator;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.Html;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fsn.cauly.Y.c0;
import com.fsn.cauly.Y.e0.d;
import com.fsn.cauly.Y.e0.g;
import com.fsn.cauly.Y.e0.h;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.i;
import com.fsn.cauly.Y.j0;
import com.fsn.cauly.Y.l;
import com.fsn.cauly.Y.o;
import com.fsn.cauly.Y.s0.a;
import com.fsn.cauly.Y.s0;
import com.fsn.cauly.Y.v0;
import com.fsn.cauly.blackdragoncore.utils.j;
import com.fsn.cauly.blackdragoncore.utils.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e extends c implements View.OnClickListener, d, a {
    class com.fsn.cauly.blackdragoncore.contents.e.d implements Comparator {
        com.fsn.cauly.blackdragoncore.contents.e.d() {
            super();
        }

        public int a(ImageView imageView0, ImageView imageView1) {
            int v = imageView0.getId();
            int v1 = imageView1.getId();
            if(v < v1) {
                return -1;
            }
            return v <= v1 ? 0 : 1;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.a(((ImageView)object0), ((ImageView)object1));
        }
    }

    static class com.fsn.cauly.blackdragoncore.contents.e.e {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[com.fsn.cauly.Y.e0.e.values().length];
            com.fsn.cauly.blackdragoncore.contents.e.e.b = arr_v;
            try {
                arr_v[com.fsn.cauly.Y.e0.e.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fsn.cauly.blackdragoncore.contents.e.e.b[com.fsn.cauly.Y.e0.e.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fsn.cauly.blackdragoncore.contents.e.e.b[com.fsn.cauly.Y.e0.e.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fsn.cauly.blackdragoncore.contents.e.e.b[com.fsn.cauly.Y.e0.e.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[g.values().length];
            com.fsn.cauly.blackdragoncore.contents.e.e.a = arr_v1;
            try {
                arr_v1[g.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fsn.cauly.blackdragoncore.contents.e.e.a[g.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fsn.cauly.blackdragoncore.contents.e.e.a[g.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    class f extends v0 {
        final e s;

        @Override  // com.fsn.cauly.Y.v0
        public void c() {
            e e0 = e.this;
            if(e0.b != null && e0.b.Z != null) {
                int v = 0;
                e0.r = m.a(e0.getCurrentContext(), "share_x.png");
                e.this.s = m.a(e.this.getCurrentContext(), "share.png");
                e.this.q = m.a(e.this.getCurrentContext(), "skip_kor.png");
                e e1 = e.this;
                int v1 = e1.b.Z.n;
                if(v1 != 2) {
                    switch(v1) {
                        case 3: {
                            while(v < 10) {
                                Bitmap[] arr_bitmap = e.this.o;
                                arr_bitmap[v] = m.a(e.this.getCurrentContext(), "number_gotham/num_" + v + ".png");
                                ++v;
                            }
                            e.this.p = m.a(e.this.getCurrentContext(), "counting_bg.png");
                            return;
                        }
                        case 4: {
                            break;
                        }
                        default: {
                            return;
                        }
                    }
                    while(v < 10) {
                        Bitmap[] arr_bitmap1 = e.this.o;
                        arr_bitmap1[v] = m.a(e.this.getCurrentContext(), "num_" + v + ".png");
                        ++v;
                    }
                    e.this.p = m.a(e.this.getCurrentContext(), "skip_withx.png");
                    return;
                }
                e1.p = m.a(e1.getCurrentContext(), "skipawhile.png");
            }
        }
    }

    boolean A;
    boolean B;
    int C;
    private static final Comparator D;
    String g;
    RelativeLayout h;
    c0 i;
    int j;
    int k;
    boolean l;
    boolean m;
    int n;
    Bitmap[] o;
    Bitmap p;
    Bitmap q;
    Bitmap r;
    Bitmap s;
    int t;
    int u;
    List v;
    int w;
    boolean x;
    boolean y;
    Handler z;

    static {
        e.D = new com.fsn.cauly.blackdragoncore.contents.e.d();
    }

    public e(i0 i00, b c$b0) {
        super(i00, c$b0);
        this.j = 640;
        this.k = 360;
        this.l = false;
        this.m = false;
        this.n = 0;
        this.o = new Bitmap[10];
        this.t = 0;
        this.u = 0;
        this.v = new ArrayList();
        this.w = 0;
        this.x = false;
        this.z = new Handler();
        this.A = false;
        this.B = false;
        this.setOrientation(1);
    }

    void A(int v) {
        com.fsn.cauly.Y.j0.b j0$b0 = this.b.Z;
        if(j0$b0 != null && (j0$b0.n == 3 || j0$b0.n == 4)) {
            ImageView imageView0 = (ImageView)this.h.findViewById(0x77);
            ImageView imageView1 = (ImageView)this.h.findViewById(0x76);
            if(v / 10 > 0) {
                if(imageView0 != null) {
                    imageView0.setBackgroundDrawable(new BitmapDrawable(this.o[v / 10]));
                }
                if(imageView1 != null) {
                    imageView1.setBackgroundDrawable(new BitmapDrawable(this.o[v % 10]));
                }
            }
            else {
                if(imageView0 != null) {
                    if(this.b.Z.n == 4) {
                        imageView0.setVisibility(4);
                    }
                    else {
                        imageView0.setVisibility(8);
                    }
                }
                if(imageView1 != null) {
                    imageView1.setBackgroundDrawable(new BitmapDrawable(this.o[v % 10]));
                }
            }
        }
    }

    void B(RelativeLayout.LayoutParams relativeLayout$LayoutParams0, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String[] arr_s = s.split("\\|");
        if(arr_s.length == 4) {
            if(!TextUtils.isEmpty(arr_s[0])) {
                relativeLayout$LayoutParams0.leftMargin = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(arr_s[0])));
            }
            if(!TextUtils.isEmpty(arr_s[1])) {
                relativeLayout$LayoutParams0.rightMargin = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(arr_s[1])));
            }
            if(!TextUtils.isEmpty(arr_s[2])) {
                relativeLayout$LayoutParams0.topMargin = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(arr_s[2])));
            }
            if(!TextUtils.isEmpty(arr_s[3])) {
                relativeLayout$LayoutParams0.bottomMargin = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(arr_s[3])));
            }
        }
    }

    private void C(int v) {
        class com.fsn.cauly.blackdragoncore.contents.e.c implements Runnable {
            final int a;
            final e b;

            com.fsn.cauly.blackdragoncore.contents.e.c(int v) {
                this.a = v;
                super();
            }

            @Override
            public void run() {
                int v = this.a;
                if(v > 1) {
                    e.this.C(v - 1);
                    return;
                }
                ImageView imageView0 = (ImageView)e.this.h.findViewById(0x6F);
                View view0 = e.this.h.findViewById(0x75);
                if(view0 != null) {
                    view0.setVisibility(8);
                }
                if(imageView0 != null) {
                    imageView0.setVisibility(0);
                    imageView0.setOnClickListener(e.this);
                }
            }
        }

        if(this.h == null) {
            return;
        }
        this.A(v);
        new Handler().postDelayed(new com.fsn.cauly.blackdragoncore.contents.e.c(this, v), 1000L);
    }

    void D(int v, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        com.fsn.cauly.Y.g g0 = new com.fsn.cauly.Y.g(this.getContext(), s, null);
        g0.setTag(v);
        g0.a(this);
        g0.execute();
    }

    private String E(String s) {
        this.I();
        ArrayList arrayList0 = j.b(this.getContext(), "VADS");
        String[] arr_s = s.split("/");
        String s1 = arr_s[arr_s.length - 1];
        for(Object object0: arrayList0) {
            String s2 = (String)object0;
            if(!TextUtils.isEmpty(s2) && s2.contains("::") && !TextUtils.isEmpty(s)) {
                String[] arr_s1 = s2.split("::");
                if(arr_s1.length >= 2 && !TextUtils.isEmpty(arr_s1[1]) && arr_s1[1].endsWith(s1) && new File(arr_s1[1]).exists()) {
                    return arr_s1[1];
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    private void F(String s) {
        this.I();
        ArrayList arrayList0 = j.b(this.getContext(), "VADS");
        String[] arr_s = s.split("/");
        String s1 = arr_s[arr_s.length - 1];
        for(Object object0: arrayList0) {
            String s2 = (String)object0;
            if(!TextUtils.isEmpty(s2) && s2.contains("::") && !TextUtils.isEmpty(s)) {
                String[] arr_s1 = s2.split("::");
                if(arr_s1.length >= 2 && !TextUtils.isEmpty(arr_s1[1]) && arr_s1[1].endsWith(s1) && new File(arr_s1[1]).exists()) {
                    new File(arr_s1[1]).delete();
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
    }

    void G(String s) {
        Matcher matcher0 = Pattern.compile("^(https?:\\/\\/)((\\w+\\.)?(youtube.com)|(youtu.be))").matcher(s);
        Matcher matcher1 = Pattern.compile("cauly_action_param=open_browser").matcher(s);
        if(Pattern.compile("cauly_action_param=open_youtube").matcher(s).find()) {
            this.H(s);
            this.f();
            return;
        }
        if(!matcher0.find() && !matcher1.find()) {
            com.fsn.cauly.blackdragoncore.contents.f.a(this.a.b, this.b, s, null, this.a.j);
            return;
        }
        com.fsn.cauly.blackdragoncore.contents.f.a(this.a.b, this.b, s, null, this.a.j);
    }

    void H(String s) {
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

    private void I() {
        ArrayList arrayList0 = j.b(this.getContext(), "VADS");
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            String s = (String)object0;
            if(!TextUtils.isEmpty(s) && s.contains("::")) {
                String[] arr_s = s.split("::");
                if(System.currentTimeMillis() - Long.parseLong(arr_s[0]) < 604800000L) {
                    arrayList1.add(s);
                }
                else {
                    String s1 = arr_s[1];
                    if(!TextUtils.isEmpty(s1)) {
                        File file0 = new File(s1);
                        if(file0.exists()) {
                            file0.delete();
                        }
                    }
                }
            }
        }
        j.a(this.getContext(), "VADS", arrayList1);
    }

    void J() {
        ImageView imageView0 = new ImageView(this.getContext());
        imageView0.setBackgroundDrawable(new BitmapDrawable(this.q));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 79.0f), com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 22.0f));
        relativeLayout$LayoutParams0.addRule(11);
        relativeLayout$LayoutParams0.addRule(12);
        relativeLayout$LayoutParams0.bottomMargin = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 30.0f);
        imageView0.setId(0x6F);
        imageView0.setTag(0x6F);
        imageView0.setOnClickListener(this);
        this.h.addView(imageView0, relativeLayout$LayoutParams0);
    }

    void K() {
        View view0;
        j0 j00 = this.b;
        if(j00 != null) {
            com.fsn.cauly.Y.j0.b j0$b0 = j00.Z;
            if(j0$b0 != null) {
                switch(j0$b0.n) {
                    case 1: {
                        view0 = this.L();
                        break;
                    }
                    case 2: {
                        view0 = this.M();
                        break;
                    }
                    case 3: {
                        view0 = this.N();
                        break;
                    }
                    case 4: {
                        view0 = this.O();
                        break;
                    }
                    default: {
                        view0 = null;
                    }
                }
                if(view0 != null) {
                    view0.setId(0x75);
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
                    this.y(relativeLayout$LayoutParams0, this.b.Z.k);
                    this.w(relativeLayout$LayoutParams0, this.b.Z.j);
                    this.B(relativeLayout$LayoutParams0, this.b.Z.i);
                    this.h.addView(view0, relativeLayout$LayoutParams0);
                }
            }
        }
    }

    View L() {
        class com.fsn.cauly.blackdragoncore.contents.e.b implements Runnable {
            final TextView a;
            final e b;

            com.fsn.cauly.blackdragoncore.contents.e.b(TextView textView0) {
                this.a = textView0;
                super();
            }

            @Override
            public void run() {
                if(e.this.A) {
                    int v = Color.parseColor(("#" + e.this.b.Z.p));
                    this.a.setTextColor(v);
                }
                else {
                    int v1 = Color.parseColor(("#" + e.this.b.Z.q));
                    this.a.setTextColor(v1);
                }
                e.this.A = !e.this.A;
                e.this.z.postDelayed(this, 500L);
            }
        }

        View view0 = new TextView(this.getContext());
        ((TextView)view0).setText(Html.fromHtml(("" + this.b.Z.l)));
        ((TextView)view0).setGravity(17);
        ((TextView)view0).setTextSize(((float)this.b.Z.m));
        view0.setBackgroundColor(Color.parseColor(("#" + this.b.Z.o)));
        this.z.post(new com.fsn.cauly.blackdragoncore.contents.e.b(this, ((TextView)view0)));
        return view0;
    }

    View M() {
        View view0 = new ImageView(this.getContext());
        view0.setBackgroundDrawable(new BitmapDrawable(this.p));
        return view0;
    }

    View N() {
        View view0 = new RelativeLayout(this.getContext());
        view0.setBackgroundDrawable(new BitmapDrawable(this.p));
        LinearLayout linearLayout0 = new LinearLayout(this.getContext());
        linearLayout0.setOrientation(0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 7.0f), com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 20.0f));
        ImageView imageView0 = new ImageView(this.getContext());
        imageView0.setId(0x77);
        linearLayout0.addView(imageView0, linearLayout$LayoutParams0);
        ImageView imageView1 = new ImageView(this.getContext());
        imageView1.setId(0x76);
        linearLayout0.addView(imageView1, linearLayout$LayoutParams0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(13);
        ((ViewGroup)view0).addView(linearLayout0, relativeLayout$LayoutParams0);
        return view0;
    }

    View O() {
        View view0 = new RelativeLayout(this.getContext());
        view0.setBackgroundDrawable(new BitmapDrawable(this.p));
        LinearLayout linearLayout0 = new LinearLayout(this.getContext());
        linearLayout0.setOrientation(0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 6.0f), com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 24.0f));
        ImageView imageView0 = new ImageView(this.getContext());
        imageView0.setId(0x77);
        linearLayout0.addView(imageView0, linearLayout$LayoutParams0);
        ImageView imageView1 = new ImageView(this.getContext());
        imageView1.setId(0x76);
        linearLayout0.addView(imageView1, linearLayout$LayoutParams0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.leftMargin = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 4.0f);
        ((ViewGroup)view0).addView(linearLayout0, relativeLayout$LayoutParams0);
        return view0;
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(int v) {
        if(v > 0) {
            this.C = v;
        }
        if(!this.B && (this.u > 0 && this.u < v)) {
            this.B = true;
            l.a(this.a, this.b, null, "v_click_type=view");
        }
        int v1 = this.n;
        if(v1 != 0) {
            switch(v1) {
                case 1: {
                    if(v > this.t * 2 / 4) {
                        com.fsn.cauly.Y.m.a(this.a, this.b, "playing", "v_type=2q");
                        this.n = 2;
                        return;
                    }
                    break;
                }
                case 2: {
                    if(v > this.t * 3 / 4) {
                        com.fsn.cauly.Y.m.a(this.a, this.b, "playing", "v_type=3q");
                        this.n = 3;
                        return;
                    }
                    break;
                }
            }
        }
        else if(v > this.t / 4) {
            com.fsn.cauly.Y.m.a(this.a, this.b, "playing", "v_type=1q");
            this.n = 1;
        }
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(int v, int v1) {
        this.v(v, v1, this.l);
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(int v, String s) {
        if(-101 == v) {
            j0 j00 = this.b;
            if(j00 != null) {
                String s1 = j00.i;
                if(s1 != null) {
                    this.F(s1);
                    this.i.a(this.b.i);
                }
            }
        }
        int v1 = this.w;
        if(v1 < 1) {
            this.w = v1 + 1;
            this.i.f();
            return;
        }
        this.c(v, s);
        this.a.a(0x71, 202, "errorMsg");
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void a(com.fsn.cauly.Y.e0.e e0$e0) {
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
        switch(e0$g0) {
            case 2: {
                o.a(this.a, this.b, "&v_action=play_begin");
                this.a.a(0x71, 200, "Started");
                this.K();
                com.fsn.cauly.Y.j0.b j0$b0 = this.b.Z;
                if(j0$b0 != null) {
                    this.C(j0$b0.a);
                    return;
                }
                this.C(5);
                return;
            }
            case 3: {
                com.fsn.cauly.Y.m.a(this.a, this.b, "play_end", "v_type=4q");
                this.a.a(0x71, 201, "End");
                if(!this.B) {
                    this.B = true;
                    l.a(this.a, this.b, null, "v_click_type=view");
                }
            }
        }
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        if(s00 instanceof i) {
            if(s00.getErrorCode() == 0) {
                ArrayList arrayList0 = j.b(this.getContext(), "VADS");
                arrayList0.add(System.currentTimeMillis() + "::" + ((i)s00).e());
                j.a(this.getContext(), "VADS", arrayList0);
            }
        }
        else if(!(s00 instanceof f) && s00 instanceof com.fsn.cauly.Y.g && s00.getErrorCode() == 0 && s00.getErrorCode() == 0) {
            ImageView imageView0 = new ImageView(this.getContext());
            if(s00.getTag() != 0x6F) {
                imageView0.setOnClickListener(this);
            }
            imageView0.setTag(s00.getTag());
            imageView0.setId(s00.getTag());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            if(this.b != null && this.b.Z != null) {
                switch(s00.getTag()) {
                    case 0x6F: {
                        this.y(relativeLayout$LayoutParams0, this.b.Z.g);
                        this.w(relativeLayout$LayoutParams0, this.b.Z.f);
                        this.B(relativeLayout$LayoutParams0, this.b.Z.h);
                        imageView0.setVisibility(8);
                        imageView0.setImageBitmap(((com.fsn.cauly.Y.g)s00).j());
                        this.h.addView(imageView0, relativeLayout$LayoutParams0);
                        break;
                    }
                    case 0x70: {
                        this.y(relativeLayout$LayoutParams0, this.b.Z.u);
                        this.w(relativeLayout$LayoutParams0, this.b.Z.t);
                        this.B(relativeLayout$LayoutParams0, this.b.Z.v);
                        this.x(imageView0, relativeLayout$LayoutParams0, this.b.Z.w, this.b.Z.M);
                        imageView0.setImageBitmap(((com.fsn.cauly.Y.g)s00).j());
                        this.h.addView(imageView0, relativeLayout$LayoutParams0);
                        return;
                    }
                    case 0x71: {
                        this.y(relativeLayout$LayoutParams0, this.b.Z.A);
                        this.w(relativeLayout$LayoutParams0, this.b.Z.z);
                        this.B(relativeLayout$LayoutParams0, this.b.Z.B);
                        this.x(imageView0, relativeLayout$LayoutParams0, this.b.Z.C, this.b.Z.M);
                        imageView0.setImageBitmap(((com.fsn.cauly.Y.g)s00).j());
                        this.h.addView(imageView0, relativeLayout$LayoutParams0);
                        return;
                    }
                    case 0x72: {
                        this.y(relativeLayout$LayoutParams0, this.b.Z.G);
                        this.w(relativeLayout$LayoutParams0, this.b.Z.F);
                        this.B(relativeLayout$LayoutParams0, this.b.Z.H);
                        this.x(imageView0, relativeLayout$LayoutParams0, this.b.Z.I, this.b.Z.M);
                        imageView0.setImageBitmap(((com.fsn.cauly.Y.g)s00).j());
                        this.h.addView(imageView0, relativeLayout$LayoutParams0);
                        return;
                    }
                    case 0x73: {
                        this.y(relativeLayout$LayoutParams0, this.b.Z.M);
                        this.w(relativeLayout$LayoutParams0, this.b.Z.L);
                        this.B(relativeLayout$LayoutParams0, this.b.Z.N);
                        this.x(imageView0, relativeLayout$LayoutParams0, this.b.Z.O, this.b.Z.M);
                        imageView0.setImageBitmap(((com.fsn.cauly.Y.g)s00).j());
                        this.h.addView(imageView0, relativeLayout$LayoutParams0);
                        return;
                    }
                    case 0x74: {
                        this.y(relativeLayout$LayoutParams0, this.b.Z.S);
                        this.w(relativeLayout$LayoutParams0, this.b.Z.R);
                        this.B(relativeLayout$LayoutParams0, this.b.Z.T);
                        this.x(imageView0, relativeLayout$LayoutParams0, this.b.Z.U, this.b.Z.M);
                        imageView0.setImageBitmap(((com.fsn.cauly.Y.g)s00).j());
                        this.h.addView(imageView0, relativeLayout$LayoutParams0);
                        return;
                    }
                    case 120: 
                    case 0x79: 
                    case 0x7A: 
                    case 0x7B: 
                    case 0x7C: {
                        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
                        this.w(linearLayout$LayoutParams0, this.b.Z.k0);
                        imageView0.setImageBitmap(((com.fsn.cauly.Y.g)s00).j());
                        imageView0.setLayoutParams(linearLayout$LayoutParams0);
                        this.v.add(imageView0);
                        return;
                    }
                    case 0x7D: {
                        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
                        LinearLayout linearLayout0 = new LinearLayout(this.getContext());
                        linearLayout0.setId(0x7F);
                        linearLayout0.setOrientation(0);
                        this.w(linearLayout$LayoutParams1, this.b.Z.k0);
                        imageView0.setImageBitmap(((com.fsn.cauly.Y.g)s00).j());
                        this.s = ((com.fsn.cauly.Y.g)s00).j();
                        linearLayout0.addView(imageView0, linearLayout$LayoutParams1);
                        this.y(relativeLayout$LayoutParams0, this.b.Z.i0);
                        this.B(relativeLayout$LayoutParams0, this.b.Z.j0);
                        this.h.addView(linearLayout0, relativeLayout$LayoutParams0);
                        return;
                    }
                    case 0x7E: {
                        this.r = ((com.fsn.cauly.Y.g)s00).j();
                    }
                }
            }
        }
    }

    @Override  // com.fsn.cauly.Y.e0$d
    public void d() {
        this.m = true;
        this.i.setVisibility(0);
        com.fsn.cauly.Y.j0.b j0$b0 = this.b.Z;
        if(j0$b0 != null) {
            if(j0$b0.d == 0) {
                this.i.a(h.a);
            }
            else {
                this.i.a(h.b);
            }
        }
        if(!this.y) {
            this.i();
            return;
        }
        this.h();
    }

    public c0 getVideoView() {
        return this.i;
    }

    public void i(String s) {
        this.setVideoUrl(s);
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

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u();
        c0 c00 = this.i;
        if(c00 != null) {
            c00.a(this.g);
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c, android.view.View$OnClickListener
    public void onClick(View view0) {
        switch(((int)(((Integer)view0.getTag())))) {
            case 0x6F: {
                com.fsn.cauly.Y.m.a(this.a, this.b, "skip", "play_time" + this.C);
                this.a.a(0x71, 204, "skip");
                return;
            }
            case 0x70: {
                l.a(this.a, this.b, null, "v_click_type=fixed1_click");
                this.a.a(0x71, 203, "click");
                this.G(this.b.Z.x);
                return;
            }
            case 0x71: {
                l.a(this.a, this.b, null, "v_click_type=fixed2_click");
                this.a.a(0x71, 203, "click");
                this.G(this.b.Z.D);
                return;
            }
            case 0x72: {
                l.a(this.a, this.b, null, "v_click_type=fixed3_click");
                this.a.a(0x71, 203, "click");
                this.G(this.b.Z.J);
                return;
            }
            case 0x73: {
                l.a(this.a, this.b, null, "v_click_type=brand1_click");
                this.a.a(0x71, 203, "click");
                this.G(this.b.Z.P);
                return;
            }
            case 0x74: {
                l.a(this.a, this.b, null, "v_click_type=brand2_click");
                this.a.a(0x71, 203, "click");
                this.G(this.b.Z.V);
                return;
            }
            case 120: {
                l.a(this.a, this.b, null, "v_click_type=shared1_click");
                this.a.a(0x71, 203, "click");
                this.G(this.b.Z.X);
                return;
            }
            case 0x79: {
                l.a(this.a, this.b, null, "v_click_type=shared2_click");
                this.a.a(0x71, 203, "click");
                this.G(this.b.Z.Z);
                return;
            }
            case 0x7A: {
                l.a(this.a, this.b, null, "v_click_type=shared3_click");
                this.a.a(0x71, 203, "click");
                this.G(this.b.Z.b0);
                return;
            }
            case 0x7B: {
                l.a(this.a, this.b, null, "v_click_type=shared4_click");
                this.a.a(0x71, 203, "click");
                this.G(this.b.Z.d0);
                return;
            }
            case 0x7C: {
                l.a(this.a, this.b, null, "v_click_type=shared5_click");
                this.a.a(0x71, 203, "click");
                this.G(this.b.Z.f0);
                return;
            }
            case 0x7D: {
                LinearLayout linearLayout0 = (LinearLayout)this.h.findViewById(0x7F);
                Collections.sort(this.v, e.D);
                boolean z = TextUtils.isEmpty(this.b.Z.i0) || !this.b.Z.i0.contains("right");
                if(this.x) {
                    if(z) {
                        linearLayout0.removeAllViews();
                        linearLayout0.addView(((ImageView)view0));
                    }
                    else {
                        this.v.size();
                        linearLayout0.removeViews(0, this.v.size());
                    }
                    ((ImageView)view0).setImageBitmap(this.s);
                    this.x = false;
                    return;
                }
                for(Object object0: this.v) {
                    ImageView imageView0 = (ImageView)object0;
                    if(z) {
                        if(!TextUtils.isEmpty(this.b.Z.l0)) {
                            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)imageView0.getLayoutParams();
                            linearLayout$LayoutParams0.leftMargin = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(this.b.Z.l0)));
                        }
                        linearLayout0.addView(imageView0);
                    }
                    else {
                        if(!TextUtils.isEmpty(this.b.Z.l0)) {
                            LinearLayout.LayoutParams linearLayout$LayoutParams1 = (LinearLayout.LayoutParams)imageView0.getLayoutParams();
                            linearLayout$LayoutParams1.rightMargin = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(this.b.Z.l0)));
                        }
                        linearLayout0.addView(imageView0, linearLayout0.getChildCount() - 1);
                    }
                }
                ((ImageView)view0).setImageBitmap(this.r);
                this.x = true;
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap[] arr_bitmap = this.o;
        if(arr_bitmap != null) {
            for(int v = 0; v < arr_bitmap.length; ++v) {
                Bitmap bitmap0 = arr_bitmap[v];
                if(bitmap0 != null && !bitmap0.isRecycled()) {
                    bitmap0.recycle();
                }
            }
        }
        if(this.p != null && !this.p.isRecycled()) {
            this.p.recycle();
        }
        if(this.q != null && !this.q.isRecycled()) {
            this.q.recycle();
        }
        if(this.r != null && !this.r.isRecycled()) {
            this.r.recycle();
        }
        if(this.s != null && !this.s.isRecycled()) {
            this.s.recycle();
        }
        com.fsn.cauly.blackdragoncore.utils.c.a(this.h);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        class com.fsn.cauly.blackdragoncore.contents.e.a implements Runnable {
            final boolean a;
            final e b;

            com.fsn.cauly.blackdragoncore.contents.e.a(boolean z) {
                this.a = z;
                super();
            }

            @Override
            public void run() {
                e.this.v(e.this.j, e.this.k, this.a);
            }
        }

        super.onSizeChanged(v, v1, v2, v3);
        Point point0 = com.fsn.cauly.blackdragoncore.utils.d.b(this.getContext());
        boolean z = false;
        boolean z1 = point0.x > point0.y;
        if(z1 != this.l) {
            z = true;
        }
        this.l = z1;
        if(this.i != null && z) {
            new Handler().post(new com.fsn.cauly.blackdragoncore.contents.e.a(this, z1));
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public void p() {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void q() {
        com.fsn.cauly.blackdragoncore.utils.g.b g$b0 = com.fsn.cauly.blackdragoncore.utils.g.b.e;
        com.fsn.cauly.blackdragoncore.utils.g.a(g$b0, "Start video content");
        Point point0 = com.fsn.cauly.blackdragoncore.utils.d.b(this.a.b);
        this.l = point0.x > point0.y;
        this.setVisibility(0);
        com.fsn.cauly.Y.j0.b j0$b0 = this.b.Z;
        if(j0$b0 != null) {
            this.t = j0$b0.b * 1000;
            this.u = j0$b0.c * 1000;
            f e$f0 = new f(this);
            e$f0.a(this);
            e$f0.execute();
            String s = this.E(this.b.i);
            if(s == null) {
                if(this.b.Z.b <= 30000) {
                    i i0 = new i(this.a.b, this.b.i);
                    i0.a(this);
                    i0.execute();
                }
                this.i(this.b.i);
            }
            else {
                com.fsn.cauly.blackdragoncore.utils.g.a(g$b0, "Start video cachedUrl content");
                this.i(s);
            }
            this.i();
            return;
        }
        this.c(-100, "Error");
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void s() {
        com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Stop video content");
    }

    public void setPauseOnStart(boolean z) {
        this.y = z;
    }

    void setVideoUrl(String s) {
        this.g = s;
    }

    void t() {
        if(this.b != null && (this.b.Z != null && this.b.Z.r > 0)) {
            int[] arr_v = {0, Color.argb(100, 0, 0, 0)};
            View view0 = new View(this.getContext());
            view0.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, arr_v));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)this.b.Z.r)));
            relativeLayout$LayoutParams0.addRule(12);
            this.h.addView(view0, relativeLayout$LayoutParams0);
        }
    }

    void u() {
        c0 c00 = new c0(this.getContext());
        this.i = c00;
        c00.setListener(this);
        RelativeLayout relativeLayout0 = new RelativeLayout(this.getContext());
        this.h = relativeLayout0;
        relativeLayout0.setBackgroundColor(0);
        this.h.addView(this.i, com.fsn.cauly.blackdragoncore.utils.c.b());
        this.addView(this.h, com.fsn.cauly.blackdragoncore.utils.c.a());
        if(this.b != null && this.b.Z != null) {
            this.t();
            if(TextUtils.isEmpty(this.b.Z.e) || TextUtils.isEmpty(this.b.Z.f)) {
                this.J();
            }
            else {
                this.D(0x6F, this.b.Z.e);
            }
            this.D(0x70, this.b.Z.s);
            this.D(0x71, this.b.Z.y);
            this.D(0x72, this.b.Z.E);
            this.D(0x73, this.b.Z.K);
            this.D(0x74, this.b.Z.Q);
            if(!TextUtils.isEmpty(this.b.Z.g0) && !TextUtils.isEmpty(this.b.Z.k0)) {
                this.D(0x7D, this.b.Z.g0);
                this.D(0x7E, this.b.Z.h0);
                this.D(120, this.b.Z.W);
                this.D(0x79, this.b.Z.Y);
                this.D(0x7A, this.b.Z.a0);
                this.D(0x7B, this.b.Z.c0);
                this.D(0x7C, this.b.Z.e0);
            }
        }
    }

    void v(int v, int v1, boolean z) {
        this.i.i();
    }

    void w(ViewGroup.LayoutParams viewGroup$LayoutParams0, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String[] arr_s = s.split("x");
        if(arr_s.length == 2) {
            if(!TextUtils.isEmpty(arr_s[0])) {
                viewGroup$LayoutParams0.width = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(arr_s[0])));
            }
            if(!TextUtils.isEmpty(arr_s[1])) {
                viewGroup$LayoutParams0.height = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(arr_s[1])));
            }
        }
    }

    void x(ImageView imageView0, RelativeLayout.LayoutParams relativeLayout$LayoutParams0, String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String[] arr_s = s.split("\\|");
        if(arr_s.length == 4 && !TextUtils.isEmpty(arr_s[0]) && !TextUtils.isEmpty(arr_s[1]) && !TextUtils.isEmpty(arr_s[2]) && !TextUtils.isEmpty(arr_s[3])) {
            int v1 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(arr_s[0])));
            int v2 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(arr_s[1])));
            int v3 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(arr_s[2])));
            int v4 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), ((float)Integer.parseInt(arr_s[3])));
            relativeLayout$LayoutParams0.width = relativeLayout$LayoutParams0.width + v1 + v2;
            relativeLayout$LayoutParams0.height = relativeLayout$LayoutParams0.height + v3 + v4;
            imageView0.setPadding(v1, v2, v3, v4);
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            String[] arr_s1 = s1.split("\\|");
            for(int v = 0; v < arr_s1.length; ++v) {
                String s2 = arr_s1[v];
                if("left".equalsIgnoreCase(s2)) {
                    relativeLayout$LayoutParams0.leftMargin -= (v1 + v2) / 2;
                }
                else if("right".equalsIgnoreCase(s2)) {
                    relativeLayout$LayoutParams0.rightMargin -= (v1 + v2) / 2;
                }
                else if("top".equalsIgnoreCase(s2)) {
                    relativeLayout$LayoutParams0.topMargin -= (v3 + v4) / 2;
                }
                else if("bottom".equalsIgnoreCase(s2)) {
                    relativeLayout$LayoutParams0.bottomMargin -= (v3 + v4) / 2;
                }
            }
        }
    }

    void y(RelativeLayout.LayoutParams relativeLayout$LayoutParams0, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String[] arr_s = s.split("\\|");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if("left".equalsIgnoreCase(s1)) {
                relativeLayout$LayoutParams0.addRule(9);
            }
            else if("right".equalsIgnoreCase(s1)) {
                relativeLayout$LayoutParams0.addRule(11);
            }
            else if("top".equalsIgnoreCase(s1)) {
                relativeLayout$LayoutParams0.addRule(10);
            }
            else if("bottom".equalsIgnoreCase(s1)) {
                relativeLayout$LayoutParams0.addRule(12);
            }
            else if("center_vertical".equalsIgnoreCase(s1)) {
                relativeLayout$LayoutParams0.addRule(15);
            }
            else if("center_horizontal".equalsIgnoreCase(s1)) {
                relativeLayout$LayoutParams0.addRule(14);
            }
        }
    }
}

