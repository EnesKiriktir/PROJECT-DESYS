
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Management {
	
	public void Manage() throws IOException {
		loadAnswerSheet();
	}
	
	public void loadAnswerSheet() throws IOException {
		
		SingleLinkedList answerSheet = new SingleLinkedList();
		
		FileReader fr = new FileReader("AnswerSheet.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		line = br.readLine();
		String[] array = line.split(",");

		int i = 0;
		for (int j = 0; j < 20; j++) {
			answerSheet.add(array[j]);
		}
		
		answerSheet.display();

	}
	
}