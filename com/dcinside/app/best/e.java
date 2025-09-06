package com.dcinside.app.best;

import A3.p;
import Y.w1;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.B;
import com.dcinside.app.rx.bus.j;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import java.util.Arrays;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nBestGallerConSettingDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BestGallerConSettingDialogFragment.kt\ncom/dcinside/app/best/BestGallerConSettingDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,155:1\n1#2:156\n35#3:157\n*S KotlinDebug\n*F\n+ 1 BestGallerConSettingDialogFragment.kt\ncom/dcinside/app/best/BestGallerConSettingDialogFragment\n*L\n47#1:157\n*E\n"})
public final class e extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private w1 a;
    @m
    private o b;
    @l
    public static final a c = null;
    @l
    public static final String d = "com.dcinside.app.hit.BestGallerConSettingDialogFragment_EXTRA_IS_GO_NICK";
    @l
    public static final String e = "com.dcinside.app.hit.BestGallerConSettingDialogFragment_EXTRA_IS_ENABLE_GALLER_CON";

    static {
        e.c = new a(null);
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
        this.a = w1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.q0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        o o0 = this.b;
        if(o0 != null) {
            o0.l();
        }
        this.b = null;
        this.a = null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        int v = 0;
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Context context0 = dialog0.getContext();
            if(context0 != null) {
                Configuration configuration0 = context0.getResources().getConfiguration();
                L.o(configuration0, "getConfiguration(...)");
                if(configuration0 != null) {
                    v = Dk.d(Math.min(configuration0.smallestScreenWidthDp, 380) - 20);
                }
            }
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            Window window0 = dialog1.getWindow();
            if(window0 != null) {
                window0.setLayout(v, -2);
                WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                windowManager$LayoutParams0.gravity = 17;
                window0.setAttributes(windowManager$LayoutParams0);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @f(c = "com.dcinside.app.best.BestGallerConSettingDialogFragment$onViewCreated$1", f = "BestGallerConSettingDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final e l;

            b(e e0, d d0) {
                this.l = e0;
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
                this.l.v0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.best.BestGallerConSettingDialogFragment$onViewCreated$2", f = "BestGallerConSettingDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nBestGallerConSettingDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BestGallerConSettingDialogFragment.kt\ncom/dcinside/app/best/BestGallerConSettingDialogFragment$onViewCreated$2\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,155:1\n177#2,9:156\n*S KotlinDebug\n*F\n+ 1 BestGallerConSettingDialogFragment.kt\ncom/dcinside/app/best/BestGallerConSettingDialogFragment$onViewCreated$2\n*L\n70#1:156,9\n*E\n"})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final e l;

            c(e e0, d d0) {
                this.l = e0;
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
                try {
                    this.l.dismissAllowingStateLoss();
                }
                catch(Exception unused_ex) {
                }
                return S0.a;
            }
        }


        static final class com.dcinside.app.best.e.d extends N implements Function1 {
            public static final com.dcinside.app.best.e.d e;

            static {
                com.dcinside.app.best.e.d.e = new com.dcinside.app.best.e.d();
            }

            com.dcinside.app.best.e.d() {
                super(1);
            }

            @m
            public final String a(@l B b0) {
                L.p(b0, "it");
                return b0.a6();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((B)object0));
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.u0();
        Bundle bundle1 = this.getArguments();
        this.q0().g.setChecked(bundle1 != null && bundle1.getBoolean("com.dcinside.app.hit.BestGallerConSettingDialogFragment_EXTRA_IS_ENABLE_GALLER_CON"));
        w1 w10 = this.q0();
        L.o(w10.h, "bestGallerSettingEnableWrapper");
        b e$b0 = new b(this, null);
        r.M(w10.h, null, e$b0, 1, null);
        w1 w11 = this.q0();
        L.o(w11.c, "bestGallerSettingClose");
        c e$c0 = new c(this, null);
        r.M(w11.c, null, e$c0, 1, null);
        Context context0 = view0.getContext();
        L.m(context0);
        String s = String.format("#%06X", Arrays.copyOf(new Object[]{((int)(vk.b(context0, 0x7F04012E) & 0xFFFFFF))}, 1));  // attr:colorAccent
        L.o(s, "format(...)");
        w1 w12 = this.q0();
        Spanned spanned0 = Dl.c(this.getString(0x7F15014C, new Object[]{s}));  // string:best_galler_setting_content2 "- 사용 변경은 <font color=%1$s>하루 1번<font/>만 가능 
                                                                               // 합니다."
        w12.e.setText(spanned0);
        if(!L.g(dl.a.w0(), Bk.G(System.currentTimeMillis()))) {
            this.r0();
            return;
        }
        String s1 = (String)B.E.W(com.dcinside.app.best.e.d.e);
        w1 w13 = this.q0();
        String s2 = Bk.o(s1);
        w13.f.setText(s2);
    }

    private final w1 q0() {
        w1 w10 = this.a;
        L.m(w10);
        return w10;
    }

    private final void r0() {
        static final class com.dcinside.app.best.e.e extends N implements Function1 {
            final e e;

            com.dcinside.app.best.e.e(e e0) {
                this.e = e0;
                super(1);
            }

            public final void a(com.dcinside.app.model.l l0) {
                static final class com.dcinside.app.best.e.e.a extends N implements Function1 {
                    public static final com.dcinside.app.best.e.e.a e;

                    static {
                        com.dcinside.app.best.e.e.a.e = new com.dcinside.app.best.e.e.a();
                    }

                    com.dcinside.app.best.e.e.a() {
                        super(1);
                    }

                    @m
                    public final String a(@l B b0) {
                        L.p(b0, "login");
                        return b0.a6();
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((B)object0));
                    }
                }

                this.e.q0().k.setVisibility(8);
                if(l0.d()) {
                    w1 w10 = this.e.q0();
                    boolean z = B.E.b0(l0.a());
                    w10.g.setChecked(z);
                    String s = (String)B.E.W(com.dcinside.app.best.e.e.a.e);
                    w1 w11 = this.e.q0();
                    String s1 = Bk.o(s);
                    w11.f.setText(s1);
                    return;
                }
                Dl.G(this.e.getContext(), l0.b());
                Context context0 = this.e.getContext();
                AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
                if(appCompatActivity0 != null) {
                    com.dcinside.app.rx.bus.c.a(appCompatActivity0, new j());
                }
                this.e.dismissAllowingStateLoss();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.l)object0));
                return S0.a;
            }
        }

        this.q0().k.setVisibility(0);
        this.b = uk.IG(null).y5((Object object0) -> {
            L.p(new com.dcinside.app.best.e.e(this), "$tmp0");
            new com.dcinside.app.best.e.e(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.q0().k.setVisibility(8);
            Dl.G(this.getContext(), throwable0.getMessage());
            Context context0 = this.getContext();
            AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
            if(appCompatActivity0 != null) {
                com.dcinside.app.rx.bus.c.a(appCompatActivity0, new j());
            }
            this.dismissAllowingStateLoss();
        });
    }

    // 检测为 Lambda 实现
    private static final void s0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void t0(e e0, Throwable throwable0) [...]

    private final void u0() {
        Bundle bundle0 = this.getArguments();
        int v = bundle0 == null || !bundle0.getBoolean("com.dcinside.app.hit.BestGallerConSettingDialogFragment_EXTRA_IS_GO_NICK") ? 0x7F08036C : 0x7F08036D;  // drawable:icon_nick_best0
        this.q0().i.setImageResource(v);
    }

    private final void v0() {
        this.w0(!this.q0().g.isChecked());
    }

    private final void w0(boolean z) {
        static final class com.dcinside.app.best.e.f extends N implements Function1 {
            final e e;
            final boolean f;

            com.dcinside.app.best.e.f(e e0, boolean z) {
                this.e = e0;
                this.f = z;
                super(1);
            }

            public final void a(com.dcinside.app.model.l l0) {
                this.e.q0().k.setVisibility(8);
                if(l0.d()) {
                    FragmentActivity fragmentActivity0 = this.e.getActivity();
                    AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
                    if(appCompatActivity0 == null) {
                        return;
                    }
                    com.dcinside.app.rx.bus.c.a(appCompatActivity0, new j());
                    String s = Bk.G(System.currentTimeMillis());
                    dl.a.p4(s);
                    this.e.dismissAllowingStateLoss();
                    Dl.D(appCompatActivity0, (this.f ? 0x7F150155 : 0x7F150154));  // string:best_galler_use "사용 설정되었습니다."
                    return;
                }
                Dl.G(this.e.getContext(), l0.b());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.l)object0));
                return S0.a;
            }
        }

        o o0 = this.b;
        if(o0 != null) {
            o0.l();
        }
        this.q0().k.setVisibility(0);
        this.b = uk.IG(Boolean.valueOf(z)).y5((Object object0) -> {
            L.p(new com.dcinside.app.best.e.f(this, z), "$tmp0");
            new com.dcinside.app.best.e.f(this, z).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.q0().k.setVisibility(8);
            Dl.G(this.getContext(), throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final void x0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void y0(e e0, Throwable throwable0) [...]
}

