package collectionsprogram;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] StrArray = text.split(" ");
		String StrArrayNew = "";
		StrArrayNew = StrArray[0];
		for (int i = 1; i < StrArray.length; i++) {
			//System.out.println(StrArray[i]);
			boolean flag = false;
			for (int j = (i + 1); j < StrArray.length; j++) {
				if (StrArray[i].equals(StrArray[j])) {
					StrArrayNew = StrArrayNew + " ";
					//System.out.println(StrArrayNew);
					break;

				} else {
					flag = true;
				}

			}
			if (flag) {
				StrArrayNew = StrArrayNew + " " + StrArray[i];
			}

		}
		//System.out.println(StrArrayNew);
	}
}