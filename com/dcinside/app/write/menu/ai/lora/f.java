package com.dcinside.app.write.menu.ai.lora;

import A3.p;
import Y.Y0;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.AiImageStatusResult;
import com.dcinside.app.rx.bus.C;
import com.dcinside.app.write.menu.ai.AiImageMakeActivity;
import com.dcinside.app.write.menu.ai.type.LoraModel;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nLoraAllDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoraAllDialog.kt\ncom/dcinside/app/write/menu/ai/lora/LoraAllDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 4 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 5 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,144:1\n1#2:145\n27#3:146\n60#4:147\n177#5,9:148\n177#5,9:157\n204#5,7:166\n*S KotlinDebug\n*F\n+ 1 LoraAllDialog.kt\ncom/dcinside/app/write/menu/ai/lora/LoraAllDialog\n*L\n43#1:146\n93#1:147\n100#1:148,9\n109#1:157,9\n110#1:166,7\n*E\n"})
public final class f extends DialogFragment implements h {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private Y0 a;
    @l
    private final com.dcinside.app.write.menu.ai.lora.a b;
    @m
    private i c;
    @m
    private b d;
    @l
    public static final a e = null;
    @l
    public static final String f = "EXTRA_PROMPT_SELECTED_LORA_LIST";

    static {
        f.e = new a(null);
    }

    public f() {
        this.b = new com.dcinside.app.write.menu.ai.lora.a(this, true);
    }

    @Override  // com.dcinside.app.write.menu.ai.lora.h
    public void Z(@l LoraModel loraModel0) {
        L.p(loraModel0, "model");
        this.r0();
        FragmentActivity fragmentActivity0 = this.getActivity();
        AiImageMakeActivity aiImageMakeActivity0 = fragmentActivity0 instanceof AiImageMakeActivity ? ((AiImageMakeActivity)fragmentActivity0) : null;
        if(aiImageMakeActivity0 != null) {
            aiImageMakeActivity0.H3(loraModel0);
        }
    }

    @Override  // com.dcinside.app.write.menu.ai.lora.h
    public void i(@l LoraModel loraModel0, boolean z) {
        L.p(loraModel0, "model");
        if(this.b.x() >= 2 && !z) {
            String s = this.getString(0x7F1505DC, new Object[]{2});  // string:make_ai_lora_limit "로라는 %d개까지 등록 가능합니다."
            L.o(s, "getString(...)");
            this.t0(s);
            return;
        }
        i i0 = this.c;
        if(i0 != null) {
            try {
                i0.dismissAllowingStateLoss();
            }
            catch(Exception unused_ex) {
            }
        }
        V[] arr_v = {r0.a("EXTRA_SELECTED_TYPE", loraModel0)};
        FragmentManager fragmentManager0 = this.getChildFragmentManager();
        L.o(fragmentManager0, "getChildFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = i.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.write.menu.ai.lora.i");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.write.menu.ai.lora.LoraSettingDialog");
        }
        ((i)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
        ((i)fragment0).show(fragmentManager0, "com.dcinside.app.write.menu.ai.lora.i");
        this.c = (i)fragment0;
    }

    private final void n0() {
        try {
            this.dismissAllowingStateLoss();
        }
        catch(Exception unused_ex) {
        }
    }

    private final Y0 o0() {
        Y0 y00 = this.a;
        L.m(y00);
        return y00;
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
        this.a = Y0.d(layoutInflater0, viewGroup0, false);
        View view0 = this.o0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        b b0 = this.d;
        if(b0 != null) {
            b0.l();
        }
        this.d = null;
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
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.lora.LoraAllDialog$onViewCreated$2", f = "LoraAllDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final f l;

            c(f f0, d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.n0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.lora.LoraAllDialog$onViewCreated$3", f = "LoraAllDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.lora.f.d extends o implements p {
            int k;
            final f l;

            com.dcinside.app.write.menu.ai.lora.f.d(f f0, d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.ai.lora.f.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.n0();
                return S0.a;
            }
        }

        List list0;
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            return;
        }
        this.p0();
        AiImageStatusResult aiImageStatusResult0 = (AiImageStatusResult)BundleCompat.b(bundle1, "EXTRA_INFO", AiImageStatusResult.class);
        if(aiImageStatusResult0 == null) {
            list0 = u.H();
        }
        else {
            list0 = aiImageStatusResult0.o();
            if(list0 == null) {
                list0 = u.H();
            }
        }
        List list1 = BundleCompat.d(bundle1, "EXTRA_PROMPT_SELECTED_LORA_LIST", LoraModel.class);
        if(list1 == null) {
            list1 = u.H();
        }
        Y0 y00 = this.o0();
        this.b.E(list0);
        this.b.F(list1);
        y00.g.setItemAnimator(null);
        y00.g.setAdapter(this.b);
        Y0 y01 = this.o0();
        L.o(y01.b, "dialogAiImageLoraAll");
        c f$c0 = new c(this, null);
        r.M(y01.b, null, f$c0, 1, null);
        Y0 y02 = this.o0();
        L.o(y02.c, "dialogAiImageLoraAllClose");
        com.dcinside.app.write.menu.ai.lora.f.d f$d0 = new com.dcinside.app.write.menu.ai.lora.f.d(this, null);
        r.M(y02.c, null, f$d0, 1, null);
        this.r0();
    }

    private final void p0() {
        static final class com.dcinside.app.write.menu.ai.lora.f.b extends N implements Function1 {
            final f e;

            com.dcinside.app.write.menu.ai.lora.f.b(f f0) {
                this.e = f0;
                super(1);
            }

            public final void a(C c0) {
                L.m(c0);
                this.e.s0(c0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((C)object0));
                return S0.a;
            }
        }

        b b0 = this.d;
        if(b0 != null) {
            b0.l();
        }
        this.d = new b();
        Context context0 = this.getContext();
        if(context0 != null) {
            rx.o o0 = com.dcinside.app.rx.bus.c.c(context0, C.class).x5((Object object0) -> {
                L.p(new com.dcinside.app.write.menu.ai.lora.f.b(this), "$tmp0");
                new com.dcinside.app.write.menu.ai.lora.f.b(this).invoke(object0);
            });
            b b1 = this.d;
            if(b1 != null) {
                b1.a(o0);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void q0(Function1 function10, Object object0) [...]

    private final void r0() {
        int v = this.b.x();
        Y0 y00 = this.o0();
        String s = this.getString(0x7F15058B, new Object[]{v, 2});  // string:make_ai_image_count "(%1$d/%2$d)"
        y00.f.setText(s);
    }

    private final void s0(C c0) {
        this.b.v(c0.a());
        this.r0();
    }

    private final void t0(String s) {
        static final class e extends N implements Function1 {
            final String e;

            e(String s) {
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
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new e(s)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
    }
}

