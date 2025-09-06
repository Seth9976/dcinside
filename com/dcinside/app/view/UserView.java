package com.dcinside.app.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.auth.LoginActivity;
import com.dcinside.app.base.d;
import com.dcinside.app.base.i;
import com.dcinside.app.image.s;
import com.dcinside.app.main.login.g;
import com.dcinside.app.realm.B.b;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.t;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.k;
import com.dcinside.app.type.l;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.g1;
import io.realm.r1;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.m;

@s0({"SMAP\nUserView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserView.kt\ncom/dcinside/app/view/UserView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1#2:379\n257#3,2:380\n257#3,2:382\n257#3,2:389\n257#3,2:391\n257#3,2:393\n257#3,2:395\n257#3,2:397\n257#3,2:399\n1863#4:384\n774#4:385\n865#4,2:386\n1864#4:388\n*S KotlinDebug\n*F\n+ 1 UserView.kt\ncom/dcinside/app/view/UserView\n*L\n195#1:380,2\n200#1:382,2\n267#1:389,2\n296#1:391,2\n297#1:393,2\n300#1:395,2\n301#1:397,2\n318#1:399,2\n219#1:384\n223#1:385\n223#1:386,2\n219#1:388\n*E\n"})
public final class UserView extends LinearLayout implements i {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[l.values().length];
            try {
                arr_v[l.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[l.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[l.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[l.c.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    private ImageView a;
    private TextView b;
    private TextView c;
    private ImageView d;
    private TextView e;
    private ImageView f;
    private ImageView g;
    private TextView h;
    private View i;
    private TextView j;
    private ImageView k;
    private TextView l;
    private View m;
    private TextView n;
    private ImageView o;
    private TextView p;
    private View q;
    @m
    private g1 r;
    @m
    private g1 s;
    @y4.l
    private final P0 t;
    @y4.l
    private final P0 u;

    public UserView(@y4.l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.t = (g1 g10) -> {
            L.p(this, "this$0");
            L.p(g10, "<anonymous parameter 0>");
            this.F();
        };
        this.u = (g1 g10) -> {
            L.p(this, "this$0");
            L.p(g10, "<anonymous parameter 0>");
            this.E();
        };
        this.w(context0);
    }

    public UserView(@y4.l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
        this.t = (g1 g10) -> {
            L.p(this, "this$0");
            L.p(g10, "<anonymous parameter 0>");
            this.F();
        };
        this.u = (g1 g10) -> {
            L.p(this, "this$0");
            L.p(g10, "<anonymous parameter 0>");
            this.E();
        };
        this.w(context0);
    }

    public UserView(@y4.l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.t = (g1 g10) -> {
            L.p(this, "this$0");
            L.p(g10, "<anonymous parameter 0>");
            this.F();
        };
        this.u = (g1 g10) -> {
            L.p(this, "this$0");
            L.p(g10, "<anonymous parameter 0>");
            this.E();
        };
        this.w(context0);
    }

    // 检测为 Lambda 实现
    private static final void A(UserView userView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void B(View view0) [...]

    // 检测为 Lambda 实现
    private static final void C(UserView userView0, g1 g10) [...]

    private final void D() {
        g1 g11;
        g1 g10 = this.s;
        B b0 = null;
        if(g10 == null) {
            g11 = null;
        }
        else {
            RealmQuery realmQuery0 = g10.x4();
            if(realmQuery0 == null) {
                g11 = null;
            }
            else {
                RealmQuery realmQuery1 = realmQuery0.b0("flagChoose", Boolean.TRUE);
                g11 = realmQuery1 == null ? null : realmQuery1.p0();
            }
        }
        if(g11 != null && g11.s() && g11.size() > 0) {
            b0 = (B)g11.first();
        }
        if(b0 == null) {
            return;
        }
        b b$b0 = B.E;
        if(b$b0.S(b0.a6())) {
            Context context0 = this.getContext();
            if(context0 instanceof AppCompatActivity) {
                c.a(context0, new k(b$b0.a0(b0.i6()), b$b0.b0(b0.b6())));
            }
        }
    }

    private final void E() {
        this.H();
    }

    private final void F() {
        this.H();
    }

    private final void G() {
        g1 g10 = this.s;
        if(g10 != null) {
            L.m(g10);
            if(g10.e0()) {
                g1 g11 = this.s;
                L.m(g11);
                if(g11.size() > 0) {
                    Context context0 = this.getContext();
                    if(context0 instanceof d) {
                        d.y1(((d)context0), 0, null, null, 0, false, 0x1F, null);
                    }
                }
                else {
                    Context context1 = this.getContext();
                    Intent intent0 = LoginActivity.x.b(context1, false);
                    this.getContext().startActivity(intent0);
                }
            }
        }
    }

    private final void H() {
        g1 g10 = this.s;
        if(g10 == null || !g10.isEmpty() != 1) {
            this.l(true);
        }
        else {
            B b0 = (B)g10.x4().b0("flagChoose", Boolean.TRUE).r0();
            TextView textView0 = null;
            if(b0 == null) {
                ImageView imageView2 = this.d;
                if(imageView2 == null) {
                    L.S("icon");
                    imageView2 = null;
                }
                imageView2.setImageResource(0x7F08034F);  // drawable:ico_setting_simple_login
                TextView textView6 = this.h;
                if(textView6 == null) {
                    L.S("loginState");
                    textView6 = null;
                }
                textView6.setText("");
                TextView textView7 = this.h;
                if(textView7 == null) {
                    L.S("loginState");
                }
                else {
                    textView0 = textView7;
                }
                textView0.setVisibility(8);
                this.l(false);
            }
            else {
                this.setGallerCon(l.b.a(b0));
                TextView textView1 = this.c;
                if(textView1 == null) {
                    L.S("sub");
                    textView1 = null;
                }
                textView1.setText("");
                TextView textView2 = this.b;
                if(textView2 == null) {
                    L.S("name");
                    textView2 = null;
                }
                textView2.setText(b0.m6());
                ImageView imageView0 = this.d;
                if(imageView0 == null) {
                    L.S("icon");
                    imageView0 = null;
                }
                imageView0.setImageResource(0x7F08034F);  // drawable:ico_setting_simple_login
                TextView textView3 = this.h;
                if(textView3 == null) {
                    L.S("loginState");
                    textView3 = null;
                }
                textView3.setText("");
                TextView textView4 = this.h;
                if(textView4 == null) {
                    L.S("loginState");
                    textView4 = null;
                }
                textView4.setVisibility(8);
                ImageView imageView1 = this.a;
                if(imageView1 == null) {
                    L.S("profileIcon");
                    imageView1 = null;
                }
                TextView textView5 = this.e;
                if(textView5 == null) {
                    L.S("profileName");
                }
                else {
                    textView0 = textView5;
                }
                this.n(b0, imageView1, textView0);
            }
        }
        this.o();
        this.m();
    }

    private final void I() {
        static final class com.dcinside.app.view.UserView.b extends N implements Function1 {
            final UserView e;

            com.dcinside.app.view.UserView.b(UserView userView0) {
                this.e = userView0;
                super(1);
            }

            public final void b(@m String s) {
                Context context0 = this.e.getContext();
                L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                com.dcinside.app.main.a.j(((AppCompatActivity)context0), s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        B b0;
        g1 g10 = this.s;
        if(g10 != null) {
            L.m(g10);
            if(g10.e0()) {
                g1 g11 = this.s;
                if(g11 == null) {
                    b0 = null;
                }
                else {
                    RealmQuery realmQuery0 = g11.x4();
                    if(realmQuery0 == null) {
                        b0 = null;
                    }
                    else {
                        RealmQuery realmQuery1 = realmQuery0.b0("flagChoose", Boolean.TRUE);
                        b0 = realmQuery1 == null ? null : ((B)realmQuery1.r0());
                    }
                }
                if(b0 != null) {
                    uk.uk(b0.r6()).y5((Object object0) -> {
                        L.p(new com.dcinside.app.view.UserView.b(this), "$tmp0");
                        new com.dcinside.app.view.UserView.b(this).invoke(object0);
                    }, (Throwable throwable0) -> {
                        L.p(this, "this$0");
                        L.p(throwable0, "error");
                        Dl.G(this.getContext(), throwable0.getMessage());
                    });
                    return;
                }
                Context context0 = this.getContext();
                if(context0 instanceof AppCompatActivity) {
                    context0.startActivity(LoginActivity.x.b(context0, true));
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void J(UserView userView0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void K(Function1 function10, Object object0) [...]

    private final void l(boolean z) {
        ImageView imageView0 = this.g;
        TextView textView0 = null;
        if(imageView0 == null) {
            L.S("gallog");
            imageView0 = null;
        }
        imageView0.setVisibility(8);
        ImageView imageView1 = this.f;
        if(imageView1 == null) {
            L.S("hitGallog");
            imageView1 = null;
        }
        imageView1.setVisibility(8);
        ImageView imageView2 = this.a;
        if(imageView2 == null) {
            L.S("profileIcon");
            imageView2 = null;
        }
        imageView2.setVisibility(8);
        TextView textView1 = this.e;
        if(textView1 == null) {
            L.S("profileName");
            textView1 = null;
        }
        textView1.setVisibility(8);
        int v = 0;
        if(z) {
            ImageView imageView3 = this.d;
            if(imageView3 == null) {
                L.S("icon");
                imageView3 = null;
            }
            imageView3.setImageResource(0x7F080355);  // drawable:ico_side_login
            TextView textView2 = this.h;
            if(textView2 == null) {
                L.S("loginState");
                textView2 = null;
            }
            textView2.setText(0x7F150537);  // string:login "로그인"
            TextView textView3 = this.h;
            if(textView3 == null) {
                L.S("loginState");
                textView3 = null;
            }
            textView3.setVisibility(0);
        }
        g1 g10 = this.r;
        if(g10 != null) {
            v = g10.size();
        }
        if(v > 0) {
            t t0 = this.r == null ? null : ((t)this.r.first());
            String s = t0 == null ? null : t0.S5();
            if(m0.a.a.j(s)) {
                TextView textView4 = this.b;
                if(textView4 == null) {
                    L.S("name");
                    textView4 = null;
                }
                textView4.setText(s);
                TextView textView5 = this.c;
                if(textView5 == null) {
                    L.S("sub");
                }
                else {
                    textView0 = textView5;
                }
                textView0.setText(0x7F150B63);  // string:user_guest "(비로그인)"
                return;
            }
        }
        TextView textView6 = this.c;
        if(textView6 == null) {
            L.S("sub");
            textView6 = null;
        }
        textView6.setText("");
        TextView textView7 = this.b;
        if(textView7 == null) {
            L.S("name");
        }
        else {
            textView0 = textView7;
        }
        textView0.setText(0x7F150B66);  // string:user_please_login "로그인해 주세요."
    }

    private final void m() {
        g1 g11;
        View view0 = null;
        if(this.s != null && !this.s.isEmpty()) {
            g1 g10 = this.s;
            if(g10 == null) {
                g11 = null;
            }
            else {
                RealmQuery realmQuery0 = g10.x4();
                if(realmQuery0 == null) {
                    g11 = null;
                }
                else {
                    RealmQuery realmQuery1 = realmQuery0.b0("flagChoose", Boolean.FALSE);
                    if(realmQuery1 == null) {
                        g11 = null;
                    }
                    else {
                        RealmQuery realmQuery2 = realmQuery1.b0("flagSimple", Boolean.TRUE);
                        g11 = realmQuery2 == null ? null : realmQuery2.p0();
                    }
                }
            }
            if((g11 == null ? 0 : g11.size()) > 0) {
                View view1 = this.q;
                if(view1 == null) {
                    L.S("logoutWrap");
                }
                else {
                    view0 = view1;
                }
                view0.setVisibility(8);
                return;
            }
            View view2 = this.q;
            if(view2 == null) {
                L.S("logoutWrap");
                view2 = null;
            }
            view2.setVisibility(0);
            View view3 = this.i;
            if(view3 == null) {
                L.S("simpleLogin0Wrap");
            }
            else {
                view0 = view3;
            }
            view0.setVisibility(0);
            return;
        }
        View view4 = this.q;
        if(view4 == null) {
            L.S("logoutWrap");
        }
        else {
            view0 = view4;
        }
        view0.setVisibility(8);
    }

    private final void n(B b0, ImageView imageView0, TextView textView0) {
        String s = b0.o6();
        if(s != null && s.length() != 0) {
            imageView0.setVisibility(0);
            textView0.setVisibility(8);
            com.dcinside.app.glide.a.l(imageView0).g0().v2(s).U1().q1(imageView0);
            return;
        }
        imageView0.setVisibility(8);
        textView0.setVisibility(0);
        g.a.g(textView0, b0);
    }

    private final void o() {
        TextView textView2;
        ImageView imageView0;
        TextView textView0;
        View view2;
        this.t();
        View view0 = this.i;
        if(view0 == null) {
            L.S("simpleLogin0Wrap");
            view0 = null;
        }
        view0.setVisibility(4);
        View view1 = this.m;
        if(view1 == null) {
            L.S("simpleLogin1Wrap");
            view1 = null;
        }
        view1.setVisibility(4);
        g1 g10 = this.s;
        if(g10 != null) {
            F0 f00 = g10.h();
            if(f00 != null) {
                L.m(f00);
                Context context0 = this.getContext();
                AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
                if(appCompatActivity0 != null) {
                    int v = 0;
                    for(Object object0: g10) {
                        B b0 = (B)object0;
                        if(!b0.f6()) {
                            if(v >= 2) {
                                break;
                            }
                            if(v == 0) {
                                ArrayList arrayList0 = new ArrayList();
                                for(Object object1: g10) {
                                    if(!((B)object1).f6()) {
                                        arrayList0.add(object1);
                                    }
                                }
                                if(arrayList0.size() > 1) {
                                    view2 = this.i;
                                    if(view2 == null) {
                                        L.S("simpleLogin0Wrap");
                                        view2 = null;
                                    }
                                    textView0 = this.j;
                                    if(textView0 == null) {
                                        L.S("simpleLogin0Id");
                                        textView0 = null;
                                    }
                                    imageView0 = this.k;
                                    if(imageView0 == null) {
                                        L.S("simpleLogin0Icon");
                                        imageView0 = null;
                                    }
                                    TextView textView1 = this.l;
                                    if(textView1 == null) {
                                        L.S("simpleLogin0Name");
                                        textView2 = null;
                                    }
                                    else {
                                        textView2 = textView1;
                                    }
                                }
                                else {
                                    view2 = this.m;
                                    if(view2 == null) {
                                        L.S("simpleLogin1Wrap");
                                        view2 = null;
                                    }
                                    TextView textView3 = this.n;
                                    if(textView3 == null) {
                                        L.S("simpleLogin1Id");
                                        textView3 = null;
                                    }
                                    ImageView imageView1 = this.o;
                                    if(imageView1 == null) {
                                        L.S("simpleLogin1Icon");
                                        imageView0 = null;
                                    }
                                    else {
                                        imageView0 = imageView1;
                                    }
                                    textView2 = this.p;
                                    if(textView2 == null) {
                                        L.S("simpleLogin1Name");
                                        textView2 = null;
                                    }
                                    textView0 = textView3;
                                }
                                view2.setOnClickListener((View view0) -> {
                                    L.p(appCompatActivity0, "$activity");
                                    L.p(f00, "$realm");
                                    L.m(b0);
                                    g.a.h(appCompatActivity0, b0, f00, true, null);
                                });
                                view2.setVisibility(0);
                                textView0.setText(this.u(b0.r6()));
                                L.m(b0);
                                this.n(b0, imageView0, textView2);
                            }
                            else {
                                View view3 = this.m;
                                if(view3 == null) {
                                    L.S("simpleLogin1Wrap");
                                    view3 = null;
                                }
                                view3.setOnClickListener((View view0) -> {
                                    L.p(appCompatActivity0, "$activity");
                                    L.p(f00, "$realm");
                                    L.m(b0);
                                    g.a.h(appCompatActivity0, b0, f00, true, null);
                                });
                                View view4 = this.m;
                                if(view4 == null) {
                                    L.S("simpleLogin1Wrap");
                                    view4 = null;
                                }
                                view4.setVisibility(0);
                                TextView textView4 = this.n;
                                if(textView4 == null) {
                                    L.S("simpleLogin1Id");
                                    textView4 = null;
                                }
                                textView4.setText(this.u(b0.r6()));
                                L.m(b0);
                                ImageView imageView2 = this.o;
                                if(imageView2 == null) {
                                    L.S("simpleLogin1Icon");
                                    imageView2 = null;
                                }
                                TextView textView5 = this.p;
                                if(textView5 == null) {
                                    L.S("simpleLogin1Name");
                                    textView5 = null;
                                }
                                this.n(b0, imageView2, textView5);
                            }
                            ++v;
                        }
                    }
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void p(AppCompatActivity appCompatActivity0, B b0, F0 f00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void q(AppCompatActivity appCompatActivity0, B b0, F0 f00, View view0) [...]

    public final void r(@m F0 f00) {
        g1 g10 = this.s;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.s = null;
        g1 g11 = this.r;
        if(g11 != null) {
            if(!g11.s()) {
                g11 = null;
            }
            if(g11 != null) {
                g11.D();
            }
        }
        this.r = null;
        if(f00 != null) {
            g1 g12 = f00.C4(B.class).g2("lastLoginTime", r1.c).p0();
            this.s = g12;
            if(g12 != null) {
                g12.l(this.t);
            }
            g1 g13 = f00.C4(t.class).b0("enabled", Boolean.TRUE).p0();
            this.r = g13;
            if(g13 != null) {
                g13.l(this.u);
            }
        }
        this.H();
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        g1 g10 = this.s;
        if(g10 != null) {
            L.m(g10);
            if(g10.s()) {
                g1 g11 = this.s;
                L.m(g11);
                g11.D();
                this.s = null;
            }
        }
        g1 g12 = this.r;
        if(g12 != null) {
            L.m(g12);
            if(g12.s()) {
                g1 g13 = this.r;
                L.m(g13);
                g13.D();
                this.r = null;
            }
        }
    }

    public final void s() {
        g1 g11;
        g1 g10 = this.s;
        B b0 = null;
        if(g10 == null) {
            g11 = null;
        }
        else {
            RealmQuery realmQuery0 = g10.x4();
            if(realmQuery0 == null) {
                g11 = null;
            }
            else {
                RealmQuery realmQuery1 = realmQuery0.b0("flagChoose", Boolean.TRUE);
                g11 = realmQuery1 == null ? null : realmQuery1.p0();
            }
        }
        if(g11 != null && g11.s() && g11.size() > 0) {
            b0 = (B)g11.first();
        }
        if(b0 == null) {
            return;
        }
        this.setGallerCon(l.b.a(b0));
    }

    private final void setGallerCon(l l0) {
        ImageView imageView0 = null;
        switch(l0) {
            case 1: 
            case 2: {
                ImageView imageView1 = this.g;
                if(imageView1 == null) {
                    L.S("gallog");
                    imageView1 = null;
                }
                imageView1.setVisibility(0);
                ImageView imageView2 = this.f;
                if(imageView2 == null) {
                    L.S("hitGallog");
                    imageView2 = null;
                }
                imageView2.setVisibility(8);
                ImageView imageView3 = this.g;
                if(imageView3 == null) {
                    L.S("gallog");
                }
                else {
                    imageView0 = imageView3;
                }
                imageView0.setImageResource(l0.c());
                return;
            }
            case 3: 
            case 4: {
                ImageView imageView4 = this.g;
                if(imageView4 == null) {
                    L.S("gallog");
                    imageView4 = null;
                }
                imageView4.setVisibility(8);
                ImageView imageView5 = this.f;
                if(imageView5 == null) {
                    L.S("hitGallog");
                    imageView5 = null;
                }
                imageView5.setVisibility(0);
                ImageView imageView6 = this.f;
                if(imageView6 == null) {
                    L.S("hitGallog");
                }
                else {
                    imageView0 = imageView6;
                }
                imageView0.setImageResource(l0.c());
            }
        }
    }

    private final void t() {
        TextView textView0 = this.j;
        if(textView0 == null) {
            L.S("simpleLogin0Id");
            textView0 = null;
        }
        textView0.setText("");
        ImageView imageView0 = this.k;
        if(imageView0 == null) {
            L.S("simpleLogin0Icon");
            imageView0 = null;
        }
        s.b(imageView0);
        TextView textView1 = this.l;
        if(textView1 == null) {
            L.S("simpleLogin0Name");
            textView1 = null;
        }
        textView1.setText("");
        TextView textView2 = this.n;
        if(textView2 == null) {
            L.S("simpleLogin1Id");
            textView2 = null;
        }
        textView2.setText("");
        ImageView imageView1 = this.o;
        if(imageView1 == null) {
            L.S("simpleLogin1Icon");
            imageView1 = null;
        }
        s.b(imageView1);
        TextView textView3 = this.p;
        if(textView3 == null) {
            L.S("simpleLogin1Name");
            textView3 = null;
        }
        textView3.setText("");
        TextView textView4 = this.l;
        if(textView4 == null) {
            L.S("simpleLogin0Name");
            textView4 = null;
        }
        textView4.setBackground(null);
        TextView textView5 = this.p;
        if(textView5 == null) {
            L.S("simpleLogin1Name");
            textView5 = null;
        }
        textView5.setBackground(null);
    }

    private final String u(String s) {
        return s == null ? null : com.dcinside.app.internal.l.h(s, 5, null, 2, null);
    }

    // 检测为 Lambda 实现
    private static final void v(UserView userView0, g1 g10) [...]

    private final void w(Context context0) {
        if(this.isInEditMode()) {
            return;
        }
        this.setGravity(17);
        this.setOrientation(1);
        this.setShowDividers(2);
        View.inflate(context0, 0x7F0E02AC, this);  // layout:view_user
        View view0 = this.findViewById(0x7F0B1035);  // id:user_profile_icon
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
        View view1 = this.findViewById(0x7F0B1045);  // id:user_text_nick
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = this.findViewById(0x7F0B1046);  // id:user_text_sub
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = this.findViewById(0x7F0B0FFD);  // id:user_icon
        L.o(view3, "findViewById(...)");
        this.d = (ImageView)view3;
        View view4 = this.findViewById(0x7F0B0FFB);  // id:user_gallog
        L.o(view4, "findViewById(...)");
        this.g = (ImageView)view4;
        View view5 = this.findViewById(0x7F0B0FFC);  // id:user_hit_gallog
        L.o(view5, "findViewById(...)");
        this.f = (ImageView)view5;
        View view6 = this.findViewById(0x7F0B0FFF);  // id:user_login_out_text
        L.o(view6, "findViewById(...)");
        this.h = (TextView)view6;
        View view7 = this.findViewById(0x7F0B1039);  // id:user_simple_login_0
        L.o(view7, "findViewById(...)");
        this.i = view7;
        View view8 = this.findViewById(0x7F0B103D);  // id:user_simple_login_id_0
        L.o(view8, "findViewById(...)");
        this.j = (TextView)view8;
        View view9 = this.findViewById(0x7F0B103F);  // id:user_simple_login_image_0
        L.o(view9, "findViewById(...)");
        this.k = (ImageView)view9;
        View view10 = this.findViewById(0x7F0B103A);  // id:user_simple_login_1
        L.o(view10, "findViewById(...)");
        this.m = view10;
        View view11 = this.findViewById(0x7F0B103E);  // id:user_simple_login_id_1
        L.o(view11, "findViewById(...)");
        this.n = (TextView)view11;
        View view12 = this.findViewById(0x7F0B1040);  // id:user_simple_login_image_1
        L.o(view12, "findViewById(...)");
        this.o = (ImageView)view12;
        View view13 = this.findViewById(0x7F0B1036);  // id:user_profile_name
        L.o(view13, "findViewById(...)");
        this.e = (TextView)view13;
        View view14 = this.findViewById(0x7F0B1042);  // id:user_simple_login_name_0
        L.o(view14, "findViewById(...)");
        this.l = (TextView)view14;
        View view15 = this.findViewById(0x7F0B1043);  // id:user_simple_login_name_1
        L.o(view15, "findViewById(...)");
        this.p = (TextView)view15;
        View view16 = this.findViewById(0x7F0B1001);  // id:user_logout_wrap
        L.o(view16, "findViewById(...)");
        this.q = view16;
        ImageView imageView0 = this.g;
        View view17 = null;
        if(imageView0 == null) {
            L.S("gallog");
            imageView0 = null;
        }
        imageView0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.D();
        });
        ImageView imageView1 = this.f;
        if(imageView1 == null) {
            L.S("hitGallog");
            imageView1 = null;
        }
        imageView1.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.D();
        });
        TextView textView0 = this.b;
        if(textView0 == null) {
            L.S("name");
            textView0 = null;
        }
        textView0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.I();
        });
        View view18 = this.findViewById(0x7F0B0FFE);  // id:user_login_out
        if(view18 != null) {
            view18.setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                this.G();
            });
        }
        View view19 = this.q;
        if(view19 == null) {
            L.S("logoutWrap");
        }
        else {
            view17 = view19;
        }
        view17.setOnClickListener((View view0) -> B.E.X());
        if(dl.a.q2().l()) {
            ImageView imageView2 = (ImageView)this.findViewById(0x7F0B1037);  // id:user_setting_icon
            ImageView imageView3 = (ImageView)this.findViewById(0x7F0B0FFA);  // id:user_dark_icon
            ImageView imageView4 = (ImageView)this.findViewById(0x7F0B1034);  // id:user_notification_push
            if(imageView2 != null) {
                imageView2.setImageResource(0x7F080359);  // drawable:ico_side_settings_line
            }
            if(imageView3 != null) {
                imageView3.setImageResource(0x7F080358);  // drawable:ico_side_night_line
            }
            if(imageView4 != null) {
                imageView4.setImageResource(0x7F0802E9);  // drawable:ic_side_notification
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void x(UserView userView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void y(UserView userView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void z(UserView userView0, View view0) [...]
}

