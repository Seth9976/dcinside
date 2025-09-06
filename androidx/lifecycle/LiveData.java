package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Map.Entry;

public abstract class LiveData {
    class AlwaysActiveObserver extends ObserverWrapper {
        final LiveData e;

        AlwaysActiveObserver(Observer observer0) {
            super(observer0);
        }

        @Override  // androidx.lifecycle.LiveData$ObserverWrapper
        boolean d() {
            return true;
        }
    }

    class LifecycleBoundObserver extends ObserverWrapper implements LifecycleEventObserver {
        @NonNull
        final LifecycleOwner e;
        final LiveData f;

        LifecycleBoundObserver(@NonNull LifecycleOwner lifecycleOwner0, Observer observer0) {
            super(observer0);
            this.e = lifecycleOwner0;
        }

        @Override  // androidx.lifecycle.LiveData$ObserverWrapper
        void b() {
            this.e.getLifecycle().d(this);
        }

        @Override  // androidx.lifecycle.LiveData$ObserverWrapper
        boolean c(LifecycleOwner lifecycleOwner0) {
            return this.e == lifecycleOwner0;
        }

        @Override  // androidx.lifecycle.LiveData$ObserverWrapper
        boolean d() {
            return this.e.getLifecycle().b().b(State.d);
        }

        @Override  // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner0, @NonNull Event lifecycle$Event0) {
            State lifecycle$State0 = this.e.getLifecycle().b();
            if(lifecycle$State0 == State.a) {
                LiveData.this.p(this.a);
                return;
            }
            State lifecycle$State1 = null;
            while(lifecycle$State1 != lifecycle$State0) {
                this.a(this.d());
                lifecycle$State1 = lifecycle$State0;
                lifecycle$State0 = this.e.getLifecycle().b();
            }
        }
    }

    abstract class ObserverWrapper {
        final Observer a;
        boolean b;
        int c;
        final LiveData d;

        ObserverWrapper(Observer observer0) {
            this.c = -1;
            this.a = observer0;
        }

        void a(boolean z) {
            if(z == this.b) {
                return;
            }
            this.b = z;
            LiveData.this.c((z ? 1 : -1));
            if(this.b) {
                LiveData.this.e(this);
            }
        }

        void b() {
        }

        boolean c(LifecycleOwner lifecycleOwner0) {
            return false;
        }

        abstract boolean d();
    }

    final Object a;
    private SafeIterableMap b;
    int c;
    private boolean d;
    private volatile Object e;
    volatile Object f;
    private int g;
    private boolean h;
    private boolean i;
    private final Runnable j;
    static final int k = -1;
    static final Object l;

    static {
        LiveData.l = new Object();
    }

    public LiveData() {
        this.a = new Object();
        this.b = new SafeIterableMap();
        this.c = 0;
        this.f = LiveData.l;
        this.j = new Runnable() {
            final LiveData a;

            @Override
            public void run() {
                Object object0;
                synchronized(LiveData.this.a) {
                    object0 = LiveData.this.f;
                    LiveData.this.f = LiveData.l;
                }
                LiveData.this.r(object0);
            }
        };
        this.e = LiveData.l;
        this.g = -1;
    }

    public LiveData(Object object0) {
        this.a = new Object();
        this.b = new SafeIterableMap();
        this.c = 0;
        this.f = LiveData.l;
        this.j = new Runnable() {
            final LiveData a;

            @Override
            public void run() {
                Object object0;
                synchronized(LiveData.this.a) {
                    object0 = LiveData.this.f;
                    LiveData.this.f = LiveData.l;
                }
                LiveData.this.r(object0);
            }
        };
        this.e = object0;
        this.g = 0;
    }

    static void b(String s) {
        if(!ArchTaskExecutor.h().c()) {
            throw new IllegalStateException("Cannot invoke " + s + " on a background thread");
        }
    }

    @MainThread
    void c(int v) {
        int v1 = this.c;
        this.c = v + v1;
        if(this.d) {
            return;
        }
        this.d = true;
        try {
            while(true) {
                int v3 = this.c;
                if(v1 == v3) {
                    break;
                }
                if(v1 == 0 && v3 > 0) {
                    this.m();
                }
                else if(v1 > 0 && v3 == 0) {
                    this.n();
                }
                v1 = v3;
            }
        }
        finally {
            this.d = false;
        }
    }

    private void d(ObserverWrapper liveData$ObserverWrapper0) {
        if(!liveData$ObserverWrapper0.b) {
            return;
        }
        if(!liveData$ObserverWrapper0.d()) {
            liveData$ObserverWrapper0.a(false);
            return;
        }
        int v = this.g;
        if(liveData$ObserverWrapper0.c >= v) {
            return;
        }
        liveData$ObserverWrapper0.c = v;
        liveData$ObserverWrapper0.a.onChanged(this.e);
    }

    void e(@Nullable ObserverWrapper liveData$ObserverWrapper0) {
        if(this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if(liveData$ObserverWrapper0 == null) {
                IteratorWithAdditions safeIterableMap$IteratorWithAdditions0 = this.b.c();
                while(safeIterableMap$IteratorWithAdditions0.hasNext()) {
                    Object object0 = safeIterableMap$IteratorWithAdditions0.next();
                    this.d(((ObserverWrapper)((Map.Entry)object0).getValue()));
                    if(this.i) {
                        break;
                    }
                }
            }
            else {
                this.d(liveData$ObserverWrapper0);
                liveData$ObserverWrapper0 = null;
            }
        }
        while(this.i);
        this.h = false;
    }

    @Nullable
    public Object f() {
        return this.e == LiveData.l ? null : this.e;
    }

    int g() {
        return this.g;
    }

    public boolean h() {
        return this.c > 0;
    }

    public boolean i() {
        return this.b.size() > 0;
    }

    public boolean j() {
        return this.e != LiveData.l;
    }

    @MainThread
    public void k(@NonNull LifecycleOwner lifecycleOwner0, @NonNull Observer observer0) {
        LiveData.b("observe");
        if(lifecycleOwner0.getLifecycle().b() == State.a) {
            return;
        }
        LifecycleBoundObserver liveData$LifecycleBoundObserver0 = new LifecycleBoundObserver(this, lifecycleOwner0, observer0);
        ObserverWrapper liveData$ObserverWrapper0 = (ObserverWrapper)this.b.h(observer0, liveData$LifecycleBoundObserver0);
        if(liveData$ObserverWrapper0 != null && !liveData$ObserverWrapper0.c(lifecycleOwner0)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if(liveData$ObserverWrapper0 != null) {
            return;
        }
        lifecycleOwner0.getLifecycle().a(liveData$LifecycleBoundObserver0);
    }

    @MainThread
    public void l(@NonNull Observer observer0) {
        LiveData.b("observeForever");
        AlwaysActiveObserver liveData$AlwaysActiveObserver0 = new AlwaysActiveObserver(this, observer0);
        ObserverWrapper liveData$ObserverWrapper0 = (ObserverWrapper)this.b.h(observer0, liveData$AlwaysActiveObserver0);
        if(liveData$ObserverWrapper0 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if(liveData$ObserverWrapper0 != null) {
            return;
        }
        liveData$AlwaysActiveObserver0.a(true);
    }

    protected void m() {
    }

    protected void n() {
    }

    protected void o(Object object0) {
        synchronized(this.a) {
            boolean z = this.f == LiveData.l;
            this.f = object0;
        }
        if(!z) {
            return;
        }
        ArchTaskExecutor.h().d(this.j);
    }

    @MainThread
    public void p(@NonNull Observer observer0) {
        LiveData.b("removeObserver");
        ObserverWrapper liveData$ObserverWrapper0 = (ObserverWrapper)this.b.i(observer0);
        if(liveData$ObserverWrapper0 == null) {
            return;
        }
        liveData$ObserverWrapper0.b();
        liveData$ObserverWrapper0.a(false);
    }

    @MainThread
    public void q(@NonNull LifecycleOwner lifecycleOwner0) {
        LiveData.b("removeObservers");
        for(Object object0: this.b) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((ObserverWrapper)map$Entry0.getValue()).c(lifecycleOwner0)) {
                this.p(((Observer)map$Entry0.getKey()));
            }
        }
    }

    @MainThread
    protected void r(Object object0) {
        LiveData.b("setValue");
        ++this.g;
        this.e = object0;
        this.e(null);
    }
}

