package com.dcinside.app.image;

import android.view.View;
import com.dcinside.app.internal.t;
import com.google.android.material.bottomsheet.BottomSheetBehavior.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nImageViewerPanelCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerPanelCallback.kt\ncom/dcinside/app/image/ImageViewerPanelCallback\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,26:1\n147#2:27\n*S KotlinDebug\n*F\n+ 1 ImageViewerPanelCallback.kt\ncom/dcinside/app/image/ImageViewerPanelCallback\n*L\n9#1:27\n*E\n"})
public final class com.dcinside.app.image.s0 extends g {
    @l
    private final t a;

    public com.dcinside.app.image.s0(@l ImageViewerActivity imageViewerActivity0) {
        L.p(imageViewerActivity0, "activity");
        super();
        this.a = new t(imageViewerActivity0);
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$g
    public void b(@l View view0, float f) {
        L.p(view0, "bottomSheet");
        ImageViewerActivity imageViewerActivity0 = (ImageViewerActivity)this.a.a();
        if(imageViewerActivity0 != null) {
            imageViewerActivity0.A3(f);
        }
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$g
    public void c(@l View view0, int v) {
        L.p(view0, "bottomSheet");
        boolean z = ((ImageViewerActivity)this.a.a()) == null;
    }
}

