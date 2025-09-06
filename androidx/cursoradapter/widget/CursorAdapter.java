package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilterClient {
    class ChangeObserver extends ContentObserver {
        final CursorAdapter a;

        ChangeObserver() {
            super(new Handler());
        }

        @Override  // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override  // android.database.ContentObserver
        public void onChange(boolean z) {
            CursorAdapter.this.k();
        }
    }

    class MyDataSetObserver extends DataSetObserver {
        final CursorAdapter a;

        @Override  // android.database.DataSetObserver
        public void onChanged() {
            CursorAdapter.this.a = true;
            CursorAdapter.this.notifyDataSetChanged();
        }

        @Override  // android.database.DataSetObserver
        public void onInvalidated() {
            CursorAdapter.this.a = false;
            CursorAdapter.this.notifyDataSetInvalidated();
        }
    }

    @RestrictTo({Scope.b})
    protected boolean a;
    @RestrictTo({Scope.b})
    protected boolean b;
    @RestrictTo({Scope.b})
    protected Cursor c;
    @RestrictTo({Scope.b})
    protected Context d;
    @RestrictTo({Scope.b})
    protected int e;
    @RestrictTo({Scope.b})
    protected ChangeObserver f;
    @RestrictTo({Scope.b})
    protected DataSetObserver g;
    @RestrictTo({Scope.b})
    protected CursorFilter h;
    @RestrictTo({Scope.b})
    protected FilterQueryProvider i;
    @Deprecated
    public static final int j = 1;
    public static final int k = 2;

    @Deprecated
    public CursorAdapter(Context context0, Cursor cursor0) {
        this.g(context0, cursor0, 1);
    }

    public CursorAdapter(Context context0, Cursor cursor0, int v) {
        this.g(context0, cursor0, v);
    }

    public CursorAdapter(Context context0, Cursor cursor0, boolean z) {
        this.g(context0, cursor0, (z ? 1 : 2));
    }

    @Override  // androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public CharSequence a(Cursor cursor0) {
        return cursor0 == null ? "" : cursor0.toString();
    }

    @Override  // androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public void b(Cursor cursor0) {
        Cursor cursor1 = this.m(cursor0);
        if(cursor1 != null) {
            cursor1.close();
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public Cursor c() {
        return this.c;
    }

    @Override  // androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public Cursor d(CharSequence charSequence0) {
        return this.i == null ? this.c : this.i.runQuery(charSequence0);
    }

    public abstract void e(View arg1, Context arg2, Cursor arg3);

    public FilterQueryProvider f() {
        return this.i;
    }

    void g(Context context0, Cursor cursor0, int v) {
        boolean z = false;
        if((v & 1) == 1) {
            v |= 2;
            this.b = true;
        }
        else {
            this.b = false;
        }
        if(cursor0 != null) {
            z = true;
        }
        this.c = cursor0;
        this.a = z;
        this.d = context0;
        this.e = z ? cursor0.getColumnIndexOrThrow("_id") : -1;
        if((v & 2) == 2) {
            this.f = new ChangeObserver(this);
            this.g = new MyDataSetObserver(this);
        }
        else {
            this.f = null;
            this.g = null;
        }
        if(z) {
            ChangeObserver cursorAdapter$ChangeObserver0 = this.f;
            if(cursorAdapter$ChangeObserver0 != null) {
                cursor0.registerContentObserver(cursorAdapter$ChangeObserver0);
            }
            DataSetObserver dataSetObserver0 = this.g;
            if(dataSetObserver0 != null) {
                cursor0.registerDataSetObserver(dataSetObserver0);
            }
        }
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        if(this.a) {
            return this.c == null ? 0 : this.c.getCount();
        }
        return 0;
    }

    @Override  // android.widget.BaseAdapter
    public View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
        if(this.a) {
            this.c.moveToPosition(v);
            if(view0 == null) {
                view0 = this.i(this.d, this.c, viewGroup0);
            }
            this.e(view0, this.d, this.c);
            return view0;
        }
        return null;
    }

    @Override  // android.widget.Filterable
    public Filter getFilter() {
        if(this.h == null) {
            this.h = new CursorFilter(this);
        }
        return this.h;
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        if(this.a) {
            Cursor cursor0 = this.c;
            if(cursor0 != null) {
                cursor0.moveToPosition(v);
                return this.c;
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return !this.a || (this.c == null || !this.c.moveToPosition(v)) ? 0L : this.c.getLong(this.e);
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        if(!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if(!this.c.moveToPosition(v)) {
            throw new IllegalStateException("couldn\'t move cursor to position " + v);
        }
        if(view0 == null) {
            view0 = this.j(this.d, this.c, viewGroup0);
        }
        this.e(view0, this.d, this.c);
        return view0;
    }

    @Deprecated
    protected void h(Context context0, Cursor cursor0, boolean z) {
        this.g(context0, cursor0, (z ? 1 : 2));
    }

    @Override  // android.widget.BaseAdapter
    public boolean hasStableIds() {
        return true;
    }

    public View i(Context context0, Cursor cursor0, ViewGroup viewGroup0) {
        return this.j(context0, cursor0, viewGroup0);
    }

    public abstract View j(Context arg1, Cursor arg2, ViewGroup arg3);

    protected void k() {
        if(this.b && (this.c != null && !this.c.isClosed())) {
            this.a = this.c.requery();
        }
    }

    public void l(FilterQueryProvider filterQueryProvider0) {
        this.i = filterQueryProvider0;
    }

    public Cursor m(Cursor cursor0) {
        Cursor cursor1 = this.c;
        if(cursor0 == cursor1) {
            return null;
        }
        if(cursor1 != null) {
            ChangeObserver cursorAdapter$ChangeObserver0 = this.f;
            if(cursorAdapter$ChangeObserver0 != null) {
                cursor1.unregisterContentObserver(cursorAdapter$ChangeObserver0);
            }
            DataSetObserver dataSetObserver0 = this.g;
            if(dataSetObserver0 != null) {
                cursor1.unregisterDataSetObserver(dataSetObserver0);
            }
        }
        this.c = cursor0;
        if(cursor0 != null) {
            ChangeObserver cursorAdapter$ChangeObserver1 = this.f;
            if(cursorAdapter$ChangeObserver1 != null) {
                cursor0.registerContentObserver(cursorAdapter$ChangeObserver1);
            }
            DataSetObserver dataSetObserver1 = this.g;
            if(dataSetObserver1 != null) {
                cursor0.registerDataSetObserver(dataSetObserver1);
            }
            this.e = cursor0.getColumnIndexOrThrow("_id");
            this.a = true;
            this.notifyDataSetChanged();
            return cursor1;
        }
        this.e = -1;
        this.a = false;
        this.notifyDataSetInvalidated();
        return cursor1;
    }
}

