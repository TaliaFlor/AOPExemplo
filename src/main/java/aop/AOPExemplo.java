package aop;

import aop.service.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Scanner;

@SpringBootApplication
public class AOPExemplo implements CommandLineRunner {

    @Autowired
    private PrinterService service;

    public static void main(String[] args) {
        new SpringApplicationBuilder(AOPExemplo.class).headless(false).run(args);
    }

    @Override
    public void run(String... args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escolha um limite: ");
        int n = in.nextInt();
        service.printNValues(n);
    }

}
