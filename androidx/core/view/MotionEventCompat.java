package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.ReplaceWith;

public final class MotionEventCompat {
    @Deprecated
    public static final int A = 17;
    @Deprecated
    public static final int B = 18;
    @Deprecated
    public static final int C = 19;
    @Deprecated
    public static final int D = 20;
    @Deprecated
    public static final int E = 21;
    @Deprecated
    public static final int F = 22;
    @Deprecated
    public static final int G = 23;
    @Deprecated
    public static final int H = 24;
    @Deprecated
    public static final int I = 25;
    public static final int J = 26;
    public static final int K = 27;
    public static final int L = 28;
    @Deprecated
    public static final int M = 0x20;
    @Deprecated
    public static final int N = 33;
    @Deprecated
    public static final int O = 34;
    @Deprecated
    public static final int P = 35;
    @Deprecated
    public static final int Q = 36;
    @Deprecated
    public static final int R = 37;
    @Deprecated
    public static final int S = 38;
    @Deprecated
    public static final int T = 39;
    @Deprecated
    public static final int U = 40;
    @Deprecated
    public static final int V = 41;
    @Deprecated
    public static final int W = 42;
    @Deprecated
    public static final int X = 43;
    @Deprecated
    public static final int Y = 44;
    @Deprecated
    public static final int Z = 45;
    @Deprecated
    public static final int a = 0xFF;
    @Deprecated
    public static final int a0 = 46;
    @Deprecated
    public static final int b = 5;
    @Deprecated
    public static final int b0 = 0x2F;
    @Deprecated
    public static final int c = 6;
    @Deprecated
    public static final int c0 = 1;
    @Deprecated
    public static final int d = 7;
    @Deprecated
    public static final int e = 8;
    @Deprecated
    public static final int f = 0xFF00;
    @Deprecated
    public static final int g = 8;
    @Deprecated
    public static final int h = 9;
    @Deprecated
    public static final int i = 10;
    @Deprecated
    public static final int j = 0;
    @Deprecated
    public static final int k = 1;
    @Deprecated
    public static final int l = 2;
    @Deprecated
    public static final int m = 3;
    @Deprecated
    public static final int n = 4;
    @Deprecated
    public static final int o = 5;
    @Deprecated
    public static final int p = 6;
    @Deprecated
    public static final int q = 7;
    @Deprecated
    public static final int r = 8;
    @Deprecated
    public static final int s = 9;
    @Deprecated
    public static final int t = 10;
    @Deprecated
    public static final int u = 11;
    @Deprecated
    public static final int v = 12;
    @Deprecated
    public static final int w = 13;
    @Deprecated
    public static final int x = 14;
    @Deprecated
    public static final int y = 15;
    @Deprecated
    public static final int z = 16;

    @ReplaceWith(expression = "event.findPointerIndex(pointerId)")
    @Deprecated
    public static int a(MotionEvent motionEvent0, int v) {
        return motionEvent0.findPointerIndex(v);
    }

    @ReplaceWith(expression = "event.getActionIndex()")
    @Deprecated
    public static int b(MotionEvent motionEvent0) {
        return motionEvent0.getActionIndex();
    }

    @ReplaceWith(expression = "event.getActionMasked()")
    @Deprecated
    public static int c(MotionEvent motionEvent0) {
        return motionEvent0.getActionMasked();
    }

    @ReplaceWith(expression = "event.getAxisValue(axis)")
    @Deprecated
    public static float d(MotionEvent motionEvent0, int v) {
        return motionEvent0.getAxisValue(v);
    }

    @ReplaceWith(expression = "event.getAxisValue(axis, pointerIndex)")
    @Deprecated
    public static float e(MotionEvent motionEvent0, int v, int v1) {
        return motionEvent0.getAxisValue(v, v1);
    }

    @ReplaceWith(expression = "event.getButtonState()")
    @Deprecated
    public static int f(MotionEvent motionEvent0) {
        return motionEvent0.getButtonState();
    }

    @ReplaceWith(expression = "event.getPointerCount()")
    @Deprecated
    public static int g(MotionEvent motionEvent0) {
        return motionEvent0.getPointerCount();
    }

    @ReplaceWith(expression = "event.getPointerId(pointerIndex)")
    @Deprecated
    public static int h(MotionEvent motionEvent0, int v) {
        return motionEvent0.getPointerId(v);
    }

    @ReplaceWith(expression = "event.getSource()")
    @Deprecated
    public static int i(MotionEvent motionEvent0) {
        return motionEvent0.getSource();
    }

    @ReplaceWith(expression = "event.getX(pointerIndex)")
    @Deprecated
    public static float j(MotionEvent motionEvent0, int v) {
        return motionEvent0.getX(v);
    }

    @ReplaceWith(expression = "event.getY(pointerIndex)")
    @Deprecated
    public static float k(MotionEvent motionEvent0, int v) {
        return motionEvent0.getY(v);
    }

    public static boolean l(MotionEvent motionEvent0, int v) {
        return (motionEvent0.getSource() & v) == v;
    }
}

