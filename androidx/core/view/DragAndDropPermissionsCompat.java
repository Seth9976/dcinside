package androidx.core.view;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public final class DragAndDropPermissionsCompat {
    @RequiresApi(24)
    static class Api24Impl {
        static void a(DragAndDropPermissions dragAndDropPermissions0) {
            dragAndDropPermissions0.release();
        }

        static DragAndDropPermissions b(Activity activity0, DragEvent dragEvent0) {
            return activity0.requestDragAndDropPermissions(dragEvent0);
        }
    }

    private final DragAndDropPermissions a;

    private DragAndDropPermissionsCompat(DragAndDropPermissions dragAndDropPermissions0) {
        this.a = dragAndDropPermissions0;
    }

    public void a() {
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.a(this.a);
        }
    }

    @RestrictTo({Scope.c})
    public static DragAndDropPermissionsCompat b(Activity activity0, DragEvent dragEvent0) {
        if(Build.VERSION.SDK_INT >= 24) {
            DragAndDropPermissions dragAndDropPermissions0 = Api24Impl.b(activity0, dragEvent0);
            return dragAndDropPermissions0 == null ? null : new DragAndDropPermissionsCompat(dragAndDropPermissions0);
        }
        return null;
    }
}

