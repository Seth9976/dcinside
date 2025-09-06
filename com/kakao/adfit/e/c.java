package com.kakao.adfit.e;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import com.kakao.adfit.a.d.d;
import com.kakao.adfit.a.h;
import com.kakao.adfit.common.inappbrowser.activity.IABActivity;
import com.kakao.adfit.m.B;
import com.kakao.adfit.m.f;
import com.kakao.adfit.m.z;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.v;

public final class c extends k implements View.OnClickListener, View.OnTouchListener {
    private final View b;
    private final View c;
    private final String d;
    private final com.kakao.adfit.a.c e;
    private final List f;
    private final a g;
    private final Function1 h;
    private final Function1 i;
    private d j;
    private d k;

    public c(View view0, View view1, String s, com.kakao.adfit.a.c c0, List list0, a a0, Function1 function10, Function1 function11) {
        L.p(view0, "view");
        L.p(view1, "containerView");
        L.p(s, "url");
        L.p(c0, "event");
        L.p(list0, "clickTrackers");
        L.p(a0, "clickCondition");
        L.p(function10, "handleOpenLandingPage");
        L.p(function11, "notifyOnClick");
        super();
        this.b = view0;
        this.c = view1;
        this.d = s;
        this.e = c0;
        this.f = list0;
        this.g = a0;
        this.h = function10;
        this.i = function11;
        view0.setClickable(true);
        view0.setOnClickListener(this);
        view0.setOnTouchListener(this);
        view0.setAccessibilityDelegate(com.kakao.adfit.m.a.a.b());
    }

    private final String a(String s, View view0) {
        if(v.W2(s, "analytics.ad.daum.net", false, 2, null)) {
            try {
                String s1 = Uri.parse(s).buildUpon().appendQueryParameter("b", (view0.isShown() ? "F" : "B")).appendQueryParameter("r", (z.c(view0.getContext()) ? "R" : "N")).build().toString();
                L.o(s1, "parse(url)\n             …              .toString()");
                return s1;
            }
            catch(Exception exception0) {
            }
            f.b(("Failed to append query parameters. [error = " + exception0 + ']'));
        }
        return s;
    }

    private final void a(Context context0, com.kakao.adfit.a.d.c d$c0) {
        h.c.a(context0).a(this.f, d$c0, null);
    }

    private final void a(Context context0, String s) {
        if(B.a.a(context0, s)) {
            return;
        }
        if(((Boolean)this.h.invoke(s)).booleanValue()) {
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
        static final class com.kakao.adfit.e.c.a extends N implements A3.a {
            final c a;

            com.kakao.adfit.e.c.a(c c0) {
                this.a = c0;
                super(0);
            }

            public final com.kakao.adfit.a.d a() {
                View view0 = this.a.c;
                com.kakao.adfit.a.c c0 = this.a.e;
                View view1 = this.a.c;
                View view2 = this.a.b;
                d d$d0 = this.a.j;
                d d$d1 = this.a.k;
                com.kakao.adfit.a.d.a d$a0 = com.kakao.adfit.a.d.a.h.a(view1, view2, d$d0, d$d1);
                return com.kakao.adfit.a.d.b.a(view0, c0, d$a0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.a();
            }
        }

        L.p(view0, "v");
        if(this.f()) {
            a a0 = this.g;
            long v = SystemClock.elapsedRealtime();
            long v1 = v - a0.a();
            if(v1 > 500L || v1 < 0L) {
                a0.a(v);
                Context context0 = view0.getContext();
                String s = this.a(this.d, view0);
                L.o(context0, "context");
                this.a(context0, s);
                com.kakao.adfit.a.d.c d$c0 = new com.kakao.adfit.a.d.c(new com.kakao.adfit.e.c.a(this));
                if(this.f.isEmpty()) {
                    this.e.a().a(d$c0);
                }
                else {
                    this.e.a().a(null);
                    this.a(context0, d$c0);
                }
                this.i.invoke(view0);
            }
        }
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        L.p(view0, "v");
        L.p(motionEvent0, "event");
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.j = new d(motionEvent0.getX(), motionEvent0.getY(), 0L, 4, null);
                this.k = null;
                return false;
            }
            case 1: {
                this.k = new d(motionEvent0.getX(), motionEvent0.getY(), 0L, 4, null);
                return false;
            }
            case 3: {
                this.j = null;
                this.k = null;
                return false;
            }
            default: {
                return false;
            }
        }
    }
}

