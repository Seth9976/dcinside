package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class KeyMappingKt {
    @l
    private static final KeyMapping a;

    static {
        KeyMappingKt.a = new KeyMappingKt.defaultKeyMapping.2.1(KeyMappingKt.a(KeyMappingKt.defaultKeyMapping.1.a));
    }

    @l
    public static final KeyMapping a(@l Function1 function10) {
        L.p(function10, "shortcutModifier");
        return new KeyMapping() {
            @Override  // androidx.compose.foundation.text.KeyMapping
            @m
            public KeyCommand a(@l KeyEvent keyEvent0) {
                L.p(keyEvent0, "event");
                androidx.compose.ui.input.key.KeyEvent keyEvent1 = androidx.compose.ui.input.key.KeyEvent.a(keyEvent0);
                if(((Boolean)function10.invoke(keyEvent1)).booleanValue() && KeyEvent_androidKt.g(keyEvent0)) {
                    return Key.E4(KeyEvent_androidKt.a(keyEvent0), 0x3600000000L) ? KeyCommand.N8 : null;
                }
                androidx.compose.ui.input.key.KeyEvent keyEvent2 = androidx.compose.ui.input.key.KeyEvent.a(keyEvent0);
                if(((Boolean)function10.invoke(keyEvent2)).booleanValue()) {
                    long v = KeyEvent_androidKt.a(keyEvent0);
                    if((Key.E4(v, 0x1F00000000L) ? true : Key.E4(v, 0x7C00000000L))) {
                        return KeyCommand.r;
                    }
                    if(Key.E4(v, 0x3200000000L)) {
                        return KeyCommand.s;
                    }
                    if(Key.E4(v, 0x3400000000L)) {
                        return KeyCommand.t;
                    }
                    if(Key.E4(v, 0x1D00000000L)) {
                        return KeyCommand.A;
                    }
                    if(Key.E4(v, 0x3500000000L)) {
                        return KeyCommand.N8;
                    }
                    return Key.E4(v, 0x3600000000L) ? KeyCommand.M8 : null;
                }
                if(!KeyEvent_androidKt.e(keyEvent0)) {
                    if(KeyEvent_androidKt.g(keyEvent0)) {
                        long v1 = KeyEvent_androidKt.a(keyEvent0);
                        if(Key.E4(v1, 0x1500000000L)) {
                            return KeyCommand.B;
                        }
                        if(Key.E4(v1, 0x1600000000L)) {
                            return KeyCommand.C;
                        }
                        if(Key.E4(v1, 0x1300000000L)) {
                            return KeyCommand.D;
                        }
                        if(Key.E4(v1, 0x1400000000L)) {
                            return KeyCommand.E;
                        }
                        if(Key.E4(v1, 0x5C00000000L)) {
                            return KeyCommand.F;
                        }
                        if(Key.E4(v1, 0x5D00000000L)) {
                            return KeyCommand.G;
                        }
                        if(Key.E4(v1, 0x7A00000000L)) {
                            return KeyCommand.N;
                        }
                        if(Key.E4(v1, 0x7B00000000L)) {
                            return KeyCommand.O;
                        }
                        return Key.E4(v1, 0x7C00000000L) ? KeyCommand.s : null;
                    }
                    long v2 = KeyEvent_androidKt.a(keyEvent0);
                    if(Key.E4(v2, 0x1500000000L)) {
                        return KeyCommand.b;
                    }
                    if(Key.E4(v2, 0x1600000000L)) {
                        return KeyCommand.c;
                    }
                    if(Key.E4(v2, 0x1300000000L)) {
                        return KeyCommand.l;
                    }
                    if(Key.E4(v2, 0x1400000000L)) {
                        return KeyCommand.m;
                    }
                    if(Key.E4(v2, 0x5C00000000L)) {
                        return KeyCommand.n;
                    }
                    if(Key.E4(v2, 0x5D00000000L)) {
                        return KeyCommand.o;
                    }
                    if(Key.E4(v2, 0x7A00000000L)) {
                        return KeyCommand.h;
                    }
                    if(Key.E4(v2, 0x7B00000000L)) {
                        return KeyCommand.i;
                    }
                    if(Key.E4(v2, 0x4200000000L)) {
                        return KeyCommand.Y;
                    }
                    if(Key.E4(v2, 0x4300000000L)) {
                        return KeyCommand.u;
                    }
                    if(Key.E4(v2, 0x7000000000L)) {
                        return KeyCommand.v;
                    }
                    if(Key.E4(v2, 0x11700000000L)) {
                        return KeyCommand.s;
                    }
                    if(Key.E4(v2, 0x11500000000L)) {
                        return KeyCommand.t;
                    }
                    if(Key.E4(v2, 0x11600000000L)) {
                        return KeyCommand.r;
                    }
                    return Key.E4(v2, 0x3D00000000L) ? KeyCommand.Z : null;
                }
                return null;
            }
        };
    }

    @l
    public static final KeyMapping b() {
        return KeyMappingKt.a;
    }
}

