package com.facebook.imagepipeline.datasource;

import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.n;
import com.facebook.imagepipeline.producers.q0;
import com.facebook.imagepipeline.request.c;
import com.facebook.imagepipeline.systrace.b;
import f1.e;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import p3.d;
import y4.l;
import y4.m;

@s0({"SMAP\nAbstractProducerToDataSourceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractProducerToDataSourceAdapter.kt\ncom/facebook/imagepipeline/datasource/AbstractProducerToDataSourceAdapter\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,106:1\n40#2,2:107\n40#2,9:109\n40#2,9:118\n44#2,3:127\n40#2,9:130\n40#2,9:139\n48#2:148\n*S KotlinDebug\n*F\n+ 1 AbstractProducerToDataSourceAdapter.kt\ncom/facebook/imagepipeline/datasource/AbstractProducerToDataSourceAdapter\n*L\n95#1:107,2\n97#1:109,9\n100#1:118,9\n95#1:127,3\n97#1:130,9\n100#1:139,9\n95#1:148\n*E\n"})
@d
public abstract class a extends com.facebook.datasource.a implements c {
    @l
    private final q0 i;
    @l
    private final e j;

    protected a(@l h0 h00, @l q0 q00, @l e e0) {
        L.p(h00, "producer");
        L.p(q00, "settableProducerContext");
        L.p(e0, "requestListener");
        super();
        this.i = q00;
        this.j = e0;
        if(!b.e()) {
            this.n(q00.getExtras());
            if(b.e()) {
                b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    e0.c(q00);
                }
                catch(Throwable throwable0) {
                    b.c();
                    throw throwable0;
                }
                b.c();
            }
            else {
                e0.c(q00);
            }
            if(!b.e()) {
                h00.a(this.A(), q00);
                return;
            }
            b.a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                h00.a(this.A(), q00);
            }
            catch(Throwable throwable1) {
                b.c();
                throw throwable1;
            }
            b.c();
            return;
        }
        b.a("AbstractProducerToDataSourceAdapter()");
        try {
            this.n(q00.getExtras());
            if(b.e()) {
                b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    e0.c(q00);
                }
                catch(Throwable throwable2) {
                    b.c();
                    throw throwable2;
                }
                b.c();
            }
            else {
                e0.c(q00);
            }
            if(b.e()) {
                b.a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    h00.a(this.A(), q00);
                }
                catch(Throwable throwable3) {
                    b.c();
                    throw throwable3;
                }
                b.c();
            }
            else {
                h00.a(this.A(), q00);
            }
        }
        finally {
            b.c();
        }
    }

    private final n A() {
        public static final class com.facebook.imagepipeline.datasource.a.a extends com.facebook.imagepipeline.producers.c {
            final a h;

            com.facebook.imagepipeline.datasource.a.a(a a0) {
                this.h = a0;
                super();
            }

            @Override  // com.facebook.imagepipeline.producers.c
            protected void g() {
                this.h.E();
            }

            @Override  // com.facebook.imagepipeline.producers.c
            protected void h(Throwable throwable0) {
                L.p(throwable0, "throwable");
                this.h.F(throwable0);
            }

            @Override  // com.facebook.imagepipeline.producers.c
            protected void i(Object object0, int v) {
                q0 q00 = this.h.D();
                this.h.G(object0, v, q00);
            }

            @Override  // com.facebook.imagepipeline.producers.c
            protected void j(float f) {
                this.h.r(f);
            }
        }

        return new com.facebook.imagepipeline.datasource.a.a(this);
    }

    @l
    protected final Map B(@l j0 j00) {
        L.p(j00, "producerContext");
        return j00.getExtras();
    }

    @l
    public final e C() {
        return this.j;
    }

    @l
    public final q0 D() {
        return this.i;
    }

    private final void E() {
        synchronized(this) {
            com.facebook.common.internal.n.o(this.isClosed());
        }
    }

    private final void F(Throwable throwable0) {
        if(super.p(throwable0, this.B(this.i))) {
            this.j.i(this.i, throwable0);
        }
    }

    protected void G(@m Object object0, int v, @l j0 j00) {
        L.p(j00, "producerContext");
        boolean z = com.facebook.imagepipeline.producers.c.e(v);
        if(super.u(object0, z, this.B(j00)) && z) {
            this.j.e(this.i);
        }
    }

    @Override  // com.facebook.imagepipeline.request.c
    @m
    public com.facebook.imagepipeline.request.d b() {
        return this.i.b();
    }

    @Override  // com.facebook.datasource.a
    public boolean close() {
        if(!super.close()) {
            return false;
        }
        if(!super.g()) {
            this.j.g(this.i);
            this.i.m();
        }
        return true;
    }
}

