package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.core.content.ContextCompat;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {
    static final class ChildViewCache {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public ChildViewCache(View view0) {
            this.a = (TextView)view0.findViewById(0x1020014);
            this.b = (TextView)view0.findViewById(0x1020015);
            this.c = (ImageView)view0.findViewById(0x1020007);
            this.d = (ImageView)view0.findViewById(0x1020008);
            this.e = (ImageView)view0.findViewById(id.edit_query);
        }
    }

    private int A;
    private int B;
    private static final boolean C = false;
    private static final String D = "SuggestionsAdapter";
    private static final int E = 50;
    static final int F = 0;
    static final int G = 1;
    static final int H = 2;
    static final int I = -1;
    private final SearchView o;
    private final SearchableInfo p;
    private final Context q;
    private final WeakHashMap r;
    private final int s;
    private boolean t;
    private int u;
    private ColorStateList v;
    private int w;
    private int x;
    private int y;
    private int z;

    public SuggestionsAdapter(Context context0, SearchView searchView0, SearchableInfo searchableInfo0, WeakHashMap weakHashMap0) {
        super(context0, searchView0.getSuggestionRowLayout(), null, true);
        this.t = false;
        this.u = 1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.o = searchView0;
        this.p = searchableInfo0;
        this.s = searchView0.getSuggestionCommitIconResId();
        this.q = context0;
        this.r = weakHashMap0;
    }

    private Drawable A(Cursor cursor0) {
        return this.A == -1 ? null : this.y(cursor0.getString(this.A));
    }

    public int B() {
        return this.u;
    }

    Cursor C(SearchableInfo searchableInfo0, String s, int v) {
        String[] arr_s = null;
        if(searchableInfo0 == null) {
            return null;
        }
        String s1 = searchableInfo0.getSuggestAuthority();
        if(s1 == null) {
            return null;
        }
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("content").authority(s1).query("").fragment("");
        String s2 = searchableInfo0.getSuggestPath();
        if(s2 != null) {
            uri$Builder0.appendEncodedPath(s2);
        }
        uri$Builder0.appendPath("search_suggest_query");
        String s3 = searchableInfo0.getSuggestSelection();
        if(s3 == null) {
            uri$Builder0.appendPath(s);
        }
        else {
            arr_s = new String[]{s};
        }
        if(v > 0) {
            uri$Builder0.appendQueryParameter("limit", String.valueOf(v));
        }
        Uri uri0 = uri$Builder0.build();
        return this.q.getContentResolver().query(uri0, null, s3, arr_s, null);
    }

    private static String D(Cursor cursor0, int v) {
        if(v == -1) {
            return null;
        }
        try {
            return cursor0.getString(v);
        }
        catch(Exception exception0) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", exception0);
            return null;
        }
    }

    public void E(int v) {
        this.u = v;
    }

    private void F(ImageView imageView0, Drawable drawable0, int v) {
        imageView0.setImageDrawable(drawable0);
        if(drawable0 == null) {
            imageView0.setVisibility(v);
            return;
        }
        imageView0.setVisibility(0);
        drawable0.setVisible(false, false);
        drawable0.setVisible(true, false);
    }

    private void G(TextView textView0, CharSequence charSequence0) {
        textView0.setText(charSequence0);
        if(TextUtils.isEmpty(charSequence0)) {
            textView0.setVisibility(8);
            return;
        }
        textView0.setVisibility(0);
    }

    private void H(String s, Drawable drawable0) {
        if(drawable0 != null) {
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            this.r.put(s, drawable$ConstantState0);
        }
    }

    private void I(Cursor cursor0) {
        Bundle bundle0 = cursor0 == null ? null : cursor0.getExtras();
        if(bundle0 != null) {
            bundle0.getBoolean("in_progress");
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public CharSequence a(Cursor cursor0) {
        if(cursor0 == null) {
            return null;
        }
        CharSequence charSequence0 = SuggestionsAdapter.u(cursor0, "suggest_intent_query");
        if(charSequence0 != null) {
            return charSequence0;
        }
        if(this.p.shouldRewriteQueryFromData()) {
            CharSequence charSequence1 = SuggestionsAdapter.u(cursor0, "suggest_intent_data");
            if(charSequence1 != null) {
                return charSequence1;
            }
        }
        if(this.p.shouldRewriteQueryFromText()) {
            CharSequence charSequence2 = SuggestionsAdapter.u(cursor0, "suggest_text_1");
            return charSequence2 == null ? null : charSequence2;
        }
        return null;
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public void b(Cursor cursor0) {
        if(this.t) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if(cursor0 != null) {
                cursor0.close();
            }
            return;
        }
        try {
            super.b(cursor0);
            if(cursor0 != null) {
                this.w = cursor0.getColumnIndex("suggest_text_1");
                this.x = cursor0.getColumnIndex("suggest_text_2");
                this.y = cursor0.getColumnIndex("suggest_text_2_url");
                this.z = cursor0.getColumnIndex("suggest_icon_1");
                this.A = cursor0.getColumnIndex("suggest_icon_2");
                this.B = cursor0.getColumnIndex("suggest_flags");
            }
        }
        catch(Exception exception0) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", exception0);
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public Cursor d(CharSequence charSequence0) {
        String s = charSequence0 == null ? "" : charSequence0.toString();
        if(this.o.getVisibility() == 0 && this.o.getWindowVisibility() == 0) {
            try {
                Cursor cursor0 = this.C(this.p, s, 50);
                if(cursor0 != null) {
                    cursor0.getCount();
                    return cursor0;
                }
            }
            catch(RuntimeException runtimeException0) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", runtimeException0);
            }
        }
        return null;
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public void e(View view0, Context context0, Cursor cursor0) {
        ChildViewCache suggestionsAdapter$ChildViewCache0 = (ChildViewCache)view0.getTag();
        int v = this.B == -1 ? 0 : cursor0.getInt(this.B);
        if(suggestionsAdapter$ChildViewCache0.a != null) {
            String s = SuggestionsAdapter.D(cursor0, this.w);
            this.G(suggestionsAdapter$ChildViewCache0.a, s);
        }
        if(suggestionsAdapter$ChildViewCache0.b != null) {
            String s1 = SuggestionsAdapter.D(cursor0, this.y);
            CharSequence charSequence0 = s1 == null ? SuggestionsAdapter.D(cursor0, this.x) : this.r(s1);
            if(TextUtils.isEmpty(charSequence0)) {
                TextView textView0 = suggestionsAdapter$ChildViewCache0.a;
                if(textView0 != null) {
                    textView0.setSingleLine(false);
                    suggestionsAdapter$ChildViewCache0.a.setMaxLines(2);
                }
            }
            else {
                TextView textView1 = suggestionsAdapter$ChildViewCache0.a;
                if(textView1 != null) {
                    textView1.setSingleLine(true);
                    suggestionsAdapter$ChildViewCache0.a.setMaxLines(1);
                }
            }
            this.G(suggestionsAdapter$ChildViewCache0.b, charSequence0);
        }
        ImageView imageView0 = suggestionsAdapter$ChildViewCache0.c;
        if(imageView0 != null) {
            this.F(imageView0, this.z(cursor0), 4);
        }
        ImageView imageView1 = suggestionsAdapter$ChildViewCache0.d;
        if(imageView1 != null) {
            this.F(imageView1, this.A(cursor0), 8);
        }
        if(this.u != 2 && (this.u != 1 || (v & 1) == 0)) {
            suggestionsAdapter$ChildViewCache0.e.setVisibility(8);
            return;
        }
        suggestionsAdapter$ChildViewCache0.e.setVisibility(0);
        CharSequence charSequence1 = suggestionsAdapter$ChildViewCache0.a.getText();
        suggestionsAdapter$ChildViewCache0.e.setTag(charSequence1);
        suggestionsAdapter$ChildViewCache0.e.setOnClickListener(this);
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
        try {
            return super.getDropDownView(v, view0, viewGroup0);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException0);
            View view1 = this.i(this.q, this.c(), viewGroup0);
            if(view1 != null) {
                ((ChildViewCache)view1.getTag()).a.setText(runtimeException0.toString());
            }
            return view1;
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        try {
            return super.getView(v, view0, viewGroup0);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException0);
            View view1 = this.j(this.q, this.c(), viewGroup0);
            if(view1 != null) {
                ((ChildViewCache)view1.getTag()).a.setText(runtimeException0.toString());
            }
            return view1;
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public boolean hasStableIds() {
        return false;
    }

    @Override  // androidx.cursoradapter.widget.ResourceCursorAdapter
    public View j(Context context0, Cursor cursor0, ViewGroup viewGroup0) {
        View view0 = super.j(context0, cursor0, viewGroup0);
        view0.setTag(new ChildViewCache(view0));
        ((ImageView)view0.findViewById(id.edit_query)).setImageResource(this.s);
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.I(this.c());
    }

    @Override  // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.I(this.c());
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Object object0 = view0.getTag();
        if(object0 instanceof CharSequence) {
            this.o.b0(((CharSequence)object0));
        }
    }

    private Drawable p(String s) {
        Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)this.r.get(s);
        return drawable$ConstantState0 == null ? null : drawable$ConstantState0.newDrawable();
    }

    public void q() {
        this.b(null);
        this.t = true;
    }

    private CharSequence r(CharSequence charSequence0) {
        if(this.v == null) {
            TypedValue typedValue0 = new TypedValue();
            this.q.getTheme().resolveAttribute(attr.textColorSearchUrl, typedValue0, true);
            this.v = this.q.getResources().getColorStateList(typedValue0.resourceId);
        }
        CharSequence charSequence1 = new SpannableString(charSequence0);
        ((SpannableString)charSequence1).setSpan(new TextAppearanceSpan(null, 0, 0, this.v, null), 0, charSequence0.length(), 33);
        return charSequence1;
    }

    private Drawable s(ComponentName componentName0) {
        ActivityInfo activityInfo0;
        PackageManager packageManager0 = this.q.getPackageManager();
        try {
            activityInfo0 = packageManager0.getActivityInfo(componentName0, 0x80);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.w("SuggestionsAdapter", packageManager$NameNotFoundException0.toString());
            return null;
        }
        int v = activityInfo0.getIconResource();
        if(v == 0) {
            return null;
        }
        Drawable drawable0 = packageManager0.getDrawable(componentName0.getPackageName(), v, activityInfo0.applicationInfo);
        if(drawable0 == null) {
            Log.w("SuggestionsAdapter", "Invalid icon resource " + v + " for " + componentName0.flattenToShortString());
            return null;
        }
        return drawable0;
    }

    private Drawable t(ComponentName componentName0) {
        String s = componentName0.flattenToShortString();
        Drawable drawable0 = null;
        if(this.r.containsKey(s)) {
            Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)this.r.get(s);
            return drawable$ConstantState0 == null ? null : drawable$ConstantState0.newDrawable(this.q.getResources());
        }
        Drawable drawable1 = this.s(componentName0);
        if(drawable1 != null) {
            drawable0 = drawable1.getConstantState();
        }
        this.r.put(s, drawable0);
        return drawable1;
    }

    public static String u(Cursor cursor0, String s) {
        return SuggestionsAdapter.D(cursor0, cursor0.getColumnIndex(s));
    }

    private Drawable v() {
        Drawable drawable0 = this.t(this.p.getSearchActivity());
        return drawable0 == null ? this.q.getPackageManager().getDefaultActivityIcon() : drawable0;
    }

    private Drawable w(Uri uri0) {
        try {
            if(!"android.resource".equals(uri0.getScheme())) {
                InputStream inputStream0 = this.q.getContentResolver().openInputStream(uri0);
                if(inputStream0 == null) {
                    throw new FileNotFoundException("Failed to open " + uri0);
                }
                try {
                    return Drawable.createFromStream(inputStream0, null);
                }
                finally {
                    try {
                        inputStream0.close();
                    }
                    catch(IOException iOException0) {
                        Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri0, iOException0);
                    }
                }
            }
            try {
                return this.x(uri0);
            }
            catch(Resources.NotFoundException unused_ex) {
                throw new FileNotFoundException("Resource does not exist: " + uri0);
            }
        }
        catch(FileNotFoundException fileNotFoundException0) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri0 + ", " + fileNotFoundException0.getMessage());
            return null;
        }
    }

    Drawable x(Uri uri0) throws FileNotFoundException {
        int v1;
        Resources resources0;
        String s = uri0.getAuthority();
        if(TextUtils.isEmpty(s)) {
            throw new FileNotFoundException("No authority: " + uri0);
        }
        try {
            resources0 = this.q.getPackageManager().getResourcesForApplication(s);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            throw new FileNotFoundException("No package found for authority: " + uri0);
        }
        List list0 = uri0.getPathSegments();
        if(list0 == null) {
            throw new FileNotFoundException("No path: " + uri0);
        }
        int v = list0.size();
        if(v == 1) {
            try {
                v1 = Integer.parseInt(((String)list0.get(0)));
            }
            catch(NumberFormatException unused_ex) {
                throw new FileNotFoundException("Single path segment is not a resource ID: " + uri0);
            }
        }
        else {
            if(v != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri0);
            }
            v1 = resources0.getIdentifier(((String)list0.get(1)), ((String)list0.get(0)), s);
        }
        if(v1 == 0) {
            throw new FileNotFoundException("No resource found for: " + uri0);
        }
        return resources0.getDrawable(v1);
    }

    private Drawable y(String s) {
        if(s != null && !s.isEmpty() && !"0".equals(s)) {
            try {
                int v = Integer.parseInt(s);
                Drawable drawable0 = this.p("android.resource://com.dcinside.app.android/" + v);
                if(drawable0 != null) {
                    return drawable0;
                }
                Drawable drawable1 = ContextCompat.getDrawable(this.q, v);
                this.H("android.resource://com.dcinside.app.android/" + v, drawable1);
                return drawable1;
            }
            catch(NumberFormatException unused_ex) {
                Drawable drawable2 = this.p(s);
                if(drawable2 != null) {
                    return drawable2;
                }
                Drawable drawable3 = this.w(Uri.parse(s));
                this.H(s, drawable3);
                return drawable3;
            }
            catch(Resources.NotFoundException unused_ex) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + s);
                return null;
            }
        }
        return null;
    }

    private Drawable z(Cursor cursor0) {
        int v = this.z;
        if(v == -1) {
            return null;
        }
        Drawable drawable0 = this.y(cursor0.getString(v));
        return drawable0 == null ? this.v() : drawable0;
    }
}

