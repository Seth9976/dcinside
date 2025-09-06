package com.dcinside.app.view.tool;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.StringRes;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.target.p;
import com.dcinside.app.image.r;
import com.dcinside.app.image.s;
import com.dcinside.app.model.Q;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.type.f;
import com.dcinside.app.util.uk;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class e implements h {
    public static final class a {
        public static final class com.dcinside.app.view.tool.e.a.a {
            @m
            private f a;
            @m
            private String b;
            private int c;
            private int d;

            public com.dcinside.app.view.tool.e.a.a() {
                this(null, null, 0, 0, 15, null);
            }

            public com.dcinside.app.view.tool.e.a.a(@m f f0, @m String s, @IntRange(from = 0L) int v, @StringRes int v1) {
                this.a = f0;
                this.b = s;
                this.c = v;
                this.d = v1;
            }

            public com.dcinside.app.view.tool.e.a.a(f f0, String s, int v, int v1, int v2, w w0) {
                if((v2 & 1) != 0) {
                    f0 = null;
                }
                if((v2 & 2) != 0) {
                    s = null;
                }
                if((v2 & 4) != 0) {
                    v = 0;
                }
                if((v2 & 8) != 0) {
                    v1 = 0x7F1504FA;  // string:input_code_basic "코드 입력"
                }
                this(f0, s, v, v1);
            }

            public final int a() {
                return this.c;
            }

            @m
            public final String b() {
                return this.b;
            }

            public final int c() {
                return this.d;
            }

            @m
            public final f d() {
                return this.a;
            }

            public final void e(int v) {
                this.c = v;
            }

            public final void f(@m String s) {
                this.b = s;
            }

            public final void g(int v) {
                this.d = v;
            }

            public final void h(@m f f0) {
                this.a = f0;
            }
        }

        private a() {
        }

        public a(w w0) {
        }

        @m
        public final com.dcinside.app.view.tool.e.a.a a(@m Q q0, @l f f0) {
            L.p(f0, "type");
            if(q0 == null) {
                return null;
            }
            String s = q0.G0();
            String s1 = B.E.k0();
            int v = 0;
            int v1 = 0x7F1504FA;  // string:input_code_basic "코드 입력"
            if(s1 == null || s1.length() <= 0) {
                if(f0 == f.a) {
                    return q0.B0() ? new com.dcinside.app.view.tool.e.a.a(f0, s, q0.C0(), 0x7F1504FA) : new com.dcinside.app.view.tool.e.a.a(f0, s, 0, 0x7F1504FA);  // string:input_code_basic "코드 입력"
                }
                if(f0 == f.b) {
                    String s2 = q0.h1();
                    if(L.g(s2, "U")) {
                        v1 = 0x7F1504FD;  // string:input_code_like "추천 코드 입력"
                    }
                    else {
                        v1 = L.g(s2, "D") ? 0x7F1504FB : 0x7F150836;  // string:input_code_dislike "비추천 코드 입력"
                    }
                    if(q0.f1()) {
                        v = q0.g1();
                    }
                }
            }
            return new com.dcinside.app.view.tool.e.a.a(f0, s, v, v1);
        }

        @m
        public final com.dcinside.app.view.tool.e.a.a b(@m GalleryInfo galleryInfo0, @l f f0) {
            L.p(f0, "type");
            if(galleryInfo0 == null) {
                return null;
            }
            String s = B.E.k0();
            return new com.dcinside.app.view.tool.e.a.a(f0, galleryInfo0.r(), (s != null && s.length() > 0 || !galleryInfo0.g() ? 0 : galleryInfo0.l()), 0x7F1504FA);  // string:input_code_basic "코드 입력"
        }

        @m
        public final com.dcinside.app.view.tool.e.a.a c() {
            return new com.dcinside.app.view.tool.e.a.a(f.d, "", 4, 0x7F1504FF);  // string:input_code_login "코드 입력 (4자리)"
        }

        @m
        public final String d() [...] // 潜在的解密器
    }

    @m
    private View a;
    @m
    private TextView b;
    @m
    private ImageView c;
    @m
    private TextView d;
    @m
    private View e;
    @m
    private com.dcinside.app.view.tool.e.a.a f;
    @m
    private String g;
    @l
    public static final a h;

    static {
        e.h = new a(null);
    }

    public e(@l View view0, int v, int v1, int v2, int v3, int v4) {
        L.p(view0, "view");
        View view1 = null;
        View view2 = v == 0 ? null : view0.findViewById(v);
        TextView textView0 = v1 == 0 ? null : ((TextView)view0.findViewById(v1));
        ImageView imageView0 = v2 == 0 ? null : ((ImageView)view0.findViewById(v2));
        TextView textView1 = v3 == 0 ? null : ((TextView)view0.findViewById(v3));
        if(v4 != 0) {
            view1 = view0.findViewById(v4);
        }
        this(view2, textView0, imageView0, textView1, view1);
    }

    public e(@m View view0, @m TextView textView0, @m ImageView imageView0, @m TextView textView1, @m View view1) {
        this.a = view0;
        this.b = textView0;
        this.c = imageView0;
        this.d = textView1;
        this.e = view1;
        if(view1 != null) {
            view1.setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                this.n(true);
            });
        }
    }

    // 检测为 Lambda 实现
    private static final void b(e e0, View view0) [...]

    public final void c(@m Q q0, @l f f0) {
        CharSequence charSequence2;
        CharSequence charSequence1;
        L.p(f0, "type");
        this.f = e.h.a(q0, f0);
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        int v = 0x7F150836;  // string:quick_write_code_guide "코드 %1$d자리 입력"
        CharSequence charSequence0 = null;
        if(f0 == f.b) {
            String s = q0 == null ? null : q0.h1();
            if(!L.g(s, "U") && L.g(s, "D")) {
                v = 0x7F1504FC;  // string:input_code_dislike_guide "비추천 코드 %1$d자리 입력"
            }
            TextView textView0 = this.b;
            if(textView0 == null) {
                charSequence1 = null;
            }
            else {
                Context context0 = textView0.getContext();
                charSequence1 = context0 == null ? null : context0.getString(v, new Object[]{(q0 == null ? null : q0.g1())});
            }
            spannableStringBuilder0.append(charSequence1);
            spannableStringBuilder0.setSpan(new RelativeSizeSpan(0.7f), 0, spannableStringBuilder0.length(), 33);
        }
        else {
            TextView textView1 = this.b;
            if(textView1 == null) {
                charSequence2 = null;
            }
            else {
                Context context1 = textView1.getContext();
                charSequence2 = context1 == null ? null : context1.getString(0x7F150836, new Object[]{(q0 == null ? null : q0.C0())});  // string:quick_write_code_guide "코드 %1$d자리 입력"
            }
            spannableStringBuilder0.append(charSequence2);
        }
        spannableStringBuilder0.append(' ');
        int v1 = spannableStringBuilder0.length();
        if(this.b != null && this.b.getContext() != null) {
            charSequence0 = "(숫자 0은 없음)";
        }
        spannableStringBuilder0.append(charSequence0);
        spannableStringBuilder0.setSpan(new RelativeSizeSpan(0.5f), v1, spannableStringBuilder0.length(), 33);
        if(spannableStringBuilder0.length() == 0) {
            TextView textView2 = this.b;
            if(textView2 != null) {
                textView2.setHint((this.f == null ? 0x7F1504FA : this.f.c()));  // string:input_code_basic "코드 입력"
            }
            this.r(false);
            return;
        }
        TextView textView3 = this.b;
        if(textView3 != null) {
            textView3.setHint(spannableStringBuilder0);
        }
        this.r(false);
        TextView textView4 = this.d;
        if(textView4 != null) {
            textView4.setVisibility(8);
        }
    }

    public final void d(@m GalleryInfo galleryInfo0, @m SpannableStringBuilder spannableStringBuilder0) {
        this.f = e.h.b(galleryInfo0, f.c);
        if(spannableStringBuilder0 == null || spannableStringBuilder0.length() == 0) {
            TextView textView1 = this.b;
            if(textView1 != null) {
                textView1.setHint((this.f == null ? 0x7F1504FA : this.f.c()));  // string:input_code_basic "코드 입력"
            }
        }
        else {
            TextView textView0 = this.b;
            if(textView0 != null) {
                textView0.setHint(spannableStringBuilder0);
            }
        }
        e.s(this, false, 1, null);
    }

    public static void e(e e0, GalleryInfo galleryInfo0, SpannableStringBuilder spannableStringBuilder0, int v, Object object0) {
        if((v & 2) != 0) {
            spannableStringBuilder0 = null;
        }
        e0.d(galleryInfo0, spannableStringBuilder0);
    }

    public final void f() {
        com.dcinside.app.view.tool.e.a.a e$a$a0 = e.h.c();
        this.f = e$a$a0;
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setHint((e$a$a0 == null ? 0x7F1504FA : e$a$a0.c()));  // string:input_code_basic "코드 입력"
        }
        e.s(this, false, 1, null);
    }

    public final void g() {
        ImageView imageView0 = this.c;
        if(imageView0 != null) {
            s.b(imageView0);
        }
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setText(null);
        }
        this.g = null;
    }

    // 去混淆评级： 低(30)
    public final boolean h() {
        return (this.f == null ? 0 : this.f.a()) <= 0 ? false : this.i().length() > 0;
    }

    @l
    public final String i() {
        TextView textView0 = this.b;
        if(textView0 != null) {
            CharSequence charSequence0 = textView0.getText();
            if(charSequence0 != null) {
                String s = charSequence0.toString();
                return s == null ? "" : s;
            }
        }
        return "";
    }

    @m
    public final String j() {
        return this.g;
    }

    public final void k() {
        View view0 = this.a;
        if(view0 != null) {
            view0.setVisibility(8);
        }
        TextView textView0 = this.d;
        if(textView0 != null) {
            textView0.setVisibility(8);
        }
        this.g();
    }

    public final boolean l() {
        return this.a != null && this.a.getVisibility() == 0;
    }

    public boolean m(@l Drawable drawable0, @l Object object0, @m p p0, @l com.bumptech.glide.load.a a0, boolean z) {
        L.p(drawable0, "resource");
        L.p(object0, "model");
        L.p(a0, "dataSource");
        return false;
    }

    public final void n(boolean z) {
        static final class b extends N implements Function1 {
            final e e;

            b(e e0) {
                this.e = e0;
                super(1);
            }

            @l
            public final com.bumptech.glide.m a(@l com.bumptech.glide.m m0) {
                L.p(m0, "it");
                com.bumptech.glide.m m1 = m0.s1(this.e);
                L.o(m1, "listener(...)");
                return m1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.bumptech.glide.m)object0));
            }
        }

        com.dcinside.app.view.tool.e.a.a e$a$a0 = this.f;
        if(e$a$a0 == null) {
            return;
        }
        if(!this.l()) {
            return;
        }
        if(!z && this.g != null) {
            return;
        }
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setText(null);
        }
        this.g = "685cda9474ea8fdc8eda29c9d1056acd";
        ImageView imageView0 = this.c;
        if(imageView0 != null) {
            r r0 = s.h(imageView0, uk.Vj(e$a$a0.d(), e$a$a0.b(), this.g));
            if(r0 != null) {
                r r1 = r0.b();
                if(r1 != null) {
                    r1.i(new b(this));
                }
            }
        }
    }

    public static void o(e e0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        e0.n(z);
    }

    @Override  // com.bumptech.glide.request.h
    public boolean onLoadFailed(@m q q0, @m Object object0, @l p p0, boolean z) {
        L.p(p0, "target");
        this.g = null;
        return false;
    }

    @Override  // com.bumptech.glide.request.h
    public boolean onResourceReady(Object object0, Object object1, p p0, com.bumptech.glide.load.a a0, boolean z) {
        return this.m(((Drawable)object0), object1, p0, a0, z);
    }

    public final void p() {
        ImageView imageView0 = this.c;
        if(imageView0 != null) {
            s.b(imageView0);
        }
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @j
    public final void q() {
        e.s(this, false, 1, null);
    }

    @j
    public final void r(boolean z) {
        int v = this.f == null ? 0 : this.f.a();
        if(v > 0) {
            View view0 = this.a;
            if(view0 != null) {
                view0.setVisibility(0);
            }
            TextView textView0 = this.d;
            if(textView0 != null) {
                textView0.setVisibility(0);
            }
            TextView textView1 = this.d;
            if(textView1 != null) {
                Context context0 = textView1.getContext();
                textView1.setText((context0 == null ? null : context0.getString(0x7F1501F7, new Object[]{v})));  // string:code_guide "코드 %1$d자리를 입력해 주세요.(숫자 0은 나오지 않습니다.)"
            }
            this.n(z);
            return;
        }
        this.k();
    }

    public static void s(e e0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        e0.r(z);
    }
}

