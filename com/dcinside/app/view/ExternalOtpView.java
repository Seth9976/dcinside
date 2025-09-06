package com.dcinside.app.view;

import A3.p;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dcinside.app.internal.r;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;
import z3.j;

public final class ExternalOtpView extends ConstraintLayout {
    @l
    private final ImageView a;
    @l
    private final TextView b;
    private final PackageManager c;

    @j
    public ExternalOtpView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public ExternalOtpView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ExternalOtpView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.c = context0.getPackageManager();
        View.inflate(context0, 0x7F0E01D1, this);  // layout:view_external_otp
        View view0 = this.findViewById(0x7F0B0492);  // id:external_otp_icon
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
        View view1 = this.findViewById(0x7F0B0494);  // id:external_otp_name
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
    }

    public ExternalOtpView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void A(@l String s, @l Function1 function10) {
        @f(c = "com.dcinside.app.view.ExternalOtpView$bind$1", f = "ExternalOtpView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final Function1 l;
            final String m;

            a(Function1 function10, String s, d d0) {
                this.l = function10;
                this.m = s;
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
                this.l.invoke(this.m);
                return S0.a;
            }
        }

        L.p(s, "pkg");
        L.p(function10, "clickable");
        ApplicationInfo applicationInfo0 = this.c.getApplicationInfo(s, 0);
        L.o(applicationInfo0, "getApplicationInfo(...)");
        Drawable drawable0 = applicationInfo0.loadIcon(this.c);
        this.a.setImageDrawable(drawable0);
        CharSequence charSequence0 = applicationInfo0.loadLabel(this.c);
        this.b.setText(charSequence0);
        r.M(this, null, new a(function10, s, null), 1, null);
    }
}

