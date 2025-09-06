package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bumptech.glide.util.o;
import java.util.HashSet;
import java.util.Set;

final class LifecycleLifecycle implements LifecycleObserver, j {
    @NonNull
    private final Set a;
    @NonNull
    private final Lifecycle b;

    LifecycleLifecycle(Lifecycle lifecycle0) {
        this.a = new HashSet();
        this.b = lifecycle0;
        lifecycle0.a(this);
    }

    @Override  // com.bumptech.glide.manager.j
    public void a(@NonNull k k0) {
        this.a.remove(k0);
    }

    @Override  // com.bumptech.glide.manager.j
    public void b(@NonNull k k0) {
        this.a.add(k0);
        if(this.b.b() == State.a) {
            k0.onDestroy();
            return;
        }
        if(this.b.b().b(State.d)) {
            k0.onStart();
            return;
        }
        k0.onStop();
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner0) {
        for(Object object0: o.l(this.a)) {
            ((k)object0).onDestroy();
        }
        lifecycleOwner0.getLifecycle().d(this);
    }

    @OnLifecycleEvent(Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner0) {
        for(Object object0: o.l(this.a)) {
            ((k)object0).onStart();
        }
    }

    @OnLifecycleEvent(Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner0) {
        for(Object object0: o.l(this.a)) {
            ((k)object0).onStop();
        }
    }
}

