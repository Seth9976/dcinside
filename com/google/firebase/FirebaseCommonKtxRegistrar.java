package com.google.firebase;

import U1.c;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import com.google.firebase.components.w;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.w0;
import y4.l;

@Keep
@s0({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/FirebaseKt\n*L\n1#1,82:1\n76#2,6:83\n76#2,6:89\n76#2,6:95\n76#2,6:101\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n*L\n67#1:83,6\n68#1:89,6\n69#1:95,6\n70#1:101,6\n*E\n"})
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    @l
    public List getComponents() {
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
                Object object0 = i0.j(com.google.firebase.components.K.a(U1.a.class, Executor.class));
                L.o(object0, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return w0.c(((Executor)object0));
            }
        }


        @s0({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,82:1\n*E\n"})
        public static final class b implements com.google.firebase.components.l {
            public static final b a;

            static {
                b.a = new b();
            }

            // 检测为 Lambda 实现
            @Override  // com.google.firebase.components.l
            public Object a(i i0) [...]

            public final K b(i i0) {
                Object object0 = i0.j(com.google.firebase.components.K.a(c.class, Executor.class));
                L.o(object0, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return w0.c(((Executor)object0));
            }
        }


        @s0({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,82:1\n*E\n"})
        public static final class com.google.firebase.FirebaseCommonKtxRegistrar.c implements com.google.firebase.components.l {
            public static final com.google.firebase.FirebaseCommonKtxRegistrar.c a;

            static {
                com.google.firebase.FirebaseCommonKtxRegistrar.c.a = new com.google.firebase.FirebaseCommonKtxRegistrar.c();
            }

            // 检测为 Lambda 实现
            @Override  // com.google.firebase.components.l
            public Object a(i i0) [...]

            public final K b(i i0) {
                Object object0 = i0.j(com.google.firebase.components.K.a(U1.b.class, Executor.class));
                L.o(object0, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return w0.c(((Executor)object0));
            }
        }


        @s0({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,82:1\n*E\n"})
        public static final class d implements com.google.firebase.components.l {
            public static final d a;

            static {
                d.a = new d();
            }

            // 检测为 Lambda 实现
            @Override  // com.google.firebase.components.l
            public Object a(i i0) [...]

            public final K b(i i0) {
                Object object0 = i0.j(com.google.firebase.components.K.a(U1.d.class, Executor.class));
                L.o(object0, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return w0.c(((Executor)object0));
            }
        }

        g g0 = g.f(com.google.firebase.components.K.a(U1.a.class, K.class)).b(w.l(com.google.firebase.components.K.a(U1.a.class, Executor.class))).f((i i0) -> this.b(i0)).d();
        L.o(g0, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        g g1 = g.f(com.google.firebase.components.K.a(c.class, K.class)).b(w.l(com.google.firebase.components.K.a(c.class, Executor.class))).f((i i0) -> this.b(i0)).d();
        L.o(g1, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        g g2 = g.f(com.google.firebase.components.K.a(U1.b.class, K.class)).b(w.l(com.google.firebase.components.K.a(U1.b.class, Executor.class))).f((i i0) -> this.b(i0)).d();
        L.o(g2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        g g3 = g.f(com.google.firebase.components.K.a(U1.d.class, K.class)).b(w.l(com.google.firebase.components.K.a(U1.d.class, Executor.class))).f((i i0) -> this.b(i0)).d();
        L.o(g3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return u.O(new g[]{g0, g1, g2, g3});
    }
}

