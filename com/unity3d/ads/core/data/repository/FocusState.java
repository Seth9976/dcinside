package com.unity3d.ads.core.data.repository;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface FocusState {
    public static final class Focused implements FocusState {
        @l
        private final WeakReference activity;

        public Focused(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            super();
            this.activity = weakReference0;
        }

        @l
        public final WeakReference component1() {
            return this.getActivity();
        }

        @l
        public final Focused copy(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            return new Focused(weakReference0);
        }

        public static Focused copy$default(Focused focusState$Focused0, WeakReference weakReference0, int v, Object object0) {
            if((v & 1) != 0) {
                weakReference0 = focusState$Focused0.getActivity();
            }
            return focusState$Focused0.copy(weakReference0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Focused ? L.g(this.getActivity(), ((Focused)object0).getActivity()) : false;
        }

        @Override  // com.unity3d.ads.core.data.repository.FocusState
        @l
        public WeakReference getActivity() {
            return this.activity;
        }

        @Override
        public int hashCode() {
            return this.getActivity().hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Focused(activity=" + this.getActivity() + ')';
        }
    }

    public static final class Unfocused implements FocusState {
        @l
        private final WeakReference activity;

        public Unfocused(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            super();
            this.activity = weakReference0;
        }

        @l
        public final WeakReference component1() {
            return this.getActivity();
        }

        @l
        public final Unfocused copy(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            return new Unfocused(weakReference0);
        }

        public static Unfocused copy$default(Unfocused focusState$Unfocused0, WeakReference weakReference0, int v, Object object0) {
            if((v & 1) != 0) {
                weakReference0 = focusState$Unfocused0.getActivity();
            }
            return focusState$Unfocused0.copy(weakReference0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Unfocused ? L.g(this.getActivity(), ((Unfocused)object0).getActivity()) : false;
        }

        @Override  // com.unity3d.ads.core.data.repository.FocusState
        @l
        public WeakReference getActivity() {
            return this.activity;
        }

        @Override
        public int hashCode() {
            return this.getActivity().hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Unfocused(activity=" + this.getActivity() + ')';
        }
    }

    @l
    WeakReference getActivity();
}

