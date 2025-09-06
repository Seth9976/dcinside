package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

@RequiresApi(30)
final class k {
    private static final String a = "ColorResLoaderCreator";

    @Nullable
    static ResourcesLoader a(@NonNull Context context0, @NonNull Map map0) {
        ResourcesLoader resourcesLoader0;
        FileDescriptor fileDescriptor0;
        try {
            byte[] arr_b = n.i(context0, map0);
            Log.i("ColorResLoaderCreator", "Table created, length: " + arr_b.length);
            if(arr_b.length == 0) {
                return null;
            }
            try {
                fileDescriptor0 = null;
                fileDescriptor0 = Os.memfd_create("temp.arsc", 0);
                if(fileDescriptor0 == null) {
                    Log.w("ColorResLoaderCreator", "Cannot create memory file descriptor.");
                    return null;
                }
                try(FileOutputStream fileOutputStream0 = new FileOutputStream(fileDescriptor0)) {
                    fileOutputStream0.write(arr_b);
                    try(ParcelFileDescriptor parcelFileDescriptor0 = ParcelFileDescriptor.dup(fileDescriptor0)) {
                        resourcesLoader0 = i.a();
                        resourcesLoader0.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptor0, null));
                    }
                }
            }
            catch(Throwable throwable0) {
                if(fileDescriptor0 != null) {
                    Os.close(fileDescriptor0);
                }
                throw throwable0;
            }
            Os.close(fileDescriptor0);
            return resourcesLoader0;
        }
        catch(Exception exception0) {
            Log.e("ColorResLoaderCreator", "Failed to create the ColorResourcesTableCreator.", exception0);
            return null;
        }
    }
}

