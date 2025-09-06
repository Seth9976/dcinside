package androidx.compose.ui.node;

public interface DiffCallback {
    boolean a(int arg1, int arg2);

    void b(int arg1, int arg2);

    void c(int arg1, int arg2);

    void remove(int arg1);
}

