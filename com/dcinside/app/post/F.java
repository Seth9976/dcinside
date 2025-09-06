package com.dcinside.app.post;

import A3.p;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.base.i;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.ll;
import io.realm.F0;
import io.realm.RealmQuery;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nCheers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cheers.kt\ncom/dcinside/app/post/Cheers\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n+ 5 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,88:1\n120#2,3:89\n124#2:94\n1#3:92\n37#4:93\n38#5:95\n*S KotlinDebug\n*F\n+ 1 Cheers.kt\ncom/dcinside/app/post/Cheers\n*L\n28#1:89,3\n28#1:94\n28#1:92\n28#1:93\n31#1:95\n*E\n"})
public final class f implements i {
    @s0({"SMAP\nCheers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cheers.kt\ncom/dcinside/app/post/Cheers$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final f a(@l AppCompatActivity appCompatActivity0) {
            L.p(appCompatActivity0, "activity");
            f f0 = new f();
            f0.h(appCompatActivity0);
            return f0;
        }
    }

    @m
    private Dialog a;
    @l
    public static final a b;

    static {
        f.b = new a(null);
    }

    private final void e() {
        Dialog dialog0 = this.a;
        if(dialog0 == null) {
            return;
        }
        dialog0.dismiss();
        ll.f(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(90L));
    }

    private final void f(View view0) {
        Context context0 = view0 == null ? null : view0.getContext();
        if(context0 == null) {
            return;
        }
        Dialog dialog0 = this.a;
        if(dialog0 == null) {
            return;
        }
        dialog0.dismiss();
        ll.f(0x7FFFFFFFFFFFFFFFL);
        L.o("이메일 앱 선택", "getString(...)");
        Intent intent0 = new Intent("android.intent.action.SEND");
        intent0.setType("message/rfc822");
        L.o("dcinside.app@gmail.com", "getString(...)");
        intent0.putExtra("android.intent.extra.EMAIL", new String[]{"dcinside.app@gmail.com"});
        intent0.putExtra("android.intent.extra.SUBJECT", "디시 공식 앱 개선 의견");
        context0.startActivity(Intent.createChooser(intent0, "이메일 앱 선택"));
    }

    private final void g() {
        Dialog dialog0 = this.a;
        if(dialog0 == null) {
            return;
        }
        dialog0.dismiss();
        ll.f(0x7FFFFFFFFFFFFFFFL);
        Dl.q();
    }

    private final void h(AppCompatActivity appCompatActivity0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.Cheers$show$1", f = "Cheers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final f l;

            b(f f0, d d0) {
                this.l = f0;
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
                this.l.g();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.Cheers$show$2", f = "Cheers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            Object l;
            final f m;

            c(f f0, d d0) {
                this.m = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                c f$c0 = new c(this.m, d0);
                f$c0.l = view0;
                return f$c0.invokeSuspend(S0.a);
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
                this.m.f(((View)this.l));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.Cheers$show$3", f = "Cheers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.f.d extends o implements p {
            int k;
            final f l;

            com.dcinside.app.post.f.d(f f0, d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.post.f.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.e();
                return S0.a;
            }
        }

        try {
            if(ll.e() > System.currentTimeMillis()) {
                return;
            }
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                RealmQuery realmQuery0 = f00.C4(com.dcinside.app.realm.f0.class);
                L.o(realmQuery0, "this.where(T::class.java)");
                long v = realmQuery0.F1(10L).N();
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(f00, throwable0);
                throw throwable0;
            }
            kotlin.io.c.a(f00, null);
            if(v < 10L) {
                return;
            }
            LayoutInflater layoutInflater0 = LayoutInflater.from(appCompatActivity0);
            ViewGroup viewGroup0 = (ViewGroup)appCompatActivity0.findViewById(0x1020002);
            View view0 = viewGroup0 == null ? null : viewGroup0.getChildAt(0);
            L.n(view0, "null cannot be cast to non-null type android.view.ViewGroup");
            View view1 = layoutInflater0.inflate(0x7F0E01AC, ((ViewGroup)view0), false);  // layout:view_cheer
            AlertDialog alertDialog0 = new Builder(appCompatActivity0).setView(view1).create();
            L.o(alertDialog0, "create(...)");
            View view2 = view1.findViewById(0x7F0B02B6);  // id:cheer_positive
            if(view2 != null) {
                r.M(view2, null, new b(this, null), 1, null);
            }
            View view3 = view1.findViewById(0x7F0B02B5);  // id:cheer_neutral
            if(view3 != null) {
                r.M(view3, null, new c(this, null), 1, null);
            }
            View view4 = view1.findViewById(0x7F0B02B4);  // id:cheer_negative
            if(view4 != null) {
                r.M(view4, null, new com.dcinside.app.post.f.d(this, null), 1, null);
            }
            alertDialog0.show();
            this.a = alertDialog0;
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        Dialog dialog0 = this.a;
        if(dialog0 != null) {
            dialog0.dismiss();
        }
        this.a = null;
    }
}

