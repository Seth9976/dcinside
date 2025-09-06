package com.karumi.dexter;

import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import java.util.List;

final class MultiplePermissionListenerThreadDecorator implements MultiplePermissionsListener {
    private final MultiplePermissionsListener listener;
    private final Thread thread;

    MultiplePermissionListenerThreadDecorator(MultiplePermissionsListener multiplePermissionsListener0, Thread thread0) {
        this.thread = thread0;
        this.listener = multiplePermissionsListener0;
    }

    @Override  // com.karumi.dexter.listener.multi.MultiplePermissionsListener
    public void onPermissionRationaleShouldBeShown(List list0, PermissionToken permissionToken0) {
        com.karumi.dexter.MultiplePermissionListenerThreadDecorator.2 multiplePermissionListenerThreadDecorator$20 = new Runnable() {
            @Override
            public void run() {
                MultiplePermissionListenerThreadDecorator.this.listener.onPermissionRationaleShouldBeShown(list0, permissionToken0);
            }
        };
        this.thread.execute(multiplePermissionListenerThreadDecorator$20);
    }

    @Override  // com.karumi.dexter.listener.multi.MultiplePermissionsListener
    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport0) {
        com.karumi.dexter.MultiplePermissionListenerThreadDecorator.1 multiplePermissionListenerThreadDecorator$10 = new Runnable() {
            @Override
            public void run() {
                MultiplePermissionListenerThreadDecorator.this.listener.onPermissionsChecked(multiplePermissionsReport0);
            }
        };
        this.thread.execute(multiplePermissionListenerThreadDecorator$10);
    }
}

