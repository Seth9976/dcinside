package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.barcode.CameraSourcePreview;
import com.dcinside.app.barcode.GraphicOverlay;

public final class k implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final CameraSourcePreview b;
    @NonNull
    public final GraphicOverlay c;

    private k(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull CameraSourcePreview cameraSourcePreview0, @NonNull GraphicOverlay graphicOverlay0) {
        this.a = coordinatorLayout0;
        this.b = cameraSourcePreview0;
        this.c = graphicOverlay0;
    }

    @NonNull
    public static k a(@NonNull View view0) {
        int v = 0x7F0B026D;  // id:camera_source_preview
        CameraSourcePreview cameraSourcePreview0 = (CameraSourcePreview)ViewBindings.a(view0, 0x7F0B026D);  // id:camera_source_preview
        if(cameraSourcePreview0 != null) {
            v = 0x7F0B0555;  // id:graphic_overlay
            GraphicOverlay graphicOverlay0 = (GraphicOverlay)ViewBindings.a(view0, 0x7F0B0555);  // id:graphic_overlay
            if(graphicOverlay0 != null) {
                return new k(((CoordinatorLayout)view0), cameraSourcePreview0, graphicOverlay0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static k c(@NonNull LayoutInflater layoutInflater0) {
        return k.d(layoutInflater0, null, false);
    }

    @NonNull
    public static k d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0026, viewGroup0, false);  // layout:activity_barcode_capture
        if(z) {
            viewGroup0.addView(view0);
        }
        return k.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

