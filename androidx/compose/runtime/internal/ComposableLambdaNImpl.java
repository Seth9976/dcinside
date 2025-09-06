package androidx.compose.runtime.internal;

import A3.o;
import A3.w;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@Stable
@s0({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,176:1\n37#2,2:177\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n110#1:177,2\n*E\n"})
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    private final int a;
    private final boolean b;
    private final int c;
    @m
    private Object d;
    @m
    private RecomposeScope e;
    @m
    private List f;

    public ComposableLambdaNImpl(int v, boolean z, int v1) {
        this.a = v;
        this.b = z;
        this.c = v1;
    }

    public final int a() {
        return this.a;
    }

    private final int b(int v) {
        int v1 = v - 2;
        for(int v2 = 1; v2 * 10 < v1; ++v2) {
            --v1;
        }
        return v1;
    }

    private final void c(Composer composer0) {
        if(this.b) {
            RecomposeScope recomposeScope0 = composer0.T();
            if(recomposeScope0 != null) {
                composer0.q(recomposeScope0);
                if(ComposableLambdaKt.e(this.e, recomposeScope0)) {
                    this.e = recomposeScope0;
                    return;
                }
                List list0 = this.f;
                if(list0 == null) {
                    ArrayList arrayList0 = new ArrayList();
                    this.f = arrayList0;
                    arrayList0.add(recomposeScope0);
                    return;
                }
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(ComposableLambdaKt.e(((RecomposeScope)list0.get(v1)), recomposeScope0)) {
                        list0.set(v1, recomposeScope0);
                        return;
                    }
                }
                list0.add(recomposeScope0);
            }
        }
    }

    private final void d() {
        if(this.b) {
            RecomposeScope recomposeScope0 = this.e;
            if(recomposeScope0 != null) {
                recomposeScope0.invalidate();
                this.e = null;
            }
            List list0 = this.f;
            if(list0 != null) {
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((RecomposeScope)list0.get(v1)).invalidate();
                }
                list0.clear();
            }
        }
    }

    public final void e(@l Object object0) {
        L.p(object0, "block");
        if(!L.g(object0, this.d)) {
            boolean z = this.d == null;
            this.d = (w)object0;
            if(!z) {
                this.d();
            }
        }
    }

    @Override  // A3.w
    public int getArity() {
        return this.c;
    }

    @Override  // A3.w
    @m
    public Object q1(@l Object[] arr_object) {
        L.p(arr_object, "args");
        int v = this.b(arr_object.length);
        Object object0 = arr_object[v];
        L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] arr_object1 = kotlin.collections.l.St(arr_object, s.W1(0, arr_object.length - 1)).toArray(new Object[0]);
        Object object1 = arr_object[arr_object.length - 1];
        L.n(object1, "null cannot be cast to non-null type kotlin.Int");
        Composer composer0 = ((Composer)object0).G(this.a);
        this.c(composer0);
        int v1 = composer0.t(this) ? ComposableLambdaKt.d(v) : ComposableLambdaKt.f(v);
        Object object2 = this.d;
        L.n(object2, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        t0 t00 = new t0(2);
        t00.b(arr_object1);
        t00.a(((int)(((int)(((Integer)object1))) | v1)));
        Object object3 = ((w)object2).q1(t00.d(new Object[t00.c()]));
        ScopeUpdateScope scopeUpdateScope0 = composer0.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v, this) {
                final Object[] e;
                final int f;
                final ComposableLambdaNImpl g;

                {
                    this.e = arr_object;
                    this.f = v;
                    this.g = composableLambdaNImpl0;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    kotlin.ranges.l l0 = s.W1(0, this.f);
                    Object[] arr_object = kotlin.collections.l.St(this.e, l0).toArray(new Object[0]);
                    Object object0 = this.e[this.f + 1];
                    L.n(object0, "null cannot be cast to non-null type kotlin.Int");
                    kotlin.ranges.l l1 = s.W1(this.f + 2, this.e.length);
                    Object[] arr_object1 = kotlin.collections.l.St(this.e, l1).toArray(new Object[0]);
                    t0 t00 = new t0(4);
                    t00.b(arr_object);
                    t00.a(composer0);
                    t00.a(((int)(((int)(((Integer)object0))) | 1)));
                    t00.b(arr_object1);
                    Object[] arr_object2 = t00.d(new Object[t00.c()]);
                    this.g.q1(arr_object2);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object3;
    }
}

