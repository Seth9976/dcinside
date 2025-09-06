package com.dcinside.app.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.u0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class ShareVoiceView extends ConstraintLayout {
    @l
    private String a;
    private boolean b;

    @j
    public ShareVoiceView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public ShareVoiceView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ShareVoiceView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = "";
        View.inflate(context0, 0x7F0E0280, this);  // layout:view_share_voice
        this.findViewById(0x7F0B0EF5).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.F();
        });
        this.findViewById(0x7F0B0EF6).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.G();
        });
    }

    public ShareVoiceView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    // 检测为 Lambda 实现
    private static final void C(ShareVoiceView shareVoiceView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void D(ShareVoiceView shareVoiceView0, View view0) [...]

    public final boolean E() {
        return this.b;
    }

    private final void F() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new u0(this.a, this.b, 1));
    }

    private final void G() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new u0(this.a, this.b, 0));
    }

    @l
    public final String getVr() {
        return this.a;
    }

    public final void setPost(boolean z) {
        this.b = z;
    }

    public final void setVr(@l String s) {
        L.p(s, "<set-?>");
        this.a = s;
    }
}

