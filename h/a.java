package H;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.R.layout;

public final class a implements ViewBinding {
    @NonNull
    private final CropImageView a;
    @NonNull
    public final CropImageView b;

    private a(@NonNull CropImageView cropImageView0, @NonNull CropImageView cropImageView1) {
        this.a = cropImageView0;
        this.b = cropImageView1;
    }

    @NonNull
    public static a a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new a(((CropImageView)view0), ((CropImageView)view0));
    }

    @NonNull
    public CropImageView b() {
        return this.a;
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater0) {
        return a.d(layoutInflater0, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.crop_image_activity, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return a.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

