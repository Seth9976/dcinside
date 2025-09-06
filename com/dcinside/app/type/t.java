package com.dcinside.app.type;

import android.graphics.drawable.Drawable;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.bumptech.glide.request.d;
import com.dcinside.app.image.s;
import com.dcinside.app.model.Q;
import com.dcinside.app.read.reply.more.ReplyMoreItem;
import com.dcinside.app.response.PostItem;
import com.dcinside.app.response.j;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public enum t {
    @s0({"SMAP\nMemberType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberType.kt\ncom/dcinside/app/type/MemberType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @n
        public final void b(@m Q q0, @l ImageView imageView0) {
            L.p(imageView0, "iv");
            if(q0 != null) {
                t t0 = t.c.j(q0);
                t.c.g(t0, q0.U0(), imageView0, false);
            }
        }

        @n
        public final void c(@l ReplyMoreItem replyMoreItem0, @l ImageView imageView0) {
            L.p(replyMoreItem0, "arg");
            L.p(imageView0, "iv");
            this.g(this.k(replyMoreItem0), "", imageView0, false);
        }

        @n
        public final void d(@m PostItem postItem0, @l ImageView imageView0) {
            L.p(imageView0, "iv");
            if(postItem0 != null) {
                t t0 = t.c.l(postItem0);
                String s = postItem0.w();
                t.c.g(t0, s, imageView0, false);
            }
        }

        @n
        public final void e(@m j j0, @l ImageView imageView0) {
            L.p(imageView0, "iv");
            if(j0 != null) {
                t t0 = t.c.m(j0);
                t.c.g(t0, j0.T(), imageView0, false);
            }
        }

        @n
        public final void f(@m j j0, @l ImageView imageView0, boolean z) {
            L.p(imageView0, "iv");
            if(j0 != null) {
                t t0 = t.c.m(j0);
                t.c.g(t0, j0.T(), imageView0, z);
            }
        }

        @n
        private final void g(t t0, String s, ImageView imageView0, boolean z) {
            if(s != null && s.length() > 0) {
                imageView0.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView0.setPadding(0, 0, 0, 0);
                imageView0.setVisibility(0);
                if(z) {
                    s.b(imageView0);
                    d d0 = com.dcinside.app.glide.a.l(imageView0).t0(s).H1();
                    L.o(d0, "submit(...)");
                    imageView0.setImageDrawable(((Drawable)d0.get()));
                    return;
                }
                com.dcinside.app.glide.a.l(imageView0).t0(s).q1(imageView0);
                return;
            }
            if(t0.m() == 0) {
                s.b(imageView0);
                imageView0.setVisibility(8);
                return;
            }
            int v = imageView0.getResources().getDimensionPixelSize(0x7F0702D1);  // dimen:member_icon_padding
            s.b(imageView0);
            imageView0.setPadding(0, v, 0, v);
            imageView0.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView0.setImageResource(t0.m());
            imageView0.setVisibility(0);
        }

        static void h(a t$a0, t t0, String s, ImageView imageView0, boolean z, int v, Object object0) {
            if((v & 8) != 0) {
                z = false;
            }
            t$a0.g(t0, s, imageView0, z);
        }

        private final t i(int v, String s) {
            try {
                return L.g("1", s) ? t.f : ((t)t.l().get(v - 1));
            }
            catch(Exception unused_ex) {
                return t.f;
            }
        }

        @l
        @n
        public final t j(@l Q q0) {
            L.p(q0, "arg");
            return this.i(q0.V0(), q0.Q0());
        }

        @l
        @n
        public final t k(@l ReplyMoreItem replyMoreItem0) {
            L.p(replyMoreItem0, "arg");
            return this.i(replyMoreItem0.G(), "");
        }

        @l
        @n
        public final t l(@l PostItem postItem0) {
            L.p(postItem0, "arg");
            return this.i(postItem0.x(), postItem0.v());
        }

        @l
        @n
        public final t m(@l j j0) {
            L.p(j0, "arg");
            return this.i(j0.U(), j0.S());
        }
    }

    FIXED(0x7F080367, "icon_nick1"),  // drawable:icon_nick1
    DEFAULT(0x7F080366, "icon_nick0"),  // drawable:icon_nick0
    GUEST(0, ""),
    MANAGER_FIXED(0x7F080368, "icon_nick2"),  // drawable:icon_nick2
    SUB_MANAGER_FIXED(0x7F080369, "icon_nick3"),  // drawable:icon_nick3
    MANAGER_DEFAULT(0x7F08036A, "icon_nick4"),  // drawable:icon_nick4
    SUB_MANAGER_DEFAULT(0x7F08036B, "icon_nick5");  // drawable:icon_nick5

    private final int a;
    @l
    private final String b;
    @l
    public static final a c;
    private static final t[] k;
    private static final kotlin.enums.a l;

    static {
        t.k = arr_t;
        L.p(arr_t, "entries");
        t.l = new kotlin.enums.d(arr_t);
        t.c = new a(null);
    }

    private t(@DrawableRes int v1, String s1) {
        this.a = v1;
        this.b = s1;
    }

    private static final t[] a() [...] // Inlined contents

    @n
    public static final void b(@m Q q0, @l ImageView imageView0) {
        t.c.b(q0, imageView0);
    }

    @n
    public static final void c(@l ReplyMoreItem replyMoreItem0, @l ImageView imageView0) {
        t.c.c(replyMoreItem0, imageView0);
    }

    @n
    public static final void d(@m PostItem postItem0, @l ImageView imageView0) {
        t.c.d(postItem0, imageView0);
    }

    @n
    public static final void e(@m j j0, @l ImageView imageView0) {
        t.c.e(j0, imageView0);
    }

    @n
    public static final void f(@m j j0, @l ImageView imageView0, boolean z) {
        t.c.f(j0, imageView0, z);
    }

    @n
    private static final void g(t t0, String s, ImageView imageView0, boolean z) {
        t.c.g(t0, s, imageView0, z);
    }

    @l
    @n
    public static final t h(@l Q q0) {
        return t.c.j(q0);
    }

    @l
    @n
    public static final t i(@l ReplyMoreItem replyMoreItem0) {
        return t.c.k(replyMoreItem0);
    }

    @l
    @n
    public static final t j(@l PostItem postItem0) {
        return t.c.l(postItem0);
    }

    @l
    @n
    public static final t k(@l j j0) {
        return t.c.m(j0);
    }

    @l
    public static kotlin.enums.a l() {
        return t.l;
    }

    public final int m() {
        return this.a;
    }

    @l
    public final String n() {
        return this.b;
    }
}

