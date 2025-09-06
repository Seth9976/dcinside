package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class d9 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final AppCompatImageView b;
    @NonNull
    public final TextView c;

    private d9(@NonNull ConstraintLayout constraintLayout0, @NonNull AppCompatImageView appCompatImageView0, @NonNull TextView textView0) {
        this.a = constraintLayout0;
        this.b = appCompatImageView0;
        this.c = textView0;
    }

    @NonNull
    public static d9 a(@NonNull View view0) {
        int v = 0x7F0B1105;  // id:write_more_menu_icon
        AppCompatImageView appCompatImageView0 = (AppCompatImageView)ViewBindings.a(view0, 0x7F0B1105);  // id:write_more_menu_icon
        if(appCompatImageView0 != null) {
            v = 0x7F0B1106;  // id:write_more_menu_text
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B1106);  // id:write_more_menu_text
            if(textView0 != null) {
                return new d9(((ConstraintLayout)view0), appCompatImageView0, textView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static d9 c(@NonNull LayoutInflater layoutInflater0) {
        return d9.d(layoutInflater0, null, false);
    }

    @NonNull
    public static d9 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E02C3, viewGroup0, false);  // layout:view_write_menu_more
        if(z) {
            viewGroup0.addView(view0);
        }
        return d9.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

