package end_sem3;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class GenerateQRCode {
//static function that creates QR Code  

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void generateQRcode(String data, String path, String charset, Map map, int h, int w)
			throws WriterException, IOException {
		// the BitMatrix class represents the 2D matrix of bits
		// MultiFormatWriter is a factory class that finds the appropriate Writer
		// subclass for the BarcodeFormat requested and encodes the barcode with the
		// supplied contents.
		BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset),
				BarcodeFormat.QR_CODE, w, h);
		MatrixToImageWriter.writeToFile(matrix, path.substring(path.lastIndexOf('.') + 1), new File(path));
		path = "E:\\ASEB\\2nd Year\\3rd\\DSA-2\\Quote.png";
		// Encoding charset to be used
		charset = "UTF-8";
		Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
		// generates QR code with Low level(L) error correction capability
		hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		// invoking the user-defined method that creates the QR code
		h = 400;
		w = 400;
	}

	public static void Open_file(String s) {
		try {
			File file_open = new File("E:\\ASEB\\2nd Year\\3rd\\DSA-2\\Merkle_QR.png");
			if (!Desktop.isDesktopSupported()) {
				System.out.println("Desktop Support Not Present in the system.");
				return;
			}
			Desktop desktop = Desktop.getDesktop();
			if (file_open.exists())
				desktop.open(file_open);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public static void generateQRcode(String final_pid, int i, int j) throws IOException, WriterException {
		// TODO Auto-generated method stub

		// the BitMatrix class represents the 2D matrix of bits
		// MultiFormatWriter is a factory class that finds the appropriate Writer
		// subclass for the BarcodeFormat requested and encodes the barcode with the
		// supplied contents.
		String path = "E:\\ASEB\\2nd Year\\3rd\\DSA-2\\Merkle_QR.png";
		// Encoding charset to be used
		String charset = "UTF-8";
		Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
		// generates QR code with Low level(L) error correction capability
		hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		BitMatrix matrix = new MultiFormatWriter().encode(new String(final_pid.getBytes(charset), charset),
				BarcodeFormat.QR_CODE, i, j);
		MatrixToImageWriter.writeToFile(matrix, path.substring(path.lastIndexOf('.') + 1), new File(path));

		// invoking the user-defined method that creates the QR code

	}

}