package com.dcinside.app.write.menu.ai.model;

import A3.p;
import Y.a1;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.AiImageStatusResult;
import com.dcinside.app.rx.bus.G;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.write.menu.ai.type.AiModelItem;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
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
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nModelAllDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelAllDialog.kt\ncom/dcinside/app/write/menu/ai/model/ModelAllDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,118:1\n1#2:119\n60#3:120\n177#4,9:121\n*S KotlinDebug\n*F\n+ 1 ModelAllDialog.kt\ncom/dcinside/app/write/menu/ai/model/ModelAllDialog\n*L\n96#1:120\n111#1:121,9\n*E\n"})
public final class e extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private a1 a;
    @m
    private b b;
    @m
    private com.dcinside.app.write.menu.ai.model.a c;
    @l
    public static final a d = null;
    @l
    public static final String e = "EXTRA_PROMPT_SELECTED_MODEL";

    static {
        e.d = new a(null);
    }

    private final void n0() {
        try {
            this.dismissAllowingStateLoss();
        }
        catch(Exception unused_ex) {
        }
    }

    private final a1 o0() {
        a1 a10 = this.a;
        L.m(a10);
        return a10;
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
        this.a = a1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.o0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        b b0 = this.b;
        if(b0 != null) {
            b0.l();
        }
        this.b = null;
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
        this.p0();
        this.r0();
    }

    private final void p0() {
        static final class com.dcinside.app.write.menu.ai.model.e.b extends N implements Function1 {
            final e e;

            com.dcinside.app.write.menu.ai.model.e.b(e e0) {
                this.e = e0;
                super(1);
            }

            public final void a(G g0) {
                L.m(g0);
                this.e.s0(g0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((G)object0));
                return S0.a;
            }
        }

        b b0 = this.b;
        if(b0 != null) {
            b0.l();
        }
        this.b = new b();
        Context context0 = this.getContext();
        if(context0 != null) {
            o o0 = c.c(context0, G.class).x5((Object object0) -> {
                L.p(new com.dcinside.app.write.menu.ai.model.e.b(this), "$tmp0");
                new com.dcinside.app.write.menu.ai.model.e.b(this).invoke(object0);
            });
            b b1 = this.b;
            if(b1 != null) {
                b1.a(o0);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void q0(Function1 function10, Object object0) [...]

    private final void r0() {
        @f(c = "com.dcinside.app.write.menu.ai.model.ModelAllDialog$initView$2", f = "ModelAllDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.model.e.c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final e l;

            com.dcinside.app.write.menu.ai.model.e.c(e e0, d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.ai.model.e.c(this.l, d0).invokeSuspend(S0.a);
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


        @f(c = "com.dcinside.app.write.menu.ai.model.ModelAllDialog$initView$3", f = "ModelAllDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.model.e.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final e l;

            com.dcinside.app.write.menu.ai.model.e.d(e e0, d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.ai.model.e.d(this.l, d0).invokeSuspend(S0.a);
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

        List list1;
        List list0;
        Context context0 = this.getContext();
        if(context0 != null) {
            this.c = new com.dcinside.app.write.menu.ai.model.a(true, context0);
        }
        a1 a10 = this.o0();
        L.o(a10.b, "dialogAiImageModelAll");
        com.dcinside.app.write.menu.ai.model.e.c e$c0 = new com.dcinside.app.write.menu.ai.model.e.c(this, null);
        r.M(a10.b, null, e$c0, 1, null);
        a1 a11 = this.o0();
        L.o(a11.d, "dialogAiImageModelAllClose");
        com.dcinside.app.write.menu.ai.model.e.d e$d0 = new com.dcinside.app.write.menu.ai.model.e.d(this, null);
        r.M(a11.d, null, e$d0, 1, null);
        a1 a12 = this.o0();
        GridLayoutManager gridLayoutManager0 = new GridLayoutManager(a12.f.getContext(), 3);
        a12.f.setLayoutManager(gridLayoutManager0);
        a12.f.setItemAnimator(null);
        a12.f.setAdapter(this.c);
        if(Build.VERSION.SDK_INT >= 33) {
            com.dcinside.app.write.menu.ai.model.a a0 = this.c;
            if(a0 != null) {
                Bundle bundle0 = this.getArguments();
                if(bundle0 == null) {
                    list0 = u.H();
                }
                else {
                    AiImageStatusResult aiImageStatusResult0 = (AiImageStatusResult)bundle0.getParcelable("EXTRA_INFO", AiImageStatusResult.class);
                    if(aiImageStatusResult0 == null) {
                        list0 = u.H();
                    }
                    else {
                        list0 = aiImageStatusResult0.r();
                        if(list0 == null) {
                            list0 = u.H();
                        }
                    }
                }
                a0.A(list0);
            }
            Bundle bundle1 = this.getArguments();
            if(bundle1 != null) {
                AiModelItem aiModelItem0 = (AiModelItem)bundle1.getParcelable("EXTRA_PROMPT_SELECTED_MODEL", AiModelItem.class);
                if(aiModelItem0 != null) {
                    com.dcinside.app.write.menu.ai.model.a a1 = this.c;
                    if(a1 != null) {
                        a1.y(aiModelItem0);
                    }
                }
            }
        }
        else {
            com.dcinside.app.write.menu.ai.model.a a2 = this.c;
            if(a2 != null) {
                Bundle bundle2 = this.getArguments();
                if(bundle2 == null) {
                    list1 = u.H();
                }
                else {
                    AiImageStatusResult aiImageStatusResult1 = (AiImageStatusResult)bundle2.getParcelable("EXTRA_INFO");
                    if(aiImageStatusResult1 == null) {
                        list1 = u.H();
                    }
                    else {
                        list1 = aiImageStatusResult1.r();
                        if(list1 == null) {
                            list1 = u.H();
                        }
                    }
                }
                a2.A(list1);
            }
            Bundle bundle3 = this.getArguments();
            if(bundle3 != null) {
                AiModelItem aiModelItem1 = (AiModelItem)bundle3.getParcelable("EXTRA_PROMPT_SELECTED_MODEL");
                if(aiModelItem1 != null) {
                    com.dcinside.app.write.menu.ai.model.a a3 = this.c;
                    if(a3 != null) {
                        a3.y(aiModelItem1);
                    }
                }
            }
        }
    }

    private final void s0(G g0) {
        AiModelItem aiModelItem0 = g0.a();
        com.dcinside.app.write.menu.ai.model.a a0 = this.c;
        if(a0 != null) {
            a0.y(aiModelItem0);
        }
    }
}

