package androidx.work;

import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.t0;
import kotlin.jvm.internal.L;
import y4.l;

final class OperationImpl implements Operation {
    @l
    private final LiveData c;
    @l
    private final t0 d;

    public OperationImpl(@l LiveData liveData0, @l t0 t00) {
        L.p(liveData0, "state");
        L.p(t00, "future");
        super();
        this.c = liveData0;
        this.d = t00;
    }

    @Override  // androidx.work.Operation
    @l
    public t0 getResult() {
        return this.d;
    }

    @Override  // androidx.work.Operation
    @l
    public LiveData getState() {
        return this.c;
    }
}

