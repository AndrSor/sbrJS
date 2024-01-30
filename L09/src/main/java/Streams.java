import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Streams<T> {
    private List<T> data;

    public Streams(List<T> list) {
        this.data = new ArrayList<>(data);
    }

    public static <T> Streams<T> of(List<T> list){
        return new Streams<>(list);
    }

    public Streams<T> filter(Predicate<? super T> predicate){
        data.removeIf(predicate.negate());
        return this;
    }
/*
    public <R, E extends Exception> CustomStream<R> transform(FunctionWithException<? super T, ? extends R, E> trans) throws E {
        List<R> transformed = new ArrayList<>();
        for (T elem : data)
            transformed.add(trans.apply(elem));

        return new Streams<>(transformed);
    }
*/
    public <K, V> Map<K, V> toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends V> valueMapper) {
        Map<K, V> result = new HashMap<>();
        for (T element : data) {
            result.put(keyMapper.apply(element), valueMapper.apply(element));
        }
        return result;
    }


}
