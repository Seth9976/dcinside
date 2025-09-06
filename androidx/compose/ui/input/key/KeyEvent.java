package androidx.compose.ui.input.key;

import kotlin.jvm.internal.L;
import y4.l;
import z3.g;

@g
public final class KeyEvent {
    @l
    private final android.view.KeyEvent a;

    private KeyEvent(android.view.KeyEvent keyEvent0) {
        this.a = keyEvent0;
    }

    public static final KeyEvent a(android.view.KeyEvent keyEvent0) {
        return new KeyEvent(keyEvent0);
    }

    @l
    public static android.view.KeyEvent b(@l android.view.KeyEvent keyEvent0) {
        L.p(keyEvent0, "nativeKeyEvent");
        return keyEvent0;
    }

    // 去混淆评级： 低(20)
    public static boolean c(android.view.KeyEvent keyEvent0, Object object0) {
        return object0 instanceof KeyEvent ? L.g(keyEvent0, ((KeyEvent)object0).h()) : false;
    }

    public static final boolean d(android.view.KeyEvent keyEvent0, android.view.KeyEvent keyEvent1) {
        return L.g(keyEvent0, keyEvent1);
    }

    @l
    public final android.view.KeyEvent e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        return KeyEvent.c(this.a, object0);
    }

    public static int f(android.view.KeyEvent keyEvent0) {
        return keyEvent0.hashCode();
    }

    public static String g(android.view.KeyEvent keyEvent0) [...] // Inlined contents

    public final android.view.KeyEvent h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return KeyEvent.f(this.a);
    }

    @Override
    public String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}

