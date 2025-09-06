package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class e7 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;

    private e7(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull TextView textView0) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = imageView1;
        this.d = textView0;
    }

    @NonNull
    public static e7 a(@NonNull View view0) {
        int v = 0x7F0B0CAC;  // id:recent_setting_item_fix
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0CAC);  // id:recent_setting_item_fix
        if(imageView0 != null) {
            v = 0x7F0B0CAD;  // id:recent_setting_item_move
            ImageView imageView1 = (ImageView)ViewBindings.a(view0, 0x7F0B0CAD);  // id:recent_setting_item_move
            if(imageView1 != null) {
                v = 0x7F0B0CAE;  // id:recent_setting_item_text
                TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0CAE);  // id:recent_setting_item_text
                if(textView0 != null) {
                    return new e7(((ConstraintLayout)view0), imageView0, imageView1, textView0);
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
    public static e7 c(@NonNull LayoutInflater layoutInflater0) {
        return e7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static e7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E025C, viewGroup0, false);  // layout:view_recent_setting_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return e7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

