package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class t8 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ConstraintLayout b;
    @NonNull
    public final ImageView c;

    private t8(@NonNull ConstraintLayout constraintLayout0, @NonNull ConstraintLayout constraintLayout1, @NonNull ImageView imageView0) {
        this.a = constraintLayout0;
        this.b = constraintLayout1;
        this.c = imageView0;
    }

    @NonNull
    public static t8 a(@NonNull View view0) {
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0FAA);  // id:total_recent_search_clear
        if(imageView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0FAA));  // id:total_recent_search_clear
        }
        return new t8(((ConstraintLayout)view0), ((ConstraintLayout)view0), imageView0);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static t8 c(@NonNull LayoutInflater layoutInflater0) {
        return t8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static t8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E029F, viewGroup0, false);  // layout:view_total_recent_section
        if(z) {
            viewGroup0.addView(view0);
        }
        return t8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

