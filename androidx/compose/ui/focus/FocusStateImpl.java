package androidx.compose.ui.focus;

import kotlin.J;

public enum FocusStateImpl implements FocusState {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[FocusStateImpl.values().length];
            try {
                arr_v[FocusStateImpl.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    Active,
    ActiveParent,
    Captured,
    Inactive;

    @Override  // androidx.compose.ui.focus.FocusState
    public boolean a() {
        switch(WhenMappings.a[this.ordinal()]) {
            case 1: 
            case 2: {
                return true;
            }
            case 3: 
            case 4: {
                return false;
            }
            default: {
                throw new J();
            }
        }
    }

    @Override  // androidx.compose.ui.focus.FocusState
    public boolean b() {
        switch(this) {
            case 1: {
                return true;
            }
            case 2: 
            case 3: 
            case 4: {
                return false;
            }
            default: {
                throw new J();
            }
        }
    }

    @Override  // androidx.compose.ui.focus.FocusState
    public boolean c() {
        switch(WhenMappings.a[this.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                return true;
            }
            case 4: {
                return false;
            }
            default: {
                throw new J();
            }
        }
    }

    private static final FocusStateImpl[] d() [...] // Inlined contents
}

