package com.dcinside.app.write;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.target.p;
import com.dcinside.app.internal.t;
import com.dcinside.app.util.Dk;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nInfoViewRequestListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoViewRequestListener.kt\ncom/dcinside/app/write/InfoViewRequestListener\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,56:1\n147#2:57\n*S KotlinDebug\n*F\n+ 1 InfoViewRequestListener.kt\ncom/dcinside/app/write/InfoViewRequestListener\n*L\n22#1:57\n*E\n"})
public final class f implements h {
    private final int a;
    private final int b;
    @l
    private final String c;
    @l
    private final t d;

    public f(@l h2 h20, int v, int v1, @l String s) {
        L.p(h20, "holder");
        L.p(s, "size");
        super();
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = new t(h20);
    }

    public final int a() {
        return this.b;
    }

    @l
    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public boolean d(@l Drawable drawable0, @l Object object0, @m p p0, @l a a0, boolean z) {
        L.p(drawable0, "resource");
        L.p(object0, "model");
        L.p(a0, "dataSource");
        h2 h20 = (h2)this.d.a();
        if(h20 == null) {
            return false;
        }
        h20.i0((this.a == 0 ? drawable0.getIntrinsicWidth() : this.a), (this.b == 0 ? drawable0.getIntrinsicHeight() : this.b), this.c);
        return false;
    }

    @Override  // com.bumptech.glide.request.h
    public boolean onLoadFailed(@m q q0, @m Object object0, @l p p0, boolean z) {
        L.p(p0, "target");
        h2 h20 = (h2)this.d.a();
        if(h20 == null) {
            return false;
        }
        ImageView imageView0 = h20.a0();
        String s = object0 instanceof Uri ? ((Uri)object0).getPath() : null;
        h20.c0().setText((s == null || !v.v2(s, "http", false, 2, null) ? 0x7F15031E : 0x7F1504CE));  // string:failed_image_deleted "해당 기기의 이미지가 삭제되었습니다."
        imageView0.setClickable(true);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView0.getLayoutParams();
        viewGroup$LayoutParams0.height = Dk.b(0x7F070410);  // dimen:write_image_err_size
        return false;
    }

    @Override  // com.bumptech.glide.request.h
    public boolean onResourceReady(Object object0, Object object1, p p0, a a0, boolean z) {
        return this.d(((Drawable)object0), object1, p0, a0, z);
    }
}

