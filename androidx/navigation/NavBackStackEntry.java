package androidx.navigation;

import A3.a;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Set;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class NavBackStackEntry implements HasDefaultViewModelProviderFactory, LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {
    @RestrictTo({Scope.b})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @RestrictTo({Scope.b})
        @l
        public final NavBackStackEntry a(@m Context context0, @l NavDestination navDestination0, @m Bundle bundle0, @l State lifecycle$State0, @m NavViewModelStoreProvider navViewModelStoreProvider0, @l String s, @m Bundle bundle1) {
            L.p(navDestination0, "destination");
            L.p(lifecycle$State0, "hostLifecycleState");
            L.p(s, "id");
            return new NavBackStackEntry(context0, navDestination0, bundle0, lifecycle$State0, navViewModelStoreProvider0, s, bundle1, null);
        }

        public static NavBackStackEntry b(Companion navBackStackEntry$Companion0, Context context0, NavDestination navDestination0, Bundle bundle0, State lifecycle$State0, NavViewModelStoreProvider navViewModelStoreProvider0, String s, Bundle bundle1, int v, Object object0) {
            Bundle bundle2 = (v & 4) == 0 ? bundle0 : null;
            State lifecycle$State1 = (v & 8) == 0 ? lifecycle$State0 : State.c;
            NavViewModelStoreProvider navViewModelStoreProvider1 = (v & 16) == 0 ? navViewModelStoreProvider0 : null;
            if((v & 0x20) != 0) {
                L.o("48bd1a2d-1b06-454e-ba44-c29ae58fa802", "randomUUID().toString()");
                return (v & 0x40) == 0 ? navBackStackEntry$Companion0.a(context0, navDestination0, bundle2, lifecycle$State1, navViewModelStoreProvider1, "48bd1a2d-1b06-454e-ba44-c29ae58fa802", bundle1) : navBackStackEntry$Companion0.a(context0, navDestination0, bundle2, lifecycle$State1, navViewModelStoreProvider1, "48bd1a2d-1b06-454e-ba44-c29ae58fa802", null);
            }
            return (v & 0x40) == 0 ? navBackStackEntry$Companion0.a(context0, navDestination0, bundle2, lifecycle$State1, navViewModelStoreProvider1, s, bundle1) : navBackStackEntry$Companion0.a(context0, navDestination0, bundle2, lifecycle$State1, navViewModelStoreProvider1, s, null);
        }
    }

    static final class NavResultSavedStateFactory extends AbstractSavedStateViewModelFactory {
        public NavResultSavedStateFactory(@l SavedStateRegistryOwner savedStateRegistryOwner0) {
            L.p(savedStateRegistryOwner0, "owner");
            super(savedStateRegistryOwner0, null);
        }

        @Override  // androidx.lifecycle.AbstractSavedStateViewModelFactory
        @l
        protected ViewModel e(@l String s, @l Class class0, @l SavedStateHandle savedStateHandle0) {
            L.p(s, "key");
            L.p(class0, "modelClass");
            L.p(savedStateHandle0, "handle");
            return new SavedStateViewModel(savedStateHandle0);
        }
    }

    static final class SavedStateViewModel extends ViewModel {
        @l
        private final SavedStateHandle a;

        public SavedStateViewModel(@l SavedStateHandle savedStateHandle0) {
            L.p(savedStateHandle0, "handle");
            super();
            this.a = savedStateHandle0;
        }

        @l
        public final SavedStateHandle c() {
            return this.a;
        }
    }

    @m
    private final Context a;
    @l
    private NavDestination b;
    @m
    private final Bundle c;
    @l
    private State d;
    @m
    private final NavViewModelStoreProvider e;
    @l
    private final String f;
    @m
    private final Bundle g;
    @l
    private LifecycleRegistry h;
    @l
    private final SavedStateRegistryController i;
    private boolean j;
    @l
    private final D k;
    @l
    private final D l;
    @l
    private State m;
    @l
    public static final Companion n;

    static {
        NavBackStackEntry.n = new Companion(null);
    }

    private NavBackStackEntry(Context context0, NavDestination navDestination0, Bundle bundle0, State lifecycle$State0, NavViewModelStoreProvider navViewModelStoreProvider0, String s, Bundle bundle1) {
        this.a = context0;
        this.b = navDestination0;
        this.c = bundle0;
        this.d = lifecycle$State0;
        this.e = navViewModelStoreProvider0;
        this.f = s;
        this.g = bundle1;
        this.h = new LifecycleRegistry(this);
        this.i = SavedStateRegistryController.d.a(this);
        this.k = E.a(new a() {
            final NavBackStackEntry e;

            {
                this.e = navBackStackEntry0;
                super(0);
            }

            @l
            public final SavedStateViewModelFactory b() {
                Context context0 = this.e.a;
                Application application0 = null;
                Context context1 = context0 == null ? null : context0.getApplicationContext();
                if(context1 instanceof Application) {
                    application0 = (Application)context1;
                }
                return new SavedStateViewModelFactory(application0, this.e, this.e.d());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.l = E.a(new a() {
            final NavBackStackEntry e;

            {
                this.e = navBackStackEntry0;
                super(0);
            }

            @l
            public final SavedStateHandle b() {
                if(!this.e.j) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry\'s SavedStateHandle until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if(this.e.h.b() == State.a) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry\'s SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                NavResultSavedStateFactory navBackStackEntry$NavResultSavedStateFactory0 = new NavResultSavedStateFactory(this.e);
                return ((SavedStateViewModel)new ViewModelProvider(this.e, navBackStackEntry$NavResultSavedStateFactory0).a(SavedStateViewModel.class)).c();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.m = State.b;
    }

    NavBackStackEntry(Context context0, NavDestination navDestination0, Bundle bundle0, State lifecycle$State0, NavViewModelStoreProvider navViewModelStoreProvider0, String s, Bundle bundle1, int v, w w0) {
        String s1;
        State lifecycle$State1 = (v & 8) == 0 ? lifecycle$State0 : State.c;
        if((v & 0x20) == 0) {
            s1 = s;
        }
        else {
            L.o("e794d180-470c-40f3-bfa6-40f971be0604", "randomUUID().toString()");
            s1 = "e794d180-470c-40f3-bfa6-40f971be0604";
        }
        this(context0, navDestination0, ((v & 4) == 0 ? bundle0 : null), lifecycle$State1, ((v & 16) == 0 ? navViewModelStoreProvider0 : null), s1, ((v & 0x40) == 0 ? bundle1 : null));
    }

    public NavBackStackEntry(Context context0, NavDestination navDestination0, Bundle bundle0, State lifecycle$State0, NavViewModelStoreProvider navViewModelStoreProvider0, String s, Bundle bundle1, w w0) {
        this(context0, navDestination0, bundle0, lifecycle$State0, navViewModelStoreProvider0, s, bundle1);
    }

    @RestrictTo({Scope.b})
    public NavBackStackEntry(@l NavBackStackEntry navBackStackEntry0, @m Bundle bundle0) {
        L.p(navBackStackEntry0, "entry");
        this(navBackStackEntry0.a, navBackStackEntry0.b, bundle0, navBackStackEntry0.d, navBackStackEntry0.e, navBackStackEntry0.f, navBackStackEntry0.g);
        this.d = navBackStackEntry0.d;
        this.m(navBackStackEntry0.m);
    }

    public NavBackStackEntry(NavBackStackEntry navBackStackEntry0, Bundle bundle0, int v, w w0) {
        if((v & 2) != 0) {
            bundle0 = navBackStackEntry0.c;
        }
        this(navBackStackEntry0, bundle0);
    }

    @m
    public final Bundle d() {
        return this.c;
    }

    private final SavedStateViewModelFactory e() {
        return (SavedStateViewModelFactory)this.k.getValue();
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 != null && object0 instanceof NavBackStackEntry && L.g(this.f, ((NavBackStackEntry)object0).f) && L.g(this.b, ((NavBackStackEntry)object0).b) && L.g(this.h, ((NavBackStackEntry)object0).h) && L.g(this.getSavedStateRegistry(), ((NavBackStackEntry)object0).getSavedStateRegistry())) {
            if(L.g(this.c, ((NavBackStackEntry)object0).c)) {
                return true;
            }
            Bundle bundle0 = this.c;
            if(bundle0 != null) {
                Set set0 = bundle0.keySet();
                if(set0 != null) {
                    if(!set0.isEmpty()) {
                        for(Object object1: set0) {
                            Object object2 = this.c.get(((String)object1));
                            Bundle bundle1 = ((NavBackStackEntry)object0).c;
                            if(!L.g(object2, (bundle1 == null ? null : bundle1.get(((String)object1))))) {
                                return false;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @l
    public final NavDestination f() {
        return this.b;
    }

    @l
    public final String g() {
        return this.f;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @l
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application0 = null;
        CreationExtras creationExtras0 = new MutableCreationExtras(null, 1, null);
        Context context0 = this.a == null ? null : this.a.getApplicationContext();
        if(context0 instanceof Application) {
            application0 = (Application)context0;
        }
        if(application0 != null) {
            ((MutableCreationExtras)creationExtras0).c(AndroidViewModelFactory.i, application0);
        }
        ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.c, this);
        ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.d, this);
        Bundle bundle0 = this.c;
        if(bundle0 != null) {
            ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.e, bundle0);
        }
        return creationExtras0;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @l
    public Factory getDefaultViewModelProviderFactory() {
        return this.e();
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @l
    public Lifecycle getLifecycle() {
        return this.h;
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    @l
    public SavedStateRegistry getSavedStateRegistry() {
        return this.i.b();
    }

    @Override  // androidx.lifecycle.ViewModelStoreOwner
    @l
    public ViewModelStore getViewModelStore() {
        if(!this.j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry\'s ViewModels until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if(this.h.b() == State.a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry\'s ViewModels after the NavBackStackEntry is destroyed.");
        }
        NavViewModelStoreProvider navViewModelStoreProvider0 = this.e;
        if(navViewModelStoreProvider0 == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        return navViewModelStoreProvider0.a(this.f);
    }

    @RestrictTo({Scope.b})
    @l
    public final State h() {
        return this.m;
    }

    @Override
    public int hashCode() {
        int v = this.f.hashCode() * 0x1F + this.b.hashCode();
        Bundle bundle0 = this.c;
        if(bundle0 != null) {
            Set set0 = bundle0.keySet();
            if(set0 != null) {
                for(Object object0: set0) {
                    Object object1 = this.c.get(((String)object0));
                    v = v * 0x1F + (object1 == null ? 0 : object1.hashCode());
                }
            }
        }
        return (v * 0x1F + this.h.hashCode()) * 0x1F + this.getSavedStateRegistry().hashCode();
    }

    @l
    public final SavedStateHandle i() {
        return (SavedStateHandle)this.l.getValue();
    }

    @RestrictTo({Scope.b})
    public final void j(@l Event lifecycle$Event0) {
        L.p(lifecycle$Event0, "event");
        State lifecycle$State0 = lifecycle$Event0.d();
        L.o(lifecycle$State0, "event.targetState");
        this.d = lifecycle$State0;
        this.n();
    }

    @RestrictTo({Scope.b})
    public final void k(@l Bundle bundle0) {
        L.p(bundle0, "outBundle");
        this.i.e(bundle0);
    }

    @RestrictTo({Scope.b})
    public final void l(@l NavDestination navDestination0) {
        L.p(navDestination0, "<set-?>");
        this.b = navDestination0;
    }

    @RestrictTo({Scope.b})
    public final void m(@l State lifecycle$State0) {
        L.p(lifecycle$State0, "maxState");
        this.m = lifecycle$State0;
        this.n();
    }

    @RestrictTo({Scope.b})
    public final void n() {
        if(!this.j) {
            this.i.c();
            this.j = true;
            if(this.e != null) {
                SavedStateHandleSupport.c(this);
            }
            this.i.d(this.g);
        }
        if(this.d.ordinal() < this.m.ordinal()) {
            this.h.s(this.d);
            return;
        }
        this.h.s(this.m);
    }
}

