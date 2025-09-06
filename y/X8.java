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

public final class x8 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;

    private x8(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0) {
        this.a = constraintLayout0;
        this.b = textView0;
    }

    @NonNull
    public static x8 a(@NonNull View view0) {
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0F9E);  // id:total_gallery_section_empty_message
        if(textView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0F9E));  // id:total_gallery_section_empty_message
        }
        return new x8(((ConstraintLayout)view0), textView0);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static x8 c(@NonNull LayoutInflater layoutInflater0) {
        return x8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static x8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E02A3, viewGroup0, false);  // layout:view_total_search_gallery_empty
        if(z) {
            viewGroup0.addView(view0);
        }
        return x8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

