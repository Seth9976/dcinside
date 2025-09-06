package com.dcinside.app.image.edit.crop;

import Y.X1;
import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.canhub.cropper.CropImageView.c;
import com.canhub.cropper.CropImageView;
import com.dcinside.app.image.edit.ImageEditActivity;
import com.dcinside.app.image.edit.a;
import com.dcinside.app.rx.h;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.wk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nImageEditCropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditCropFragment.kt\ncom/dcinside/app/image/edit/crop/ImageEditCropFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,94:1\n255#2:95\n255#2:96\n257#2,2:97\n*S KotlinDebug\n*F\n+ 1 ImageEditCropFragment.kt\ncom/dcinside/app/image/edit/crop/ImageEditCropFragment\n*L\n60#1:95\n87#1:96\n89#1:97,2\n*E\n"})
public final class d extends a implements com.dcinside.app.image.edit.crop.b.a, com.dcinside.app.rx.a {
    private final com.dcinside.app.rx.a b;
    @m
    private X1 c;

    public d() {
        this(null, 1, null);
    }

    public d(@l com.dcinside.app.rx.a a0) {
        L.p(a0, "scope");
        super();
        this.b = a0;
    }

    public d(com.dcinside.app.rx.a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new h(null, 1, null);
        }
        this(a0);
    }

    @Override  // com.dcinside.app.image.edit.crop.b$a
    public void G(int v) {
        X1 x10 = this.m0();
        L.o(x10.e, "imageEditCropProgress");
        if(x10.e.getVisibility() == 0) {
            return;
        }
        switch(v) {
            case 0: {
                this.m0().c.setFixedAspectRatio(false);
                return;
            }
            case 1: {
                this.m0().c.F(1, 1);
                return;
            }
            case 2: {
                this.m0().c.F(4, 3);
                return;
            }
            case 3: {
                this.m0().c.F(3, 2);
                return;
            }
            case 4: {
                this.m0().c.F(16, 9);
            }
        }
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // com.dcinside.app.image.edit.a
    public void j0() {
        ProgressBar progressBar0 = this.m0().e;
        L.o(progressBar0, "imageEditCropProgress");
        if(progressBar0.getVisibility() == 0) {
            return;
        }
        File file0 = wk.c.c();
        if(file0 == null) {
            return;
        }
        progressBar0.setVisibility(0);
        File file1 = new File(file0, System.nanoTime() + ".fix");
        X1 x10 = this.m0();
        L.o(x10.c, "imageEditCropImg");
        Bitmap.CompressFormat bitmap$CompressFormat0 = Bitmap.CompressFormat.WEBP;
        Uri uri0 = Uri.fromFile(file1);
        CropImageView.i(x10.c, bitmap$CompressFormat0, 100, 0, 0, null, uri0, 28, null);
    }

    private final X1 m0() {
        X1 x10 = this.c;
        L.m(x10);
        return x10;
    }

    private final void n0(Context context0, c cropImageView$c0) {
        ImageEditActivity imageEditActivity0 = null;
        String s = cropImageView$c0.s() ? cropImageView$c0.o(context0, true) : null;
        if(s == null) {
            Exception exception0 = cropImageView$c0.f();
            if(exception0 == null) {
                exception0 = new FileNotFoundException("Not found.");
            }
            String s1 = exception0.getMessage();
            if(s1 == null) {
                s1 = "";
            }
            Dl.G(context0, s1);
            FragmentActivity fragmentActivity0 = this.getActivity();
            ImageEditActivity imageEditActivity1 = fragmentActivity0 instanceof ImageEditActivity ? ((ImageEditActivity)fragmentActivity0) : null;
            if(imageEditActivity1 != null) {
                imageEditActivity1.X1(null);
            }
        }
        else {
            FragmentActivity fragmentActivity1 = this.getActivity();
            if(fragmentActivity1 instanceof ImageEditActivity) {
                imageEditActivity0 = (ImageEditActivity)fragmentActivity1;
            }
            if(imageEditActivity0 != null) {
                imageEditActivity0.X1(s);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void o0(d d0, CropImageView cropImageView0, c cropImageView$c0) [...]

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.c = X1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.m0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.t();
        this.c = null;
    }

    @Override  // com.dcinside.app.image.edit.a
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        X1 x10 = this.m0();
        x10.c.setShowCropOverlay(true);
        Uri uri0 = Uri.fromFile(new File(this.i0()));
        x10.c.setImageUriAsync(uri0);
        com.dcinside.app.image.edit.crop.c c0 = (CropImageView cropImageView0, c cropImageView$c0) -> {
            L.p(this, "this$0");
            L.p(cropImageView0, "view");
            L.p(cropImageView$c0, "result");
            cropImageView0.setOnCropImageCompleteListener(null);
            Context context0 = cropImageView0.getContext();
            L.o(context0, "getContext(...)");
            this.n0(context0, cropImageView$c0);
        };
        x10.c.setOnCropImageCompleteListener(c0);
        X1 x11 = this.m0();
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        x11.d.setLayoutManager(nonPredictiveLayoutManager0);
        b b0 = new b(this, this.i0());
        x11.d.setAdapter(b0);
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.b.t();
    }
}

