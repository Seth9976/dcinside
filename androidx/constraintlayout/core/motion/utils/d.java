package androidx.constraintlayout.core.motion.utils;

public final class d {
    static {
    }

    public static int a(String s) {
        s.hashCode();
        if(!s.equals("defaultDuration")) {
            return s.equals("layoutDuringTransition") ? 601 : -1;
        }
        return 600;
    }

    public static int b(int v) {
        switch(v) {
            case 600: {
                return 2;
            }
            case 601: {
                return 1;
            }
            default: {
                return -1;
            }
        }
    }
}

