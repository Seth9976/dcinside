package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import kr.better.widget.BetterTextView;

public final class y4 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final BetterTextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final ImageView f;

    private y4(@NonNull LinearLayout linearLayout0, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull BetterTextView betterTextView0, @NonNull TextView textView0, @NonNull ImageView imageView2) {
        this.a = linearLayout0;
        this.b = imageView0;
        this.c = imageView1;
        this.d = betterTextView0;
        this.e = textView0;
        this.f = imageView2;
    }

    @NonNull
    public static y4 a(@NonNull View view0) {
        int v = 0x7F0B013A;  // id:archive_folder_change
        View view1 = ViewBindings.a(view0, 0x7F0B013A);  // id:archive_folder_change
        if(((ImageView)view1) != null) {
            v = 0x7F0B013B;  // id:archive_folder_change_name
            View view2 = ViewBindings.a(view0, 0x7F0B013B);  // id:archive_folder_change_name
            if(((ImageView)view2) != null) {
                v = 0x7F0B013C;  // id:archive_folder_count
                View view3 = ViewBindings.a(view0, 0x7F0B013C);  // id:archive_folder_count
                if(((BetterTextView)view3) != null) {
                    v = 0x7F0B013E;  // id:archive_folder_name
                    View view4 = ViewBindings.a(view0, 0x7F0B013E);  // id:archive_folder_name
                    if(((TextView)view4) != null) {
                        v = 0x7F0B013F;  // id:archive_folder_remove
                        View view5 = ViewBindings.a(view0, 0x7F0B013F);  // id:archive_folder_remove
                        if(((ImageView)view5) != null) {
                            return new y4(((LinearLayout)view0), ((ImageView)view1), ((ImageView)view2), ((BetterTextView)view3), ((TextView)view4), ((ImageView)view5));
                        }
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
    public static y4 c(@NonNull LayoutInflater layoutInflater0) {
        return y4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static y4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01D4, viewGroup0, false);  // layout:view_folder_archive_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return y4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

