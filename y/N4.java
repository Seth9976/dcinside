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

public final class n4 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final CheckBox b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;

    private n4(@NonNull ConstraintLayout constraintLayout0, @NonNull CheckBox checkBox0, @NonNull TextView textView0, @NonNull TextView textView1) {
        this.a = constraintLayout0;
        this.b = checkBox0;
        this.c = textView0;
        this.d = textView1;
    }

    @NonNull
    public static n4 a(@NonNull View view0) {
        int v = 0x7F0B03BB;  // id:def_img_setting_random_check
        CheckBox checkBox0 = (CheckBox)ViewBindings.a(view0, 0x7F0B03BB);  // id:def_img_setting_random_check
        if(checkBox0 != null) {
            v = 0x7F0B03BC;  // id:def_img_setting_random_desc
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B03BC);  // id:def_img_setting_random_desc
            if(textView0 != null) {
                v = 0x7F0B03BD;  // id:def_img_setting_random_text
                TextView textView1 = (TextView)ViewBindings.a(view0, 0x7F0B03BD);  // id:def_img_setting_random_text
                if(textView1 != null) {
                    return new n4(((ConstraintLayout)view0), checkBox0, textView0, textView1);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static n4 c(@NonNull LayoutInflater layoutInflater0) {
        return n4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static n4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01C9, viewGroup0, false);  // layout:view_def_img_item_random
        if(z) {
            viewGroup0.addView(view0);
        }
        return n4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

