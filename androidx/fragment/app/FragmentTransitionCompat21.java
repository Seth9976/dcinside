package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
class FragmentTransitionCompat21 extends FragmentTransitionImpl {
    @RequiresApi(19)
    static class Api19Impl {
        static void a(@NonNull Transition transition0, @NonNull Transition.TransitionListener transition$TransitionListener0) {
            transition0.addListener(transition$TransitionListener0);
        }

        static void b(@NonNull Transition transition0, @NonNull Transition.TransitionListener transition$TransitionListener0) {
            transition0.removeListener(transition$TransitionListener0);
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void a(Object object0, View view0) {
        if(object0 != null) {
            ((Transition)object0).addTarget(view0);
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void b(Object object0, ArrayList arrayList0) {
        int v = 0;
        if(((Transition)object0) == null) {
            return;
        }
        if(((Transition)object0) instanceof TransitionSet) {
            int v1 = ((TransitionSet)(((Transition)object0))).getTransitionCount();
            while(v < v1) {
                this.b(((TransitionSet)(((Transition)object0))).getTransitionAt(v), arrayList0);
                ++v;
            }
            return;
        }
        if(!FragmentTransitionCompat21.x(((Transition)object0)) && FragmentTransitionImpl.i(((Transition)object0).getTargets())) {
            int v2 = arrayList0.size();
            while(v < v2) {
                ((Transition)object0).addTarget(((View)arrayList0.get(v)));
                ++v;
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void c(ViewGroup viewGroup0, Object object0) {
        TransitionManager.beginDelayedTransition(viewGroup0, ((Transition)object0));
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public boolean e(Object object0) {
        return object0 instanceof Transition;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public Object f(Object object0) {
        return object0 != null ? ((Transition)object0).clone() : null;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public Object j(Object object0, Object object1, Object object2) {
        Transition transition0 = (Transition)object0;
        if(transition0 != null && ((Transition)object1) != null) {
            transition0 = new TransitionSet().addTransition(transition0).addTransition(((Transition)object1)).setOrdering(1);
        }
        else if(transition0 == null) {
            transition0 = ((Transition)object1) == null ? null : ((Transition)object1);
        }
        if(((Transition)object2) != null) {
            TransitionSet transitionSet0 = new TransitionSet();
            if(transition0 != null) {
                transitionSet0.addTransition(transition0);
            }
            transitionSet0.addTransition(((Transition)object2));
            return transitionSet0;
        }
        return transition0;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public Object k(Object object0, Object object1, Object object2) {
        TransitionSet transitionSet0 = new TransitionSet();
        if(object0 != null) {
            transitionSet0.addTransition(((Transition)object0));
        }
        if(object1 != null) {
            transitionSet0.addTransition(((Transition)object1));
        }
        if(object2 != null) {
            transitionSet0.addTransition(((Transition)object2));
        }
        return transitionSet0;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void m(Object object0, View view0) {
        if(object0 != null) {
            ((Transition)object0).removeTarget(view0);
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void n(Object object0, ArrayList arrayList0, ArrayList arrayList1) {
        int v = 0;
        if(((Transition)object0) instanceof TransitionSet) {
            int v1 = ((TransitionSet)(((Transition)object0))).getTransitionCount();
            while(v < v1) {
                this.n(((TransitionSet)(((Transition)object0))).getTransitionAt(v), arrayList0, arrayList1);
                ++v;
            }
            return;
        }
        if(!FragmentTransitionCompat21.x(((Transition)object0))) {
            List list0 = ((Transition)object0).getTargets();
            if(list0 != null && list0.size() == arrayList0.size() && list0.containsAll(arrayList0)) {
                int v2 = arrayList1 == null ? 0 : arrayList1.size();
                while(v < v2) {
                    ((Transition)object0).addTarget(((View)arrayList1.get(v)));
                    ++v;
                }
                for(int v3 = arrayList0.size() - 1; v3 >= 0; --v3) {
                    ((Transition)object0).removeTarget(((View)arrayList0.get(v3)));
                }
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void o(Object object0, View view0, ArrayList arrayList0) {
        ((Transition)object0).addListener(new Transition.TransitionListener() {
            final FragmentTransitionCompat21 c;

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(Transition transition0) {
                Api19Impl.b(transition0, this);
                view0.setVisibility(8);
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((View)arrayList0.get(v1)).setVisibility(0);
                }
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(Transition transition0) {
                Api19Impl.b(transition0, this);
                Api19Impl.a(transition0, this);
            }
        });
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void p(Object object0, Object object1, ArrayList arrayList0, Object object2, ArrayList arrayList1, Object object3, ArrayList arrayList2) {
        ((Transition)object0).addListener(new Transition.TransitionListener() {
            final FragmentTransitionCompat21 g;

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(Transition transition0) {
                Api19Impl.b(transition0, this);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(Transition transition0) {
                Object object0 = object1;
                if(object0 != null) {
                    FragmentTransitionCompat21.this.n(object0, arrayList0, null);
                }
                Object object1 = object2;
                if(object1 != null) {
                    FragmentTransitionCompat21.this.n(object1, arrayList1, null);
                }
                Object object2 = object3;
                if(object2 != null) {
                    FragmentTransitionCompat21.this.n(object2, arrayList2, null);
                }
            }
        });
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void q(Object object0, Rect rect0) {
        if(object0 != null) {
            ((Transition)object0).setEpicenterCallback(new Transition.EpicenterCallback() {
                final FragmentTransitionCompat21 b;

                @Override  // android.transition.Transition$EpicenterCallback
                public Rect onGetEpicenter(Transition transition0) {
                    return rect0 == null || rect0.isEmpty() ? null : rect0;
                }
            });
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void r(Object object0, View view0) {
        if(view0 != null) {
            Rect rect0 = new Rect();
            this.h(view0, rect0);
            ((Transition)object0).setEpicenterCallback(new Transition.EpicenterCallback() {
                final FragmentTransitionCompat21 b;

                @Override  // android.transition.Transition$EpicenterCallback
                public Rect onGetEpicenter(Transition transition0) {
                    return rect0;
                }
            });
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void s(@NonNull Fragment fragment0, @NonNull Object object0, @NonNull CancellationSignal cancellationSignal0, @NonNull Runnable runnable0) {
        ((Transition)object0).addListener(new Transition.TransitionListener() {
            final FragmentTransitionCompat21 b;

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(Transition transition0) {
                runnable0.run();
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(Transition transition0) {
            }
        });
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void u(Object object0, View view0, ArrayList arrayList0) {
        List list0 = ((TransitionSet)object0).getTargets();
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
    public void v(Object object0, ArrayList arrayList0, ArrayList arrayList1) {
        if(((TransitionSet)object0) != null) {
            ((TransitionSet)object0).getTargets().clear();
            ((TransitionSet)object0).getTargets().addAll(arrayList1);
            this.n(((TransitionSet)object0), arrayList0, arrayList1);
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public Object w(Object object0) {
        if(object0 == null) {
            return null;
        }
        TransitionSet transitionSet0 = new TransitionSet();
        transitionSet0.addTransition(((Transition)object0));
        return transitionSet0;
    }

    // 去混淆评级： 低(30)
    private static boolean x(Transition transition0) {
        return !FragmentTransitionImpl.i(transition0.getTargetIds()) || !FragmentTransitionImpl.i(transition0.getTargetNames()) || !FragmentTransitionImpl.i(transition0.getTargetTypes());
    }
}

