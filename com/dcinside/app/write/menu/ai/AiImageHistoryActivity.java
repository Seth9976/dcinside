package com.dcinside.app.write.menu.ai;

import A3.p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.AiPromptLoadItem;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.b;
import com.dcinside.app.view.DcToolbar;
import io.realm.F0;
import io.realm.P0;
import io.realm.g1;
import io.realm.r1;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nAiImageHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiImageHistoryActivity.kt\ncom/dcinside/app/write/menu/ai/AiImageHistoryActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n1#2:267\n177#3,9:268\n192#3,7:283\n257#4,2:277\n257#4,2:279\n257#4,2:281\n1863#5,2:290\n*S KotlinDebug\n*F\n+ 1 AiImageHistoryActivity.kt\ncom/dcinside/app/write/menu/ai/AiImageHistoryActivity\n*L\n81#1:268,9\n178#1:283,7\n123#1:277,2\n135#1:279,2\n136#1:281,2\n171#1:290,2\n*E\n"})
public final class AiImageHistoryActivity extends g implements a, w0 {
    public static final class com.dcinside.app.write.menu.ai.AiImageHistoryActivity.a {
        private com.dcinside.app.write.menu.ai.AiImageHistoryActivity.a() {
        }

        public com.dcinside.app.write.menu.ai.AiImageHistoryActivity.a(w w0) {
        }

        public final void a(@l Context context0, @m ActivityResultLauncher activityResultLauncher0, boolean z) {
            L.p(context0, "context");
            Intent intent0 = new Intent(context0, AiImageHistoryActivity.class);
            intent0.putExtra("EXTRA_HAS_INPUT", z);
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }
    }

    @m
    private g1 A;
    @l
    private P0 B;
    @l
    public static final com.dcinside.app.write.menu.ai.AiImageHistoryActivity.a C = null;
    @l
    private static final String D = "EXTRA_HAS_INPUT";
    private Y.a w;
    private boolean x;
    @m
    private S y;
    @l
    private v0 z;

    static {
        AiImageHistoryActivity.C = new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.a(null);
    }

    public AiImageHistoryActivity() {
        this.z = new v0(this);
        this.B = (g1 g10) -> {
            L.p(this, "this$0");
            L.m(g10);
            this.q2(g10);
        };
    }

    @Override  // com.dcinside.app.write.menu.ai.w0
    public void J(@l View view0, int v) {
        static final class j extends N implements Function1 {
            public static final j e;

            static {
                j.e = new j();
            }

            j() {
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


        static final class k extends N implements Function1 {
            public static final k e;

            static {
                k.e = new k();
            }

            k() {
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


        static final class com.dcinside.app.write.menu.ai.AiImageHistoryActivity.l extends N implements Function1 {
            final AiImageHistoryActivity e;
            final b f;
            final int g;

            com.dcinside.app.write.menu.ai.AiImageHistoryActivity.l(AiImageHistoryActivity aiImageHistoryActivity0, b b0, int v) {
                this.e = aiImageHistoryActivity0;
                this.f = b0;
                this.g = v;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.w2(this.f);
                this.e.z.notifyItemRemoved(this.g);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.write.menu.ai.AiImageHistoryActivity.m extends N implements Function1 {
            public static final com.dcinside.app.write.menu.ai.AiImageHistoryActivity.m e;

            static {
                com.dcinside.app.write.menu.ai.AiImageHistoryActivity.m.e = new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.m();
            }

            com.dcinside.app.write.menu.ai.AiImageHistoryActivity.m() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1505CE);  // string:make_ai_load_confirm "작성 중인 프롬프트는 삭제됩니다.\n프롬프트를 불러오시겠습니까?"
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


        static final class o extends N implements Function1 {
            final AiImageHistoryActivity e;
            final b f;

            o(AiImageHistoryActivity aiImageHistoryActivity0, b b0) {
                this.e = aiImageHistoryActivity0;
                this.f = b0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.n2(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        b b0 = this.z.x(v);
        if(view0.getId() == 0x7F0B00D2) {  // id:ai_image_recent_delete_wrap
            e.e.a(this).n(j.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                L.p(k.e, "$tmp0");
                return (Boolean)k.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.l(this, b0, v), "$tmp0");
                new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.l(this, b0, v).invoke(object0);
            }, new com.dcinside.app.write.menu.ai.l());
            return;
        }
        if(view0.getId() == 0x7F0B00D7) {  // id:ai_image_recent_prompt_all
            this.z2(b0);
            return;
        }
        if(this.x) {
            this.z.E(v);
            return;
        }
        if(!b0.s()) {
            return;
        }
        if(this.getIntent().getBooleanExtra("EXTRA_HAS_INPUT", false)) {
            e.e.a(this).n(com.dcinside.app.write.menu.ai.AiImageHistoryActivity.m.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                L.p(n.e, "$tmp0");
                return (Boolean)n.e.invoke(object0);
            }).x5((Object object0) -> {
                L.p(new o(this, b0), "$tmp0");
                new o(this, b0).invoke(object0);
            });
            return;
        }
        this.n2(b0);
    }

    @Override  // com.dcinside.app.write.menu.ai.v0$a
    public void O(boolean z, boolean z1) {
        Y.a a0 = null;
        if(this.z.getItemCount() > 1) {
            Y.a a1 = this.w;
            if(a1 == null) {
                L.S("binding");
                a1 = null;
            }
            a1.b.setChecked(z1);
            Y.a a2 = this.w;
            if(a2 == null) {
                L.S("binding");
            }
            else {
                a0 = a2;
            }
            a0.d.setActivated(z);
            return;
        }
        Y.a a3 = this.w;
        if(a3 == null) {
            L.S("binding");
            a3 = null;
        }
        a3.b.setChecked(false);
        Y.a a4 = this.w;
        if(a4 == null) {
            L.S("binding");
        }
        else {
            a0 = a4;
        }
        a0.d.setActivated(false);
    }

    public static void O1(Throwable throwable0) {
    }

    public static void S1(Throwable throwable0) {
    }

    private final void e2() {
        static final class com.dcinside.app.write.menu.ai.AiImageHistoryActivity.b extends N implements Function1 {
            final AiImageHistoryActivity e;
            final ArrayList f;

            com.dcinside.app.write.menu.ai.AiImageHistoryActivity.b(AiImageHistoryActivity aiImageHistoryActivity0, ArrayList arrayList0) {
                this.e = aiImageHistoryActivity0;
                this.f = arrayList0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e.getString(0x7F15056F, new Object[]{this.f.size()}));  // string:make_ai_delete_prompts_message "총 %d개의 최근 등록 프롬프트가 삭제 됩니다. 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
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


        static final class d extends N implements Function1 {
            final AiImageHistoryActivity e;
            final ArrayList f;

            d(AiImageHistoryActivity aiImageHistoryActivity0, ArrayList arrayList0) {
                this.e = aiImageHistoryActivity0;
                this.f = arrayList0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.i2(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        ArrayList arrayList0 = this.z.w();
        e.e.a(this).n(new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.b(this, arrayList0)).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(c.e, "$tmp0");
            return (Boolean)c.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new d(this, arrayList0), "$tmp0");
            new d(this, arrayList0).invoke(object0);
        }, new i());
    }

    private static final void f2(Throwable throwable0) {
    }

    // 检测为 Lambda 实现
    private static final Boolean g2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void h2(Function1 function10, Object object0) [...]

    private final void i2(ArrayList arrayList0) {
        F0 f00 = this.F1();
        if(f00 != null) {
            f00.Y3((F0 f00) -> {
                L.p(arrayList0, "$list");
                for(Object object0: arrayList0) {
                    ((b)object0).z5();
                }
            });
        }
    }

    // 检测为 Lambda 实现
    private static final void j2(ArrayList arrayList0, F0 f00) [...]

    private final void k2() {
        F0 f00 = this.F1();
        if(f00 == null) {
            this.finish();
            return;
        }
        g1 g10 = f00.C4(b.class).g2("time", r1.c).p0();
        this.A = g10;
        if(g10 != null) {
            g10.l(this.B);
        }
    }

    private final void l2() {
        @f(c = "com.dcinside.app.write.menu.ai.AiImageHistoryActivity$initView$1", f = "AiImageHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageHistoryActivity.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageHistoryActivity l;

            com.dcinside.app.write.menu.ai.AiImageHistoryActivity.e(AiImageHistoryActivity aiImageHistoryActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.y2(!this.l.x);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.AiImageHistoryActivity$initView$2", f = "AiImageHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageHistoryActivity.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageHistoryActivity l;

            com.dcinside.app.write.menu.ai.AiImageHistoryActivity.f(AiImageHistoryActivity aiImageHistoryActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.f(this.l, d0).invokeSuspend(S0.a);
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
                Y.a a0 = this.l.w;
                Y.a a1 = null;
                if(a0 == null) {
                    L.S("binding");
                    a0 = null;
                }
                CheckBox checkBox0 = a0.b;
                Y.a a2 = this.l.w;
                if(a2 == null) {
                    L.S("binding");
                }
                else {
                    a1 = a2;
                }
                checkBox0.setChecked(!a1.b.isChecked());
                this.l.o2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.AiImageHistoryActivity$initView$3", f = "AiImageHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageHistoryActivity.g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageHistoryActivity l;

            com.dcinside.app.write.menu.ai.AiImageHistoryActivity.g(AiImageHistoryActivity aiImageHistoryActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.g(this.l, d0).invokeSuspend(S0.a);
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
                this.l.o2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.AiImageHistoryActivity$initView$4", f = "AiImageHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final AiImageHistoryActivity m;

            h(AiImageHistoryActivity aiImageHistoryActivity0, kotlin.coroutines.d d0) {
                this.m = aiImageHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                h aiImageHistoryActivity$h0 = new h(this.m, d0);
                aiImageHistoryActivity$h0.l = view0;
                return aiImageHistoryActivity$h0.invokeSuspend(S0.a);
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
                if(((View)this.l).isActivated()) {
                    this.m.e2();
                }
                return S0.a;
            }
        }

        Y.a a0 = this.w;
        if(a0 == null) {
            L.S("binding");
            a0 = null;
        }
        L.o(a0.f, "aiImageRecentEdit");
        com.dcinside.app.write.menu.ai.AiImageHistoryActivity.e aiImageHistoryActivity$e0 = new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.e(this, null);
        r.M(a0.f, null, aiImageHistoryActivity$e0, 1, null);
        Y.a a1 = this.w;
        if(a1 == null) {
            L.S("binding");
            a1 = null;
        }
        L.o(a1.c, "aiImageRecentCheckAllTitle");
        com.dcinside.app.write.menu.ai.AiImageHistoryActivity.f aiImageHistoryActivity$f0 = new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.f(this, null);
        r.M(a1.c, null, aiImageHistoryActivity$f0, 1, null);
        Y.a a2 = this.w;
        if(a2 == null) {
            L.S("binding");
            a2 = null;
        }
        L.o(a2.b, "aiImageRecentCheckAll");
        com.dcinside.app.write.menu.ai.AiImageHistoryActivity.g aiImageHistoryActivity$g0 = new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.g(this, null);
        r.M(a2.b, null, aiImageHistoryActivity$g0, 1, null);
        Y.a a3 = this.w;
        if(a3 == null) {
            L.S("binding");
            a3 = null;
        }
        L.o(a3.d, "aiImageRecentDeleteAllText");
        h aiImageHistoryActivity$h0 = new h(this, null);
        r.M(a3.d, null, aiImageHistoryActivity$h0, 1, null);
        Y.a a4 = this.w;
        if(a4 == null) {
            L.S("binding");
            a4 = null;
        }
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(a4.i.getContext());
        a4.i.setLayoutManager(linearLayoutManager0);
        a4.i.setAdapter(this.z);
        a4.i.setItemAnimator(null);
    }

    // 检测为 Lambda 实现
    private static final void m2(AiImageHistoryActivity aiImageHistoryActivity0, g1 g10) [...]

    private final void n2(b b0) {
        AiPromptLoadItem aiPromptLoadItem0 = new AiPromptLoadItem(0L, 0L, null, "", "");
        Intent intent0 = new Intent();
        intent0.putExtra("EXTRA_LOAD_ITEM_DATA", aiPromptLoadItem0);
        this.setResult(-1, intent0);
        this.finish();
    }

    private final void o2() {
        Y.a a0 = this.w;
        if(a0 == null) {
            L.S("binding");
            a0 = null;
        }
        boolean z = a0.b.isChecked();
        this.z.F(z);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        public static final class com.dcinside.app.write.menu.ai.AiImageHistoryActivity.i extends OnBackPressedCallback {
            final AiImageHistoryActivity d;

            com.dcinside.app.write.menu.ai.AiImageHistoryActivity.i(AiImageHistoryActivity aiImageHistoryActivity0) {
                this.d = aiImageHistoryActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                if(this.d.x) {
                    this.d.y2(false);
                    return;
                }
                this.d.finish();
            }
        }

        super.onCreate(bundle0);
        Y.a a0 = Y.a.c(this.getLayoutInflater());
        L.o(a0, "inflate(...)");
        this.w = a0;
        Y.a a1 = null;
        if(a0 == null) {
            L.S("binding");
            a0 = null;
        }
        this.setContentView(a0.b());
        Y.a a2 = this.w;
        if(a2 == null) {
            L.S("binding");
            a2 = null;
        }
        this.S0(a2.j);
        kr.bhbfhfb.designcompat.a.d(this);
        Y.a a3 = this.w;
        if(a3 == null) {
            L.S("binding");
        }
        else {
            a1 = a3;
        }
        a1.j.setNavigationIcon(0x7F08012F);  // drawable:btn_close
        this.l2();
        this.k2();
        this.p2();
        g1 g10 = this.A;
        if(g10 != null) {
            this.q2(g10);
        }
        this.getOnBackPressedDispatcher().h(new com.dcinside.app.write.menu.ai.AiImageHistoryActivity.i(this));
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        try {
            S s0 = this.y;
            if(s0 != null) {
                s0.dismissAllowingStateLoss();
            }
        }
        catch(Exception unused_ex) {
        }
        this.y = null;
        g1 g10 = this.A;
        if(g10 != null) {
            g10.D();
        }
        this.A = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    private final void p2() {
        int v = this.x ? 0x7F08003D : 0x7F08012F;  // drawable:abc_ic_ab_back_material
        Y.a a0 = this.w;
        CharSequence charSequence0 = null;
        if(a0 == null) {
            L.S("binding");
            a0 = null;
        }
        a0.j.setNavigationIcon(v);
        Y.a a1 = this.w;
        if(a1 == null) {
            L.S("binding");
            a1 = null;
        }
        L.o(a1.g, "aiImageRecentEditWrap");
        int v1 = 8;
        a1.g.setVisibility((this.x ? 0 : 8));
        Y.a a2 = this.w;
        if(a2 == null) {
            L.S("binding");
            a2 = null;
        }
        TextView textView0 = a2.f;
        L.o(textView0, "aiImageRecentEdit");
        if(!this.x) {
            v1 = 0;
        }
        textView0.setVisibility(v1);
        if(this.x) {
            Y.a a3 = this.w;
            if(a3 == null) {
                L.S("binding");
                a3 = null;
            }
            this.setTitle(0x7F150575);  // string:make_ai_history_edit_title "최근 등록 프롬프트 - 편집"
            a3.j.setInfoTitle(null);
        }
        else {
            Y.a a4 = this.w;
            if(a4 == null) {
                L.S("binding");
                a4 = null;
            }
            DcToolbar dcToolbar0 = a4.j;
            this.setTitle(0x7F150577);  // string:make_ai_history_title "최근 등록 프롬프트"
            g1 g10 = this.A;
            if(g10 != null) {
                if(g10.size() <= 0) {
                    g10 = null;
                }
                if(g10 != null) {
                    String s = g10.size().toString();
                    if(s != null) {
                        charSequence0 = new SpannableStringBuilder().append(' ').append(s);
                    }
                }
            }
            dcToolbar0.setInfoTitle(charSequence0);
        }
        this.z.D(this.x);
    }

    private final void q2(g1 g10) {
        Y.a a0 = this.w;
        if(a0 == null) {
            L.S("binding");
            a0 = null;
        }
        L.o(a0.h, "aiImageRecentEmpty");
        a0.h.setVisibility((g10.isEmpty() ? 0 : 8));
        this.z.G(g10);
        this.p2();
    }

    // 检测为 Lambda 实现
    private static final Boolean r2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s2(Function1 function10, Object object0) [...]

    private static final void t2(Throwable throwable0) {
    }

    // 检测为 Lambda 实现
    private static final Boolean u2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void v2(Function1 function10, Object object0) [...]

    private final void w2(b b0) {
        F0 f00 = this.F1();
        if(f00 == null) {
            return;
        }
        f00.Y3((F0 f00) -> {
            L.p(b0, "$item");
            b0.z5();
        });
    }

    // 检测为 Lambda 实现
    private static final void x2(b b0, F0 f00) [...]

    private final void y2(boolean z) {
        if(this.x == z) {
            return;
        }
        this.x = z;
        this.p2();
    }

    private final void z2(b b0) {
        V[] arr_v = {r0.a("EXTRA_PROMPT_POSITIVE", ""), r0.a("EXTRA_PROMPT_NEGATIVE", "")};
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = S.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.write.menu.ai.S");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.write.menu.ai.AiPromptDetailDialog");
        }
        ((S)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 2))));
        ((S)fragment0).show(fragmentManager0, "com.dcinside.app.write.menu.ai.S");
        this.y = (S)fragment0;
    }
}

