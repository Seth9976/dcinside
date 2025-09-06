package androidx.compose.ui.input.nestedscroll;

import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface NestedScrollConnection {
    public static final class DefaultImpls {
        @Deprecated
        @m
        public static Object a(@l NestedScrollConnection nestedScrollConnection0, long v, long v1, @l d d0) {
            return a.a(nestedScrollConnection0, v, v1, d0);
        }

        @Deprecated
        public static long b(@l NestedScrollConnection nestedScrollConnection0, long v, long v1, int v2) {
            return a.b(nestedScrollConnection0, v, v1, v2);
        }

        @Deprecated
        @m
        public static Object c(@l NestedScrollConnection nestedScrollConnection0, long v, @l d d0) {
            return a.c(nestedScrollConnection0, v, d0);
        }

        @Deprecated
        public static long d(@l NestedScrollConnection nestedScrollConnection0, long v, int v1) {
            return a.d(nestedScrollConnection0, v, v1);
        }
    }

    @m
    Object a(long arg1, long arg2, @l d arg3);

    long b(long arg1, long arg2, int arg3);

    @m
    Object d(long arg1, @l d arg2);

    long i(long arg1, int arg2);
}

