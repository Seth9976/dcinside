package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;

public final class Lrd {
    private static boolean JQp = false;
    @SuppressLint({"StaticFieldLeak"})
    private static Context PjT = null;
    private static Resources ReZ = null;
    private static String Zh = null;
    private static String cr = null;
    private static boolean cz = false;

    static {
    }

    public static int Au(Context context0, String s) {
        return Lrd.PjT(context0, s, "color");
    }

    public static int JQp(Context context0, String s) {
        return Lrd.PjT(context0, s, "id");
    }

    private static int PjT(Context context0, String s, String s1) {
        int v = Lrd.Zh(context0).getIdentifier(s, s1, Lrd.cr(context0));
        if(v == 0) {
            if(!Lrd.JQp) {
                Lrd.ReZ(context0);
                return Lrd.Zh(context0).getIdentifier(s, s1, Lrd.cr(context0));
            }
            return context0.getResources().getIdentifier(s, s1, Lrd.cr(context0));
        }
        return v;
    }

    public static String PjT(Context context0, String s) {
        int v = Lrd.Zh(context0, s);
        return Lrd.Zh(context0).getString(v);
    }

    public static void PjT(Context context0) {
        Lrd.PjT = context0;
    }

    public static void PjT(String s) {
        Lrd.cr = s;
    }

    public static boolean PjT(AssetManager assetManager0, String s) {
        Class class0 = String.class;
        Class class1 = AssetManager.class;
        Method method0 = Qf.PjT(class1, "addAssetPath", new Class[]{class0});
        if(method0 == null) {
            method0 = Qf.PjT(class1, "addAssetPath", new Class[]{class0});
        }
        if(method0 != null) {
            for(int v = 3; v >= 0; --v) {
                try {
                    if(((int)(((Integer)method0.invoke(assetManager0, new Object[]{s})))) != 0) {
                        return true;
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }
        return false;
    }

    public static Drawable ReZ(Context context0, String s) {
        try {
            int v = Lrd.cr(context0, s);
            return Lrd.Zh(context0).getDrawable(v);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static void ReZ(Context context0) {
        synchronized(Lrd.class) {
            try {
                if(!TextUtils.isEmpty(Lrd.Zh)) {
                    Resources resources0 = context0.getResources();
                    Lrd.ReZ = new Resources(Lrd.Zh(resources0.getAssets(), Lrd.Zh + "/apk/base-1.apk"), resources0.getDisplayMetrics(), resources0.getConfiguration());
                    Lrd.cr = "com.dcinside.app.android";
                    Lrd.JQp = true;
                }
            }
            catch(Throwable throwable0) {
                Log.e("ResourceHelp", "makePluginResources failed", throwable0);
            }
        }
    }

    public static int SM(Context context0, String s) {
        return Lrd.PjT(context0, s, "anim");
    }

    public static int XX(Context context0, String s) {
        int v = Lrd.Au(context0, s);
        return Lrd.Zh(context0).getColor(v);
    }

    public static int Zh(Context context0, String s) {
        return Lrd.PjT(context0, s, "string");
    }

    private static AssetManager Zh(AssetManager assetManager0, String s) {
        try {
            AssetManager assetManager1 = assetManager0.getClass().getName().equals("android.content.res.BaiduAssetManager") ? ((AssetManager)Class.forName("android.content.res.BaiduAssetManager").getConstructor(null).newInstance(null)) : ((AssetManager)AssetManager.class.newInstance());
            Lrd.PjT(assetManager1, s);
            assetManager0 = assetManager1;
        }
        catch(Exception unused_ex) {
            Lrd.PjT(assetManager0, s);
        }
        try {
            Qf.PjT(assetManager0, "ensureStringBlocks", new Object[0]);
        }
        catch(Exception unused_ex) {
        }
        return assetManager0;
    }

    public static Resources Zh(Context context0) {
        Resources resources0 = Lrd.ReZ == null ? null : Lrd.ReZ;
        Context context1 = Lrd.PjT;
        if(context1 != null) {
            resources0 = context1.getResources();
        }
        return resources0 == null ? context0.getResources() : resources0;
    }

    public static int cr(Context context0, String s) {
        try {
            return Lrd.PjT(context0, s, "drawable");
        }
        catch(Exception unused_ex) {
            return 0;
        }
    }

    private static String cr(Context context0) {
        if(Lrd.cr == null) {
            Lrd.cr = "com.dcinside.app.android";
        }
        return Lrd.cr;
    }

    public static int cz(Context context0, String s) {
        return Lrd.PjT(context0, s, "style");
    }
}

