package androidx.lifecycle;

import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Map.Entry;

public class MediatorLiveData extends MutableLiveData {
    static class Source implements Observer {
        final LiveData a;
        final Observer b;
        int c;

        Source(LiveData liveData0, Observer observer0) {
            this.c = -1;
            this.a = liveData0;
            this.b = observer0;
        }

        void a() {
            this.a.l(this);
        }

        void b() {
            this.a.p(this);
        }

        @Override  // androidx.lifecycle.Observer
        public void onChanged(@Nullable Object object0) {
            if(this.c != this.a.g()) {
                this.c = this.a.g();
                this.b.onChanged(object0);
            }
        }
    }

    private SafeIterableMap m;

    public MediatorLiveData() {
        this.m = new SafeIterableMap();
    }

    public MediatorLiveData(Object object0) {
        super(object0);
        this.m = new SafeIterableMap();
    }

    @Override  // androidx.lifecycle.LiveData
    @CallSuper
    protected void m() {
        for(Object object0: this.m) {
            ((Source)((Map.Entry)object0).getValue()).a();
        }
    }

    @Override  // androidx.lifecycle.LiveData
    @CallSuper
    protected void n() {
        for(Object object0: this.m) {
            ((Source)((Map.Entry)object0).getValue()).b();
        }
    }

    @MainThread
    public void s(@NonNull LiveData liveData0, @NonNull Observer observer0) {
        if(liveData0 == null) {
            throw new NullPointerException("source cannot be null");
        }
        Source mediatorLiveData$Source0 = new Source(liveData0, observer0);
        Source mediatorLiveData$Source1 = (Source)this.m.h(liveData0, mediatorLiveData$Source0);
        if(mediatorLiveData$Source1 != null && mediatorLiveData$Source1.b != observer0) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if(mediatorLiveData$Source1 != null) {
            return;
        }
        if(this.h()) {
            mediatorLiveData$Source0.a();
        }
    }

    @MainThread
    public void t(@NonNull LiveData liveData0) {
        Source mediatorLiveData$Source0 = (Source)this.m.i(liveData0);
        if(mediatorLiveData$Source0 != null) {
            mediatorLiveData$Source0.b();
        }
    }
}

