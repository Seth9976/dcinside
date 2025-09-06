package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class q1 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final RecyclerView c;

    private q1(@NonNull LinearLayout linearLayout0, @NonNull ImageView imageView0, @NonNull RecyclerView recyclerView0) {
        this.a = linearLayout0;
        this.b = imageView0;
        this.c = recyclerView0;
    }

    @NonNull
    public static q1 a(@NonNull View view0) {
        int v = 0x7F0B0D4E;  // id:reply_more_close
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0D4E);  // id:reply_more_close
        if(imageView0 != null) {
            v = 0x7F0B0D58;  // id:reply_more_list
            RecyclerView recyclerView0 = (RecyclerView)ViewBindings.a(view0, 0x7F0B0D58);  // id:reply_more_list
            if(recyclerView0 != null) {
                return new q1(((LinearLayout)view0), imageView0, recyclerView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static q1 c(@NonNull LayoutInflater layoutInflater0) {
        return q1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static q1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00D0, viewGroup0, false);  // layout:dialog_fragment_reply_more
        if(z) {
            viewGroup0.addView(view0);
        }
        return q1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

