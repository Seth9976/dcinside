package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class MenuHostHelper {
    static class LifecycleContainer {
        final Lifecycle a;
        private LifecycleEventObserver b;

        LifecycleContainer(Lifecycle lifecycle0, LifecycleEventObserver lifecycleEventObserver0) {
            this.a = lifecycle0;
            this.b = lifecycleEventObserver0;
            lifecycle0.a(lifecycleEventObserver0);
        }

        void a() {
            this.a.d(this.b);
            this.b = null;
        }
    }

    private final Runnable a;
    private final CopyOnWriteArrayList b;
    private final Map c;

    public MenuHostHelper(Runnable runnable0) {
        this.b = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.a = runnable0;
    }

    public void c(MenuProvider menuProvider0) {
        this.b.add(menuProvider0);
        this.a.run();
    }

    public void d(MenuProvider menuProvider0, LifecycleOwner lifecycleOwner0) {
        this.c(menuProvider0);
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        LifecycleContainer menuHostHelper$LifecycleContainer0 = (LifecycleContainer)this.c.remove(menuProvider0);
        if(menuHostHelper$LifecycleContainer0 != null) {
            menuHostHelper$LifecycleContainer0.a();
        }
        LifecycleContainer menuHostHelper$LifecycleContainer1 = new LifecycleContainer(lifecycle0, (LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) -> if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.l(menuProvider0);
        });
        this.c.put(menuProvider0, menuHostHelper$LifecycleContainer1);
    }

    @SuppressLint({"LambdaLast"})
    public void e(MenuProvider menuProvider0, LifecycleOwner lifecycleOwner0, State lifecycle$State0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        LifecycleContainer menuHostHelper$LifecycleContainer0 = (LifecycleContainer)this.c.remove(menuProvider0);
        if(menuHostHelper$LifecycleContainer0 != null) {
            menuHostHelper$LifecycleContainer0.a();
        }
        LifecycleContainer menuHostHelper$LifecycleContainer1 = new LifecycleContainer(lifecycle0, (LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) -> {
            if(lifecycle$Event0 == Event.f(lifecycle$State0)) {
                this.c(menuProvider0);
                return;
            }
            if(lifecycle$Event0 == Event.ON_DESTROY) {
                this.l(menuProvider0);
                return;
            }
            if(lifecycle$Event0 == Event.b(lifecycle$State0)) {
                this.b.remove(menuProvider0);
                this.a.run();
            }
        });
        this.c.put(menuProvider0, menuHostHelper$LifecycleContainer1);
    }

    // 检测为 Lambda 实现
    private void f(MenuProvider menuProvider0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) [...]

    // 检测为 Lambda 实现
    private void g(State lifecycle$State0, MenuProvider menuProvider0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) [...]

    public void h(Menu menu0, MenuInflater menuInflater0) {
        for(Object object0: this.b) {
            ((MenuProvider)object0).a(menu0, menuInflater0);
        }
    }

    public void i(Menu menu0) {
        for(Object object0: this.b) {
            ((MenuProvider)object0).b(menu0);
        }
    }

    public boolean j(MenuItem menuItem0) {
        for(Object object0: this.b) {
            if(((MenuProvider)object0).d(menuItem0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public void k(Menu menu0) {
        for(Object object0: this.b) {
            ((MenuProvider)object0).c(menu0);
        }
    }

    public void l(MenuProvider menuProvider0) {
        this.b.remove(menuProvider0);
        LifecycleContainer menuHostHelper$LifecycleContainer0 = (LifecycleContainer)this.c.remove(menuProvider0);
        if(menuHostHelper$LifecycleContainer0 != null) {
            menuHostHelper$LifecycleContainer0.a();
        }
        this.a.run();
    }
}

