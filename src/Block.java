//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Block extends Thing {
	final Color color;
	Image image;

	public Block(double x, double y, int length) {
		super(x, y, length);
		this.color = Color.pink;
		super.setColor(this.color);

		try {
			this.image = ImageIO.read(new File("img/Block.png"));
		} catch (Exception var7) {
			var7.printStackTrace();
		}

		super.setImage(this.image);
	}
}
