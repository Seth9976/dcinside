package androidx.transition;

import android.annotation.SuppressLint;
import androidx.annotation.StyleableRes;

@SuppressLint({"InlinedApi"})
class Styleable {
    interface ArcMotion {
        @StyleableRes
        public static final int a = 0;
        @StyleableRes
        public static final int b = 1;
        @StyleableRes
        public static final int c = 2;

    }

    interface ChangeBounds {
        @StyleableRes
        public static final int a;

    }

    interface ChangeTransform {
        @StyleableRes
        public static final int a = 0;
        @StyleableRes
        public static final int b = 1;

    }

    interface Fade {
        @StyleableRes
        public static final int a;

    }

    interface PatternPathMotion {
        @StyleableRes
        public static final int a;

    }

    interface Slide {
        @StyleableRes
        public static final int a;

    }

    interface Transition {
        @StyleableRes
        public static final int a = 0;
        @StyleableRes
        public static final int b = 1;
        @StyleableRes
        public static final int c = 2;
        @StyleableRes
        public static final int d = 3;

    }

    interface TransitionManager {
        @StyleableRes
        public static final int a = 0;
        @StyleableRes
        public static final int b = 1;
        @StyleableRes
        public static final int c = 2;

    }

    interface TransitionSet {
        @StyleableRes
        public static final int a;

    }

    interface TransitionTarget {
        @StyleableRes
        public static final int a = 0;
        @StyleableRes
        public static final int b = 1;
        @StyleableRes
        public static final int c = 2;
        @StyleableRes
        public static final int d = 3;
        @StyleableRes
        public static final int e = 4;
        @StyleableRes
        public static final int f = 5;

    }

    interface VisibilityTransition {
        @StyleableRes
        public static final int a;

    }

    @StyleableRes
    static final int[] a;
    @StyleableRes
    static final int[] b;
    @StyleableRes
    static final int[] c;
    @StyleableRes
    static final int[] d;
    @StyleableRes
    static final int[] e;
    @StyleableRes
    static final int[] f;
    @StyleableRes
    static final int[] g;
    @StyleableRes
    static final int[] h;
    @StyleableRes
    static final int[] i;
    @StyleableRes
    static final int[] j;
    @StyleableRes
    static final int[] k;

    static {
        Styleable.a = new int[]{0x101002F, 0x10103DC, 0x1010441, 0x1010442, 0x101044D, 0x101044E};
        Styleable.b = new int[]{0x10103DD, 0x10103DE, 0x10103DF};
        Styleable.c = new int[]{0x1010141, 0x1010198, 0x10103E2, 0x101044F};
        Styleable.d = new int[]{0x10104CF};
        Styleable.e = new int[]{0x101047C};
        Styleable.f = new int[]{0x10103E1};
        Styleable.g = new int[]{0x10104BC, 0x10104BD};
        Styleable.h = new int[]{0x1010430};
        Styleable.i = new int[]{0x10103E0};
        Styleable.j = new int[]{0x101047D, 0x101047E, 0x101047F};
        Styleable.k = new int[]{0x10104CA};
    }
}

