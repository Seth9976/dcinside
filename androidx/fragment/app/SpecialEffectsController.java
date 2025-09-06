package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.CancellationSignal.OnCancelListener;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.R.id;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

abstract class SpecialEffectsController {
    static class FragmentStateManagerOperation extends Operation {
        @NonNull
        private final FragmentStateManager h;

        FragmentStateManagerOperation(@NonNull State specialEffectsController$Operation$State0, @NonNull LifecycleImpact specialEffectsController$Operation$LifecycleImpact0, @NonNull FragmentStateManager fragmentStateManager0, @NonNull CancellationSignal cancellationSignal0) {
            super(specialEffectsController$Operation$State0, specialEffectsController$Operation$LifecycleImpact0, fragmentStateManager0.k(), cancellationSignal0);
            this.h = fragmentStateManager0;
        }

        @Override  // androidx.fragment.app.SpecialEffectsController$Operation
        public void c() {
            super.c();
            this.h.m();
        }

        @Override  // androidx.fragment.app.SpecialEffectsController$Operation
        void l() {
            if(this.g() == LifecycleImpact.b) {
                Fragment fragment0 = this.h.k();
                View view0 = fragment0.mView.findFocus();
                if(view0 != null) {
                    fragment0.setFocusedView(view0);
                    if(FragmentManager.W0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + view0 + " for Fragment " + fragment0);
                    }
                }
                View view1 = this.f().requireView();
                if(view1.getParent() == null) {
                    this.h.b();
                    view1.setAlpha(0.0f);
                }
                if(view1.getAlpha() == 0.0f && view1.getVisibility() == 0) {
                    view1.setVisibility(4);
                }
                view1.setAlpha(fragment0.getPostOnViewCreatedAlpha());
                return;
            }
            if(this.g() == LifecycleImpact.c) {
                Fragment fragment1 = this.h.k();
                View view2 = fragment1.requireView();
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + view2.findFocus() + " on view " + view2 + " for Fragment " + fragment1);
                }
                view2.clearFocus();
            }
        }
    }

    static class Operation {
        static enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING;

        }

        static enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            void a(@NonNull View view0) {
                switch(this) {
                    case 1: {
                        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
                        if(viewGroup0 != null) {
                            if(FragmentManager.W0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view0 + " from container " + viewGroup0);
                            }
                            viewGroup0.removeView(view0);
                        }
                        return;
                    }
                    case 2: {
                        if(FragmentManager.W0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view0 + " to VISIBLE");
                        }
                        view0.setVisibility(0);
                        return;
                    }
                    case 3: {
                        if(FragmentManager.W0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view0 + " to GONE");
                        }
                        view0.setVisibility(8);
                        return;
                    }
                    case 4: {
                        if(FragmentManager.W0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view0 + " to INVISIBLE");
                        }
                        view0.setVisibility(4);
                    }
                }
            }

            @NonNull
            static State b(int v) {
                switch(v) {
                    case 0: {
                        return State.b;
                    }
                    case 4: {
                        return State.d;
                    }
                    case 8: {
                        return State.c;
                    }
                    default: {
                        throw new IllegalArgumentException("Unknown visibility " + v);
                    }
                }
            }

            @NonNull
            static State c(@NonNull View view0) {
                return view0.getAlpha() != 0.0f || view0.getVisibility() != 0 ? State.b(view0.getVisibility()) : State.d;
            }
        }

        @NonNull
        private State a;
        @NonNull
        private LifecycleImpact b;
        @NonNull
        private final Fragment c;
        @NonNull
        private final List d;
        @NonNull
        private final HashSet e;
        private boolean f;
        private boolean g;

        Operation(@NonNull State specialEffectsController$Operation$State0, @NonNull LifecycleImpact specialEffectsController$Operation$LifecycleImpact0, @NonNull Fragment fragment0, @NonNull CancellationSignal cancellationSignal0) {
            this.d = new ArrayList();
            this.e = new HashSet();
            this.f = false;
            this.g = false;
            this.a = specialEffectsController$Operation$State0;
            this.b = specialEffectsController$Operation$LifecycleImpact0;
            this.c = fragment0;
            cancellationSignal0.d(() -> {
                if(Operation.this.h()) {
                    return;
                }
                Operation.this.f = true;
                if(Operation.this.e.isEmpty()) {
                    Operation.this.c();
                    return;
                }
                for(Object object0: new ArrayList(Operation.this.e)) {
                    ((CancellationSignal)object0).a();
                }
            });

            class androidx.fragment.app.SpecialEffectsController.Operation.1 implements OnCancelListener {
                final Operation a;

                @Override  // androidx.core.os.CancellationSignal$OnCancelListener
                public void onCancel() {
                    Operation.this.b();
                }
            }

        }

        final void a(@NonNull Runnable runnable0) {
            this.d.add(runnable0);
        }

        // 检测为 Lambda 实现
        final void b() [...]

        @CallSuper
        public void c() {
            if(this.g) {
                return;
            }
            if(FragmentManager.W0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            for(Object object0: this.d) {
                ((Runnable)object0).run();
            }
        }

        public final void d(@NonNull CancellationSignal cancellationSignal0) {
            if(this.e.remove(cancellationSignal0) && this.e.isEmpty()) {
                this.c();
            }
        }

        @NonNull
        public State e() {
            return this.a;
        }

        @NonNull
        public final Fragment f() {
            return this.c;
        }

        @NonNull
        LifecycleImpact g() {
            return this.b;
        }

        final boolean h() {
            return this.f;
        }

        final boolean i() {
            return this.g;
        }

        public final void j(@NonNull CancellationSignal cancellationSignal0) {
            this.l();
            this.e.add(cancellationSignal0);
        }

        final void k(@NonNull State specialEffectsController$Operation$State0, @NonNull LifecycleImpact specialEffectsController$Operation$LifecycleImpact0) {
            switch(specialEffectsController$Operation$LifecycleImpact0) {
                case 1: {
                    if(this.a == State.a) {
                        if(FragmentManager.W0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                        }
                        this.a = State.b;
                        this.b = LifecycleImpact.b;
                        return;
                    }
                    break;
                }
                case 2: {
                    if(FragmentManager.W0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                    }
                    this.a = State.a;
                    this.b = LifecycleImpact.c;
                    return;
                }
                case 3: {
                    if(this.a != State.a) {
                        if(FragmentManager.W0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> " + specialEffectsController$Operation$State0 + ". ");
                        }
                        this.a = specialEffectsController$Operation$State0;
                        return;
                    }
                    break;
                }
            }
        }

        void l() {
        }

        // 去混淆评级： 低(20)
        @Override
        @NonNull
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.a + "} " + "{" + "mLifecycleImpact = " + this.b + "} " + "{" + "mFragment = " + this.c + "}";
        }
    }

    private final ViewGroup a;
    final ArrayList b;
    final ArrayList c;
    boolean d;
    boolean e;

    SpecialEffectsController(@NonNull ViewGroup viewGroup0) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = false;
        this.e = false;
        this.a = viewGroup0;
    }

    private void a(@NonNull State specialEffectsController$Operation$State0, @NonNull LifecycleImpact specialEffectsController$Operation$LifecycleImpact0, @NonNull FragmentStateManager fragmentStateManager0) {
        synchronized(this.b) {
            CancellationSignal cancellationSignal0 = new CancellationSignal();
            Operation specialEffectsController$Operation0 = this.h(fragmentStateManager0.k());
            if(specialEffectsController$Operation0 != null) {
                specialEffectsController$Operation0.k(specialEffectsController$Operation$State0, specialEffectsController$Operation$LifecycleImpact0);
                return;
            }
            FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation0 = new FragmentStateManagerOperation(specialEffectsController$Operation$State0, specialEffectsController$Operation$LifecycleImpact0, fragmentStateManager0, cancellationSignal0);
            this.b.add(specialEffectsController$FragmentStateManagerOperation0);
            specialEffectsController$FragmentStateManagerOperation0.a(new Runnable() {
                final SpecialEffectsController b;

                @Override
                public void run() {
                    if(SpecialEffectsController.this.b.contains(specialEffectsController$FragmentStateManagerOperation0)) {
                        specialEffectsController$FragmentStateManagerOperation0.e().a(specialEffectsController$FragmentStateManagerOperation0.f().mView);
                    }
                }
            });
            specialEffectsController$FragmentStateManagerOperation0.a(new Runnable() {
                final SpecialEffectsController b;

                @Override
                public void run() {
                    SpecialEffectsController.this.b.remove(specialEffectsController$FragmentStateManagerOperation0);
                    SpecialEffectsController.this.c.remove(specialEffectsController$FragmentStateManagerOperation0);
                }
            });
        }
    }

    void b(@NonNull State specialEffectsController$Operation$State0, @NonNull FragmentStateManager fragmentStateManager0) {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager0.k());
        }
        this.a(specialEffectsController$Operation$State0, LifecycleImpact.b, fragmentStateManager0);
    }

    void c(@NonNull FragmentStateManager fragmentStateManager0) {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager0.k());
        }
        this.a(State.c, LifecycleImpact.a, fragmentStateManager0);
    }

    void d(@NonNull FragmentStateManager fragmentStateManager0) {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager0.k());
        }
        this.a(State.a, LifecycleImpact.c, fragmentStateManager0);
    }

    void e(@NonNull FragmentStateManager fragmentStateManager0) {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager0.k());
        }
        this.a(State.b, LifecycleImpact.a, fragmentStateManager0);
    }

    abstract void f(@NonNull List arg1, boolean arg2);

    void g() {
        if(this.e) {
            return;
        }
        if(!ViewCompat.T0(this.a)) {
            this.j();
            this.d = false;
            return;
        }
        synchronized(this.b) {
            if(!this.b.isEmpty()) {
                ArrayList arrayList1 = new ArrayList(this.c);
                this.c.clear();
                for(Object object0: arrayList1) {
                    Operation specialEffectsController$Operation0 = (Operation)object0;
                    if(FragmentManager.W0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + specialEffectsController$Operation0);
                    }
                    specialEffectsController$Operation0.b();
                    if(!specialEffectsController$Operation0.i()) {
                        this.c.add(specialEffectsController$Operation0);
                    }
                }
                this.q();
                ArrayList arrayList2 = new ArrayList(this.b);
                this.b.clear();
                this.c.addAll(arrayList2);
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                for(Object object1: arrayList2) {
                    ((Operation)object1).l();
                }
                this.f(arrayList2, this.d);
                this.d = false;
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    @Nullable
    private Operation h(@NonNull Fragment fragment0) {
        for(Object object0: this.b) {
            Operation specialEffectsController$Operation0 = (Operation)object0;
            if(specialEffectsController$Operation0.f().equals(fragment0) && !specialEffectsController$Operation0.h()) {
                return specialEffectsController$Operation0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Nullable
    private Operation i(@NonNull Fragment fragment0) {
        for(Object object0: this.c) {
            Operation specialEffectsController$Operation0 = (Operation)object0;
            if(specialEffectsController$Operation0.f().equals(fragment0) && !specialEffectsController$Operation0.h()) {
                return specialEffectsController$Operation0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    void j() {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean z = ViewCompat.T0(this.a);
        synchronized(this.b) {
            this.q();
            for(Object object0: this.b) {
                ((Operation)object0).l();
            }
            for(Object object1: new ArrayList(this.c)) {
                Operation specialEffectsController$Operation0 = (Operation)object1;
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (z ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling running operation " + specialEffectsController$Operation0);
                }
                specialEffectsController$Operation0.b();
            }
            for(Object object2: new ArrayList(this.b)) {
                Operation specialEffectsController$Operation1 = (Operation)object2;
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (z ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling pending operation " + specialEffectsController$Operation1);
                }
                specialEffectsController$Operation1.b();
            }
        }
    }

    void k() {
        if(this.e) {
            if(FragmentManager.W0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.e = false;
            this.g();
        }
    }

    @Nullable
    LifecycleImpact l(@NonNull FragmentStateManager fragmentStateManager0) {
        Operation specialEffectsController$Operation0 = this.h(fragmentStateManager0.k());
        LifecycleImpact specialEffectsController$Operation$LifecycleImpact0 = specialEffectsController$Operation0 == null ? null : specialEffectsController$Operation0.g();
        Operation specialEffectsController$Operation1 = this.i(fragmentStateManager0.k());
        return specialEffectsController$Operation1 == null || specialEffectsController$Operation$LifecycleImpact0 != null && specialEffectsController$Operation$LifecycleImpact0 != LifecycleImpact.a ? specialEffectsController$Operation$LifecycleImpact0 : specialEffectsController$Operation1.g();
    }

    @NonNull
    public ViewGroup m() {
        return this.a;
    }

    @NonNull
    static SpecialEffectsController n(@NonNull ViewGroup viewGroup0, @NonNull FragmentManager fragmentManager0) {
        return SpecialEffectsController.o(viewGroup0, fragmentManager0.O0());
    }

    @NonNull
    static SpecialEffectsController o(@NonNull ViewGroup viewGroup0, @NonNull SpecialEffectsControllerFactory specialEffectsControllerFactory0) {
        Object object0 = viewGroup0.getTag(id.special_effects_controller_view_tag);
        if(object0 instanceof SpecialEffectsController) {
            return (SpecialEffectsController)object0;
        }
        SpecialEffectsController specialEffectsController0 = specialEffectsControllerFactory0.a(viewGroup0);
        viewGroup0.setTag(0x7F0B0F34, specialEffectsController0);  // id:special_effects_controller_view_tag
        return specialEffectsController0;
    }

    void p() {
        synchronized(this.b) {
            this.q();
            this.e = false;
            for(int v1 = this.b.size() - 1; v1 >= 0; --v1) {
                Operation specialEffectsController$Operation0 = (Operation)this.b.get(v1);
                State specialEffectsController$Operation$State0 = State.c(specialEffectsController$Operation0.f().mView);
                if(specialEffectsController$Operation0.e() == State.b && specialEffectsController$Operation$State0 != State.b) {
                    this.e = specialEffectsController$Operation0.f().isPostponed();
                    break;
                }
            }
        }
    }

    private void q() {
        for(Object object0: this.b) {
            Operation specialEffectsController$Operation0 = (Operation)object0;
            if(specialEffectsController$Operation0.g() == LifecycleImpact.b) {
                specialEffectsController$Operation0.k(State.b(specialEffectsController$Operation0.f().requireView().getVisibility()), LifecycleImpact.a);
            }
        }
    }

    void r(boolean z) {
        this.d = z;
    }
}

