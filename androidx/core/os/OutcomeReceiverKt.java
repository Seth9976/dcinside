package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.coroutines.d;
import y4.l;

@RequiresApi(0x1F)
public final class OutcomeReceiverKt {
    @RequiresApi(0x1F)
    @l
    public static final OutcomeReceiver a(@l d d0) {
        return h.a(new ContinuationOutcomeReceiver(d0));
    }
}

