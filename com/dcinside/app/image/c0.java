package com.dcinside.app.image;

import android.database.Cursor;
import com.dcinside.app.internal.t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nImageViewerListWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerListWrapper.kt\ncom/dcinside/app/image/ImageViewerCursorListWrapper\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,40:1\n147#2:41\n*S KotlinDebug\n*F\n+ 1 ImageViewerListWrapper.kt\ncom/dcinside/app/image/ImageViewerCursorListWrapper\n*L\n30#1:41\n*E\n"})
public final class c0 implements e0 {
    @l
    private final t a;
    private final int b;

    public c0(@l Cursor cursor0) {
        L.p(cursor0, "cursor");
        super();
        this.a = new t(cursor0);
        this.b = cursor0.getCount();
    }

    @Override  // com.dcinside.app.image.e0
    @l
    public d0 get(int v) {
        return new b0(((Cursor)this.a.a()), v);
    }

    @Override  // com.dcinside.app.image.e0
    public int getCount() {
        return this.b;
    }
}

