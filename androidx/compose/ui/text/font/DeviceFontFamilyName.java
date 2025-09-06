package androidx.compose.ui.text.font;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.g;

@s0({"SMAP\nDeviceFontFamilyNameFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFontFamilyNameFont.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
@g
public final class DeviceFontFamilyName {
    @l
    private final String a;

    private DeviceFontFamilyName(String s) {
        this.a = s;
    }

    public static final DeviceFontFamilyName a(String s) {
        return new DeviceFontFamilyName(s);
    }

    @l
    public static String b(@l String s) {
        L.p(s, "name");
        if(s.length() <= 0) {
            throw new IllegalArgumentException("name may not be empty");
        }
        return s;
    }

    // 去混淆评级： 低(20)
    public static boolean c(String s, Object object0) {
        return object0 instanceof DeviceFontFamilyName ? L.g(s, ((DeviceFontFamilyName)object0).h()) : false;
    }

    public static final boolean d(String s, String s1) {
        return L.g(s, s1);
    }

    @l
    public final String e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        return DeviceFontFamilyName.c(this.a, object0);
    }

    public static int f(String s) {
        return s.hashCode();
    }

    public static String g(String s) [...] // Inlined contents

    public final String h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return DeviceFontFamilyName.f(this.a);
    }

    @Override
    public String toString() {
        return "DeviceFontFamilyName(name=" + this.a + ')';
    }
}

