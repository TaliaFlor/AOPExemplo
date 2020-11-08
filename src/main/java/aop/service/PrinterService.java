package aop.service;

import aop.annotation.LogAction;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class PrinterService {

    @LogAction(msg = "Printa N valores, com N = ", logParam = true)
    public void printNValues(int n) {
        IntStream.rangeClosed(1, n)
                .forEach(System.out::println);
    }

}
