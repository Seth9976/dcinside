package com.dcinside.app.ad.util;

import A3.a;
import com.dcinside.app.wv.f;
import java.util.LinkedList;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nAdSequence.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSequence.kt\ncom/dcinside/app/ad/util/AdSequence\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1863#2,2:58\n*S KotlinDebug\n*F\n+ 1 AdSequence.kt\ncom/dcinside/app/ad/util/AdSequence\n*L\n51#1:58,2\n*E\n"})
public final class c implements f {
    @m
    private final a a;
    @m
    private Function1 b;
    @m
    private com.dcinside.app.ad.util.a c;
    @l
    private final LinkedList d;

    public c(@l List list0, @m a a0) {
        final class com.dcinside.app.ad.util.c.a extends H implements Function1 {
            com.dcinside.app.ad.util.c.a(Object object0) {
                super(1, object0, c.class, "onCurrentLoadFailed", "onCurrentLoadFailed(Ljava/lang/String;)V", 0);
            }

            public final void a(@m String s) {
                ((c)this.receiver).d(s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((String)object0));
                return S0.a;
            }
        }

        L.p(list0, "list");
        super();
        this.a = a0;
        this.b = new com.dcinside.app.ad.util.c.a(this);
        this.d = new LinkedList(list0);
    }

    public c(List list0, a a0, int v, w w0) {
        if((v & 2) != 0) {
            a0 = null;
        }
        this(list0, a0);
    }

    @m
    public final com.dcinside.app.ad.util.a b() {
        return this.c;
    }

    public final void c() {
        if(this.d.isEmpty()) {
            return;
        }
        Function1 function10 = this.b;
        if(function10 == null) {
            return;
        }
        if(this.c == null) {
            com.dcinside.app.ad.util.a a0 = (com.dcinside.app.ad.util.a)this.d.pollFirst();
            this.c = a0;
            if(a0 != null) {
                a0.b(function10);
            }
        }
    }

    private final void d(String s) {
        com.dcinside.app.ad.util.a a0 = this.c;
        if(a0 != null) {
            a0.e();
        }
        if(this.d.isEmpty()) {
            a a1 = this.a;
            if(a1 != null) {
                a1.invoke();
            }
            return;
        }
        Function1 function10 = this.b;
        if(function10 == null) {
            return;
        }
        com.dcinside.app.ad.util.a a2 = (com.dcinside.app.ad.util.a)this.d.pollFirst();
        if(a2 == null) {
            return;
        }
        this.c = a2;
        a2.b(function10);
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return false;
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        this.b = null;
        for(Object object0: this.d) {
            ((com.dcinside.app.ad.util.a)object0).e();
        }
        this.d.clear();
        com.dcinside.app.ad.util.a a0 = this.c;
        if(a0 != null) {
            a0.e();
        }
        this.c = null;
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        com.dcinside.app.ad.util.a a0 = this.c;
        if(a0 != null) {
            a0.g();
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        com.dcinside.app.ad.util.a a0 = this.c;
        if(a0 != null) {
            a0.h();
        }
    }
}

