package org.example.FinalProject.Log;

import org.example.FinalProject.Model.Complex;
import org.example.FinalProject.Model.ServiceInterface;
import org.example.FinalProject.View.ViewConsole;

public class LogComplexOperation {
    public static Complex Logging (ServiceInterface service, Complex num1, Complex num2, String operation) {
        StringBuilder logging = new StringBuilder();
        logging.append("Log: ");
        logging.append(num1.toString() + " " + operation + " " + num2.toString() + " = ");
        Complex result = service.Operation(num1, num2);
        logging.append(result.toString());
        LogInterface log = new Log();
        log.loggerOut(logging);
        return result;
    }
}
