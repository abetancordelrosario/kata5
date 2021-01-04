package kata5;

import view.HistogramDisplay;
import view.MailBuilder;
import model.Mail;
import model.Histogram;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.List;

public class Kata5 {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> mailHistogram = MailBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM...", mailHistogram);
        histogramDisplay.execute();    
        
    }
    
}
