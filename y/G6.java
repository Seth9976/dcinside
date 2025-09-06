package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class g6 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final ProgressBar b;

    private g6(@NonNull LinearLayout linearLayout0, @NonNull ProgressBar progressBar0) {
        this.a = linearLayout0;
        this.b = progressBar0;
    }

    @NonNull
    public static g6 a(@NonNull View view0) {
        ProgressBar progressBar0 = (ProgressBar)ViewBindings.a(view0, 0x7F0B0A65);  // id:post_history_item_progress
        if(progressBar0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0A65));  // id:post_history_item_progress
        }
        return new g6(((LinearLayout)view0), progressBar0);
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static g6 c(@NonNull LayoutInflater layoutInflater0) {
        return g6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static g6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E022A, viewGroup0, false);  // layout:view_post_history_item_progress
        if(z) {
            viewGroup0.addView(view0);
        }
        return g6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

