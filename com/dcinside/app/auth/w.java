package com.dcinside.app.auth;

import A3.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.c;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class w extends ViewHolder {
    public static final class b {
        private b() {
        }

        public b(kotlin.jvm.internal.w w0) {
        }

        @l
        public final w a(@l ViewGroup viewGroup0, @l Function1 function10) {
            L.p(viewGroup0, "parent");
            L.p(function10, "callback");
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0177, viewGroup0, false);  // layout:otp_code_empty
            L.m(view0);
            return new w(view0, function10);
        }
    }

    private final TextView a;
    @l
    public static final b b;

    static {
        w.b = new b(null);
    }

    public w(@l View view0, @l Function1 function10) {
        @f(c = "com.dcinside.app.auth.OtpCodeEmptyViewHolder$1", f = "OtpCodeEmptyViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            Object l;
            final Function1 m;

            a(Function1 function10, d d0) {
                this.m = function10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                a w$a0 = new a(this.m, d0);
                w$a0.l = view0;
                return w$a0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                k.a.a();
                Object object1 = view0.getTag();
                L.n(object1, "null cannot be cast to non-null type kotlin.String");
                this.m.invoke(((String)object1));
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        L.p(function10, "callback");
        super(view0);
        TextView textView0 = (TextView)view0.findViewById(0x7F0B044D);  // id:empty_desc
        this.a = textView0;
        Context context0 = view0.getContext();
        L.m(context0);
        textView0.setText(Dl.c(context0.getString(0x7F15073D, new Object[]{c.i(vk.b(context0, 0x7F0401F8))})));  // string:otp_code_prevent_account "<font color=#BDBDBD>OTP 설정으로 계정을 안전하게 보호할 수 있습니다.<br>2단계 
                                                                                                                 // 인증하러 가기</font> <font color=%s><u>보안 센터 ></u></font>"
        L.o(textView0, "emptyDesc");
        r.M(textView0, null, new a(function10, null), 1, null);
    }
}

