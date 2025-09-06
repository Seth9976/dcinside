package com.dcinside.app.span;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.util.Al;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class e extends ClickableSpan {
    public static enum a {
        DC,
        INTERNAL_BROWSER,
        EXTERNAL_BROWSER;

        private static final a[] d;
        private static final kotlin.enums.a e;

        static {
            a.d = arr_e$a;
            L.p(arr_e$a, "entries");
            a.e = new d(arr_e$a);
        }

        private static final a[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return a.e;
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[a.values().length];
            try {
                arr_v[a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[a.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    private final int a;
    private final boolean b;
    @l
    private final String c;
    @l
    private final a d;

    public e(int v, boolean z, @l String s, @l a e$a0) {
        L.p(s, "url");
        L.p(e$a0, "type");
        super();
        this.a = v;
        this.b = z;
        this.c = s;
        this.d = e$a0;
    }

    public e(int v, boolean z, String s, a e$a0, int v1, w w0) {
        if((v1 & 8) != 0) {
            e$a0 = a.a;
        }
        this(v, z, s, e$a0);
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(@l View view0) {
        L.p(view0, "widget");
        Context context0 = Al.h(view0.getContext());
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        switch(this.d) {
            case 1: {
                com.dcinside.app.main.a.b(appCompatActivity0, this.c);
                return;
            }
            case 2: {
                com.dcinside.app.main.a.j(appCompatActivity0, this.c);
                return;
            }
            case 3: {
                com.dcinside.app.main.a.i(appCompatActivity0, this.c);
            }
        }
    }

    @Override  // android.text.style.ClickableSpan
    public void updateDrawState(@l TextPaint textPaint0) {
        L.p(textPaint0, "ds");
        textPaint0.setColor(this.a);
        textPaint0.setUnderlineText(this.b);
    }
}

