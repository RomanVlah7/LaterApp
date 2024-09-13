package discovery.tools;


import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LogTools {


    public void logMethodInfoDebug(String variableInfo, Logger logOutput) {
        // Get the current stack trace
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        // Index 2 should give us the method that called `logMethodInfo` (which is `deleteById` in this case)
        StackTraceElement element = stackTrace[2];

        // Extract the class name and method name
        String className = element.getClassName();
        String methodName = element.getMethodName();

        // Log the class name, method name, and provided variable info

        logOutput.debug("Class: {}, Method: {}, Info: {}", className, methodName, variableInfo);
    }
}
