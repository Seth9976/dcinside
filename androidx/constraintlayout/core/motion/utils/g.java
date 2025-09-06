package androidx.constraintlayout.core.motion.utils;

public final class g {
    static {
    }

    public static int a(String s) {
        s.hashCode();
        switch(s) {
            case "autoTransition": {
                return 704;
            }
            case "duration": {
                return 700;
            }
            case "from": {
                return 701;
            }
            case "motionInterpolator": {
                return 705;
            }
            case "pathMotionArc": {
                return 509;
            }
            case "staggered": {
                return 706;
            }
            case "to": {
                return 702;
            }
            case "transitionFlags": {
                return 707;
            }
            default: {
                return -1;
            }
        }
    }

    public static int b(int v) {
        if(v != 509) {
            switch(v) {
                case 700: {
                    break;
                }
                case 706: {
                    return 4;
                }
                case 701: 
                case 702: 
                case 705: 
                case 707: {
                    return 8;
                }
                default: {
                    return -1;
                }
            }
        }
        return 2;
    }
}

