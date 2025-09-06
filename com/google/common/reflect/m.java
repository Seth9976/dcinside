package com.google.common.reflect;

import com.google.common.base.H;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@d
abstract class m {
    final Type a() {
        Type type0 = this.getClass().getGenericSuperclass();
        H.u(type0 instanceof ParameterizedType, "%s isn\'t parameterized", type0);
        return ((ParameterizedType)type0).getActualTypeArguments()[0];
    }
}

