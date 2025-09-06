package com.dcinside.app.auth;

import A3.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Clipboards;
import com.dcinside.app.util.otp.e;
import com.dcinside.app.view.CountdownIndicator;
import com.google.android.material.snackbar.Snackbar;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nOtpCodeViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtpCodeViewHolder.kt\ncom/dcinside/app/auth/OtpCodeViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,75:1\n257#2,2:76\n*S KotlinDebug\n*F\n+ 1 OtpCodeViewHolder.kt\ncom/dcinside/app/auth/OtpCodeViewHolder\n*L\n47#1:76,2\n*E\n"})
public final class x extends ViewHolder {
    public static final class c {
        private c() {
        }

        public c(w w0) {
        }

        @l
        public final x a(@l ViewGroup viewGroup0, @l Function1 function10) {
            L.p(viewGroup0, "parent");
            L.p(function10, "callback");
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0178, viewGroup0, false);  // layout:otp_code_item
            L.m(view0);
            return new x(view0, function10);
        }
    }

    private final TextView a;
    private final TextView b;
    private final TextView c;
    private final CountdownIndicator d;
    @l
    public static final c e;

    static {
        x.e = new c(null);
    }

    public x(@l View view0, @l Function1 function10) {
        @f(c = "com.dcinside.app.auth.OtpCodeViewHolder$1", f = "OtpCodeViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final x l;
            final View m;

            a(x x0, View view0, d d0) {
                this.l = x0;
                this.m = view0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, this.m, d0).invokeSuspend(S0.a);
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
                String s = v.l2(this.l.c.getText().toString(), " ", "", false, 4, null);
                Clipboards.a.b(0, s, s);
                Snackbar.D0(this.m, 0x7F15073C, -1).m0();  // string:otp_code_pin_copied "복사되었습니다."
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.auth.OtpCodeViewHolder$2", f = "OtpCodeViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nOtpCodeViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtpCodeViewHolder.kt\ncom/dcinside/app/auth/OtpCodeViewHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
        static final class b extends o implements p {
            int k;
            final x l;
            final Function1 m;

            b(x x0, Function1 function10, d d0) {
                this.l = x0;
                this.m = function10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, this.m, d0).invokeSuspend(S0.a);
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
                Integer integer0 = kotlin.coroutines.jvm.internal.b.f(this.l.getAdapterPosition());
                if(integer0.intValue() <= -1) {
                    integer0 = null;
                }
                if(integer0 != null) {
                    this.m.invoke(integer0);
                }
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        L.p(function10, "deletable");
        super(view0);
        this.a = (TextView)view0.findViewById(0x7F0B0694);  // id:item_code_name
        this.b = (TextView)view0.findViewById(0x7F0B0693);  // id:item_code_issuer
        this.c = (TextView)view0.findViewById(0x7F0B0695);  // id:item_code_pin
        this.d = (CountdownIndicator)view0.findViewById(0x7F0B0692);  // id:item_code_indicator
        r.M(view0, null, new a(this, view0, null), 1, null);
        r.S(view0, null, false, new b(this, function10, null), 3, null);
    }

    public final void f(@m com.dcinside.app.util.otp.b.d b$d0, @l e e0) {
        String s3;
        L.p(e0, "provider");
        Context context0 = this.itemView.getContext();
        String s = null;
        this.a.setText((b$d0 == null ? null : b$d0.getName()));
        this.b.setText(context0.getString(0x7F150737, new Object[]{(b$d0 == null ? null : b$d0.a())}));  // string:otp_code_issuer "(%1$s)"
        L.o(this.b, "otpCodeIssuer");
        String s1 = b$d0 == null ? null : b$d0.a();
        this.b.setVisibility((s1 == null || s1.length() == 0 ? 8 : 0));
        String s2 = e0.d(b$d0);
        try {
            if(s2 == null) {
                s3 = null;
            }
            else {
                s3 = s2.substring(0, 3);
                L.o(s3, "substring(...)");
            }
            if(s2 != null) {
                s = s2.substring(3, 6);
                L.o(s, "substring(...)");
            }
            s2 = context0.getString(0x7F15073B, new Object[]{s3, s});  // string:otp_code_pin "%1$s %2$s"
        }
        catch(Exception unused_ex) {
        }
        this.c.setText(s2);
    }

    public final void h(long v, long v1) {
        this.d.setPhase(((double)v) / ((double)(v1 * 1000L)));
    }
}

