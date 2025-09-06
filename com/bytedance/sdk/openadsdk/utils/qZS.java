package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.qla;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.qla.ReZ.PjT;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

public class qZS {
    private static int Au = -1;
    private static Boolean DWo = null;
    private static int JQp = -1;
    private static float PjT = -1.0f;
    private static float ReZ = -1.0f;
    private static float SM = -1.0f;
    private static ViewConfiguration XX = null;
    private static int Zh = -1;
    private static int cr = -1;
    private static WindowManager cz = null;
    private static final Object qj = null;
    private static boolean xf = true;

    static {
        qZS.qj = new Object();
    }

    public static float Au(Context context0) {
        qZS.PjT(context0);
        return qZS.ReZ;
    }

    public static Pair DWo(Context context0) {
        if(context0 == null) {
            context0 = ub.PjT();
        }
        Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
        Point point0 = new Point();
        display0.getRealSize(point0);
        return new Pair(point0.x, point0.y);
    }

    public static int JQp(Context context0) {
        qZS.PjT(context0);
        return qZS.JQp;
    }

    public static void JQp(View view0) {
        if(view0 == null) {
            return;
        }
        WeakReference weakReference0 = new WeakReference(view0);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(view0, "alpha", new float[]{1.0f, 0.0f});
        objectAnimator0.addListener(new AnimatorListenerAdapter() {
            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                super.onAnimationEnd(animator0);
                View view0 = (View)weakReference0.get();
                if(view0 != null) {
                    qZS.PjT(view0, 8);
                    view0.setAlpha(1.0f);
                }
            }
        });
        objectAnimator0.setDuration(800L);
        objectAnimator0.start();
    }

    public static float PjT() {
        float f = qZS.SM;
        float f1 = 0.0f;
        if(f > 0.0f) {
            return f;
        }
        Resources resources0 = ub.PjT().getResources();
        int v = resources0.getIdentifier("status_bar_height", "dimen", "android");
        if(v > 0) {
            f1 = (float)resources0.getDimensionPixelSize(v);
            qZS.SM = f1;
        }
        return f1;
    }

    public static float PjT(Context context0, float f) {
        qZS.PjT(context0);
        return f * qZS.Au(context0);
    }

    public static float PjT(Context context0, float f, boolean z) {
        qZS.PjT(context0);
        float f1 = qZS.XX(context0);
        return z ? f * f1 + 0.5f : f * f1 + 0.0f;
    }

    public static int PjT(Bitmap bitmap0) {
        try {
            ArrayList arrayList0 = qZS.Zh(bitmap0);
            if(arrayList0 == null) {
                return -1;
            }
            HashMap hashMap0 = new HashMap();
            for(Object object0: arrayList0) {
                Integer integer0 = (Integer)object0;
                if(hashMap0.containsKey(integer0)) {
                    Integer integer1 = (int)(((int)(((Integer)hashMap0.get(integer0)))) + 1);
                    hashMap0.remove(integer0);
                    hashMap0.put(integer0, integer1);
                }
                else {
                    hashMap0.put(integer0, 1);
                }
            }
            int v = 0;
            int v1 = 0;
            for(Object object1: hashMap0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                int v2 = (int)(((Integer)map$Entry0.getValue()));
                if(v1 < v2) {
                    v = (int)(((Integer)map$Entry0.getKey()));
                    v1 = v2;
                }
            }
            return v == 0 ? -1 : ((int)(((float)v1) / (((float)(bitmap0.getWidth() * bitmap0.getHeight())) * 1.0f) * 100.0f));
        }
        catch(Throwable unused_ex) {
            return -1;
        }
    }

    public static int PjT(String s, Activity activity0) {
        if(cRA.JQp()) {
            try {
                Class class0 = activity0.getClassLoader().loadClass("android.os.SystemProperties");
                return (int)(((Integer)class0.getMethod("getInt", String.class, Integer.TYPE).invoke(class0, new String(s), 0)));
            }
            catch(ClassNotFoundException classNotFoundException0) {
                RD.Zh("UIUtils", classNotFoundException0.getMessage());
                return 0;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                RD.Zh("UIUtils", noSuchMethodException0.getMessage());
                return 0;
            }
            catch(IllegalAccessException illegalAccessException0) {
                RD.Zh("UIUtils", illegalAccessException0.getMessage());
                return 0;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                RD.Zh("UIUtils", illegalArgumentException0.getMessage());
                return 0;
            }
            catch(InvocationTargetException invocationTargetException0) {
                RD.Zh("UIUtils", invocationTargetException0.getMessage());
                return 0;
            }
        }
        return 0;
    }

    private static Bitmap PjT(WebView webView0) {
        Bitmap bitmap0 = null;
        try {
            Picture picture0 = webView0.capturePicture();
            bitmap0 = Bitmap.createBitmap(picture0.getWidth(), picture0.getHeight(), Bitmap.Config.ARGB_8888);
            picture0.draw(new Canvas(bitmap0));
        }
        catch(Throwable throwable0) {
            RD.Zh("UIUtils", throwable0.getMessage());
        }
        return bitmap0;
    }

    public static Bitmap PjT(cz cz0) {
        if(Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView0 = cz0.getWebView();
        int v = webView0.getLayerType();
        webView0.setLayerType(1, null);
        Bitmap bitmap0 = qZS.Zh(cz0);
        if(bitmap0 == null) {
            bitmap0 = qZS.PjT(webView0);
        }
        webView0.setLayerType(v, null);
        return bitmap0 == null ? null : cr.PjT(bitmap0, bitmap0.getWidth() / 6, bitmap0.getHeight() / 6);
    }

    public static void PjT(Activity activity0) {
        if(activity0 != null && !activity0.isFinishing()) {
            try {
                activity0.getWindow().getDecorView().setSystemUiVisibility(0xF06);
                activity0.getWindow().addFlags(0x700);
            }
            catch(Exception exception0) {
                RD.Zh("UIUtils", exception0.getMessage());
            }
        }
    }

    public static void PjT(Context context0) {
        qZS.PjT(context0, false);
    }

    public static void PjT(Context context0, boolean z) {
        Context context1 = context0 == null ? ub.PjT() : context0;
        if(context1 == null) {
            return;
        }
        qZS.cz = (WindowManager)context1.getSystemService("window");
        DisplayMetrics displayMetrics0 = context1.getResources().getDisplayMetrics();
        qZS.PjT = displayMetrics0.density;
        qZS.Zh = displayMetrics0.densityDpi;
        qZS.ReZ = displayMetrics0.scaledDensity;
        qZS.cr = displayMetrics0.widthPixels;
        qZS.JQp = displayMetrics0.heightPixels;
        if(context0 != null && context0.getResources() != null && context0.getResources().getConfiguration() != null) {
            if(context0.getResources().getConfiguration().orientation == 1) {
                int v = qZS.cr;
                int v1 = qZS.JQp;
                if(v > v1) {
                    qZS.cr = v1;
                    qZS.JQp = v;
                }
            }
            else {
                int v2 = qZS.cr;
                int v3 = qZS.JQp;
                if(v2 < v3) {
                    qZS.cr = v3;
                    qZS.JQp = v2;
                }
            }
        }
    }

    public static void PjT(View view0, float f) {
        if(view0 == null) {
            return;
        }
        view0.setAlpha(f);
    }

    public static void PjT(View view0, int v) {
        if(view0 != null && view0.getVisibility() != v && qZS.PjT(v)) {
            view0.setVisibility(v);
        }
    }

    public static void PjT(View view0, int v, int v1, int v2, int v3) {
        if(view0 == null) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            return;
        }
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            qZS.PjT(view0, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0), v, v1, v2, v3);
        }
    }

    public static void PjT(View view0, View.OnClickListener view$OnClickListener0, String s) {
        if(view0 == null) {
            RD.Zh("OnclickListener ", s + " is null , can not set OnClickListener !!!");
            return;
        }
        view0.setOnClickListener(view$OnClickListener0);
    }

    public static void PjT(View view0, View.OnTouchListener view$OnTouchListener0, String s) {
        if(view0 == null) {
            RD.Zh("OnTouchListener ", s + " is null , can not set OnTouchListener !!!");
            return;
        }
        view0.setOnTouchListener(view$OnTouchListener0);
    }

    private static void PjT(View view0, ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, int v1, int v2, int v3) {
        if(view0 != null && viewGroup$MarginLayoutParams0 != null && (viewGroup$MarginLayoutParams0.leftMargin != v || viewGroup$MarginLayoutParams0.topMargin != v1 || viewGroup$MarginLayoutParams0.rightMargin != v2 || viewGroup$MarginLayoutParams0.bottomMargin != v3)) {
            if(v != -3) {
                viewGroup$MarginLayoutParams0.leftMargin = v;
            }
            if(v1 != -3) {
                viewGroup$MarginLayoutParams0.topMargin = v1;
            }
            if(v2 != -3) {
                viewGroup$MarginLayoutParams0.rightMargin = v2;
            }
            if(v3 != -3) {
                viewGroup$MarginLayoutParams0.bottomMargin = v3;
            }
            view0.setLayoutParams(viewGroup$MarginLayoutParams0);
        }
    }

    public static void PjT(TextView textView0, qla qla0, double f, int v) {
        if(f == -1.0) {
            if(textView0 != null) {
                textView0.setVisibility(8);
            }
            qla0.setVisibility(8);
            return;
        }
        if(textView0 != null) {
            textView0.setText(String.format(Locale.getDefault(), "%.1f", f));
        }
        qZS.PjT(qla0, f, v);
    }

    public static void PjT(TextView textView0, qla qla0, Owx owx0) {
        qZS.PjT(textView0, qla0, owx0, 14);
    }

    public static void PjT(TextView textView0, qla qla0, Owx owx0, int v) {
        qZS.PjT(textView0, qla0, (owx0 == null || owx0.uQg() == null ? -1.0 : owx0.uQg().cr()), v);
    }

    public static void PjT(TextView textView0, CharSequence charSequence0) {
        if(textView0 != null && !TextUtils.isEmpty(charSequence0)) {
            textView0.setText(charSequence0);
        }
    }

    public static void PjT(Owx owx0, String s, String s1, Bitmap bitmap0, String s2, long v) {
        Jo.Zh(new Au("startCheckPlayableStatusPercentage") {
            @Override
            public void run() {
                qZS.ReZ(owx0, s, s1, bitmap0, s2, v);
            }
        }, 10);
    }

    public static void PjT(qla qla0, double f, int v) {
        if(f < 0.0) {
            qla0.setVisibility(8);
            return;
        }
        qla0.setVisibility(0);
        qla0.PjT(f, v);
    }

    public static void PjT(boolean z) {
        qZS.DWo = Boolean.valueOf(z);
    }

    public static boolean PjT(float f, float f1, Context context0) {
        if(f != -1.0f && f1 != -1.0f) {
            if(qZS.XX == null) {
                qZS.XX = ViewConfiguration.get(context0);
            }
            if(qZS.Au == -1) {
                qZS.Au = qZS.XX.getScaledTouchSlop();
            }
            return f - f1 > ((float)qZS.Au);
        }
        return false;
    }

    private static boolean PjT(int v) {
        return v == 0 || v == 4 || v == 8;
    }

    @Nullable
    public static int[] PjT(View view0) {
        if(view0 != null && view0.getVisibility() == 0) {
            int[] arr_v = new int[2];
            view0.getLocationOnScreen(arr_v);
            return arr_v;
        }
        return null;
    }

    public static int ReZ(Context context0) {
        qZS.PjT(context0);
        return qZS.cr;
    }

    public static int ReZ(Context context0, float f) {
        qZS.PjT(context0, true);
        float f1 = qZS.XX(context0);
        if(f1 <= 0.0f) {
            f1 = 1.0f;
        }
        return (int)(f / f1 + 0.5f);
    }

    private static void ReZ(Owx owx0, String s, String s1, Bitmap bitmap0, String s2, long v) {
        if(bitmap0 != null) {
            try {
                if(bitmap0.getWidth() > 0 && bitmap0.getHeight() > 0 && !bitmap0.isRecycled()) {
                    ReZ.PjT(System.currentTimeMillis(), owx0, s, s1, new PjT() {
                        @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                        public JSONObject PjT() {
                            JSONObject jSONObject1;
                            JSONObject jSONObject0;
                            try {
                                int v = qZS.PjT(bitmap0);
                                jSONObject0 = new JSONObject();
                                jSONObject0.put("url", s2);
                                long v1 = v;
                                if(v1 != -1L) {
                                    jSONObject0.put("page_id", v1);
                                }
                                jSONObject0.put("render_type", "h5");
                                int v2 = 0;
                                jSONObject0.put("render_type_2", 0);
                                if(v == 100) {
                                    v2 = 1;
                                }
                                jSONObject0.put("is_blank", v2);
                                jSONObject0.put("is_playable", ((int)com.bytedance.sdk.openadsdk.core.model.cRA.Zh(owx0)));
                                jSONObject0.put("usecache", ((int)com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(owx0)));
                                jSONObject1 = new JSONObject();
                            }
                            catch(JSONException unused_ex) {
                                return null;
                            }
                            try {
                                jSONObject1.put("ad_extra_data", jSONObject0.toString());
                            }
                            catch(JSONException unused_ex) {
                            }
                            return jSONObject1;
                        }
                    });
                }
            }
            catch(Throwable throwable0) {
                RD.Zh("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>" + throwable0);
            }
        }
    }

    private static boolean ReZ() [...] // 潜在的解密器

    public static boolean ReZ(Activity activity0) {
        if(qZS.DWo == null) {
            boolean z = false;
            Object object0 = qZS.qj;
            __monitor_enter(object0);
            try {
                if(qZS.DWo == null) {
                    if(qZS.cr(activity0) || qZS.PjT("ro.miui.notch", activity0) == 1 || qZS.xs(activity0) || qZS.ub(activity0) || qZS.fDm(activity0) || qZS.qla(activity0) || qZS.xE(activity0)) {
                        z = true;
                    }
                    qZS.DWo = Boolean.valueOf(z);
                }
                __monitor_exit(object0);
                return qZS.DWo.booleanValue();
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(object0);
            throw throwable0;
        }
        return qZS.DWo.booleanValue();
    }

    @Nullable
    public static int[] ReZ(View view0) {
        return view0 == null ? null : new int[]{view0.getWidth(), view0.getHeight()};
    }

    public static int SM(Context context0) {
        qZS.PjT(context0);
        return qZS.Zh;
    }

    public static float XX(Context context0) {
        qZS.PjT(context0, true);
        return qZS.PjT;
    }

    public static void XX(View view0) {
        if(view0 == null) {
            return;
        }
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof ViewGroup) {
            ((ViewGroup)viewParent0).removeView(view0);
        }
    }

    public static int Zh(Context context0, float f) {
        return qZS.PjT(context0, f, true).intValue();
    }

    private static Bitmap Zh(cz cz0) {
        if(cz0 == null) {
            return null;
        }
        try {
            Bitmap bitmap0 = Bitmap.createBitmap(cz0.getWidth(), cz0.getHeight(), Bitmap.Config.RGB_565);
            cz0.draw(new Canvas(bitmap0));
            return bitmap0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static ArrayList Zh(Bitmap bitmap0) {
        if(bitmap0 == null) {
            return null;
        }
        try {
            int v = bitmap0.getWidth();
            int v1 = bitmap0.getHeight();
            int v2 = v * v1;
            int[] arr_v = new int[v2];
            bitmap0.getPixels(arr_v, 0, v, 0, 0, v, v1);
            ArrayList arrayList0 = new ArrayList();
            for(int v3 = 0; v3 < v2; ++v3) {
                int v4 = arr_v[v3];
                arrayList0.add(Color.rgb((0xFF0000 & v4) >> 16, (0xFF00 & v4) >> 8, v4 & 0xFF));
            }
            return arrayList0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void Zh(Activity activity0) {
        if(activity0 == null) {
            return;
        }
        try {
            activity0.getWindow().getDecorView().setSystemUiVisibility(0x700);
            activity0.getWindow().clearFlags(0x700);
        }
        catch(Exception unused_ex) {
        }
    }

    public static void Zh(View view0, float f) {
        if(view0 == null) {
            return;
        }
        if(f <= 0.0f) {
            return;
        }
        view0.setOutlineProvider(new ViewOutlineProvider() {
            @Override  // android.view.ViewOutlineProvider
            public void getOutline(View view0, Outline outline0) {
                if(outline0 == null) {
                    return;
                }
                outline0.setRoundRect(0, 0, view0.getWidth(), view0.getHeight(), f);
            }
        });
        view0.setClipToOutline(true);
    }

    public static boolean Zh() [...] // 潜在的解密器

    public static int[] Zh(Context context0) {
        if(context0 == null) {
            return null;
        }
        if(qZS.cz == null) {
            qZS.cz = (WindowManager)ub.PjT().getSystemService("window");
        }
        int[] arr_v = new int[2];
        WindowManager windowManager0 = qZS.cz;
        if(windowManager0 != null) {
            Display display0 = windowManager0.getDefaultDisplay();
            DisplayMetrics displayMetrics0 = new DisplayMetrics();
            display0.getMetrics(displayMetrics0);
            int v = displayMetrics0.widthPixels;
            int v1 = displayMetrics0.heightPixels;
            try {
                Point point0 = new Point();
                display0.getRealSize(point0);
                v = point0.x;
                v1 = point0.y;
            }
            catch(Exception unused_ex) {
            }
            arr_v[0] = v;
            arr_v[1] = v1;
        }
        if(arr_v[0] <= 0 || arr_v[1] <= 0) {
            DisplayMetrics displayMetrics1 = context0.getResources().getDisplayMetrics();
            arr_v[0] = displayMetrics1.widthPixels;
            arr_v[1] = displayMetrics1.heightPixels;
        }
        return arr_v;
    }

    public static int[] Zh(View view0) {
        if(view0 != null) {
            int[] arr_v = new int[2];
            view0.getLocationOnScreen(arr_v);
            return arr_v;
        }
        return null;
    }

    public static int cr(Context context0) {
        qZS.PjT(context0);
        return qZS.ReZ(context0, ((float)qZS.cr));
    }

    public static boolean cr(Activity activity0) {
        if(Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets windowInsets0 = activity0.getWindow().getDecorView().getRootWindowInsets();
                if(windowInsets0 != null) {
                    DisplayCutout displayCutout0 = windowInsets0.getDisplayCutout();
                    qZS.xf = false;
                    return displayCutout0 != null;
                }
                return false;
            }
            catch(Exception exception0) {
                RD.Zh("UIUtils", exception0.getMessage());
            }
        }
        return false;
    }

    public static boolean cr(View view0) {
        return view0 != null && view0.getVisibility() == 0;
    }

    public static int cz(Context context0) {
        qZS.PjT(context0);
        return qZS.ReZ(context0, ((float)qZS.JQp));
    }

    public static void cz(View view0) {
        if(view0 == null) {
            return;
        }
        qZS.PjT(view0, 0);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(view0, "alpha", new float[]{0.0f, 1.0f});
        objectAnimator0.addListener(new AnimatorListenerAdapter() {
            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                super.onAnimationEnd(animator0);
            }
        });
        objectAnimator0.setDuration(300L);
        objectAnimator0.start();
    }

    public static boolean fDm(Context context0) {
        try {
            Class class0 = context0.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean)class0.getMethod("isFeatureSupport", Integer.TYPE).invoke(class0, 0x20)).booleanValue();
        }
        catch(ClassNotFoundException | NoSuchMethodException | Exception unused_ex) {
            return false;
        }
    }

    public static int qj(Context context0) {
        return (int)(((Integer)qZS.DWo(context0).second));
    }

    // 去混淆评级： 低(40)
    public static boolean qla(Context context0) {
        return Build.MODEL.equals("IN2010") || Build.MODEL.equals("IN2020") || Build.MODEL.equals("KB2000") || Build.MODEL.startsWith("ONEPLUS");
    }

    public static boolean ub(Context context0) {
        return context0.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean xE(Context context0) {
        try {
            Resources resources0 = context0.getResources();
            int v = resources0.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String s = v <= 0 ? null : resources0.getString(v);
            if(s != null && !TextUtils.isEmpty(s)) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    public static int xf(Context context0) {
        return (int)(((Integer)qZS.DWo(context0).first));
    }

    public static boolean xs(Context context0) {
        try {
            Class class0 = context0.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean)class0.getMethod("hasNotchInScreen", null).invoke(class0, null)).booleanValue();
        }
        catch(ClassNotFoundException | NoSuchMethodException | Exception unused_ex) {
            return false;
        }
    }
}

