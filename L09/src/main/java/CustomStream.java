import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public interface CustomStream<T> {

    Streams<T> filter(Predicate<? super T> predicate);

    <R, E extends Exception> CustomStream<R> transform(FunctionWithException<? super T, ? extends R, E> trans) throws E;

    <K, V> Map<K, V> toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends V> valueMapper);

    List<T> toList();
}