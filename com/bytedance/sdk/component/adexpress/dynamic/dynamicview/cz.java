package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.SM;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.adexpress.dynamic.cr.DWo;
import com.bytedance.sdk.component.utils.yIW;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class cz extends JQp {
    static class PjT implements xE {
        private final WeakReference PjT;
        private final Au ReZ;
        private final WeakReference Zh;

        public PjT(View view0, DynamicRootView dynamicRootView0, Au au0) {
            this.PjT = new WeakReference(view0);
            this.Zh = new WeakReference(dynamicRootView0);
            this.ReZ = au0;
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(int v, String s, @Nullable Throwable throwable0) {
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(qj qj0) {
            View view0 = (View)this.PjT.get();
            if(cr.Zh()) {
                if(view0 == null) {
                    return;
                }
                view0.setBackground(new BitmapDrawable(((Bitmap)qj0.Zh())));
                if(this.ReZ != null && this.ReZ.DWo() != null && 6 == this.ReZ.DWo().PjT() && view0.getBackground() != null) {
                    view0.getBackground().setAutoMirrored(true);
                }
                return;
            }
            DynamicRootView dynamicRootView0 = (DynamicRootView)this.Zh.get();
            if(dynamicRootView0 == null) {
                return;
            }
            if(!"open_ad".equals(dynamicRootView0.getRenderRequest().cr()) && !"splash_ad".equals(dynamicRootView0.getRenderRequest().cr())) {
                view0.setBackground(new BitmapDrawable(((Bitmap)qj0.Zh())));
                return;
            }
            view0.setBackground(new BitmapDrawable(((Bitmap)qj0.Zh())));
        }
    }

    static class ReZ implements com.bytedance.sdk.component.JQp.Au {
        private final WeakReference PjT;
        private final int Zh;

        public ReZ(Context context0, int v) {
            this.PjT = new WeakReference(context0);
            this.Zh = v;
        }

        @Override  // com.bytedance.sdk.component.JQp.Au
        public Bitmap PjT(Bitmap bitmap0) {
            Context context0 = (Context)this.PjT.get();
            return context0 == null ? null : com.bytedance.sdk.component.adexpress.cr.PjT.PjT(context0, bitmap0, this.Zh);
        }
    }

    static class Zh implements xE {
        private final WeakReference PjT;
        private final WeakReference Zh;

        public Zh(View view0, JQp jQp0) {
            this.PjT = new WeakReference(view0);
            this.Zh = new WeakReference(jQp0);
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(int v, String s, @Nullable Throwable throwable0) {
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(qj qj0) {
            View view0 = (View)this.PjT.get();
            if(view0 == null) {
                return;
            }
            Bitmap bitmap0 = (Bitmap)qj0.Zh();
            if(bitmap0 != null && qj0.ReZ() != null) {
                JQp jQp0 = (JQp)this.Zh.get();
                if(jQp0 != null) {
                    view0.setBackground(jQp0.PjT(bitmap0));
                }
            }
        }
    }

    private static String Owx = "";
    private Runnable PjT;
    private volatile boolean RD;
    private Runnable Zh;
    protected SM ltE;

    static {
    }

    public cz(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        this.RD = true;
        this.setTag(this.getClickArea());
        String s = au0.DWo().Zh();
        if("logo-union".equals(s)) {
            dynamicRootView0.setLogoUnionHeight(this.Au - ((int)XX.PjT(context0, ((float)(this.xf.Zh() + this.xf.PjT())))));
            return;
        }
        if("scoreCountWithIcon".equals(s)) {
            dynamicRootView0.setScoreCountWithIcon(this.Au - ((int)XX.PjT(context0, ((float)(this.xf.Zh() + this.xf.PjT())))));
        }
    }

    private String PjT(Object object0) {
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof JSONArray) {
            return this.PjT(((JSONArray)object0).opt(0));
        }
        return object0 instanceof JSONObject ? this.PjT(((JSONObject)object0).optString("url")) : null;
    }

    private void PjT() {
        if(!this.RD) {
            return;
        }
        int v = this.xf.dwk();
        int v1 = this.xf.MWx();
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz.4 cz$40 = new Runnable() {
            final cz PjT;

            @Override
            public void run() {
                DynamicRootView dynamicRootView0 = cz.this.fDm;
                if(dynamicRootView0 == null || dynamicRootView0.getRenderRequest() == null) {
                    cz.this.ltE = new SM(cz.this.qj, cz.this, cz.this.xf);
                }
                else {
                    xs xs0 = cz.this.fDm.getRenderRequest();
                    DWo dWo0 = new DWo();
                    dWo0.PjT(xs0.qla());
                    dWo0.Zh(xs0.xE());
                    dWo0.ReZ(xs0.ub());
                    dWo0.PjT(xs0.gK());
                    dWo0.Zh(xs0.ltE());
                    dWo0.ReZ(xs0.Owx());
                    dWo0.cr(xs0.RD());
                    dWo0.JQp(xs0.Sks());
                    cz.this.ltE = new SM(cz.this.qj, cz.this, cz.this.xf, dWo0, xs0);
                }
                cz.this.Zh(cz.this.ltE);
                if(cz.this.getParent() instanceof ViewGroup) {
                    ((ViewGroup)cz.this.getParent()).setClipChildren(false);
                }
                cz.this.setClipChildren(false);
                cz.this.ltE.setTag(2);
                cz.this.PjT(cz.this);
                SM sM0 = cz.this.ltE;
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
                cz.this.addView(sM0, frameLayout$LayoutParams0);
                cz.this.ltE.ReZ();
            }
        };
        this.PjT = cz$40;
        this.postDelayed(cz$40, ((long)v) * 1000L);
        if(!this.xf.Ld() && v1 < 0x7FFFFFFF && v < v1) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz.5 cz$50 = new Runnable() {
                final cz PjT;

                @Override
                public void run() {
                    cz cz0 = cz.this;
                    if(cz0.ltE != null) {
                        cz0.RD = false;
                        cz.this.ltE.cr();
                        cz.this.ltE.setVisibility(4);
                        cz.this.removeView(cz.this.ltE);
                    }
                }
            };
            this.Zh = cz$50;
            this.postDelayed(cz$50, ((long)v1) * 1000L);
        }
    }

    private void PjT(double f, View view0) {
        if(f > 0.0) {
            com.bytedance.sdk.component.utils.SM.Zh().postDelayed(new Runnable() {
                final cz Zh;

                @Override
                public void run() {
                    if(cz.this.xs.DWo().JQp().kWj() != null) {
                        return;
                    }
                    view0.setVisibility(0);
                    cz.this.setVisibility(0);
                }
            }, ((long)(f * 1000.0)));
        }
    }

    private void PjT(ViewGroup viewGroup0) {
        if(viewGroup0 != null && viewGroup0.getChildCount() > 0) {
            for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
                if(viewGroup0.getChildAt(v) instanceof SM) {
                    viewGroup0.removeViewAt(v);
                }
            }
        }
    }

    private static void PjT(com.bytedance.sdk.component.JQp.DWo dWo0) {
        if("SMARTISAN".equals(Build.BRAND) && "SM901".equals(cz.getBuildModel())) {
            dWo0.PjT(Bitmap.Config.ARGB_8888);
        }
    }

    private Drawable ReZ(String s) {
        try {
            JSONArray jSONArray0 = new JSONArray(s);
            ArrayList arrayList0 = new ArrayList();
            String s1 = "";
            for(int v = 0; v < jSONArray0.length(); ++v) {
                if(jSONArray0.getString(v).startsWith("#")) {
                    arrayList0.add(jSONArray0.getString(v));
                }
                else if(jSONArray0.getString(v).endsWith("deg")) {
                    s1 = jSONArray0.getString(v);
                }
            }
            if(arrayList0.size() <= 0) {
                return null;
            }
            int[] arr_v = new int[arrayList0.size()];
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                arr_v[v1] = com.bytedance.sdk.component.adexpress.dynamic.cr.XX.PjT(((String)arrayList0.get(v1)).substring(0, 7));
            }
            Drawable drawable0 = this.PjT(this.PjT(s1), arr_v);
            ((GradientDrawable)drawable0).setShape(0);
            ((GradientDrawable)drawable0).setCornerRadius(XX.PjT(this.qj, this.xf.qla()));
            return drawable0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Co
    public boolean SM() {
        int v1;
        int v;
        CharSequence charSequence0;
        View view0 = this.qla;
        if(view0 == null) {
            view0 = this;
        }
        this.setContentDescription(this.xs.PjT(this.xf.iZZ()));
        String s = this.xf.RV();
        String s1 = null;
        if(TextUtils.isEmpty(s) || (this.fDm == null || this.fDm.getRenderRequest() == null || this.fDm.getRenderRequest().ReZ() == null)) {
            charSequence0 = null;
        }
        else {
            JSONObject jSONObject0 = this.fDm.getRenderRequest().ReZ().optJSONObject("creative");
            charSequence0 = jSONObject0 == null ? null : this.PjT(jSONObject0.opt(s));
        }
        if(TextUtils.isEmpty(charSequence0)) {
            charSequence0 = this.xf.RD();
        }
        com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ reZ0 = com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ();
        if(reZ0 == null) {
            v = 0;
            v1 = 0;
        }
        else {
            v = reZ0.qla();
            v1 = reZ0.xE();
        }
        if(this.xf.Owx()) {
            int v2 = this.xf.ltE();
            String s2 = this.xf.Zh;
            com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().JQp().PjT(s2).PjT(this.XX).Zh(this.Au).cr(v).JQp(v1).PjT(this.Zh(s2)).ReZ(2).PjT(new ReZ(this.qj, v2)).PjT(new Zh(view0, this));
        }
        else if(!TextUtils.isEmpty(charSequence0)) {
            if(!((String)charSequence0).startsWith("http:") && !((String)charSequence0).startsWith("https:")) {
                if(this.fDm != null && this.fDm.getRenderRequest() != null) {
                    s1 = this.fDm.getRenderRequest().Lrd();
                }
                charSequence0 = com.bytedance.sdk.component.adexpress.dynamic.JQp.SM.Zh(((String)charSequence0), s1);
            }
            com.bytedance.sdk.component.JQp.DWo dWo0 = com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().JQp().PjT(((String)charSequence0)).PjT(this.XX).Zh(this.Au).cr(v).JQp(v1).PjT(this.Zh(((String)charSequence0))).ReZ(2);
            cz.PjT(dWo0);
            dWo0.PjT(new PjT(view0, this.fDm, this.xs));
        }
        if(this.getBackground() == null) {
            Drawable drawable0 = this.getBackgroundDrawable();
            if(drawable0 != null) {
                view0.setBackground(drawable0);
            }
        }
        if(this.xf.KM() > 0.0) {
            this.postDelayed(new Runnable() {
                final cz Zh;

                @Override
                public void run() {
                    try {
                        if(cz.this.xf.wN() > 0) {
                            String s = (String)cz.this.fDm.getBgMaterialCenterCalcColor().get(cz.this.xf.wN());
                            Drawable drawable0 = cz.this.ReZ(s);
                            if(drawable0 == null) {
                                String s1 = (String)cz.this.fDm.getBgMaterialCenterCalcColor().get(cz.this.xf.wN());
                                drawable0 = cz.this.PjT(true, s1);
                            }
                            if(drawable0 != null) {
                                view0.setBackground(drawable0);
                                return;
                            }
                            Drawable drawable1 = cz.this.PjT(true, cz.this.fDm.getBgColor());
                            view0.setBackground(drawable1);
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }, ((long)(this.xf.KM() * 1000.0)));
        }
        View view1 = this.qla;
        if(view1 != null) {
            view1.setPadding(((int)XX.PjT(this.qj, ((float)this.xf.ReZ()))), ((int)XX.PjT(this.qj, ((float)this.xf.Zh()))), ((int)XX.PjT(this.qj, ((float)this.xf.cr()))), ((int)XX.PjT(this.qj, ((float)this.xf.PjT()))));
        }
        if(this.xE || this.xf.fDm() > 0.0) {
            this.setShouldInvisible(true);
            view0.setVisibility(4);
            this.setVisibility(4);
        }
        return true;
    }

    private String Zh(String s) {
        try {
            Map map0 = this.fDm.getRenderRequest().qj();
            return map0 == null || map0.size() <= 0 ? null : ((String)map0.get(s));
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    private static String getBuildModel() {
        try {
            cz.Owx = yIW.PjT();
        }
        catch(Throwable unused_ex) {
            cz.Owx = Build.MODEL;
        }
        cz.Owx = Build.MODEL;
        return "";
    }

    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.XX, this.Au);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    protected void onAttachedToWindow() {
        View view0 = this.qla;
        if(view0 == null) {
            view0 = this;
        }
        double f = this.xs.DWo().JQp().Owx();
        if(f < 90.0 && f > 0.0) {
            com.bytedance.sdk.component.utils.SM.Zh().postDelayed(new Runnable() {
                final cz PjT;

                @Override
                public void run() {
                    cz.this.setVisibility(8);
                }
            }, ((long)(f * 1000.0)));
        }
        this.PjT(this.xs.DWo().JQp().ltE(), view0);
        if(!TextUtils.isEmpty(this.xf.IJ())) {
            this.PjT();
        }
        super.onAttachedToWindow();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            this.removeCallbacks(this.PjT);
            this.removeCallbacks(this.Zh);
        }
        catch(Exception unused_ex) {
        }
    }
}

