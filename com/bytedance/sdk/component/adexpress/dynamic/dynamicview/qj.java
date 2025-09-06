package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.drawable.a;
import com.bytedance.sdk.component.JQp.Au;
import com.bytedance.sdk.component.JQp.qla;
import com.bytedance.sdk.component.JQp.xE;
import com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ;
import com.bytedance.sdk.component.adexpress.cr.SM;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.cz.DWo;
import com.bytedance.sdk.component.adexpress.cz.cRA;
import com.bytedance.sdk.component.adexpress.cz.xs;
import com.bytedance.sdk.component.utils.Lrd;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class qj extends cz {
    static class PjT implements Au {
        private final WeakReference PjT;

        public PjT(Context context0) {
            this.PjT = new WeakReference(context0);
        }

        @Override  // com.bytedance.sdk.component.JQp.Au
        public Bitmap PjT(Bitmap bitmap0) {
            Context context0 = (Context)this.PjT.get();
            return context0 == null ? null : com.bytedance.sdk.component.adexpress.cr.PjT.PjT(context0, bitmap0, 25);
        }
    }

    static class Zh implements xE {
        private WeakReference PjT;
        private Resources Zh;

        public Zh(View view0, Resources resources0) {
            this.PjT = new WeakReference(view0);
            this.Zh = resources0;
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(int v, String s, @Nullable Throwable throwable0) {
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(com.bytedance.sdk.component.JQp.qj qj0) {
            View view0 = (View)this.PjT.get();
            if(view0 == null) {
                return;
            }
            Bitmap bitmap0 = (Bitmap)qj0.Zh();
            if(bitmap0 != null && qj0.ReZ() != null) {
                view0.setBackground(new BitmapDrawable(this.Zh, bitmap0));
            }
        }
    }

    private String PjT;

    public qj(Context context0, @NonNull DynamicRootView dynamicRootView0, @NonNull com.bytedance.sdk.component.adexpress.dynamic.cr.Au au0) {
        super(context0, dynamicRootView0, au0);
        if(!TextUtils.isEmpty(this.xf.Xtz()) && au0.ltE()) {
            DWo dWo0 = new DWo(context0);
            dWo0.setAnimationsLoop(this.xf.ix());
            dWo0.setImageLottieTosPath(this.xf.Xtz());
            dWo0.setLottieAppNameMaxLength(this.xf.hN());
            dWo0.setLottieAdTitleMaxLength(this.xf.dIF());
            dWo0.setLottieAdDescMaxLength(this.xf.Nv());
            this.qla = dWo0;
        }
        else if(this.xf.qla() > 0.0f) {
            cRA cRA0 = new cRA(context0);
            this.qla = cRA0;
            cRA0.setXRound(((int)XX.PjT(context0, this.xf.qla())));
            ((cRA)this.qla).setYRound(((int)XX.PjT(context0, this.xf.qla())));
        }
        else if(!this.Au() && "arrowButton".equals(au0.DWo().Zh())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.Zh zh0 = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.Zh(context0);
            zh0.setBrickNativeValue(this.xf);
            this.qla = zh0;
        }
        else if(SM.Zh(this.xf.qj())) {
            this.qla = new xs(context0);
        }
        else {
            this.qla = new ImageView(context0);
        }
        this.PjT = this.getImageKey();
        this.qla.setTag(this.getClickArea());
        if("arrowButton".equals(au0.DWo().Zh())) {
            if(this.xf.Zh() > 0 || this.xf.PjT() > 0) {
                int v1 = Math.min(this.XX, this.Au);
                this.XX = v1;
                this.Au = Math.min(v1, this.Au);
                this.SM = (int)(((float)this.SM) + XX.PjT(context0, ((float)(this.xf.Zh() + this.xf.PjT() / 2)) + 0.5f));
            }
            else {
                int v = Math.max(this.XX, this.Au);
                this.XX = v;
                this.Au = Math.max(v, this.Au);
            }
            this.xf.PjT(((float)(this.XX / 2)));
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.XX, this.Au);
        this.addView(this.qla, frameLayout$LayoutParams0);
    }

    private boolean PjT() {
        String s = this.xf.xf();
        if(this.xf.Owx()) {
            return true;
        }
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            int v = jSONObject0.optInt("width");
            int v1 = jSONObject0.optInt("height");
            return Math.abs(((float)this.XX) / (((float)this.Au) * 1.0f) - ((float)v) / (((float)v1) * 1.0f)) <= 0.01f ? false : true;
        }
        catch(JSONException unused_ex) {
            return false;
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        int v2;
        int v = 0;
        super.SM();
        if(!TextUtils.isEmpty(this.xf.Xtz())) {
            ((ImageView)this.qla).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        if("arrowButton".equals(this.xs.DWo().Zh())) {
            ((ImageView)this.qla).setImageResource(Lrd.cr(this.qj, "tt_white_righterbackicon_titlebar"));
            if(((ImageView)this.qla).getDrawable() != null) {
                ((ImageView)this.qla).getDrawable().setAutoMirrored(true);
            }
            this.qla.setPadding(0, 0, 0, 0);
            ((ImageView)this.qla).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.qla.setBackgroundColor(this.xf.Yo());
        String s = this.xs.DWo().ReZ();
        if("user".equals(s)) {
            ((ImageView)this.qla).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView)this.qla).setColorFilter(this.xf.XX());
            ((ImageView)this.qla).setImageDrawable(Lrd.ReZ(this.getContext(), "tt_user"));
            ((ImageView)this.qla).setPadding(this.XX / 10, this.Au / 5, this.XX / 10, 0);
        }
        else if(s != null && s.startsWith("@")) {
            try {
                int v1 = Integer.parseInt(s.substring(1));
                ((ImageView)this.qla).setImageResource(v1);
            }
            catch(Exception unused_ex) {
            }
        }
        qla qla0 = com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().JQp();
        String s1 = this.xf.qj();
        if(!TextUtils.isEmpty(s1) && !s1.startsWith("http:") && !s1.startsWith("https:")) {
            s1 = com.bytedance.sdk.component.adexpress.dynamic.JQp.SM.Zh(s1, (this.fDm == null || this.fDm.getRenderRequest() == null ? null : this.fDm.getRenderRequest().Lrd()));
        }
        ReZ reZ0 = com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ();
        if(reZ0 == null) {
            v2 = 0;
        }
        else {
            v = reZ0.qla();
            v2 = reZ0.xE();
        }
        com.bytedance.sdk.component.JQp.DWo dWo0 = qla0.PjT(s1).PjT(this.PjT).PjT(this.XX).Zh(this.Au).cr(v).JQp(v2);
        String s2 = this.fDm.getRenderRequest().fDm();
        if(!TextUtils.isEmpty(s2)) {
            dWo0.Zh(s2);
        }
        if(this.PjT()) {
            ((ImageView)this.qla).setScaleType(ImageView.ScaleType.FIT_CENTER);
            dWo0.PjT(Bitmap.Config.ARGB_4444).ReZ(2).PjT(new PjT(this.qj)).PjT(new Zh(this.qla, this.getResources()));
        }
        else {
            if(cr.Zh()) {
                dWo0.ReZ(2).PjT(((ImageView)this.qla));
            }
            ((ImageView)this.qla).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if(this.qla instanceof ImageView && "cover".equals(this.getImageObjectFit())) {
            ((ImageView)this.qla).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }

    private String getImageKey() {
        Map map0 = this.fDm.getRenderRequest().qj();
        return map0 == null || map0.size() <= 0 ? null : ((String)map0.get(this.xf.qj()));
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable0 = ((ImageView)this.qla).getDrawable();
        if(Build.VERSION.SDK_INT >= 28 && a.a(drawable0)) {
            ((AnimatedImageDrawable)drawable0).start();
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable0 = ((ImageView)this.qla).getDrawable();
        if(Build.VERSION.SDK_INT >= 28 && a.a(drawable0)) {
            ((AnimatedImageDrawable)drawable0).stop();
        }
    }
}

