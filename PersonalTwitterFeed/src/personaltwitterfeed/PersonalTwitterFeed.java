/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltwitterfeed;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author CCannon
 */
public class PersonalTwitterFeed {

    private static final int MAX_NUMBER_TWEETS = 200;
    private static Scanner keyboard;
    private static String tweeterName;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tweets = new String[MAX_NUMBER_TWEETS];
        keyboard = new Scanner(System.in);
        System.out.println("Welcome to your personal Twitter!");
        System.out.println("What's your name, tweeter?");
        
        tweeterName = keyboard.nextLine();
        
        System.out.println("Nice to meet you " + tweeterName + "!");
        System.out.println("Enter your tweets and I will add them to your timeline!");
        
        int numTweets = 0;
        
        while(numTweets < (MAX_NUMBER_TWEETS - 1)) {
            tweets[numTweets] = keyboard.nextLine();
            numTweets++;
            
            System.out.println(tweeterName + "'s Personal Twitter Feed:");
            for(int i = 0; i < numTweets; i++) {
                System.out.println("- " + tweets[i] + " at " + getCurrentTimeStamp());
            }
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
            if(numTweets < (MAX_NUMBER_TWEETS - 1))
                System.out.println("Enter your next tweet:");
        }
        
        System.out.println("Your twitter feed is full");
    }
    public static String getCurrentTimeStamp(){
        String pattern = "yyyy-MM-dd HH:mm:ss.SSSZ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String time = simpleDateFormat.format(new Date());
        return time;
    }
    public static void newTweet(String [] tweets){
        int numTweets = 0;
        
        while(numTweets < (MAX_NUMBER_TWEETS - 1)) {
            tweets[numTweets] = keyboard.nextLine();
            numTweets++;
            
            System.out.println(tweeterName + "'s Personal Twitter Feed:");
            for(int i = 0; i < numTweets; i++) {
                System.out.println("- " + tweets[i] + " at " + getCurrentTimeStamp());
            }
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
            if(numTweets < (MAX_NUMBER_TWEETS - 1))
                System.out.println("Enter your next tweet:");
        }
        
        System.out.println("Your twitter feed is full");
}
    }
