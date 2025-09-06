package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class s5 implements ViewBinding {
    @NonNull
    private final View a;
    @NonNull
    public final AppCompatImageView b;
    @NonNull
    public final TextView c;

    private s5(@NonNull View view0, @NonNull AppCompatImageView appCompatImageView0, @NonNull TextView textView0) {
        this.a = view0;
        this.b = appCompatImageView0;
        this.c = textView0;
    }

    @NonNull
    public static s5 a(@NonNull View view0) {
        int v = 0x7F0B0722;  // id:list_tab_item_icon
        AppCompatImageView appCompatImageView0 = (AppCompatImageView)ViewBindings.a(view0, 0x7F0B0722);  // id:list_tab_item_icon
        if(appCompatImageView0 != null) {
            v = 0x7F0B0723;  // id:list_tab_item_txt
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0723);  // id:list_tab_item_txt
            if(textView0 != null) {
                return new s5(view0, appCompatImageView0, textView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public static s5 b(@NonNull LayoutInflater layoutInflater0, @NonNull ViewGroup viewGroup0) {
        if(viewGroup0 == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater0.inflate(0x7F0E0202, viewGroup0);  // layout:view_list_tab_item
        return s5.a(viewGroup0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}

