
package com.ideamart.sms.sample.receive;

import com.ideamart.sms.sample.operations.Operations;
import hms.kite.samples.api.sms.MoSmsListener;
import hms.kite.samples.api.sms.messages.MoSmsReq;

/**
 * This class is created for receive messages.
 */
public class Receiver implements MoSmsListener {
    @Override
    public void init() {

    }

    @Override
    public void onReceivedSms(MoSmsReq moSmsReq) {
        String message = moSmsReq.getMessage();
        Operations operations = new Operations(message);
        operations.passToDatabase(moSmsReq);
    }
}
