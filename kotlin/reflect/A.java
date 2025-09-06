package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.L;
import kotlin.r;
import y4.l;
import y4.m;

@r
final class a implements GenericArrayType, y {
    @l
    private final Type a;

    public a(@l Type type0) {
        L.p(type0, "elementType");
        super();
        this.a = type0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof GenericArrayType && L.g(this.getGenericComponentType(), ((GenericArrayType)object0).getGenericComponentType());
    }

    @Override
    @l
    public Type getGenericComponentType() {
        return this.a;
    }

    @Override  // kotlin.reflect.y
    @l
    public String getTypeName() {
        return B.j(this.a) + "[]";
    }

    @Override
    public int hashCode() {
        return this.getGenericComponentType().hashCode();
    }

    @Override
    @l
    public String toString() {
        return this.getTypeName();
    }
}

