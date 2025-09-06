package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class g8 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final TextView b;

    private g8(@NonNull FrameLayout frameLayout0, @NonNull TextView textView0) {
        this.a = frameLayout0;
        this.b = textView0;
    }

    @NonNull
    public static g8 a(@NonNull View view0) {
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0822);  // id:menu_move
        if(textView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0822));  // id:menu_move
        }
        return new g8(((FrameLayout)view0), textView0);
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static g8 c(@NonNull LayoutInflater layoutInflater0) {
        return g8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static g8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0292, viewGroup0, false);  // layout:view_toolbar_menu_move_gallery
        if(z) {
            viewGroup0.addView(view0);
        }
        return g8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

