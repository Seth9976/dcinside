package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class g2 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ProgressBar b;

    private g2(@NonNull ConstraintLayout constraintLayout0, @NonNull ProgressBar progressBar0) {
        this.a = constraintLayout0;
        this.b = progressBar0;
    }

    @NonNull
    public static g2 a(@NonNull View view0) {
        ProgressBar progressBar0 = (ProgressBar)ViewBindings.a(view0, 0x7F0B0674);  // id:intro_progress
        if(progressBar0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0674));  // id:intro_progress
        }
        return new g2(((ConstraintLayout)view0), progressBar0);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static g2 c(@NonNull LayoutInflater layoutInflater0) {
        return g2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static g2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0107, viewGroup0, false);  // layout:fragment_intro
        if(z) {
            viewGroup0.addView(view0);
        }
        return g2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

