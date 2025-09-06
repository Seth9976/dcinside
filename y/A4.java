package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

public final class a4 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final CheckBox c;
    @NonNull
    public final SimpleDraweeView d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;

    private a4(@NonNull LinearLayout linearLayout0, @NonNull LinearLayout linearLayout1, @NonNull CheckBox checkBox0, @NonNull SimpleDraweeView simpleDraweeView0, @NonNull ImageView imageView0, @NonNull TextView textView0) {
        this.a = linearLayout0;
        this.b = linearLayout1;
        this.c = checkBox0;
        this.d = simpleDraweeView0;
        this.e = imageView0;
        this.f = textView0;
    }

    @NonNull
    public static a4 a(@NonNull View view0) {
        int v = 0x7F0B0348;  // id:dccon_list_setting_item_check
        View view1 = ViewBindings.a(view0, 0x7F0B0348);  // id:dccon_list_setting_item_check
        if(((CheckBox)view1) != null) {
            v = 0x7F0B0349;  // id:dccon_list_setting_item_icon
            View view2 = ViewBindings.a(view0, 0x7F0B0349);  // id:dccon_list_setting_item_icon
            if(((SimpleDraweeView)view2) != null) {
                v = 0x7F0B034A;  // id:dccon_list_setting_item_move
                View view3 = ViewBindings.a(view0, 0x7F0B034A);  // id:dccon_list_setting_item_move
                if(((ImageView)view3) != null) {
                    v = 0x7F0B034B;  // id:dccon_list_setting_item_text
                    View view4 = ViewBindings.a(view0, 0x7F0B034B);  // id:dccon_list_setting_item_text
                    if(((TextView)view4) != null) {
                        return new a4(((LinearLayout)view0), ((LinearLayout)view0), ((CheckBox)view1), ((SimpleDraweeView)view2), ((ImageView)view3), ((TextView)view4));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static a4 c(@NonNull LayoutInflater layoutInflater0) {
        return a4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static a4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01BC, viewGroup0, false);  // layout:view_dccon_list_setting_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return a4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

