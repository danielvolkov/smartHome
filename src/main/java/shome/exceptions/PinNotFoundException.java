package shome.exceptions;

/**
 * throws when application can not find necessary Pin Object of available pin List
 *
 * @author danielvolkov94@gmail.com
 */
public class PinNotFoundException extends Exception {

    public PinNotFoundException(String infMessage) {
        super(infMessage);
    }
}
