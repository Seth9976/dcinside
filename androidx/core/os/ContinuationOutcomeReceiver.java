package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.d;
import kotlin.e0;
import kotlin.f0;
import y4.l;

@RequiresApi(0x1F)
final class ContinuationOutcomeReceiver extends AtomicBoolean implements OutcomeReceiver {
    @l
    private final d a;

    public ContinuationOutcomeReceiver(@l d d0) {
        super(false);
        this.a = d0;
    }

    @Override  // android.os.OutcomeReceiver
    public void onError(@l Throwable throwable0) {
        if(this.compareAndSet(false, true)) {
            Object object0 = e0.b(f0.a(throwable0));
            this.a.resumeWith(object0);
        }
    }

    @Override  // android.os.OutcomeReceiver
    public void onResult(Object object0) {
        if(this.compareAndSet(false, true)) {
            this.a.resumeWith(object0);
        }
    }

    @Override
    @l
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + this.get() + ')';
    }
}

