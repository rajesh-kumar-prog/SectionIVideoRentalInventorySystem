/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 18/08/20
 *  Time: 3:43 PM
 *  File Name : Main.java
 * */
package execution;

import definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        video.setVideoName("Sivaji: The Boss");
        video.setRating(5);
        video.setCheckout(true);
        System.out.println(
                "Video Name: " + video.getVideoName() + ", " +
                        "Video Rating: " + video.getRating() + ", " +
                        "Is video available: " + video.isCheckout() + "."
        );
    }
}
