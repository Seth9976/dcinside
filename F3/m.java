package f3;

import java.util.concurrent.Callable;

public interface m extends Callable {
    @Override
    Object call();
}

