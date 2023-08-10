package edu.school.calc;

import java.io.IOException;

public class Model {
    String modelCorePath;

    public void setModelCorePath(String modelCorePath) {
        this.modelCorePath = modelCorePath;
    }

    public String validExpression(String exp, String x) throws IOException {
        return getResult("valid",exp, x);
    }

    public String computeExpression(String exp, String x) throws IOException {
        return getResult("compute",exp, x).replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1");
    }

    private String getResult(String mode, String exp, String x) throws IOException {
        ProcessBuilder processBuilder =
                new ProcessBuilder("/bin/bash",
                                    "-c",
                                    "export TERM=xterm && "+ modelCorePath +" '"+mode+"'"+" "+"'"+exp+"'"+" "+"'"+x+"'");

        return new String(processBuilder.start().getInputStream().readAllBytes());
    }
}
