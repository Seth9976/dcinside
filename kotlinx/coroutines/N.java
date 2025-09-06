package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;
import y4.l;
import y4.m;

public interface n extends Y0 {
    public static final class a implements n {
        @l
        private final Function1 a;

        public a(@l Function1 function10) {
            this.a = function10;
        }

        @Override  // kotlinx.coroutines.n
        public void a(@m Throwable throwable0) {
            this.a.invoke(throwable0);
        }

        @Override
        @l
        public String toString() {
            return "CancelHandler.UserSupplied[" + U.a(this.a) + '@' + U.b(this) + ']';
        }
    }

    void a(@m Throwable arg1);
}

