package com.bytedance.adsdk.Zh.Zh;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import com.bytedance.adsdk.Zh.ReZ.XX;
import com.bytedance.adsdk.Zh.ReZ;
import java.util.HashMap;
import java.util.Map;

public class PjT {
    private ReZ JQp;
    private final XX PjT;
    private final Map ReZ;
    private final Map Zh;
    private final AssetManager cr;
    private String cz;

    public PjT(Drawable.Callback drawable$Callback0, ReZ reZ0) {
        this.PjT = new XX();
        this.Zh = new HashMap();
        this.ReZ = new HashMap();
        this.cz = ".ttf";
        this.JQp = reZ0;
        if(!(drawable$Callback0 instanceof View)) {
            this.cr = null;
            return;
        }
        this.cr = ((View)drawable$Callback0).getContext().getAssets();
    }

    private Typeface PjT(Typeface typeface0, String s) {
        boolean z = s.contains("Italic");
        boolean z1 = s.contains("Bold");
        if(z && z1) {
            return typeface0.getStyle() == 3 ? typeface0 : Typeface.create(typeface0, 3);
        }
        if(z) {
            return typeface0.getStyle() == 2 ? typeface0 : Typeface.create(typeface0, 2);
        }
        int v = z1 ? 1 : 0;
        return typeface0.getStyle() == v ? typeface0 : Typeface.create(typeface0, v);
    }

    public Typeface PjT(com.bytedance.adsdk.Zh.ReZ.ReZ reZ0) {
        this.PjT.PjT(reZ0.PjT(), reZ0.ReZ());
        Typeface typeface0 = (Typeface)this.Zh.get(this.PjT);
        if(typeface0 != null) {
            return typeface0;
        }
        Typeface typeface1 = this.PjT(this.Zh(reZ0), reZ0.ReZ());
        this.Zh.put(this.PjT, typeface1);
        return typeface1;
    }

    public void PjT(ReZ reZ0) {
        this.JQp = reZ0;
    }

    public void PjT(String s) {
        this.cz = s;
    }

    private Typeface Zh(com.bytedance.adsdk.Zh.ReZ.ReZ reZ0) {
        Typeface typeface1;
        String s = reZ0.PjT();
        Typeface typeface0 = (Typeface)this.ReZ.get(s);
        if(typeface0 != null) {
            return typeface0;
        }
        if(reZ0.cr() != null) {
            return reZ0.cr();
        }
        try {
            typeface1 = Typeface.createFromAsset(this.cr, "fonts/" + s + this.cz);
        }
        catch(Throwable unused_ex) {
            typeface1 = Typeface.DEFAULT;
        }
        this.ReZ.put(s, typeface1);
        return typeface1;
    }
}

