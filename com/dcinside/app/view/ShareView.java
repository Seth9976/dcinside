package com.dcinside.app.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.k0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class ShareView extends ConstraintLayout {
    @j
    public ShareView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public ShareView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ShareView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        View.inflate(context0, 0x7F0E027F, this);  // layout:view_share
        this.findViewById(0x7F0B0EED).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.R();
        });
        this.findViewById(0x7F0B0EF0).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.U();
        });
        this.findViewById(0x7F0B0EEF).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.T();
        });
        this.findViewById(0x7F0B0EF3).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.W();
        });
        this.findViewById(0x7F0B0EEC).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.Q();
        });
        this.findViewById(0x7F0B0EEE).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.S();
        });
        this.findViewById(0x7F0B0EF1).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.V();
        });
        this.findViewById(0x7F0B0EF4).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.X();
        });
    }

    public ShareView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    // 检测为 Lambda 实现
    private static final void I(ShareView shareView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void J(ShareView shareView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void K(ShareView shareView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void L(ShareView shareView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void M(ShareView shareView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void N(ShareView shareView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void O(ShareView shareView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void P(ShareView shareView0, View view0) [...]

    private final void Q() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new k0("com.nhn.android.band"));
    }

    private final void R() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new k0("com.facebook.katana"));
    }

    private final void S() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new k0("com.kakao.story"));
    }

    private final void T() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new k0("com.kakao.talk"));
    }

    private final void U() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new k0("jp.naver.line.android"));
    }

    private final void V() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new k0("other"));
    }

    private final void W() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new k0("com.twitter.android"));
    }

    private final void X() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new k0("copy_url"));
    }
}

