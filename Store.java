import java.util.*;
class video{
    String title;
    boolean[] flag = new boolean[10];
    int [] user_rating = new int[10];
    
    void being_checkdout(int i ){
        if(flag[i] == true)
        flag [i] = false;
    }
    void being_returned(int j){
        if(flag[j] == false)
          flag[j] = true;
    }
    void recieve_rating(int n, int no){
        user_rating[n] =no;
    }
}
class VideoStore extends video{
    video obj = new video();
    String[] videos = new String[10];
    int[] rate = new int[10];
    int i =0;
    
    void addVideo(String title){
        video[i++]=title;
    }
    void checkOut(String nm){
        int j,index =0;
        for(j =0;j<3;j++){
            if(videos[j].equals(nm)){
                index=j;
            }
        }
        being_checkdout(index);
    }
    void returnVideo(String nm){
        int j,index =0;
        for(j=0;j<3;j++){
             if(videos[j].equals(nm)){
                index=j;
            }
            being_returned(index);
        }
        void recieveRating(int n , int no){
            rate[n]=no;
            recieve_rating(n,no);
        }
        void listInventory()
        {
            int i;
            for(i=0;i<3;i++){
                int i;
                for(i=0;i<3;i++){
                    if(flag[i]== true)
                    System.out.println(videos[i] +" "+ flag[i]);
                }
            }
        }
    }
}

public class store extends VideoStore{
    public static void main(String args[]){
        VideoStore 0 = new VideoStore();
        Arrays.fill(o.flag,true);
        o.addVideo("The Matrix");
        o.addVideo("Godfather II");
		o.addVideo("Star War Episode IV: A New Hope");
		o.receiveRating(0, 4);
		o.receiveRating(1, 3);
		o.receiveRating(2, 5);
	    o.checkOut("The Matrix");
		o.checkOut("Godfather II");
		o.checkOut("Star War Episode IV: A New Hope");
		o.returnVideo("The Matrix");
		o.returnVideo("Godfather II");
		o.returnVideo("Star War Episode IV: A New Hope");
		o.checkOut("Godfather II");
		o.listInventory();
		
	}
}
    }
}
