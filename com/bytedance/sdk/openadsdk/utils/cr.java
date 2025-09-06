package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;

public class cr {
    static class PjT implements View.OnLayoutChangeListener {
        private final Drawable PjT;
        private int ReZ;
        private int Zh;

        public PjT(Drawable drawable0) {
            this.PjT = drawable0;
        }

        @Override  // android.view.View$OnLayoutChangeListener
        public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
            int v8 = v2 - v;
            int v9 = v3 - v1;
            if(v8 == this.Zh && v9 == this.ReZ) {
                return;
            }
            this.Zh = v8;
            this.ReZ = v9;
            this.PjT.setBounds(0, 0, v8, v9);
        }
    }

    @Nullable
    private static Drawable PjT(Resources resources0, Owx owx0) {
        try {
            String s = owx0.WAt();
            if(TextUtils.isEmpty(s)) {
                return null;
            }
            byte[] arr_b = Base64.decode(s, 0);
            Drawable drawable0 = new BitmapDrawable(resources0, BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
            ((BitmapDrawable)drawable0).setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
            ((BitmapDrawable)drawable0).setTargetDensity(resources0.getDisplayMetrics());
            return drawable0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void PjT(Activity activity0, Owx owx0) {
        if(activity0 != null && owx0 != null && !TextUtils.isEmpty(owx0.WAt())) {
            try {
                View view0 = activity0.getWindow().getDecorView();
                int v = qla.en;
                if(view0.getTag(v) != null) {
                    return;
                }
                activity0.getWindow().getDecorView().setTag(v, v);
                Drawable drawable0 = cr.PjT(activity0.getResources(), owx0);
                if(drawable0 == null) {
                    return;
                }
                if(Build.VERSION.SDK_INT >= 23) {
                    activity0.getWindow().getDecorView().setForeground(drawable0);
                    return;
                }
                activity0.getWindow().getDecorView().getOverlay().add(drawable0);
                activity0.getWindow().getDecorView().addOnLayoutChangeListener(new PjT(drawable0));
                return;
            }
            catch(Throwable throwable0) {
            }
            RD.Zh("add overlay fail", throwable0.getMessage());
        }
    }

    public static void PjT(ViewGroup viewGroup0, Owx owx0) {
        if(viewGroup0 != null && owx0 != null && !TextUtils.isEmpty(owx0.WAt())) {
            try {
                int v = qla.en;
                if(viewGroup0.getTag(v) != null) {
                    return;
                }
                viewGroup0.setTag(v, v);
                Drawable drawable0 = cr.PjT(viewGroup0.getResources(), owx0);
                if(drawable0 == null) {
                    return;
                }
                if(Build.VERSION.SDK_INT >= 23) {
                    viewGroup0.setForeground(drawable0);
                    return;
                }
                viewGroup0.getOverlay().add(drawable0);
                viewGroup0.addOnLayoutChangeListener(new PjT(drawable0));
                return;
            }
            catch(Throwable throwable0) {
            }
            RD.Zh("add overlay fail", throwable0.getMessage());
        }
    }
}

