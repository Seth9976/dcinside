package androidx.constraintlayout.core.motion.utils;

public interface TypedValues {
    public interface AttributesType {
        public static final String A = "rotationX";
        public static final String B = "rotationY";
        public static final String C = "rotationZ";
        public static final String D = "scaleX";
        public static final String E = "scaleY";
        public static final String F = "pivotX";
        public static final String G = "pivotY";
        public static final String H = "progress";
        public static final String I = "pathRotate";
        public static final String J = "easing";
        public static final String K = "CUSTOM";
        public static final String L = "frame";
        public static final String M = "target";
        public static final String N = "pivotTarget";
        public static final String[] O = null;
        public static final String a = "KeyAttributes";
        public static final int b = 301;
        public static final int c = 302;
        public static final int d = 303;
        public static final int e = 304;
        public static final int f = 305;
        public static final int g = 306;
        public static final int h = 307;
        public static final int i = 308;
        public static final int j = 309;
        public static final int k = 310;
        public static final int l = 311;
        public static final int m = 312;
        public static final int n = 313;
        public static final int o = 314;
        public static final int p = 315;
        public static final int q = 316;
        public static final int r = 317;
        public static final int s = 318;
        public static final String t = "curveFit";
        public static final String u = "visibility";
        public static final String v = "alpha";
        public static final String w = "translationX";
        public static final String x = "translationY";
        public static final String y = "translationZ";
        public static final String z = "elevation";

        static {
            AttributesType.O = new String[]{"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", "frame", "target", "pivotTarget"};
        }
    }

    public interface Custom {
        public static final String a = "Custom";
        public static final String b = "integer";
        public static final String c = "float";
        public static final String d = "color";
        public static final String e = "string";
        public static final String f = "boolean";
        public static final String g = "dimension";
        public static final String h = "reference";
        public static final String[] i = null;
        public static final int j = 900;
        public static final int k = 901;
        public static final int l = 902;
        public static final int m = 903;
        public static final int n = 904;
        public static final int o = 905;
        public static final int p = 906;

        static {
            Custom.i = new String[]{"float", "color", "string", "boolean", "dimension", "reference"};
        }
    }

    public interface CycleType {
        public static final String A = "translationX";
        public static final String B = "translationY";
        public static final String C = "translationZ";
        public static final String D = "elevation";
        public static final String E = "rotationX";
        public static final String F = "rotationY";
        public static final String G = "rotationZ";
        public static final String H = "scaleX";
        public static final String I = "scaleY";
        public static final String J = "pivotX";
        public static final String K = "pivotY";
        public static final String L = "progress";
        public static final String M = "pathRotate";
        public static final String N = "easing";
        public static final String O = "waveShape";
        public static final String P = "customWave";
        public static final String Q = "period";
        public static final String R = "offset";
        public static final String S = "phase";
        public static final String[] T = null;
        public static final String a = "KeyCycle";
        public static final int b = 401;
        public static final int c = 402;
        public static final int d = 403;
        public static final int e = 304;
        public static final int f = 305;
        public static final int g = 306;
        public static final int h = 307;
        public static final int i = 308;
        public static final int j = 309;
        public static final int k = 310;
        public static final int l = 311;
        public static final int m = 312;
        public static final int n = 313;
        public static final int o = 314;
        public static final int p = 315;
        public static final int q = 0x1A0;
        public static final int r = 420;
        public static final int s = 421;
        public static final int t = 422;
        public static final int u = 423;
        public static final int v = 424;
        public static final int w = 425;
        public static final String x = "curveFit";
        public static final String y = "visibility";
        public static final String z = "alpha";

        static {
            CycleType.T = new String[]{"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", "customWave", "period", "offset", "phase"};
        }
    }

    public interface MotionScene {
        public static final String a = "MotionScene";
        public static final String b = "defaultDuration";
        public static final String c = "layoutDuringTransition";
        public static final int d = 600;
        public static final int e = 601;
        public static final String[] f;

        static {
            MotionScene.f = new String[]{"defaultDuration", "layoutDuringTransition"};
        }
    }

    public interface MotionType {
        public static final int A = 611;
        public static final int B = 612;
        public static final String a = "Motion";
        public static final String b = "Stagger";
        public static final String c = "PathRotate";
        public static final String d = "QuantizeMotionPhase";
        public static final String e = "TransitionEasing";
        public static final String f = "QuantizeInterpolator";
        public static final String g = "AnimateRelativeTo";
        public static final String h = "AnimateCircleAngleTo";
        public static final String i = "PathMotionArc";
        public static final String j = "DrawPath";
        public static final String k = "PolarRelativeTo";
        public static final String l = "QuantizeMotionSteps";
        public static final String m = "QuantizeInterpolatorType";
        public static final String n = "QuantizeInterpolatorID";
        public static final String[] o = null;
        public static final int p = 600;
        public static final int q = 601;
        public static final int r = 602;
        public static final int s = 603;
        public static final int t = 604;
        public static final int u = 605;
        public static final int v = 606;
        public static final int w = 607;
        public static final int x = 608;
        public static final int y = 609;
        public static final int z = 610;

        static {
            MotionType.o = new String[]{"Stagger", "PathRotate", "QuantizeMotionPhase", "TransitionEasing", "QuantizeInterpolator", "AnimateRelativeTo", "AnimateCircleAngleTo", "PathMotionArc", "DrawPath", "PolarRelativeTo", "QuantizeMotionSteps", "QuantizeInterpolatorType", "QuantizeInterpolatorID"};
        }
    }

    public interface OnSwipe {
        public static final String a = "dragscale";
        public static final String b = "dragthreshold";
        public static final String c = "maxvelocity";
        public static final String d = "maxacceleration";
        public static final String e = "springmass";
        public static final String f = "springstiffness";
        public static final String g = "springdamping";
        public static final String h = "springstopthreshold";
        public static final String i = "dragdirection";
        public static final String j = "touchanchorid";
        public static final String k = "touchanchorside";
        public static final String l = "rotationcenterid";
        public static final String m = "touchregionid";
        public static final String n = "limitboundsto";
        public static final String o = "movewhenscrollattop";
        public static final String p = "ontouchup";
        public static final String[] q = null;
        public static final String r = "springboundary";
        public static final String[] s = null;
        public static final String t = "autocompletemode";
        public static final String[] u = null;
        public static final String v = "nestedscrollflags";
        public static final String[] w;

        static {
            OnSwipe.q = new String[]{"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", "stop", "decelerate", "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};
            OnSwipe.s = new String[]{"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};
            OnSwipe.u = new String[]{"continuousVelocity", "spring"};
            OnSwipe.w = new String[]{"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
        }
    }

    public interface PositionType {
        public static final String a = "KeyPosition";
        public static final String b = "transitionEasing";
        public static final String c = "drawPath";
        public static final String d = "percentWidth";
        public static final String e = "percentHeight";
        public static final String f = "sizePercent";
        public static final String g = "percentX";
        public static final String h = "percentY";
        public static final int i = 501;
        public static final int j = 502;
        public static final int k = 503;
        public static final int l = 504;
        public static final int m = 505;
        public static final int n = 506;
        public static final int o = 507;
        public static final int p = 508;
        public static final int q = 509;
        public static final int r = 510;
        public static final String[] s;

        static {
            PositionType.s = new String[]{"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};
        }
    }

    public interface TransitionType {
        public static final String a = "Transitions";
        public static final String b = "duration";
        public static final String c = "from";
        public static final String d = "to";
        public static final String e = "pathMotionArc";
        public static final String f = "autoTransition";
        public static final String g = "motionInterpolator";
        public static final String h = "staggered";
        public static final String i = "transitionFlags";
        public static final int j = 700;
        public static final int k = 701;
        public static final int l = 702;
        public static final int m = 509;
        public static final int n = 704;
        public static final int o = 705;
        public static final int p = 706;
        public static final int q = 707;
        public static final String[] r;

        static {
            TransitionType.r = new String[]{"duration", "from", "to", "pathMotionArc", "autoTransition", "motionInterpolator", "staggered", "from", "transitionFlags"};
        }
    }

    public interface TriggerType {
        public static final String a = "KeyTrigger";
        public static final String b = "viewTransitionOnCross";
        public static final String c = "viewTransitionOnPositiveCross";
        public static final String d = "viewTransitionOnNegativeCross";
        public static final String e = "postLayout";
        public static final String f = "triggerSlack";
        public static final String g = "triggerCollisionView";
        public static final String h = "triggerCollisionId";
        public static final String i = "triggerID";
        public static final String j = "positiveCross";
        public static final String k = "negativeCross";
        public static final String l = "triggerReceiver";
        public static final String m = "CROSS";
        public static final String[] n = null;
        public static final int o = 301;
        public static final int p = 302;
        public static final int q = 303;
        public static final int r = 304;
        public static final int s = 305;
        public static final int t = 306;
        public static final int u = 307;
        public static final int v = 308;
        public static final int w = 309;
        public static final int x = 310;
        public static final int y = 311;
        public static final int z = 312;

        static {
            TriggerType.n = new String[]{"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};
        }
    }

    public static final String a = "CUSTOM";
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 100;
    public static final int g = 101;

    boolean a(int arg1, int arg2);

    boolean b(int arg1, float arg2);

    boolean c(int arg1, boolean arg2);

    boolean d(int arg1, String arg2);

    int e(String arg1);
}

