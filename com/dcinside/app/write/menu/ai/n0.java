package com.dcinside.app.write.menu.ai;

import A3.p;
import A3.q;
import Y.c1;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.AiPromptLoadItem;
import com.dcinside.app.model.i;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.uk;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nAiPromptSaveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPromptSaveDialog.kt\ncom/dcinside/app/write/menu/ai/AiPromptSaveDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,274:1\n1#2:275\n257#3,2:276\n257#3,2:278\n257#3,2:280\n257#3,2:282\n255#3:284\n257#3,2:285\n257#3,2:296\n257#3,2:298\n257#3,2:300\n177#4,9:287\n*S KotlinDebug\n*F\n+ 1 AiPromptSaveDialog.kt\ncom/dcinside/app/write/menu/ai/AiPromptSaveDialog\n*L\n102#1:276,2\n153#1:278,2\n165#1:280,2\n166#1:282,2\n169#1:284\n213#1:285,2\n116#1:296,2\n160#1:298,2\n224#1:300,2\n243#1:287,9\n*E\n"})
public final class n0 extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private c1 a;
    @l
    private final q0 b;
    private boolean c;
    @m
    private o d;
    @m
    private o e;
    @m
    private o f;
    @l
    public static final a g = null;
    @l
    public static final String h = "EXTRA_EDITED_ITEM_INDEX";
    @l
    public static final String i = "EXTRA_EDITED_ITEM_TITLE";
    @l
    public static final String j = "EXTRA_POSITIVE_PROMPTS";
    @l
    public static final String k = "EXTRA_NEGATIVE_PROMPTS";

    static {
        n0.g = new a(null);
    }

    public n0() {
        this.b = new q0(this);
    }

    private final void F0() {
        try {
            Nk.a.d(this);
            this.dismissAllowingStateLoss();
        }
        catch(Exception unused_ex) {
        }
    }

    public final void G0(@l AiPromptLoadItem aiPromptLoadItem0, int v) {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1505FC);  // string:make_ai_save_delete_prompt_message "항목을 삭제하시겠습니까?"
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
            final n0 e;
            final AiPromptLoadItem f;
            final int g;

            d(n0 n00, AiPromptLoadItem aiPromptLoadItem0, int v) {
                this.e = n00;
                this.f = aiPromptLoadItem0;
                this.g = v;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.K0(this.f, this.g);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(aiPromptLoadItem0, "item");
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        e.e.a(appCompatActivity0).n(b.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(c.e, "$tmp0");
            return (Boolean)c.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new d(this, aiPromptLoadItem0, v), "$tmp0");
            new d(this, aiPromptLoadItem0, v).invoke(object0);
        }, new f0());
    }

    // 检测为 Lambda 实现
    private static final Boolean H0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void I0(Function1 function10, Object object0) [...]

    private static final void J0(Throwable throwable0) {
    }

    private final void K0(AiPromptLoadItem aiPromptLoadItem0, int v) {
        @s0({"SMAP\nAiPromptSaveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPromptSaveDialog.kt\ncom/dcinside/app/write/menu/ai/AiPromptSaveDialog$deletePrompt$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,274:1\n257#2,2:275\n*S KotlinDebug\n*F\n+ 1 AiPromptSaveDialog.kt\ncom/dcinside/app/write/menu/ai/AiPromptSaveDialog$deletePrompt$1\n*L\n158#1:275,2\n*E\n"})
        static final class com.dcinside.app.write.menu.ai.n0.e extends N implements Function1 {
            final n0 e;
            final int f;

            com.dcinside.app.write.menu.ai.n0.e(n0 n00, int v) {
                this.e = n00;
                this.f = v;
                super(1);
            }

            public final void a(i i0) {
                this.e.b.v(this.f);
                this.e.Q0();
                c1 c10 = this.e.N0();
                L.o(c10.m, "dialogAiPromptSaveProgress");
                c10.m.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((i)object0));
                return S0.a;
            }
        }

        c1 c10 = this.N0();
        L.o(c10.m, "dialogAiPromptSaveProgress");
        c10.m.setVisibility(0);
        this.e = uk.lk(((int)aiPromptLoadItem0.i())).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.ai.n0.e(this, v), "$tmp0");
            new com.dcinside.app.write.menu.ai.n0.e(this, v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            c1 c10 = this.N0();
            L.o(c10.m, "dialogAiPromptSaveProgress");
            c10.m.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void L0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void M0(n0 n00, Throwable throwable0) [...]

    private final c1 N0() {
        c1 c10 = this.a;
        L.m(c10);
        return c10;
    }

    private final void O0() {
        @f(c = "com.dcinside.app.write.menu.ai.AiPromptSaveDialog$initView$1", f = "AiPromptSaveDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.n0.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final n0 l;

            com.dcinside.app.write.menu.ai.n0.f(n0 n00, kotlin.coroutines.d d0) {
                this.l = n00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.n0.f(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.F0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.AiPromptSaveDialog$initView$2", f = "AiPromptSaveDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final n0 l;

            g(n0 n00, kotlin.coroutines.d d0) {
                this.l = n00;
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
                kotlin.f0.n(object0);
                this.l.F0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.AiPromptSaveDialog$initView$3", f = "AiPromptSaveDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final n0 l;

            h(n0 n00, kotlin.coroutines.d d0) {
                this.l = n00;
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
                kotlin.f0.n(object0);
                this.l.X0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.AiPromptSaveDialog$initView$4", f = "AiPromptSaveDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.n0.i extends kotlin.coroutines.jvm.internal.o implements q {
            int k;
            Object l;
            boolean m;
            final n0 n;

            com.dcinside.app.write.menu.ai.n0.i(n0 n00, kotlin.coroutines.d d0) {
                this.n = n00;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                com.dcinside.app.write.menu.ai.n0.i n0$i0 = new com.dcinside.app.write.menu.ai.n0.i(this.n, d0);
                n0$i0.l = compoundButton0;
                n0$i0.m = z;
                return n0$i0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                CompoundButton compoundButton0 = (CompoundButton)this.l;
                if(this.m) {
                    this.n.P0(compoundButton0);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.AiPromptSaveDialog$initView$5", f = "AiPromptSaveDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends kotlin.coroutines.jvm.internal.o implements q {
            int k;
            Object l;
            boolean m;
            final n0 n;

            j(n0 n00, kotlin.coroutines.d d0) {
                this.n = n00;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                j n0$j0 = new j(this.n, d0);
                n0$j0.l = compoundButton0;
                n0$j0.m = z;
                return n0$j0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                CompoundButton compoundButton0 = (CompoundButton)this.l;
                if(this.m) {
                    this.n.P0(compoundButton0);
                }
                return S0.a;
            }
        }

        c1 c10 = this.N0();
        L.o(c10.c, "dialogAiPromptSave");
        com.dcinside.app.write.menu.ai.n0.f n0$f0 = new com.dcinside.app.write.menu.ai.n0.f(this, null);
        r.M(c10.c, null, n0$f0, 1, null);
        c1 c11 = this.N0();
        L.o(c11.e, "dialogAiPromptSaveClose");
        g n0$g0 = new g(this, null);
        r.M(c11.e, null, n0$g0, 1, null);
        c1 c12 = this.N0();
        L.o(c12.b, "dialogAiImageLoraSettingApply");
        h n0$h0 = new h(this, null);
        r.M(c12.b, null, n0$h0, 1, null);
        c1 c13 = this.N0();
        String s = B.E.c0();
        c13.g.setText(s);
        c1 c14 = this.N0();
        L.o(c14.i, "dialogAiPromptSaveNewButton");
        com.dcinside.app.write.menu.ai.n0.i n0$i0 = new com.dcinside.app.write.menu.ai.n0.i(this, null);
        r.J(c14.i, null, n0$i0, 1, null);
        c1 c15 = this.N0();
        L.o(c15.k, "dialogAiPromptSaveOverwriteButton");
        j n0$j0 = new j(this, null);
        r.J(c15.k, null, n0$j0, 1, null);
        c1 c16 = this.N0();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(c16.h.getContext());
        c16.h.setLayoutManager(linearLayoutManager0);
        c16.h.setAdapter(this.b);
        c16.h.setItemAnimator(null);
    }

    private final void P0(View view0) {
        switch(view0.getId()) {
            case 0x7F0B03F7: {  // id:dialog_ai_prompt_save_new_button
                this.N0().k.setChecked(false);
                break;
            }
            case 0x7F0B03F9: {  // id:dialog_ai_prompt_save_overwrite_button
                this.N0().i.setChecked(false);
            }
        }
        this.R0();
    }

    private final void Q0() {
        int v = jl.a.F();
        int v1 = this.b.x();
        c1 c10 = this.N0();
        String s = this.getString(0x7F15058B, new Object[]{v1, v});  // string:make_ai_image_count "(%1$d/%2$d)"
        c10.l.setText(s);
    }

    private final void R0() {
        EditText editText0 = this.N0().j;
        L.o(editText0, "dialogAiPromptSaveNewName");
        int v = 8;
        editText0.setVisibility((this.N0().i.isChecked() ? 0 : 8));
        RecyclerView recyclerView0 = this.N0().h;
        L.o(recyclerView0, "dialogAiPromptSaveList");
        if(this.N0().k.isChecked()) {
            v = 0;
        }
        recyclerView0.setVisibility(v);
        c1 c10 = this.N0();
        Nk.a.c(c10.j);
        c1 c11 = this.N0();
        L.o(c11.h, "dialogAiPromptSaveList");
        if(c11.h.getVisibility() == 0 && !this.c) {
            this.c = true;
            int v1 = this.b.y();
            if(v1 >= 0) {
                int v2 = this.requireContext().getResources().getDimensionPixelSize(0x7F070066);  // dimen:ai_save_list_item_height
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.N0().h.getLayoutParams();
                LinearLayoutManager linearLayoutManager0 = null;
                LayoutParams constraintLayout$LayoutParams0 = viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0) : null;
                int v3 = Math.max(Math.max(Math.min(this.b.getItemCount() * v2, (constraintLayout$LayoutParams0 == null ? 0 : constraintLayout$LayoutParams0.U)), (constraintLayout$LayoutParams0 == null ? 0 : constraintLayout$LayoutParams0.S)) / 2 - v2 / 2, 0);
                LayoutManager recyclerView$LayoutManager0 = this.N0().h.getLayoutManager();
                if(recyclerView$LayoutManager0 instanceof LinearLayoutManager) {
                    linearLayoutManager0 = (LinearLayoutManager)recyclerView$LayoutManager0;
                }
                if(linearLayoutManager0 != null) {
                    linearLayoutManager0.q3(v1, v3);
                }
            }
        }
    }

    private final void S0() {
        @s0({"SMAP\nAiPromptSaveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPromptSaveDialog.kt\ncom/dcinside/app/write/menu/ai/AiPromptSaveDialog$requestSavePromptList$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,274:1\n257#2,2:275\n*S KotlinDebug\n*F\n+ 1 AiPromptSaveDialog.kt\ncom/dcinside/app/write/menu/ai/AiPromptSaveDialog$requestSavePromptList$1\n*L\n105#1:275,2\n*E\n"})
        static final class k extends N implements Function1 {
            final n0 e;

            k(n0 n00) {
                this.e = n00;
                super(1);
            }

            public final void a(i i0) {
                c1 c10 = this.e.N0();
                L.o(c10.m, "dialogAiPromptSaveProgress");
                c10.m.setVisibility(8);
                this.e.b.D(i0.h());
                this.e.Q0();
                if(this.e.b.z() == null && this.e.b.A() == null) {
                    this.e.N0().i.setChecked(true);
                    return;
                }
                this.e.N0().k.setChecked(true);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((i)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.write.menu.ai.n0.l extends N implements Function1 {
            final String e;

            com.dcinside.app.write.menu.ai.n0.l(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.menu.ai.n0.m extends N implements Function1 {
            final n0 e;

            com.dcinside.app.write.menu.ai.n0.m(n0 n00) {
                this.e = n00;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    this.e.S0();
                    return;
                }
                this.e.dismissAllowingStateLoss();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        c1 c10 = this.N0();
        L.o(c10.m, "dialogAiPromptSaveProgress");
        c10.m.setVisibility(0);
        this.d = uk.wG().y5((Object object0) -> {
            L.p(new k(this), "$tmp0");
            new k(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            c1 c10 = this.N0();
            L.o(c10.m, "dialogAiPromptSaveProgress");
            c10.m.setVisibility(8);
            String s = throwable0.getLocalizedMessage();
            if(s == null) {
                s = this.getString(0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
                L.o(s, "getString(...)");
            }
            FragmentActivity fragmentActivity0 = this.getActivity();
            AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
            if(appCompatActivity0 == null) {
                return;
            }
            e.e.a(appCompatActivity0).n(new com.dcinside.app.write.menu.ai.n0.l(s)).z(0x7F1508D7).x(0x1040000).b().y5((Object object0) -> {
                L.p(new com.dcinside.app.write.menu.ai.n0.m(n00), "$tmp0");
                new com.dcinside.app.write.menu.ai.n0.m(n00).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(n00, "this$0");
                n00.dismissAllowingStateLoss();
            });
        });
    }

    // 检测为 Lambda 实现
    private static final void T0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void U0(n0 n00, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void V0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void W0(n0 n00, Throwable throwable0) [...]

    private final void X0() {
        @s0({"SMAP\nAiPromptSaveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPromptSaveDialog.kt\ncom/dcinside/app/write/menu/ai/AiPromptSaveDialog$savePrompt$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,274:1\n257#2,2:275\n*S KotlinDebug\n*F\n+ 1 AiPromptSaveDialog.kt\ncom/dcinside/app/write/menu/ai/AiPromptSaveDialog$savePrompt$1\n*L\n222#1:275,2\n*E\n"})
        static final class n extends N implements Function1 {
            final n0 e;
            final AiPromptLoadItem f;

            n(n0 n00, AiPromptLoadItem aiPromptLoadItem0) {
                this.e = n00;
                this.f = aiPromptLoadItem0;
                super(1);
            }

            public final void a(i i0) {
                if(L.g(i0.j(), Boolean.TRUE)) {
                    this.e.b1(this.f);
                    this.e.F0();
                }
                else {
                    this.e.a1((i0.i() == null ? "" : i0.i()));
                }
                c1 c10 = this.e.N0();
                L.o(c10.m, "dialogAiPromptSaveProgress");
                c10.m.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((i)object0));
                return S0.a;
            }
        }

        long v1;
        if(this.f != null && !this.f.j()) {
            return;
        }
        Editable editable0 = this.N0().j.getText();
        String s = null;
        String s1 = editable0 == null ? null : editable0.toString();
        com.dcinside.app.write.menu.ai.type.f f0 = this.N0().i.isChecked() ? com.dcinside.app.write.menu.ai.type.f.b : com.dcinside.app.write.menu.ai.type.f.c;
        com.dcinside.app.write.menu.ai.type.f f1 = com.dcinside.app.write.menu.ai.type.f.b;
        if(f0 == f1 && (s1 == null || s1.length() == 0)) {
            String s2 = this.getString(0x7F150605);  // string:make_ai_save_require_name "저장명을 입력해 주세요."
            L.o(s2, "getString(...)");
            this.a1(s2);
            return;
        }
        int v = jl.a.F();
        if(f0 == f1 && this.b.x() >= v) {
            String s3 = this.getString(0x7F1505FB, new Object[]{v});  // string:make_ai_save_count_over "저장 개수가 초과되었습니다. 최대 %d개까지 가능합니다."
            L.o(s3, "getString(...)");
            this.a1(s3);
            return;
        }
        if(f0 == com.dcinside.app.write.menu.ai.type.f.c && this.b.z() == null) {
            String s4 = this.getString(0x7F150600);  // string:make_ai_save_need_select "선택된 항목이 없습니다."
            L.o(s4, "getString(...)");
            this.a1(s4);
            return;
        }
        if(f0 != f1) {
            s1 = this.b.A();
        }
        if(f0 == f1) {
            v1 = 0L;
        }
        else {
            Long long0 = this.b.z();
            v1 = long0 == null ? 0L : ((long)long0);
        }
        Bundle bundle0 = this.getArguments();
        String s5 = bundle0 == null ? null : bundle0.getString("EXTRA_POSITIVE_PROMPTS");
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            s = bundle1.getString("EXTRA_NEGATIVE_PROMPTS");
        }
        AiPromptLoadItem aiPromptLoadItem0 = new AiPromptLoadItem(v1, 0L, s1, s5, s);
        c1 c10 = this.N0();
        L.o(c10.m, "dialogAiPromptSaveProgress");
        c10.m.setVisibility(0);
        this.f = uk.AG(aiPromptLoadItem0, f0).y5((Object object0) -> {
            L.p(new n(this, aiPromptLoadItem0), "$tmp0");
            new n(this, aiPromptLoadItem0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            c1 c10 = this.N0();
            L.o(c10.m, "dialogAiPromptSaveProgress");
            c10.m.setVisibility(8);
            String s = throwable0.getMessage();
            if(s == null) {
                s = this.getString(0x7F150591);  // string:make_ai_image_error_unknown_message "잠시 후 다시 시도해주세요."
                L.o(s, "getString(...)");
            }
            this.a1(s);
        });
    }

    // 检测为 Lambda 实现
    private static final void Y0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void Z0(n0 n00, Throwable throwable0) [...]

    private final void a1(String s) {
        static final class com.dcinside.app.write.menu.ai.n0.o extends N implements Function1 {
            final String e;

            com.dcinside.app.write.menu.ai.n0.o(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        e.e.a(appCompatActivity0).n(new com.dcinside.app.write.menu.ai.n0.o(s)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
    }

    private final void b1(AiPromptLoadItem aiPromptLoadItem0) {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AiImageMakeActivity aiImageMakeActivity0 = fragmentActivity0 instanceof AiImageMakeActivity ? ((AiImageMakeActivity)fragmentActivity0) : null;
        if(aiImageMakeActivity0 != null) {
            aiImageMakeActivity0.L3(aiPromptLoadItem0);
        }
    }

    public static void l0(Throwable throwable0) {
    }

    @Override  // androidx.fragment.app.DialogFragment
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        L.o(dialog0, "onCreateDialog(...)");
        Window window0 = dialog0.getWindow();
        if(window0 != null) {
            window0.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = c1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.N0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        o o0 = this.d;
        if(o0 != null) {
            o0.l();
        }
        this.d = null;
        o o1 = this.e;
        if(o1 != null) {
            o1.l();
        }
        this.e = null;
        o o2 = this.f;
        if(o2 != null) {
            o2.l();
        }
        this.f = null;
        this.a = null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setLayout(-1, -1);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        q0 q00 = this.b;
        Bundle bundle1 = this.getArguments();
        String s = null;
        Long long0 = bundle1 == null ? null : bundle1.getLong("EXTRA_EDITED_ITEM_INDEX");
        Bundle bundle2 = this.getArguments();
        if(bundle2 != null) {
            s = bundle2.getString("EXTRA_EDITED_ITEM_TITLE");
        }
        q00.E(long0, s);
        this.O0();
        this.S0();
    }
}

