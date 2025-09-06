package com.dcinside.app.write.temp;

import A3.q;
import Y.a0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.j0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nPostTempActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostTempActivity.kt\ncom/dcinside/app/write/temp/PostTempActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,309:1\n257#2,2:310\n257#2,2:312\n257#2,2:314\n257#2,2:316\n257#2,2:318\n257#2,2:320\n257#2,2:322\n257#2,2:324\n257#2,2:326\n*S KotlinDebug\n*F\n+ 1 PostTempActivity.kt\ncom/dcinside/app/write/temp/PostTempActivity\n*L\n233#1:310,2\n238#1:312,2\n239#1:314,2\n240#1:316,2\n241#1:318,2\n242#1:320,2\n243#1:322,2\n261#1:324,2\n263#1:326,2\n*E\n"})
public final class PostTempActivity extends d implements a {
    public static final class com.dcinside.app.write.temp.PostTempActivity.a {
        private com.dcinside.app.write.temp.PostTempActivity.a() {
        }

        public com.dcinside.app.write.temp.PostTempActivity.a(w w0) {
        }
    }

    @l
    public static final String A = "com.dcinside.app.extra.TIME";
    @l
    public static final String B = "com.dcinside.app.extra.AUTO_SAVE";
    private a0 u;
    @l
    private final k v;
    private boolean w;
    @l
    private final D x;
    @l
    public static final com.dcinside.app.write.temp.PostTempActivity.a y = null;
    @l
    public static final String z = "com.dcinside.app.extra.SHOULD_ALERT";

    static {
        PostTempActivity.y = new com.dcinside.app.write.temp.PostTempActivity.a(null);
    }

    public PostTempActivity() {
        static final class b extends N implements A3.a {
            final PostTempActivity e;

            b(PostTempActivity postTempActivity0) {
                this.e = postTempActivity0;
                super(0);
            }

            @l
            public final i b() {
                return new i(this.e.v);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        this.v = new k(this);
        this.x = E.a(new b(this));
    }

    @Override  // com.dcinside.app.write.temp.k$a
    public void D(@l k k0, int v) {
        L.p(k0, "manager");
        this.Y1();
        this.b2();
        this.Z1();
        this.W1().notifyDataSetChanged();
    }

    @Override  // com.dcinside.app.write.temp.k$a
    public void H(@l k k0) {
        L.p(k0, "manager");
        this.Y1();
    }

    private final void U1(boolean z, boolean z1) {
        ColorStateList colorStateList0;
        dl dl0 = dl.a;
        dl0.P3(z);
        if(z && !z1) {
            this.o2();
        }
        a0 a00 = this.u;
        if(a00 == null) {
            L.S("binding");
            a00 = null;
        }
        ImageView imageView0 = a00.b;
        L.o(imageView0, "postTempAutoSaveEnable");
        imageView0.setSelected(z);
        imageView0.setImageResource((z ? 0x7F08031F : 0x7F08031E));  // drawable:ico_checkbox_checked
        imageView0.setAlpha((dl0.q2().l() || dl0.q2().p() || z ? 1.0f : 0.4f));
        if(dl0.q2().l()) {
            colorStateList0 = ContextCompat.getColorStateList(this, 0x7F060127);  // color:gray
        }
        else if(dl0.q2().p()) {
            colorStateList0 = ContextCompat.getColorStateList(this, 0x7F0605B8);  // color:white
        }
        else {
            colorStateList0 = z ? ContextCompat.getColorStateList(this, 0x7F06012D) : vk.c(this, 0x7F04032A);  // color:grey5
        }
        ImageViewCompat.c(imageView0, colorStateList0);
    }

    @Override  // com.dcinside.app.write.temp.k$a
    public void V(@l k k0, boolean z) {
        L.p(k0, "manager");
        this.a2();
        this.Y1();
        this.X1();
        this.b2();
        this.Z1();
        this.W1().notifyDataSetChanged();
    }

    private final void V1(long v, boolean z) {
        Intent intent0 = new Intent();
        intent0.putExtra("com.dcinside.app.extra.TIME", v);
        intent0.putExtra("com.dcinside.app.extra.AUTO_SAVE", z);
        this.setResult(-1, intent0);
        this.finish();
    }

    private final i W1() {
        return (i)this.x.getValue();
    }

    private final void X1() {
        boolean z = this.v.k();
        a0 a00 = this.u;
        a0 a01 = null;
        if(a00 == null) {
            L.S("binding");
            a00 = null;
        }
        L.o(a00.c, "postTempAutoSaveEnableWrap");
        int v = 8;
        a00.c.setVisibility((z ? 8 : 0));
        a0 a02 = this.u;
        if(a02 == null) {
            L.S("binding");
            a02 = null;
        }
        L.o(a02.i, "postTempEdit");
        a02.i.setVisibility((z ? 8 : 0));
        a0 a03 = this.u;
        if(a03 == null) {
            L.S("binding");
            a03 = null;
        }
        L.o(a03.f, "postTempCheckAllTitle");
        a03.f.setVisibility((z ? 0 : 8));
        a0 a04 = this.u;
        if(a04 == null) {
            L.S("binding");
            a04 = null;
        }
        L.o(a04.e, "postTempCheckAll");
        a04.e.setVisibility((z ? 0 : 8));
        a0 a05 = this.u;
        if(a05 == null) {
            L.S("binding");
            a05 = null;
        }
        L.o(a05.g, "postTempDeleteAllText");
        a05.g.setVisibility((z ? 0 : 8));
        a0 a06 = this.u;
        if(a06 == null) {
            L.S("binding");
        }
        else {
            a01 = a06;
        }
        View view0 = a01.h;
        L.o(view0, "postTempDiv");
        if(z) {
            v = 0;
        }
        view0.setVisibility(v);
    }

    private final void Y1() {
        @f(c = "com.dcinside.app.write.temp.PostTempActivity$invalidateEditSections$1", f = "PostTempActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements q {
            int k;
            boolean l;
            final PostTempActivity m;

            c(PostTempActivity postTempActivity0, kotlin.coroutines.d d0) {
                this.m = postTempActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                c postTempActivity$c0 = new c(this.m, d0);
                postTempActivity$c0.l = z;
                return postTempActivity$c0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.d2(this.l);
                return S0.a;
            }
        }

        a0 a00 = this.u;
        a0 a01 = null;
        if(a00 == null) {
            L.S("binding");
            a00 = null;
        }
        a00.e.setOnCheckedChangeListener(null);
        a0 a02 = this.u;
        if(a02 == null) {
            L.S("binding");
            a02 = null;
        }
        boolean z = this.v.j();
        a02.e.setChecked(z);
        a0 a03 = this.u;
        if(a03 == null) {
            L.S("binding");
            a03 = null;
        }
        L.o(a03.e, "postTempCheckAll");
        c postTempActivity$c0 = new c(this, null);
        r.J(a03.e, null, postTempActivity$c0, 1, null);
        if(this.v.e() > 0) {
            a0 a04 = this.u;
            if(a04 == null) {
                L.S("binding");
            }
            else {
                a01 = a04;
            }
            int v = vk.b(this, 0x1010036);
            a01.g.setTextColor(v);
            return;
        }
        a0 a05 = this.u;
        if(a05 == null) {
            L.S("binding");
        }
        else {
            a01 = a05;
        }
        int v1 = vk.b(this, 0x7F04023D);  // attr:disabledColor
        a01.g.setTextColor(v1);
    }

    private final void Z1() {
        a0 a00 = this.u;
        if(a00 == null) {
            L.S("binding");
            a00 = null;
        }
        L.o(a00.j, "postTempEmpty");
        int v = this.v.g() == 0 ? 0 : 8;
        a00.j.setVisibility(v);
    }

    private final void a2() {
        int v = 8;
        a0 a00 = null;
        if(this.v.k()) {
            a0 a01 = this.u;
            if(a01 == null) {
                L.S("binding");
            }
            else {
                a00 = a01;
            }
            L.o(a00.k, "postTempMaxCount");
            a00.k.setVisibility(8);
            return;
        }
        a0 a02 = this.u;
        if(a02 == null) {
            L.S("binding");
        }
        else {
            a00 = a02;
        }
        FrameLayout frameLayout0 = a00.k;
        L.o(frameLayout0, "postTempMaxCount");
        if(dl.a.X2()) {
            v = 0;
        }
        frameLayout0.setVisibility(v);
    }

    private final void b2() {
        a0 a00 = null;
        if(this.v.k()) {
            a0 a01 = this.u;
            if(a01 == null) {
                L.S("binding");
                a01 = null;
            }
            a01.r.setTitle(0x7F150A17);  // string:temporary_edit_title "임시 - 편집"
            a0 a02 = this.u;
            if(a02 == null) {
                L.S("binding");
                a02 = null;
            }
            a02.r.setInfoTitle(null);
            return;
        }
        a0 a03 = this.u;
        if(a03 == null) {
            L.S("binding");
            a03 = null;
        }
        a03.r.setTitle(0x7F150A1B);  // string:temporary_save "임시"
        a0 a04 = this.u;
        if(a04 == null) {
            L.S("binding");
        }
        else {
            a00 = a04;
        }
        String s = String.valueOf(this.v.h());
        a00.r.setInfoTitle(s);
    }

    private final void c2() {
        a0 a00 = this.u;
        a0 a01 = null;
        if(a00 == null) {
            L.S("binding");
            a00 = null;
        }
        ImageView imageView0 = a00.b;
        a0 a02 = this.u;
        if(a02 == null) {
            L.S("binding");
            a02 = null;
        }
        imageView0.setSelected(!a02.b.isSelected());
        a0 a03 = this.u;
        if(a03 == null) {
            L.S("binding");
        }
        else {
            a01 = a03;
        }
        this.U1(a01.b.isSelected(), false);
    }

    private final void d2(boolean z) {
        this.v.n(z);
        this.W1().notifyDataSetChanged();
    }

    private final void e2() {
        static final class com.dcinside.app.write.temp.PostTempActivity.d extends N implements Function1 {
            final PostTempActivity e;
            final int f;

            com.dcinside.app.write.temp.PostTempActivity.d(PostTempActivity postTempActivity0, int v) {
                this.e = postTempActivity0;
                this.f = v;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e.getString(0x7F150A15, new Object[]{this.f}));  // string:temporary_edit_delete_all_confirm "총 %1$d개의 임시 저장 글이 삭제됩니다. 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
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


        static final class com.dcinside.app.write.temp.PostTempActivity.f extends N implements Function1 {
            final PostTempActivity e;

            com.dcinside.app.write.temp.PostTempActivity.f(PostTempActivity postTempActivity0) {
                this.e = postTempActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.v.c();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        int v = this.v.e();
        if(v == 0) {
            return;
        }
        com.dcinside.app.perform.e.e.a(this).n(new com.dcinside.app.write.temp.PostTempActivity.d(this, v)).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(e.e, "$tmp0");
            return (Boolean)e.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.temp.PostTempActivity.f(this), "$tmp0");
            new com.dcinside.app.write.temp.PostTempActivity.f(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean f2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void g2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final boolean h2(PostTempActivity postTempActivity0, View view0, int v) [...]

    private final boolean i2(View view0, int v) {
        static final class com.dcinside.app.write.temp.PostTempActivity.m extends N implements Function1 {
            public static final com.dcinside.app.write.temp.PostTempActivity.m e;

            static {
                com.dcinside.app.write.temp.PostTempActivity.m.e = new com.dcinside.app.write.temp.PostTempActivity.m();
            }

            com.dcinside.app.write.temp.PostTempActivity.m() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1507E5);  // string:post_temp_delete_confirm "삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class n extends N implements Function1 {
            public static final n e;

            static {
                n.e = new n();
            }

            n() {
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


        static final class com.dcinside.app.write.temp.PostTempActivity.o extends N implements Function1 {
            final PostTempActivity e;
            final int f;

            com.dcinside.app.write.temp.PostTempActivity.o(PostTempActivity postTempActivity0, int v) {
                this.e = postTempActivity0;
                this.f = v;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.W1().w(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }


        static final class p extends N implements Function1 {
            public static final p e;

            static {
                p.e = new p();
            }

            p() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1507E7);  // string:post_temp_load_confirm "작성 중인 글은 삭제됩니다.\n임시저장글을 불러오시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.temp.PostTempActivity.q extends N implements Function1 {
            public static final com.dcinside.app.write.temp.PostTempActivity.q e;

            static {
                com.dcinside.app.write.temp.PostTempActivity.q.e = new com.dcinside.app.write.temp.PostTempActivity.q();
            }

            com.dcinside.app.write.temp.PostTempActivity.q() {
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


        static final class com.dcinside.app.write.temp.PostTempActivity.r extends N implements Function1 {
            final PostTempActivity e;
            final long f;
            final boolean g;

            com.dcinside.app.write.temp.PostTempActivity.r(PostTempActivity postTempActivity0, long v, boolean z) {
                this.e = postTempActivity0;
                this.f = v;
                this.g = z;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.V1(this.f, this.g);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        j0 j00 = this.v.f(v);
        boolean z = false;
        if(j00 == null) {
            return false;
        }
        if(view0.getId() == 0x7F0B0B23) {  // id:post_temp_delete_wrap
            com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.write.temp.PostTempActivity.m.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                L.p(n.e, "$tmp0");
                return (Boolean)n.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.write.temp.PostTempActivity.o(this, v), "$tmp0");
                new com.dcinside.app.write.temp.PostTempActivity.o(this, v).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                Dl.D(this, 0x7F1507E6);  // string:post_temp_delete_fail "임시저장글 삭제를 실패했습니다."
            });
            return true;
        }
        if(this.v.k()) {
            boolean z1 = this.v.i(j00);
            this.v.m(!z1, j00);
            this.W1().notifyItemChanged(v);
            this.Y1();
            return true;
        }
        j0 j01 = this.W1().v(v);
        if(j01 != null && j01.s()) {
            long v1 = j01.T5();
            if(j01.S5() == 1L) {
                z = true;
            }
            if(this.w) {
                com.dcinside.app.perform.e.e.a(this).n(p.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                    L.p(com.dcinside.app.write.temp.PostTempActivity.q.e, "$tmp0");
                    return (Boolean)com.dcinside.app.write.temp.PostTempActivity.q.e.invoke(object0);
                }).x5((Object object0) -> {
                    L.p(new com.dcinside.app.write.temp.PostTempActivity.r(this, v1, z), "$tmp0");
                    new com.dcinside.app.write.temp.PostTempActivity.r(this, v1, z).invoke(object0);
                });
                return true;
            }
            this.V1(v1, z);
            return true;
        }
        return false;
    }

    // 检测为 Lambda 实现
    private static final Boolean j2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void k2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void l2(PostTempActivity postTempActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final Boolean m2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void n2(Function1 function10, Object object0) [...]

    private final void o2() {
        public static final class s extends AnimatorListenerAdapter {
            final PostTempActivity a;

            s(PostTempActivity postTempActivity0) {
                this.a = postTempActivity0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(@l Animator animator0) {
                public static final class com.dcinside.app.write.temp.PostTempActivity.s.a extends AnimatorListenerAdapter {
                    final PostTempActivity a;

                    com.dcinside.app.write.temp.PostTempActivity.s.a(PostTempActivity postTempActivity0) {
                        this.a = postTempActivity0;
                        super();
                    }

                    @Override  // android.animation.AnimatorListenerAdapter
                    public void onAnimationEnd(@l Animator animator0) {
                        L.p(animator0, "animation");
                        a0 a00 = this.a.u;
                        if(a00 == null) {
                            L.S("binding");
                            a00 = null;
                        }
                        a00.p.setVisibility(8);
                    }
                }

                L.p(animator0, "animation");
                a0 a00 = this.a.u;
                if(a00 == null) {
                    L.S("binding");
                    a00 = null;
                }
                a00.p.animate().setStartDelay(2000L).setListener(new com.dcinside.app.write.temp.PostTempActivity.s.a(this.a)).alpha(0.0f).setDuration(800L);
            }
        }

        a0 a00 = this.u;
        a0 a01 = null;
        if(a00 == null) {
            L.S("binding");
            a00 = null;
        }
        ViewPropertyAnimator viewPropertyAnimator0 = a00.p.animate();
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
        }
        a0 a02 = this.u;
        if(a02 == null) {
            L.S("binding");
            a02 = null;
        }
        a02.p.setAlpha(0.0f);
        a0 a03 = this.u;
        if(a03 == null) {
            L.S("binding");
            a03 = null;
        }
        a03.p.setVisibility(0);
        a0 a04 = this.u;
        if(a04 == null) {
            L.S("binding");
        }
        else {
            a01 = a04;
        }
        a01.p.animate().setStartDelay(0L).alpha(1.0f).setDuration(800L).setListener(new s(this));
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        if(this.v.k()) {
            this.v.o(false);
            return;
        }
        super.onBackPressed();
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.write.temp.PostTempActivity$onCreate$2", f = "PostTempActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends o implements A3.p {
            int k;
            final PostTempActivity l;

            g(PostTempActivity postTempActivity0, kotlin.coroutines.d d0) {
                this.l = postTempActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                dl.a.d6(false);
                this.l.a2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.temp.PostTempActivity$onCreate$3", f = "PostTempActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends o implements A3.p {
            int k;
            final PostTempActivity l;

            h(PostTempActivity postTempActivity0, kotlin.coroutines.d d0) {
                this.l = postTempActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new h(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.v.o(!this.l.v.k());
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.temp.PostTempActivity$onCreate$4", f = "PostTempActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.temp.PostTempActivity.i extends o implements q {
            int k;
            boolean l;
            final PostTempActivity m;

            com.dcinside.app.write.temp.PostTempActivity.i(PostTempActivity postTempActivity0, kotlin.coroutines.d d0) {
                this.m = postTempActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                com.dcinside.app.write.temp.PostTempActivity.i postTempActivity$i0 = new com.dcinside.app.write.temp.PostTempActivity.i(this.m, d0);
                postTempActivity$i0.l = z;
                return postTempActivity$i0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.d2(this.l);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.temp.PostTempActivity$onCreate$5", f = "PostTempActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends o implements A3.p {
            int k;
            final PostTempActivity l;

            j(PostTempActivity postTempActivity0, kotlin.coroutines.d d0) {
                this.l = postTempActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new j(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                a0 a00 = this.l.u;
                a0 a01 = null;
                if(a00 == null) {
                    L.S("binding");
                    a00 = null;
                }
                CheckBox checkBox0 = a00.e;
                a0 a02 = this.l.u;
                if(a02 == null) {
                    L.S("binding");
                }
                else {
                    a01 = a02;
                }
                checkBox0.setChecked(!a01.e.isChecked());
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.temp.PostTempActivity$onCreate$6", f = "PostTempActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.temp.PostTempActivity.k extends o implements A3.p {
            int k;
            final PostTempActivity l;

            com.dcinside.app.write.temp.PostTempActivity.k(PostTempActivity postTempActivity0, kotlin.coroutines.d d0) {
                this.l = postTempActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.temp.PostTempActivity.k(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.e2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.temp.PostTempActivity$onCreate$7", f = "PostTempActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.temp.PostTempActivity.l extends o implements A3.p {
            int k;
            final PostTempActivity l;

            com.dcinside.app.write.temp.PostTempActivity.l(PostTempActivity postTempActivity0, kotlin.coroutines.d d0) {
                this.l = postTempActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.temp.PostTempActivity.l(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.c2();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        a0 a00 = a0.c(this.getLayoutInflater());
        L.o(a00, "inflate(...)");
        this.u = a00;
        a0 a01 = null;
        if(a00 == null) {
            L.S("binding");
            a00 = null;
        }
        this.setContentView(a00.b());
        a0 a02 = this.u;
        if(a02 == null) {
            L.S("binding");
            a02 = null;
        }
        this.S0(a02.r);
        kr.bhbfhfb.designcompat.a.d(this);
        this.w = this.getIntent().getBooleanExtra("com.dcinside.app.extra.SHOULD_ALERT", false);
        a0 a03 = this.u;
        if(a03 == null) {
            L.S("binding");
            a03 = null;
        }
        a03.o.setHasFixedSize(true);
        a0 a04 = this.u;
        if(a04 == null) {
            L.S("binding");
            a04 = null;
        }
        i i0 = this.W1();
        a04.o.setAdapter(i0);
        a0 a05 = this.u;
        if(a05 == null) {
            L.S("binding");
            a05 = null;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        a05.o.setLayoutManager(nonPredictiveLayoutManager0);
        a0 a06 = this.u;
        if(a06 == null) {
            L.S("binding");
            a06 = null;
        }
        com.dcinside.app.write.temp.a a0 = (View view0, int v) -> {
            L.p(this, "this$0");
            L.p(view0, "itemView");
            return this.i2(view0, v);
        };
        com.dcinside.app.util.ql.b.f(a06.o, a0);
        Integer integer0 = new com.google.android.material.animation.d().a(0.3f, vk.b(this, 0x1010054), vk.b(this, 0x7F04015E));  // attr:colorPrimaryLight
        L.o(integer0, "evaluate(...)");
        int v = integer0.intValue();
        a0 a07 = this.u;
        if(a07 == null) {
            L.S("binding");
            a07 = null;
        }
        a07.l.setBackgroundColor(v);
        a0 a08 = this.u;
        if(a08 == null) {
            L.S("binding");
            a08 = null;
        }
        String s = this.getString(0x7F150A16, new Object[]{jl.a.L0()});  // string:temporary_edit_max_count_msg "임시 저장 글은 %1$d개까지 보관됩니다."
        a08.n.setText(s);
        a0 a09 = this.u;
        if(a09 == null) {
            L.S("binding");
            a09 = null;
        }
        L.o(a09.m, "postTempMaxCountRemove");
        g postTempActivity$g0 = new g(this, null);
        r.M(a09.m, null, postTempActivity$g0, 1, null);
        a0 a010 = this.u;
        if(a010 == null) {
            L.S("binding");
            a010 = null;
        }
        L.o(a010.i, "postTempEdit");
        h postTempActivity$h0 = new h(this, null);
        r.M(a010.i, null, postTempActivity$h0, 1, null);
        a0 a011 = this.u;
        if(a011 == null) {
            L.S("binding");
            a011 = null;
        }
        L.o(a011.e, "postTempCheckAll");
        com.dcinside.app.write.temp.PostTempActivity.i postTempActivity$i0 = new com.dcinside.app.write.temp.PostTempActivity.i(this, null);
        r.J(a011.e, null, postTempActivity$i0, 1, null);
        a0 a012 = this.u;
        if(a012 == null) {
            L.S("binding");
            a012 = null;
        }
        L.o(a012.f, "postTempCheckAllTitle");
        j postTempActivity$j0 = new j(this, null);
        r.M(a012.f, null, postTempActivity$j0, 1, null);
        a0 a013 = this.u;
        if(a013 == null) {
            L.S("binding");
            a013 = null;
        }
        L.o(a013.g, "postTempDeleteAllText");
        com.dcinside.app.write.temp.PostTempActivity.k postTempActivity$k0 = new com.dcinside.app.write.temp.PostTempActivity.k(this, null);
        r.M(a013.g, null, postTempActivity$k0, 1, null);
        a0 a014 = this.u;
        if(a014 == null) {
            L.S("binding");
            a014 = null;
        }
        L.o(a014.c, "postTempAutoSaveEnableWrap");
        com.dcinside.app.write.temp.PostTempActivity.l postTempActivity$l0 = new com.dcinside.app.write.temp.PostTempActivity.l(this, null);
        r.M(a014.c, null, postTempActivity$l0, 1, null);
        this.U1(dl.a.X(), true);
        this.b2();
        this.Z1();
        this.Y1();
        this.X1();
        this.a2();
        if(dl.a.q2().p()) {
            a0 a015 = this.u;
            if(a015 == null) {
                L.S("binding");
                a015 = null;
            }
            int v1 = ContextCompat.getColor(this, 0x7F0605B8);  // color:white
            a015.r.setInfoTitleTextColor(v1);
            a0 a016 = this.u;
            if(a016 == null) {
                L.S("binding");
            }
            else {
                a01 = a016;
            }
            int v2 = ContextCompat.getColor(this, 0x7F0605B8);  // color:white
            a01.d.setTextColor(v2);
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        this.v.release();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

