package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.c;
import com.facebook.imagepipeline.systrace.b;
import k1.n.a;
import k1.n;
import o3.h;

@Deprecated
@n(a.a)
public class GenericDraweeView extends DraweeView {
    public GenericDraweeView(Context context0) {
        super(context0);
        this.j(context0, null);
    }

    public GenericDraweeView(Context context0, @h AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.j(context0, attributeSet0);
    }

    public GenericDraweeView(Context context0, @h AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.j(context0, attributeSet0);
    }

    @TargetApi(21)
    public GenericDraweeView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.j(context0, attributeSet0);
    }

    public GenericDraweeView(Context context0, com.facebook.drawee.generic.a a0) {
        super(context0);
        this.setHierarchy(a0);
    }

    protected void j(Context context0, @h AttributeSet attributeSet0) {
        if(b.e()) {
            b.a("GenericDraweeView#inflateHierarchy");
        }
        com.facebook.drawee.generic.b b0 = c.d(context0, attributeSet0);
        this.setAspectRatio(b0.f());
        this.setHierarchy(b0.a());
        if(b.e()) {
            b.c();
        }
    }
}

