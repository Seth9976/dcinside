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
import kr.better.widget.BetterTextView;

public final class x3 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final BetterTextView b;
    @NonNull
    public final ImageView c;

    private x3(@NonNull ConstraintLayout constraintLayout0, @NonNull BetterTextView betterTextView0, @NonNull ImageView imageView0) {
        this.a = constraintLayout0;
        this.b = betterTextView0;
        this.c = imageView0;
    }

    @NonNull
    public static x3 a(@NonNull View view0) {
        int v = 0x7F0B0560;  // id:guide_big_dccon_balloon
        BetterTextView betterTextView0 = (BetterTextView)ViewBindings.a(view0, 0x7F0B0560);  // id:guide_big_dccon_balloon
        if(betterTextView0 != null) {
            v = 0x7F0B0561;  // id:guide_big_dccon_balloon_tip
            ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0561);  // id:guide_big_dccon_balloon_tip
            if(imageView0 != null) {
                return new x3(((ConstraintLayout)view0), betterTextView0, imageView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static x3 c(@NonNull LayoutInflater layoutInflater0) {
        return x3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static x3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E019F, viewGroup0, false);  // layout:view_big_dccon_guide
        if(z) {
            viewGroup0.addView(view0);
        }
        return x3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

