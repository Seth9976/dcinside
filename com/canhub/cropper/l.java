package com.canhub.cropper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;

@s0({"SMAP\nCropImageContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageContract.kt\ncom/canhub/cropper/CropImageContract\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n*L\n1#1,46:1\n13#2,5:47\n*S KotlinDebug\n*F\n+ 1 CropImageContract.kt\ncom/canhub/cropper/CropImageContract\n*L\n37#1:47,5\n*E\n"})
@k(message = "\n  This ActivityResultContract is deprecated.\n  Please either roll your own ActivityResultContract with the desired behavior or copy paste this.\n")
public final class l extends ActivityResultContract {
    @Override  // androidx.activity.result.contract.ActivityResultContract
    public Intent a(Context context0, Object object0) {
        return this.d(context0, ((m)object0));
    }

    @Override  // androidx.activity.result.contract.ActivityResultContract
    public Object c(int v, Intent intent0) {
        return this.e(v, intent0);
    }

    @y4.l
    public Intent d(@y4.l Context context0, @y4.l m m0) {
        L.p(context0, "context");
        L.p(m0, "input");
        Intent intent0 = new Intent(context0, CropImageActivity.class);
        Bundle bundle0 = new Bundle(2);
        bundle0.putParcelable("CROP_IMAGE_EXTRA_SOURCE", m0.f());
        bundle0.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", m0.e());
        intent0.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle0);
        return intent0;
    }

    @y4.l
    public c e(int v, @y4.m Intent intent0) {
        c cropImageView$c0 = null;
        if(intent0 != null) {
            Parcelable parcelable0 = intent0.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
            if(parcelable0 instanceof ActivityResult) {
                cropImageView$c0 = parcelable0;
            }
            cropImageView$c0 = (ActivityResult)cropImageView$c0;
        }
        return cropImageView$c0 == null || v == 0 ? a.k : cropImageView$c0;
    }
}

