public interface FunctionWithException<T, R, E extends Exception> {

    /**
     * Applies the function to the given input.
     *
     * @param t The input argument.
     * @return The result of applying the function.
     * @throws E Possible exception thrown during the operation.
     */
    R apply(T t) throws E;
}