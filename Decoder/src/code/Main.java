package code;

public class Main {
	public static void main(String[] args) {
		FileReaderWriter.writeFile("Output.txt", Decoder.decodeText(FileReaderWriter.readFile("Out.txt")));
	}
}
