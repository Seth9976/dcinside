package kotlin.reflect;

import kotlin.h0;
import kotlin.v;

public interface i extends c, v {
    public static final class a {
        @h0(version = "1.1")
        public static void a() {
        }

        @h0(version = "1.1")
        public static void b() {
        }

        @h0(version = "1.1")
        public static void c() {
        }

        @h0(version = "1.1")
        public static void d() {
        }

        @h0(version = "1.1")
        public static void e() {
        }
    }

    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override  // kotlin.reflect.c
    boolean isSuspend();
}

