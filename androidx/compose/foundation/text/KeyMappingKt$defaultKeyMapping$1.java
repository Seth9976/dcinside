package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.h0;
import y4.m;

final class KeyMappingKt.defaultKeyMapping.1 extends h0 {
    public static final KeyMappingKt.defaultKeyMapping.1 a;

    static {
        KeyMappingKt.defaultKeyMapping.1.a = new KeyMappingKt.defaultKeyMapping.1();
    }

    KeyMappingKt.defaultKeyMapping.1() {
        super(KeyEvent_androidKt.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);
    }

    @Override  // kotlin.jvm.internal.h0
    @m
    public Object get(@m Object object0) {
        return Boolean.valueOf(KeyEvent_androidKt.e(((KeyEvent)object0).h()));
    }
}

