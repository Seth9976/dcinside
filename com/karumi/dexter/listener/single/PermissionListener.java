package com.karumi.dexter.listener.single;

import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;

public interface PermissionListener {
    void onPermissionDenied(PermissionDeniedResponse arg1);

    void onPermissionGranted(PermissionGrantedResponse arg1);

    void onPermissionRationaleShouldBeShown(PermissionRequest arg1, PermissionToken arg2);
}

