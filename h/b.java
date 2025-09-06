package H;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.canhub.cropper.CropOverlayView;
import com.canhub.cropper.R.id;
import com.canhub.cropper.R.layout;

public final class b implements ViewBinding {
    @NonNull
    private final View a;
    @NonNull
    public final CropOverlayView b;
    @NonNull
    public final ProgressBar c;
    @NonNull
    public final ImageView d;

    private b(@NonNull View view0, @NonNull CropOverlayView cropOverlayView0, @NonNull ProgressBar progressBar0, @NonNull ImageView imageView0) {
        this.a = view0;
        this.b = cropOverlayView0;
        this.c = progressBar0;
        this.d = imageView0;
    }

    @NonNull
    public static b a(@NonNull View view0) {
        int v = id.CropOverlayView;
        CropOverlayView cropOverlayView0 = (CropOverlayView)ViewBindings.a(view0, v);
        if(cropOverlayView0 != null) {
            v = id.CropProgressBar;
            ProgressBar progressBar0 = (ProgressBar)ViewBindings.a(view0, v);
            if(progressBar0 != null) {
                v = id.ImageView_image;
                ImageView imageView0 = (ImageView)ViewBindings.a(view0, v);
                if(imageView0 != null) {
                    return new b(view0, cropOverlayView0, progressBar0, imageView0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater0, @NonNull ViewGroup viewGroup0) {
        if(viewGroup0 == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater0.inflate(layout.crop_image_view, viewGroup0);
        return b.a(viewGroup0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}

