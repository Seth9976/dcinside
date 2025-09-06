package com.fsn.cauly;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CaulySpreadUtil {
    public static String SPREAD_TYPE1 = "TYPE1";
    public static String SPREAD_TYPE2 = "TYPE2";
    CaulyCustomAd a;
    private static CaulySpreadUtil b;
    static HashMap c;

    static {
    }

    public static float DptoPx(Context context0, float f) {
        return context0 == null ? 0.0f : TypedValue.applyDimension(1, f, context0.getResources().getDisplayMetrics());
    }

    View a(Context context0, String s, String s1, String s2) {
        if(!TextUtils.isEmpty(s) && s.equalsIgnoreCase("image")) {
            View view0 = new ImageView(context0);
            ((ImageView)view0).setScaleType(ImageView.ScaleType.FIT_XY);
            return view0;
        }
        return this.c(context0, s1);
    }

    public void addCaulySpreadAdItem(int v, CaulySpreadAdItem caulySpreadAdItem0) {
        HashMap hashMap0 = CaulySpreadUtil.c;
        if(hashMap0 != null) {
            hashMap0.put(v, caulySpreadAdItem0);
        }
    }

    RelativeLayout b(Context context0, ArrayList arrayList0) {
        RelativeLayout relativeLayout0 = new RelativeLayout(context0);
        int v = CaulySpreadUtil.getDeviceWidth(context0);
        if(arrayList0 == null) {
            return null;
        }
        for(Object object0: arrayList0) {
            CaulySpreadViewItem caulySpreadViewItem0 = (CaulySpreadViewItem)object0;
            if(caulySpreadViewItem0 == null || TextUtils.isEmpty(caulySpreadViewItem0.name)) {
            }
            else if(caulySpreadViewItem0.name.equals("frame")) {
                relativeLayout0.setBackgroundColor(CaulySpreadUtil.getColor(caulySpreadViewItem0.color));
            }
            else if(caulySpreadViewItem0.name.equals("image")) {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(caulySpreadViewItem0.width * v / 360, caulySpreadViewItem0.height * v / 360);
                relativeLayout$LayoutParams0.leftMargin = caulySpreadViewItem0.x * v / 360;
                relativeLayout$LayoutParams0.topMargin = caulySpreadViewItem0.y * v / 360;
                ImageView imageView0 = new ImageView(context0);
                if(!TextUtils.isEmpty(caulySpreadViewItem0.id)) {
                    imageView0.setTag(caulySpreadViewItem0.id);
                }
                imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
                relativeLayout0.addView(imageView0, relativeLayout$LayoutParams0);
            }
            else if(caulySpreadViewItem0.name.equals("web")) {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(caulySpreadViewItem0.width * v / 360, caulySpreadViewItem0.height * v / 360);
                WebView webView0 = new WebView(context0);
                relativeLayout$LayoutParams1.leftMargin = caulySpreadViewItem0.x * v / 360;
                relativeLayout$LayoutParams1.topMargin = caulySpreadViewItem0.y * v / 360;
                webView0.getSettings().setJavaScriptEnabled(true);
                webView0.setVerticalScrollBarEnabled(false);
                webView0.setHorizontalScrollBarEnabled(false);
                webView0.getSettings().setUseWideViewPort(true);
                webView0.setBackgroundColor(0);
                webView0.setLayerType(2, null);
                if(!TextUtils.isEmpty(caulySpreadViewItem0.id)) {
                    webView0.setTag(caulySpreadViewItem0.id);
                }
                relativeLayout0.addView(webView0, relativeLayout$LayoutParams1);
            }
            else if(caulySpreadViewItem0.name.equals("text")) {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                relativeLayout$LayoutParams2.leftMargin = caulySpreadViewItem0.x * v / 360;
                relativeLayout$LayoutParams2.topMargin = caulySpreadViewItem0.y * v / 360;
                TextView textView0 = new TextView(context0);
                textView0.setTextColor(CaulySpreadUtil.getColor(caulySpreadViewItem0.color));
                textView0.setText("" + caulySpreadViewItem0.text);
                if(!TextUtils.isEmpty(caulySpreadViewItem0.id)) {
                    textView0.setTag(caulySpreadViewItem0.id);
                }
                if(!TextUtils.isEmpty(caulySpreadViewItem0.font) && caulySpreadViewItem0.font.contains("px")) {
                    textView0.setTextSize(((float)CaulySpreadUtil.getScaledPosition(v, ((int)CaulySpreadUtil.pixelsToSp(context0, Integer.parseInt(caulySpreadViewItem0.font.replace("px", "")))))));
                }
                relativeLayout0.addView(textView0, relativeLayout$LayoutParams2);
            }
            else if(caulySpreadViewItem0.name.equals("video")) {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(caulySpreadViewItem0.width * v / 360, caulySpreadViewItem0.height * v / 360);
                relativeLayout$LayoutParams3.leftMargin = caulySpreadViewItem0.x * v / 360;
                relativeLayout$LayoutParams3.topMargin = caulySpreadViewItem0.y * v / 360;
            }
        }
        return relativeLayout0;
    }

    public void bindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        if(recyclerView$ViewHolder0 != null) {
            View view0 = recyclerView$ViewHolder0.itemView;
            if(view0 instanceof CaulySpreadView) {
                if(((CaulySpreadView)view0).getTag() instanceof Integer) {
                    int v1 = (int)(((Integer)((CaulySpreadView)view0).getTag()));
                    if(v1 > v) {
                        ((CaulySpreadView)view0).setBigResize();
                    }
                    else if(v1 < v) {
                        ((CaulySpreadView)view0).setSmallResize();
                    }
                }
                else {
                    ((CaulySpreadView)view0).setSmallResize();
                }
                ((CaulySpreadView)view0).bindView(v);
                ((CaulySpreadView)view0).setTag(v);
                this.f(v);
            }
        }
    }

    TextView c(Context context0, String s) {
        TextView textView0 = new TextView(context0);
        textView0.setText(s);
        textView0.setGravity(17);
        textView0.setTextSize(15.0f);
        textView0.setBackgroundColor(0);
        textView0.setTypeface(null, 1);
        return textView0;
    }

    public void clear() {
        HashMap hashMap0 = CaulySpreadUtil.c;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    public View createSpreadView(Context context0, String s, CaulySpreadView caulySpreadView0) {
        try {
            CaulySpreadAdItem caulySpreadAdItem0 = this.d(s);
            if(caulySpreadAdItem0 != null && caulySpreadAdItem0.adViewItem != null && caulySpreadAdItem0.height > 0) {
                int v = CaulySpreadUtil.getDeviceWidth(context0);
                View view0 = new LinearLayout(context0);
                RelativeLayout relativeLayout0 = new RelativeLayout(context0);
                relativeLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, caulySpreadAdItem0.height * v / 360));
                ((ViewGroup)view0).addView(relativeLayout0);
                if(caulySpreadView0 != null) {
                    caulySpreadView0.setMaxHeight(caulySpreadAdItem0.height);
                    CaulySpreadViewItem caulySpreadViewItem0 = this.e(caulySpreadAdItem0.adViewItem, "infobar");
                    if(caulySpreadViewItem0 != null) {
                        int v1 = caulySpreadViewItem0.height;
                        if(v1 > 0) {
                            caulySpreadView0.setMinHeight(v1);
                            caulySpreadView0.setLayoutParams(new ViewGroup.LayoutParams(-1, caulySpreadViewItem0.height * v / 360));
                            return view0;
                        }
                    }
                    caulySpreadView0.setLayoutParams(new ViewGroup.LayoutParams(-1, 50 * v / 360));
                }
                return view0;
            }
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    CaulySpreadAdItem d(String s) {
        HashMap hashMap0 = CaulySpreadUtil.c;
        if(hashMap0 != null) {
            for(Object object0: hashMap0.keySet()) {
                CaulySpreadAdItem caulySpreadAdItem0 = (CaulySpreadAdItem)CaulySpreadUtil.c.get(((Integer)object0));
                if(s != null && s.equalsIgnoreCase(caulySpreadAdItem0.spread_type)) {
                    return caulySpreadAdItem0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    CaulySpreadViewItem e(ArrayList arrayList0, String s) {
        if(arrayList0 == null) {
            return null;
        }
        if(s != null) {
            for(Object object0: arrayList0) {
                CaulySpreadViewItem caulySpreadViewItem0 = (CaulySpreadViewItem)object0;
                if(!TextUtils.isEmpty(caulySpreadViewItem0.name) && s.equalsIgnoreCase(caulySpreadViewItem0.name)) {
                    return caulySpreadViewItem0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    void f(int v) {
        CaulySpreadAdItem caulySpreadAdItem0 = this.getCaulySpreadAdItem(v);
        if(caulySpreadAdItem0 != null && !TextUtils.isEmpty(caulySpreadAdItem0.id)) {
            CaulyCustomAd caulyCustomAd0 = this.a;
            if(caulyCustomAd0 != null) {
                caulyCustomAd0.sendImpressInform(caulySpreadAdItem0.id);
            }
        }
    }

    ArrayList g(String s) {
        if(!TextUtils.isEmpty(s)) {
            try {
                if(s.startsWith("http")) {
                    ArrayList arrayList0 = new ArrayList();
                    CaulySpreadViewItem caulySpreadViewItem0 = new CaulySpreadViewItem();
                    caulySpreadViewItem0.name = "frame";
                    caulySpreadViewItem0.x = 0;
                    caulySpreadViewItem0.y = 0;
                    caulySpreadViewItem0.width = 360;
                    caulySpreadViewItem0.height = 0xD5;
                    caulySpreadViewItem0.type = "TYPE1";
                    caulySpreadViewItem0.click_percent = 100;
                    arrayList0.add(caulySpreadViewItem0);
                    CaulySpreadViewItem caulySpreadViewItem1 = new CaulySpreadViewItem();
                    caulySpreadViewItem1.name = "image";
                    caulySpreadViewItem1.x = 0;
                    caulySpreadViewItem1.y = 0;
                    caulySpreadViewItem1.width = 360;
                    caulySpreadViewItem1.height = 0xD5;
                    caulySpreadViewItem1.url = s;
                    caulySpreadViewItem1.id = "IMAGE1";
                    arrayList0.add(caulySpreadViewItem1);
                    return arrayList0;
                }
                ArrayList arrayList1 = new ArrayList();
                JSONArray jSONArray0 = new JSONObject(s.replace("&quot;", "\"")).getJSONArray("list");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    CaulySpreadViewItem caulySpreadViewItem2 = new CaulySpreadViewItem();
                    JSONObject jSONObject0 = new JSONObject(jSONArray0.get(v).toString());
                    if(!jSONObject0.isNull("name")) {
                        caulySpreadViewItem2.name = jSONObject0.getString("name");
                    }
                    if(!jSONObject0.isNull("link")) {
                        caulySpreadViewItem2.link = jSONObject0.getString("link");
                    }
                    if(!jSONObject0.isNull("color")) {
                        caulySpreadViewItem2.color = jSONObject0.getString("color");
                    }
                    if(!jSONObject0.isNull("text")) {
                        caulySpreadViewItem2.text = jSONObject0.getString("text");
                    }
                    if(!jSONObject0.isNull("font")) {
                        caulySpreadViewItem2.font = jSONObject0.getString("font");
                    }
                    if(!jSONObject0.isNull("url")) {
                        caulySpreadViewItem2.url = jSONObject0.getString("url");
                    }
                    if(!jSONObject0.isNull("x")) {
                        caulySpreadViewItem2.x = jSONObject0.getInt("x");
                    }
                    if(!jSONObject0.isNull("y")) {
                        caulySpreadViewItem2.y = jSONObject0.getInt("y");
                    }
                    if(!jSONObject0.isNull("width")) {
                        caulySpreadViewItem2.width = jSONObject0.getInt("width");
                    }
                    if(!jSONObject0.isNull("height")) {
                        caulySpreadViewItem2.height = jSONObject0.getInt("height");
                    }
                    if(!jSONObject0.isNull("min_height")) {
                        caulySpreadViewItem2.min_height = jSONObject0.getInt("min_height");
                    }
                    if(!jSONObject0.isNull("type")) {
                        caulySpreadViewItem2.type = jSONObject0.getString("type");
                    }
                    if(!jSONObject0.isNull("id")) {
                        caulySpreadViewItem2.id = jSONObject0.getString("id");
                    }
                    if(!jSONObject0.isNull("click_percent")) {
                        caulySpreadViewItem2.click_percent = jSONObject0.getInt("click_percent");
                    }
                    if(!jSONObject0.isNull("click_id")) {
                        caulySpreadViewItem2.click_id = jSONObject0.getString("click_id");
                    }
                    arrayList1.add(caulySpreadViewItem2);
                }
                return arrayList1;
            }
            catch(JSONException unused_ex) {
            }
        }
        return null;
    }

    public CaulySpreadAdItem getCaulySpreadAdItem(int v) {
        return CaulySpreadUtil.c == null ? null : ((CaulySpreadAdItem)CaulySpreadUtil.c.get(v));
    }

    public static int getColor(String s) {
        try {
            if(!TextUtils.isEmpty(s)) {
                if(!s.startsWith("rgb")) {
                    return s.startsWith("#") ? Color.parseColor(s) : Color.parseColor(('#' + s));
                }
                String[] arr_s = s.replace("rgb(", "").replace(")", "").replace(" ", "").split(",");
                return arr_s == null || arr_s.length != 3 ? 0xFF000000 : Color.rgb(Integer.parseInt(arr_s[0]), Integer.parseInt(arr_s[1]), Integer.parseInt(arr_s[2]));
            }
        }
        catch(Exception unused_ex) {
        }
        return 0xFF000000;
    }

    public static int getDeviceWidth(Context context0) {
        return context0 == null ? -1 : context0.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getScaledPosition(int v, int v1) [...] // Inlined contents

    public String getSpreadType(int v) {
        CaulySpreadAdItem caulySpreadAdItem0 = this.getCaulySpreadAdItem(v);
        return caulySpreadAdItem0 == null ? "" : caulySpreadAdItem0.spread_type;
    }

    public void init(CaulyCustomAd caulyCustomAd0) {
        this.a = caulyCustomAd0;
    }

    public static CaulySpreadUtil instance() {
        if(CaulySpreadUtil.b == null) {
            CaulySpreadUtil.b = new CaulySpreadUtil();
            CaulySpreadUtil.c = new HashMap();
        }
        return CaulySpreadUtil.b;
    }

    public boolean isSpreadAdItem(int v) {
        return this.getCaulySpreadAdItem(v) != null;
    }

    public static float pixelsToSp(Context context0, int v) {
        if(context0 == null) {
            return 0.0f;
        }
        float f = context0.getResources().getDisplayMetrics().scaledDensity;
        return f == 0.0f ? 0.0f : ((float)v) / f;
    }

    public CaulySpreadAdItem removeCaulySpreadAdItem(int v) {
        return CaulySpreadUtil.c == null ? null : ((CaulySpreadAdItem)CaulySpreadUtil.c.remove(v));
    }
}

