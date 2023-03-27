package end_sem3;

import java.io.IOException;

import com.google.zxing.WriterException;

public class Main1 {
	public static void main(String[] args) {
		String final_pid = "";
		final_pid = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <PrintLetterBarcodeData uid=\"XXXXXXXX2728\" name=\"Bhamidipati Prahas\" gender=\"M\" yob=\"2000\" co=\"S/O B V S Subrahmanyam\" house=\"#C-2/6\" street=\"DRDO Township, Phase-1\" loc=\"C V Raman Nagar\" vtc=\"Bangalore East\" po=\"C.V.Raman Nagar\" dist=\"Bangalore\" state=\"Karnataka\" pc=\"560093\" dob=\"10/05/2000\"/>";

		try {
			GenerateQRCode.generateQRcode(final_pid, 400, 400);
		} catch (IOException | WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
