package day4;

import java.util.Scanner;

abstract class Media {
	private String mediaId;
	String title;
	int durationminutes;

	Media(String mediaId, String title, int durationminutes) {
		this.mediaId = mediaId;
		this.title = title;
		this.durationminutes = durationminutes;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDurationminutes() {
		return durationminutes;
	}

	public void setDurationminutes(int durationminutes) {
		this.durationminutes = durationminutes;
	}
	  public String toString() {
	        return "Media ID:" + mediaId + ", Title:" + title + ", Duration(minutes):" + durationminutes;
	    }
	
}

class Movie extends Media {
	private String director;
	private String genre;

	Movie(String mediaId, String title, int durationminutes, String director, String genre) {
		super(mediaId, title, durationminutes);
		this.director = director;
		this.genre = genre;

	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenere() {
		return genre;
	}

	public void setGenere(String genere) {
		this.genre = genere;
	}
	@Override
	public String toString(){
		return "Media ID:" +getMediaId() +",Title:" +getTitle() +",Duration(minutes):"+getDurationminutes()+",Director:"+getDirector()+ ",Genre:" +getGenere();
		
	}
	
	
}

public class Mainmedia {
	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter mediaid: ");
	String mediaid=scanner.nextLine();
	
	System.out.println("Enter title: ");
	String title=scanner.nextLine();
	
	System.out.println("Enter duration: ");
	int duration= scanner.nextInt();
	scanner.nextLine();
	
	System.out.println("Enter Directorname: ");
	String directorname=scanner.nextLine();
	
	
	System.out.println("Enter Genre: ");
	String genre=scanner.nextLine();
	
	Movie movie= new Movie(mediaid,title,duration,directorname,genre);
	System.out.println("Movie Information:");
	System.out.println(movie);
	
	}
}
