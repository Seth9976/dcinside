package com.dcinside.app.main;

import A3.p;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.base.i;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.t;
import com.dcinside.app.util.ll;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nGrantViewHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrantViewHelper.kt\ncom/dcinside/app/main/GrantViewHelper\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,66:1\n38#2:67\n257#3,2:68\n257#3,2:70\n*S KotlinDebug\n*F\n+ 1 GrantViewHelper.kt\ncom/dcinside/app/main/GrantViewHelper\n*L\n25#1:67\n28#1:68,2\n29#1:70,2\n*E\n"})
public final class b implements i {
    public static final class com.dcinside.app.main.b.b {
        private com.dcinside.app.main.b.b() {
        }

        public com.dcinside.app.main.b.b(w w0) {
        }

        @m
        @n
        public final b a(@l AppCompatActivity appCompatActivity0) {
            L.p(appCompatActivity0, "activity");
            if(ll.z()) {
                ll.y(false);
                return new b(appCompatActivity0);
            }
            return null;
        }
    }

    @l
    private final AppCompatActivity a;
    @m
    private View b;
    @m
    private AlertDialog c;
    @l
    public static final com.dcinside.app.main.b.b d;

    static {
        b.d = new com.dcinside.app.main.b.b(null);
    }

    public b(@l AppCompatActivity appCompatActivity0) {
        @f(c = "com.dcinside.app.main.GrantViewHelper$1", f = "GrantViewHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final b l;

            a(b b0, d d0) {
                this.l = b0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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

        L.p(appCompatActivity0, "activity");
        super();
        this.a = appCompatActivity0;
        LayoutInflater layoutInflater0 = LayoutInflater.from(appCompatActivity0);
        ViewGroup viewGroup0 = (ViewGroup)appCompatActivity0.findViewById(0x1020002);
        View view0 = viewGroup0 == null ? null : viewGroup0.getChildAt(0);
        View view1 = layoutInflater0.inflate(0x7F0E01DC, (view0 instanceof ViewGroup ? ((ViewGroup)view0) : null), false);  // layout:view_grant
        this.b = view1.findViewById(0x7F0B0547);  // id:grant_confirm
        View view2 = view1.findViewById(0x7F0B054C);  // id:grant_p_noti_title
        int v = 8;
        if(view2 != null) {
            view2.setVisibility((Build.VERSION.SDK_INT < 33 ? 0 : 8));
        }
        View view3 = view1.findViewById(0x7F0B054B);  // id:grant_p_noti_desc
        if(view3 != null) {
            if(Build.VERSION.SDK_INT >= 33) {
                v = 0;
            }
            view3.setVisibility(v);
        }
        View view4 = this.b;
        if(view4 != null) {
            r.M(view4, null, new a(this, null), 1, null);
        }
        this.c = new Builder(appCompatActivity0).setView(view1).b(false).I();
    }

    @m
    @n
    public static final b b(@l AppCompatActivity appCompatActivity0) {
        return b.d.a(appCompatActivity0);
    }

    @l
    public final AppCompatActivity c() {
        return this.a;
    }

    public final boolean d() {
        AlertDialog alertDialog0 = this.c;
        if(alertDialog0 == null && this.b == null) {
            return false;
        }
        if(alertDialog0 != null) {
            alertDialog0.dismiss();
        }
        this.c = null;
        View view0 = this.b;
        if(view0 != null) {
            view0.setOnClickListener(null);
        }
        this.b = null;
        return true;
    }

    private final void e() {
        this.d();
        t t0 = new t();
        c.a(this.a, t0);
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        this.d();
    }
}

