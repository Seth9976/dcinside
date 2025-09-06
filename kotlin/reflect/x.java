package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r;
import y4.l;
import y4.m;

@s0({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
@r
final class x implements ParameterizedType, y {
    @l
    private final Class a;
    @m
    private final Type b;
    @l
    private final Type[] c;

    public x(@l Class class0, @m Type type0, @l List list0) {
        L.p(class0, "rawType");
        L.p(list0, "typeArguments");
        super();
        this.a = class0;
        this.b = type0;
        this.c = (Type[])list0.toArray(new Type[0]);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 instanceof ParameterizedType) {
            Type type0 = ((ParameterizedType)object0).getRawType();
            if(L.g(this.a, type0)) {
                Type type1 = ((ParameterizedType)object0).getOwnerType();
                return L.g(this.b, type1) && Arrays.equals(this.getActualTypeArguments(), ((ParameterizedType)object0).getActualTypeArguments());
            }
        }
        return false;
    }

    @Override
    @l
    public Type[] getActualTypeArguments() {
        return this.c;
    }

    @Override
    @m
    public Type getOwnerType() {
        return this.b;
    }

    @Override
    @l
    public Type getRawType() {
        return this.a;
    }

    @Override  // kotlin.reflect.y
    @l
    public String getTypeName() {
        final class a extends H implements Function1 {
            public static final a a;

            static {
                a.a = new a();
            }

            a() {
                super(1, B.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
            }

            public final String a(Type type0) {
                L.p(type0, "p0");
                return B.j(type0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Type)object0));
            }
        }

        StringBuilder stringBuilder0 = new StringBuilder();
        Type type0 = this.b;
        if(type0 == null) {
            stringBuilder0.append(B.j(this.a));
        }
        else {
            stringBuilder0.append(B.j(type0));
            stringBuilder0.append("$");
            stringBuilder0.append(this.a.getSimpleName());
        }
        Type[] arr_type = this.c;
        if(arr_type.length != 0) {
            kotlin.collections.l.Tg(arr_type, stringBuilder0, null, "<", ">", 0, null, a.a, 50, null);
        }
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v ^ Arrays.hashCode(this.getActualTypeArguments()) : v ^ this.b.hashCode() ^ Arrays.hashCode(this.getActualTypeArguments());
    }

    @Override
    @l
    public String toString() {
        return this.getTypeName();
    }
}

