package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class t4 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;

    private t4(@NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull TextView textView1) {
        this.a = linearLayout0;
        this.b = textView0;
        this.c = textView1;
    }

    @NonNull
    public static t4 a(@NonNull View view0) {
        int v = 0x7F0B0454;  // id:entrust_item_desc
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0454);  // id:entrust_item_desc
        if(textView0 != null) {
            v = 0x7F0B0455;  // id:entrust_item_title
            TextView textView1 = (TextView)ViewBindings.a(view0, 0x7F0B0455);  // id:entrust_item_title
            if(textView1 != null) {
                return new t4(((LinearLayout)view0), textView0, textView1);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static t4 c(@NonNull LayoutInflater layoutInflater0) {
        return t4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static t4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01CF, viewGroup0, false);  // layout:view_entrust_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return t4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

