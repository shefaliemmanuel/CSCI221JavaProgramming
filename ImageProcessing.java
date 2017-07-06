import java.lang.reflect.Array;
import java.lang.Math;

public class ImageProcessing {
	// Example 1

	// create the image's negative: invert the colors
	// return pass
	public static short[][] negative(short[][] image) {
		short newImage[][] = new short[image.length][image[0].length];

		for (int i = 0; i < newImage.length; i++) {
			for (int j = 0; j < newImage[0].length; j++) {
				newImage[i][j] = (short) (255 - image[i][j]);
			}
		}
		return newImage;
	}

	// Example 2
	public static short[][] addImages(short[][] pic1, short[][] pic2) {
		short newImage[][] = new short[pic1.length][pic1[0].length];

		// first image copy
		for (int i = 0; i < pic1.length; i++) {
			for (int j = 0; j < pic1[0].length; j++) {
				newImage[i][j] = pic1[i][j];
			}
		}
		// second image copy

		for (int i = 0; i < pic2.length; i++) {
			for (int j = 0; j < pic2[0].length; j++) {
				newImage[i][j] = pic2[i][j];
			}
		}
		return newImage;
	}

	// Example 3
	// 50 down and 50 over
	public static short[][] down50over(short[][] pic1, short[][] pic2) {
		short newImage[][] = new short[pic1.length][pic1[0].length];

		// first image copy
		for (int i = 0; i < pic1.length; i++) {
			for (int j = 0; j < pic1[0].length; j++) {
				newImage[i + 50][j + 50] = pic1[i][j];
				// moving saturn on football saturn image
			}
		}
		// second image copy

		for (int i = 0; i < pic2.length; i++) {
			for (int j = 0; j < pic2[0].length; j++) {
				newImage[i][j] = pic2[i][j];
			}
		}
		return newImage;
	}

	// Example 4
	// average
	public static short[][] average(short[][] pic1, short[][] pic2) {
		short newImage[][] = new short[pic1.length][pic1[0].length];

		// first image copy
		for (int i = 0; i < pic1.length; i++) {
			for (int j = 0; j < pic1[0].length; j++) {
				newImage[i + 50][j + 50] = (short) (newImage[i + 50][j + 50] + pic2[i][j] / 2);
			}
		}
		// second image copy

		for (int i = 0; i < pic2.length; i++) {
			for (int j = 0; j < pic2[0].length; j++) {
				newImage[i][j] = pic2[i][j];
			}
		}
		return newImage;
	}

	// Example 5
	// pick the bigger one
	public static short[][] biggerOne(short[][] pic1, short[][] pic2) {
		short newImage[][] = new short[pic1.length][pic1[0].length];

		// first image copy
		for (int i = 0; i < pic1.length; i++) {
			for (int j = 0; j < pic1[0].length; j++) {
				if (newImage[i + 50][j + 50] < pic2[i][j]) {
					newImage[i + 50][j + 50] = pic2[i][j];
				}
			}
		}
		// second image copy

		for (int i = 0; i < pic2.length; i++) {
			for (int j = 0; j < pic2[0].length; j++) {
				newImage[i][j] = pic2[i][j];
			}
		}
		return newImage;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
