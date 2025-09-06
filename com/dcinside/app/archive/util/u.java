package com.dcinside.app.archive.util;

import A3.p;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.realm.A0;
import com.dcinside.app.realm.c;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.k;
import com.dcinside.app.view.q0;
import com.dcinside.app.wv.y;
import io.realm.F0;
import io.realm.RealmQuery;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import org.jsoup.nodes.f;
import rx.g;
import rx.n;
import y4.l;
import y4.m;

@s0({"SMAP\nArchiveUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveUtil.kt\ncom/dcinside/app/archive/util/ArchiveUtilKt\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,229:1\n120#2,3:230\n124#2:234\n1#3:233\n147#4:235\n*S KotlinDebug\n*F\n+ 1 ArchiveUtil.kt\ncom/dcinside/app/archive/util/ArchiveUtilKt\n*L\n93#1:230,3\n93#1:234\n93#1:233\n141#1:235\n*E\n"})
public final class u {
    // 检测为 Lambda 实现
    private static final void A(k k0, AlertDialog alertDialog0) [...]

    // 检测为 Lambda 实现
    private static final boolean B(AlertDialog alertDialog0, TextView textView0, int v, KeyEvent keyEvent0) [...]

    @l
    public static final g C(@l Context context0, @l q0 q00) {
        L.p(context0, "context");
        L.p(q00, "v");
        AlertDialog alertDialog0 = new Builder(context0).setPositiveButton(0x104000A, (DialogInterface dialogInterface0, int v) -> dialogInterface0.dismiss()).setNegativeButton(0x1040000, (DialogInterface dialogInterface0, int v) -> dialogInterface0.cancel()).setView(q00).I();
        g g0 = g.M6((n n0) -> {
            L.p(q00, "$v");
            alertDialog0.setOnDismissListener((DialogInterface dialogInterface0) -> {
                L.p(q00, "$v");
                n0.onNext(q00.getFolderKey());
                n0.d();
            });
            alertDialog0.setOnCancelListener((DialogInterface dialogInterface0) -> n0.d());
        }).T1(() -> alertDialog0.cancel());
        L.o(g0, "doOnUnsubscribe(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final void D(DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    private static final void E(DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    private static final void F(AlertDialog alertDialog0, q0 q00, n n0) [...]

    // 检测为 Lambda 实现
    private static final void G(n n0, q0 q00, DialogInterface dialogInterface0) [...]

    // 检测为 Lambda 实现
    private static final void H(n n0, DialogInterface dialogInterface0) [...]

    // 检测为 Lambda 实现
    private static final void I(AlertDialog alertDialog0) [...]

    @l
    public static final g J(@l Context context0, @l A0 a00) {
        L.p(context0, "ctx");
        L.p(a00, "voiceArchive");
        f f0 = Dl.A(a00.W5());
        L.m(f0);
        String s = y.u(context0, f0, true, false, true, 0, null, true, null, false, false, false, 0xF68, null).i().toString();
        L.o(s, "toString(...)");
        a a0 = new a(context0);
        TextView textView0 = a0.getTitle();
        if(textView0 != null) {
            textView0.setText(a00.U5());
        }
        a0.a(s);
        t t0 = new t(a0);
        v v0 = new v();
        AlertDialog alertDialog0 = new Builder(context0).setPositiveButton(0x7F1500FD, (DialogInterface dialogInterface0, int v1) -> {
            L.p(v0, "$this_apply");
            L.p(s, "$html");
            n n0 = v0.b();
            if(n0 != null) {
                n0.onNext(s);
                n0.d();
            }
        }).setNegativeButton(0x7F1501F2, (DialogInterface dialogInterface0, int v1) -> {
            L.p(v0, "$this_apply");
            n n0 = v0.b();
            if(n0 != null) {
                n0.d();
            }
        }).v((DialogInterface dialogInterface0) -> {
            L.p(v0, "$this_apply");
            n n0 = v0.b();
            if(n0 != null) {
                n0.d();
            }
        }).setView(a0).I();
        L.o(alertDialog0, "show(...)");
        v0.d(alertDialog0);
        g g0 = g.M6((n n0) -> {
            L.p(v0, "$helper");
            L.m(n0);
            v0.e(n0);
        }).T1(() -> {
            L.p(v0, "$helper");
            L.p(t0, "$refView");
            AlertDialog alertDialog0 = v0.a();
            if(alertDialog0 != null) {
                alertDialog0.dismiss();
            }
            v0.c();
            a a0 = (a)t0.a();
            if(a0 != null) {
                com.dcinside.app.wv.f f0 = a0.getLifecycle();
                if(f0 != null) {
                    f0.onDestroy();
                }
            }
        });
        L.o(g0, "doOnUnsubscribe(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final void K(v v0, String s, DialogInterface dialogInterface0, int v1) [...]

    // 检测为 Lambda 实现
    private static final void L(v v0, DialogInterface dialogInterface0, int v1) [...]

    // 检测为 Lambda 实现
    private static final void M(v v0, DialogInterface dialogInterface0) [...]

    // 检测为 Lambda 实现
    private static final void N(v v0, n n0) [...]

    // 检测为 Lambda 实现
    private static final void O(v v0, t t0) [...]

    public static final int s(@m RealmQuery realmQuery0, @m String s) {
        return realmQuery0 == null || s == null ? 0 : ((int)realmQuery0.i0("folder.name", s).N());
    }

    @l
    public static final g t(@l Context context0, int v) {
        L.p(context0, "context");
        return u.u(context0, v, null);
    }

    @l
    public static final g u(@l Context context0, int v, @m Long long0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.archive.util.ArchiveUtilKt$editTextDialog$1", f = "ArchiveUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.util.u.a extends o implements p {
            int k;
            final AlertDialog l;

            com.dcinside.app.archive.util.u.a(AlertDialog alertDialog0, d d0) {
                this.l = alertDialog0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.archive.util.u.a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.dismiss();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.archive.util.ArchiveUtilKt$editTextDialog$2", f = "ArchiveUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final AlertDialog l;

            b(AlertDialog alertDialog0, d d0) {
                this.l = alertDialog0;
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
                this.l.cancel();
                return S0.a;
            }
        }

        String s;
        L.p(context0, "context");
        k k0 = new k(context0);
        if(long0 != null) {
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                c c0 = com.dcinside.app.realm.d.f.b(f00, ((long)long0));
                s = c0 == null ? null : c0.R5();
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(f00, throwable0);
                throw throwable0;
            }
            kotlin.io.c.a(f00, null);
            k0.getText().setText(s);
        }
        k0.setTitle(v);
        AlertDialog alertDialog0 = new Builder(context0, 0x7F1601AA).setView(k0).I();
        TextView textView0 = k0.getPositiveButton();
        L.o(textView0, "getPositiveButton(...)");
        r.M(textView0, null, new com.dcinside.app.archive.util.u.a(alertDialog0, null), 1, null);
        TextView textView1 = k0.getNegativeButton();
        L.o(textView1, "getNegativeButton(...)");
        r.M(textView1, null, new b(alertDialog0, null), 1, null);
        k0.getText().setOnEditorActionListener((TextView textView0, int v, KeyEvent keyEvent0) -> {
            if(v == 6) {
                alertDialog0.dismiss();
                return true;
            }
            return false;
        });
        g g0 = g.M6((n n0) -> {
            L.p(k0, "$view");
            alertDialog0.setOnDismissListener((DialogInterface dialogInterface0) -> {
                L.p(k0, "$view");
                n0.onNext(k0.getString());
                n0.d();
            });
            alertDialog0.setOnCancelListener((DialogInterface dialogInterface0) -> n0.d());
        }).R1(() -> {
            L.p(k0, "$view");
            k0.postDelayed(() -> {
                L.p(k0, "$view");
                Nk.a.f(k0.getText());
            }, 100L);
        }).T1(() -> {
            L.p(k0, "$view");
            ClearableEditText clearableEditText0 = k0.getText();
            Nk.a.c(clearableEditText0);
            alertDialog0.cancel();
        });
        L.o(g0, "doOnUnsubscribe(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final void v(AlertDialog alertDialog0, k k0, n n0) [...]

    // 检测为 Lambda 实现
    private static final void w(k k0, n n0, DialogInterface dialogInterface0) [...]

    // 检测为 Lambda 实现
    private static final void x(n n0, DialogInterface dialogInterface0) [...]

    // 检测为 Lambda 实现
    private static final void y(k k0) [...]

    // 检测为 Lambda 实现
    private static final void z(k k0) [...]
}

