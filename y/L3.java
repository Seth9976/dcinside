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

public final class l3 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final View c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;

    private l3(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull View view0, @NonNull ImageView imageView1, @NonNull ImageView imageView2, @NonNull TextView textView0) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = view0;
        this.d = imageView1;
        this.e = imageView2;
        this.f = textView0;
    }

    @NonNull
    public static l3 a(@NonNull View view0) {
        int v = 0x7F0B0114;  // id:all_gallery_item_delete
        View view1 = ViewBindings.a(view0, 0x7F0B0114);  // id:all_gallery_item_delete
        if(((ImageView)view1) != null) {
            v = 0x7F0B0113;  // id:all_Gallery_item_divider
            View view2 = ViewBindings.a(view0, 0x7F0B0113);  // id:all_Gallery_item_divider
            if(view2 != null) {
                v = 0x7F0B0115;  // id:all_gallery_item_icon
                View view3 = ViewBindings.a(view0, 0x7F0B0115);  // id:all_gallery_item_icon
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0116;  // id:all_gallery_item_mini_icon
                    View view4 = ViewBindings.a(view0, 0x7F0B0116);  // id:all_gallery_item_mini_icon
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B0117;  // id:all_gallery_item_text
                        View view5 = ViewBindings.a(view0, 0x7F0B0117);  // id:all_gallery_item_text
                        if(((TextView)view5) != null) {
                            return new l3(((ConstraintLayout)view0), ((ImageView)view1), view2, ((ImageView)view3), ((ImageView)view4), ((TextView)view5));
                        }
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
    public static l3 c(@NonNull LayoutInflater layoutInflater0) {
        return l3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static l3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0193, viewGroup0, false);  // layout:view_all_gallery_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return l3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

