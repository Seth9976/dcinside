package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import kotlin.h0;
import y4.l;
import y4.m;

public interface d extends b, g, h {
    public static final class a {
        @h0(version = "1.3")
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

        @h0(version = "1.1")
        public static void f() {
        }

        @h0(version = "1.1")
        public static void g() {
        }

        @h0(version = "1.1")
        public static void h() {
        }

        @h0(version = "1.4")
        public static void i() {
        }

        @h0(version = "1.1")
        public static void j() {
        }

        @h0(version = "1.1")
        public static void k() {
        }

        @h0(version = "1.1")
        public static void l() {
        }

        @h0(version = "1.5")
        public static void m() {
        }
    }

    @Override  // kotlin.reflect.h
    @l
    Collection b();

    boolean d();

    @Override
    boolean equals(@m Object arg1);

    @m
    String g();

    @l
    Collection getConstructors();

    @l
    List getTypeParameters();

    @m
    w getVisibility();

    @Override
    int hashCode();

    boolean isAbstract();

    boolean isFinal();

    @h0(version = "1.1")
    boolean isInstance(@m Object arg1);

    boolean isOpen();

    @l
    Collection j();

    @l
    List l();

    @m
    Object m();

    boolean n();

    boolean o();

    boolean r();

    boolean s();

    @m
    String u();

    @l
    List w();

    boolean x();
}

