package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DividerLinearLayout;

public final class p4 implements ViewBinding {
    @NonNull
    private final DividerLinearLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final View e;

    private p4(@NonNull DividerLinearLayout dividerLinearLayout0, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull TextView textView0, @NonNull View view0) {
        this.a = dividerLinearLayout0;
        this.b = imageView0;
        this.c = imageView1;
        this.d = textView0;
        this.e = view0;
    }

    @NonNull
    public static p4 a(@NonNull View view0) {
        int v = 0x7F0B0393;  // id:def_img_list_item_arrow
        View view1 = ViewBindings.a(view0, 0x7F0B0393);  // id:def_img_list_item_arrow
        if(((ImageView)view1) != null) {
            v = 0x7F0B0394;  // id:def_img_list_item_image
            View view2 = ViewBindings.a(view0, 0x7F0B0394);  // id:def_img_list_item_image
            if(((ImageView)view2) != null) {
                v = 0x7F0B0395;  // id:def_img_list_item_text
                View view3 = ViewBindings.a(view0, 0x7F0B0395);  // id:def_img_list_item_text
                if(((TextView)view3) != null) {
                    v = 0x7F0B0396;  // id:def_img_list_item_wrap
                    View view4 = ViewBindings.a(view0, 0x7F0B0396);  // id:def_img_list_item_wrap
                    if(view4 != null) {
                        return new p4(((DividerLinearLayout)view0), ((ImageView)view1), ((ImageView)view2), ((TextView)view3), view4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public DividerLinearLayout b() {
        return this.a;
    }

    @NonNull
    public static p4 c(@NonNull LayoutInflater layoutInflater0) {
        return p4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static p4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01CB, viewGroup0, false);  // layout:view_def_img_list_item_image
        if(z) {
            viewGroup0.addView(view0);
        }
        return p4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

