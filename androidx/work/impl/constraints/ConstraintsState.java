package androidx.work.impl.constraints;

import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class ConstraintsState {
    public static final class ConstraintsMet extends ConstraintsState {
        @l
        public static final ConstraintsMet a;

        static {
            ConstraintsMet.a = new ConstraintsMet();
        }

        private ConstraintsMet() {
            super(null);
        }
    }

    public static final class ConstraintsNotMet extends ConstraintsState {
        private final int a;

        public ConstraintsNotMet(int v) {
            super(null);
            this.a = v;
        }

        public final int a() {
            return this.a;
        }

        @l
        public final ConstraintsNotMet b(int v) {
            return new ConstraintsNotMet(v);
        }

        public static ConstraintsNotMet c(ConstraintsNotMet constraintsState$ConstraintsNotMet0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = constraintsState$ConstraintsNotMet0.a;
            }
            return constraintsState$ConstraintsNotMet0.b(v);
        }

        public final int d() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ConstraintsNotMet ? this.a == ((ConstraintsNotMet)object0).a : false;
        }

        @Override
        public int hashCode() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return "ConstraintsNotMet(reason=" + this.a + ')';
        }
    }

    private ConstraintsState() {
    }

    public ConstraintsState(w w0) {
    }
}

