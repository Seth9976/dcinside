package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class KeyMappingKt.defaultKeyMapping.2.1 implements KeyMapping {
    final KeyMapping a;

    KeyMappingKt.defaultKeyMapping.2.1(KeyMapping keyMapping0) {
        this.a = keyMapping0;
        super();
    }

    @Override  // androidx.compose.foundation.text.KeyMapping
    @m
    public KeyCommand a(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        KeyCommand keyCommand0 = null;
        if(KeyEvent_androidKt.g(keyEvent0) && KeyEvent_androidKt.e(keyEvent0)) {
            long v = KeyEvent_androidKt.a(keyEvent0);
            if(Key.E4(v, 0x1500000000L)) {
                return KeyCommand.J == null ? this.a.a(keyEvent0) : KeyCommand.J;
            }
            if(Key.E4(v, 0x1600000000L)) {
                return KeyCommand.K == null ? this.a.a(keyEvent0) : KeyCommand.K;
            }
            if(Key.E4(v, 0x1300000000L)) {
                return KeyCommand.M == null ? this.a.a(keyEvent0) : KeyCommand.M;
            }
            if(Key.E4(v, 0x1400000000L)) {
                return KeyCommand.L == null ? this.a.a(keyEvent0) : KeyCommand.L;
            }
        }
        else if(KeyEvent_androidKt.e(keyEvent0)) {
            long v1 = KeyEvent_androidKt.a(keyEvent0);
            if(Key.E4(v1, 0x1500000000L)) {
                return KeyCommand.e == null ? this.a.a(keyEvent0) : KeyCommand.e;
            }
            if(Key.E4(v1, 0x1600000000L)) {
                return KeyCommand.d == null ? this.a.a(keyEvent0) : KeyCommand.d;
            }
            if(Key.E4(v1, 0x1300000000L)) {
                return KeyCommand.g == null ? this.a.a(keyEvent0) : KeyCommand.g;
            }
            if(Key.E4(v1, 0x1400000000L)) {
                return KeyCommand.f == null ? this.a.a(keyEvent0) : KeyCommand.f;
            }
            if(Key.E4(v1, 0x2400000000L)) {
                return KeyCommand.u == null ? this.a.a(keyEvent0) : KeyCommand.u;
            }
            if(Key.E4(v1, 0x7000000000L)) {
                return KeyCommand.x == null ? this.a.a(keyEvent0) : KeyCommand.x;
            }
            if(Key.E4(v1, 0x4300000000L)) {
                return KeyCommand.w == null ? this.a.a(keyEvent0) : KeyCommand.w;
            }
            if(Key.E4(v1, 0x4900000000L)) {
                return KeyCommand.X == null ? this.a.a(keyEvent0) : KeyCommand.X;
            }
        }
        else if(KeyEvent_androidKt.g(keyEvent0)) {
            long v2 = KeyEvent_androidKt.a(keyEvent0);
            if(Key.E4(v2, 0x7A00000000L)) {
                return KeyCommand.H == null ? this.a.a(keyEvent0) : KeyCommand.H;
            }
            if(Key.E4(v2, 0x7B00000000L)) {
                return KeyCommand.I == null ? this.a.a(keyEvent0) : KeyCommand.I;
            }
        }
        else if(KeyEvent_androidKt.d(keyEvent0)) {
            long v3 = KeyEvent_androidKt.a(keyEvent0);
            if(Key.E4(v3, 0x4300000000L)) {
                return KeyCommand.y == null ? this.a.a(keyEvent0) : KeyCommand.y;
            }
            if(Key.E4(v3, 0x7000000000L)) {
                keyCommand0 = KeyCommand.z;
            }
        }
        return keyCommand0 == null ? this.a.a(keyEvent0) : keyCommand0;
    }
}

