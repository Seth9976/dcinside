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

public final class m6 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ConstraintLayout e;

    private m6(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull ImageView imageView0, @NonNull TextView textView1, @NonNull ConstraintLayout constraintLayout1) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = imageView0;
        this.d = textView1;
        this.e = constraintLayout1;
    }

    @NonNull
    public static m6 a(@NonNull View view0) {
        int v = 0x7F0B0A83;  // id:post_list_item_situation_date
        View view1 = ViewBindings.a(view0, 0x7F0B0A83);  // id:post_list_item_situation_date
        if(((TextView)view1) != null) {
            v = 0x7F0B0A84;  // id:post_list_item_situation_delete
            View view2 = ViewBindings.a(view0, 0x7F0B0A84);  // id:post_list_item_situation_delete
            if(((ImageView)view2) != null) {
                v = 0x7F0B0A85;  // id:post_list_item_situation_msg
                View view3 = ViewBindings.a(view0, 0x7F0B0A85);  // id:post_list_item_situation_msg
                if(((TextView)view3) != null) {
                    return new m6(((ConstraintLayout)view0), ((TextView)view1), ((ImageView)view2), ((TextView)view3), ((ConstraintLayout)view0));
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
    public static m6 c(@NonNull LayoutInflater layoutInflater0) {
        return m6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static m6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0230, viewGroup0, false);  // layout:view_post_list_item_situation
        if(z) {
            viewGroup0.addView(view0);
        }
        return m6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

