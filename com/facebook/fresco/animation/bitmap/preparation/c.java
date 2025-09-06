package com.facebook.fresco.animation.bitmap.preparation;

import I0.d;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.imagepipeline.bitmaps.e;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

public final class c implements b {
    @s0({"SMAP\nDefaultBitmapFramePreparer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultBitmapFramePreparer.kt\ncom/facebook/fresco/animation/bitmap/preparation/DefaultBitmapFramePreparer$FrameDecodeRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
    final class a implements Runnable {
        @l
        private final com.facebook.fresco.animation.backend.a a;
        @l
        private final d b;
        private final int c;
        private final int d;
        final c e;

        public a(@l com.facebook.fresco.animation.backend.a a0, @l d d0, int v, int v1) {
            L.p(a0, "animationBackend");
            L.p(d0, "bitmapFrameCache");
            this.e = c0;
            super();
            this.a = a0;
            this.b = d0;
            this.c = v;
            this.d = v1;
        }

        private final boolean a(int v, int v1) {
            boolean z;
            int v2 = 2;
            com.facebook.common.references.a a0 = null;
            switch(v1) {
                case 1: {
                    try {
                        int v3 = this.a.d();
                        int v4 = this.a.e();
                        a0 = this.b.I(v, v3, v4);
                        break;
                    }
                    catch(Throwable throwable0) {
                        com.facebook.common.references.a.j(a0);
                        throw throwable0;
                    }
                }
                case 2: {
                    a0 = this.e.a.e(this.a.d(), this.a.e(), this.e.c);
                    v2 = -1;
                    break;
                }
                default: {
                    com.facebook.common.references.a.j(null);
                    return false;
                }
            }
            try {
                z = this.b(v, a0, v1);
            }
            catch(Throwable throwable0) {
                com.facebook.common.references.a.j(a0);
                throw throwable0;
            }
            com.facebook.common.references.a.j(a0);
            return z || v2 == -1 ? z : this.a(v, v2);
        }

        private final boolean b(int v, com.facebook.common.references.a a0, int v1) {
            if(!com.facebook.common.references.a.s(a0)) {
                return false;
            }
            if(a0 != null) {
                Object object0 = a0.n();
                L.o(object0, "get(...)");
                if(this.e.b.g(v, ((Bitmap)object0))) {
                    x0.a.V(this.e.e, "Frame %d ready.", v);
                    synchronized(this.e.f) {
                        this.b.F(v, a0, v1);
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public void run() {
            try {
                if(this.b.D(this.c)) {
                    x0.a.V(this.e.e, "Frame %d is cached already.", this.c);
                    return;
                }
                if(this.a(this.c, 1)) {
                    x0.a.V(this.e.e, "Prepared frame %d.", this.c);
                }
                else {
                    x0.a.s(this.e.e, "Could not prepare frame %d.", new Object[]{this.c});
                }
            }
            finally {
                SparseArray sparseArray0 = this.e.f;
                synchronized(sparseArray0) {
                    this.e.f.remove(this.d);
                }
            }
        }
    }

    @l
    private final e a;
    @l
    private final I0.e b;
    @l
    private final Bitmap.Config c;
    @l
    private final ExecutorService d;
    @l
    private final Class e;
    @l
    private final SparseArray f;

    public c(@l e e0, @l I0.e e1, @l Bitmap.Config bitmap$Config0, @l ExecutorService executorService0) {
        L.p(e0, "platformBitmapFactory");
        L.p(e1, "bitmapFrameRenderer");
        L.p(bitmap$Config0, "bitmapConfig");
        L.p(executorService0, "executorService");
        super();
        this.a = e0;
        this.b = e1;
        this.c = bitmap$Config0;
        this.d = executorService0;
        this.e = c.class;
        this.f = new SparseArray();
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.b
    public boolean a(@l d d0, @l com.facebook.fresco.animation.backend.a a0, int v) {
        L.p(d0, "bitmapFrameCache");
        L.p(a0, "animationBackend");
        int v1 = this.g(a0, v);
        synchronized(this.f) {
            if(this.f.get(v1) != null) {
                x0.a.V(this.e, "Already scheduled decode job for frame %d", v);
                return true;
            }
            if(d0.D(v)) {
                x0.a.V(this.e, "Frame %d is cached already.", v);
                return true;
            }
            a c$a0 = new a(this, a0, d0, v, v1);
            this.f.put(v1, c$a0);
            this.d.execute(c$a0);
            return true;
        }
    }

    private final int g(com.facebook.fresco.animation.backend.a a0, int v) {
        return a0.hashCode() * 0x1F + v;
    }
}

