package androidx.window.layout;

import kotlin.jvm.internal.w;
import y4.l;
import z3.f;

public interface FoldingFeature extends DisplayFeature {
    public static final class OcclusionType {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }
        }

        @l
        private final String a;
        @l
        public static final Companion b;
        @l
        @f
        public static final OcclusionType c;
        @l
        @f
        public static final OcclusionType d;

        static {
            OcclusionType.b = new Companion(null);
            OcclusionType.c = new OcclusionType("NONE");
            OcclusionType.d = new OcclusionType("FULL");
        }

        private OcclusionType(String s) {
            this.a = s;
        }

        @Override
        @l
        public String toString() {
            return this.a;
        }
    }

    public static final class Orientation {
        public static final class androidx.window.layout.FoldingFeature.Orientation.Companion {
            private androidx.window.layout.FoldingFeature.Orientation.Companion() {
            }

            public androidx.window.layout.FoldingFeature.Orientation.Companion(w w0) {
            }
        }

        @l
        private final String a;
        @l
        public static final androidx.window.layout.FoldingFeature.Orientation.Companion b;
        @l
        @f
        public static final Orientation c;
        @l
        @f
        public static final Orientation d;

        static {
            Orientation.b = new androidx.window.layout.FoldingFeature.Orientation.Companion(null);
            Orientation.c = new Orientation("VERTICAL");
            Orientation.d = new Orientation("HORIZONTAL");
        }

        private Orientation(String s) {
            this.a = s;
        }

        @Override
        @l
        public String toString() {
            return this.a;
        }
    }

    public static final class State {
        public static final class androidx.window.layout.FoldingFeature.State.Companion {
            private androidx.window.layout.FoldingFeature.State.Companion() {
            }

            public androidx.window.layout.FoldingFeature.State.Companion(w w0) {
            }
        }

        @l
        private final String a;
        @l
        public static final androidx.window.layout.FoldingFeature.State.Companion b;
        @l
        @f
        public static final State c;
        @l
        @f
        public static final State d;

        static {
            State.b = new androidx.window.layout.FoldingFeature.State.Companion(null);
            State.c = new State("FLAT");
            State.d = new State("HALF_OPENED");
        }

        private State(String s) {
            this.a = s;
        }

        @Override
        @l
        public String toString() {
            return this.a;
        }
    }

    boolean a();

    @l
    OcclusionType b();

    @l
    Orientation getOrientation();

    @l
    State getState();
}

