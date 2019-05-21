package progress_dots;

public class MessageTyper {

	public static void main(String[] args) {
		String text = "Thank you for running this code ...@\n"
				+ "Getting data.. obtaining database connections.\n@This may take some time.....@"
				+ "\nCalculating this text on a new line and printing..@"
				+ "\n\nWhen data is calculated you will be prompted to confirm "
				+ "and asked to provide credentials.\n@Please wait for the datat to be returned$..........................................";
		char wait = '@';
		char lengthen_wait = '$';
		int interval = 65;
		int placeInString = 0;

		try { 
			for (int index = 0; index < text.length(); index++) {

				if (text.charAt(index) == lengthen_wait) {
					interval = 1000;
					continue;
				}

				if (text.charAt(index) != wait) {
					System.out.print(text.charAt(index));
					Thread.sleep(interval);
				} else {
					Thread.sleep(1000);
				}
			}


		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
