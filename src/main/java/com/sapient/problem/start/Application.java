package com.sapient.problem.start;

import com.core.config.AppConfig;
import com.sapient.problem.entity.Transaction;
import com.sapient.problem.receiver.InputFileReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Application {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        InputFileReader inputFileReader = applicationContext.getBean(InputFileReader.class);
        List<Transaction> transactions = inputFileReader.readFileAndLoadTransactions();
    }

}
