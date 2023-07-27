package org.mineacademy.fo.remain.nbt;

/**
 * A generic {@link RuntimeException} that can be thrown by most methods in the
 * NBTAPI.
 *
 * @author tr7zw
 *
 */
public class NbtApiException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -993309714559452334L;
	/**
	 * Keep track of the plugin selfcheck. Null = not
	 * checked(silentquickstart/shaded) true = selfcheck failed false = everything
	 * should be fine, but apparently wasn't?
	 */
	public static Boolean confirmedBroken = null;

	/**
	 *
	 */
	public NbtApiException() {
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public NbtApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(generateMessage(message), cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public NbtApiException(String message, Throwable cause) {
		super(generateMessage(message), cause);
	}

	/**
	 * @param message
	 */
	public NbtApiException(String message) {
		super(generateMessage(message));
	}

	/**
	 * @param cause
	 */
	public NbtApiException(Throwable cause) {
		super(generateMessage(cause == null ? null : cause.toString()), cause);
	}

	private static String generateMessage(String message) {
		return message;
	}

}
