package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransitionImpl;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.c})
public class FragmentTransitionSupport extends FragmentTransitionImpl {
    @Nullable
    public Object A(@NonNull ViewGroup viewGroup0, @NonNull Object object0) {
        return TransitionManager.d(viewGroup0, ((Transition)object0));
    }

    // 去混淆评级： 低(30)
    private static boolean B(Transition transition0) {
        return !FragmentTransitionImpl.i(transition0.U()) || !FragmentTransitionImpl.i(transition0.V()) || !FragmentTransitionImpl.i(transition0.W());
    }

    public boolean C() {
        return true;
    }

    public boolean D(@NonNull Object object0) {
        boolean z = ((Transition)object0).c0();
        if(!z) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + object0 + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return z;
    }

    // 检测为 Lambda 实现
    private static void E(Runnable runnable0, Transition transition0, Runnable runnable1) [...]

    public void F(@NonNull Object object0, float f) {
        if(((TransitionSeekController)object0).isReady()) {
            long v = (long)(f * ((float)((TransitionSeekController)object0).c()));
            if(v == 0L) {
                v = 1L;
            }
            if(v == ((TransitionSeekController)object0).c()) {
                v = ((TransitionSeekController)object0).c() - 1L;
            }
            ((TransitionSeekController)object0).m(v);
        }
    }

    public void G(@NonNull Fragment fragment0, @NonNull Object object0, @NonNull CancellationSignal cancellationSignal0, @Nullable Runnable runnable0, @NonNull Runnable runnable1) {
        cancellationSignal0.d(() -> {
            if(runnable0 == null) {
                ((Transition)object0).cancel();
                runnable1.run();
                return;
            }
            runnable0.run();
        });
        ((Transition)object0).c(new TransitionListener() {
            final FragmentTransitionSupport b;

            @Override  // androidx.transition.Transition$TransitionListener
            public void a(@NonNull Transition transition0) {
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void k(@NonNull Transition transition0) {
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void l(@NonNull Transition transition0) {
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void n(Transition transition0, boolean z) {
                e.a(this, transition0, z);
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void p(@NonNull Transition transition0) {
                runnable1.run();
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void r(@NonNull Transition transition0) {
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void s(Transition transition0, boolean z) {
                e.b(this, transition0, z);
            }
        });
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void a(@NonNull Object object0, @NonNull View view0) {
        if(object0 != null) {
            ((Transition)object0).e(view0);
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void b(@NonNull Object object0, @NonNull ArrayList arrayList0) {
        int v = 0;
        if(((Transition)object0) == null) {
            return;
        }
        if(((Transition)object0) instanceof TransitionSet) {
            int v1 = ((TransitionSet)(((Transition)object0))).U0();
            while(v < v1) {
                this.b(((TransitionSet)(((Transition)object0))).T0(v), arrayList0);
                ++v;
            }
            return;
        }
        if(!FragmentTransitionSupport.B(((Transition)object0)) && FragmentTransitionImpl.i(((Transition)object0).X())) {
            int v2 = arrayList0.size();
            while(v < v2) {
                ((Transition)object0).e(((View)arrayList0.get(v)));
                ++v;
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void c(@NonNull ViewGroup viewGroup0, @Nullable Object object0) {
        TransitionManager.b(viewGroup0, ((Transition)object0));
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public boolean e(@NonNull Object object0) {
        return object0 instanceof Transition;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object f(@Nullable Object object0) {
        return object0 != null ? ((Transition)object0).s() : null;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object j(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2) {
        Transition transition0 = (Transition)object0;
        if(transition0 != null && ((Transition)object1) != null) {
            transition0 = new TransitionSet().Q0(transition0).Q0(((Transition)object1)).e1(1);
        }
        else if(transition0 == null) {
            transition0 = ((Transition)object1) == null ? null : ((Transition)object1);
        }
        if(((Transition)object2) != null) {
            TransitionSet transitionSet0 = new TransitionSet();
            if(transition0 != null) {
                transitionSet0.Q0(transition0);
            }
            transitionSet0.Q0(((Transition)object2));
            return transitionSet0;
        }
        return transition0;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    @NonNull
    public Object k(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2) {
        TransitionSet transitionSet0 = new TransitionSet();
        if(object0 != null) {
            transitionSet0.Q0(((Transition)object0));
        }
        if(object1 != null) {
            transitionSet0.Q0(((Transition)object1));
        }
        if(object2 != null) {
            transitionSet0.Q0(((Transition)object2));
        }
        return transitionSet0;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void m(@NonNull Object object0, @NonNull View view0) {
        if(object0 != null) {
            ((Transition)object0).u0(view0);
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void n(@NonNull Object object0, @SuppressLint({"UnknownNullness"}) ArrayList arrayList0, @SuppressLint({"UnknownNullness"}) ArrayList arrayList1) {
        int v = 0;
        if(((Transition)object0) instanceof TransitionSet) {
            int v1 = ((TransitionSet)(((Transition)object0))).U0();
            while(v < v1) {
                this.n(((TransitionSet)(((Transition)object0))).T0(v), arrayList0, arrayList1);
                ++v;
            }
            return;
        }
        if(!FragmentTransitionSupport.B(((Transition)object0))) {
            List list0 = ((Transition)object0).X();
            if(list0.size() == arrayList0.size() && list0.containsAll(arrayList0)) {
                int v2 = arrayList1 == null ? 0 : arrayList1.size();
                while(v < v2) {
                    ((Transition)object0).e(((View)arrayList1.get(v)));
                    ++v;
                }
                for(int v3 = arrayList0.size() - 1; v3 >= 0; --v3) {
                    ((Transition)object0).u0(((View)arrayList0.get(v3)));
                }
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void o(@NonNull Object object0, @NonNull View view0, @NonNull ArrayList arrayList0) {
        ((Transition)object0).c(new TransitionListener() {
            final FragmentTransitionSupport c;

            @Override  // androidx.transition.Transition$TransitionListener
            public void a(@NonNull Transition transition0) {
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void k(@NonNull Transition transition0) {
                transition0.s0(this);
                transition0.c(this);
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void l(@NonNull Transition transition0) {
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void n(Transition transition0, boolean z) {
                e.a(this, transition0, z);
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void p(@NonNull Transition transition0) {
                transition0.s0(this);
                view0.setVisibility(8);
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((View)arrayList0.get(v1)).setVisibility(0);
                }
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void r(@NonNull Transition transition0) {
            }

            @Override  // androidx.transition.Transition$TransitionListener
            public void s(Transition transition0, boolean z) {
                e.b(this, transition0, z);
            }
        });
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void p(@NonNull Object object0, @Nullable Object object1, @Nullable ArrayList arrayList0, @Nullable Object object2, @Nullable ArrayList arrayList1, @Nullable Object object3, @Nullable ArrayList arrayList2) {
        ((Transition)object0).c(new TransitionListenerAdapter() {
            final FragmentTransitionSupport g;

            @Override  // androidx.transition.TransitionListenerAdapter
            public void k(@NonNull Transition transition0) {
                Object object0 = object1;
                if(object0 != null) {
                    FragmentTransitionSupport.this.n(object0, arrayList0, null);
                }
                Object object1 = object2;
                if(object1 != null) {
                    FragmentTransitionSupport.this.n(object1, arrayList1, null);
                }
                Object object2 = object3;
                if(object2 != null) {
                    FragmentTransitionSupport.this.n(object2, arrayList2, null);
                }
            }

            @Override  // androidx.transition.TransitionListenerAdapter
            public void p(@NonNull Transition transition0) {
                transition0.s0(this);
            }
        });
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void q(@NonNull Object object0, @NonNull Rect rect0) {
        if(object0 != null) {
            ((Transition)object0).D0(new EpicenterCallback() {
                final FragmentTransitionSupport b;

                @Override  // androidx.transition.Transition$EpicenterCallback
                public Rect a(@NonNull Transition transition0) {
                    return rect0 == null || rect0.isEmpty() ? null : rect0;
                }
            });
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void r(@NonNull Object object0, @Nullable View view0) {
        if(view0 != null) {
            Rect rect0 = new Rect();
            this.h(view0, rect0);
            ((Transition)object0).D0(new EpicenterCallback() {
                final FragmentTransitionSupport b;

                @Override  // androidx.transition.Transition$EpicenterCallback
                public Rect a(@NonNull Transition transition0) {
                    return rect0;
                }
            });
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void s(@NonNull Fragment fragment0, @NonNull Object object0, @NonNull CancellationSignal cancellationSignal0, @NonNull Runnable runnable0) {
        this.G(fragment0, object0, cancellationSignal0, null, runnable0);
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void u(@NonNull Object object0, @NonNull View view0, @NonNull ArrayList arrayList0) {
        List list0 = ((TransitionSet)object0).X();
        list0.clear();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            FragmentTransitionImpl.d(list0, ((View)arrayList0.get(v1)));
        }
        list0.add(view0);
        arrayList0.add(view0);
        this.b(((TransitionSet)object0), arrayList0);
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void v(@Nullable Object object0, @Nullable ArrayList arrayList0, @Nullable ArrayList arrayList1) {
        if(((TransitionSet)object0) != null) {
            ((TransitionSet)object0).X().clear();
            ((TransitionSet)object0).X().addAll(arrayList1);
            this.n(((TransitionSet)object0), arrayList0, arrayList1);
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object w(@Nullable Object object0) {
        if(object0 == null) {
            return null;
        }
        TransitionSet transitionSet0 = new TransitionSet();
        transitionSet0.Q0(((Transition)object0));
        return transitionSet0;
    }

    public void y(@NonNull Object object0) {
        ((TransitionSeekController)object0).g();
    }

    public void z(@NonNull Object object0, @NonNull Runnable runnable0) {
        ((TransitionSeekController)object0).q(runnable0);
    }
}

