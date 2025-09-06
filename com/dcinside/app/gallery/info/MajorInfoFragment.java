package com.dcinside.app.gallery.info;

import A3.p;
import Y.l2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import com.dcinside.app.auth.LoginActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.ManagerItem;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.rx.e.b;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import io.realm.F0;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.O;
import rx.g;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nMajorInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MajorInfoFragment.kt\ncom/dcinside/app/gallery/info/MajorInfoFragment\n+ 2 Optional.kt\ncom/dcinside/app/rx/OptionalKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,276:1\n10#2,7:277\n1#3:284\n1863#4,2:285\n37#5,2:287\n*S KotlinDebug\n*F\n+ 1 MajorInfoFragment.kt\ncom/dcinside/app/gallery/info/MajorInfoFragment\n*L\n148#1:277,7\n203#1:285,2\n248#1:287,2\n*E\n"})
public final class MajorInfoFragment extends Fragment {
    public interface a {
        @m
        F0 Q();

        @l
        g d0();
    }

    @m
    private l2 a;
    @m
    private a b;
    @m
    private o c;
    @m
    private String d;

    private final void A0() {
        static final class c extends N implements Function1 {
            final MajorInfoFragment e;

            c(MajorInfoFragment majorInfoFragment0) {
                this.e = majorInfoFragment0;
                super(1);
            }

            public final void a(V v0) {
                this.e.H0(((GalleryInfo)v0.a()), ((com.dcinside.app.response.g)v0.b()));
                this.e.L0(false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((V)object0));
                return S0.a;
            }
        }

        a majorInfoFragment$a0 = this.b;
        if(majorInfoFragment$a0 == null) {
            return;
        }
        this.L0(true);
        o o0 = this.c;
        if(o0 != null) {
            o0.l();
        }
        g g0 = majorInfoFragment$a0.d0().f2(new b(com.dcinside.app.rx.e.a.e));
        L.o(g0, "flatMap(...)");
        this.c = g0.y5((Object object0) -> {
            L.p(new c(this), "$tmp0");
            new c(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.m(throwable0);
            this.I0(throwable0);
        });
    }

    // 检测为 Lambda 实现
    private static final void B0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void C0(MajorInfoFragment majorInfoFragment0, Throwable throwable0) [...]

    private final void D0() {
        static final class d extends N implements Function1 {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15078F);  // string:please_login_request "로그인 후 이용할 수 있습니다."
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


        static final class f extends N implements Function1 {
            final com.dcinside.app.base.d e;
            final MajorInfoFragment f;

            f(com.dcinside.app.base.d d0, MajorInfoFragment majorInfoFragment0) {
                this.e = d0;
                this.f = majorInfoFragment0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                static final class com.dcinside.app.gallery.info.MajorInfoFragment.f.a extends N implements p {
                    final MajorInfoFragment e;

                    com.dcinside.app.gallery.info.MajorInfoFragment.f.a(MajorInfoFragment majorInfoFragment0) {
                        this.e = majorInfoFragment0;
                        super(3);
                    }

                    public final void a(int v, int v1, @m Intent intent0) {
                        if(v1 == -1) {
                            this.e.A0();
                        }
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.a(((Number)object0).intValue(), ((Number)object1).intValue(), ((Intent)object2));
                        return S0.a;
                    }
                }

                if(com.dcinside.app.main.login.g.a.p()) {
                    com.dcinside.app.base.d.y1(this.e, 0, null, null, 0, false, 0x1F, null);
                    return;
                }
                Intent intent0 = LoginActivity.x.b(this.e, false);
                com.dcinside.app.gallery.info.MajorInfoFragment.f.a majorInfoFragment$f$a0 = new com.dcinside.app.gallery.info.MajorInfoFragment.f.a(this.f);
                com.dcinside.app.base.d.t.a(this.e, intent0, 0x403, majorInfoFragment$f$a0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        if(B.E.k0() == null) {
            FragmentActivity fragmentActivity0 = this.getActivity();
            com.dcinside.app.base.d d0 = fragmentActivity0 instanceof com.dcinside.app.base.d ? ((com.dcinside.app.base.d)fragmentActivity0) : null;
            if(d0 == null) {
                return;
            }
            com.dcinside.app.perform.e.e.a(d0).n(d.e).z(0x7F150537).x(0x1040000).b().Z1((Object object0) -> {
                L.p(e.e, "$tmp0");
                return (Boolean)e.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new f(d0, this), "$tmp0");
                new f(d0, this).invoke(object0);
            }, (Throwable throwable0) -> timber.log.b.a.y(throwable0));
            return;
        }
        NavController navController0 = FragmentKt.a(this);
        NavDestination navDestination0 = navController0.I();
        if(navDestination0 != null && navDestination0.q() == 0x7F0B076B) {  // id:majorInfoFragment
            navController0.W(0x7F0B0063, BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.GALLERY_ID", this.d)}));  // id:action_majorInfo_to_majorEntrust
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean E0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void F0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void G0(Throwable throwable0) [...]

    private final void H0(GalleryInfo galleryInfo0, com.dcinside.app.response.g g0) {
        this.d = galleryInfo0.r();
        l2 l20 = this.w0();
        L.m(l20.n);
        Spannable spannable0 = this.y0(g0, l20.n);
        l20.n.setText(spannable0);
        l2 l21 = this.w0();
        L.m(l21.l);
        this.v0(g0, l21.l);
        l2 l22 = this.w0();
        L.m(l22.p);
        Spannable spannable1 = this.z0(g0, l22.p);
        l22.p.setText(spannable1);
        l2 l23 = this.w0();
        L.o(l23.d, "majorCreateDateTitle");
        l2 l24 = this.w0();
        L.o(l24.e, "majorCreateDateValue");
        this.t0(l23.d, l24.e, g0.w());
        l2 l25 = this.w0();
        L.o(l25.b, "majorChangeDateTitle");
        l2 l26 = this.w0();
        L.o(l26.c, "majorChangeDateValue");
        this.t0(l25.b, l26.c, g0.x());
        int v = this.x0(g0);
        this.w0().k.setVisibility(v);
        this.w0().i.setVisibility(v);
        l2 l27 = this.w0();
        L.m(l27.j);
        this.u0(g0, l27.j, galleryInfo0.r());
    }

    private final void I0(Throwable throwable0) {
        static final class com.dcinside.app.gallery.info.MajorInfoFragment.g extends N implements Function1 {
            final Throwable e;

            com.dcinside.app.gallery.info.MajorInfoFragment.g(Throwable throwable0) {
                this.e = throwable0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e.getMessage());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class h extends N implements Function1 {
            final MajorInfoFragment e;
            final MajorMoreActivity f;

            h(MajorInfoFragment majorInfoFragment0, MajorMoreActivity majorMoreActivity0) {
                this.e = majorInfoFragment0;
                this.f = majorMoreActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    this.e.A0();
                    return;
                }
                this.f.onBackPressed();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        MajorMoreActivity majorMoreActivity0 = fragmentActivity0 instanceof MajorMoreActivity ? ((MajorMoreActivity)fragmentActivity0) : null;
        if(majorMoreActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(majorMoreActivity0).n(new com.dcinside.app.gallery.info.MajorInfoFragment.g(throwable0)).z(0x7F1508D7).x(0x1040000).b().y5((Object object0) -> {
            L.p(new h(this, majorMoreActivity0), "$tmp0");
            new h(this, majorMoreActivity0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(majorMoreActivity0, "$activity");
            majorMoreActivity0.onBackPressed();
        });
    }

    // 检测为 Lambda 实现
    private static final void J0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void K0(MajorMoreActivity majorMoreActivity0, Throwable throwable0) [...]

    private final void L0(boolean z) {
        if(z) {
            this.w0().h.setVisibility(4);
            this.w0().g.setVisibility(0);
            return;
        }
        this.w0().h.setVisibility(0);
        this.w0().g.setVisibility(8);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onActivityCreated(@m Bundle bundle0) {
        super.onActivityCreated(bundle0);
        if(!(this.getActivity() instanceof MajorMoreActivity)) {
            return;
        }
        this.A0();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onAttach(@l Context context0) {
        L.p(context0, "context");
        super.onAttach(context0);
        if(!(context0 instanceof a)) {
            throw new RuntimeException(context0 + " must implement OnFragmentInteractionListener");
        }
        this.b = (a)context0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        this.setHasOptionsMenu(true);
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = l2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.w0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        o o0 = this.c;
        if(o0 != null) {
            o0.l();
        }
        this.c = null;
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.b = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            FragmentActivity fragmentActivity0 = this.getActivity();
            if(fragmentActivity0 != null) {
                fragmentActivity0.onBackPressed();
            }
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        super.onPrepareOptionsMenu(menu0);
        FragmentActivity fragmentActivity0 = this.getActivity();
        kr.bhbfhfb.designcompat.a.d((fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null));
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.gallery.info.MajorInfoFragment$onViewCreated$1", f = "MajorInfoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final MajorInfoFragment l;

            i(MajorInfoFragment majorInfoFragment0, kotlin.coroutines.d d0) {
                this.l = majorInfoFragment0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new i(this.l, d0).invokeSuspend(S0.a);
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
                this.l.D0();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        l2 l20 = this.w0();
        L.o(l20.i, "majorManagerEntrust");
        i majorInfoFragment$i0 = new i(this, null);
        r.M(l20.i, null, majorInfoFragment$i0, 1, null);
    }

    private final void t0(TextView textView0, TextView textView1, String s) {
        if(s == null || L.g(s, "0000.00.00")) {
            s = null;
        }
        if(s != null) {
            textView0.setVisibility(0);
            textView1.setVisibility(0);
            textView1.setText(s);
            return;
        }
        textView0.setVisibility(8);
        textView1.setVisibility(8);
    }

    private final void u0(com.dcinside.app.response.g g0, ViewGroup viewGroup0, String s) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.gallery.info.MajorInfoFragment$applyEntrustList$1$1", f = "MajorInfoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gallery.info.MajorInfoFragment.b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AppCompatActivity l;
            final String m;
            final int n;

            com.dcinside.app.gallery.info.MajorInfoFragment.b(AppCompatActivity appCompatActivity0, String s, int v, kotlin.coroutines.d d0) {
                this.l = appCompatActivity0;
                this.m = s;
                this.n = v;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.gallery.info.MajorInfoFragment.b(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                Xk.k(this.l, this.m, this.n, false, false, false, 56, null);
                return S0.a;
            }
        }

        if(viewGroup0.getChildCount() > 0) {
            viewGroup0.removeAllViews();
        }
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        List list0 = g0.z();
        int v = 0;
        if(appCompatActivity0 != null && s != null && list0 != null && !list0.isEmpty() == 1) {
            Spanned spanned0 = Dl.c("<u>위임 신청 게시글 보기</u> ▶");
            for(Object object0: list0) {
                int v1 = ((com.dcinside.app.response.g.a)object0).a();
                String s1 = ((com.dcinside.app.response.g.a)object0).b();
                View view0 = layoutInflater0.inflate(0x7F0E01CF, viewGroup0, false);  // layout:view_entrust_item
                TextView textView0 = (TextView)view0.findViewById(0x7F0B0455);  // id:entrust_item_title
                TextView textView1 = (TextView)view0.findViewById(0x7F0B0454);  // id:entrust_item_desc
                textView0.setText(s1);
                textView1.setText(spanned0);
                L.m(textView1);
                r.M(textView1, null, new com.dcinside.app.gallery.info.MajorInfoFragment.b(appCompatActivity0, s, v1, null), 1, null);
                viewGroup0.addView(view0);
            }
        }
        if(viewGroup0.getChildCount() == 0) {
            v = 8;
        }
        viewGroup0.setVisibility(v);
    }

    private final void v0(com.dcinside.app.response.g g0, TextView textView0) {
        String s = g0.D();
        if(s != null && s.length() > 0) {
            textView0.setVisibility(0);
            textView0.setText(this.getString(0x7F1503A8, new Object[]{s}));  // string:gallery_info_manager_m_desc "사임 사유 : %s"
            return;
        }
        textView0.setVisibility(8);
    }

    private final l2 w0() {
        l2 l20 = this.a;
        L.m(l20);
        return l20;
    }

    // 去混淆评级： 低(20)
    private final int x0(com.dcinside.app.response.g g0) {
        return g0.C() ? 0 : 8;
    }

    private final Spannable y0(com.dcinside.app.response.g g0, TextView textView0) {
        return com.dcinside.app.span.g.o(textView0, -1, 0x7F0600A5, new ManagerItem[]{new ManagerItem(g0.A(), g0.B(), g0.E(), g0.y())});  // color:caution
    }

    private final Spannable z0(com.dcinside.app.response.g g0, TextView textView0) {
        List list0 = g0.F();
        if(list0 != null) {
            ManagerItem[] arr_managerItem = (ManagerItem[])list0.toArray(new ManagerItem[0]);
            return arr_managerItem == null ? com.dcinside.app.span.g.p(textView0, -1, ((ManagerItem[])Arrays.copyOf(new ManagerItem[0], 0))) : com.dcinside.app.span.g.p(textView0, -1, ((ManagerItem[])Arrays.copyOf(arr_managerItem, arr_managerItem.length)));
        }
        return com.dcinside.app.span.g.p(textView0, -1, ((ManagerItem[])Arrays.copyOf(new ManagerItem[0], 0)));
    }
}

