package day4;

import java.util.Scanner;

class Player {
	private String name;
	private String position;

	Player(String name, String position) {
		this.name = name;
		this.position = position;

	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String getInfo() {
		return "Name:" + name + "Position:" + position;

	}

}

class SoccerPlayer extends Player {
	SoccerPlayer(String name, String position) {
		super(name, position);
	}

	@Override
	public String getInfo() {
		return "Name:" + getName() + "Position:" + getPosition();
	}

}

public class SoccerGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scanner.nextLine();
		System.out.println("Enter position");
		String position = scanner.nextLine();
		SoccerPlayer soccerplayer = new SoccerPlayer(name, position);
		System.out.println("Soccer Player's Information:");
		System.out.println(soccerplayer.getInfo());
		scanner.close();
	}

}
