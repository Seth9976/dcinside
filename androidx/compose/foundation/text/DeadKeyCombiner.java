package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class DeadKeyCombiner {
    @m
    private Integer a;

    @m
    public final Integer a(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        int v = KeyEvent_androidKt.c(keyEvent0);
        Integer integer0 = null;
        if((0x80000000 & v) != 0) {
            this.a = (int)(v & 0x7FFFFFFF);
            return null;
        }
        Integer integer1 = this.a;
        if(integer1 != null) {
            this.a = null;
            Integer integer2 = KeyCharacterMap.getDeadChar(((int)integer1), v);
            if(integer2.intValue() != 0) {
                integer0 = integer2;
            }
            return integer0 == null ? v : integer0;
        }
        return v;
    }
}

