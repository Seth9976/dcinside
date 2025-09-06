package com.dcinside.app.span;

import A3.a;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class c extends ClickableSpan {
    @m
    private final Integer a;
    private final boolean b;
    @l
    private final a c;

    public c(@m Integer integer0, boolean z, @l a a0) {
        L.p(a0, "onClick");
        super();
        this.a = integer0;
        this.b = z;
        this.c = a0;
    }

    public c(Integer integer0, boolean z, a a0, int v, w w0) {
        if((v & 1) != 0) {
            integer0 = null;
        }
        if((v & 2) != 0) {
            z = false;
        }
        this(integer0, z, a0);
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(@l View view0) {
        L.p(view0, "widget");
        this.c.invoke();
    }

    @Override  // android.text.style.ClickableSpan
    public void updateDrawState(@l TextPaint textPaint0) {
        L.p(textPaint0, "ds");
        Integer integer0 = this.a;
        if(integer0 != null) {
            textPaint0.setColor(((int)integer0));
        }
        textPaint0.setUnderlineText(this.b);
    }
}

