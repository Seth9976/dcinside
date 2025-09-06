package com.unity3d.ads.core.domain;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface LifecycleEvent {
    public static final class Created implements LifecycleEvent {
        @l
        private final WeakReference activity;
        @m
        private final Bundle bundle;

        public Created(@l WeakReference weakReference0, @m Bundle bundle0) {
            L.p(weakReference0, "activity");
            super();
            this.activity = weakReference0;
            this.bundle = bundle0;
        }

        @l
        public final WeakReference component1() {
            return this.getActivity();
        }

        @m
        public final Bundle component2() {
            return this.bundle;
        }

        @l
        public final Created copy(@l WeakReference weakReference0, @m Bundle bundle0) {
            L.p(weakReference0, "activity");
            return new Created(weakReference0, bundle0);
        }

        public static Created copy$default(Created lifecycleEvent$Created0, WeakReference weakReference0, Bundle bundle0, int v, Object object0) {
            if((v & 1) != 0) {
                weakReference0 = lifecycleEvent$Created0.getActivity();
            }
            if((v & 2) != 0) {
                bundle0 = lifecycleEvent$Created0.bundle;
            }
            return lifecycleEvent$Created0.copy(weakReference0, bundle0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Created)) {
                return false;
            }
            return L.g(this.getActivity(), ((Created)object0).getActivity()) ? L.g(this.bundle, ((Created)object0).bundle) : false;
        }

        @Override  // com.unity3d.ads.core.domain.LifecycleEvent
        @l
        public WeakReference getActivity() {
            return this.activity;
        }

        @m
        public final Bundle getBundle() {
            return this.bundle;
        }

        @Override
        public int hashCode() {
            int v = this.getActivity().hashCode();
            return this.bundle == null ? v * 0x1F : v * 0x1F + this.bundle.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Created(activity=" + this.getActivity() + ", bundle=" + this.bundle + ')';
        }
    }

    public static final class Destroyed implements LifecycleEvent {
        @l
        private final WeakReference activity;

        public Destroyed(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            super();
            this.activity = weakReference0;
        }

        @l
        public final WeakReference component1() {
            return this.getActivity();
        }

        @l
        public final Destroyed copy(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            return new Destroyed(weakReference0);
        }

        public static Destroyed copy$default(Destroyed lifecycleEvent$Destroyed0, WeakReference weakReference0, int v, Object object0) {
            if((v & 1) != 0) {
                weakReference0 = lifecycleEvent$Destroyed0.getActivity();
            }
            return lifecycleEvent$Destroyed0.copy(weakReference0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Destroyed ? L.g(this.getActivity(), ((Destroyed)object0).getActivity()) : false;
        }

        @Override  // com.unity3d.ads.core.domain.LifecycleEvent
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
            return "Destroyed(activity=" + this.getActivity() + ')';
        }
    }

    public static final class Paused implements LifecycleEvent {
        @l
        private final WeakReference activity;

        public Paused(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            super();
            this.activity = weakReference0;
        }

        @l
        public final WeakReference component1() {
            return this.getActivity();
        }

        @l
        public final Paused copy(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            return new Paused(weakReference0);
        }

        public static Paused copy$default(Paused lifecycleEvent$Paused0, WeakReference weakReference0, int v, Object object0) {
            if((v & 1) != 0) {
                weakReference0 = lifecycleEvent$Paused0.getActivity();
            }
            return lifecycleEvent$Paused0.copy(weakReference0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Paused ? L.g(this.getActivity(), ((Paused)object0).getActivity()) : false;
        }

        @Override  // com.unity3d.ads.core.domain.LifecycleEvent
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
            return "Paused(activity=" + this.getActivity() + ')';
        }
    }

    public static final class Resumed implements LifecycleEvent {
        @l
        private final WeakReference activity;

        public Resumed(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            super();
            this.activity = weakReference0;
        }

        @l
        public final WeakReference component1() {
            return this.getActivity();
        }

        @l
        public final Resumed copy(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            return new Resumed(weakReference0);
        }

        public static Resumed copy$default(Resumed lifecycleEvent$Resumed0, WeakReference weakReference0, int v, Object object0) {
            if((v & 1) != 0) {
                weakReference0 = lifecycleEvent$Resumed0.getActivity();
            }
            return lifecycleEvent$Resumed0.copy(weakReference0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Resumed ? L.g(this.getActivity(), ((Resumed)object0).getActivity()) : false;
        }

        @Override  // com.unity3d.ads.core.domain.LifecycleEvent
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
            return "Resumed(activity=" + this.getActivity() + ')';
        }
    }

    public static final class SaveInstanceState implements LifecycleEvent {
        @l
        private final WeakReference activity;
        @m
        private final Bundle bundle;

        public SaveInstanceState(@l WeakReference weakReference0, @m Bundle bundle0) {
            L.p(weakReference0, "activity");
            super();
            this.activity = weakReference0;
            this.bundle = bundle0;
        }

        @l
        public final WeakReference component1() {
            return this.getActivity();
        }

        @m
        public final Bundle component2() {
            return this.bundle;
        }

        @l
        public final SaveInstanceState copy(@l WeakReference weakReference0, @m Bundle bundle0) {
            L.p(weakReference0, "activity");
            return new SaveInstanceState(weakReference0, bundle0);
        }

        public static SaveInstanceState copy$default(SaveInstanceState lifecycleEvent$SaveInstanceState0, WeakReference weakReference0, Bundle bundle0, int v, Object object0) {
            if((v & 1) != 0) {
                weakReference0 = lifecycleEvent$SaveInstanceState0.getActivity();
            }
            if((v & 2) != 0) {
                bundle0 = lifecycleEvent$SaveInstanceState0.bundle;
            }
            return lifecycleEvent$SaveInstanceState0.copy(weakReference0, bundle0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SaveInstanceState)) {
                return false;
            }
            return L.g(this.getActivity(), ((SaveInstanceState)object0).getActivity()) ? L.g(this.bundle, ((SaveInstanceState)object0).bundle) : false;
        }

        @Override  // com.unity3d.ads.core.domain.LifecycleEvent
        @l
        public WeakReference getActivity() {
            return this.activity;
        }

        @m
        public final Bundle getBundle() {
            return this.bundle;
        }

        @Override
        public int hashCode() {
            int v = this.getActivity().hashCode();
            return this.bundle == null ? v * 0x1F : v * 0x1F + this.bundle.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "SaveInstanceState(activity=" + this.getActivity() + ", bundle=" + this.bundle + ')';
        }
    }

    public static final class Started implements LifecycleEvent {
        @l
        private final WeakReference activity;

        public Started(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            super();
            this.activity = weakReference0;
        }

        @l
        public final WeakReference component1() {
            return this.getActivity();
        }

        @l
        public final Started copy(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            return new Started(weakReference0);
        }

        public static Started copy$default(Started lifecycleEvent$Started0, WeakReference weakReference0, int v, Object object0) {
            if((v & 1) != 0) {
                weakReference0 = lifecycleEvent$Started0.getActivity();
            }
            return lifecycleEvent$Started0.copy(weakReference0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Started ? L.g(this.getActivity(), ((Started)object0).getActivity()) : false;
        }

        @Override  // com.unity3d.ads.core.domain.LifecycleEvent
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
            return "Started(activity=" + this.getActivity() + ')';
        }
    }

    public static final class Stopped implements LifecycleEvent {
        @l
        private final WeakReference activity;

        public Stopped(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            super();
            this.activity = weakReference0;
        }

        @l
        public final WeakReference component1() {
            return this.getActivity();
        }

        @l
        public final Stopped copy(@l WeakReference weakReference0) {
            L.p(weakReference0, "activity");
            return new Stopped(weakReference0);
        }

        public static Stopped copy$default(Stopped lifecycleEvent$Stopped0, WeakReference weakReference0, int v, Object object0) {
            if((v & 1) != 0) {
                weakReference0 = lifecycleEvent$Stopped0.getActivity();
            }
            return lifecycleEvent$Stopped0.copy(weakReference0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Stopped ? L.g(this.getActivity(), ((Stopped)object0).getActivity()) : false;
        }

        @Override  // com.unity3d.ads.core.domain.LifecycleEvent
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
            return "Stopped(activity=" + this.getActivity() + ')';
        }
    }

    @l
    WeakReference getActivity();
}

