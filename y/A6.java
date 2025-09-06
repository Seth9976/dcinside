package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class a6 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final CheckBox b;
    @NonNull
    public final TextView c;

    private a6(@NonNull ConstraintLayout constraintLayout0, @NonNull CheckBox checkBox0, @NonNull TextView textView0) {
        this.a = constraintLayout0;
        this.b = checkBox0;
        this.c = textView0;
    }

    @NonNull
    public static a6 a(@NonNull View view0) {
        int v = 0x7F0B0A50;  // id:post_head_setting_check
        CheckBox checkBox0 = (CheckBox)ViewBindings.a(view0, 0x7F0B0A50);  // id:post_head_setting_check
        if(checkBox0 != null) {
            v = 0x7F0B0A54;  // id:post_head_setting_text
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0A54);  // id:post_head_setting_text
            if(textView0 != null) {
                return new a6(((ConstraintLayout)view0), checkBox0, textView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static a6 c(@NonNull LayoutInflater layoutInflater0) {
        return a6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static a6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0224, viewGroup0, false);  // layout:view_post_head_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return a6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

