package view;

import model.Mail;
import model.Histogram;
import java.util.List;


public class MailBuilder {

    public static Histogram<String> build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram<>();
        for(Mail mail : mailList) {
            histogram.increment(mail.getDomain());
        }
    return histogram;
    }

}
