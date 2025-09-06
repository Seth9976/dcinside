package androidx.core.util;

import androidx.annotation.RequiresApi;
import java.util.function.Consumer;
import kotlin.coroutines.d;
import y4.l;
import z3.i;

@RequiresApi(24)
@i(name = "ConsumerKt")
public final class ConsumerKt {
    @RequiresApi(24)
    @l
    public static final Consumer a(@l d d0) {
        return new ContinuationConsumer(d0);
    }
}

