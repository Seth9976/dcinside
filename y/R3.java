package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class r3 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final CheckBox b;
    @NonNull
    public final TextView c;
    @NonNull
    public final FrameLayout d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final View g;
    @NonNull
    public final View h;
    @NonNull
    public final TextView i;

    private r3(@NonNull ConstraintLayout constraintLayout0, @NonNull CheckBox checkBox0, @NonNull TextView textView0, @NonNull FrameLayout frameLayout0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull View view0, @NonNull View view1, @NonNull TextView textView3) {
        this.a = constraintLayout0;
        this.b = checkBox0;
        this.c = textView0;
        this.d = frameLayout0;
        this.e = textView1;
        this.f = textView2;
        this.g = view0;
        this.h = view1;
        this.i = textView3;
    }

    @NonNull
    public static r3 a(@NonNull View view0) {
        int v = 0x7F0B0A0F;  // id:post_archive_item_check
        View view1 = ViewBindings.a(view0, 0x7F0B0A0F);  // id:post_archive_item_check
        if(((CheckBox)view1) != null) {
            v = 0x7F0B0A10;  // id:post_archive_item_date
            View view2 = ViewBindings.a(view0, 0x7F0B0A10);  // id:post_archive_item_date
            if(((TextView)view2) != null) {
                v = 0x7F0B0A11;  // id:post_archive_item_delete
                View view3 = ViewBindings.a(view0, 0x7F0B0A11);  // id:post_archive_item_delete
                if(((FrameLayout)view3) != null) {
                    v = 0x7F0B0A12;  // id:post_archive_item_gallery
                    View view4 = ViewBindings.a(view0, 0x7F0B0A12);  // id:post_archive_item_gallery
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0A13;  // id:post_archive_item_name
                        View view5 = ViewBindings.a(view0, 0x7F0B0A13);  // id:post_archive_item_name
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0A14;  // id:post_archive_item_sub_div0
                            View view6 = ViewBindings.a(view0, 0x7F0B0A14);  // id:post_archive_item_sub_div0
                            if(view6 != null) {
                                v = 0x7F0B0A15;  // id:post_archive_item_sub_div1
                                View view7 = ViewBindings.a(view0, 0x7F0B0A15);  // id:post_archive_item_sub_div1
                                if(view7 != null) {
                                    v = 0x7F0B0A16;  // id:post_archive_item_subject
                                    View view8 = ViewBindings.a(view0, 0x7F0B0A16);  // id:post_archive_item_subject
                                    if(((TextView)view8) != null) {
                                        return new r3(((ConstraintLayout)view0), ((CheckBox)view1), ((TextView)view2), ((FrameLayout)view3), ((TextView)view4), ((TextView)view5), view6, view7, ((TextView)view8));
                                    }
                                }
                            }
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
    public static r3 c(@NonNull LayoutInflater layoutInflater0) {
        return r3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static r3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0199, viewGroup0, false);  // layout:view_archive_post_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return r3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

