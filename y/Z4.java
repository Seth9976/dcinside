package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class z4 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;

    private z4(@NonNull FrameLayout frameLayout0, @NonNull TextView textView0, @NonNull TextView textView1) {
        this.a = frameLayout0;
        this.b = textView0;
        this.c = textView1;
    }

    @NonNull
    public static z4 a(@NonNull View view0) {
        int v = 0x7F0B0140;  // id:archive_folder_select_count
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0140);  // id:archive_folder_select_count
        if(textView0 != null) {
            v = 0x7F0B0141;  // id:archive_folder_select_name
            TextView textView1 = (TextView)ViewBindings.a(view0, 0x7F0B0141);  // id:archive_folder_select_name
            if(textView1 != null) {
                return new z4(((FrameLayout)view0), textView0, textView1);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static z4 c(@NonNull LayoutInflater layoutInflater0) {
        return z4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static z4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01D5, viewGroup0, false);  // layout:view_folder_select_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return z4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

