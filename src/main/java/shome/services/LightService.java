package shome.services;

import shome.exceptions.PinNotFoundException;

/**
 *
 * @author danielvolkov94@gmail.com
 */
public interface LightService {
    void turnLight(String lightGroup) throws PinNotFoundException;
}
