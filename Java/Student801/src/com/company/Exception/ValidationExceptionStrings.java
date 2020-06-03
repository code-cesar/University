package com.company.Exception;

public class ValidationExceptionStrings extends Exception
{
        public ValidationExceptionStrings(String message) {
            super("[String Exception] " + message);
        }
}
