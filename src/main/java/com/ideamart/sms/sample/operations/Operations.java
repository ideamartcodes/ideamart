
package com.ideamart.sms.sample.operations;

import com.ideamart.sms.sample.db.dbClass;
import com.ideamart.sms.sample.send.SendMessage;
import hms.kite.samples.api.sms.messages.MoSmsReq;
import java.util.HashMap;

/**
 * This class is created for do operations for messages.
 */
public class Operations {

    private String message;
    private HashMap<String, String> map;

    public Operations(String message) {
        this.message = message;
    }

    public void passToDatabase(MoSmsReq moSmsReq) {
        String [] messageParts = message.split(" ");
        if(messageParts.length == 3) {
            map = dbClass.getDBInstance();
            map.put(messageParts[1], messageParts[2]);
            SendMessage sendMessage = new SendMessage();
            //:TODO: Password and URL should be replaced when you hosting the application
            sendMessage.SendMessage("Your Message Saved",moSmsReq.getApplicationId(),moSmsReq.getSourceAddress()
                    ,"password","http://127.0.0.1:7000/sms/send");
        } else {
            SendMessage sendMessage = new SendMessage();
            sendMessage.SendMessage("Message format is wrong",moSmsReq.getApplicationId(),moSmsReq.getSourceAddress()
                    ,"password","http://127.0.0.1:7000/sms/send");
        }
    }
}
