package com.bytedance.adsdk.ugeno.XX;

public final class ReZ {
    public static double PjT(String s, double f) {
        try {
            return Double.parseDouble(s);
        }
        catch(NumberFormatException unused_ex) {
            return f;
        }
    }

    public static float PjT(String s, float f) {
        try {
            return Float.parseFloat(s);
        }
        catch(NumberFormatException unused_ex) {
            return f;
        }
    }

    public static int PjT(String s, int v) {
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            return v;
        }
    }

    public static long PjT(String s, long v) {
        try {
            return Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
            return v;
        }
    }

    public static boolean PjT(String s, boolean z) {
        return Boolean.parseBoolean(s);
    }
}

