package com.bytedance.sdk.component.adexpress.dynamic.JQp;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.adexpress.dynamic.cr.cz;
import com.bytedance.sdk.component.utils.Lrd;
import j..util.DesugarCollections;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class qj {
    private static final Set PjT;
    private static String Zh;

    static {
        qj.PjT = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"dislike", "close", "close-fill", "webview-close"})));
    }

    private static ReZ PjT(ReZ zh$ReZ0, String s, String s1, String s2) {
        if(s.contains("union")) {
            zh$ReZ0.PjT = 0.0f;
            zh$ReZ0.Zh = 0.0f;
            return zh$ReZ0;
        }
        if(TextUtils.isEmpty(s2)) {
            s2 = qj.PjT(s);
        }
        if(TextUtils.isEmpty(s2)) {
            zh$ReZ0.PjT = 0.0f;
            zh$ReZ0.Zh = 0.0f;
            return zh$ReZ0;
        }
        return qj.PjT(s2, s1);
    }

    public static ReZ PjT(String s, String s1) {
        return qj.PjT(s, s1, false);
    }

    public static ReZ PjT(String s, String s1, String s2, boolean z, boolean z1, int v, Au au0, double f, int v1, double f1, String s3, xs xs0) {
        float f11;
        float f10;
        int v6;
        float f9;
        float f8;
        float f7;
        float f5;
        int v4;
        int v3;
        ReZ zh$ReZ1;
        String s7;
        String s4 = s;
        String s5 = xs0.cr();
        int v2 = xs0.XX();
        if(cr.Zh() && v1 != 4 && (TextUtils.equals(s1, "text_star") || TextUtils.equals(s1, "score-count") || TextUtils.equals(s1, "score-count-type-1") || TextUtils.equals(s1, "score-count-type-2"))) {
            return new ReZ(0.0f, 0.0f);
        }
        ReZ zh$ReZ0 = new ReZ();
        if(!s4.startsWith("<svg") && !qj.PjT.contains(s1)) {
            if("logo".equals(s1)) {
                if(!cr.Zh() && (!TextUtils.isEmpty(s) && s4.contains("adx:") || qj.Zh())) {
                    return qj.Zh() ? qj.PjT(zh$ReZ0, s4, s2, qj.Zh) : qj.PjT(zh$ReZ0, s4, s2, "");
                }
                zh$ReZ0.PjT = "union".equals(s4) ? 14.0f : 20.0f;
                zh$ReZ0.Zh = 10.0f;
                if(cr.Zh()) {
                    if("union".equals(s4) && TextUtils.isEmpty(xs0.yIW())) {
                        zh$ReZ0.PjT = 0.0f;
                    }
                    float f2 = (float)qj.Zh(s2);
                    if((s1 + s4).contains("logoad")) {
                        String s6 = xs0.iZZ();
                        if(TextUtils.isEmpty(s6)) {
                            zh$ReZ0.PjT = 0.0f;
                            zh$ReZ0.Zh = f2;
                            return zh$ReZ0;
                        }
                        return qj.PjT(s6, s2);
                    }
                    zh$ReZ0.Zh = f2;
                }
                return zh$ReZ0;
            }
            if("development-name".equals(s1)) {
                s7 = "";
                s4 = Lrd.PjT(cr.PjT(), "tt_text_privacy_development") + s4;
            }
            else {
                s7 = "";
            }
            if("app-version".equals(s1)) {
                zh$ReZ1 = zh$ReZ0;
                s4 = Lrd.PjT(cr.PjT(), "tt_text_privacy_app_version") + s4;
            }
            else {
                zh$ReZ1 = zh$ReZ0;
            }
            if("score-count".equals(s1)) {
                try {
                    v3 = 0;
                    v3 = Integer.parseInt(s4);
                }
                catch(NumberFormatException unused_ex) {
                }
                return !cr.Zh() || v3 >= 0 ? qj.PjT(("(" + String.format(Lrd.PjT(cr.PjT(), "tt_comment_num"), v3) + ")"), s2) : new ReZ(0.0f, 0.0f);
            }
            if("score-count-type-2".equals(s1)) {
                try {
                    v4 = 0;
                    v4 = Integer.parseInt(s4);
                }
                catch(NumberFormatException unused_ex) {
                }
                return !cr.Zh() || v4 >= 0 ? qj.PjT(("(" + String.format(new DecimalFormat("###,###,###").format(((long)v4)), v4) + ")"), s2) : new ReZ(0.0f, 0.0f);
            }
            if("feedback-dislike".equals(s1)) {
                if(cr.Zh()) {
                    ReZ zh$ReZ2 = new ReZ();
                    float f3 = (float)qj.Zh(s2);
                    zh$ReZ2.PjT = f3;
                    zh$ReZ2.Zh = f3;
                    return zh$ReZ2;
                }
                return qj.PjT(Lrd.PjT(cr.PjT(), "tt_reward_feedback"), s2);
            }
            if(!"skip-with-time-countdown".equals(s1) && !TextUtils.equals("skip-with-countdowns-video-countdown", s1)) {
                if(TextUtils.equals("skip-with-countdowns-skip-btn", s1)) {
                    return qj.PjT(("| " + Lrd.PjT(cr.PjT(), "tt_reward_screen_skip_tx")), s2);
                }
                if(TextUtils.equals("skip-with-countdowns-skip-countdown", s1)) {
                    return qj.PjT(("| " + String.format(Lrd.PjT(cr.PjT(), "tt_reward_full_skip_count_down"), "00")), s2);
                }
                if("skip-with-time-skip-btn".equals(s1)) {
                    ReZ zh$ReZ3 = qj.PjT(("| " + Lrd.PjT(cr.PjT(), "tt_reward_screen_skip_tx")), s2);
                    if(cr.Zh()) {
                        try {
                            double f4 = new JSONObject(s2).optDouble("lineHeight");
                            zh$ReZ3.Zh = (float)(((double)zh$ReZ3.Zh) * f4 / 1.2);
                        }
                        catch(Throwable unused_ex) {
                        }
                        zh$ReZ3.PjT = zh$ReZ3.Zh;
                    }
                    return zh$ReZ3;
                }
                if("skip".equals(s1)) {
                    return qj.PjT(Lrd.PjT(cr.PjT(), "tt_reward_screen_skip_tx"), s2);
                }
                if("timedown".equals(s1)) {
                    return qj.PjT("0.0", s2);
                }
                if("text_star".equals(s1)) {
                    return !cr.Zh() || f1 >= 0.0 && f1 <= 5.0 ? qj.PjT("0.0", s2) : new ReZ(0.0f, 0.0f);
                }
                if(TextUtils.equals("privacy-detail", s1)) {
                    return qj.PjT("Permission list | Privacy policy", s2);
                }
                if("arrowButton".equals(s1)) {
                    return qj.PjT("Download", s2);
                }
                if("text".equals(s1) && cr.Zh() && TextUtils.isEmpty(s4)) {
                    cz cz0 = au0.DWo().JQp();
                    if(cz0 != null) {
                        if(cz0.yks() != null) {
                            s7 = au0.DWo().JQp().yks().optString("");
                        }
                        s4 = s7;
                    }
                }
                if(!"fillButton".equals(s1) && !"text".equals(s1) && !"button".equals(s1) && !"downloadWithIcon".equals(s1) && !"downloadButton".equals(s1) && !"laceButton".equals(s1) && !"cardButton".equals(s1) && !"colourMixtureButton".equals(s1) && !"arrowButton".equals(s1) && (!"source".equals(s1) || cr.Zh() && "open_ad".equals(s5)) && !TextUtils.equals("app-version", s1) && !TextUtils.equals("development-name", s1)) {
                    try {
                        JSONObject jSONObject0 = new JSONObject(s2);
                        f5 = (float)jSONObject0.optDouble("fontSize");
                        float f6 = (float)jSONObject0.optDouble("letterSpacing");
                        f7 = (float)jSONObject0.optDouble("lineHeight");
                        f8 = (float)jSONObject0.optDouble("maxWidth");
                        f9 = ((float)s4.length()) * (f5 + f6) - f6;
                        if("muted".equals(s1)) {
                            zh$ReZ1.PjT = f5;
                            zh$ReZ1.Zh = f5;
                            return zh$ReZ1;
                        }
                        goto label_91;
                    }
                    catch(JSONException unused_ex) {
                        return zh$ReZ1;
                    }
                    try {
                        zh$ReZ1.PjT = f5;
                        zh$ReZ1.Zh = f5;
                        return zh$ReZ1;
                    label_91:
                        if("star".equals(s1)) {
                            if(cr.Zh() && (f1 < 0.0 || f1 > 5.0 || v1 != 4)) {
                                return new ReZ(0.0f, 0.0f);
                            }
                            ReZ zh$ReZ4 = qj.PjT("str", s2);
                            zh$ReZ4.PjT = f5 * 5.0f;
                            return zh$ReZ4;
                        }
                        if("icon".equals(s1)) {
                            zh$ReZ1.PjT = f5;
                            zh$ReZ1.Zh = f5;
                            return zh$ReZ1;
                        }
                        if(z) {
                            int v5 = ((int)(f9 / f8)) + 1;
                            v6 = v;
                            if(z1 && v5 >= v6) {
                                v5 = v6;
                            }
                            f10 = (float)(((double)(f7 * f5 * ((float)v5))) * 1.2);
                            f11 = f8;
                        }
                        else {
                            v6 = v;
                            f10 = (float)(((double)(f7 * f5)) * 1.2);
                            f11 = f9 <= f8 ? f9 : f8;
                        }
                        if("title".equals(s1) || cr.Zh() && "open_ad".equals(s5) && "source".equals(s1)) {
                            goto label_115;
                        }
                        zh$ReZ1.PjT = f11;
                        zh$ReZ1.Zh = f10;
                    }
                    catch(JSONException unused_ex) {
                    }
                    return zh$ReZ1;
                    try {
                    label_115:
                        ReZ zh$ReZ5 = qj.PjT(s4.replace('\n', ' '), s2, false);
                        if(z) {
                            int v7 = ((int)(f9 / f8)) + 1;
                            if(!z1 || v7 < v6) {
                                v6 = v7;
                            }
                            zh$ReZ5.Zh *= (float)v6;
                        }
                        return zh$ReZ5;
                    }
                    catch(Exception unused_ex) {
                        try {
                            zh$ReZ1.PjT = f11;
                            zh$ReZ1.Zh = f10;
                            return zh$ReZ1;
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                    return zh$ReZ1;
                }
                return qj.PjT(s4, s2);
            }
            if(xs0.PjT() && com.bytedance.sdk.component.adexpress.cr.cz.Zh(s5)) {
                if(((int)(f + 0.5)) - v2 < 10) {
                    return cr.Zh() ? qj.PjT("0s", s2) : qj.PjT(String.format(Lrd.PjT(cr.PjT(), "tt_reward_full_skip"), "0"), s2);
                }
                return cr.Zh() ? qj.PjT("00s", s2) : qj.PjT(String.format(Lrd.PjT(cr.PjT(), "tt_reward_full_skip"), "00"), s2);
            }
            return f < 10.0 ? qj.PjT("0S", s2) : qj.PjT("00S", s2);
        }
        try {
            if("close".equals(s1) || cr.Zh() && "close-fill".equals(s1)) {
                float f12 = (float)new JSONObject(s2).optDouble("fontSize");
                zh$ReZ0.PjT = f12;
                zh$ReZ0.Zh = f12;
                return zh$ReZ0;
            }
        }
        catch(Exception unused_ex) {
        }
        zh$ReZ0.PjT = 10.0f;
        zh$ReZ0.Zh = 10.0f;
        return zh$ReZ0;
    }

    public static ReZ PjT(String s, String s1, boolean z) {
        ReZ zh$ReZ0 = new ReZ();
        try {
            JSONObject jSONObject0 = new JSONObject(s1);
            int[] arr_v = qj.PjT(s, ((float)qj.Zh(s1)), z);
            zh$ReZ0.PjT = (float)arr_v[0];
            zh$ReZ0.Zh = (float)arr_v[1];
            if(jSONObject0.optDouble("lineHeight", 1.0) == 0.0) {
                zh$ReZ0.Zh = 0.0f;
            }
        }
        catch(Exception unused_ex) {
        }
        return zh$ReZ0;
    }

    public static String PjT() {
        return qj.Zh;
    }

    public static String PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String[] arr_s = s.split("adx:");
        return arr_s == null || arr_s.length < 2 ? "" : arr_s[1];
    }

    public static int[] PjT(String s, float f, boolean z) {
        int[] arr_v = qj.Zh(s, f, z);
        return new int[]{XX.Zh(cr.PjT(), ((float)arr_v[0])), XX.Zh(cr.PjT(), ((float)arr_v[1]))};
    }

    public static double Zh(String s) {
        try {
            return Double.parseDouble(new JSONObject(s).optString("fontSize"));
        }
        catch(Throwable unused_ex) {
            return 0.0;
        }
    }

    public static boolean Zh() {
        return !TextUtils.isEmpty(qj.Zh);
    }

    public static int[] Zh(String s, float f, boolean z) {
        try {
            TextView textView0 = new TextView(cr.PjT());
            textView0.setTextSize(f);
            textView0.setText(s);
            textView0.setIncludeFontPadding(false);
            if(z) {
                textView0.setSingleLine();
            }
            textView0.measure(-2, -2);
            return new int[]{textView0.getMeasuredWidth() + 2, textView0.getMeasuredHeight() + 2};
        }
        catch(Exception unused_ex) {
            return new int[]{0, 0};
        }
    }
}

