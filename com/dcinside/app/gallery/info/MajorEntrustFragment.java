package com.dcinside.app.gallery.info;

import A3.p;
import Y.k2;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nMajorEntrustFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MajorEntrustFragment.kt\ncom/dcinside/app/gallery/info/MajorEntrustFragment\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,146:1\n39#2:147\n55#2,12:148\n84#2,3:160\n*S KotlinDebug\n*F\n+ 1 MajorEntrustFragment.kt\ncom/dcinside/app/gallery/info/MajorEntrustFragment\n*L\n69#1:147\n69#1:148,12\n69#1:160,3\n*E\n"})
public final class MajorEntrustFragment extends Fragment {
    public interface a {
        void c0();
    }

    @m
    private k2 a;
    @m
    private String b;
    @m
    private I0 c;
    @m
    private o d;
    @m
    private a e;

    @Override  // androidx.fragment.app.Fragment
    public void onAttach(@l Context context0) {
        L.p(context0, "context");
        super.onAttach(context0);
        if(!(context0 instanceof a)) {
            throw new RuntimeException(context0 + " must implement OnFragmentInteractionListener");
        }
        this.e = (a)context0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        this.b = bundle1 == null ? null : bundle1.getString("com.dcinside.app.extra.GALLERY_ID");
        this.setHasOptionsMenu(true);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@l Menu menu0, @l MenuInflater menuInflater0) {
        @f(c = "com.dcinside.app.gallery.info.MajorEntrustFragment$onCreateOptionsMenu$1", f = "MajorEntrustFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gallery.info.MajorEntrustFragment.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final MajorEntrustFragment l;

            com.dcinside.app.gallery.info.MajorEntrustFragment.f(MajorEntrustFragment majorEntrustFragment0, d d0) {
                this.l = majorEntrustFragment0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.gallery.info.MajorEntrustFragment.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.s0();
                return S0.a;
            }
        }

        L.p(menu0, "menu");
        L.p(menuInflater0, "inflater");
        menuInflater0.inflate(0x7F100007, menu0);  // mipmap:ic_launcher11
        MenuItem menuItem0 = menu0.findItem(0x7F0B005B);  // id:action_entrust
        if(menuItem0 != null) {
            View view0 = menuItem0.getActionView();
            Button button0 = view0 == null ? null : ((Button)view0.findViewById(0x7F0B0816));  // id:menu_entrust_submit
            if(button0 != null) {
                r.M(button0, null, new com.dcinside.app.gallery.info.MajorEntrustFragment.f(this, null), 1, null);
            }
        }
        super.onCreateOptionsMenu(menu0, menuInflater0);
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = k2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.r0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        o o0 = this.d;
        if(o0 != null) {
            o0.l();
        }
        this.d = null;
        I0 i00 = this.c;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.c = null;
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.e = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @s0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 MajorEntrustFragment.kt\ncom/dcinside/app/gallery/info/MajorEntrustFragment\n*L\n1#1,82:1\n63#2:83\n59#3:84\n69#4:85\n*E\n"})
        public static final class g implements TextWatcher {
            final MajorEntrustFragment a;

            public g(MajorEntrustFragment majorEntrustFragment0) {
                this.a = majorEntrustFragment0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                this.a.y0();
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.x0(false);
        this.y0();
        k2 k20 = this.r0();
        L.o(k20.e, "majorEntrustInputValue");
        g majorEntrustFragment$g0 = new g(this);
        k20.e.addTextChangedListener(majorEntrustFragment$g0);
    }

    private final k2 r0() {
        k2 k20 = this.a;
        L.m(k20);
        return k20;
    }

    private final void s0() {
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
                L.p(p$a0, "it");
                return p$a0.m(0x7F150399);  // string:gallery_info_entrust_alert "매니저 위임 신청 게시물을 등록하시겠습니까?"
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


        static final class com.dcinside.app.gallery.info.MajorEntrustFragment.d extends N implements Function1 {
            final String e;
            final String f;
            final MajorEntrustFragment g;

            com.dcinside.app.gallery.info.MajorEntrustFragment.d(String s, String s1, MajorEntrustFragment majorEntrustFragment0) {
                this.e = s;
                this.f = s1;
                this.g = majorEntrustFragment0;
                super(1);
            }

            public final rx.g b(Boolean boolean0) {
                return uk.PF(this.e, this.f).R1(() -> {
                    L.p(this.g, "this$0");
                    this.g.x0(true);
                });
            }

            // 检测为 Lambda 实现
            private static final void c(MajorEntrustFragment majorEntrustFragment0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Boolean)object0));
            }
        }


        static final class e extends N implements Function1 {
            final MajorEntrustFragment e;

            e(MajorEntrustFragment majorEntrustFragment0) {
                this.e = majorEntrustFragment0;
                super(1);
            }

            public final void a(com.dcinside.app.response.f f0) {
                this.e.x0(false);
                a majorEntrustFragment$a0 = this.e.e;
                if(majorEntrustFragment$a0 != null) {
                    majorEntrustFragment$a0.c0();
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.response.f)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        String s = null;
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        if(!kl.a(new o[]{this.d})) {
            return;
        }
        String s1 = this.b;
        if(s1 == null) {
            return;
        }
        Editable editable0 = this.r0().e.getText();
        if(editable0 != null) {
            String s2 = editable0.toString();
            if(s2 != null) {
                s = v.G5(s2).toString();
            }
        }
        if(s != null && s.length() > 0) {
            Nk.a.d(this);
            this.d = com.dcinside.app.perform.e.e.a(appCompatActivity0).n(b.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                L.p(c.e, "$tmp0");
                return (Boolean)c.e.invoke(object0);
            }).f2((Object object0) -> {
                L.p(new com.dcinside.app.gallery.info.MajorEntrustFragment.d(s1, s, this), "$tmp0");
                return (rx.g)new com.dcinside.app.gallery.info.MajorEntrustFragment.d(s1, s, this).invoke(object0);
            }).y5((Object object0) -> {
                L.p(new e(this), "$tmp0");
                new e(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                L.p(appCompatActivity0, "$activity");
                this.x0(false);
                com.dcinside.app.perform.e e0 = com.dcinside.app.perform.e.e.a(appCompatActivity0);
                L.m(throwable0);
                this.d = e0.q(throwable0);
            });
            return;
        }
        Dl.D(this.getContext(), 0x7F15039E);  // string:gallery_info_entrust_empty "신청 사유를 입력해 주세요."
    }

    // 检测为 Lambda 实现
    private static final Boolean t0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final rx.g u0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void v0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void w0(MajorEntrustFragment majorEntrustFragment0, AppCompatActivity appCompatActivity0, Throwable throwable0) [...]

    private final void x0(boolean z) {
        @f(c = "com.dcinside.app.gallery.info.MajorEntrustFragment$progress$1", f = "MajorEntrustFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final boolean l;
            final MajorEntrustFragment m;

            h(boolean z, MajorEntrustFragment majorEntrustFragment0, d d0) {
                this.l = z;
                this.m = majorEntrustFragment0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new h(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((h)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                if(this.l) {
                    this.m.r0().g.setVisibility(4);
                    this.m.r0().f.setVisibility(0);
                    return S0.a;
                }
                this.m.r0().g.setVisibility(0);
                this.m.r0().f.setVisibility(8);
                return S0.a;
            }
        }

        I0 i00 = this.c;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        this.c = k.f(LifecycleOwnerKt.a(lifecycleOwner0), h0.e(), null, new h(z, this, null), 2, null);
    }

    private final void y0() {
        Editable editable0 = this.r0().e.getText();
        String s = this.getString(0x7F15039C, new Object[]{((int)(editable0 == null ? 0 : editable0.length())), 500});  // string:gallery_info_entrust_count "%1$d / %2$d"
        L.o(s, "getString(...)");
        this.r0().c.setText(s);
    }
}

