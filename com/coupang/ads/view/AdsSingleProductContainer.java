package com.coupang.ads.view;

import J.h;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.coupang.ads.custom.AdsProductGroup;
import com.coupang.ads.custom.AdsSingleProductGroup;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdsSingleProductContainer extends FrameLayout implements h {
    @l
    private final D a;

    @j
    public AdsSingleProductContainer(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdsSingleProductContainer(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdsSingleProductContainer(@l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class a extends N implements A3.a {
            final AdsSingleProductContainer e;

            a(AdsSingleProductContainer adsSingleProductContainer0) {
                this.e = adsSingleProductContainer0;
                super(0);
            }

            @l
            public final AdsSingleProductGroup b() {
                return new AdsSingleProductGroup(new b(this.e).b());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = E.a(new a(this));
    }

    public AdsSingleProductContainer(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public void a() {
    }

    @l
    public final AdsSingleProductGroup getAdsSingleProductGroup() {
        return (AdsSingleProductGroup)this.a.getValue();
    }

    @Override  // J.h
    @l
    public AdsProductGroup getProductsGroup() {
        return this.getAdsSingleProductGroup();
    }
}

