package com.example;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "demo", description = "...",
        mixinStandardHelpOptions = true)
public class DemoCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(DemoCommand.class, args);
    }

    public void run() {
        // business logic here
        System.out.println("running ...");
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
