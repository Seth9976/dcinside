package com.dcinside.app.write.menu.ai;

import Y.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dcinside.app.base.d;
import com.dcinside.app.model.AiPromptLoadItem;
import com.dcinside.app.model.i;
import com.dcinside.app.util.uk;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nAiPromptLoadActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPromptLoadActivity.kt\ncom/dcinside/app/write/menu/ai/AiPromptLoadActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,164:1\n257#2,2:165\n257#2,2:167\n257#2,2:169\n257#2,2:171\n257#2,2:173\n*S KotlinDebug\n*F\n+ 1 AiPromptLoadActivity.kt\ncom/dcinside/app/write/menu/ai/AiPromptLoadActivity\n*L\n69#1:165,2\n84#1:167,2\n131#1:169,2\n75#1:171,2\n138#1:173,2\n*E\n"})
public final class AiPromptLoadActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @m ActivityResultLauncher activityResultLauncher0, boolean z) {
            L.p(context0, "context");
            Intent intent0 = new Intent(context0, AiPromptLoadActivity.class);
            intent0.putExtra("EXTRA_HAS_INPUT", z);
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }
    }

    private b u;
    @m
    private o v;
    @m
    private o w;
    @l
    private final N x;
    @l
    public static final a y = null;
    @l
    private static final String z = "EXTRA_HAS_INPUT";

    static {
        AiPromptLoadActivity.y = new a(null);
    }

    public AiPromptLoadActivity() {
        this.x = new N();
    }

    public static void E1(Throwable throwable0) {
    }

    public final void J(@l View view0, int v) {
        static final class c extends kotlin.jvm.internal.N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
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


        static final class com.dcinside.app.write.menu.ai.AiPromptLoadActivity.d extends kotlin.jvm.internal.N implements Function1 {
            public static final com.dcinside.app.write.menu.ai.AiPromptLoadActivity.d e;

            static {
                com.dcinside.app.write.menu.ai.AiPromptLoadActivity.d.e = new com.dcinside.app.write.menu.ai.AiPromptLoadActivity.d();
            }

            com.dcinside.app.write.menu.ai.AiPromptLoadActivity.d() {
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


        static final class e extends kotlin.jvm.internal.N implements Function1 {
            final AiPromptLoadActivity e;
            final AiPromptLoadItem f;
            final int g;

            e(AiPromptLoadActivity aiPromptLoadActivity0, AiPromptLoadItem aiPromptLoadItem0, int v) {
                this.e = aiPromptLoadActivity0;
                this.f = aiPromptLoadItem0;
                this.g = v;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.T1(this.f, this.g);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }


        static final class f extends kotlin.jvm.internal.N implements Function1 {
            public static final f e;

            static {
                f.e = new f();
            }

            f() {
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


        static final class g extends kotlin.jvm.internal.N implements Function1 {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
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


        static final class h extends kotlin.jvm.internal.N implements Function1 {
            final AiPromptLoadActivity e;
            final AiPromptLoadItem f;

            h(AiPromptLoadActivity aiPromptLoadActivity0, AiPromptLoadItem aiPromptLoadItem0) {
                this.e = aiPromptLoadActivity0;
                this.f = aiPromptLoadItem0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.X1(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        AiPromptLoadItem aiPromptLoadItem0 = this.x.w(v);
        if(view0.getId() == 0x7F0B00C8) {  // id:ai_image_load_item_wrap
            com.dcinside.app.perform.e.e.a(this).n(c.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                L.p(com.dcinside.app.write.menu.ai.AiPromptLoadActivity.d.e, "$tmp0");
                return (Boolean)com.dcinside.app.write.menu.ai.AiPromptLoadActivity.d.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new e(this, aiPromptLoadItem0, v), "$tmp0");
                new e(this, aiPromptLoadItem0, v).invoke(object0);
            }, new Z());
            return;
        }
        if(this.getIntent().getBooleanExtra("EXTRA_HAS_INPUT", false)) {
            com.dcinside.app.perform.e.e.a(this).n(f.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                L.p(g.e, "$tmp0");
                return (Boolean)g.e.invoke(object0);
            }).x5((Object object0) -> {
                L.p(new h(this, aiPromptLoadItem0), "$tmp0");
                new h(this, aiPromptLoadItem0).invoke(object0);
            });
            return;
        }
        this.X1(aiPromptLoadItem0);
    }

    private final void T1(AiPromptLoadItem aiPromptLoadItem0, int v) {
        @s0({"SMAP\nAiPromptLoadActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPromptLoadActivity.kt\ncom/dcinside/app/write/menu/ai/AiPromptLoadActivity$deletePrompt$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,164:1\n257#2,2:165\n*S KotlinDebug\n*F\n+ 1 AiPromptLoadActivity.kt\ncom/dcinside/app/write/menu/ai/AiPromptLoadActivity$deletePrompt$1\n*L\n136#1:165,2\n*E\n"})
        static final class com.dcinside.app.write.menu.ai.AiPromptLoadActivity.b extends kotlin.jvm.internal.N implements Function1 {
            final AiPromptLoadActivity e;
            final int f;

            com.dcinside.app.write.menu.ai.AiPromptLoadActivity.b(AiPromptLoadActivity aiPromptLoadActivity0, int v) {
                this.e = aiPromptLoadActivity0;
                this.f = v;
                super(1);
            }

            public final void a(i i0) {
                this.e.x.v(this.f);
                this.e.Y1();
                b b0 = this.e.u;
                if(b0 == null) {
                    L.S("binding");
                    b0 = null;
                }
                L.o(b0.c, "aiImageLoadPromptProgress");
                b0.c.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((i)object0));
                return S0.a;
            }
        }

        int v1 = (int)aiPromptLoadItem0.i();
        b b0 = this.u;
        if(b0 == null) {
            L.S("binding");
            b0 = null;
        }
        L.o(b0.c, "aiImageLoadPromptProgress");
        b0.c.setVisibility(0);
        this.w = uk.lk(v1).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.ai.AiPromptLoadActivity.b(this, v), "$tmp0");
            new com.dcinside.app.write.menu.ai.AiPromptLoadActivity.b(this, v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            b b0 = this.u;
            if(b0 == null) {
                L.S("binding");
                b0 = null;
            }
            L.o(b0.c, "aiImageLoadPromptProgress");
            b0.c.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void U1(AiPromptLoadActivity aiPromptLoadActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void V1(Function1 function10, Object object0) [...]

    private final void W1() {
        b b0 = this.u;
        if(b0 == null) {
            L.S("binding");
            b0 = null;
        }
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(b0.d.getContext(), 1, false);
        b0.d.setLayoutManager(linearLayoutManager0);
        b0.d.setAdapter(this.x);
    }

    private final void X1(AiPromptLoadItem aiPromptLoadItem0) {
        Intent intent0 = new Intent();
        intent0.putExtra("EXTRA_LOAD_ITEM_DATA", aiPromptLoadItem0);
        this.setResult(-1, intent0);
        this.finish();
    }

    private final void Y1() {
        int v = this.x.getItemCount();
        b b0 = this.u;
        if(b0 == null) {
            L.S("binding");
            b0 = null;
        }
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder().append(' ').append(String.valueOf(v));
        b0.e.setInfoTitle(spannableStringBuilder0);
    }

    // 检测为 Lambda 实现
    private static final Boolean Z1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void a2(Function1 function10, Object object0) [...]

    private static final void b2(Throwable throwable0) {
    }

    // 检测为 Lambda 实现
    private static final Boolean c2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void d2(Function1 function10, Object object0) [...]

    private final void e2() {
        @s0({"SMAP\nAiPromptLoadActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPromptLoadActivity.kt\ncom/dcinside/app/write/menu/ai/AiPromptLoadActivity$requestPrompts$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,164:1\n257#2,2:165\n*S KotlinDebug\n*F\n+ 1 AiPromptLoadActivity.kt\ncom/dcinside/app/write/menu/ai/AiPromptLoadActivity$requestPrompts$1\n*L\n73#1:165,2\n*E\n"})
        static final class com.dcinside.app.write.menu.ai.AiPromptLoadActivity.i extends kotlin.jvm.internal.N implements Function1 {
            final AiPromptLoadActivity e;

            com.dcinside.app.write.menu.ai.AiPromptLoadActivity.i(AiPromptLoadActivity aiPromptLoadActivity0) {
                this.e = aiPromptLoadActivity0;
                super(1);
            }

            public final void a(i i0) {
                L.m(i0);
                this.e.h2(i0);
                b b0 = this.e.u;
                if(b0 == null) {
                    L.S("binding");
                    b0 = null;
                }
                L.o(b0.c, "aiImageLoadPromptProgress");
                b0.c.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((i)object0));
                return S0.a;
            }
        }

        b b0 = this.u;
        if(b0 == null) {
            L.S("binding");
            b0 = null;
        }
        L.o(b0.c, "aiImageLoadPromptProgress");
        b0.c.setVisibility(0);
        this.v = uk.wG().y5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.ai.AiPromptLoadActivity.i(this), "$tmp0");
            new com.dcinside.app.write.menu.ai.AiPromptLoadActivity.i(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            b b0 = this.u;
            if(b0 == null) {
                L.S("binding");
                b0 = null;
            }
            L.o(b0.c, "aiImageLoadPromptProgress");
            b0.c.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void f2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void g2(AiPromptLoadActivity aiPromptLoadActivity0, Throwable throwable0) [...]

    private final void h2(i i0) {
        List list0 = i0.h();
        if(list0 != null) {
            this.x.z(list0);
        }
        b b0 = this.u;
        if(b0 == null) {
            L.S("binding");
            b0 = null;
        }
        L.o(b0.b, "aiImageLoadPromptEmpty");
        b0.b.setVisibility((list0 == null || list0.isEmpty() ? 0 : 8));
        if(list0 != null && !list0.isEmpty() == 1) {
            this.Y1();
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        b b0 = b.c(this.getLayoutInflater());
        L.o(b0, "inflate(...)");
        this.u = b0;
        b b1 = null;
        if(b0 == null) {
            L.S("binding");
            b0 = null;
        }
        this.setContentView(b0.b());
        b b2 = this.u;
        if(b2 == null) {
            L.S("binding");
            b2 = null;
        }
        this.S0(b2.e);
        kr.bhbfhfb.designcompat.a.d(this);
        b b3 = this.u;
        if(b3 == null) {
            L.S("binding");
        }
        else {
            b1 = b3;
        }
        b1.e.setNavigationIcon(0x7F08012F);  // drawable:btn_close
        this.setTitle(0x7F1505CF);  // string:make_ai_load_prompt "프롬프트 불러오기"
        this.W1();
        this.e2();
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        o o0 = this.v;
        if(o0 != null) {
            o0.l();
        }
        o o1 = this.w;
        if(o1 != null) {
            o1.l();
        }
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
}

