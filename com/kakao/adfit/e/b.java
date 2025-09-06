package com.kakao.adfit.e;

import android.content.Context;
import android.os.SystemClock;
import android.view.View.OnClickListener;
import android.view.View;
import com.kakao.adfit.ads.R.string;
import com.kakao.adfit.common.inappbrowser.activity.IABActivity;
import com.kakao.adfit.m.B;
import com.kakao.adfit.m.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;

public final class b extends k implements View.OnClickListener {
    private final View b;
    private final String c;
    private final a d;
    private final Function1 e;

    public b(View view0, String s, a a0, Function1 function10) {
        L.p(view0, "view");
        L.p(a0, "clickCondition");
        L.p(function10, "handleOpenLandingPage");
        super();
        this.b = view0;
        this.c = s;
        this.d = a0;
        this.e = function10;
        view0.setContentDescription(view0.getResources().getString(string.adfit_ad_info_description));
        view0.setClickable(true);
        view0.setOnClickListener(this);
        view0.setAccessibilityDelegate(com.kakao.adfit.m.a.a.a());
    }

    private final void a(Context context0, String s) {
        if(B.a.a(context0, s)) {
            return;
        }
        if(((Boolean)this.e.invoke(s)).booleanValue()) {
            return;
        }
        try {
            context0.startActivity(com.kakao.adfit.common.inappbrowser.activity.IABActivity.a.a(IABActivity.e, context0, s, null, 4, null));
        }
        catch(Exception exception0) {
            f.b(("Failed to start IABActivity. [error = " + exception0 + ']'));
        }
    }

    @Override  // com.kakao.adfit.e.k
    protected void g() {
        this.b.setOnClickListener(null);
        this.b.setAccessibilityDelegate(null);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        L.p(view0, "v");
        if(this.f() && this.c != null) {
            a a0 = this.d;
            long v = SystemClock.elapsedRealtime();
            long v1 = v - a0.a();
            if(v1 > 500L || v1 < 0L) {
                a0.a(v);
                Context context0 = view0.getContext();
                L.o(context0, "v.context");
                this.a(context0, this.c);
            }
        }
    }
}

