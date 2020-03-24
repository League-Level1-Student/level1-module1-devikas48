package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
String question = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
String questionTwo = JOptionPane.showInputDialog("How long do you want to cook it?");
int Howlongdoyouwanttocookit = Integer.parseInt(questionTwo);
	Popcorn popcorn = new Popcorn(question);
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(popcorn);
	microwave.setTime(Howlongdoyouwanttocookit);
	microwave.startMicrowave();
	
}
}
