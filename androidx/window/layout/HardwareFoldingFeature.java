package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class HardwareFoldingFeature implements FoldingFeature {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final void a(@l Bounds bounds0) {
            L.p(bounds0, "bounds");
            if(bounds0.f() == 0 && bounds0.b() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if(bounds0.c() != 0 && bounds0.e() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }
    }

    public static final class Type {
        public static final class androidx.window.layout.HardwareFoldingFeature.Type.Companion {
            private androidx.window.layout.HardwareFoldingFeature.Type.Companion() {
            }

            public androidx.window.layout.HardwareFoldingFeature.Type.Companion(w w0) {
            }

            @l
            public final Type a() {
                return Type.c;
            }

            @l
            public final Type b() {
                return Type.d;
            }
        }

        @l
        private final String a;
        @l
        public static final androidx.window.layout.HardwareFoldingFeature.Type.Companion b;
        @l
        private static final Type c;
        @l
        private static final Type d;

        static {
            Type.b = new androidx.window.layout.HardwareFoldingFeature.Type.Companion(null);
            Type.c = new Type("FOLD");
            Type.d = new Type("HINGE");
        }

        private Type(String s) {
            this.a = s;
        }

        @Override
        @l
        public String toString() {
            return this.a;
        }
    }

    @l
    private final Bounds a;
    @l
    private final Type b;
    @l
    private final State c;
    @l
    public static final Companion d;

    static {
        HardwareFoldingFeature.d = new Companion(null);
    }

    public HardwareFoldingFeature(@l Bounds bounds0, @l Type hardwareFoldingFeature$Type0, @l State foldingFeature$State0) {
        L.p(bounds0, "featureBounds");
        L.p(hardwareFoldingFeature$Type0, "type");
        L.p(foldingFeature$State0, "state");
        super();
        this.a = bounds0;
        this.b = hardwareFoldingFeature$Type0;
        this.c = foldingFeature$State0;
        HardwareFoldingFeature.d.a(bounds0);
    }

    @Override  // androidx.window.layout.FoldingFeature
    public boolean a() {
        androidx.window.layout.HardwareFoldingFeature.Type.Companion hardwareFoldingFeature$Type$Companion0 = Type.b;
        Type hardwareFoldingFeature$Type0 = hardwareFoldingFeature$Type$Companion0.b();
        if(!L.g(this.b, hardwareFoldingFeature$Type0)) {
            Type hardwareFoldingFeature$Type1 = hardwareFoldingFeature$Type$Companion0.a();
            return L.g(this.b, hardwareFoldingFeature$Type1) && L.g(this.getState(), State.d);
        }
        return true;
    }

    @Override  // androidx.window.layout.FoldingFeature
    @l
    public OcclusionType b() {
        return this.a.f() == 0 || this.a.b() == 0 ? OcclusionType.c : OcclusionType.d;
    }

    @l
    public final Type c() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(HardwareFoldingFeature.class, class0)) {
            return false;
        }
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        if(!L.g(this.a, ((HardwareFoldingFeature)object0).a)) {
            return false;
        }
        return L.g(this.b, ((HardwareFoldingFeature)object0).b) ? L.g(this.getState(), ((HardwareFoldingFeature)object0).getState()) : false;
    }

    @Override  // androidx.window.layout.DisplayFeature
    @l
    public Rect getBounds() {
        return this.a.i();
    }

    @Override  // androidx.window.layout.FoldingFeature
    @l
    public Orientation getOrientation() {
        return this.a.f() <= this.a.b() ? Orientation.c : Orientation.d;
    }

    @Override  // androidx.window.layout.FoldingFeature
    @l
    public State getState() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.getState().hashCode();
    }

    // 去混淆评级： 低(40)
    @Override
    @l
    public String toString() {
        return "HardwareFoldingFeature { " + this.a + ", type=" + this.b + ", state=" + this.getState() + " }";
    }
}

