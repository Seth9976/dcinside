package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class j4 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final Button b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final LinearLayout e;

    private j4(@NonNull ConstraintLayout constraintLayout0, @NonNull Button button0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull LinearLayout linearLayout0) {
        this.a = constraintLayout0;
        this.b = button0;
        this.c = imageView0;
        this.d = textView0;
        this.e = linearLayout0;
    }

    @NonNull
    public static j4 a(@NonNull View view0) {
        int v = 0x7F0B038E;  // id:def_img_item_add_btn
        View view1 = ViewBindings.a(view0, 0x7F0B038E);  // id:def_img_item_add_btn
        if(((Button)view1) != null) {
            v = 0x7F0B038F;  // id:def_img_item_ai_icon
            View view2 = ViewBindings.a(view0, 0x7F0B038F);  // id:def_img_item_ai_icon
            if(((ImageView)view2) != null) {
                v = 0x7F0B0390;  // id:def_img_item_ai_text
                View view3 = ViewBindings.a(view0, 0x7F0B0390);  // id:def_img_item_ai_text
                if(((TextView)view3) != null) {
                    v = 0x7F0B0391;  // id:def_img_item_ai_wrap
                    View view4 = ViewBindings.a(view0, 0x7F0B0391);  // id:def_img_item_ai_wrap
                    if(((LinearLayout)view4) != null) {
                        return new j4(((ConstraintLayout)view0), ((Button)view1), ((ImageView)view2), ((TextView)view3), ((LinearLayout)view4));
                    }
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
    public static j4 c(@NonNull LayoutInflater layoutInflater0) {
        return j4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static j4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01C5, viewGroup0, false);  // layout:view_def_img_item_add
        if(z) {
            viewGroup0.addView(view0);
        }
        return j4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

