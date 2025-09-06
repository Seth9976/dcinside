package com.canhub.cropper;

import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface;
import android.view.KeyEvent;

public final class h implements DialogInterface.OnKeyListener {
    public final CropImageActivity a;

    public h(CropImageActivity cropImageActivity0) {
        this.a = cropImageActivity0;
    }

    @Override  // android.content.DialogInterface$OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
        return CropImageActivity.v1(this.a, dialogInterface0, v, keyEvent0);
    }
}

