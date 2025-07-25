public class Task11b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Java is Fun.");
		sb.append(" Really");
		sb.insert(8, "Very");
		sb.delete(0, 5);
		System.out.println(sb);
	}
}
