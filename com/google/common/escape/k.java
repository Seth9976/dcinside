package com.google.common.escape;

import J1.b;
import j..util.Objects;

@b(emulated = true)
@f
final class k {
    class a extends ThreadLocal {
        a() {
            super();
        }

        protected char[] a() {
            return new char[0x400];
        }

        @Override
        protected Object initialValue() {
            return this.a();
        }
    }

    private static final ThreadLocal a;

    static {
        k.a = new a();
    }

    static char[] a() {
        char[] arr_c = (char[])k.a.get();
        Objects.requireNonNull(arr_c);
        return arr_c;
    }
}

