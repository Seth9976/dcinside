package kotlin.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.random.b;
import y4.m;
import z3.f;

@s0({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public class l {
    @s0({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    static final class a {
        @y4.l
        public static final a a;
        @m
        @f
        public static final Method b;
        @m
        @f
        public static final Method c;

        static {
            Method method1;
            Method method0;
            a.a = new a();
            Class class0 = Throwable.class;
            Method[] arr_method = class0.getMethods();
            L.m(arr_method);
            for(int v1 = 0; true; ++v1) {
                method0 = null;
                method1 = null;
                if(v1 >= arr_method.length) {
                    break;
                }
                method0 = arr_method[v1];
                if(L.g(method0.getName(), "addSuppressed")) {
                    Class[] arr_class = method0.getParameterTypes();
                    L.o(arr_class, "getParameterTypes(...)");
                    if(!L.g(kotlin.collections.l.Bt(arr_class), class0)) {
                        continue;
                    }
                    break;
                }
            }
            a.b = method0;
            for(int v = 0; v < arr_method.length; ++v) {
                Method method2 = arr_method[v];
                if(L.g(method2.getName(), "getSuppressed")) {
                    method1 = method2;
                    break;
                }
            }
            a.c = method1;
        }
    }

    public void a(@y4.l Throwable throwable0, @y4.l Throwable throwable1) {
        L.p(throwable0, "cause");
        L.p(throwable1, "exception");
        Method method0 = a.b;
        if(method0 != null) {
            method0.invoke(throwable0, throwable1);
        }
    }

    @y4.l
    public kotlin.random.f b() {
        return new b();
    }

    @m
    public kotlin.text.m c(@y4.l MatchResult matchResult0, @y4.l String s) {
        L.p(matchResult0, "matchResult");
        L.p(s, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @y4.l
    public List d(@y4.l Throwable throwable0) {
        L.p(throwable0, "exception");
        Method method0 = a.c;
        if(method0 != null) {
            Object object0 = method0.invoke(throwable0, null);
            if(object0 != null) {
                List list0 = kotlin.collections.l.t(((Throwable[])object0));
                return list0 == null ? u.H() : list0;
            }
        }
        return u.H();
    }
}

