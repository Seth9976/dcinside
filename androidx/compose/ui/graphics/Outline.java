package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class Outline {
    public static final class Generic extends Outline {
        @l
        private final Path a;

        public Generic(@l Path path0) {
            L.p(path0, "path");
            super(null);
            this.a = path0;
        }

        @Override  // androidx.compose.ui.graphics.Outline
        @l
        public Rect a() {
            return this.a.getBounds();
        }

        @l
        public final Path b() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Generic ? L.g(this.a, ((Generic)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    @Immutable
    public static final class Rectangle extends Outline {
        @l
        private final Rect a;

        public Rectangle(@l Rect rect0) {
            L.p(rect0, "rect");
            super(null);
            this.a = rect0;
        }

        @Override  // androidx.compose.ui.graphics.Outline
        @l
        public Rect a() {
            return this.a;
        }

        @l
        public final Rect b() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Rectangle ? L.g(this.a, ((Rectangle)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    @Immutable
    @s0({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
    public static final class Rounded extends Outline {
        @l
        private final RoundRect a;
        @m
        private final Path b;

        public Rounded(@l RoundRect roundRect0) {
            L.p(roundRect0, "roundRect");
            Path path0 = null;
            super(null);
            this.a = roundRect0;
            if(!OutlineKt.i(roundRect0)) {
                path0 = AndroidPath_androidKt.a();
                path0.j(roundRect0);
            }
            this.b = path0;
        }

        @Override  // androidx.compose.ui.graphics.Outline
        @l
        public Rect a() {
            return RoundRectKt.g(this.a);
        }

        @l
        public final RoundRect b() {
            return this.a;
        }

        @m
        public final Path c() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Rounded ? L.g(this.a, ((Rounded)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    private Outline() {
    }

    public Outline(w w0) {
    }

    @l
    public abstract Rect a();
}

