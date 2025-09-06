package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class FocusStrategy {
    public interface BoundsAdapter {
        void a(Object arg1, Rect arg2);
    }

    public interface CollectionAdapter {
        Object a(Object arg1, int arg2);

        int b(Object arg1);
    }

    static class SequentialComparator implements Comparator {
        private final Rect a;
        private final Rect b;
        private final boolean c;
        private final BoundsAdapter d;

        SequentialComparator(boolean z, BoundsAdapter focusStrategy$BoundsAdapter0) {
            this.a = new Rect();
            this.b = new Rect();
            this.c = z;
            this.d = focusStrategy$BoundsAdapter0;
        }

        @Override
        public int compare(Object object0, Object object1) {
            Rect rect0 = this.a;
            Rect rect1 = this.b;
            this.d.a(object0, rect0);
            this.d.a(object1, rect1);
            int v = rect0.top;
            int v1 = rect1.top;
            if(v < v1) {
                return -1;
            }
            if(v > v1) {
                return 1;
            }
            int v2 = rect0.left;
            int v3 = rect1.left;
            if(v2 < v3) {
                return this.c ? 1 : -1;
            }
            if(v2 > v3) {
                return this.c ? -1 : 1;
            }
            int v4 = rect0.bottom;
            int v5 = rect1.bottom;
            if(v4 < v5) {
                return -1;
            }
            if(v4 > v5) {
                return 1;
            }
            int v6 = rect0.right;
            int v7 = rect1.right;
            if(v6 < v7) {
                return this.c ? 1 : -1;
            }
            if(v6 > v7) {
                return this.c ? -1 : 1;
            }
            return 0;
        }
    }

    private static boolean a(int v, @NonNull Rect rect0, @NonNull Rect rect1, @NonNull Rect rect2) {
        boolean z = FocusStrategy.b(v, rect0, rect1);
        if(!FocusStrategy.b(v, rect0, rect2) && z) {
            return FocusStrategy.j(v, rect0, rect2) ? v == 17 || v == 66 || FocusStrategy.k(v, rect0, rect1) < FocusStrategy.m(v, rect0, rect2) : true;
        }
        return false;
    }

    private static boolean b(int v, @NonNull Rect rect0, @NonNull Rect rect1) {
        switch(v) {
            case 17: 
            case 66: {
                return rect1.bottom >= rect0.top && rect1.top <= rect0.bottom;
            }
            case 33: 
            case 130: {
                return rect1.right >= rect0.left && rect1.left <= rect0.right;
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
    }

    public static Object c(@NonNull Object object0, @NonNull CollectionAdapter focusStrategy$CollectionAdapter0, @NonNull BoundsAdapter focusStrategy$BoundsAdapter0, @Nullable Object object1, @NonNull Rect rect0, int v) {
        Rect rect1 = new Rect(rect0);
        switch(v) {
            case 17: {
                rect1.offset(rect0.width() + 1, 0);
                break;
            }
            case 33: {
                rect1.offset(0, rect0.height() + 1);
                break;
            }
            case 66: {
                rect1.offset(-(rect0.width() + 1), 0);
                break;
            }
            case 130: {
                rect1.offset(0, -(rect0.height() + 1));
                break;
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
        int v2 = focusStrategy$CollectionAdapter0.b(object0);
        Rect rect2 = new Rect();
        Object object2 = null;
        for(int v1 = 0; v1 < v2; ++v1) {
            Object object3 = focusStrategy$CollectionAdapter0.a(object0, v1);
            if(object3 != object1) {
                focusStrategy$BoundsAdapter0.a(object3, rect2);
                if(FocusStrategy.h(v, rect0, rect2, rect1)) {
                    rect1.set(rect2);
                    object2 = object3;
                }
            }
        }
        return object2;
    }

    public static Object d(@NonNull Object object0, @NonNull CollectionAdapter focusStrategy$CollectionAdapter0, @NonNull BoundsAdapter focusStrategy$BoundsAdapter0, @Nullable Object object1, int v, boolean z, boolean z1) {
        int v1 = focusStrategy$CollectionAdapter0.b(object0);
        ArrayList arrayList0 = new ArrayList(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            arrayList0.add(focusStrategy$CollectionAdapter0.a(object0, v2));
        }
        Collections.sort(arrayList0, new SequentialComparator(z, focusStrategy$BoundsAdapter0));
        switch(v) {
            case 1: {
                return FocusStrategy.f(object1, arrayList0, z1);
            }
            case 2: {
                return FocusStrategy.e(object1, arrayList0, z1);
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
        }
    }

    private static Object e(Object object0, ArrayList arrayList0, boolean z) {
        int v = arrayList0.size();
        int v1 = object0 == null ? -1 : arrayList0.lastIndexOf(object0);
        if(v1 + 1 < v) {
            return arrayList0.get(v1 + 1);
        }
        return !z || v <= 0 ? null : arrayList0.get(0);
    }

    private static Object f(Object object0, ArrayList arrayList0, boolean z) {
        int v = arrayList0.size();
        int v1 = object0 == null ? v : arrayList0.indexOf(object0);
        if(v1 - 1 >= 0) {
            return arrayList0.get(v1 - 1);
        }
        return !z || v <= 0 ? null : arrayList0.get(v - 1);
    }

    private static int g(int v, int v1) {
        return v * 13 * v + v1 * v1;
    }

    private static boolean h(int v, @NonNull Rect rect0, @NonNull Rect rect1, @NonNull Rect rect2) {
        if(!FocusStrategy.i(rect0, rect1, v)) {
            return false;
        }
        if(!FocusStrategy.i(rect0, rect2, v)) {
            return true;
        }
        if(FocusStrategy.a(v, rect0, rect1, rect2)) {
            return true;
        }
        return FocusStrategy.a(v, rect0, rect2, rect1) ? false : FocusStrategy.g(FocusStrategy.k(v, rect0, rect1), FocusStrategy.o(v, rect0, rect1)) < FocusStrategy.g(FocusStrategy.k(v, rect0, rect2), FocusStrategy.o(v, rect0, rect2));
    }

    private static boolean i(@NonNull Rect rect0, @NonNull Rect rect1, int v) {
        switch(v) {
            case 17: {
                return (rect0.right > rect1.right || rect0.left >= rect1.right) && rect0.left > rect1.left;
            }
            case 33: {
                return (rect0.bottom > rect1.bottom || rect0.top >= rect1.bottom) && rect0.top > rect1.top;
            }
            case 66: {
                return (rect0.left < rect1.left || rect0.right <= rect1.left) && rect0.right < rect1.right;
            }
            case 130: {
                return (rect0.top < rect1.top || rect0.bottom <= rect1.top) && rect0.bottom < rect1.bottom;
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
    }

    private static boolean j(int v, @NonNull Rect rect0, @NonNull Rect rect1) {
        switch(v) {
            case 17: {
                return rect0.left >= rect1.right;
            }
            case 33: {
                return rect0.top >= rect1.bottom;
            }
            case 66: {
                return rect0.right <= rect1.left;
            }
            case 130: {
                return rect0.bottom <= rect1.top;
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
    }

    private static int k(int v, @NonNull Rect rect0, @NonNull Rect rect1) {
        return Math.max(0, FocusStrategy.l(v, rect0, rect1));
    }

    private static int l(int v, @NonNull Rect rect0, @NonNull Rect rect1) {
        switch(v) {
            case 17: {
                return rect0.left - rect1.right;
            }
            case 33: {
                return rect0.top - rect1.bottom;
            }
            case 66: {
                return rect1.left - rect0.right;
            }
            case 130: {
                return rect1.top - rect0.bottom;
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
    }

    private static int m(int v, @NonNull Rect rect0, @NonNull Rect rect1) {
        return Math.max(1, FocusStrategy.n(v, rect0, rect1));
    }

    private static int n(int v, @NonNull Rect rect0, @NonNull Rect rect1) {
        switch(v) {
            case 17: {
                return rect0.left - rect1.left;
            }
            case 33: {
                return rect0.top - rect1.top;
            }
            case 66: {
                return rect1.right - rect0.right;
            }
            case 130: {
                return rect1.bottom - rect0.bottom;
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
    }

    private static int o(int v, @NonNull Rect rect0, @NonNull Rect rect1) {
        switch(v) {
            case 17: 
            case 66: {
                return Math.abs(rect0.top + rect0.height() / 2 - (rect1.top + rect1.height() / 2));
            }
            case 33: 
            case 130: {
                return Math.abs(rect0.left + rect0.width() / 2 - (rect1.left + rect1.width() / 2));
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
    }
}

