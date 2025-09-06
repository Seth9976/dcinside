package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;

@InternalComposeApi
@StabilityInferred(parameters = 0)
public final class MovableContentState {
    @l
    private final SlotTable a;
    public static final int b = 8;

    static {
    }

    public MovableContentState(@l SlotTable slotTable0) {
        L.p(slotTable0, "slotTable");
        super();
        this.a = slotTable0;
    }

    @l
    public final SlotTable a() {
        return this.a;
    }
}

