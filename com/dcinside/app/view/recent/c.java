package com.dcinside.app.view.recent;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dcinside.app.base.g;
import com.dcinside.app.bookmark.N;
import com.dcinside.app.perform.e;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.dl;
import io.realm.F0;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nRecentMenuAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentMenuAdapter.kt\ncom/dcinside/app/view/recent/RecentMenuAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,64:1\n257#2,2:65\n176#2,2:67\n257#2,2:69\n*S KotlinDebug\n*F\n+ 1 RecentMenuAdapter.kt\ncom/dcinside/app/view/recent/RecentMenuAdapter\n*L\n28#1:65,2\n30#1:67,2\n37#1:69,2\n*E\n"})
public final class c extends N {
    @m
    private final Context d;

    public c(@m Context context0) {
        super(dl.a.N1());
        this.d = context0;
    }

    @Override  // com.dcinside.app.bookmark.N
    protected void C(int v) {
        static final class a extends kotlin.jvm.internal.N implements Function1 {
            final int e;

            a(int v) {
                this.e = v;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class b extends kotlin.jvm.internal.N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class com.dcinside.app.view.recent.c.c extends kotlin.jvm.internal.N implements Function1 {
            final F0 e;
            final com.dcinside.app.realm.s0 f;
            final boolean g;

            com.dcinside.app.view.recent.c.c(F0 f00, com.dcinside.app.realm.s0 s00, boolean z) {
                this.e = f00;
                this.f = s00;
                this.g = z;
                super(1);
            }

            public final void a(Boolean boolean0) {
                com.dcinside.app.realm.s0 s00 = (com.dcinside.app.realm.s0)this.e.C4(com.dcinside.app.realm.s0.class).i0("galleryId", this.f.R5()).r0();
                if(s00 != null) {
                    com.dcinside.app.realm.s0.j.o(this.e, s00, !this.g);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.realm.s0 s00 = (com.dcinside.app.realm.s0)this.x(v);
        if(s00 == null) {
            return;
        }
        g g0 = this.d instanceof g ? ((g)this.d) : null;
        if(g0 == null) {
            return;
        }
        F0 f00 = g0.F1();
        if(f00 == null) {
            return;
        }
        boolean z = s00.U5() > 0;
        e.e.a(g0).n(new a((z ? 0x7F15036A : 0x7F150361))).z(0x7F150273).x(0x1040000).b().Z1((Object object0) -> {
            L.p(b.e, "$tmp0");
            return (Boolean)b.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.view.recent.c.c(f00, s00, z), "$tmp0");
            new com.dcinside.app.view.recent.c.c(f00, s00, z).invoke(object0);
        });
    }

    @m
    public final Context G() {
        return this.d;
    }

    // 检测为 Lambda 实现
    private static final Boolean H(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void I(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.bookmark.N
    protected void w(int v, int v1, int v2, @m TextView textView0, @m ImageView imageView0, @m View view0, @l View view1) {
        L.p(view1, "pinView");
        com.dcinside.app.realm.s0 s00 = (com.dcinside.app.realm.s0)this.x(v2);
        if(s00 == null) {
            return;
        }
        if(textView0 != null) {
            textView0.setText(s00.S5());
        }
        int v3 = 0;
        boolean z = s00.T5() == com.dcinside.app.type.m.i.c();
        boolean z1 = s00.T5() == com.dcinside.app.type.m.j.c();
        if(imageView0 != null) {
            imageView0.setVisibility((z || z1 ? 0 : 8));
        }
        if(z) {
            if(imageView0 != null) {
                imageView0.setPadding(0, 0, 0, 0);
            }
            if(imageView0 != null) {
                imageView0.setImageResource(0x7F080415);  // drawable:mini_gall_ic
            }
        }
        else if(z1) {
            int v4 = Dk.b(0x7F0703C6);  // dimen:person_icon_padding
            if(imageView0 != null) {
                imageView0.setPadding(0, v4, v4, 0);
            }
            if(imageView0 != null) {
                imageView0.setImageResource(0x7F0804A8);  // drawable:person_gall_ic
            }
        }
        if(s00.U5() <= 0) {
            v3 = 8;
        }
        view1.setVisibility(v3);
    }
}

