package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import kotlin.r0;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n442#2:652\n392#2:653\n1238#3,4:654\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n496#1:652\n496#1:653\n496#1:654,4\n*E\n"})
public final class KeyframesSpec implements DurationBasedAnimationSpec {
    @StabilityInferred(parameters = 0)
    public static final class KeyframeEntity {
        private final Object a;
        @l
        private Easing b;
        public static final int c = 8;

        static {
        }

        public KeyframeEntity(Object object0, @l Easing easing0) {
            L.p(easing0, "easing");
            super();
            this.a = object0;
            this.b = easing0;
        }

        public KeyframeEntity(Object object0, Easing easing0, int v, w w0) {
            if((v & 2) != 0) {
                easing0 = EasingKt.c();
            }
            this(object0, easing0);
        }

        @l
        public final Easing a() {
            return this.b;
        }

        public final Object b() {
            return this.a;
        }

        public final void c(@l Easing easing0) {
            L.p(easing0, "<set-?>");
            this.b = easing0;
        }

        @l
        public final V d(@l Function1 function10) {
            L.p(function10, "convertToVector");
            return r0.a(function10.invoke(this.a), this.b);
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(@m Object object0) {
            return object0 instanceof KeyframeEntity && L.g(((KeyframeEntity)object0).a, this.a) && L.g(((KeyframeEntity)object0).b, this.b);
        }

        @Override
        public int hashCode() {
            return this.a == null ? this.b.hashCode() : this.a.hashCode() * 0x1F + this.b.hashCode();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class KeyframesSpecConfig {
        private int a;
        private int b;
        @l
        private final Map c;
        public static final int d = 8;

        static {
        }

        public KeyframesSpecConfig() {
            this.a = 300;
            this.c = new LinkedHashMap();
        }

        @l
        public final KeyframeEntity a(Object object0, int v) {
            KeyframeEntity keyframesSpec$KeyframeEntity0 = new KeyframeEntity(object0, null, 2, null);
            this.c.put(v, keyframesSpec$KeyframeEntity0);
            return keyframesSpec$KeyframeEntity0;
        }

        @l
        public final KeyframeEntity b(Object object0, float f) {
            return this.a(object0, b.L0(((float)this.a) * f));
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.a;
        }

        @l
        public final Map e() {
            return this.c;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@m Object object0) {
            return object0 instanceof KeyframesSpecConfig && this.b == ((KeyframesSpecConfig)object0).b && this.a == ((KeyframesSpecConfig)object0).a && L.g(this.c, ((KeyframesSpecConfig)object0).c);
        }

        public final void f(int v) {
            this.b = v;
        }

        public final void g(int v) {
            this.a = v;
        }

        public final void h(@l KeyframeEntity keyframesSpec$KeyframeEntity0, @l Easing easing0) {
            L.p(keyframesSpec$KeyframeEntity0, "<this>");
            L.p(easing0, "easing");
            keyframesSpec$KeyframeEntity0.c(easing0);
        }

        @Override
        public int hashCode() {
            return (this.a * 0x1F + this.b) * 0x1F + this.c.hashCode();
        }
    }

    @l
    private final KeyframesSpecConfig a;
    public static final int b;

    static {
    }

    public KeyframesSpec(@l KeyframesSpecConfig keyframesSpec$KeyframesSpecConfig0) {
        L.p(keyframesSpec$KeyframesSpecConfig0, "config");
        super();
        this.a = keyframesSpec$KeyframesSpecConfig0;
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.g(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.DurationBasedAnimationSpec
    public VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.g(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.FiniteAnimationSpec
    public VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.g(twoWayConverter0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof KeyframesSpec && L.g(this.a, ((KeyframesSpec)object0).a);
    }

    @l
    public final KeyframesSpecConfig f() {
        return this.a;
    }

    @l
    public VectorizedKeyframesSpec g(@l TwoWayConverter twoWayConverter0) {
        L.p(twoWayConverter0, "converter");
        Map map0 = this.a.e();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(Y.j(map0.size()));
        for(Object object0: map0.entrySet()) {
            linkedHashMap0.put(((Map.Entry)object0).getKey(), ((KeyframeEntity)((Map.Entry)object0).getValue()).d(twoWayConverter0.a()));
        }
        return new VectorizedKeyframesSpec(linkedHashMap0, this.a.d(), this.a.c());
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}

