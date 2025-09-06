package com.dcinside.app.write.menu.ai.lora;

import A3.p;
import Y.Z0;
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
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.C;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.write.menu.ai.type.LoraModel;
import java.util.Arrays;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nLoraSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoraSettingDialog.kt\ncom/dcinside/app/write/menu/ai/lora/LoraSettingDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,142:1\n1#2:143\n27#3:144\n257#4,2:145\n257#4,2:147\n177#5,9:149\n177#5,9:158\n*S KotlinDebug\n*F\n+ 1 LoraSettingDialog.kt\ncom/dcinside/app/write/menu/ai/lora/LoraSettingDialog\n*L\n36#1:144\n82#1:145,2\n84#1:147,2\n98#1:149,9\n132#1:158,9\n*E\n"})
public final class i extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private Z0 a;
    @m
    private LoraModel b;
    @l
    public static final a c = null;
    @l
    public static final String d = "EXTRA_SELECTED_TYPE";
    private static final float e = 1.0f;
    private static final float f = 0.1f;
    private static final float g = 0.6f;

    static {
        i.c = new a(null);
    }

    private final void n0() {
        Float float0 = v.N0(this.p0().o.getText().toString());
        if(float0 == null) {
            this.t0();
            return;
        }
        if(!s.e(0.1f, 1.0f).a(float0)) {
            this.t0();
            return;
        }
        LoraModel loraModel0 = this.b;
        if(loraModel0 != null) {
            loraModel0.o(float0.toString());
            Context context0 = this.getContext();
            if(context0 != null) {
                L.m(context0);
                c.a(context0, new C(loraModel0));
            }
        }
        this.o0();
    }

    private final void o0() {
        try {
            this.dismissAllowingStateLoss();
        }
        catch(Exception unused_ex) {
        }
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
        this.a = Z0.d(layoutInflater0, viewGroup0, false);
        View view0 = this.p0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
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
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            return;
        }
        LoraModel loraModel0 = (LoraModel)BundleCompat.b(bundle1, "EXTRA_SELECTED_TYPE", LoraModel.class);
        this.b = loraModel0;
        if(loraModel0 == null) {
            this.o0();
            return;
        }
        this.s0();
        this.q0();
    }

    private final Z0 p0() {
        Z0 z00 = this.a;
        L.m(z00);
        return z00;
    }

    private final void q0() {
        @f(c = "com.dcinside.app.write.menu.ai.lora.LoraSettingDialog$initCallBack$1", f = "LoraSettingDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final i l;

            b(i i0, d d0) {
                this.l = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.r0(false);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.lora.LoraSettingDialog$initCallBack$2", f = "LoraSettingDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.lora.i.c extends o implements p {
            int k;
            final i l;

            com.dcinside.app.write.menu.ai.lora.i.c(i i0, d d0) {
                this.l = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.ai.lora.i.c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.r0(true);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.lora.LoraSettingDialog$initCallBack$3", f = "LoraSettingDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.lora.i.d extends o implements p {
            int k;
            final i l;

            com.dcinside.app.write.menu.ai.lora.i.d(i i0, d d0) {
                this.l = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.ai.lora.i.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.o0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.lora.LoraSettingDialog$initCallBack$4", f = "LoraSettingDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements p {
            int k;
            final i l;

            e(i i0, d d0) {
                this.l = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.o0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.lora.LoraSettingDialog$initCallBack$5", f = "LoraSettingDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.lora.i.f extends o implements p {
            int k;
            final i l;

            com.dcinside.app.write.menu.ai.lora.i.f(i i0, d d0) {
                this.l = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.ai.lora.i.f(this.l, d0).invokeSuspend(S0.a);
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

        Z0 z00 = this.p0();
        L.o(z00.m, "dialogAiImageLoraSettingValueDecrease");
        b i$b0 = new b(this, null);
        r.M(z00.m, null, i$b0, 1, null);
        Z0 z01 = this.p0();
        L.o(z01.n, "dialogAiImageLoraSettingValueIncrease");
        com.dcinside.app.write.menu.ai.lora.i.c i$c0 = new com.dcinside.app.write.menu.ai.lora.i.c(this, null);
        r.M(z01.n, null, i$c0, 1, null);
        Z0 z02 = this.p0();
        L.o(z02.b, "dialogAiImageLoraSetting");
        com.dcinside.app.write.menu.ai.lora.i.d i$d0 = new com.dcinside.app.write.menu.ai.lora.i.d(this, null);
        r.M(z02.b, null, i$d0, 1, null);
        Z0 z03 = this.p0();
        L.o(z03.i, "dialogAiImageLoraSettingClose");
        e i$e0 = new e(this, null);
        r.M(z03.i, null, i$e0, 1, null);
        Z0 z04 = this.p0();
        L.o(z04.h, "dialogAiImageLoraSettingApply");
        com.dcinside.app.write.menu.ai.lora.i.f i$f0 = new com.dcinside.app.write.menu.ai.lora.i.f(this, null);
        r.M(z04.h, null, i$f0, 1, null);
    }

    private final void r0(boolean z) {
        Float float0 = null;
        try {
            float0 = v.N0(this.p0().o.getText().toString());
        }
        catch(Exception unused_ex) {
        }
        float f = float0 == null ? 0.6f : ((float)float0);
        Z0 z00 = this.p0();
        String s = String.format("%.1f", Arrays.copyOf(new Object[]{((float)(z ? Math.min(f + 0.1f, 1.0f) : Math.max(f - 0.1f, 0.1f)))}, 1));
        L.o(s, "format(...)");
        z00.o.setText(s);
    }

    private final void s0() {
        LoraModel loraModel0 = this.b;
        if(loraModel0 == null) {
            return;
        }
        this.p0().l.setText(loraModel0.f());
        this.p0().o.setText((loraModel0.h() == null ? "0.6" : loraModel0.h()));
        String s = loraModel0.a();
        if(s != null && s.length() != 0) {
            Z0 z00 = this.p0();
            L.o(z00.g, "dialogAiImageLoraSettingAddWrap");
            z00.g.setVisibility(0);
            this.p0().f.setText(s);
            return;
        }
        Z0 z01 = this.p0();
        L.o(z01.g, "dialogAiImageLoraSettingAddWrap");
        z01.g.setVisibility(8);
    }

    private final void t0() {
        static final class g extends N implements Function1 {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F150578);  // string:make_ai_image_accent_need_value "강도는 0.1~1.0 사이로 설정 가능합니다."
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
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(g.e).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
    }
}

