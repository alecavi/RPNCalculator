package stack;

/**
 * An exception thrown by a stack when attempting to return a nonexistent element
 * @author Alessandro Cavicchioli
 * @version 1.0
 */
public class EmptyStackException extends RuntimeException 
{
	private static final long serialVersionUID = 1L;

	/** Constructs a new exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public EmptyStackException() 
    {
        super();
    }

    /** Constructs a new exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param   message   the detail message. The detail message is saved for
     *          later retrieval by the {@link #getMessage()} method.
     */
    public EmptyStackException(String message) 
    {
        super(message);
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause. <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param   message   the detail message (which is saved for later retrieval
     *        	by the {@link #getMessage()} method).
     * @param   cause   the cause (which is saved for later retrieval by the
     *      	{@link #getCause()} method).  (A {@code null} value is
     *       	permitted, and indicates that the cause is nonexistent or
     *      	unknown.)
     */
    public EmptyStackException(String message, Throwable cause) 
    {
        super(message, cause);
    }

    /** Constructs a new exception with the specified cause and a
     * detail message of {@code (cause==null ? null : cause.toString())}
     * (which typically contains the class and detail message of
     * {@code cause}).  This constructor is useful for runtime exceptions
     * that are little more than wrappers for other throwables.
     *
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A {@code null} value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     */
    public EmptyStackException(Throwable cause) 
    {
        super(cause);
    }
}