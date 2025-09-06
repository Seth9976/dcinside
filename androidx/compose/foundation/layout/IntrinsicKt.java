package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.J;
import kotlin.jvm.internal.L;
import y4.l;

public final class IntrinsicKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[IntrinsicSize.values().length];
            try {
                arr_v[IntrinsicSize.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[IntrinsicSize.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, @l IntrinsicSize intrinsicSize0) {
        L.p(modifier0, "<this>");
        L.p(intrinsicSize0, "intrinsicSize");
        switch(WhenMappings.a[intrinsicSize0.ordinal()]) {
            case 1: {
                return modifier0.r0(MinIntrinsicHeightModifier.a);
            }
            case 2: {
                return modifier0.r0(MaxIntrinsicHeightModifier.a);
            }
            default: {
                throw new J();
            }
        }
    }

    @Stable
    @l
    public static final Modifier b(@l Modifier modifier0, @l IntrinsicSize intrinsicSize0) {
        L.p(modifier0, "<this>");
        L.p(intrinsicSize0, "intrinsicSize");
        switch(WhenMappings.a[intrinsicSize0.ordinal()]) {
            case 1: {
                return modifier0.r0(RequiredMinIntrinsicHeightModifier.a);
            }
            case 2: {
                return modifier0.r0(RequiredMaxIntrinsicHeightModifier.a);
            }
            default: {
                throw new J();
            }
        }
    }

    @Stable
    @l
    public static final Modifier c(@l Modifier modifier0, @l IntrinsicSize intrinsicSize0) {
        L.p(modifier0, "<this>");
        L.p(intrinsicSize0, "intrinsicSize");
        switch(WhenMappings.a[intrinsicSize0.ordinal()]) {
            case 1: {
                return modifier0.r0(RequiredMinIntrinsicWidthModifier.a);
            }
            case 2: {
                return modifier0.r0(RequiredMaxIntrinsicWidthModifier.a);
            }
            default: {
                throw new J();
            }
        }
    }

    @Stable
    @l
    public static final Modifier d(@l Modifier modifier0, @l IntrinsicSize intrinsicSize0) {
        L.p(modifier0, "<this>");
        L.p(intrinsicSize0, "intrinsicSize");
        switch(intrinsicSize0) {
            case 1: {
                return modifier0.r0(MinIntrinsicWidthModifier.a);
            }
            case 2: {
                return modifier0.r0(MaxIntrinsicWidthModifier.a);
            }
            default: {
                throw new J();
            }
        }
    }
}

