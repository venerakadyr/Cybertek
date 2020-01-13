package abstraction;

import classes.Facebook;

public class InternetSearching {
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.version=2.3;
        chrome.launch();
       chrome.browse("www.stackOverFlow.com");
       chrome.addTab("www.cybertekSchool.com");


        Firefox f=new Firefox();
        f.launch();
    }
}
