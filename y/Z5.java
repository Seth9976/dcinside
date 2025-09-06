package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class z5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;

    private z5(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0) {
        this.a = constraintLayout0;
        this.b = textView0;
    }

    @NonNull
    public static z5 a(@NonNull View view0) {
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0759);  // id:main_best_pick_title
        if(textView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0759));  // id:main_best_pick_title
        }
        return new z5(((ConstraintLayout)view0), textView0);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static z5 c(@NonNull LayoutInflater layoutInflater0) {
        return z5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static z5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0209, viewGroup0, false);  // layout:view_main_best_pick_title
        if(z) {
            viewGroup0.addView(view0);
        }
        return z5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

