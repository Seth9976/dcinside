package com.karumi.dexter.listener.multi;

import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import java.util.List;

public class BaseMultiplePermissionsListener implements MultiplePermissionsListener {
    @Override  // com.karumi.dexter.listener.multi.MultiplePermissionsListener
    public void onPermissionRationaleShouldBeShown(List list0, PermissionToken permissionToken0) {
        permissionToken0.continuePermissionRequest();
    }

    @Override  // com.karumi.dexter.listener.multi.MultiplePermissionsListener
    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport0) {
    }
}

