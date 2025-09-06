package com.karumi.dexter;

import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.List;

final class MultiplePermissionsListenerToPermissionListenerAdapter implements MultiplePermissionsListener {
    private final PermissionListener listener;

    MultiplePermissionsListenerToPermissionListenerAdapter(PermissionListener permissionListener0) {
        this.listener = permissionListener0;
    }

    @Override  // com.karumi.dexter.listener.multi.MultiplePermissionsListener
    public void onPermissionRationaleShouldBeShown(List list0, PermissionToken permissionToken0) {
        PermissionRequest permissionRequest0 = (PermissionRequest)list0.get(0);
        this.listener.onPermissionRationaleShouldBeShown(permissionRequest0, permissionToken0);
    }

    @Override  // com.karumi.dexter.listener.multi.MultiplePermissionsListener
    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport0) {
        List list0 = multiplePermissionsReport0.getDeniedPermissionResponses();
        List list1 = multiplePermissionsReport0.getGrantedPermissionResponses();
        if(!list0.isEmpty()) {
            PermissionDeniedResponse permissionDeniedResponse0 = (PermissionDeniedResponse)list0.get(0);
            this.listener.onPermissionDenied(permissionDeniedResponse0);
            return;
        }
        PermissionGrantedResponse permissionGrantedResponse0 = (PermissionGrantedResponse)list1.get(0);
        this.listener.onPermissionGranted(permissionGrantedResponse0);
    }
}

