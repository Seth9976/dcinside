package androidx.transition;

import android.os.Build.VERSION;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class TransitionManager {
    static class MultiListener implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
        Transition a;
        ViewGroup b;

        MultiListener(Transition transition0, ViewGroup viewGroup0) {
            this.a = transition0;
            this.b = viewGroup0;
        }

        private void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override  // android.view.ViewTreeObserver$OnPreDrawListener
        public boolean onPreDraw() {
            this.a();
            if(!TransitionManager.f.remove(this.b)) {
                return true;
            }
            ArrayMap arrayMap0 = TransitionManager.g();
            ArrayList arrayList0 = (ArrayList)arrayMap0.get(this.b);
            ArrayList arrayList1 = null;
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                arrayMap0.put(this.b, arrayList0);
            }
            else if(arrayList0.size() > 0) {
                arrayList1 = new ArrayList(arrayList0);
            }
            arrayList0.add(this.a);
            this.a.c(new TransitionListenerAdapter() {
                final MultiListener b;

                @Override  // androidx.transition.TransitionListenerAdapter
                public void p(@NonNull Transition transition0) {
                    ((ArrayList)arrayMap0.get(MultiListener.this.b)).remove(transition0);
                    transition0.s0(this);
                }
            });
            this.a.q(this.b, false);
            if(arrayList1 != null) {
                for(Object object0: arrayList1) {
                    ((Transition)object0).x0(this.b);
                }
            }
            this.a.q0(this.b);
            return true;
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view0) {
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view0) {
            this.a();
            TransitionManager.f.remove(this.b);
            ArrayList arrayList0 = (ArrayList)TransitionManager.g().get(this.b);
            if(arrayList0 != null && arrayList0.size() > 0) {
                for(Object object0: arrayList0) {
                    ((Transition)object0).x0(this.b);
                }
            }
            this.a.r(true);
        }
    }

    private ArrayMap a;
    private ArrayMap b;
    private static final String c = "TransitionManager";
    private static Transition d;
    private static ThreadLocal e;
    static ArrayList f;

    static {
        TransitionManager.d = new AutoTransition();
        TransitionManager.e = new ThreadLocal();
        TransitionManager.f = new ArrayList();
    }

    public TransitionManager() {
        this.a = new ArrayMap();
        this.b = new ArrayMap();
    }

    public static void a(@NonNull ViewGroup viewGroup0) {
        TransitionManager.b(viewGroup0, null);
    }

    public static void b(@NonNull ViewGroup viewGroup0, @Nullable Transition transition0) {
        if(!TransitionManager.f.contains(viewGroup0) && viewGroup0.isLaidOut()) {
            TransitionManager.f.add(viewGroup0);
            if(transition0 == null) {
                transition0 = TransitionManager.d;
            }
            Transition transition1 = transition0.s();
            TransitionManager.l(viewGroup0, transition1);
            Scene.g(viewGroup0, null);
            TransitionManager.k(viewGroup0, transition1);
        }
    }

    private static void c(Scene scene0, Transition transition0) {
        ViewGroup viewGroup0 = scene0.e();
        if(!TransitionManager.f.contains(viewGroup0)) {
            Scene scene1 = Scene.c(viewGroup0);
            if(transition0 == null) {
                if(scene1 != null) {
                    scene1.b();
                }
                scene0.a();
                return;
            }
            TransitionManager.f.add(viewGroup0);
            Transition transition1 = transition0.s();
            if(scene1 != null && scene1.f()) {
                transition1.A0(true);
            }
            TransitionManager.l(viewGroup0, transition1);
            scene0.a();
            TransitionManager.k(viewGroup0, transition1);
        }
    }

    @Nullable
    public static TransitionSeekController d(@NonNull ViewGroup viewGroup0, @NonNull Transition transition0) {
        if(!TransitionManager.f.contains(viewGroup0) && viewGroup0.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if(!transition0.c0()) {
                throw new IllegalArgumentException("The Transition must support seeking.");
            }
            TransitionManager.f.add(viewGroup0);
            Transition transition1 = transition0.s();
            TransitionSet transitionSet0 = new TransitionSet();
            transitionSet0.Q0(transition1);
            TransitionManager.l(viewGroup0, transitionSet0);
            Scene.g(viewGroup0, null);
            TransitionManager.k(viewGroup0, transitionSet0);
            viewGroup0.invalidate();
            return transitionSet0.v();
        }
        return null;
    }

    @Nullable
    public static TransitionSeekController e(@NonNull Scene scene0, @NonNull Transition transition0) {
        ViewGroup viewGroup0 = scene0.e();
        if(!transition0.c0()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        if(TransitionManager.f.contains(viewGroup0)) {
            return null;
        }
        Scene scene1 = Scene.c(viewGroup0);
        if(viewGroup0.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            TransitionManager.f.add(viewGroup0);
            Transition transition1 = transition0.s();
            TransitionSet transitionSet0 = new TransitionSet();
            transitionSet0.Q0(transition1);
            if(scene1 != null && scene1.f()) {
                transitionSet0.A0(true);
            }
            TransitionManager.l(viewGroup0, transitionSet0);
            scene0.a();
            TransitionManager.k(viewGroup0, transitionSet0);
            return transitionSet0.v();
        }
        if(scene1 != null) {
            scene1.b();
        }
        scene0.a();
        return null;
    }

    public static void f(@Nullable ViewGroup viewGroup0) {
        TransitionManager.f.remove(viewGroup0);
        ArrayList arrayList0 = (ArrayList)TransitionManager.g().get(viewGroup0);
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ArrayList arrayList1 = new ArrayList(arrayList0);
            for(int v = arrayList1.size() - 1; v >= 0; --v) {
                ((Transition)arrayList1.get(v)).I(viewGroup0);
            }
        }
    }

    @VisibleForTesting
    static ArrayMap g() {
        WeakReference weakReference0 = (WeakReference)TransitionManager.e.get();
        if(weakReference0 != null) {
            ArrayMap arrayMap0 = (ArrayMap)weakReference0.get();
            if(arrayMap0 != null) {
                return arrayMap0;
            }
        }
        ArrayMap arrayMap1 = new ArrayMap();
        WeakReference weakReference1 = new WeakReference(arrayMap1);
        TransitionManager.e.set(weakReference1);
        return arrayMap1;
    }

    private Transition h(Scene scene0) {
        Scene scene1 = Scene.c(scene0.e());
        if(scene1 != null) {
            ArrayMap arrayMap0 = (ArrayMap)this.b.get(scene0);
            if(arrayMap0 != null) {
                Transition transition0 = (Transition)arrayMap0.get(scene1);
                if(transition0 != null) {
                    return transition0;
                }
            }
        }
        Transition transition1 = (Transition)this.a.get(scene0);
        return transition1 == null ? TransitionManager.d : transition1;
    }

    public static void i(@NonNull Scene scene0) {
        TransitionManager.c(scene0, TransitionManager.d);
    }

    public static void j(@NonNull Scene scene0, @Nullable Transition transition0) {
        TransitionManager.c(scene0, transition0);
    }

    private static void k(ViewGroup viewGroup0, Transition transition0) {
        if(transition0 != null && viewGroup0 != null) {
            MultiListener transitionManager$MultiListener0 = new MultiListener(transition0, viewGroup0);
            viewGroup0.addOnAttachStateChangeListener(transitionManager$MultiListener0);
            viewGroup0.getViewTreeObserver().addOnPreDrawListener(transitionManager$MultiListener0);
        }
    }

    private static void l(ViewGroup viewGroup0, Transition transition0) {
        ArrayList arrayList0 = (ArrayList)TransitionManager.g().get(viewGroup0);
        if(arrayList0 != null && arrayList0.size() > 0) {
            for(Object object0: arrayList0) {
                ((Transition)object0).p0(viewGroup0);
            }
        }
        if(transition0 != null) {
            transition0.q(viewGroup0, true);
        }
        Scene scene0 = Scene.c(viewGroup0);
        if(scene0 != null) {
            scene0.b();
        }
    }

    public void m(@NonNull Scene scene0, @NonNull Scene scene1, @Nullable Transition transition0) {
        ArrayMap arrayMap0 = (ArrayMap)this.b.get(scene1);
        if(arrayMap0 == null) {
            arrayMap0 = new ArrayMap();
            this.b.put(scene1, arrayMap0);
        }
        arrayMap0.put(scene0, transition0);
    }

    public void n(@NonNull Scene scene0, @Nullable Transition transition0) {
        this.a.put(scene0, transition0);
    }

    public void o(@NonNull Scene scene0) {
        TransitionManager.c(scene0, this.h(scene0));
    }
}

