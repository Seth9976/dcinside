package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class u4 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final Button b;

    private u4(@NonNull FrameLayout frameLayout0, @NonNull Button button0) {
        this.a = frameLayout0;
        this.b = button0;
    }

    @NonNull
    public static u4 a(@NonNull View view0) {
        Button button0 = (Button)ViewBindings.a(view0, 0x7F0B0816);  // id:menu_entrust_submit
        if(button0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0816));  // id:menu_entrust_submit
        }
        return new u4(((FrameLayout)view0), button0);
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static u4 c(@NonNull LayoutInflater layoutInflater0) {
        return u4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static u4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01D0, viewGroup0, false);  // layout:view_entrust_submit
        if(z) {
            viewGroup0.addView(view0);
        }
        return u4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

