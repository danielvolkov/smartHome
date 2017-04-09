package shome.services;

import shome.exceptions.PinNotFondException;

/**
 *
 * @author danielvolkov94@gmail.com
 */
public interface LightService {
    void turnLight(String lightGroup) throws PinNotFondException;
}
