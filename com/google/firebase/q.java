package com.google.firebase;

import android.content.Context;
import com.google.firebase.components.g.b;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import com.google.firebase.components.w;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.w0;
import y4.l;
import y4.m;

public final class q {
    @l
    public static final h a(@l d d0, @l String s) {
        L.p(d0, "<this>");
        L.p(s, "name");
        h h0 = h.q(s);
        L.o(h0, "getInstance(name)");
        return h0;
    }

    private static final g b() {
        @s0({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,82:1\n*E\n"})
        public static final class a implements com.google.firebase.components.l {
            public static final a a;

            static {
                a.a = new a();
            }

            // 检测为 Lambda 实现
            @Override  // com.google.firebase.components.l
            public Object a(i i0) [...]

            public final K b(i i0) {
                L.y(4, "T");
                Object object0 = i0.j(com.google.firebase.components.K.a(Annotation.class, Executor.class));
                L.o(object0, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return w0.c(((Executor)object0));
            }
        }

        L.y(4, "T");
        b g$b0 = g.f(com.google.firebase.components.K.a(Annotation.class, K.class));
        L.y(4, "T");
        b g$b1 = g$b0.b(w.l(com.google.firebase.components.K.a(Annotation.class, Executor.class)));
        L.w();
        g g0 = g$b1.f((i i0) -> this.b(i0)).d();
        L.o(g0, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return g0;
    }

    @l
    public static final h c(@l d d0) {
        L.p(d0, "<this>");
        h h0 = h.p();
        L.o(h0, "getInstance()");
        return h0;
    }

    @l
    public static final s d(@l d d0) {
        L.p(d0, "<this>");
        s s0 = q.c(d.a).s();
        L.o(s0, "Firebase.app.options");
        return s0;
    }

    @m
    public static final h e(@l d d0, @l Context context0) {
        L.p(d0, "<this>");
        L.p(context0, "context");
        return h.x(context0);
    }

    @l
    public static final h f(@l d d0, @l Context context0, @l s s0) {
        L.p(d0, "<this>");
        L.p(context0, "context");
        L.p(s0, "options");
        h h0 = h.y(context0, s0);
        L.o(h0, "initializeApp(context, options)");
        return h0;
    }

    @l
    public static final h g(@l d d0, @l Context context0, @l s s0, @l String s1) {
        L.p(d0, "<this>");
        L.p(context0, "context");
        L.p(s0, "options");
        L.p(s1, "name");
        h h0 = h.z(context0, s0, s1);
        L.o(h0, "initializeApp(context, options, name)");
        return h0;
    }
}

