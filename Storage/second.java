package Storage;

public class second {

	public static void main(String[] args) {
		String s = "14.015_AUDI";
		String[] part1 = s.split("_"); //returns an array with the 2 parts
		String firstPart = part1[0]; //14.015
		System.out.println(firstPart);
    }
}
