package com.sapient.problem.receiver;

import com.sapient.problem.entity.Transaction;
import com.sapient.problem.receiver.factory.InputReceiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InputFileReader {


    @Value("${file.path}")
    private String filePath;

    @Autowired
    @Qualifier("csvReceiver")
    InputReceiver inputReceiver;


    public List<Transaction> readFileAndLoadTransactions() {

        return inputReceiver.readData(filePath);

    }

}
