
package com.ideamart.sms.sample.db;

import java.util.HashMap;

/**
 * This class is created for perform database operations.
 */
public class dbClass {

    private static HashMap<String, String> map;

    protected dbClass() {}

    public static HashMap getDBInstance() {
        if(map == null) {
            map  = new HashMap<String, String>();
        }
        return map;
    }

}
