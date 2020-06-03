package com.company.Exception;
import java.lang.Exception;
public class ValidationExceptionRecursion extends Exception
{
        private String _lineNotSpaceException = null;

        public String getLineNotSpaceException() {
            return  "[Recursion Exception] " + _lineNotSpaceException;
        }

        public ValidationExceptionRecursion(String message) {
            super("[Recursion Exception] " + message);
        }

        public ValidationExceptionRecursion(String message,String aLineNotSpaceException) {
            super("[Recursion Exception] " + message);
            _lineNotSpaceException = aLineNotSpaceException;
        }

}
