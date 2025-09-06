package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

class FragmentLifecycleCallbacksDispatcher {
    static final class FragmentLifecycleCallbacksHolder {
        @NonNull
        final FragmentLifecycleCallbacks a;
        final boolean b;

        FragmentLifecycleCallbacksHolder(@NonNull FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks0, boolean z) {
            this.a = fragmentManager$FragmentLifecycleCallbacks0;
            this.b = z;
        }
    }

    @NonNull
    private final CopyOnWriteArrayList a;
    @NonNull
    private final FragmentManager b;

    FragmentLifecycleCallbacksDispatcher(@NonNull FragmentManager fragmentManager0) {
        this.a = new CopyOnWriteArrayList();
        this.b = fragmentManager0;
    }

    void a(@NonNull Fragment fragment0, @Nullable Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().a(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((FragmentLifecycleCallbacksHolder)object0).b) {
            }
        }
    }

    void b(@NonNull Fragment fragment0, boolean z) {
        this.b.J0().f();
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().b(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((FragmentLifecycleCallbacksHolder)object0).b) {
            }
        }
    }

    void c(@NonNull Fragment fragment0, @Nullable Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().c(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((FragmentLifecycleCallbacksHolder)object0).b) {
            }
        }
    }

    void d(@NonNull Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().d(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((FragmentLifecycleCallbacksHolder)object0).b) {
            }
        }
    }

    void e(@NonNull Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().e(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((FragmentLifecycleCallbacksHolder)object0).b) {
            }
        }
    }

    void f(@NonNull Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().f(fragment0, true);
        }
        for(Object object0: this.a) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder0 = (FragmentLifecycleCallbacksHolder)object0;
            if(!z || fragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder0.b) {
                fragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder0.a.f(this.b, fragment0);
            }
        }
    }

    void g(@NonNull Fragment fragment0, boolean z) {
        this.b.J0().f();
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().g(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((FragmentLifecycleCallbacksHolder)object0).b) {
            }
        }
    }

    void h(@NonNull Fragment fragment0, @Nullable Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().h(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((FragmentLifecycleCallbacksHolder)object0).b) {
            }
        }
    }

    void i(@NonNull Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().i(fragment0, true);
        }
        for(Object object0: this.a) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder0 = (FragmentLifecycleCallbacksHolder)object0;
            if(!z || fragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder0.b) {
                fragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder0.a.i(this.b, fragment0);
            }
        }
    }

    void j(@NonNull Fragment fragment0, @NonNull Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().j(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((FragmentLifecycleCallbacksHolder)object0).b) {
            }
        }
    }

    void k(@NonNull Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().k(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((FragmentLifecycleCallbacksHolder)object0).b) {
            }
        }
    }

    void l(@NonNull Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().l(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((FragmentLifecycleCallbacksHolder)object0).b) {
            }
        }
    }

    void m(@NonNull Fragment fragment0, @NonNull View view0, @Nullable Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().m(fragment0, view0, bundle0, true);
        }
        for(Object object0: this.a) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder0 = (FragmentLifecycleCallbacksHolder)object0;
            if(!z || fragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder0.b) {
                fragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder0.a.m(this.b, fragment0, view0, bundle0);
            }
        }
    }

    void n(@NonNull Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.M0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().L0().n(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((FragmentLifecycleCallbacksHolder)object0).b) {
            }
        }
    }

    public void o(@NonNull FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks0, boolean z) {
        FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder0 = new FragmentLifecycleCallbacksHolder(fragmentManager$FragmentLifecycleCallbacks0, z);
        this.a.add(fragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder0);
    }

    public void p(@NonNull FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks0) {
        synchronized(this.a) {
            int v1 = this.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((FragmentLifecycleCallbacksHolder)this.a.get(v2)).a == fragmentManager$FragmentLifecycleCallbacks0) {
                    this.a.remove(v2);
                    break;
                }
            }
        }
    }
}

