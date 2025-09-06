package com.bytedance.adsdk.ugeno.XX;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.text.TextUtils;
import android.util.Log;

public class PjT {
    public static class com.bytedance.adsdk.ugeno.XX.PjT.PjT {
        public GradientDrawable.Orientation PjT;
        public float[] ReZ;
        public int[] Zh;

    }

    public static int PjT(int v, int v1) {
        if(v1 < 0 || v1 > 0xFF) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            v1 = 0xFF;
        }
        return v & 0xFFFFFF | v1 << 24;
    }

    public static int PjT(String s) {
        return PjT.PjT(s, 0xFF000000);
    }

    public static int PjT(String s, char c) {
        if(TextUtils.isEmpty(s)) {
            return 0;
        }
        int v1 = 0;
        for(int v = 0; v < s.length(); ++v) {
            if(s.charAt(v) == c) {
                ++v1;
            }
        }
        return v1;
    }

    public static int PjT(String s, int v) {
        if(TextUtils.isEmpty(s)) {
            return v;
        }
        if(s.equals("transparent")) {
            return 0;
        }
        if(s.charAt(0) == 35 && s.length() == 4) {
            StringBuilder stringBuilder0 = new StringBuilder("#");
            char[] arr_c = s.toCharArray();
            for(int v1 = 1; v1 < arr_c.length; ++v1) {
                stringBuilder0.append(arr_c[v1]);
                stringBuilder0.append(arr_c[v1]);
            }
            return Color.parseColor(stringBuilder0.toString());
        }
        if(s.charAt(0) == 35 && s.length() == 7) {
            return Color.parseColor(s);
        }
        if(s.charAt(0) == 35 && s.length() == 9) {
            return Color.parseColor(s);
        }
        if(!s.startsWith("rgba")) {
            return 0xFF000000;
        }
        String[] arr_s = s.substring(s.indexOf("(") + 1, s.indexOf(")")).split(",");
        if(arr_s != null && arr_s.length == 4) {
            float f = Float.parseFloat(arr_s[0]);
            float f1 = Float.parseFloat(arr_s[1]);
            float f2 = Float.parseFloat(arr_s[2]);
            return ((int)(Float.parseFloat(arr_s[3]) * 255.0f + 0.5f)) << 24 | ((int)f) << 16 | ((int)f1) << 8 | ((int)f2);
        }
        return v;
    }

    // 去混淆评级： 低(30)
    public static boolean ReZ(String s) {
        return TextUtils.isEmpty(s) ? false : s.startsWith("linear-gradient");
    }

    public static com.bytedance.adsdk.ugeno.XX.PjT.PjT Zh(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return null;
            }
            String s1 = s.substring(s.indexOf("(") + 1, s.lastIndexOf(")"));
            if(TextUtils.isEmpty(s1)) {
                return null;
            }
            int v = PjT.PjT(s1, '%');
            int v1 = s1.indexOf(",");
            com.bytedance.adsdk.ugeno.XX.PjT.PjT pjT$PjT0 = new com.bytedance.adsdk.ugeno.XX.PjT.PjT();
            pjT$PjT0.PjT = PjT.cr(s1.substring(0, v1));
            String s2 = s1.substring(v1 + 1);
            int[] arr_v = new int[v];
            float[] arr_f = new float[v];
            for(int v2 = 0; v2 < v; ++v2) {
                int v3 = s2.indexOf("%");
                String s3 = s2.substring(0, v3 + 1).trim();
                int v4 = s3.contains("rgba") ? s3.indexOf(")") : s3.indexOf(" ");
                arr_v[v2] = PjT.PjT(s3.substring(0, v4 + 1).trim());
                arr_f[v2] = ReZ.PjT(s3.substring(v4 + 1, s3.indexOf("%")).trim(), 0.0f) / 100.0f;
                if(s2.length() <= v3 + 2) {
                    break;
                }
                s2 = s2.substring(v3 + 2);
            }
            if(v < 2) {
                return null;
            }
            pjT$PjT0.Zh = arr_v;
            pjT$PjT0.ReZ = arr_f;
            return pjT$PjT0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static GradientDrawable.Orientation cr(String s) {
        try {
            switch((s.contains("deg") ? Integer.parseInt(s.substring(0, s.length() - 3).trim()) : Integer.parseInt(s))) {
                case 45: {
                    return GradientDrawable.Orientation.BL_TR;
                }
                case 90: {
                    return GradientDrawable.Orientation.LEFT_RIGHT;
                }
                case 0x87: {
                    return GradientDrawable.Orientation.TL_BR;
                }
                case 180: {
                    return GradientDrawable.Orientation.TOP_BOTTOM;
                }
                case 270: {
                    return GradientDrawable.Orientation.RIGHT_LEFT;
                }
                default: {
                    return GradientDrawable.Orientation.BOTTOM_TOP;
                }
            }
        }
        catch(Exception unused_ex) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }
}

