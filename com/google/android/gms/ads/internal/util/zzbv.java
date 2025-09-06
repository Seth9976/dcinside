package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.ImageView.ScaleType;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzfbo;
import com.google.android.gms.internal.ads.zzfty;
import com.google.android.gms.internal.ads.zzfvc;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbv {
    public static Point zza(MotionEvent motionEvent0, @Nullable View view0) {
        int[] arr_v = zzbv.zzj(view0);
        return new Point(((int)motionEvent0.getRawX()) - arr_v[0], ((int)motionEvent0.getRawY()) - arr_v[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        windowManager$LayoutParams0.flags = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzhT)));
        windowManager$LayoutParams0.type = 2;
        windowManager$LayoutParams0.gravity = 0x800033;
        return windowManager$LayoutParams0;
    }

    public static JSONObject zzc(@Nullable String s, Context context0, Point point0, Point point1) {
        JSONObject jSONObject1;
        JSONObject jSONObject0 = null;
        try {
            jSONObject1 = new JSONObject();
        }
        catch(Exception exception0) {
            zzo.zzh("Error occurred while grabbing click signals.", exception0);
            return jSONObject0;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("x", zzbc.zzb().zzb(context0, point1.x));
                jSONObject2.put("y", zzbc.zzb().zzb(context0, point1.y));
                jSONObject2.put("start_x", zzbc.zzb().zzb(context0, point0.x));
                jSONObject2.put("start_y", zzbc.zzb().zzb(context0, point0.y));
                jSONObject0 = jSONObject2;
            }
            catch(JSONException jSONException0) {
                zzo.zzh("Error occurred while putting signals into JSON object.", jSONException0);
            }
            jSONObject1.put("click_point", jSONObject0);
            jSONObject1.put("asset_id", s);
            return jSONObject1;
        }
        catch(Exception exception0) {
            jSONObject0 = jSONObject1;
        }
        zzo.zzh("Error occurred while grabbing click signals.", exception0);
        return jSONObject0;
    }

    public static JSONObject zzd(Context context0, @Nullable Map map0, @Nullable Map map1, @Nullable View view0, @Nullable ImageView.ScaleType imageView$ScaleType0) {
        String s;
        JSONObject jSONObject5;
        JSONObject jSONObject4;
        JSONObject jSONObject3;
        int v;
        JSONObject jSONObject0 = new JSONObject();
        if(map0 != null && view0 != null) {
            int[] arr_v = zzbv.zzj(view0);
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                View view1 = (View)((WeakReference)map$Entry0.getValue()).get();
                if(view1 != null) {
                    int[] arr_v1 = zzbv.zzj(view1);
                    JSONObject jSONObject1 = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        v = view1.getMeasuredWidth();
                        jSONObject3 = jSONObject0;
                    }
                    catch(JSONException unused_ex) {
                        jSONObject4 = jSONObject0;
                        goto label_64;
                    }
                    try {
                        jSONObject2.put("width", zzbc.zzb().zzb(context0, v));
                        jSONObject2.put("height", zzbc.zzb().zzb(context0, view1.getMeasuredHeight()));
                        jSONObject2.put("x", zzbc.zzb().zzb(context0, arr_v1[0] - arr_v[0]));
                        jSONObject2.put("y", zzbc.zzb().zzb(context0, arr_v1[1] - arr_v[1]));
                        jSONObject2.put("relative_to", "ad_view");
                        jSONObject1.put("frame", jSONObject2);
                        Rect rect0 = new Rect();
                        if(view1.getLocalVisibleRect(rect0)) {
                            jSONObject5 = zzbv.zzk(context0, rect0);
                        }
                        else {
                            jSONObject5 = new JSONObject();
                            jSONObject5.put("width", 0);
                            jSONObject5.put("height", 0);
                            jSONObject5.put("x", zzbc.zzb().zzb(context0, arr_v1[0] - arr_v[0]));
                            jSONObject5.put("y", zzbc.zzb().zzb(context0, arr_v1[1] - arr_v[1]));
                            jSONObject5.put("relative_to", "ad_view");
                        }
                        jSONObject1.put("visible_bounds", jSONObject5);
                        if(((String)map$Entry0.getKey()).equals("3010")) {
                            if(((Boolean)zzbe.zzc().zza(zzbcl.zzhO)).booleanValue()) {
                                jSONObject1.put("mediaview_graphics_matrix", view1.getMatrix().toShortString());
                            }
                            if(((Boolean)zzbe.zzc().zza(zzbcl.zzhP)).booleanValue()) {
                                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
                                jSONObject1.put("view_width_layout_type", zzbv.zzl(viewGroup$LayoutParams0.width) - 1);
                                jSONObject1.put("view_height_layout_type", zzbv.zzl(viewGroup$LayoutParams0.height) - 1);
                            }
                            if(((Boolean)zzbe.zzc().zza(zzbcl.zzhQ)).booleanValue()) {
                                ArrayList arrayList0 = new ArrayList();
                                arrayList0.add(view1.getId());
                                for(ViewParent viewParent0 = view1.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
                                    arrayList0.add(((View)viewParent0).getId());
                                }
                                jSONObject1.put("view_path", TextUtils.join("/", arrayList0));
                            }
                            if(imageView$ScaleType0 != null) {
                                jSONObject1.put("mediaview_scale_type", imageView$ScaleType0.ordinal());
                            }
                        }
                        if(view1 instanceof TextView) {
                            jSONObject1.put("text_color", ((TextView)view1).getCurrentTextColor());
                            jSONObject1.put("font_size", ((double)((TextView)view1).getTextSize()));
                            jSONObject1.put("text", ((TextView)view1).getText());
                        }
                        jSONObject1.put("is_clickable", map1 != null && map1.containsKey(map$Entry0.getKey()) && view1.isClickable());
                        s = (String)map$Entry0.getKey();
                        jSONObject4 = jSONObject3;
                        goto label_62;
                    }
                    catch(JSONException unused_ex) {
                    }
                    jSONObject4 = jSONObject3;
                    goto label_64;
                    try {
                    label_62:
                        jSONObject4.put(s, jSONObject1);
                    }
                    catch(JSONException unused_ex) {
                    label_64:
                        zzo.zzj("Unable to get asset views information");
                    }
                    jSONObject0 = jSONObject4;
                }
            }
        }
        return jSONObject0;
    }

    public static JSONObject zze(Context context0, @Nullable View view0) {
        JSONObject jSONObject0 = new JSONObject();
        if(view0 != null) {
            try {
                jSONObject0.put("can_show_on_lock_screen", zzs.zzo(view0));
                jSONObject0.put("is_keyguard_locked", zzs.zzE(context0));
                return jSONObject0;
            }
            catch(JSONException unused_ex) {
                zzo.zzj("Unable to get lock screen information");
            }
        }
        return jSONObject0;
    }

    public static JSONObject zzf(@Nullable View view0) {
        boolean z = true;
        JSONObject jSONObject0 = new JSONObject();
        if(view0 != null) {
            try {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzhN)).booleanValue()) {
                    ViewParent viewParent0;
                    for(viewParent0 = view0.getParent(); viewParent0 != null && !(viewParent0 instanceof ScrollView); viewParent0 = viewParent0.getParent()) {
                    }
                    if(viewParent0 == null) {
                        z = false;
                    }
                    jSONObject0.put("contained_in_scroll_view", z);
                    return jSONObject0;
                }
                ViewParent viewParent1;
                for(viewParent1 = view0.getParent(); viewParent1 != null && !(viewParent1 instanceof AdapterView); viewParent1 = viewParent1.getParent()) {
                }
                if((viewParent1 == null ? -1 : ((AdapterView)viewParent1).getPositionForView(view0)) == -1) {
                    z = false;
                }
                jSONObject0.put("contained_in_scroll_view", z);
            }
            catch(Exception unused_ex) {
            }
        }
        return jSONObject0;
    }

    public static JSONObject zzg(Context context0, @Nullable View view0) {
        String s;
        JSONObject jSONObject2;
        JSONObject jSONObject0 = new JSONObject();
        if(view0 != null) {
            try {
                int[] arr_v = zzbv.zzj(view0);
                new int[]{view0.getMeasuredWidth(), view0.getMeasuredHeight()};
                int v = view0.getMeasuredWidth();
                int v1 = view0.getMeasuredHeight();
                for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof ViewGroup; viewParent0 = viewParent0.getParent()) {
                    v = Math.min(((ViewGroup)viewParent0).getMeasuredWidth(), v);
                    v1 = Math.min(((ViewGroup)viewParent0).getMeasuredHeight(), v1);
                }
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("width", zzbc.zzb().zzb(context0, view0.getMeasuredWidth()));
                jSONObject1.put("height", zzbc.zzb().zzb(context0, view0.getMeasuredHeight()));
                jSONObject1.put("x", zzbc.zzb().zzb(context0, arr_v[0]));
                jSONObject1.put("y", zzbc.zzb().zzb(context0, arr_v[1]));
                jSONObject1.put("maximum_visible_width", zzbc.zzb().zzb(context0, v));
                jSONObject1.put("maximum_visible_height", zzbc.zzb().zzb(context0, v1));
                jSONObject1.put("relative_to", "window");
                jSONObject0.put("frame", jSONObject1);
                Rect rect0 = new Rect();
                if(view0.getGlobalVisibleRect(rect0)) {
                    jSONObject2 = zzbv.zzk(context0, rect0);
                }
                else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put("x", zzbc.zzb().zzb(context0, arr_v[0]));
                    jSONObject3.put("y", zzbc.zzb().zzb(context0, arr_v[1]));
                    jSONObject3.put("relative_to", "window");
                    jSONObject2 = jSONObject3;
                }
                jSONObject0.put("visible_bounds", jSONObject2);
            }
            catch(Exception unused_ex) {
                zzo.zzj("Unable to get native ad view bounding box");
            }
            ViewParent viewParent1 = view0.getParent();
            if(viewParent1 == null) {
            label_41:
                s = "";
            }
            else {
                try {
                    s = (String)viewParent1.getClass().getMethod("getTemplateTypeName", null).invoke(viewParent1, null);
                    goto label_42;
                }
                catch(NoSuchMethodException unused_ex) {
                    goto label_41;
                }
                catch(SecurityException | IllegalAccessException | InvocationTargetException securityException0) {
                }
                zzo.zzh("Cannot access method getTemplateTypeName: ", securityException0);
                goto label_41;
            }
            try {
            label_42:
                switch(s) {
                    case "medium_template": {
                        jSONObject0.put("native_template_type", 2);
                        goto label_51;
                    }
                    case "small_template": {
                        jSONObject0.put("native_template_type", 1);
                        goto label_51;
                    }
                    default: {
                        jSONObject0.put("native_template_type", 0);
                        goto label_51;
                    }
                }
            }
            catch(JSONException jSONException0) {
            }
            zzo.zzh("Could not log native template signal to JSON", jSONException0);
        label_51:
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzhP)).booleanValue()) {
                try {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                    jSONObject0.put("view_width_layout_type", zzbv.zzl(viewGroup$LayoutParams0.width) - 1);
                    jSONObject0.put("view_height_layout_type", zzbv.zzl(viewGroup$LayoutParams0.height) - 1);
                    return jSONObject0;
                }
                catch(Exception unused_ex) {
                    zze.zza("Unable to get native ad view layout types");
                }
            }
        }
        return jSONObject0;
    }

    public static boolean zzh(Context context0, zzfbo zzfbo0) {
        if(!zzfbo0.zzN) {
            return false;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhR)).booleanValue()) {
            return ((Boolean)zzbe.zzc().zza(zzbcl.zzhU)).booleanValue();
        }
        String s = (String)zzbe.zzc().zza(zzbcl.zzhS);
        if(!s.isEmpty() && context0 != null) {
            for(Object object0: zzfvc.zzb(zzfty.zzc(';')).zzd(s)) {
                if(((String)object0).equals("com.dcinside.app.android")) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static boolean zzi(int v) {
        return !((Boolean)zzbe.zzc().zza(zzbcl.zzdB)).booleanValue() || ((Boolean)zzbe.zzc().zza(zzbcl.zzdC)).booleanValue() || v <= 0xE9759F;
    }

    public static int[] zzj(@Nullable View view0) {
        int[] arr_v = new int[2];
        if(view0 != null) {
            view0.getLocationOnScreen(arr_v);
        }
        return arr_v;
    }

    private static JSONObject zzk(Context context0, Rect rect0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("width", zzbc.zzb().zzb(context0, rect0.right - rect0.left));
        jSONObject0.put("height", zzbc.zzb().zzb(context0, rect0.bottom - rect0.top));
        jSONObject0.put("x", zzbc.zzb().zzb(context0, rect0.left));
        jSONObject0.put("y", zzbc.zzb().zzb(context0, rect0.top));
        jSONObject0.put("relative_to", "self");
        return jSONObject0;
    }

    private static int zzl(int v) {
        switch(v) {
            case -2: {
                return 4;
            }
            case -1: {
                return 3;
            }
            default: {
                return 2;
            }
        }
    }
}

