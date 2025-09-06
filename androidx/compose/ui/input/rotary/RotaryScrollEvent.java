package androidx.compose.ui.input.rotary;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nRotaryScrollEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotaryScrollEvent.kt\nandroidx/compose/ui/input/rotary/RotaryScrollEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final class RotaryScrollEvent {
    private final float a;
    private final float b;
    private final long c;
    public static final int d;

    static {
    }

    public RotaryScrollEvent(float f, float f1, long v) {
        this.a = f;
        this.b = f1;
        this.c = v;
    }

    public final float a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final float c() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof RotaryScrollEvent && ((RotaryScrollEvent)object0).a == this.a && ((RotaryScrollEvent)object0).b == this.b && ((RotaryScrollEvent)object0).c == this.c;
    }

    @Override
    public int hashCode() {
        return (Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + ((int)(this.c ^ this.c >>> 0x20));
    }

    @Override
    @l
    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ')';
    }
}

