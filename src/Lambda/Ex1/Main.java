package Lambda.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    private static List<String> someEmails = new ArrayList<>();

    static {
        someEmails.add("cmcandrew0@prweb.com");
        someEmails.add("athyng1@earthlink.net");
        someEmails.add("ldurdle2@nyu.edu");
        someEmails.add("mmance3@hostgator.com");
        someEmails.add("ncinderey4@technorati.com");
        someEmails.add("dmatuskiewicz5@macromedia.com");
        someEmails.add("abowyer6@moonfruit.com");
        someEmails.add("bsendley7@guardian.co.uk");
        someEmails.add("zelford8@archive.org");
        someEmails.add("estocks9@angelfire.com");
        someEmails.add("gtrethowana@cbc.ca");
        someEmails.add("dtersayb@usa.gov");
        someEmails.add("orubrac@paypal.com");
        someEmails.add("fwanlessd@yelp.com");
        someEmails.add("aduggarye@pagesperso-orange.fr");
        someEmails.add("hsealsf@tmall.com");
        someEmails.add("eswitsurg@theguardian.com");
        someEmails.add("rdunnawayh@ox.ac.uk");
        someEmails.add("tfrearsoni@examiner.com");
        someEmails.add("lprahlj@wordpress.com");
    }

    public static void main(String[] args) {
        printValidEmails(email -> email.endsWith(".com"));// doar emailuri care se termina cu .com
        System.out.println("-------------------------------------------------------------------------------------------");
        printValidEmails(email -> email.startsWith("a"));//doar emailuri care incep cu a
        System.out.println("-------------------------------------------------------------------------------------------");
        printValidEmails(emails-> emails.startsWith("a") && emails.endsWith(".com"));//doar emailuri care incep cu a si se termina cu .com
        System.out.println("-------------------------------------------------------------------------------------------");
        printValidEmails(email->{
            int length = email.length();
            return length %2 == 0&& email.endsWith(".com");//are valoare para si se termina cu .com
        });
    }

    public static void printValidEmails(Predicate<String> validator) {
        for (String email : someEmails) {
            if (validator.test(email)) {
                System.out.println(email);
            }
        }
    }
}
