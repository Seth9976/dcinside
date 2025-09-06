package com.dcinside.app.post.manager;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.base.i;
import com.dcinside.app.internal.c;
import com.dcinside.app.internal.t;
import com.dcinside.app.model.F;
import com.dcinside.app.model.G;
import com.dcinside.app.model.H;
import com.dcinside.app.model.f0;
import com.dcinside.app.post.fragments.S0;
import com.dcinside.app.realm.q;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.uk;
import io.realm.F0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.text.v;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nPostListManagerNotifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListManagerNotifier.kt\ncom/dcinside/app/post/manager/PostListManagerNotifier\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n147#2:206\n120#3,3:207\n124#3:211\n204#3,7:213\n1#4:210\n1#4:212\n*S KotlinDebug\n*F\n+ 1 PostListManagerNotifier.kt\ncom/dcinside/app/post/manager/PostListManagerNotifier\n*L\n35#1:206\n103#1:207,3\n103#1:211\n142#1:213,7\n103#1:210\n*E\n"})
public final class r implements i {
    @s0({"SMAP\nPostListManagerNotifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListManagerNotifier.kt\ncom/dcinside/app/post/manager/PostListManagerNotifier$SortItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    static final class a {
        @m
        private final Date a;
        @m
        private final F b;
        @m
        private final G c;

        public a(@l F f0) {
            L.p(f0, "appoint");
            super();
            String s = f0.i();
            this.a = s == null ? null : Bk.j(s);
            this.b = f0;
            this.c = null;
        }

        public a(@l G g0) {
            L.p(g0, "befired");
            super();
            String s = g0.g();
            this.a = s == null ? null : Bk.j(s);
            this.b = null;
            this.c = g0;
        }

        @m
        public final F a() {
            return this.b;
        }

        @m
        public final G b() {
            return this.c;
        }

        @m
        public final Date c() {
            return this.a;
        }
    }

    private final long a;
    private final boolean b;
    @l
    private final String c;
    @l
    private final t d;
    @l
    private List e;
    @m
    private o f;
    @m
    private o g;
    @l
    private com.dcinside.app.type.m h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public r(@l String s, @l S0 s00) {
        L.p(s, "galleryId");
        L.p(s00, "fragment");
        super();
        long v = jl.a.o0();
        this.a = v;
        this.b = v > 0L;
        this.c = s;
        this.d = new t(s00);
        this.e = new ArrayList();
        this.h = com.dcinside.app.type.m.g;
    }

    private final void A(boolean z) {
        if(this.n != z) {
            this.n = z;
            this.o();
        }
    }

    public final void B(boolean z) {
        if(this.i != z) {
            this.i = z;
            this.n();
        }
    }

    public final void C(@l com.dcinside.app.type.m m0) {
        L.p(m0, "<set-?>");
        this.h = m0;
    }

    public final void D(boolean z) {
        if(this.m != z) {
            this.m = z;
            this.n();
        }
    }

    public final void E(boolean z) {
        if(this.l != z) {
            this.l = z;
            this.n();
        }
    }

    public final void F(boolean z) {
        if(this.j != z) {
            this.j = z;
            this.n();
        }
    }

    public final void G(boolean z) {
        if(this.k != z) {
            this.k = z;
            this.n();
        }
    }

    private final void H(F f0) {
        S0 s00 = (S0)this.d.a();
        if(s00 != null) {
            FragmentActivity fragmentActivity0 = s00.getActivity();
            if(fragmentActivity0 == null) {
                s00 = null;
            }
            else {
                L.m(fragmentActivity0);
                if(!c.n(fragmentActivity0)) {
                    s00 = null;
                }
            }
            if(s00 != null) {
                String s = f0.l();
                V[] arr_v = {r0.a("com.dcinside.app.extra.TYPE", this.h.c()), r0.a("com.dcinside.app.extra.NAME", f0.k()), r0.a("com.dcinside.app.extra.ID", f0.j()), r0.a("com.dcinside.app.extra.IS_MANAGER", Boolean.valueOf(L.g(s, "S") || L.g(s, "M")))};
                FragmentManager fragmentManager0 = s00.getChildFragmentManager();
                L.o(fragmentManager0, "getChildFragmentManager(...)");
                FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                ClassLoader classLoader0 = g.class.getClassLoader();
                L.m(classLoader0);
                Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.post.manager.g");
                if(fragment0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.post.manager.ManagerNotifyDialogFragment");
                }
                ((g)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 4))));
                ((g)fragment0).show(fragmentManager0, "com.dcinside.app.post.manager.g");
                Dialog dialog0 = ((g)fragment0).getDialog();
                if(dialog0 != null) {
                    dialog0.setOnDismissListener((DialogInterface dialogInterface0) -> {
                        L.p(this, "this$0");
                        this.M();
                    });
                }
            }
        }
    }

    private final void I(G g0) {
        String s = g0.i();
        int v = g0.j();
        String s1 = g0.h();
        if(s1 == null) {
            return;
        }
        S0 s00 = (S0)this.d.a();
        if(s00 != null) {
            FragmentActivity fragmentActivity0 = s00.getActivity();
            if(fragmentActivity0 != null) {
                if(!c.n(fragmentActivity0)) {
                    fragmentActivity0 = null;
                }
                if(fragmentActivity0 != null) {
                    int v1 = s == null ? 0 : v.s3(s, "]", 0, false, 6, null);
                    int v2 = ContextCompat.getColor(fragmentActivity0, 0x7F0600A6);  // color:caution_hate_word
                    SpannableString spannableString0 = new SpannableString(s);
                    spannableString0.setSpan(new ForegroundColorSpan(v2), 0, v1 + 1, 33);
                    new Builder(fragmentActivity0).b(false).l(spannableString0).setPositiveButton(0x7F15034A, (DialogInterface dialogInterface0, int v1) -> {
                        L.p(this, "this$0");
                        L.p(s1, "$gallId");
                        this.x(v, s1);
                    }).v((DialogInterface dialogInterface0) -> {
                        L.p(this, "this$0");
                        this.M();
                    }).I();
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void J(r r0, DialogInterface dialogInterface0) [...]

    // 检测为 Lambda 实现
    private static final void K(r r0, int v, String s, DialogInterface dialogInterface0, int v1) [...]

    // 检测为 Lambda 实现
    private static final void L(r r0, DialogInterface dialogInterface0) [...]

    private final void M() {
        a r$a0 = (a)u.N0(this.e);
        if(r$a0 == null) {
            return;
        }
        if(r$a0.b() != null) {
            this.I(r$a0.b());
            return;
        }
        if(r$a0.a() != null) {
            this.H(r$a0.a());
        }
    }

    @l
    public final com.dcinside.app.type.m m() {
        return this.h;
    }

    // 去混淆评级： 低(30)
    private final void n() {
        this.A(this.b && this.j && this.k && this.i && this.l && !this.m);
    }

    private final void o() {
        static final class b extends N implements Function1 {
            final r e;

            b(r r0) {
                this.e = r0;
                super(1);
            }

            public final rx.g b(Long long0) {
                static final class com.dcinside.app.post.manager.r.b.a extends N implements Function1 {
                    public static final com.dcinside.app.post.manager.r.b.a e;

                    static {
                        com.dcinside.app.post.manager.r.b.a.e = new com.dcinside.app.post.manager.r.b.a();
                    }

                    com.dcinside.app.post.manager.r.b.a() {
                        super(1);
                    }

                    public final H a(Throwable throwable0) {
                        return new H(null, null, 3, null);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((Throwable)object0));
                    }
                }

                return uk.RF(this.e.c).a4((Object object0) -> {
                    L.p(com.dcinside.app.post.manager.r.b.a.e, "$tmp0");
                    return (H)com.dcinside.app.post.manager.r.b.a.e.invoke(object0);
                });
            }

            // 检测为 Lambda 实现
            private static final H c(Function1 function10, Object object0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Long)object0));
            }
        }


        @s0({"SMAP\nPostListManagerNotifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListManagerNotifier.kt\ncom/dcinside/app/post/manager/PostListManagerNotifier$invalidatePolling$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n774#2:206\n865#2,2:207\n1557#2:209\n1628#2,3:210\n774#2:213\n865#2,2:214\n1557#2:216\n1628#2,3:217\n1010#2,2:220\n*S KotlinDebug\n*F\n+ 1 PostListManagerNotifier.kt\ncom/dcinside/app/post/manager/PostListManagerNotifier$invalidatePolling$2\n*L\n116#1:206\n116#1:207,2\n116#1:209\n116#1:210,3\n117#1:213\n117#1:214,2\n117#1:216\n117#1:217,3\n118#1:220,2\n*E\n"})
        static final class com.dcinside.app.post.manager.r.c extends N implements Function1 {
            final r e;

            com.dcinside.app.post.manager.r.c(r r0) {
                this.e = r0;
                super(1);
            }

            public final void a(H h0) {
                @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PostListManagerNotifier.kt\ncom/dcinside/app/post/manager/PostListManagerNotifier$invalidatePolling$2\n*L\n1#1,102:1\n118#2:103\n*E\n"})
                public static final class com.dcinside.app.post.manager.r.c.a implements Comparator {
                    @Override
                    public final int compare(Object object0, Object object1) {
                        return kotlin.comparisons.a.l(((a)object0).c(), ((a)object1).c());
                    }
                }

                Collection collection1;
                Collection collection0;
                q.o.i(this.e.c);
                ArrayList arrayList0 = new ArrayList();
                List list0 = h0.e();
                if(list0 == null) {
                    collection0 = u.H();
                }
                else {
                    r r0 = this.e;
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object0: list0) {
                        if(L.g(((F)object0).j(), r0.c)) {
                            arrayList1.add(object0);
                        }
                    }
                    collection0 = new ArrayList(u.b0(arrayList1, 10));
                    for(Object object1: arrayList1) {
                        collection0.add(new a(((F)object1)));
                    }
                }
                arrayList0.addAll(collection0);
                List list1 = h0.f();
                if(list1 == null) {
                    collection1 = u.H();
                }
                else {
                    r r1 = this.e;
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object2: list1) {
                        if(L.g(((G)object2).h(), r1.c)) {
                            arrayList2.add(object2);
                        }
                    }
                    collection1 = new ArrayList(u.b0(arrayList2, 10));
                    for(Object object3: arrayList2) {
                        collection1.add(new a(((G)object3)));
                    }
                }
                arrayList0.addAll(collection1);
                if(arrayList0.size() > 1) {
                    u.p0(arrayList0, new com.dcinside.app.post.manager.r.c.a());
                }
                this.e.e = arrayList0;
                this.e.M();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((H)object0));
                return kotlin.S0.a;
            }
        }

        q q0;
        if(this.n) {
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                q0 = q.o.b(f00, this.c);
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(f00, throwable0);
                throw throwable0;
            }
            kotlin.io.c.a(f00, null);
            long v = q0 == null ? 0L : q0.W5();
            long v1 = TimeUnit.MINUTES.toMillis(this.a);
            long v2 = Math.max(v1 - (System.currentTimeMillis() - v), 2000L);
            o o0 = this.f;
            if(o0 != null) {
                o0.l();
            }
            this.f = rx.g.K2(v2, v1, TimeUnit.MILLISECONDS).f2((Object object0) -> {
                L.p(new b(this), "$tmp0");
                return (rx.g)new b(this).invoke(object0);
            }).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
                L.p(new com.dcinside.app.post.manager.r.c(this), "$tmp0");
                new com.dcinside.app.post.manager.r.c(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                S0 s00 = (S0)this.d.a();
                if(s00 != null) {
                    Context context0 = s00.getContext();
                    if(context0 != null) {
                        Dl.G(context0, "서버에 연결할 수 없습니다. (%1$s)");
                    }
                }
            });
            return;
        }
        o o1 = this.f;
        if(o1 != null) {
            o1.l();
        }
    }

    // 检测为 Lambda 实现
    private static final rx.g p(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void q(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void r(r r0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.base.i
    public void release() {
        o o0 = this.f;
        if(o0 != null) {
            o0.l();
        }
        o o1 = this.g;
        if(o1 != null) {
            o1.l();
        }
    }

    public final boolean s() {
        return this.i;
    }

    public final boolean t() {
        return this.m;
    }

    public final boolean u() {
        return this.l;
    }

    public final boolean v() {
        return this.j;
    }

    public final boolean w() {
        return this.k;
    }

    private final void x(int v, String s) {
        static final class d extends N implements Function1 {
            final r e;

            d(r r0) {
                this.e = r0;
                super(1);
            }

            public final void a(f0 f00) {
                S0 s00 = (S0)this.e.d.a();
                if(s00 == null) {
                    return;
                }
                s00.z4(false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return kotlin.S0.a;
            }
        }

        this.g = uk.Tj(s, v).y5((Object object0) -> {
            L.p(new d(this), "$tmp0");
            new d(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            timber.log.b.a.y(throwable0.getCause());
            S0 s00 = (S0)this.d.a();
            Dl.D((s00 == null ? null : s00.getContext()), 0x7F150613);  // string:manager_notify_cannot_update "매니저 정보를 갱신할 수 없습니다."
        });
    }

    // 检测为 Lambda 实现
    private static final void y(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void z(r r0, Throwable throwable0) [...]
}

