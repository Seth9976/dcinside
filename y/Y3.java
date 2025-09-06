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
import com.facebook.drawee.view.SimpleDraweeView;

public final class y3 implements ViewBinding {
    @NonNull
    private final DividerLinearLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final SimpleDraweeView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final DividerLinearLayout e;

    private y3(@NonNull DividerLinearLayout dividerLinearLayout0, @NonNull ImageView imageView0, @NonNull SimpleDraweeView simpleDraweeView0, @NonNull TextView textView0, @NonNull DividerLinearLayout dividerLinearLayout1) {
        this.a = dividerLinearLayout0;
        this.b = imageView0;
        this.c = simpleDraweeView0;
        this.d = textView0;
        this.e = dividerLinearLayout1;
    }

    @NonNull
    public static y3 a(@NonNull View view0) {
        int v = 0x7F0B01E6;  // id:block_dccon_group_arrow
        View view1 = ViewBindings.a(view0, 0x7F0B01E6);  // id:block_dccon_group_arrow
        if(((ImageView)view1) != null) {
            v = 0x7F0B01E7;  // id:block_dccon_group_image
            View view2 = ViewBindings.a(view0, 0x7F0B01E7);  // id:block_dccon_group_image
            if(((SimpleDraweeView)view2) != null) {
                v = 0x7F0B01E8;  // id:block_dccon_group_name
                View view3 = ViewBindings.a(view0, 0x7F0B01E8);  // id:block_dccon_group_name
                if(((TextView)view3) != null) {
                    return new y3(((DividerLinearLayout)view0), ((ImageView)view1), ((SimpleDraweeView)view2), ((TextView)view3), ((DividerLinearLayout)view0));
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
    public static y3 c(@NonNull LayoutInflater layoutInflater0) {
        return y3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static y3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01A0, viewGroup0, false);  // layout:view_block_dccon_group_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return y3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

