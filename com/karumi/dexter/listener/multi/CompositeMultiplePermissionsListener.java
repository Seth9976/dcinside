package com.karumi.dexter.listener.multi;

import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CompositeMultiplePermissionsListener implements MultiplePermissionsListener {
    private final Collection listeners;

    public CompositeMultiplePermissionsListener(Collection collection0) {
        this.listeners = collection0;
    }

    public CompositeMultiplePermissionsListener(MultiplePermissionsListener[] arr_multiplePermissionsListener) {
        this(Arrays.asList(arr_multiplePermissionsListener));
    }

    @Override  // com.karumi.dexter.listener.multi.MultiplePermissionsListener
    public void onPermissionRationaleShouldBeShown(List list0, PermissionToken permissionToken0) {
        for(Object object0: this.listeners) {
            ((MultiplePermissionsListener)object0).onPermissionRationaleShouldBeShown(list0, permissionToken0);
        }
    }

    @Override  // com.karumi.dexter.listener.multi.MultiplePermissionsListener
    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport0) {
        for(Object object0: this.listeners) {
            ((MultiplePermissionsListener)object0).onPermissionsChecked(multiplePermissionsReport0);
        }
    }
}

