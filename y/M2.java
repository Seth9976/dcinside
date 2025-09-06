package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class m2 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final RecyclerView c;

    private m2(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull RecyclerView recyclerView0) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = recyclerView0;
    }

    @NonNull
    public static m2 a(@NonNull View view0) {
        int v = 0x7F0B0851;  // id:minor_hot_empty_text
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0851);  // id:minor_hot_empty_text
        if(textView0 != null) {
            v = 0x7F0B0856;  // id:minor_hot_list
            RecyclerView recyclerView0 = (RecyclerView)ViewBindings.a(view0, 0x7F0B0856);  // id:minor_hot_list
            if(recyclerView0 != null) {
                return new m2(((ConstraintLayout)view0), textView0, recyclerView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static m2 c(@NonNull LayoutInflater layoutInflater0) {
        return m2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static m2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E010D, viewGroup0, false);  // layout:fragment_minor_hot
        if(z) {
            viewGroup0.addView(view0);
        }
        return m2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

