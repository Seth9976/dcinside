package com.karumi.dexter;

import com.karumi.dexter.listener.PermissionRequestErrorListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.Collection;

public interface DexterBuilder {
    public interface MultiPermissionListener {
        DexterBuilder withListener(MultiplePermissionsListener arg1);
    }

    public interface Permission {
        SinglePermissionListener withPermission(String arg1);

        MultiPermissionListener withPermissions(Collection arg1);

        MultiPermissionListener withPermissions(String[] arg1);
    }

    public interface SinglePermissionListener {
        DexterBuilder withListener(PermissionListener arg1);
    }

    void check();

    DexterBuilder onSameThread();

    DexterBuilder withErrorListener(PermissionRequestErrorListener arg1);
}

