package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal.OnCancelListener;
import androidx.core.os.CancellationSignal;
import androidx.core.util.Preconditions;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

class DefaultSpecialEffectsController extends SpecialEffectsController {
    static class AnimationInfo extends SpecialEffectsInfo {
        private boolean c;
        private boolean d;
        @Nullable
        private AnimationOrAnimator e;

        AnimationInfo(@NonNull Operation specialEffectsController$Operation0, @NonNull CancellationSignal cancellationSignal0, boolean z) {
            super(specialEffectsController$Operation0, cancellationSignal0);
            this.d = false;
            this.c = z;
        }

        @Nullable
        AnimationOrAnimator e(@NonNull Context context0) {
            if(this.d) {
                return this.e;
            }
            AnimationOrAnimator fragmentAnim$AnimationOrAnimator0 = FragmentAnim.b(context0, this.b().f(), this.b().e() == State.b, this.c);
            this.e = fragmentAnim$AnimationOrAnimator0;
            this.d = true;
            return fragmentAnim$AnimationOrAnimator0;
        }
    }

    static class SpecialEffectsInfo {
        @NonNull
        private final Operation a;
        @NonNull
        private final CancellationSignal b;

        SpecialEffectsInfo(@NonNull Operation specialEffectsController$Operation0, @NonNull CancellationSignal cancellationSignal0) {
            this.a = specialEffectsController$Operation0;
            this.b = cancellationSignal0;
        }

        void a() {
            this.a.d(this.b);
        }

        @NonNull
        Operation b() {
            return this.a;
        }

        @NonNull
        CancellationSignal c() {
            return this.b;
        }

        boolean d() {
            State specialEffectsController$Operation$State0 = State.c(this.a.f().mView);
            State specialEffectsController$Operation$State1 = this.a.e();
            return specialEffectsController$Operation$State0 == specialEffectsController$Operation$State1 || specialEffectsController$Operation$State0 != State.b && specialEffectsController$Operation$State1 != State.b;
        }
    }

    static class TransitionInfo extends SpecialEffectsInfo {
        @Nullable
        private final Object c;
        private final boolean d;
        @Nullable
        private final Object e;

        TransitionInfo(@NonNull Operation specialEffectsController$Operation0, @NonNull CancellationSignal cancellationSignal0, boolean z, boolean z1) {
            super(specialEffectsController$Operation0, cancellationSignal0);
            if(specialEffectsController$Operation0.e() == State.b) {
                this.c = z ? specialEffectsController$Operation0.f().getReenterTransition() : specialEffectsController$Operation0.f().getEnterTransition();
                this.d = z ? specialEffectsController$Operation0.f().getAllowReturnTransitionOverlap() : specialEffectsController$Operation0.f().getAllowEnterTransitionOverlap();
            }
            else {
                this.c = z ? specialEffectsController$Operation0.f().getReturnTransition() : specialEffectsController$Operation0.f().getExitTransition();
                this.d = true;
            }
            if(z1) {
                if(z) {
                    this.e = specialEffectsController$Operation0.f().getSharedElementReturnTransition();
                    return;
                }
                this.e = specialEffectsController$Operation0.f().getSharedElementEnterTransition();
                return;
            }
            this.e = null;
        }

        @Nullable
        FragmentTransitionImpl e() {
            FragmentTransitionImpl fragmentTransitionImpl0 = this.f(this.c);
            FragmentTransitionImpl fragmentTransitionImpl1 = this.f(this.e);
            if(fragmentTransitionImpl0 != null && fragmentTransitionImpl1 != null && fragmentTransitionImpl0 != fragmentTransitionImpl1) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.b().f() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.e);
            }
            return fragmentTransitionImpl0 == null ? fragmentTransitionImpl1 : fragmentTransitionImpl0;
        }

        @Nullable
        private FragmentTransitionImpl f(Object object0) {
            if(object0 == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl0 = FragmentTransition.a;
            if(fragmentTransitionImpl0 != null && fragmentTransitionImpl0.e(object0)) {
                return fragmentTransitionImpl0;
            }
            FragmentTransitionImpl fragmentTransitionImpl1 = FragmentTransition.b;
            if(fragmentTransitionImpl1 == null || !fragmentTransitionImpl1.e(object0)) {
                throw new IllegalArgumentException("Transition " + object0 + " for fragment " + this.b().f() + " is not a valid framework Transition or AndroidX Transition");
            }
            return fragmentTransitionImpl1;
        }

        @Nullable
        public Object g() {
            return this.e;
        }

        @Nullable
        Object h() {
            return this.c;
        }

        public boolean i() {
            return this.e != null;
        }

        boolean j() {
            return this.d;
        }
    }

    DefaultSpecialEffectsController(@NonNull ViewGroup viewGroup0) {
        super(viewGroup0);
    }

    @Override  // androidx.fragment.app.SpecialEffectsController
    void f(@NonNull List list0, boolean z) {
        Operation specialEffectsController$Operation0 = null;
        Operation specialEffectsController$Operation1 = null;
        for(Object object0: list0) {
            Operation specialEffectsController$Operation2 = (Operation)object0;
            State specialEffectsController$Operation$State0 = State.c(specialEffectsController$Operation2.f().mView);
            int v = androidx.fragment.app.DefaultSpecialEffectsController.10.a[specialEffectsController$Operation2.e().ordinal()];
            if(v != 1 && v != 2 && v != 3) {
                if(v != 4 || specialEffectsController$Operation$State0 == State.b) {
                    continue;
                }
                specialEffectsController$Operation1 = specialEffectsController$Operation2;
            }
            else if(specialEffectsController$Operation$State0 == State.b && specialEffectsController$Operation0 == null) {
                specialEffectsController$Operation0 = specialEffectsController$Operation2;
            }
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Executing operations from " + specialEffectsController$Operation0 + " to " + specialEffectsController$Operation1);
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list0);
        this.y(list0);
        for(Object object1: list0) {
            Operation specialEffectsController$Operation3 = (Operation)object1;
            CancellationSignal cancellationSignal0 = new CancellationSignal();
            specialEffectsController$Operation3.j(cancellationSignal0);
            arrayList0.add(new AnimationInfo(specialEffectsController$Operation3, cancellationSignal0, z));
            CancellationSignal cancellationSignal1 = new CancellationSignal();
            specialEffectsController$Operation3.j(cancellationSignal1);
            boolean z1 = false;
            if(!z) {
                if(specialEffectsController$Operation3 == specialEffectsController$Operation1) {
                    z1 = true;
                }
            }
            else if(specialEffectsController$Operation3 == specialEffectsController$Operation0) {
                z1 = true;
            }
            arrayList1.add(new TransitionInfo(specialEffectsController$Operation3, cancellationSignal1, z, z1));
            specialEffectsController$Operation3.a(new Runnable() {
                final DefaultSpecialEffectsController c;

                @Override
                public void run() {
                    if(arrayList2.contains(specialEffectsController$Operation3)) {
                        arrayList2.remove(specialEffectsController$Operation3);
                        DefaultSpecialEffectsController.this.s(specialEffectsController$Operation3);
                    }
                }
            });
        }
        Map map0 = this.x(arrayList1, arrayList2, z, specialEffectsController$Operation0, specialEffectsController$Operation1);
        this.w(arrayList0, arrayList2, map0.containsValue(Boolean.TRUE), map0);
        for(Object object2: arrayList2) {
            this.s(((Operation)object2));
        }
        arrayList2.clear();
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + specialEffectsController$Operation0 + " to " + specialEffectsController$Operation1);
        }
    }

    void s(@NonNull Operation specialEffectsController$Operation0) {
        specialEffectsController$Operation0.e().a(specialEffectsController$Operation0.f().mView);
    }

    void t(ArrayList arrayList0, View view0) {
        if(view0 instanceof ViewGroup) {
            if(!ViewGroupCompat.g(((ViewGroup)view0))) {
                int v = ((ViewGroup)view0).getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    View view1 = ((ViewGroup)view0).getChildAt(v1);
                    if(view1.getVisibility() == 0) {
                        this.t(arrayList0, view1);
                    }
                }
            }
            else if(!arrayList0.contains(view0)) {
                arrayList0.add(((ViewGroup)view0));
            }
        }
        else if(!arrayList0.contains(view0)) {
            arrayList0.add(view0);
        }
    }

    void u(Map map0, @NonNull View view0) {
        String s = ViewCompat.C0(view0);
        if(s != null) {
            map0.put(s, view0);
        }
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = ((ViewGroup)view0).getChildAt(v1);
                if(view1.getVisibility() == 0) {
                    this.u(map0, view1);
                }
            }
        }
    }

    void v(@NonNull ArrayMap arrayMap0, @NonNull Collection collection0) {
        Iterator iterator0 = arrayMap0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!collection0.contains(ViewCompat.C0(((View)((Map.Entry)object0).getValue())))) {
                iterator0.remove();
            }
        }
    }

    private void w(@NonNull List list0, @NonNull List list1, boolean z, @NonNull Map map0) {
        View view2;
        Operation specialEffectsController$Operation1;
        ViewGroup viewGroup0 = this.m();
        Context context0 = viewGroup0.getContext();
        ArrayList arrayList0 = new ArrayList();
        boolean z1 = false;
        for(Object object0: list0) {
            AnimationInfo defaultSpecialEffectsController$AnimationInfo0 = (AnimationInfo)object0;
            if(defaultSpecialEffectsController$AnimationInfo0.d()) {
                defaultSpecialEffectsController$AnimationInfo0.a();
            }
            else {
                AnimationOrAnimator fragmentAnim$AnimationOrAnimator0 = defaultSpecialEffectsController$AnimationInfo0.e(context0);
                if(fragmentAnim$AnimationOrAnimator0 == null) {
                    defaultSpecialEffectsController$AnimationInfo0.a();
                }
                else {
                    Animator animator0 = fragmentAnim$AnimationOrAnimator0.b;
                    if(animator0 == null) {
                        arrayList0.add(defaultSpecialEffectsController$AnimationInfo0);
                    }
                    else {
                        Operation specialEffectsController$Operation0 = defaultSpecialEffectsController$AnimationInfo0.b();
                        Fragment fragment0 = specialEffectsController$Operation0.f();
                        Object object1 = map0.get(specialEffectsController$Operation0);
                        if(Boolean.TRUE.equals(object1)) {
                            if(FragmentManager.W0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragment0 + " as this Fragment was involved in a Transition.");
                            }
                            defaultSpecialEffectsController$AnimationInfo0.a();
                        }
                        else {
                            boolean z2 = specialEffectsController$Operation0.e() == State.c;
                            if(z2) {
                                list1.remove(specialEffectsController$Operation0);
                            }
                            View view0 = fragment0.mView;
                            viewGroup0.startViewTransition(view0);
                            animator0.addListener(new AnimatorListenerAdapter() {
                                final DefaultSpecialEffectsController f;

                                @Override  // android.animation.AnimatorListenerAdapter
                                public void onAnimationEnd(Animator animator0) {
                                    viewGroup0.endViewTransition(view0);
                                    if(z2) {
                                        specialEffectsController$Operation0.e().a(view0);
                                    }
                                    defaultSpecialEffectsController$AnimationInfo0.a();
                                    if(FragmentManager.W0(2)) {
                                        Log.v("FragmentManager", "Animator from operation " + specialEffectsController$Operation0 + " has ended.");
                                    }
                                }
                            });
                            animator0.setTarget(view0);
                            animator0.start();
                            if(FragmentManager.W0(2)) {
                                specialEffectsController$Operation1 = specialEffectsController$Operation0;
                                Log.v("FragmentManager", "Animator from operation " + specialEffectsController$Operation1 + " has started.");
                            }
                            else {
                                specialEffectsController$Operation1 = specialEffectsController$Operation0;
                            }
                            defaultSpecialEffectsController$AnimationInfo0.c().d(new OnCancelListener() {
                                final DefaultSpecialEffectsController c;

                                @Override  // androidx.core.os.CancellationSignal$OnCancelListener
                                public void onCancel() {
                                    animator0.end();
                                    if(FragmentManager.W0(2)) {
                                        Log.v("FragmentManager", "Animator from operation " + specialEffectsController$Operation1 + " has been canceled.");
                                    }
                                }
                            });
                            z1 = true;
                        }
                    }
                }
            }
        }
        for(Object object2: arrayList0) {
            AnimationInfo defaultSpecialEffectsController$AnimationInfo1 = (AnimationInfo)object2;
            Operation specialEffectsController$Operation2 = defaultSpecialEffectsController$AnimationInfo1.b();
            Fragment fragment1 = specialEffectsController$Operation2.f();
            if(z) {
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment1 + " as Animations cannot run alongside Transitions.");
                }
                defaultSpecialEffectsController$AnimationInfo1.a();
            }
            else if(z1) {
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment1 + " as Animations cannot run alongside Animators.");
                }
                defaultSpecialEffectsController$AnimationInfo1.a();
            }
            else {
                View view1 = fragment1.mView;
                Animation animation0 = (Animation)Preconditions.l(((AnimationOrAnimator)Preconditions.l(defaultSpecialEffectsController$AnimationInfo1.e(context0))).a);
                if(specialEffectsController$Operation2.e() == State.a) {
                    viewGroup0.startViewTransition(view1);
                    EndViewTransitionAnimation fragmentAnim$EndViewTransitionAnimation0 = new EndViewTransitionAnimation(animation0, viewGroup0, view1);
                    view2 = view1;
                    fragmentAnim$EndViewTransitionAnimation0.setAnimationListener(new Animation.AnimationListener() {
                        final DefaultSpecialEffectsController e;

                        @Override  // android.view.animation.Animation$AnimationListener
                        public void onAnimationEnd(Animation animation0) {
                            androidx.fragment.app.DefaultSpecialEffectsController.4.1 defaultSpecialEffectsController$4$10 = new Runnable() {
                                final androidx.fragment.app.DefaultSpecialEffectsController.4 a;

                                @Override
                                public void run() {
                                    androidx.fragment.app.DefaultSpecialEffectsController.4.this.b.endViewTransition(androidx.fragment.app.DefaultSpecialEffectsController.4.this.c);
                                    androidx.fragment.app.DefaultSpecialEffectsController.4.this.d.a();
                                }
                            };
                            viewGroup0.post(defaultSpecialEffectsController$4$10);
                            if(FragmentManager.W0(2)) {
                                Log.v("FragmentManager", "Animation from operation " + specialEffectsController$Operation2 + " has ended.");
                            }
                        }

                        @Override  // android.view.animation.Animation$AnimationListener
                        public void onAnimationRepeat(Animation animation0) {
                        }

                        @Override  // android.view.animation.Animation$AnimationListener
                        public void onAnimationStart(Animation animation0) {
                            if(FragmentManager.W0(2)) {
                                Log.v("FragmentManager", "Animation from operation " + specialEffectsController$Operation2 + " has reached onAnimationStart.");
                            }
                        }
                    });
                    view2.startAnimation(fragmentAnim$EndViewTransitionAnimation0);
                    if(FragmentManager.W0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + specialEffectsController$Operation2 + " has started.");
                    }
                }
                else {
                    view1.startAnimation(animation0);
                    defaultSpecialEffectsController$AnimationInfo1.a();
                    view2 = view1;
                }
                defaultSpecialEffectsController$AnimationInfo1.c().d(new OnCancelListener() {
                    final DefaultSpecialEffectsController e;

                    @Override  // androidx.core.os.CancellationSignal$OnCancelListener
                    public void onCancel() {
                        view2.clearAnimation();
                        viewGroup0.endViewTransition(view2);
                        defaultSpecialEffectsController$AnimationInfo1.a();
                        if(FragmentManager.W0(2)) {
                            Log.v("FragmentManager", "Animation from operation " + specialEffectsController$Operation2 + " has been cancelled.");
                        }
                    }
                });
                z1 = false;
            }
        }
    }

    @NonNull
    private Map x(@NonNull List list0, @NonNull List list1, boolean z, @Nullable Operation specialEffectsController$Operation0, @Nullable Operation specialEffectsController$Operation1) {
        Operation specialEffectsController$Operation9;
        View view9;
        Operation specialEffectsController$Operation8;
        Object object13;
        Object object12;
        ArrayList arrayList14;
        ArrayList arrayList13;
        View view8;
        Operation specialEffectsController$Operation5;
        Rect rect1;
        View view4;
        FragmentTransitionImpl fragmentTransitionImpl2;
        ArrayList arrayList9;
        Operation specialEffectsController$Operation4;
        ArrayList arrayList8;
        ArrayMap arrayMap3;
        ArrayList arrayList7;
        ArrayList arrayList6;
        SharedElementCallback sharedElementCallback1;
        SharedElementCallback sharedElementCallback0;
        Operation specialEffectsController$Operation2 = specialEffectsController$Operation0;
        Operation specialEffectsController$Operation3 = specialEffectsController$Operation1;
        Map map0 = new HashMap();
        FragmentTransitionImpl fragmentTransitionImpl0 = null;
        for(Object object0: list0) {
            TransitionInfo defaultSpecialEffectsController$TransitionInfo0 = (TransitionInfo)object0;
            if(!defaultSpecialEffectsController$TransitionInfo0.d()) {
                FragmentTransitionImpl fragmentTransitionImpl1 = defaultSpecialEffectsController$TransitionInfo0.e();
                if(fragmentTransitionImpl0 == null) {
                    fragmentTransitionImpl0 = fragmentTransitionImpl1;
                }
                else {
                    if(fragmentTransitionImpl1 != null && fragmentTransitionImpl0 != fragmentTransitionImpl1) {
                        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + defaultSpecialEffectsController$TransitionInfo0.b().f() + " returned Transition " + defaultSpecialEffectsController$TransitionInfo0.h() + " which uses a different Transition  type than other Fragments.");
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        if(fragmentTransitionImpl0 == null) {
            for(Object object1: list0) {
                map0.put(((TransitionInfo)object1).b(), Boolean.FALSE);
                ((TransitionInfo)object1).a();
            }
            return map0;
        }
        View view0 = new View(this.m().getContext());
        Rect rect0 = new Rect();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayMap arrayMap0 = new ArrayMap();
        Object object2 = null;
        View view1 = null;
        boolean z1 = false;
        for(Object object3: list0) {
            TransitionInfo defaultSpecialEffectsController$TransitionInfo1 = (TransitionInfo)object3;
            if(!defaultSpecialEffectsController$TransitionInfo1.i() || specialEffectsController$Operation2 == null || specialEffectsController$Operation3 == null) {
                arrayMap3 = arrayMap0;
                specialEffectsController$Operation4 = specialEffectsController$Operation2;
                arrayList9 = arrayList0;
                view4 = view0;
                fragmentTransitionImpl2 = fragmentTransitionImpl0;
                arrayList8 = arrayList1;
                specialEffectsController$Operation5 = specialEffectsController$Operation3;
                rect1 = rect0;
            }
            else {
                Object object4 = fragmentTransitionImpl0.w(fragmentTransitionImpl0.f(defaultSpecialEffectsController$TransitionInfo1.g()));
                ArrayList arrayList2 = specialEffectsController$Operation1.f().getSharedElementSourceNames();
                ArrayList arrayList3 = specialEffectsController$Operation0.f().getSharedElementSourceNames();
                Object object5 = object4;
                ArrayList arrayList4 = specialEffectsController$Operation0.f().getSharedElementTargetNames();
                for(int v = 0; v < arrayList4.size(); ++v) {
                    int v1 = arrayList2.indexOf(arrayList4.get(v));
                    if(v1 != -1) {
                        arrayList2.set(v1, ((String)arrayList3.get(v)));
                    }
                }
                ArrayList arrayList5 = specialEffectsController$Operation1.f().getSharedElementTargetNames();
                if(z) {
                    sharedElementCallback0 = specialEffectsController$Operation0.f().getEnterTransitionCallback();
                    sharedElementCallback1 = specialEffectsController$Operation1.f().getExitTransitionCallback();
                }
                else {
                    sharedElementCallback0 = specialEffectsController$Operation0.f().getExitTransitionCallback();
                    sharedElementCallback1 = specialEffectsController$Operation1.f().getEnterTransitionCallback();
                }
                int v2 = arrayList2.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    arrayMap0.put(((String)arrayList2.get(v3)), ((String)arrayList5.get(v3)));
                }
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for(Object object6: arrayList5) {
                        Log.v("FragmentManager", "Name: " + ((String)object6));
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for(Object object7: arrayList2) {
                        Log.v("FragmentManager", "Name: " + ((String)object7));
                    }
                }
                ArrayMap arrayMap1 = new ArrayMap();
                this.u(arrayMap1, specialEffectsController$Operation0.f().mView);
                arrayMap1.r(arrayList2);
                if(sharedElementCallback0 == null) {
                    arrayList7 = arrayList2;
                    arrayMap0.r(arrayMap1.keySet());
                }
                else {
                    if(FragmentManager.W0(2)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + specialEffectsController$Operation2);
                    }
                    int v4 = arrayList2.size() - 1;
                    while(v4 >= 0) {
                        String s = (String)arrayList2.get(v4);
                        View view2 = (View)arrayMap1.get(s);
                        if(view2 == null) {
                            arrayMap0.remove(s);
                            arrayList6 = arrayList2;
                        }
                        else {
                            arrayList6 = arrayList2;
                            if(!s.equals(ViewCompat.C0(view2))) {
                                String s1 = (String)arrayMap0.remove(s);
                                arrayMap0.put(ViewCompat.C0(view2), s1);
                            }
                        }
                        --v4;
                        arrayList2 = arrayList6;
                    }
                    arrayList7 = arrayList2;
                }
                ArrayMap arrayMap2 = new ArrayMap();
                this.u(arrayMap2, specialEffectsController$Operation1.f().mView);
                arrayMap2.r(arrayList5);
                arrayMap2.r(arrayMap0.values());
                if(sharedElementCallback1 == null) {
                    FragmentTransition.d(arrayMap0, arrayMap2);
                }
                else {
                    if(FragmentManager.W0(2)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + specialEffectsController$Operation3);
                    }
                    for(int v5 = arrayList5.size() - 1; v5 >= 0; --v5) {
                        String s2 = (String)arrayList5.get(v5);
                        View view3 = (View)arrayMap2.get(s2);
                        if(view3 == null) {
                            String s3 = FragmentTransition.b(arrayMap0, s2);
                            if(s3 != null) {
                                arrayMap0.remove(s3);
                            }
                        }
                        else if(!s2.equals(ViewCompat.C0(view3))) {
                            String s4 = FragmentTransition.b(arrayMap0, s2);
                            if(s4 != null) {
                                arrayMap0.put(s4, ViewCompat.C0(view3));
                            }
                        }
                    }
                }
                this.v(arrayMap1, arrayMap0.keySet());
                this.v(arrayMap2, arrayMap0.values());
                if(arrayMap0.isEmpty()) {
                    arrayList0.clear();
                    arrayList1.clear();
                    arrayMap3 = arrayMap0;
                    arrayList8 = arrayList1;
                    specialEffectsController$Operation4 = specialEffectsController$Operation2;
                    arrayList9 = arrayList0;
                    fragmentTransitionImpl2 = fragmentTransitionImpl0;
                    view4 = view0;
                    rect1 = rect0;
                    object2 = null;
                    specialEffectsController$Operation5 = specialEffectsController$Operation3;
                }
                else {
                    FragmentTransition.a(specialEffectsController$Operation1.f(), specialEffectsController$Operation0.f(), z, arrayMap1, true);
                    arrayMap3 = arrayMap0;
                    OneShotPreDrawListener.a(this.m(), new Runnable() {
                        final DefaultSpecialEffectsController e;

                        @Override
                        public void run() {
                            FragmentTransition.a(specialEffectsController$Operation1.f(), specialEffectsController$Operation0.f(), z, arrayMap2, false);
                        }
                    });
                    arrayList0.addAll(arrayMap1.values());
                    if(!arrayList7.isEmpty()) {
                        view1 = (View)arrayMap1.get(((String)arrayList7.get(0)));
                        fragmentTransitionImpl0.r(object5, view1);
                    }
                    arrayList1.addAll(arrayMap2.values());
                    if(arrayList5.isEmpty()) {
                        rect1 = rect0;
                        view4 = view0;
                    }
                    else {
                        View view5 = (View)arrayMap2.get(((String)arrayList5.get(0)));
                        if(view5 != null) {
                            rect1 = rect0;
                            OneShotPreDrawListener.a(this.m(), new Runnable() {
                                final DefaultSpecialEffectsController d;

                                @Override
                                public void run() {
                                    fragmentTransitionImpl0.h(view5, rect1);
                                }
                            });
                            view4 = view0;
                            z1 = true;
                        }
                    }
                    fragmentTransitionImpl0.u(object5, view4, arrayList0);
                    arrayList9 = arrayList0;
                    fragmentTransitionImpl2 = fragmentTransitionImpl0;
                    fragmentTransitionImpl0.p(object5, null, null, null, null, object5, arrayList1);
                    specialEffectsController$Operation4 = specialEffectsController$Operation0;
                    arrayList8 = arrayList1;
                    map0.put(specialEffectsController$Operation4, Boolean.TRUE);
                    specialEffectsController$Operation5 = specialEffectsController$Operation1;
                    map0.put(specialEffectsController$Operation5, Boolean.TRUE);
                    object2 = object5;
                }
            }
            view0 = view4;
            rect0 = rect1;
            arrayList0 = arrayList9;
            arrayList1 = arrayList8;
            specialEffectsController$Operation3 = specialEffectsController$Operation5;
            fragmentTransitionImpl0 = fragmentTransitionImpl2;
            specialEffectsController$Operation2 = specialEffectsController$Operation4;
            arrayMap0 = arrayMap3;
        }
        View view6 = view1;
        ArrayList arrayList10 = arrayList0;
        View view7 = view0;
        ArrayList arrayList11 = arrayList1;
        Operation specialEffectsController$Operation6 = specialEffectsController$Operation3;
        ArrayList arrayList12 = new ArrayList();
        Object object8 = null;
        Object object9 = null;
        for(Object object10: list0) {
            TransitionInfo defaultSpecialEffectsController$TransitionInfo2 = (TransitionInfo)object10;
            if(defaultSpecialEffectsController$TransitionInfo2.d()) {
                map0.put(defaultSpecialEffectsController$TransitionInfo2.b(), Boolean.FALSE);
                defaultSpecialEffectsController$TransitionInfo2.a();
            }
            else {
                Object object11 = fragmentTransitionImpl0.f(defaultSpecialEffectsController$TransitionInfo2.h());
                Operation specialEffectsController$Operation7 = defaultSpecialEffectsController$TransitionInfo2.b();
                boolean z2 = object2 != null && (specialEffectsController$Operation7 == specialEffectsController$Operation2 || specialEffectsController$Operation7 == specialEffectsController$Operation6);
                if(object11 == null) {
                    if(!z2) {
                        map0.put(specialEffectsController$Operation7, Boolean.FALSE);
                        defaultSpecialEffectsController$TransitionInfo2.a();
                    }
                    view8 = view7;
                    arrayList13 = arrayList10;
                    arrayList14 = arrayList11;
                    object12 = object8;
                    object13 = object9;
                    specialEffectsController$Operation8 = specialEffectsController$Operation6;
                    view9 = view6;
                }
                else {
                    ArrayList arrayList15 = new ArrayList();
                    this.t(arrayList15, specialEffectsController$Operation7.f().mView);
                    if(z2) {
                        if(specialEffectsController$Operation7 == specialEffectsController$Operation2) {
                            arrayList15.removeAll(arrayList10);
                        }
                        else {
                            arrayList15.removeAll(arrayList11);
                        }
                    }
                    if(arrayList15.isEmpty()) {
                        fragmentTransitionImpl0.a(object11, view7);
                        view8 = view7;
                        arrayList13 = arrayList10;
                        arrayList14 = arrayList11;
                        object13 = object9;
                        specialEffectsController$Operation9 = specialEffectsController$Operation7;
                        specialEffectsController$Operation8 = specialEffectsController$Operation6;
                        object12 = object8;
                    }
                    else {
                        fragmentTransitionImpl0.b(object11, arrayList15);
                        view8 = view7;
                        object12 = object8;
                        arrayList13 = arrayList10;
                        object13 = object9;
                        arrayList14 = arrayList11;
                        specialEffectsController$Operation8 = specialEffectsController$Operation6;
                        fragmentTransitionImpl0.p(object11, object11, arrayList15, null, null, null, null);
                        if(specialEffectsController$Operation7.e() == State.c) {
                            specialEffectsController$Operation9 = specialEffectsController$Operation7;
                            list1.remove(specialEffectsController$Operation9);
                            ArrayList arrayList16 = new ArrayList(arrayList15);
                            arrayList16.remove(specialEffectsController$Operation9.f().mView);
                            fragmentTransitionImpl0.o(object11, specialEffectsController$Operation9.f().mView, arrayList16);
                            OneShotPreDrawListener.a(this.m(), new Runnable() {
                                final DefaultSpecialEffectsController b;

                                @Override
                                public void run() {
                                    FragmentTransition.e(arrayList15, 4);
                                }
                            });
                        }
                        else {
                            specialEffectsController$Operation9 = specialEffectsController$Operation7;
                        }
                    }
                    if(specialEffectsController$Operation9.e() == State.b) {
                        arrayList12.addAll(arrayList15);
                        if(z1) {
                            fragmentTransitionImpl0.q(object11, rect0);
                        }
                        view9 = view6;
                    }
                    else {
                        view9 = view6;
                        fragmentTransitionImpl0.r(object11, view9);
                    }
                    map0.put(specialEffectsController$Operation9, Boolean.TRUE);
                    if(defaultSpecialEffectsController$TransitionInfo2.j()) {
                        object13 = fragmentTransitionImpl0.k(object13, object11, null);
                    }
                    else {
                        object12 = fragmentTransitionImpl0.k(object12, object11, null);
                    }
                }
                object8 = object12;
                view6 = view9;
                object9 = object13;
                specialEffectsController$Operation6 = specialEffectsController$Operation8;
                view7 = view8;
                arrayList10 = arrayList13;
                arrayList11 = arrayList14;
            }
        }
        Object object14 = fragmentTransitionImpl0.j(object9, object8, object2);
        if(object14 == null) {
            return map0;
        }
        for(Object object15: list0) {
            TransitionInfo defaultSpecialEffectsController$TransitionInfo3 = (TransitionInfo)object15;
            if(!defaultSpecialEffectsController$TransitionInfo3.d()) {
                Operation specialEffectsController$Operation10 = defaultSpecialEffectsController$TransitionInfo3.b();
                if(defaultSpecialEffectsController$TransitionInfo3.h() == null && (object2 == null || specialEffectsController$Operation10 != specialEffectsController$Operation2 && specialEffectsController$Operation10 != specialEffectsController$Operation6)) {
                }
                else if(ViewCompat.a1(this.m())) {
                    fragmentTransitionImpl0.s(defaultSpecialEffectsController$TransitionInfo3.b().f(), object14, defaultSpecialEffectsController$TransitionInfo3.c(), new Runnable() {
                        final DefaultSpecialEffectsController c;

                        @Override
                        public void run() {
                            defaultSpecialEffectsController$TransitionInfo3.a();
                            if(FragmentManager.W0(2)) {
                                Log.v("FragmentManager", "Transition for operation " + specialEffectsController$Operation10 + "has completed");
                            }
                        }
                    });
                }
                else {
                    if(FragmentManager.W0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + this.m() + " has not been laid out. Completing operation " + specialEffectsController$Operation10);
                    }
                    defaultSpecialEffectsController$TransitionInfo3.a();
                }
            }
        }
        if(!ViewCompat.a1(this.m())) {
            return map0;
        }
        FragmentTransition.e(arrayList12, 4);
        ArrayList arrayList17 = fragmentTransitionImpl0.l(arrayList11);
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            for(Object object16: arrayList10) {
                Log.v("FragmentManager", "View: " + ((View)object16) + " Name: " + ViewCompat.C0(((View)object16)));
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            for(Object object17: arrayList11) {
                Log.v("FragmentManager", "View: " + ((View)object17) + " Name: " + ViewCompat.C0(((View)object17)));
            }
        }
        fragmentTransitionImpl0.c(this.m(), object14);
        fragmentTransitionImpl0.t(this.m(), arrayList10, arrayList11, arrayList17, arrayMap0);
        FragmentTransition.e(arrayList12, 0);
        fragmentTransitionImpl0.v(object2, arrayList10, arrayList11);
        return map0;
    }

    private void y(@NonNull List list0) {
        Fragment fragment0 = ((Operation)list0.get(list0.size() - 1)).f();
        for(Object object0: list0) {
            ((Operation)object0).f().mAnimationInfo.c = fragment0.mAnimationInfo.c;
            ((Operation)object0).f().mAnimationInfo.d = fragment0.mAnimationInfo.d;
            ((Operation)object0).f().mAnimationInfo.e = fragment0.mAnimationInfo.e;
            ((Operation)object0).f().mAnimationInfo.f = fragment0.mAnimationInfo.f;
        }
    }
}

