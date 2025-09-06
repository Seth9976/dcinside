package com.dcinside.app.album.picker;

import android.media.MediaScannerConnection.OnScanCompletedListener;
import android.net.Uri;

public final class a implements MediaScannerConnection.OnScanCompletedListener {
    public final PickerActivity a;

    public a(PickerActivity pickerActivity0) {
        this.a = pickerActivity0;
    }

    @Override  // android.media.MediaScannerConnection$OnScanCompletedListener
    public final void onScanCompleted(String s, Uri uri0) {
        PickerActivity.Z1(this.a, s, uri0);
    }
}

